/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

/**
 *
 * @author 12101863
 */

import Connection.ConnectionFactory;
import Model.Projeto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ProjetoDAO {
    private Connection conexao;

    public ProjetoDAO() {
        ConnectionFactory factory = new ConnectionFactory();
        this.conexao = factory.obtemConexao();;
    }

    public void cadastrarProjeto(Projeto projeto) {
        String sql = "INSERT INTO tb_Projeto (nome_Projeto, descricao, data_Criacao, nome_ODS, status) "
                   + "VALUES (?, ?, ?, ?, ?)";
        try {
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, projeto.getNome_Projeto());
            stmt.setString(2, projeto.getDescricao());
            stmt.setDate(3, new java.sql.Date(projeto.getData_Criacao().getTime()));
            stmt.setString(4, projeto.getNome_ODS());
            stmt.setBoolean(5, projeto.isStatus());
            stmt.executeUpdate();
            stmt.close();
            System.out.println("Projeto cadastrado com sucesso!");
        } catch (SQLException e) {
            System.err.println("Erro ao cadastrar projeto: " + e.getMessage());
        }
    }
}

