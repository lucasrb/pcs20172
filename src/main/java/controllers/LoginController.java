/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;
import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;
import views.LoginCredentials;
import vo.ClienteVO;

/**
 *
 * @author bruno.franco
 */
public class LoginController {
    
    private String localPath = System.getProperty("user.dir");
    
    public boolean confirmaLogin(ClienteVO clienteVO, String tipo){
        if(clienteVO.getEmail().length() != 0 || clienteVO.getEmail() != null){
            if(clienteVO.getSenha() != null || clienteVO.getSenha().length() != 0){
                
                File arquivoClientes = new File(localPath + "/src/main/java/data/Clientes.xml");  
                SAXBuilder builder = new SAXBuilder();
            
                Document doc;
                
                try {
                    doc = builder.build(arquivoClientes);
                    Element root = (Element) doc.getRootElement();
                    
                    List clientes = root.getChildren();
                    
                    Iterator i = clientes.iterator();
                    
                    while(i.hasNext()){
                        Element cliente = (Element) i.next();
                        String email = cliente.getChildText("email");
                        
                        if(email.equals(clienteVO.getEmail())){
                            String senha = cliente.getChildText("senha");
                            if(senha.equals(clienteVO.getSenha())){
                                String tipoCliente = cliente.getChildText("tipo");
                                if(tipoCliente.equals(tipo)){
                                    
                                    clienteVO.setNome(cliente.getChildText("nome"));
                                    clienteVO.setSobrenome(cliente.getChildText("sobrenome"));
                                    clienteVO.setCpf(cliente.getChildText("cpf"));
                                    clienteVO.setDtNasc(cliente.getChildText("dataNascimento"));
                                    clienteVO.setTipo(tipo);
                                    clienteVO.setSexo(cliente.getChildText("sexo"));
                                    
                                    salvaDadosUsuario(clienteVO);

                                    return true;
                                }
                            }
                        }
                    }
                } catch (JDOMException ex) {
                    Logger.getLogger(LoginCredentials.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(LoginCredentials.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    
        return false;
    }
    
        private void salvaDadosUsuario(ClienteVO clienteVO){
        
        Element cliente = new Element("cliente");
        Element nome = new Element("nome");
        Element sobrenome = new Element("sobrenome");
        Element tipo = new Element("tipo");
        Element email = new Element("email");
        Element cpf = new Element("cpf");
        Element dtNasc = new Element("dataNascimento");
        Element sexo = new Element("Sexo");
        Element senha = new Element("Senha");

        nome.setText(clienteVO.getNome());
        sobrenome.setText(clienteVO.getSobrenome());
        tipo.setText(clienteVO.getTipo());
        email.setText(clienteVO.getEmail());
        cpf.setText(clienteVO.getCpf());
        dtNasc.setText(clienteVO.getDtNasc());
        sexo.setText(clienteVO.getSexo());
        senha.setText(clienteVO.getSenha());
        
        cliente.addContent(nome);
        cliente.addContent(sobrenome);
        cliente.addContent(tipo);
        cliente.addContent(email);
        cliente.addContent(cpf);
        cliente.addContent(dtNasc);
        cliente.addContent(sexo);
        cliente.addContent(senha);
            
        Document clientesXML = new Document(cliente);
            
        XMLOutputter xout = new XMLOutputter();
        FileWriter arquivo;
        
        try {
            arquivo = new FileWriter(new File(localPath + "/src/main/java/data/DadosLogin.xml"));
            xout.setFormat(Format.getPrettyFormat());
            xout.output(clientesXML, arquivo);
        } catch (IOException ex) {
            Logger.getLogger(CadastroController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}