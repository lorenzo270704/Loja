/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lojaderoupa.dao;

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
}
