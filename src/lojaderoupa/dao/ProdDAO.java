/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lojaderoupa.dao;

import static com.sun.org.glassfish.external.amx.AMXUtil.prop;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import lojaderoupa.model.Produto;

/**
 *
 * @author 66211020764
 */
public class ProdDAO {

    public void Cadastrar(Produto prod) {
        String sql =  "INSERT INTO Produto (nomeProd, TamanhoProd, valorUnit, Categoria) VALUES ( "
                    + " '" + prod.getNomeProd()+   "' ,  "
                    + " '" + prod.getTamanhoProd()+   "' ,  "
                    + " '" + prod.getValorUnit()+   "' ,  "
                    + " '" + prod.getCategoria().getDescricao() +"'  ) ";
        System.out.println(sql);
        Conexao.executar( sql );
        JOptionPane.showMessageDialog(null, "Produto incluido com sucesso!");  
    }

    public void Consultar(String nomeProd) {
        Produto prod = null;
        String sql = "SELECT * FROM Produto WHERE nomeProd = '"+ nomeProd+"';";
       // System.out.println(sql);
        
        ResultSet rs = Conexao.consultar( sql );
        int id =0;
        String NomeProd="";
        String TamanhoProd="";
        String valorUnit="";
//        int Categoria_idCategoria =0;
        if( rs != null){
            try{
                if (rs.next()) {  
                    id = rs.getInt( 1 );
                    NomeProd = rs.getString( 2 );
                    TamanhoProd = rs.getString( 3 );
                    valorUnit = rs.getString( 4 );
 //                   Categoria_idCategoria = rs.getInt(5)
 //                   prod = new Produto(id,NomeProd, TamanhoProd, valorUnit);
                }
                    
            }catch(Exception e){
                System.out.println("==>" + e);
            }
        }
//        return prod;
    }

    public void Alterar(Produto prod) {
        String sql =  "UPDATE Produto SET "
                + " NomeProd = '" + prod.getNomeProd()+   "' ,  "
                + " TamanhoProd  = '" + prod.getTamanhoProd() +  "' ,  "
                + " valorUnit = '" + prod.getValorUnit() +"' , "
                + " Categoria_idCategoria = '"+ prod.getCategoria().getDescricao() +"'  "
                + " WHERE idProduto = "+ prod.getIdProduto()+" ;";
        System.out.println(sql);
        Conexao.executar( sql );
        JOptionPane.showMessageDialog(null, "Produto alterado com sucesso!!!");

    }

    public void Excluir(String nomeProd) {
        String sql =  "DELETE from Produto WHERE NomeProd = '"+nomeProd+"' ;";
        System.out.println(sql);
        Conexao.executar( sql );
        JOptionPane.showMessageDialog(null, "Produto excluído com sucesso!!!");
    }
    
    
    
}
