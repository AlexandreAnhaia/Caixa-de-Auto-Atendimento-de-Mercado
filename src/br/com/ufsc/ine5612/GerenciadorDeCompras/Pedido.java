/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ufsc.ine5612.GerenciadorDeCompras;

import java.util.Date;
import java.util.LinkedList;

/**
 *
 * @author Alexandre
 */
public class Pedido {

    protected LinkedList produtos;
    protected int numero;
    protected float valorTotal;
    protected Date data;
    protected ControladorPedido owner;

    public Pedido(LinkedList produtos, int numero, float valorTotal, Date data, ControladorPedido owner) {
        this.produtos = produtos;
        this.numero = numero;
        this.valorTotal = valorTotal;
        this.data = data;
        this.owner = owner;
    }

    public LinkedList getProdutos() {
        return produtos;
    }

    public void setProdutos(LinkedList produtos) {
        this.produtos = produtos;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public float getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public ControladorPedido getOwner() {
        return owner;
    }

    public void setOwner(ControladorPedido owner) {
        this.owner = owner;
    }

}
