/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lojaderoupa.dao;

import javax.swing.JOptionPane;
import lojaderoupa.dao.Conexao;
import lojaderoupa.model.Cliente;

/**
 *
 * @author silvi
 */
public class CliDAO{
        public void Incluir(Cliente cli){
        String sql =  "INSERT INTO Cliente (nomeCliente, emailCliente, CPF, endereco) VALUES ( "
                    + " '" + cli.getNomeCliente()+   "' ,  "
                    + " '" + cli.getEmailCliente() +  "' ,  "
                    + " '" + cli.getCPF() +"' , "
                    + " '" + cli.getEndereco() +"'  ) ";
        System.out.println(sql);
        Conexao.executar( sql );
        JOptionPane.showMessageDialog(null, "Registro incluido com sucesso!!!");
    }
    
}
