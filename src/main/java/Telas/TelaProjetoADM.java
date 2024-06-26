/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Telas;

import DAO.ProjetoDAO;
import Model.Projeto;
import java.util.List;

/**
 *
 * @author eu
 */
public class TelaProjetoADM extends javax.swing.JFrame {

    /**
     * Creates new form TelaProjeto
     */
    public TelaProjetoADM() {
        initComponents();
        carregarProjetosEmAlta();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        GerenciarUsuarioButton = new javax.swing.JButton();
        GerenciarProjetosButton = new javax.swing.JButton();
        ProcurarProjetoButton = new javax.swing.JButton();
        SairButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        DetalhesDoProjetoButtonW = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TextAreaW = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        TextAreaX = new javax.swing.JTextArea();
        TextProjetoW = new javax.swing.JTextField();
        TextProjetoX = new javax.swing.JTextField();
        TextProjetoZ = new javax.swing.JTextField();
        jScrollPane5 = new javax.swing.JScrollPane();
        TextAreaZ = new javax.swing.JTextArea();

        setTitle("ECO Track - Projetos");
        setResizable(false);

        jPanel1.setPreferredSize(new java.awt.Dimension(800, 600));

        jPanel2.setBackground(new java.awt.Color(169, 172, 200));

        GerenciarUsuarioButton.setFont(new java.awt.Font("Gliker", 0, 12)); // NOI18N
        GerenciarUsuarioButton.setForeground(new java.awt.Color(0, 0, 0));
        GerenciarUsuarioButton.setText("Gerenciar Usuario");
        GerenciarUsuarioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GerenciarUsuarioButtonActionPerformed(evt);
            }
        });

        GerenciarProjetosButton.setFont(new java.awt.Font("Gliker", 0, 12)); // NOI18N
        GerenciarProjetosButton.setForeground(new java.awt.Color(0, 0, 0));
        GerenciarProjetosButton.setText("Gerenciar Projetos");
        GerenciarProjetosButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GerenciarProjetosButtonActionPerformed(evt);
            }
        });

        ProcurarProjetoButton.setFont(new java.awt.Font("Gliker", 0, 12)); // NOI18N
        ProcurarProjetoButton.setForeground(new java.awt.Color(0, 0, 0));
        ProcurarProjetoButton.setText("Procurar Projeto");
        ProcurarProjetoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProcurarProjetoButtonActionPerformed(evt);
            }
        });

        SairButton.setFont(new java.awt.Font("Gliker", 0, 12)); // NOI18N
        SairButton.setForeground(new java.awt.Color(0, 0, 0));
        SairButton.setText("Sair");
        SairButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SairButtonActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/UsuarioPNG (1).png"))); // NOI18N

        DetalhesDoProjetoButtonW.setFont(new java.awt.Font("Gliker", 0, 12)); // NOI18N
        DetalhesDoProjetoButtonW.setForeground(new java.awt.Color(0, 0, 0));
        DetalhesDoProjetoButtonW.setText("Detalhes do Projetos");
        DetalhesDoProjetoButtonW.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DetalhesDoProjetoButtonWActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(DetalhesDoProjetoButtonW, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                    .addComponent(GerenciarProjetosButton, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ProcurarProjetoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(SairButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(GerenciarUsuarioButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(18, 18, 18)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(10, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(GerenciarUsuarioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ProcurarProjetoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(GerenciarProjetosButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DetalhesDoProjetoButtonW, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                .addComponent(SairButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        jPanel3.setPreferredSize(new java.awt.Dimension(590, 840));

        TextAreaW.setEditable(false);
        TextAreaW.setColumns(20);
        TextAreaW.setLineWrap(true);
        TextAreaW.setRows(5);
        jScrollPane2.setViewportView(TextAreaW);

        TextAreaX.setEditable(false);
        TextAreaX.setColumns(20);
        TextAreaX.setLineWrap(true);
        TextAreaX.setRows(5);
        jScrollPane3.setViewportView(TextAreaX);

        TextProjetoW.setEditable(false);
        TextProjetoW.setFont(new java.awt.Font("Gliker", 0, 12)); // NOI18N
        TextProjetoW.setForeground(new java.awt.Color(0, 0, 0));
        TextProjetoW.setText("Projeto W");
        TextProjetoW.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextProjetoWActionPerformed(evt);
            }
        });

        TextProjetoX.setEditable(false);
        TextProjetoX.setFont(new java.awt.Font("Gliker", 0, 12)); // NOI18N
        TextProjetoX.setForeground(new java.awt.Color(0, 0, 0));
        TextProjetoX.setText("Projeto X");
        TextProjetoX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextProjetoXActionPerformed(evt);
            }
        });

        TextProjetoZ.setEditable(false);
        TextProjetoZ.setFont(new java.awt.Font("Gliker", 0, 12)); // NOI18N
        TextProjetoZ.setForeground(new java.awt.Color(0, 0, 0));
        TextProjetoZ.setText("Projeto Z");
        TextProjetoZ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextProjetoZActionPerformed(evt);
            }
        });

        TextAreaZ.setEditable(false);
        TextAreaZ.setColumns(20);
        TextAreaZ.setLineWrap(true);
        TextAreaZ.setRows(5);
        jScrollPane5.setViewportView(TextAreaZ);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 584, Short.MAX_VALUE)
                    .addComponent(TextProjetoW)
                    .addComponent(jScrollPane5)
                    .addComponent(TextProjetoZ)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TextProjetoX))
                .addContainerGap(9, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TextProjetoW, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80)
                .addComponent(TextProjetoX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addComponent(TextProjetoZ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(71, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel3);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 611, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 603, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void SairButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SairButtonActionPerformed
        this.dispose();
        TelaLogin telaLogin = new TelaLogin();
        telaLogin.setVisible(true);

    }//GEN-LAST:event_SairButtonActionPerformed
    private void carregarProjetosEmAlta() {
        ProjetoDAO projetoDAO = new ProjetoDAO();
        List<Projeto> projetosEmAlta = projetoDAO.consultarProjetosEmAlta();

        // Verifica se existem projetos em alta para exibir
        if (!projetosEmAlta.isEmpty()) {
            // Exibe os detalhes dos projetos nos campos de texto e áreas de texto
            for (int i = 0; i < projetosEmAlta.size(); i++) {
                Projeto projeto = projetosEmAlta.get(i);
                switch (i) {
                    case 0:
                        TextProjetoW.setText(projeto.getNome());
                        TextAreaW.setText(projeto.getDescricao());
                        break;
                    case 1:
                        TextProjetoX.setText(projeto.getNome());
                        TextAreaX.setText(projeto.getDescricao());
                        break;
                    case 2:
                        TextProjetoZ.setText(projeto.getNome());
                        TextAreaZ.setText(projeto.getDescricao());
                        break;
                    default:
                        break;
                }
            }
        }
    }

    private void GerenciarUsuarioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GerenciarUsuarioButtonActionPerformed
        // TODO add your handling code here:
        TelaGerenciaUsuario telaGerenciarUsuario = new TelaGerenciaUsuario();
        this.dispose();
        telaGerenciarUsuario.setVisible(true);
    }//GEN-LAST:event_GerenciarUsuarioButtonActionPerformed

    private void ProcurarProjetoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProcurarProjetoButtonActionPerformed
        // TODO add your handling code here:
        new TelaPesquisarProjeto().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ProcurarProjetoButtonActionPerformed

    private void GerenciarProjetosButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GerenciarProjetosButtonActionPerformed
        // TODO add your handling code here:
        new TelaGerenciarProjeto().setVisible(true);
        this.dispose();

    }//GEN-LAST:event_GerenciarProjetosButtonActionPerformed

    private void TextProjetoXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextProjetoXActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextProjetoXActionPerformed

    private void TextProjetoWActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextProjetoWActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextProjetoWActionPerformed

    private void TextProjetoZActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextProjetoZActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextProjetoZActionPerformed

    private void DetalhesDoProjetoButtonWActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DetalhesDoProjetoButtonWActionPerformed
        // TODO add your handling code here:
        new TelaDetalheProjeto().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_DetalhesDoProjetoButtonWActionPerformed

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
            java.util.logging.Logger.getLogger(TelaProjetoADM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaProjetoADM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaProjetoADM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaProjetoADM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaProjetoADM().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DetalhesDoProjetoButtonW;
    private javax.swing.JButton GerenciarProjetosButton;
    private javax.swing.JButton GerenciarUsuarioButton;
    private javax.swing.JButton ProcurarProjetoButton;
    private javax.swing.JButton SairButton;
    private javax.swing.JTextArea TextAreaW;
    private javax.swing.JTextArea TextAreaX;
    private javax.swing.JTextArea TextAreaZ;
    private javax.swing.JTextField TextProjetoW;
    private javax.swing.JTextField TextProjetoX;
    private javax.swing.JTextField TextProjetoZ;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    // End of variables declaration//GEN-END:variables
}
