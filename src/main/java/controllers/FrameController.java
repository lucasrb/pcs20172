/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import javax.swing.JFrame;
import views.*;

/**
 *
 * @author rsbramb
 */
public class FrameController {

    public void renderCredentials(JFrame frame) {
        LoginCredentials loginCredentials = new LoginCredentials();
        loginCredentials.setVisible(true);

        frame.dispose();
    }

    public void renderHome(JFrame frame) {
        Home home = new Home();
        home.setVisible(true);

        frame.dispose();
    }
    
    public void renderCadastro(JFrame frame) {
        Cadastro cadastro = new Cadastro();
        cadastro.setVisible(true);
        
        frame.dispose();
    }
    
    public void renderEsqueciSenha(JFrame frame){
        EsqueciSenha esqueciSenha = new EsqueciSenha();
        esqueciSenha.setVisible(true);
        
        frame.dispose();
    }
    
    public void renderLoginRest(JFrame frame){
        LoginRest login = new LoginRest();
        login.setVisible(true);
        
        frame.dispose();
    }
    
     public void renderLogin(JFrame frame){
        Login login = new Login();
        login.setVisible(true);
        
        frame.dispose();
     }
     
     public void renderCredentialsRest(JFrame frame) {
        LoginCredentialsRest loginCredentials = new LoginCredentialsRest();
        loginCredentials.setVisible(true);

        frame.dispose();
    }
     
    public void renderCadastroRest(JFrame frame) {
        CadastroRest cadastro = new CadastroRest();
        cadastro.setVisible(true);
        
        frame.dispose();
    }
}
