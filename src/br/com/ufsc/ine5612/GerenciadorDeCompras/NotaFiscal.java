/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ufsc.ine5612.GerenciadorDeCompras;

import java.util.Date;

/**
 *
 * @author Alexandre
 */
public class NotaFiscal {

    protected int dia;
    protected int mes;
    protected int ano;
    protected int numero;
    protected Pedido pedido;
    protected ControladorNotaFiscal owner;

    public NotaFiscal(int dia, int mes, int ano, int numero) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.numero = numero;
        this.pedido = pedido;
    }

    public int getData() {
        return dia;
    }

    public void setData(int data) {
        this.dia = data;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public ControladorNotaFiscal getOwner() {
        return owner;
    }

    public void setOwner(ControladorNotaFiscal owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "NotaFiscal: " + numero + "\n" + "\n" +  "dia" + dia+ "/" + mes + "/" + ano + "\n" + "\n";
    }
    

}
