/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lojaderoupa.dao;

import javax.swing.JOptionPane;
import lojaderoupa.dao.Conexao;
import lojaderoupa.model.Pedido;

/**
 *
 * @author silvi
 */
public class PedDAO {
    
        public void Incluir(Pedido ped) {
        String sql =  "INSERT INTO Pedido (nomeCliente, CPF, endereco, produto, tamanho, ValorTotal) VALUES ( "
                    + " '" + ped.getCliente().getNomeCliente()+   "' ,  "
                    + " '" + ped.getCliente().getCPF()+   "' ,  "
                    + " '" + ped.getCliente().getEndereco()+   "' ,  "
                    + " '" + ped.getProduto()+   "' ,  "
                    + " '" + ped.getValorTot()+   "' ,  "
                    + " '" + ped.getPagamento()+"'  ) ";
        System.out.println(sql);
        Conexao.executar( sql );
        JOptionPane.showMessageDialog(null, "Registro incluido com sucesso!!!");  
    }
   
}
