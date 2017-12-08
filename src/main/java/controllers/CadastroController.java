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
import org.jdom2.*;
import org.jdom2.input.SAXBuilder;
import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;
import views.LoginCredentials;
import vo.ClienteVO;

/**
 *
 * @author bruno.franco
 */
public class CadastroController {

    private String localPath = System.getProperty("user.dir");
    /**
     * verifica se a base de dados já existe
     * @param path
     * @return true se exitir, false caso contrário 
     */
    private boolean XMLExiste(String path){
        
        File arquivo = new File(path);
        
        if(arquivo.exists()){
            return true;
        }
        
        return false;
    }
    
    private Element preencheElementoXML(ClienteVO clienteVO, Integer tipoCliente){
       
        Element cliente = new Element("cliente");
        Element nome = new Element("nome");
        Element sobrenome = new Element("sobrenome");
        Element tipo = new Element("tipo");
        Element email = new Element("email");
        Element cpf = new Element("cpf");
        Element dtNasc = new Element("dataNascimento");
        Element sexo = new Element("sexo");
        Element senha = new Element("senha");
        Element endereco = new Element("endereco");
        Element rua = new Element("rua");
        Element numero = new Element("numero");
        Element bairro = new Element("bairro");
        Element complemento = new Element("complemento");
        Element cep = new Element("cep");
        Element cidade = new Element("cidade");
        Element estado = new Element("estado");
        Element ptReferencia = new Element("ptReferencia");
        
        endereco.addContent(rua);
        endereco.addContent(numero);
        endereco.addContent(bairro);
        endereco.addContent(complemento);
        endereco.addContent(cep);
        endereco.addContent(cidade);
        endereco.addContent(estado);
        endereco.addContent(ptReferencia);

        nome.setText(clienteVO.getNome());
        sobrenome.setText(clienteVO.getSobrenome());
        tipo.setText(tipoCliente.toString());
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
        cliente.addContent(endereco);
        
        return cliente;
    }
    
    /**
     * Escreve no Documento XML os elementos de cadastro de usuario
     * @param doc 
     */
    private void escreveArquivo(Document doc){
        
        XMLOutputter xout = new XMLOutputter();
        FileWriter arquivo;
        
        try {
            arquivo = new FileWriter(new File(localPath + "/src/main/java/data/Clientes.xml"));
            xout.setFormat(Format.getPrettyFormat());
            xout.output(doc, arquivo);
        } catch (IOException ex) {
            Logger.getLogger(CadastroController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
    public void cadastrarCliente(ClienteVO clienteVO, Integer tipoCliente){
        
        if(XMLExiste(localPath + "/src/main/java/data/Clientes.xml")){
            
            File arquivoClientes = new File(localPath + "/src/main/java/data/Clientes.xml");  
            SAXBuilder builder = new SAXBuilder();
            
            Document doc;
            try {
                doc = builder.build(arquivoClientes);
                Element clientes = doc.getRootElement();
                Element cliente = preencheElementoXML(clienteVO, tipoCliente);
                clientes.addContent(cliente);
                
                escreveArquivo(doc);
                
            } catch (JDOMException ex) {
                Logger.getLogger(CadastroController.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(CadastroController.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            Element clientes = new Element("clientes");
            Element cliente = preencheElementoXML(clienteVO, tipoCliente);
            clientes.addContent(cliente);
            Document clientesXML = new Document(clientes);
            
            escreveArquivo(clientesXML);
        }
    }
    
    /**
     * Atualiza os dados do usuario, conforme o preenchido no formulario,
     * caso o campo esteja vazio, ele preenche
     * @param clienteVO 
     */
    public void editarCadatro(ClienteVO clienteVO){
        File arquivoClientes = new File(localPath + "/src/main/java/data/Clientes.xml");  
        SAXBuilder builder = new SAXBuilder();
        Document doc;

        try {
            doc = builder.build(arquivoClientes);
            Element root = doc.getRootElement();
                    
            List clientes = root.getChildren();
                    
            Iterator i = clientes.iterator();
                    
            while(i.hasNext()){
                Element cliente = (Element) i.next();
                String email = cliente.getChildText("email");

                if(email.equals(clienteVO.getEmail())){
                    cliente.getChild("nome").setText(clienteVO.getNome());
                    cliente.getChild("sobrenome").setText(clienteVO.getSobrenome());
                    cliente.getChild("email").setText(clienteVO.getEmail());
                    cliente.getChild("cpf").setText(clienteVO.getCpf());
                    cliente.getChild("dataNascimento").setText(clienteVO.getDtNasc());
                    cliente.getChild("senha").setText(clienteVO.getSenha());
                    cliente.getChild("endereco").getChild("rua").setText(clienteVO.getRua());
                    cliente.getChild("endereco").getChild("numero").setText(clienteVO.getNumero());
                    cliente.getChild("endereco").getChild("bairro").setText(clienteVO.getBairro());
                    cliente.getChild("endereco").getChild("complemento").setText(clienteVO.getComplemento());
                    cliente.getChild("endereco").getChild("cidade").setText(clienteVO.getCidade());
                    cliente.getChild("endereco").getChild("estado").setText(clienteVO.getEstado());
                    cliente.getChild("endereco").getChild("ptReferencia").setText(clienteVO.getPtReferencia());
                    cliente.getChild("endereco").getChild("cep").setText(clienteVO.getCep());
                    
                    escreveArquivo(doc);
                }
            }
        } catch (JDOMException ex) {
            Logger.getLogger(LoginCredentials.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(LoginCredentials.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
