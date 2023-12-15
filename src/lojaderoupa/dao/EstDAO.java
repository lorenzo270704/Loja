/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lojaderoupa.dao;

import java.sql.ResultSet;
import javax.swing.JOptionPane;
import lojaderoupa.model.Estoque;
import lojaderoupa.model.Produto;

/**
 *
 * @author 66211020764
 */
public class EstDAO {
    
    public void Cadastrar(Estoque est) {
    String sql =  "INSERT INTO Estoque (Produto, quantidadeEst) VALUES ( "
                    + " '" + est.getProduto().getNomeProd()+   "' ,  "
                    + " '" + est.getQuantidadeEst()+   "'  ) ";
        System.out.println(sql);
        Conexao.executar( sql );
        JOptionPane.showMessageDialog(null, "Produto incluido com sucesso!");      

    }

    public Estoque Consultar(String nomeProd) {
        Estoque est = null;
        String sql = "SELECT * FROM Estoque WHERE NomeProd = '"+ nomeProd+"';";
       // System.out.println(sql);
        
        ResultSet rs = Conexao.consultar( sql );
        int idEstoque =0;
        String NomeProd="";
        String Produto_idProduto="";
        String QuantidadeEst="";
//        int Categoria_idCategoria =0;
        String Produto_Categoria_idCategoria="";
        if( rs != null){
            try{
                if (rs.next()) {  
                    idEstoque = rs.getInt( 1 );
                    QuantidadeEst = rs.getString(2);
                    Produto_idProduto = rs.getString( 3 );
                    Produto_Categoria_idCategoria = rs.getString( 4 );
 //                 Categoria_idCategoria = rs.getInt(5)
 //                 prod = new Produto(id,NomeProd, TamanhoProd, valorUnit);
                }
                    
            }catch(Exception e){
                System.out.println("==>" + e);
            }
        }
        return est;
    }

    public void Alterar(Estoque est) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void Excluir(Estoque est) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
