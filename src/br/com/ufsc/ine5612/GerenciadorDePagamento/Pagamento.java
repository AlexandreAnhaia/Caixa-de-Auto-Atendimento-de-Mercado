/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ufsc.ine5612.GerenciadorDePagamento;

import java.util.Date;
import java.util.LinkedList;

/**
 *
 * @author Alexandre
 */
public class Pagamento {

    protected int numero;
    protected LinkedList pagamentos;
    protected Date data;
    protected ControladorPagamento owner;

    public Pagamento(int numero, Date data, LinkedList pagamentos, ControladorPagamento owner) {
        this.numero = numero;
        this.data = data;
        this.pagamentos = pagamentos;
        this.owner = owner;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public LinkedList getPagamentos() {
        return pagamentos;
    }

    public void setPagamentos(LinkedList pagamentos) {
        this.pagamentos = pagamentos;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public ControladorPagamento getOwner() {
        return owner;
    }

    public void setOwner(ControladorPagamento owner) {
        this.owner = owner;
    }
    
    


}
