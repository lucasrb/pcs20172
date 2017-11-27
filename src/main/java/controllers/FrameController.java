/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import javax.swing.JFrame;
import views.Home;
import views.LoginCredentials;

/**
 *
 * @author rsbramb
 */
public class FrameController {

    public void renderCredentials(JFrame frame) {
        LoginCredentials loginCredentials = new LoginCredentials();
        loginCredentials.setVisible(true);

        frame.setVisible(false);
    }

    public void renderHome(JFrame frame) {
        Home home = new Home();
        home.setVisible(true);

        frame.setVisible(false);
    }
}
