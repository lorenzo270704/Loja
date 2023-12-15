/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lojaderoupa.controller;

import javax.swing.JOptionPane;
import lojaderoupa.model.Cliente;
import lojaderoupa.model.Pedido;
import lojaderoupa.model.Produto;

/**
 *
 * @author silvi
 */
public class PedController {
    
    public void Incluir (Cliente cliente, Produto produto,double valorTot, String pagamento){
        
          if(!cliente.equals("")&&!produto.equals("")&&!valorTot.equals("")&&!pagamento.equals(""))
        {
            Pedido ped = new Pedido(cliente, produto, valorTot, pagamento);
            ped.Incluir(ped);
        }
        else{
            JOptionPane.showMessageDialog(null, "Preencha os campos");       
    
    }
    }  
    
}
