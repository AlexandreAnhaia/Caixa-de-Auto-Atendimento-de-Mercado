/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ufsc.ine5612.GerenciadorDePagamento;

import br.com.ufsc.ine5612.Controladores.ControladorPrincipal;
import br.com.ufsc.ine5612.GerenciadorDeCompras.NotaFiscal;
import br.com.ufsc.ine5612.GerenciadorDeProdutos.Produto;
import br.com.ufsc.ine5612.Interface.TelaPagamento;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Alexandre
 */
public class ControladorPagamento {

    protected ControladorPrincipal owner;
    protected TelaPagamento telaPagamento;

    public ControladorPagamento(ControladorPrincipal owner) {
        this.owner = owner;
        this.telaPagamento = new TelaPagamento();
    }

    public TelaPagamento getTelaPagamento() {
        return telaPagamento;
    }

    public void imprimeNotaFiscal() {
        Date data = new Date();
        ArrayList<Produto> produtos = ControladorPrincipal.getInstance().getCtrlPedido().getProdutos();
        NotaFiscal notaFiscal = new NotaFiscal(data.getDay(), data.getMonth(), data.getYear(), (int) Math.floor(Math.random() * 10));
        float valorTotal = ControladorPrincipal.getInstance().getCtrlPedido().getValorTotal();
        System.out.println(notaFiscal);
        System.out.println(produtos + "\n");
        System.out.println("Valor Total: " + valorTotal);
    }

}
