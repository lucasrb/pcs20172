/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import controllers.FrameController;
import java.util.Arrays;
import java.util.Calendar;
import vo.ClienteVO;

/**
 *
 * @author bruno.franco
 */
public class Cadastro extends javax.swing.JFrame {
    
    private final FrameController controller = new FrameController();
    /**
     * Creates new form Cadastro
     */
    public Cadastro() {
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

        buttonGroupSexo = new javax.swing.ButtonGroup();
        panelCadastro = new javax.swing.JPanel();
        title_lbl = new javax.swing.JLabel();
        labelNome = new javax.swing.JLabel();
        labelSobre = new javax.swing.JLabel();
        nome_txt = new javax.swing.JTextField();
        sobrenome_txt = new javax.swing.JTextField();
        labelEmail = new javax.swing.JLabel();
        email_txt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        cpf_txt = new javax.swing.JTextField();
        labelDtNasc = new javax.swing.JLabel();
        diaNasc_txt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        mesNasc_txt = new javax.swing.JTextField();
        anoNasc_txt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        labelDtNasc1 = new javax.swing.JLabel();
        radioSexoMasc = new javax.swing.JRadioButton();
        radioSexoFem = new javax.swing.JRadioButton();
        labelSenha = new javax.swing.JLabel();
        senha = new javax.swing.JPasswordField();
        labelConformarSenha = new javax.swing.JLabel();
        confSenha = new javax.swing.JPasswordField();
        cadastro_btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelCadastro.setBackground(new java.awt.Color(255, 255, 255));

        title_lbl.setFont(new java.awt.Font("Ebrima", 1, 36)); // NOI18N
        title_lbl.setText("My Plate");

        labelNome.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
        labelNome.setText("Nome:");

        labelSobre.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
        labelSobre.setText("Sobrenome:");

        nome_txt.setFont(new java.awt.Font("Ebrima", 0, 12)); // NOI18N

        sobrenome_txt.setFont(new java.awt.Font("Ebrima", 0, 12)); // NOI18N

        labelEmail.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
        labelEmail.setText("Email:");

        email_txt.setFont(new java.awt.Font("Ebrima", 0, 12)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
        jLabel1.setText("CPF/CNPJ:");

        labelDtNasc.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
        labelDtNasc.setText("Data de Nascimento:");

        diaNasc_txt.setFont(new java.awt.Font("Ebrima", 0, 12)); // NOI18N

        jLabel2.setText("/");

        mesNasc_txt.setFont(new java.awt.Font("Ebrima", 0, 12)); // NOI18N

        anoNasc_txt.setFont(new java.awt.Font("Ebrima", 0, 12)); // NOI18N

        jLabel3.setText("/");

        labelDtNasc1.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
        labelDtNasc1.setText("Sexo:");

        buttonGroupSexo.add(radioSexoMasc);
        radioSexoMasc.setFont(new java.awt.Font("Ebrima", 0, 12)); // NOI18N
        radioSexoMasc.setText("Masculino");

        buttonGroupSexo.add(radioSexoFem);
        radioSexoFem.setFont(new java.awt.Font("Ebrima", 0, 12)); // NOI18N
        radioSexoFem.setText("Feminino");

        labelSenha.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
        labelSenha.setText("Senha:");

        senha.setFont(new java.awt.Font("Ebrima", 0, 12)); // NOI18N

        labelConformarSenha.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
        labelConformarSenha.setText("Confrmar Senha:");

        confSenha.setFont(new java.awt.Font("Ebrima", 0, 12)); // NOI18N

        cadastro_btn.setBackground(new java.awt.Color(255, 0, 51));
        cadastro_btn.setFont(new java.awt.Font("Ebrima", 0, 18)); // NOI18N
        cadastro_btn.setForeground(new java.awt.Color(255, 255, 255));
        cadastro_btn.setText("Cadastrar");
        cadastro_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastro_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelCadastroLayout = new javax.swing.GroupLayout(panelCadastro);
        panelCadastro.setLayout(panelCadastroLayout);
        panelCadastroLayout.setHorizontalGroup(
            panelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCadastroLayout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(panelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCadastroLayout.createSequentialGroup()
                        .addGroup(panelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelCadastroLayout.createSequentialGroup()
                                .addComponent(labelNome)
                                .addGap(285, 285, 285)
                                .addComponent(labelSobre)
                                .addGap(0, 4, Short.MAX_VALUE))
                            .addComponent(title_lbl))
                        .addGap(324, 324, 324))
                    .addGroup(panelCadastroLayout.createSequentialGroup()
                        .addGroup(panelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(senha, javax.swing.GroupLayout.DEFAULT_SIZE, 304, Short.MAX_VALUE)
                                .addComponent(nome_txt)
                                .addComponent(email_txt)
                                .addComponent(labelEmail, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(labelDtNasc, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelCadastroLayout.createSequentialGroup()
                                    .addComponent(diaNasc_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(mesNasc_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(anoNasc_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(labelSenha))
                        .addGap(18, 18, 18)
                        .addGroup(panelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelCadastroLayout.createSequentialGroup()
                                .addGroup(panelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelConformarSenha)
                                    .addComponent(labelDtNasc1)
                                    .addComponent(jLabel1)
                                    .addGroup(panelCadastroLayout.createSequentialGroup()
                                        .addComponent(radioSexoMasc)
                                        .addGap(18, 18, 18)
                                        .addComponent(radioSexoFem)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(panelCadastroLayout.createSequentialGroup()
                                .addGroup(panelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(confSenha, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 328, Short.MAX_VALUE)
                                    .addComponent(cpf_txt)
                                    .addComponent(sobrenome_txt))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
            .addGroup(panelCadastroLayout.createSequentialGroup()
                .addGap(239, 239, 239)
                .addComponent(cadastro_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panelCadastroLayout.setVerticalGroup(
            panelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCadastroLayout.createSequentialGroup()
                .addComponent(title_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelSobre)
                    .addComponent(labelNome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(sobrenome_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nome_txt))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelEmail)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cpf_txt)
                    .addComponent(email_txt))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelDtNasc)
                    .addComponent(labelDtNasc1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(diaNasc_txt)
                    .addComponent(jLabel2)
                    .addComponent(anoNasc_txt)
                    .addComponent(mesNasc_txt)
                    .addComponent(jLabel3)
                    .addComponent(radioSexoMasc)
                    .addComponent(radioSexoFem))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelSenha)
                    .addComponent(labelConformarSenha))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(senha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(confSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(69, 69, 69)
                .addComponent(cadastro_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(103, 103, 103))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCadastro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCadastro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cadastro_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastro_btnActionPerformed
        ClienteVO cliente = new ClienteVO();
        
        cliente.setNome(nome_txt.getText());
        cliente.setSobrenome(sobrenome_txt.getText());
        cliente.setEmail(email_txt.getText());
        cliente.setDtNasc(diaNasc_txt.getText() + "/" + mesNasc_txt.getText() + "/" + anoNasc_txt.getText());
        cliente.setSenha(Arrays.toString((senha.getPassword())));
        
        System.out.println("Nome: " + cliente.getNome() + " " + cliente.getSobrenome());
        System.out.println("Email: " + cliente.getEmail());
        System.out.println("DtNasc: " + cliente.getDtNasc());
        System.out.println("Senha: " + cliente.getSenha());
    }//GEN-LAST:event_cadastro_btnActionPerformed

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
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField anoNasc_txt;
    private javax.swing.ButtonGroup buttonGroupSexo;
    private javax.swing.JButton cadastro_btn;
    private javax.swing.JPasswordField confSenha;
    private javax.swing.JTextField cpf_txt;
    private javax.swing.JTextField diaNasc_txt;
    private javax.swing.JTextField email_txt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel labelConformarSenha;
    private javax.swing.JLabel labelDtNasc;
    private javax.swing.JLabel labelDtNasc1;
    private javax.swing.JLabel labelEmail;
    private javax.swing.JLabel labelNome;
    private javax.swing.JLabel labelSenha;
    private javax.swing.JLabel labelSobre;
    private javax.swing.JTextField mesNasc_txt;
    private javax.swing.JTextField nome_txt;
    private javax.swing.JPanel panelCadastro;
    private javax.swing.JRadioButton radioSexoFem;
    private javax.swing.JRadioButton radioSexoMasc;
    private javax.swing.JPasswordField senha;
    private javax.swing.JTextField sobrenome_txt;
    private javax.swing.JLabel title_lbl;
    // End of variables declaration//GEN-END:variables
}
