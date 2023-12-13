/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lojaderoupa.model;

import lojaderoupa.dao.CliDAO;
import lojaderoupa.dao.PedDAO;
import lojaderoupa.model.Produto;

/**
 *
 * @author 182200155
 */
    public class Pedido{
    private int idPedido;
    static Cliente cliente;
    static Produto produto;
    private float valorTotal;
    private String formaPagamento;
    
    
    
//lo
    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public float getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }
    
    public Pedido(){
        
    }
    
   
    public Pedido(Cliente cliente, Produto produto,float valorTotal ){
        //this.cliente = cliente;
        //this.produto = produto;
        //Cliente cliente = new Cliente();
        cliente.setNomeCliente(formaPagamento);
        cliente.setCPF(formaPagamento);
        
        this.valorTotal = valorTotal;
        
    }
     public Pedido(int id,Cliente cliente, Produto produto,float valorTotal ){
        this.idPedido = id;
        this.cliente = cliente;
        this.produto = produto;
        this.valorTotal = valorTotal;
        
    }
      public void Incluir(Pedido ped) {
       PedDAO pDAO = new PedDAO();
        pDAO.Incluir(ped);
    }

  
}
