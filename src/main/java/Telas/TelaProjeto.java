/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Telas;

/**
 *
 * @author eu
 */
public class TelaProjeto extends javax.swing.JFrame {

    /**
     * Creates new form TelaProjeto
     */
    public TelaProjeto() {
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        ImgUsuario = new javax.swing.JLabel();
        GerenciarUsuariosButton = new javax.swing.JButton();
        GerenciarProjetosButton = new javax.swing.JButton();
        ProcurarProjetoButton = new javax.swing.JButton();
        SairButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel3 = new javax.swing.JPanel();
        CurtirButtonW = new javax.swing.JButton();
        DetalhesDoProjetoButtonW = new javax.swing.JButton();
        DetalhesDoProjetoX = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        TextAreaW = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        TextAreaX = new javax.swing.JTextArea();
        TextProjetoW = new javax.swing.JTextField();
        TextProjetoX = new javax.swing.JTextField();
        CurtirButtonX = new javax.swing.JButton();
        TextProjetoZ = new javax.swing.JTextField();
        DetalhesDoProjetoButtonZ = new javax.swing.JButton();
        CurtirButtonZ = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        TextAreaZ = new javax.swing.JTextArea();

        setTitle("ECO Track - Projetos");
        setResizable(false);

        jPanel1.setPreferredSize(new java.awt.Dimension(800, 600));

        ImgUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder("Usuario"));

