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
    private double valorTot;
    private String pagamento;
    
    
    

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

    public double getValorTot() {
        return valorTot;
    }

    public void setValorTot(double valorTot) {
        this.valorTot = valorTot;
    }
    
    public Pedido(){
        
    }
    
   
    public Pedido(Cliente cliente, Produto produto,double valorTot, String pagamento){
        this.cliente = cliente;
        this.produto = produto;
        this.valorTot = valorTot;
        this.pagamento = pagamento;
        
    }
     public Pedido(int id,Cliente cliente, Produto produto,double valorTot ){
        this.idPedido = id;
        this.cliente = cliente;
        this.produto = produto;
        this.valorTot = valorTot;
        this.pagamento = pagamento;
        
    }
      public void Incluir(Pedido ped) {
       PedDAO pDAO = new PedDAO();
        pDAO.Incluir(ped);
    }

  
}
