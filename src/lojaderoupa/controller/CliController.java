/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lojaderoupa.controller;

import lojaderoupa.model.Cliente;

/**
 *
 * @author 182200155
 */
public class CliController {
    
    public boolean Incluir(String nomeCliente, String emailCliente, String CPF, String endereco) {
        //Fazer validações
        if(nomeCliente != null && nomeCliente.length() > 0 && emailCliente!= null && emailCliente.length() > 0 && CPF != null && CPF.length() > 0 && endereco != null && endereco.length() >0){
            Cliente cli = new Cliente(nomeCliente,emailCliente,CPF,endereco);
            cli.Incluir(cli);
            return true;
        }
        return false;
    }
    
    public boolean validarCPF (String CPF){
        for (int i = 0; i <CPF.length(); i++){
            if (!Character.isDigit(CPF.charAt(i))){
                if(!( i==3 || i==7 || i==11))
                    return false;
            }
        }
        return true;
    }
    
}
