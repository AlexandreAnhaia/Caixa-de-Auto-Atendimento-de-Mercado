/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ufsc.ine5612.GerenciadorDePagamento;

import br.com.ufsc.ine5612.Controladores.ControladorPrincipal;
import java.util.ArrayList;

/**
 *
 * @author Alexandre
 */
public class ControladorCartaoDeCredito {

    protected ControladorPrincipal owner;
    protected ArrayList<CartaoDeCredito> cartoes = new ArrayList<CartaoDeCredito>();

    public ControladorCartaoDeCredito(ControladorPrincipal owner) {
        this.owner = owner;
        addCartoes();
    }

    public void addCartoes() {
        CartaoDeCredito cartao = new CartaoDeCredito(1234567890);
        cartoes.add(cartao);
    }

    public boolean autorizaCartao() {
        int random = (int) Math.floor(Math.random() * 10);
        if (random % 2 == 0) {
            System.out.println(random);
            return true;
        }
        System.out.println(random);
        return false;
    }

    public boolean confereCartao(long numero) {
        for (CartaoDeCredito cartao : cartoes) {
            if (cartao.getNumero() == numero && autorizaCartao() == true) {
                ControladorPrincipal.getInstance().getCtrlPagamento().getTelaPagamento().showMenssagePagamento();
                ControladorPrincipal.getInstance().getCtrlPagamento().getTelaPagamento().setVisible(false);
                ControladorPrincipal.getInstance().getCtrlPedido().getTelaCompra().setVisible(false);
                ControladorPrincipal.getInstance().getCtrlPagamento().imprimeNotaFiscal();
                return true;
            }
        }
        ControladorPrincipal.getInstance().getCtrlPagamento().getTelaPagamento().showMenssageCartao();
        return false;
    }
}
