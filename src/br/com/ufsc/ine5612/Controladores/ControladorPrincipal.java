/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ufsc.ine5612.Controladores;

import br.com.ufsc.ine5612.GerenciadorDePagamento.ControladorCartaoDeCredito;
import br.com.ufsc.ine5612.GerenciadorDeCompras.ControladorPedido;
import br.com.ufsc.ine5612.GerenciadorDeCompras.ControladorNotaFiscal;
import br.com.ufsc.ine5612.GerenciadorDePagamento.ControladorPagamento;
import br.com.ufsc.ine5612.GerenciadorDeProdutos.ControladorProduto;
import br.com.ufsc.ine5612.GerenciadorDeProdutos.Produto;
import br.com.ufsc.ine5612.Interface.TelaPrincipal;

/**
 *
 * @author Alexandre
 */
public class ControladorPrincipal {

    private static ControladorPrincipal singleInstance;

    protected ControladorCartaoDeCredito ctrlCartaoDeCredito;
    protected ControladorFuncionario ctrlFuncionario;
    protected ControladorNotaFiscal ctrlNotaFiscal;
    protected ControladorPagamento ctrlPagamento;
    protected ControladorPedido ctrlPedido;
    protected ControladorProduto ctrlProduto;
    protected TelaPrincipal telaPrincipal;

    private ControladorPrincipal() {
        this.ctrlCartaoDeCredito = new ControladorCartaoDeCredito(this);
        this.ctrlFuncionario = new ControladorFuncionario(this);
        this.ctrlNotaFiscal = new ControladorNotaFiscal(this);
        this.ctrlPagamento = new ControladorPagamento(this);
        this.ctrlPedido = new ControladorPedido(this);
        this.ctrlProduto = new ControladorProduto(this);
        this.telaPrincipal = new TelaPrincipal();
    }

    public static ControladorPrincipal getInstance() {
        if (singleInstance == null) {
            singleInstance = new ControladorPrincipal();
        }
        return singleInstance;
    }

    public ControladorCartaoDeCredito getCtrlCartaoDeCredito() {
        return ctrlCartaoDeCredito;
    }

    public ControladorFuncionario getCtrlFuncionario() {
        return ctrlFuncionario;
    }

    public ControladorNotaFiscal getCtrlNotaFiscal() {
        return ctrlNotaFiscal;
    }

    public ControladorPagamento getCtrlPagamento() {
        return ctrlPagamento;
    }

    public ControladorPedido getCtrlPedido() {
        return ctrlPedido;
    }

    public ControladorProduto getCtrlProduto() {
        return ctrlProduto;
    }

    public void encontreProduto(int codigo) {
        Produto produto = getCtrlPedido().encontrarProduto(codigo);
    }

    public TelaPrincipal getTelaPrincipal() {
        return telaPrincipal;
    }

    public boolean confereFuncionario(int senha) {
        return getCtrlFuncionario().confereFuncionario(senha);
//        if(resposta == true){ 
//            getCtrlPedido().getTelaCancelaCompra().showCompraCancelada();
//            getTelaPrincipal();
//        }
    }
//    
//    public void adicionaProduto() {
//        Object[] linha = new Object[]{produto.getNome(), Integer.valueOf(produto.getCodigo()), Float.valueOf(produto.getPreco())};
//        DefaultTableModel model = (DefaultTableModel) getCtrlPedido().getTelaCompra()..getModel();
//        model.addRow(linha);
//        ControladorPrincipal.getInstance().getCtrlPedido().getProdutos().add(produto);
//    }

    public void excluirProduto(int codigo) {
        Produto produto = getCtrlPedido().encontrarProduto(codigo);
        getCtrlPedido().getProdutos().remove(produto);
    }

    public void conferePagamento(long numero) {
        getCtrlCartaoDeCredito().confereCartao(numero);
    }
}
