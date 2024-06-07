package DAO;

import Connection.ConnectionFactory;
import Model.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UsuarioDAO {

    private Connection conexao;

    public UsuarioDAO() {
        ConnectionFactory factory = new ConnectionFactory();
        this.conexao = factory.obtemConexao();
    }

    public void inserirUsuario(String loginUsuario, String senha, String nome, String telefone, String email, String privilegio) {
        String sql = "INSERT INTO tb_Usuario(login_Usuario, senha, nome, telefone, email, privilegio) VALUES(?, ?, ?, ?, ?, ?)";

        try (PreparedStatement ps = conexao.prepareStatement(sql)) {
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

        try (PreparedStatement ps = conexao.prepareStatement(sql)) {
            ps.setString(1, loginUsuario);
            ps.setString(2, senha);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                int idUsuario = rs.getInt("id_Usuario");
                String nome = rs.getString("nome");
                String telefone = rs.getString("telefone");
                String email = rs.getString("email");
                String privilegio = rs.getString("privilegio");

                return new Usuario(idUsuario, loginUsuario, senha, nome, telefone, email, privilegio);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    public Usuario pesquisarUsuario(String login) {
        String sql = "SELECT * FROM tb_Usuario WHERE login_Usuario = ?";
        Usuario usuario = null;

        try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
            stmt.setString(1, login);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                usuario = new Usuario();
                usuario.setLoginUsuario(rs.getString("login_Usuario"));
                usuario.setNome(rs.getString("nome"));
                usuario.setTelefone(rs.getString("telefone"));
                usuario.setEmail(rs.getString("email"));
                usuario.setSenha(rs.getString("senha"));
                usuario.setPrivilegio(rs.getString("privilegio"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return usuario;
    }

    public boolean atualizarUsuario(Usuario usuario) {
        String sql = "UPDATE tb_Usuario SET nome = ?, telefone = ?, email = ?, senha = ?, privilegio = ? WHERE login_Usuario = ?";

        try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
            System.out.println("Nome: " + usuario.getNome());
            System.out.println("Telefone: " + usuario.getTelefone());
            System.out.println("Email: " + usuario.getEmail());
            System.out.println("Senha: " + usuario.getSenha());
            System.out.println("Privilegio: " + usuario.getPrivilegio());
            System.out.println("LoginUsuario: " + usuario.getLoginUsuario());

            stmt.setString(1, usuario.getNome());
            stmt.setString(2, usuario.getTelefone());
            stmt.setString(3, usuario.getEmail());
            stmt.setString(4, usuario.getSenha());
            stmt.setString(5, usuario.getPrivilegio());
            stmt.setString(6, usuario.getLoginUsuario());
            int rowsUpdated = stmt.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("Usuário atualizado com sucesso!");
                return true;
            } else {
                System.err.println("Nenhuma linha foi atualizada. Verifique se o login_Usuario está correto.");
            }
        } catch (SQLException e) {
            System.err.println("Erro ao atualizar usuário: " + e.getMessage());
            e.printStackTrace();
        }
        return false;
    }
}
