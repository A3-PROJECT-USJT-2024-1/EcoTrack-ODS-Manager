package DAO;

import Connection.ConnectionFactory;
import Model.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UsuarioDAO {

    public void inserirUsuario(String loginUsuario, String senha, String nome, String telefone, String email, String privilegio) {
        String sql = "INSERT INTO tb_Usuario(login_Usuario, senha, nome, telefone, email, privilegio) VALUES(?, ?, ?, ?, ?, ?)";
        ConnectionFactory factory = new ConnectionFactory();

        try (Connection c = factory.obtemConexao()) {
            PreparedStatement ps = c.prepareStatement(sql);

            ps.setString(1, loginUsuario);
            ps.setString(2, senha);
            ps.setString(3, nome);
            ps.setString(4, telefone);
            ps.setString(5, email);
            ps.setString(6, privilegio);

            ps.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Usuario verificarLogin(String loginUsuario, String senha) {
        String sql = "SELECT id_Usuario, nome, telefone, email, privilegio FROM tb_Usuario WHERE login_Usuario = ? AND senha = ?";
        ConnectionFactory factory = new ConnectionFactory();

        try (Connection c = factory.obtemConexao()) {
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setString(1, loginUsuario);
            ps.setString(2, senha);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                int idUsuario = rs.getInt("id_Usuario");
                String nome = rs.getString("nome");
                String telefone = rs.getString("telefone");
                String email = rs.getString("email");
                String privilegio = rs.getString("privilegio");

                return new Usuario(idUsuario, nome, telefone, email, senha, privilegio);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }
}
