/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Telas;

import DAO.ProjetoDAO;
import Model.Projeto;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author vini
 */
public class TelaGerenciarProjeto extends javax.swing.JFrame {

    /**
     * Creates new form TelaGerenciarProjetoo
     */
    public TelaGerenciarProjeto() {
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
        label1 = new java.awt.Label();
        jLabel2 = new javax.swing.JLabel();
        txtfieldID = new java.awt.TextField();
        label2 = new java.awt.Label();
        txtfieldNome = new java.awt.TextField();
        label3 = new java.awt.Label();
        txtfieldCriacaoProjeto = new java.awt.TextField();
        label4 = new java.awt.Label();
        label5 = new java.awt.Label();
        txtfieldResponsavel = new java.awt.TextField();
        label6 = new java.awt.Label();
        label7 = new java.awt.Label();
        btnConcluido = new java.awt.Button();
        btnProcurar = new javax.swing.JButton();
        btnSalvarNoBanco = new javax.swing.JButton();
        txtfieldODS = new java.awt.TextField();
        txtfieldSituacao = new java.awt.TextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtfieldDescricao = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(169, 172, 200));
        jPanel1.setForeground(new java.awt.Color(169, 172, 200));

        label1.setBackground(new java.awt.Color(169, 172, 200));
        label1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        label1.setForeground(new java.awt.Color(0, 0, 0));
        label1.setText("Gerenciar Projeto");

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("ID:");

