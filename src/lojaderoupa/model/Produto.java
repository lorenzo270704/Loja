/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lojaderoupa.model;

import java.sql.ResultSet;
import java.util.ArrayList;
import lojaderoupa.dao.Conexao;
import lojaderoupa.dao.ProdDAO;

/**
 *
 * @author silvi
 */
public class Produto {
    private int idProduto;
    private String nomeProd;
    private String TamanhoProd;
    private double valorUnit;
    private Categoria Categoria;
    private ArrayList<Pedido> pedido;


    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public String getNomeProd() {
        return nomeProd;
    }

    public void setNomeProd(String nomeProd) {
        this.nomeProd = nomeProd;
    }

    public String getTamanhoProd() {
        return TamanhoProd;
    }

    public void setTamanhoProd(String TamanhoProd) {
        this.TamanhoProd = TamanhoProd;
    }

    public double getValorUnit() {
        return valorUnit;
    }

    public void setValorUnit(double valorUnit) {
        this.valorUnit = valorUnit;
    }

    public Categoria getCategoria() {
        return Categoria;
    }

    public void setCategoria(Categoria Categoria) {
        this.Categoria = Categoria;
    }
    

    public Produto(String nomeProd, String TamanhoProd, double valorUnit, Categoria Categoria) {
        this.nomeProd = nomeProd;
        this.TamanhoProd = TamanhoProd;
        this.valorUnit = valorUnit;
        this.Categoria = Categoria;
    }

    public Produto(int idProduto, String nomeProd, String TamanhoProd, double valorUnit, Categoria Categoria) {
        this.idProduto = idProduto;
        this.nomeProd = nomeProd;
        this.TamanhoProd = TamanhoProd;
        this.valorUnit = valorUnit;
        this.Categoria = Categoria;
    }

    public Produto() {
    }
    
    public void Cadastrar(Produto prod) {
     ProdDAO prDAO = new ProdDAO();
      prDAO.Cadastrar(prod);
    }
    
 //   public void Produto Consultar(String nomeProd) {
 //       ProdDAO pDAO = new ProdDAO();
 //       return pDAO.Consultar(nomeProd);
 //   }

    public void Alterar(Produto prod) {
        ProdDAO prDAO = new ProdDAO();
        prDAO.Alterar(prod);
    }

    public void Excluir(Produto prod) {
        ProdDAO prDAO = new ProdDAO();
        prDAO.Excluir(nomeProd);
    }
    
    public static ArrayList<Pedido> getPedidos(){
        ArrayList<Pedido> lista = new ArrayList<>();
        String sql = "SELECT idPedido, Cliente_idCliente, ValorTot, Pagamento FROM Pedido ORDER BY idPedido ";
        ResultSet rs = Conexao.consultar( sql );
        if(rs != null){
            try{
                while(rs.next() ){
                    String titulo = rs.getString(2);
                    String genero = rs.getString(3);
                    String anoPubli = rs.getString(4);
                    String elenco = rs.getString(5);
                    String diretor = rs.getString(6);
                    String duracao = rs.getString(7);
 //                   Filme fil = new Filme (titulo, genero, anoPubli, elenco, diretor, duracao);
                    fil.setIdfilme(rs.getInt("idfilme") );
                    lista.add( fil );
                }    
            }catch(Exception e){  
            }
        }
        return lista;
    }  


    
    
}
