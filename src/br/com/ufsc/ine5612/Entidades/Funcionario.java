/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ufsc.ine5612.Entidades;

import br.com.ufsc.ine5612.Controladores.ControladorFuncionario;
import java.util.ArrayList;

/**
 *
 * @author Alexandre
 */
public class Funcionario {

    protected String nome;
    protected int senha;
    protected ControladorFuncionario owner;

    public Funcionario(String nome, int senha) {
        this.nome = nome;
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public ControladorFuncionario getOwner() {
        return owner;
    }

    public void setOwner(ControladorFuncionario owner) {
        this.owner = owner;
    }

}
