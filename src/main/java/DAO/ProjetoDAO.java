package DAO;

import Connection.ConnectionFactory;
import Model.Projeto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProjetoDAO {

    private final Connection conexao;

    public ProjetoDAO() {
        ConnectionFactory factory = new ConnectionFactory();
        this.conexao = factory.obtemConexao();
    }

    public void inserirProjeto(Projeto projeto) {
        String sql = "INSERT INTO tb_Projeto (nome_Projeto, descricao, data_Criacao, numero_Ods, nome_ODS, nome_Responsavel, status) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
            stmt.setString(1, projeto.getNome());
            stmt.setString(2, projeto.getDescricao());
            stmt.setDate(3, new java.sql.Date(projeto.getDataCriacao().getTime()));
            stmt.setInt(4, projeto.getNumeroODS());
            stmt.setString(5, projeto.getNomeODS());
            stmt.setString(6, projeto.getNomeResponsavel());
            stmt.setString(7, projeto.getStatus());
            stmt.executeUpdate();
            System.out.println("Projeto cadastrado com sucesso!");
        } catch (SQLException e) {
            e.printStackTrace();
            System.err.println("Erro ao cadastrar projeto: " + e.getMessage());
        }
    }

    public List<Projeto> buscarProjetosPorNomeParcial(String nomeProjeto) {
        List<Projeto> projetos = new ArrayList<>();
        String sql = "SELECT id_Projeto, nome_Projeto FROM tb_Projeto WHERE nome_Projeto LIKE ?";
        try (PreparedStatement ps = conexao.prepareStatement(sql)) {
            ps.setString(1, "%" + nomeProjeto + "%");
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    int idProjeto = rs.getInt("id_Projeto");
                    String nome = rs.getString("nome_Projeto");
                    Projeto projeto = new Projeto();
                    projeto.setId(idProjeto);
                    projeto.setNome(nome);
                    projetos.add(projeto);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return projetos;
    }

    public void atualizarProjeto(Projeto projeto) {
        String sql = "UPDATE tb_Projeto SET nome_Projeto=?, descricao=?, numero_Ods=?, nome_ODS=?, status=? WHERE id_Projeto=?";
        try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
            stmt.setString(1, projeto.getNome());
            stmt.setString(2, projeto.getDescricao());
            stmt.setInt(3, projeto.getNumeroODS());
            stmt.setString(4, projeto.getNomeODS());
            stmt.setString(5, projeto.getStatus());
            stmt.setInt(6, projeto.getId());
            stmt.executeUpdate();
            System.out.println("Projeto atualizado com sucesso!");
        } catch (SQLException e) {
            System.err.println("Erro ao atualizar projeto: " + e.getMessage());
        }
    }

    public Projeto buscarProjetoPorID(int id) {
        Projeto projeto = null;
        String sql = "SELECT * FROM tb_Projeto WHERE id_Projeto = ?";
        try (PreparedStatement ps = conexao.prepareStatement(sql)) {
            ps.setInt(1, id);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    projeto = new Projeto();
                    projeto.setId(rs.getInt("id_Projeto"));
                    projeto.setNome(rs.getString("nome_Projeto"));
                    projeto.setDescricao(rs.getString("descricao"));
                    projeto.setDataCriacao(rs.getDate("data_Criacao"));
                    projeto.setNumeroODS(rs.getInt("numero_Ods"));
                    projeto.setNomeODS(rs.getString("nome_ODS"));
                    projeto.setNomeResponsavel(rs.getString("nome_Responsavel"));
                    projeto.setStatus(rs.getString("status"));
                    projeto.setCurtidas(rs.getInt("curtidas"));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return projeto;
    }

    public void atualizarODS(int idProjeto, String nomeODS) {
        String sql = "UPDATE tb_Projeto SET nome_ODS=? WHERE id_Projeto=?";
        try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
            stmt.setString(1, nomeODS);
            stmt.setInt(2, idProjeto);
            stmt.executeUpdate();
            System.out.println("ODS atualizada com sucesso para o projeto de ID: " + idProjeto);
        } catch (SQLException e) {
            System.err.println("Erro ao atualizar ODS: " + e.getMessage());
        }
    }

    public List<Projeto> consultarProjetosEmAlta() {
        List<Projeto> projetosEmAlta = new ArrayList<>();
        try (PreparedStatement stmt = conexao.prepareStatement("SELECT * FROM projetos ORDER BY curtidas DESC LIMIT 3"); ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                Projeto projeto = new Projeto();
                projeto.setId(rs.getInt("id"));
                projeto.setNome(rs.getString("nome"));
                projeto.setDescricao(rs.getString("descricao"));
                projeto.setCurtidas(rs.getInt("curtidas"));
                projetosEmAlta.add(projeto);
            }
        } catch (SQLException e) {
            System.out.println("Erro ao consultar projetos em alta: " + e.getMessage());
        }
        return projetosEmAlta;
    }

    public void incrementarCurtida(int idProjeto) {
        String sql = "UPDATE tb_Projeto SET curtidas = curtidas + 1 WHERE id_Projeto = ?";
        try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
            stmt.setInt(1, idProjeto);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
