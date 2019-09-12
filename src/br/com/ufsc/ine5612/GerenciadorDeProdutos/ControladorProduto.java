/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ufsc.ine5612.GerenciadorDeProdutos;

import br.com.ufsc.ine5612.Controladores.ControladorPrincipal;
import java.util.ArrayList;

/**
 *
 * @author Alexandre
 */
public class ControladorProduto {

    protected ControladorPrincipal owner;
    protected Produto produto;
    protected ArrayList<Produto> produtos = new ArrayList<Produto>();

    public ControladorProduto(ControladorPrincipal owner) {
        this.owner = owner;
        addProdutos();
    }

    public ArrayList<Produto> getProdutos() {
        return produtos;
    }

    public void addProdutos() {
        Produto produto1 = new Produto("Sabão", 3.50F, 111);
        Produto produto2 = new Produto("Detergente", 1.99F, 222);
        Produto produto3 = new Produto("Esponja", 1.50F, 333);
        Produto produto4 = new Produto("Pão", 9.99F, 444);
        Produto produto5 = new Produto("Feijão", 9.00F, 555);
        Produto produto6 = new Produto("Arroz", 9.00F, 666);
        Produto produto7 = new Produto("Macarrão", 4.00F, 777);
        Produto produto8 = new Produto("Lentilha", 4.00F, 888);
        Produto produto9 = new Produto("Bolacha", 3.00F, 999);

        produtos.add(produto1);
        produtos.add(produto2);
        produtos.add(produto3);
        produtos.add(produto4);
        produtos.add(produto5);
        produtos.add(produto6);
        produtos.add(produto7);
        produtos.add(produto8);
        produtos.add(produto9);
    }
}
