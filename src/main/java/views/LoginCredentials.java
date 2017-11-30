/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import controllers.FrameController;
import controllers.LoginController;
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
import vo.ClienteVO;

/**
 *
 * @author rsbramb
 */
public class LoginCredentials extends javax.swing.JFrame {

    private FrameController controller = new FrameController();
    private LoginController loginController = new LoginController();

    /**
     * Creates new form LoginCredentials
     */
    public LoginCredentials() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        login_credentials_pnl = new javax.swing.JPanel();
        panelLoginCredencial = new javax.swing.JPanel();
        title_lbl = new javax.swing.JLabel();
        email_lbl = new javax.swing.JLabel();
        email_txt = new javax.swing.JTextField();
        password_lbl = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        retrieve_lbl = new javax.swing.JLabel();
        retrieve_lbl1 = new javax.swing.JLabel();
        enter_btn = new javax.swing.JButton();
        erroLogin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(800, 600));

        login_credentials_pnl.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
        login_credentials_pnl.setPreferredSize(new java.awt.Dimension(800, 600));

        panelLoginCredencial.setBackground(new java.awt.Color(255, 255, 255));

        title_lbl.setFont(new java.awt.Font("Ebrima", 1, 36)); // NOI18N
        title_lbl.setText("My Plate");

        email_lbl.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
        email_lbl.setText("Email:");

        email_txt.setFont(new java.awt.Font("Ebrima", 0, 12)); // NOI18N
        email_txt.setName("email_txtfield"); // NOI18N

        password_lbl.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
        password_lbl.setText("Password:");
        password_lbl.setFocusable(false);
        password_lbl.setName("password"); // NOI18N

        jPasswordField1.setFont(new java.awt.Font("Ebrima", 0, 12)); // NOI18N

        retrieve_lbl.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
        retrieve_lbl.setText("Esqueceu sua senha?");
        retrieve_lbl.setFocusable(false);
        retrieve_lbl.setName("password"); // NOI18N

        retrieve_lbl1.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
        retrieve_lbl1.setForeground(new java.awt.Color(0, 153, 255));
        retrieve_lbl1.setText("Clique Aqui");
        retrieve_lbl1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        retrieve_lbl1.setFocusable(false);
        retrieve_lbl1.setName("password"); // NOI18N
        retrieve_lbl1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                redirectEsqueciSenha(evt);
            }
        });

        enter_btn.setBackground(new java.awt.Color(255, 0, 51));
        enter_btn.setFont(new java.awt.Font("Ebrima", 0, 18)); // NOI18N
        enter_btn.setForeground(new java.awt.Color(255, 255, 255));
        enter_btn.setText("Entrar");
        enter_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enter_btnActionPerformed(evt);
            }
        });

        erroLogin.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        erroLogin.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout panelLoginCredencialLayout = new javax.swing.GroupLayout(panelLoginCredencial);
        panelLoginCredencial.setLayout(panelLoginCredencialLayout);
        panelLoginCredencialLayout.setHorizontalGroup(
            panelLoginCredencialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLoginCredencialLayout.createSequentialGroup()
                .addGroup(panelLoginCredencialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLoginCredencialLayout.createSequentialGroup()
                        .addGap(262, 262, 262)
                        .addComponent(enter_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelLoginCredencialLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(panelLoginCredencialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(erroLogin)
                            .addGroup(panelLoginCredencialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(email_lbl)
                                .addComponent(password_lbl)
                                .addComponent(jPasswordField1, javax.swing.GroupLayout.DEFAULT_SIZE, 675, Short.MAX_VALUE)
                                .addComponent(email_txt))
                            .addGroup(panelLoginCredencialLayout.createSequentialGroup()
                                .addComponent(retrieve_lbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(retrieve_lbl1))))
                    .addGroup(panelLoginCredencialLayout.createSequentialGroup()
                        .addGap(282, 282, 282)
                        .addComponent(title_lbl)))
                .addContainerGap(78, Short.MAX_VALUE))
        );
        panelLoginCredencialLayout.setVerticalGroup(
            panelLoginCredencialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLoginCredencialLayout.createSequentialGroup()
                .addComponent(title_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(erroLogin)
                .addGap(60, 60, 60)
                .addComponent(email_lbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(email_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(password_lbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLoginCredencialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(retrieve_lbl)
                    .addComponent(retrieve_lbl1))
                .addGap(52, 52, 52)
                .addComponent(enter_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(162, Short.MAX_VALUE))
        );

        email_lbl.getAccessibleContext().setAccessibleName("Email");

        javax.swing.GroupLayout login_credentials_pnlLayout = new javax.swing.GroupLayout(login_credentials_pnl);
        login_credentials_pnl.setLayout(login_credentials_pnlLayout);
        login_credentials_pnlLayout.setHorizontalGroup(
            login_credentials_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelLoginCredencial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        login_credentials_pnlLayout.setVerticalGroup(
            login_credentials_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelLoginCredencial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(login_credentials_pnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(login_credentials_pnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void enter_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enter_btnActionPerformed
        
        ClienteVO cliente = new ClienteVO();
        
        cliente.setEmail(email_txt.getText());
        char[] snh = jPasswordField1.getPassword();
        String strSenha = new String(snh);
        cliente.setSenha(strSenha);
        
        if(loginController.confirmaLogin(cliente, "1")){
            controller.renderHome(this);
        }
    }//GEN-LAST:event_enter_btnActionPerformed

    private void redirectEsqueciSenha(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_redirectEsqueciSenha
         controller.renderEsqueciSenha(this);
    }//GEN-LAST:event_redirectEsqueciSenha

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LoginCredentials.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginCredentials.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginCredentials.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginCredentials.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginCredentials().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel email_lbl;
    private javax.swing.JTextField email_txt;
    private javax.swing.JButton enter_btn;
    private javax.swing.JLabel erroLogin;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPanel login_credentials_pnl;
    private javax.swing.JPanel panelLoginCredencial;
    private javax.swing.JLabel password_lbl;
    private javax.swing.JLabel retrieve_lbl;
    private javax.swing.JLabel retrieve_lbl1;
    private javax.swing.JLabel title_lbl;
    // End of variables declaration//GEN-END:variables
}
