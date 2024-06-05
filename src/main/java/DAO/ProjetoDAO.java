package DAO;

import Connection.ConnectionFactory;
import Model.Projeto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ProjetoDAO {
    private Connection conexao;
    private ConnectionFactory factory;

    public ProjetoDAO() {
        this.factory = new ConnectionFactory();
        this.conexao = factory.obtemConexao();
    }

    public void inserirProjeto(Projeto projeto) {
        String sql = "INSERT INTO tb_Projeto (nome_Projeto, descricao, data_Criacao, numero_Ods, nome_ODS, status) "
                   + "VALUES (?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, projeto.getNome());
            stmt.setString(2, projeto.getDescricao());
            stmt.setDate(3, new java.sql.Date(projeto.getDataCriacao().getTime()));
            stmt.setInt(4, projeto.getNumeroODS());
            stmt.setString(5, projeto.getNomeODS());
            stmt.setString(6, projeto.getStatus());
            stmt.executeUpdate();
            stmt.close();
            System.out.println("Projeto cadastrado com sucesso!");
        } catch (SQLException e) {
            System.err.println("Erro ao cadastrar projeto: " + e.getMessage());
        }
    }
    
   public ArrayList<Projeto> buscarProjetosPorNomeParcial(String nomeProjeto) {
        ArrayList<Projeto> projetos = new ArrayList<>();
        String sql = "SELECT id_Projeto, nome_Projeto FROM tb_Projeto WHERE nome_Projeto LIKE ?";
        
        try (Connection c = factory.obtemConexao();
             PreparedStatement ps = c.prepareStatement(sql)) {
            ps.setString(1, "%" + nomeProjeto + "%");
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                int idProjeto = rs.getInt("id_Projeto");
                String nome = rs.getString("nome_Projeto");
                Projeto projeto = new Projeto();
                projeto.setId(idProjeto);
                projeto.setNome(nome);
                projetos.add(projeto);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return projetos;
    }
      public void atualizarProjeto(Projeto projeto) {
        String sql = "UPDATE tb_Projeto SET nome_Projeto = ?, descricao = ?, data_Criacao = ?, " +
                     "numero_Ods = ?, nome_ODS = ?, status = ? WHERE id_Projeto = ?";

        try (Connection c = factory.obtemConexao();
             PreparedStatement ps = c.prepareStatement(sql)) {
            ps.setString(1, projeto.getNome());
            ps.setString(2, projeto.getDescricao());
            ps.setDate(3, new java.sql.Date(projeto.getDataCriacao().getTime()));
            ps.setInt(4, projeto.getNumeroODS());
            ps.setString(5, projeto.getNomeODS());
            ps.setString(6, projeto.getStatus());
            ps.setInt(7, projeto.getId());

            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
