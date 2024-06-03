/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Telas;

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
        btnCancelar = new javax.swing.JButton();
        txtNomeProjeto = new javax.swing.JLabel();
        txtfieldNomeProjeto = new javax.swing.JTextField();
        btnProcurar = new javax.swing.JButton();
        txtTitulo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jpanelFundo.setBackground(new java.awt.Color(169, 172, 200));
        jpanelFundo.setMaximumSize(new java.awt.Dimension(800, 600));
        jpanelFundo.setPreferredSize(new java.awt.Dimension(800, 600));
        jpanelFundo.setRequestFocusEnabled(false);

        jscrollTabela.setViewportView(tableTabela);

        btnConcluido.setFont(new java.awt.Font("Gliker", 0, 12)); // NOI18N
        btnConcluido.setText("Concluído");

        btnCancelar.setFont(new java.awt.Font("Gliker", 0, 12)); // NOI18N
        btnCancelar.setText("Cancelar");

        txtNomeProjeto.setFont(new java.awt.Font("Gliker", 0, 12)); // NOI18N
        txtNomeProjeto.setForeground(new java.awt.Color(255, 255, 255));
        txtNomeProjeto.setText("Nome do Projeto:");

        btnProcurar.setFont(new java.awt.Font("Gliker", 0, 12)); // NOI18N
        btnProcurar.setText("Procurar");

        txtTitulo.setFont(new java.awt.Font("Gliker", 1, 48)); // NOI18N
        txtTitulo.setForeground(new java.awt.Color(255, 255, 255));
        txtTitulo.setText("Procurar Projeto");

        javax.swing.GroupLayout jpanelFundoLayout = new javax.swing.GroupLayout(jpanelFundo);
        jpanelFundo.setLayout(jpanelFundoLayout);
        jpanelFundoLayout.setHorizontalGroup(
            jpanelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelFundoLayout.createSequentialGroup()
                .addGroup(jpanelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpanelFundoLayout.createSequentialGroup()
                        .addGap(255, 255, 255)
                        .addComponent(btnConcluido)
                        .addGap(110, 110, 110)
                        .addComponent(btnCancelar))
                    .addGroup(jpanelFundoLayout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addGroup(jpanelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpanelFundoLayout.createSequentialGroup()
                                .addComponent(txtNomeProjeto)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtfieldNomeProjeto, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnProcurar))
                            .addComponent(jscrollTabela, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 616, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(81, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanelFundoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(txtTitulo)
                .addGap(186, 186, 186))
        );
        jpanelFundoLayout.setVerticalGroup(
            jpanelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanelFundoLayout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(txtTitulo)
                .addGap(18, 18, 18)
                .addGroup(jpanelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNomeProjeto)
                    .addComponent(txtfieldNomeProjeto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnProcurar))
                .addGap(30, 30, 30)
                .addComponent(jscrollTabela, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addGroup(jpanelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConcluido)
                    .addComponent(btnCancelar))
                .addGap(42, 42, 42))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpanelFundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpanelFundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
    private javax.swing.JButton btnCancelar;
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
