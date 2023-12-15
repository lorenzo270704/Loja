/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lojaderoupa.model;

import lojaderoupa.dao.EstDAO;
import lojaderoupa.dao.ProdDAO;

/**
 *
 * @author 66211020764
 */
public class Estoque {
    private int idEstoque;
    private String quantidadeEst;
    static Produto produto;
    static Categoria categoria;

    public int getIdEstoque() {
        return idEstoque;
    }

    public void setIdEstoque(int idEstoque) {
        this.idEstoque = idEstoque;
    }

    public String getQuantidadeEst() {
        return quantidadeEst;
    }

    public void setQuantidadeEst(String quantidadeEst) {
        this.quantidadeEst = quantidadeEst;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Estoque(int idEstoque, String quantidadeEst, Produto produto, Categoria categoria) {
        this.idEstoque = idEstoque;
        this.quantidadeEst = quantidadeEst;
        this.produto = produto;
        this.categoria = categoria;
    }
    
    public Estoque(String quantidadeEst, Produto produto, Categoria categoria){
        this.quantidadeEst = quantidadeEst;
        this.categoria = categoria;
        Produto p = new Produto();
        
    }
    public void Cadastrar(Estoque est) {
       EstDAO eDAO = new EstDAO();
       eDAO.Cadastrar(est);
    }
    
    public Estoque Consultar(String nomeProd) {
     EstDAO eDAO = new EstDAO();
      return eDAO.Consultar(nomeProd);
   }

        public void Alterar(Estoque est) {
        EstDAO eDAO = new EstDAO();
        eDAO.Alterar(est);
    }

    public void Excluir(Estoque est) {
        EstDAO eDAO = new EstDAO();
        eDAO.Excluir(est);
    }
}
