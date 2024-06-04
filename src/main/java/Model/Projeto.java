/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author 12101863
 */


import java.util.Date;

import java.util.Date;

public class Projeto {
    private int id_Projeto;
    private String nome_Projeto;
    private String descricao;
    private Date data_Criacao;
    private String nome_ODS;
    private boolean status;

    public int getId_Projeto() {
        return id_Projeto;
    }

    public void setId_Projeto(int id_Projeto) {
        this.id_Projeto = id_Projeto;
    }

    public String getNome_Projeto() {
        return nome_Projeto;
    }

    public void setNome_Projeto(String nome_Projeto) {
        this.nome_Projeto = nome_Projeto;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getData_Criacao() {
        return data_Criacao;
    }

    public void setData_Criacao(Date data_Criacao) {
        this.data_Criacao = data_Criacao;
    }

    public String getNome_ODS() {
        return nome_ODS;
    }

    public void setNome_ODS(String nome_ODS) {
        this.nome_ODS = nome_ODS;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}