        GerenciarUsuariosButton.setText("Gerenciar Usuários");
        GerenciarUsuariosButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GerenciarUsuariosButtonActionPerformed(evt);
            }
        });

        GerenciarProjetosButton.setText("Gerenciar Projetos");
        GerenciarProjetosButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GerenciarProjetosButtonActionPerformed(evt);
            }
        });

        ProcurarProjetoButton.setText("Procurar Projeto");
        ProcurarProjetoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProcurarProjetoButtonActionPerformed(evt);
            }
        });

        SairButton.setText("Sair");
        SairButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SairButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                        .addComponent(GerenciarUsuariosButton)
                        .addComponent(GerenciarProjetosButton, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ProcurarProjetoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(ImgUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SairButton, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(10, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ImgUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69)
                .addComponent(GerenciarUsuariosButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ProcurarProjetoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(GerenciarProjetosButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 133, Short.MAX_VALUE)
                .addComponent(SairButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        jPanel3.setPreferredSize(new java.awt.Dimension(590, 840));

        CurtirButtonW.setText("Curtir");
        CurtirButtonW.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CurtirButtonWActionPerformed(evt);
            }
        });

        DetalhesDoProjetoButtonW.setText("Detalhes do Projetos");
        DetalhesDoProjetoButtonW.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DetalhesDoProjetoButtonWActionPerformed(evt);
            }
        });

        DetalhesDoProjetoX.setText("Detalhes do Projeto");
        DetalhesDoProjetoX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DetalhesDoProjetoXActionPerformed(evt);
            }
        });

        TextAreaW.setColumns(20);
        TextAreaW.setRows(5);
        jScrollPane2.setViewportView(TextAreaW);

        TextAreaX.setColumns(20);
        TextAreaX.setRows(5);
        jScrollPane3.setViewportView(TextAreaX);

        TextProjetoW.setText("Projeto W");
        TextProjetoW.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextProjetoWActionPerformed(evt);
            }
        });

        TextProjetoX.setText("Projeto X");
        TextProjetoX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextProjetoXActionPerformed(evt);
            }
        });

        CurtirButtonX.setText("Curtir");
        CurtirButtonX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CurtirButtonXActionPerformed(evt);
            }
        });

        TextProjetoZ.setText("Projeto Z");
        TextProjetoZ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextProjetoZActionPerformed(evt);
            }
        });

        DetalhesDoProjetoButtonZ.setText("Detalhes do Projeto");
        DetalhesDoProjetoButtonZ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DetalhesDoProjetoButtonZActionPerformed(evt);
            }
        });

        CurtirButtonZ.setText("Curtir");
        CurtirButtonZ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CurtirButtonZActionPerformed(evt);
            }
        });

        TextAreaZ.setColumns(20);
        TextAreaZ.setRows(5);
        jScrollPane5.setViewportView(TextAreaZ);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(CurtirButtonX, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DetalhesDoProjetoX, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane3)
                    .addComponent(TextProjetoX)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(CurtirButtonW, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DetalhesDoProjetoButtonW, javax.swing.GroupLayout.DEFAULT_SIZE, 423, Short.MAX_VALUE))
                    .addComponent(TextProjetoW)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(CurtirButtonZ, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DetalhesDoProjetoButtonZ, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane5)
                    .addComponent(TextProjetoZ)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jScrollPane2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TextProjetoW, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CurtirButtonW, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DetalhesDoProjetoButtonW, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(TextProjetoX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CurtirButtonX, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DetalhesDoProjetoX, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TextProjetoZ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CurtirButtonZ, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DetalhesDoProjetoButtonZ, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel3);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 610, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void SairButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SairButtonActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_SairButtonActionPerformed

    private void GerenciarUsuariosButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GerenciarUsuariosButtonActionPerformed
        // TODO add your handling code here:
        new TelaGerenciaUsuario().setVisible(true);
    }//GEN-LAST:event_GerenciarUsuariosButtonActionPerformed

    private void ProcurarProjetoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProcurarProjetoButtonActionPerformed
        // TODO add your handling code here:
        new TelaPesquisarProjeto().setVisible(true);
    }//GEN-LAST:event_ProcurarProjetoButtonActionPerformed

    private void GerenciarProjetosButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GerenciarProjetosButtonActionPerformed
        // TODO add your handling code here:
        new TelaGerenciarProjetoo().setVisible(true);
       
    }//GEN-LAST:event_GerenciarProjetosButtonActionPerformed

    private void CurtirButtonXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CurtirButtonXActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CurtirButtonXActionPerformed

    private void TextProjetoXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextProjetoXActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextProjetoXActionPerformed

    private void TextProjetoWActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextProjetoWActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextProjetoWActionPerformed

    private void DetalhesDoProjetoXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DetalhesDoProjetoXActionPerformed
        // TODO add your handling code here:
        new TelaDetalheProjeto().setVisible(true);
    }//GEN-LAST:event_DetalhesDoProjetoXActionPerformed

    private void DetalhesDoProjetoButtonWActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DetalhesDoProjetoButtonWActionPerformed
        // TODO add your handling code here:
        new TelaDetalheProjeto().setVisible(true);
    }//GEN-LAST:event_DetalhesDoProjetoButtonWActionPerformed

    private void CurtirButtonWActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CurtirButtonWActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CurtirButtonWActionPerformed

    private void TextProjetoZActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextProjetoZActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextProjetoZActionPerformed

    private void DetalhesDoProjetoButtonZActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DetalhesDoProjetoButtonZActionPerformed
        // TODO add your handling code here:
        new TelaDetalheProjeto().setVisible(true);
    }//GEN-LAST:event_DetalhesDoProjetoButtonZActionPerformed

    private void CurtirButtonZActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CurtirButtonZActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CurtirButtonZActionPerformed

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
            java.util.logging.Logger.getLogger(TelaProjeto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaProjeto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaProjeto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaProjeto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaProjeto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CurtirButtonW;
    private javax.swing.JButton CurtirButtonX;
    private javax.swing.JButton CurtirButtonZ;
    private javax.swing.JButton DetalhesDoProjetoButtonW;
    private javax.swing.JButton DetalhesDoProjetoButtonZ;
    private javax.swing.JButton DetalhesDoProjetoX;
    private javax.swing.JButton GerenciarProjetosButton;
    private javax.swing.JButton GerenciarUsuariosButton;
    private javax.swing.JLabel ImgUsuario;
    private javax.swing.JButton ProcurarProjetoButton;
    private javax.swing.JButton SairButton;
    private javax.swing.JTextArea TextAreaW;
    private javax.swing.JTextArea TextAreaX;
    private javax.swing.JTextArea TextAreaZ;
    private javax.swing.JTextField TextProjetoW;
    private javax.swing.JTextField TextProjetoX;
    private javax.swing.JTextField TextProjetoZ;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    // End of variables declaration//GEN-END:variables
}
