/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jdom2.*;
import org.jdom2.input.SAXBuilder;
import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;
import vo.ClienteVO;

/**
 *
 * @author bruno.franco
 */
public class CadastroController {

    private String localPath = System.getProperty("user.dir");
    
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
        
        return cliente;
    }
    
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
                Element clientes = (Element) doc.getRootElement();
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
}
