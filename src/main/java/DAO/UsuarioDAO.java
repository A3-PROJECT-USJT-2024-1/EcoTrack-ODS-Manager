package DAO;

import Connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UsuarioDAO {

    public void inserirUsuario(String loginUsuario, String senha, String nome, String telefone, String email, int privilegio) {
        String sql = "INSERT INTO tb_Usuario(login_Usuario, senha, nome, telefone, email, privilegio) VALUES(?, ?, ?, ?, ?, ?)";
        ConnectionFactory factory = new ConnectionFactory();
        
        try (Connection c = factory.obtemConexao()) {
            PreparedStatement ps = c.prepareStatement(sql);

            ps.setString(1, loginUsuario);
            ps.setString(2, senha);
            ps.setString(3, nome);
            ps.setString(4, telefone);
            ps.setString(5, email);
            ps.setInt(6, privilegio);

            ps.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
