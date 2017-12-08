/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.awt.Frame;
import javax.swing.JFrame;
import views.DetalhesRestaurante;
import views.Home;
import vo.RestauranteVO;

/**
 *
 * @author rsbramb
 */
public class HomeController {

    public void renderRestaurantDetails(Home frame, RestauranteVO restaurante) {
        JFrame newFrame = new DetalhesRestaurante(restaurante);
        newFrame.setVisible(true);
        newFrame.setLocationRelativeTo(null);
        newFrame.setResizable(false);

        System.err.println(restaurante);

        frame.dispose();
    }

    public void renderCardapio(Frame frame, RestauranteVO restaurante) {
        JFrame newFrame = new DetalhesRestaurante(restaurante);
        newFrame.setVisible(true);
        newFrame.setLocationRelativeTo(null);
        newFrame.setResizable(false);

        System.err.println(restaurante);

        frame.dispose();
    }
}
