package DAO;
import Connection.ConnectionFactory;
import Model.Ods;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class OdsDAO {
    private Connection conexao;

    public OdsDAO() {
        ConnectionFactory factory = new ConnectionFactory();
        this.conexao = factory.obtemConexao();
    }

    public ArrayList<String> getNomesODS() {
        ArrayList<String> nomesODS = new ArrayList<>();
        String sql = "SELECT nome_Ods FROM tb_Ods";
        try {
            PreparedStatement stmt = conexao.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                nomesODS.add(rs.getString("nome_Ods"));
            }
            stmt.close();
            rs.close();
        } catch (SQLException e) {
            System.err.println("Erro ao buscar nomes de ODS: " + e.getMessage());
        }
        return nomesODS;
    }
        public int getIdByNome(String nomeOds) {
        String query = "SELECT numero_Ods FROM tb_ods WHERE nome_Ods = ?";
        int idOds = -1;

        try (Connection connection = new ConnectionFactory().obtemConexao();
             PreparedStatement stmt = connection.prepareStatement(query)) {

            stmt.setString(1, nomeOds);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    idOds = rs.getInt("numero_Ods");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return idOds;
    }
    
  }