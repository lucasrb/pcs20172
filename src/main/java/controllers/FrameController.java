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
        JFrame newFrame = new LoginCredentials();
        newFrame.setVisible(true);
        newFrame.setLocationRelativeTo(null);
        newFrame.setResizable(false);

        frame.dispose();
    }

    public void renderHome(JFrame frame) {
        JFrame newFrame = new Home();
        newFrame.setVisible(true);
        newFrame.setLocationRelativeTo(null);
        newFrame.setResizable(false);

        frame.dispose();
    }

    public void renderHomeRest(JFrame frame) {
        JFrame newFrame = new HomeRest();
        newFrame.setVisible(true);
        newFrame.setLocationRelativeTo(null);
        newFrame.setResizable(false);

        frame.dispose();
    }

    public void renderCadastro(JFrame frame) {
        JFrame newFrame = new Cadastro();
        newFrame.setVisible(true);
        newFrame.setLocationRelativeTo(null);
        newFrame.setResizable(false);

        frame.dispose();
    }

    public void renderEsqueciSenha(JFrame frame) {
        JFrame newFrame = new EsqueciSenha();
        newFrame.setVisible(true);
        newFrame.setLocationRelativeTo(null);
        newFrame.setResizable(false);

        frame.dispose();
    }

    public void renderEsqueciSenhaRest(JFrame frame) {
        JFrame newFrame = new EsqueciSenhaRest();
        newFrame.setVisible(true);
        newFrame.setLocationRelativeTo(null);
        newFrame.setResizable(false);

        frame.dispose();
    }

    public void renderLoginRest(JFrame frame) {
        JFrame newFrame = new LoginRest();
        newFrame.setVisible(true);
        newFrame.setLocationRelativeTo(null);
        newFrame.setResizable(false);

        frame.dispose();
    }

    public void renderLogin(JFrame frame) {
        JFrame newFrame = new Login();
        newFrame.setVisible(true);
        newFrame.setLocationRelativeTo(null);
        newFrame.setResizable(false);

        frame.dispose();
    }

    public void renderCredentialsRest(JFrame frame) {
        JFrame newFrame = new LoginCredentialsRest();
        newFrame.setVisible(true);
        newFrame.setLocationRelativeTo(null);
        newFrame.setResizable(false);

        frame.dispose();
    }

    public void renderCadastroRest(JFrame frame) {
        JFrame newFrame = new CadastroRest();
        newFrame.setVisible(true);
        newFrame.setLocationRelativeTo(null);
        newFrame.setResizable(false);

        frame.dispose();
    }

    public void renderPerfil(JFrame frame) {
        JFrame newFrame = new Perfil();
        newFrame.setVisible(true);
        newFrame.setLocationRelativeTo(null);
        newFrame.setResizable(false);

        frame.dispose();
    }

    public void renderCarrinho(JFrame frame) {

        frame.dispose();
    }
    
    public void renderEditarPerfil(JFrame frame) {
        EditarPerfil editarPerfil = new EditarPerfil();
        editarPerfil.setVisible(true);
        
        frame.dispose();
    }
    
    public void renderVisualizarHistórico(JFrame frame) {
        HistoricoPedido hist = new HistoricoPedido();
        hist.setVisible(true);
        
        frame.dispose();
    }
}
