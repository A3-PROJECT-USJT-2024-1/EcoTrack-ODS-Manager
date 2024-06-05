package Model;

import java.util.Date;

public class Projeto {

    private int id;
    private String nome;
    private String descricao;
    private Date dataCriacao;
    private int numeroODS;
    private String nomeODS;
    private String nomeResponsavel;
    private String status;
    private int curtidas;

    public Projeto() {
        this.dataCriacao = new Date(); // Define a data de criação como a data atual no momento da criação do projeto
    }

    public int getId() {
        return id;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(Date dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public int getNumeroODS() {
        return numeroODS;
    }

    public void setNumeroODS(int numeroODS) {
        this.numeroODS = numeroODS;
    }

    public String getNomeODS() {
        return nomeODS;
    }

    public void setNomeODS(String nomeODS) {
        this.nomeODS = nomeODS;
    }

    public String getNomeResponsavel() {
        return nomeResponsavel;
    }

    public void setNomeResponsavel(String nomeResponsavel) {
        this.nomeResponsavel = nomeResponsavel;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
