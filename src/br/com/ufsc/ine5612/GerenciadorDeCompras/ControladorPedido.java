/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ufsc.ine5612.GerenciadorDeCompras;

import br.com.ufsc.ine5612.Controladores.ControladorPrincipal;
import br.com.ufsc.ine5612.GerenciadorDeProdutos.Produto;
import br.com.ufsc.ine5612.Interface.TelaCancelaCompra;
import br.com.ufsc.ine5612.Interface.TelaCompra;
import java.util.ArrayList;
import java.util.Optional;

/**
 *
 * @author Alexandre
 */
public class ControladorPedido {

    protected ControladorPrincipal owner;
    protected ArrayList<Produto> produtos = new ArrayList<Produto>();
    protected ArrayList<Pedido> pedidos = new ArrayList<Pedido>();
    protected TelaCompra telaCompra;
    protected TelaCancelaCompra telaCancelaCompra;
    protected float valorTotal;

    public ControladorPedido(ControladorPrincipal owner) {
        this.owner = owner;
        this.telaCompra = new TelaCompra();
        this.telaCancelaCompra = new TelaCancelaCompra();
    }

    public float getValorTotal() {
        return valorTotal;
    }

    public void somaValorTotal(float valor) {
        this.valorTotal += valor;
    }

    public ControladorPrincipal getOwner() {
        return owner;
    }

    public TelaCompra getTelaCompra() {
        return telaCompra;
    }

    public Produto encontrarProduto(final int codigo) {
        ArrayList<Produto> produtos = ControladorPrincipal.getInstance().getCtrlProduto().getProdutos();
        Optional<Produto> optional = produtos.stream().filter((elemento) -> elemento.getCodigo() == codigo).findAny();
        if (optional.isPresent()) {
            this.getTelaCompra().adicionaProduto(optional.get());
            this.getTelaCompra().setCampo_jTextField1("");
            return optional.get();
        } else {
            this.getTelaCompra().showProdutoNaoEncontrado();
        }

//        for (Produto produto : produtos) {
//            if (produto.getCodigo() == codigo) {
//                return produto;
//            }
//        }
        //System.out.println(codigo);
        //System.out.println(produtos);
        //JOptionPane.showMessageDialog(null, "Produto não encontrado");
        return null;
    }

    public ArrayList<Produto> getProdutos() {
        return produtos;
    }

    public TelaCancelaCompra getTelaCancelaCompra() {
        return telaCancelaCompra;
    }

//    public void instanciaPedido(Pedido pedido) {
//        pedidos.add(pedido)
//    }
}
