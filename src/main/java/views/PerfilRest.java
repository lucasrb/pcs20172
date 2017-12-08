/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import controllers.FrameController;

/**
 *
 * @author bruno.franco
 */
public class PerfilRest extends javax.swing.JFrame {

    private final FrameController controller = new FrameController();
    /**
     * Creates new form Perfil
     */
    public PerfilRest() {
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

        perfilPAnel = new javax.swing.JPanel();
        title_lbl = new javax.swing.JLabel();
        btnHome = new javax.swing.JButton();
        btnPerfil = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        userArea = new javax.swing.JPanel();
        imgUser = new javax.swing.JLabel();
        nomeUsuario = new javax.swing.JLabel();
        emailUsuario = new javax.swing.JLabel();
        cpfUsuario = new javax.swing.JLabel();
        dtNascUsuario = new javax.swing.JLabel();
        sexoUsuario = new javax.swing.JLabel();
        editarPerfil = new javax.swing.JButton();
        userArea1 = new javax.swing.JPanel();
        ruaUser = new javax.swing.JLabel();
        numUser = new javax.swing.JLabel();
        cepUser = new javax.swing.JLabel();
        complementoUser = new javax.swing.JLabel();
        bairroUser = new javax.swing.JLabel();
        editarPerfil1 = new javax.swing.JButton();
        cidadeUser = new javax.swing.JLabel();
        estadoUser = new javax.swing.JLabel();
        complementoUser1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        perfilPAnel.setBackground(new java.awt.Color(255, 255, 255));

        title_lbl.setFont(new java.awt.Font("Ebrima", 1, 36)); // NOI18N
        title_lbl.setForeground(new java.awt.Color(51, 51, 255));
        title_lbl.setText("My Plate");

        btnHome.setBackground(new java.awt.Color(51, 51, 255));
        btnHome.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        btnHome.setForeground(new java.awt.Color(255, 255, 255));
        btnHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/008-home.png"))); // NOI18N
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });

        btnPerfil.setBackground(new java.awt.Color(51, 51, 255));
        btnPerfil.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        btnPerfil.setForeground(new java.awt.Color(255, 255, 255));
        btnPerfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/user.png"))); // NOI18N
        btnPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPerfilActionPerformed(evt);
            }
        });

        btnSair.setBackground(new java.awt.Color(51, 51, 255));
        btnSair.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        btnSair.setForeground(new java.awt.Color(255, 255, 255));
        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/012-sign-out-option.png"))); // NOI18N
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        userArea.setBackground(new java.awt.Color(255, 255, 255));
        userArea.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        imgUser.setText("imagemPerfil");

        nomeUsuario.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
        nomeUsuario.setText("Nome:");

        emailUsuario.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
        emailUsuario.setText("Email:");

        cpfUsuario.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
        cpfUsuario.setText("CPF:");

        dtNascUsuario.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
        dtNascUsuario.setText("Data Nascimento:");

        sexoUsuario.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
        sexoUsuario.setText("Sexo:");

        editarPerfil.setBackground(new java.awt.Color(51, 51, 255));
        editarPerfil.setFont(new java.awt.Font("Ebrima", 0, 12)); // NOI18N
        editarPerfil.setForeground(new java.awt.Color(255, 255, 255));
        editarPerfil.setText("Editar");

        javax.swing.GroupLayout userAreaLayout = new javax.swing.GroupLayout(userArea);
        userArea.setLayout(userAreaLayout);
        userAreaLayout.setHorizontalGroup(
            userAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userAreaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imgUser)
                .addGap(78, 78, 78)
                .addGroup(userAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dtNascUsuario)
                    .addComponent(cpfUsuario)
                    .addComponent(emailUsuario)
                    .addComponent(nomeUsuario)
                    .addComponent(sexoUsuario))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, userAreaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(editarPerfil)
                .addContainerGap())
        );
        userAreaLayout.setVerticalGroup(
            userAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userAreaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nomeUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(emailUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(userAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cpfUsuario)
                    .addComponent(imgUser))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(dtNascUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sexoUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(editarPerfil)
                .addContainerGap())
        );

        userArea1.setBackground(new java.awt.Color(255, 255, 255));
        userArea1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        ruaUser.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
        ruaUser.setText("Rua:");

        numUser.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
        numUser.setText("N�:");

        cepUser.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
        cepUser.setText("CEP:");

        complementoUser.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
        complementoUser.setText("Complemento:");

        bairroUser.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
        bairroUser.setText("Bairro:");

        editarPerfil1.setBackground(new java.awt.Color(51, 51, 255));
        editarPerfil1.setFont(new java.awt.Font("Ebrima", 0, 12)); // NOI18N
        editarPerfil1.setForeground(new java.awt.Color(255, 255, 255));
        editarPerfil1.setText("Editar");

        cidadeUser.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
        cidadeUser.setText("Cidade:");

        estadoUser.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
        estadoUser.setText("Estado:");

        complementoUser1.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
        complementoUser1.setText("Ponto de Referencia:");

        javax.swing.GroupLayout userArea1Layout = new javax.swing.GroupLayout(userArea1);
        userArea1.setLayout(userArea1Layout);
        userArea1Layout.setHorizontalGroup(
            userArea1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userArea1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(userArea1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(userArea1Layout.createSequentialGroup()
                        .addGroup(userArea1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cepUser)
                            .addComponent(complementoUser1)
                            .addComponent(bairroUser)
                            .addComponent(ruaUser))
                        .addGap(304, 304, 304)
                        .addGroup(userArea1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(userArea1Layout.createSequentialGroup()
                                .addGroup(userArea1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cidadeUser)
                                    .addGroup(userArea1Layout.createSequentialGroup()
                                        .addComponent(complementoUser)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(estadoUser)))
                                .addGap(158, 158, 158))
                            .addGroup(userArea1Layout.createSequentialGroup()
                                .addComponent(numUser)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, userArea1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(editarPerfil1)
                        .addGap(10, 10, 10))))
        );
        userArea1Layout.setVerticalGroup(
            userArea1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userArea1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(userArea1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ruaUser)
                    .addComponent(numUser))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(userArea1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(estadoUser)
                    .addComponent(cepUser)
                    .addComponent(complementoUser))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(userArea1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bairroUser)
                    .addComponent(cidadeUser))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(complementoUser1)
                .addGap(29, 29, 29)
                .addComponent(editarPerfil1)
                .addContainerGap())
        );

        jButton1.setBackground(new java.awt.Color(51, 51, 255));
        jButton1.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Ver hist�rico de compras");

        jButton2.setBackground(new java.awt.Color(51, 51, 255));
        jButton2.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Visualizar Favoritos");

        jLabel2.setFont(new java.awt.Font("Ebrima", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 255));
        jLabel2.setText("Restaurant");

        javax.swing.GroupLayout perfilPAnelLayout = new javax.swing.GroupLayout(perfilPAnel);
        perfilPAnel.setLayout(perfilPAnelLayout);
        perfilPAnelLayout.setHorizontalGroup(
            perfilPAnelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(perfilPAnelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(perfilPAnelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(userArea, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, perfilPAnelLayout.createSequentialGroup()
                        .addComponent(btnHome, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(perfilPAnelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, perfilPAnelLayout.createSequentialGroup()
                                .addComponent(title_lbl)
                                .addGap(231, 231, 231))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, perfilPAnelLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(265, 265, 265)))
                        .addComponent(btnPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(userArea1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(perfilPAnelLayout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        perfilPAnelLayout.setVerticalGroup(
            perfilPAnelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(perfilPAnelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(perfilPAnelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(perfilPAnelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnHome, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(perfilPAnelLayout.createSequentialGroup()
                        .addComponent(title_lbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)))
                .addGap(58, 58, 58)
                .addComponent(userArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(userArea1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(perfilPAnelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(perfilPAnel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(perfilPAnel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        controller.renderLogin(this);
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPerfilActionPerformed
        controller.renderPerfil(this);
    }//GEN-LAST:event_btnPerfilActionPerformed

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        controller.renderHome(this);
    }//GEN-LAST:event_btnHomeActionPerformed

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
            java.util.logging.Logger.getLogger(PerfilRest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PerfilRest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PerfilRest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PerfilRest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PerfilRest().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bairroUser;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnPerfil;
    private javax.swing.JButton btnSair;
    private javax.swing.JLabel cepUser;
    private javax.swing.JLabel cidadeUser;
    private javax.swing.JLabel complementoUser;
    private javax.swing.JLabel complementoUser1;
    private javax.swing.JLabel cpfUsuario;
    private javax.swing.JLabel dtNascUsuario;
    private javax.swing.JButton editarPerfil;
    private javax.swing.JButton editarPerfil1;
    private javax.swing.JLabel emailUsuario;
    private javax.swing.JLabel estadoUser;
    private javax.swing.JLabel imgUser;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel nomeUsuario;
    private javax.swing.JLabel numUser;
    private javax.swing.JPanel perfilPAnel;
    private javax.swing.JLabel ruaUser;
    private javax.swing.JLabel sexoUsuario;
    private javax.swing.JLabel title_lbl;
    private javax.swing.JPanel userArea;
    private javax.swing.JPanel userArea1;
    // End of variables declaration//GEN-END:variables
}