        txtfieldID.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtfieldID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfieldIDActionPerformed(evt);
            }
        });

        label2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        label2.setForeground(new java.awt.Color(0, 0, 0));
        label2.setText("Nome:");

        label3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        label3.setForeground(new java.awt.Color(0, 0, 0));
        label3.setText("Criado em: ");

        txtfieldCriacaoProjeto.setEditable(false);
        txtfieldCriacaoProjeto.setForeground(new java.awt.Color(153, 153, 153));
        txtfieldCriacaoProjeto.setName(""); // NOI18N
        txtfieldCriacaoProjeto.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtfieldCriacaoProjetoFocusGained(evt);
            }
        });
        txtfieldCriacaoProjeto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfieldCriacaoProjetoActionPerformed(evt);
            }
        });

        label4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        label4.setForeground(new java.awt.Color(0, 0, 0));
        label4.setText("Descrição:");

        label5.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        label5.setForeground(new java.awt.Color(0, 0, 0));
        label5.setText("Responsável:");

        txtfieldResponsavel.setEditable(false);
        txtfieldResponsavel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfieldResponsavelActionPerformed(evt);
            }
        });

        label6.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        label6.setForeground(new java.awt.Color(0, 0, 0));
        label6.setText("ODS:");

        label7.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        label7.setForeground(new java.awt.Color(0, 0, 0));
        label7.setText("Situação:");

        btnConcluido.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnConcluido.setLabel("Concluido");
        btnConcluido.setName(""); // NOI18N
        btnConcluido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConcluidoActionPerformed(evt);
            }
        });

        btnProcurar.setText("Procurar");
        btnProcurar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcurarActionPerformed(evt);
            }
        });

        btnSalvarNoBanco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/11646.jpg"))); // NOI18N
        btnSalvarNoBanco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarNoBancoActionPerformed(evt);
            }
        });

        txtfieldODS.setEditable(false);
        txtfieldODS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfieldODSActionPerformed(evt);
            }
        });

        txtfieldSituacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfieldSituacaoActionPerformed(evt);
            }
        });

        txtfieldDescricao.setColumns(20);
        txtfieldDescricao.setLineWrap(true);
        txtfieldDescricao.setRows(5);
        jScrollPane1.setViewportView(txtfieldDescricao);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(294, 294, 294)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtfieldID, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnProcurar))
                            .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(204, 204, 204)
                                .addComponent(btnConcluido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(label6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtfieldODS, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(label7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtfieldSituacao, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                                .addComponent(btnSalvarNoBanco, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtfieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtfieldCriacaoProjeto, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(19, 19, 19)
                                .addComponent(txtfieldResponsavel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(78, 78, 78))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(txtfieldID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtfieldCriacaoProjeto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtfieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(3, 3, 3)
                                    .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(btnProcurar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(txtfieldResponsavel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtfieldODS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtfieldSituacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addComponent(btnConcluido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(btnSalvarNoBanco, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 711, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 545, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtfieldIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfieldIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfieldIDActionPerformed

    private void txtfieldCriacaoProjetoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtfieldCriacaoProjetoFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfieldCriacaoProjetoFocusGained

    private void txtfieldCriacaoProjetoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfieldCriacaoProjetoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfieldCriacaoProjetoActionPerformed

    private void btnProcurarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcurarActionPerformed
        int id = Integer.parseInt(txtfieldID.getText());

        // Cria um objeto ProjetoDAO para buscar o projeto no banco de dados
        ProjetoDAO projetoDAO = new ProjetoDAO();
        Projeto projeto = projetoDAO.buscarProjetoPorID(id);

        // Verifica se o projeto foi encontradoa
        if (projeto != null) {
            // Preenche os campos com as informações do projeto
            txtfieldNome.setText(projeto.getNome());
            txtfieldDescricao.setText(projeto.getDescricao());
            txtfieldCriacaoProjeto.setText(new SimpleDateFormat("dd/MM/yyyy").format(projeto.getDataCriacao()));
            txtfieldODS.setText(projeto.getNomeODS());
            txtfieldResponsavel.setText(projeto.getNomeResponsavel());
            txtfieldSituacao.setText(projeto.getStatus());
        } else {
            JOptionPane.showMessageDialog(this, "Projeto não encontrado!");
        }
    }//GEN-LAST:event_btnProcurarActionPerformed

    private void btnConcluidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConcluidoActionPerformed
        this.dispose();
        TelaProjetoUsuario telaProjetoUsuario = new TelaProjetoUsuario();
        telaProjetoUsuario.setVisible(true);
    }//GEN-LAST:event_btnConcluidoActionPerformed

    private void txtfieldODSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfieldODSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfieldODSActionPerformed

    private void txtfieldSituacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfieldSituacaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfieldSituacaoActionPerformed

    private void btnSalvarNoBancoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarNoBancoActionPerformed
        // Recupera os dados inseridos/modificados na tela
        int id = Integer.parseInt(txtfieldID.getText());
        String nome = txtfieldNome.getText();
        String descricao = txtfieldDescricao.getText();
        String status = txtfieldSituacao.getText(); // Corrigindo para pegar o status da combobox

        // Cria um objeto Projeto com os dados da tela
        Projeto projeto = new Projeto();
        projeto.setId(id);
        projeto.setNome(nome);
        projeto.setDescricao(descricao);
        projeto.setStatus(status);

        // Cria um objeto ProjetoDAO para atualizar o projeto no banco de dados
        ProjetoDAO projetoDAO = new ProjetoDAO();
        projetoDAO.atualizarProjeto(projeto);

        // Salvar a ODS novamente no banco de dados
        projetoDAO.atualizarODS(projeto.getId(), txtfieldODS.getText());

        // Exibe uma mensagem de confirmação
        JOptionPane.showMessageDialog(this, "Projeto atualizado com sucesso!");
    }//GEN-LAST:event_btnSalvarNoBancoActionPerformed

    private void txtfieldResponsavelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfieldResponsavelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfieldResponsavelActionPerformed

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
            java.util.logging.Logger.getLogger(TelaGerenciarProjeto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaGerenciarProjeto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaGerenciarProjeto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaGerenciarProjeto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaGerenciarProjeto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button btnConcluido;
    private javax.swing.JButton btnProcurar;
    private javax.swing.JButton btnSalvarNoBanco;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.Label label4;
    private java.awt.Label label5;
    private java.awt.Label label6;
    private java.awt.Label label7;
    private java.awt.TextField txtfieldCriacaoProjeto;
    private javax.swing.JTextArea txtfieldDescricao;
    private java.awt.TextField txtfieldID;
    private java.awt.TextField txtfieldNome;
    private java.awt.TextField txtfieldODS;
    private java.awt.TextField txtfieldResponsavel;
    private java.awt.TextField txtfieldSituacao;
    // End of variables declaration//GEN-END:variables
}
