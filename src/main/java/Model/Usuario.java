package Model;

public class Usuario {
    private int idUsuario;
    private String loginUsuario;
    private String senha;
    private String nome;
    private String telefone;
    private String email;
    private String privilegio;

    public Usuario() {
    }

    public Usuario(int idUsuario, String loginUsuario, String senha, String nome, String telefone, String email, String privilegio) {
        this.idUsuario = idUsuario;
        this.loginUsuario = loginUsuario;
        this.senha = senha;
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.privilegio = privilegio;
    }

    // Getters and Setters
    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getLoginUsuario() {
        return loginUsuario;
    }

    public void setLoginUsuario(String loginUsuario) {
        this.loginUsuario = loginUsuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPrivilegio() {
        return privilegio;
    }

    public void setPrivilegio(String privilegio) {
        this.privilegio = privilegio;
    }
}
