/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Telas;

import DAO.ProjetoDAO;
import Model.Projeto;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 12101863
 */
public class TelaPesquisarProjeto extends javax.swing.JFrame {

    /**
     * Creates new form TelaPesquisarProjeto
     */
    public TelaPesquisarProjeto() {
        initComponents();
        projetoDAO = new ProjetoDAO();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpanelFundo = new javax.swing.JPanel();
        jscrollTabela = new javax.swing.JScrollPane();
        tableTabela = new javax.swing.JTable();
        btnConcluido = new javax.swing.JButton();
        txtNomeProjeto = new javax.swing.JLabel();
        txtfieldNomeProjeto = new javax.swing.JTextField();
        btnProcurar = new javax.swing.JButton();
        txtTitulo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jpanelFundo.setBackground(new java.awt.Color(169, 172, 200));
        jpanelFundo.setMaximumSize(new java.awt.Dimension(800, 600));
        jpanelFundo.setPreferredSize(new java.awt.Dimension(800, 600));
        jpanelFundo.setRequestFocusEnabled(false);

        tableTabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID ", "Nome Projeto"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jscrollTabela.setViewportView(tableTabela);

        btnConcluido.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnConcluido.setText("Concluído");
        btnConcluido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConcluidoActionPerformed(evt);
            }
        });

        txtNomeProjeto.setFont(new java.awt.Font("Gliker", 1, 24)); // NOI18N
        txtNomeProjeto.setForeground(new java.awt.Color(255, 255, 255));
        txtNomeProjeto.setText("Nome do Projeto:");

        txtfieldNomeProjeto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfieldNomeProjetoActionPerformed(evt);
            }
        });

        btnProcurar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnProcurar.setText("Procurar");
        btnProcurar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcurarActionPerformed(evt);
            }
        });

        txtTitulo.setFont(new java.awt.Font("Gliker", 1, 42)); // NOI18N
        txtTitulo.setForeground(new java.awt.Color(255, 255, 255));
        txtTitulo.setText("Procurar Projeto");

        javax.swing.GroupLayout jpanelFundoLayout = new javax.swing.GroupLayout(jpanelFundo);
        jpanelFundo.setLayout(jpanelFundoLayout);
        jpanelFundoLayout.setHorizontalGroup(
            jpanelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelFundoLayout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addGroup(jpanelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jscrollTabela, javax.swing.GroupLayout.DEFAULT_SIZE, 627, Short.MAX_VALUE)
                    .addGroup(jpanelFundoLayout.createSequentialGroup()
                        .addGroup(jpanelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpanelFundoLayout.createSequentialGroup()
                                .addComponent(txtNomeProjeto, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(txtfieldNomeProjeto))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnProcurar)))
                .addGap(81, 81, 81))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanelFundoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(txtTitulo)
                .addGap(194, 194, 194))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanelFundoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnConcluido, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(347, 347, 347))
        );
        jpanelFundoLayout.setVerticalGroup(
            jpanelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanelFundoLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(txtTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(24, 24, 24)
                .addComponent(txtNomeProjeto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpanelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtfieldNomeProjeto, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnProcurar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(jscrollTabela, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(btnConcluido, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpanelFundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpanelFundo, javax.swing.GroupLayout.PREFERRED_SIZE, 615, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtfieldNomeProjetoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfieldNomeProjetoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfieldNomeProjetoActionPerformed

    private void preencherTabela(ArrayList<Projeto> projetos) {
    DefaultTableModel model = (DefaultTableModel) tableTabela.getModel();
    model.setRowCount(0); // Limpa a tabela antes de adicionar novos dados

    for (Projeto projeto : projetos) {
        Object[] row = {projeto.getId(), projeto.getNome()};
        model.addRow(row); // Adiciona uma nova linha à tabela com os dados do projeto
    }
}   
    private ProjetoDAO projetoDAO;
    private void btnProcurarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcurarActionPerformed
          String nomeParcial = txtfieldNomeProjeto.getText();
    List<Projeto> projetos = projetoDAO.buscarProjetosPorNomeParcial(nomeParcial); 
    ArrayList<Projeto> projetosArrayList = new ArrayList<>(projetos); 
    preencherTabela(projetosArrayList);
    }//GEN-LAST:event_btnProcurarActionPerformed

    private void btnConcluidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConcluidoActionPerformed
        // TODO add your handling code here:
        this.dispose();
        TelaProjetoUsuario telaProjetoUsuario = new TelaProjetoUsuario();
        telaProjetoUsuario.setVisible(true);
    }//GEN-LAST:event_btnConcluidoActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPesquisarProjeto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPesquisarProjeto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPesquisarProjeto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPesquisarProjeto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPesquisarProjeto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConcluido;
    private javax.swing.JButton btnProcurar;
    private javax.swing.JPanel jpanelFundo;
    private javax.swing.JScrollPane jscrollTabela;
    private javax.swing.JTable tableTabela;
    private javax.swing.JLabel txtNomeProjeto;
    private javax.swing.JLabel txtTitulo;
    private javax.swing.JTextField txtfieldNomeProjeto;
    // End of variables declaration//GEN-END:variables
}
