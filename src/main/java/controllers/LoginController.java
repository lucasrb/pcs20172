/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;
import views.LoginCredentials;
import vo.ClienteVO;

/**
 *
 * @author bruno.franco
 */
public class LoginController {
    
    public boolean confirmaLogin(ClienteVO clienteVO, String tipo){
        if(clienteVO.getEmail().length() != 0 || clienteVO.getEmail() != null){
            if(clienteVO.getSenha() != null || clienteVO.getSenha().length() != 0){
                
                File arquivoClientes = new File("C:/Users/bruno.franco/Documents/NetBeansProjects/pcs20172/pcs20172/src/main/java/data/Clientes.xml");  
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
                            String senha = cliente.getChildText("Senha");
                            if(senha.equals(clienteVO.getSenha())){
                                String tipoCliente = cliente.getChildText("tipo");
                                if(tipoCliente.equals(tipo)){
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
}