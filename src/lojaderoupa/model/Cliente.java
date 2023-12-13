/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lojaderoupa.model;

import lojaderoupa.dao.CliDAO;

/**
 *
 * @author 182200155
 */
public class Cliente {
    private int idCliente;
    static String nomeCliente;
    static String emailCliente;
    private String CPF;
    private String endereco;

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getEmailCliente() {
        return emailCliente;
    }

    public void setEmailCliente(String emailCliente) {
        this.emailCliente = emailCliente;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    
    public Cliente() {
    }
    
    public Cliente (String nomeCliente, String emailCliente, String CPF, String endereco){
        this.nomeCliente = nomeCliente;
        this.emailCliente = emailCliente;
        this.CPF = CPF;
        this.endereco = endereco;   
    }
    
    public Cliente (int id, String nomeCliente, String emailCliente, String CPF, String endereco){
        this.idCliente = id;
        this.nomeCliente = nomeCliente;
        this.emailCliente = emailCliente;
        this.CPF = CPF;
        this.endereco = endereco;
    }
    
     public void Incluir(Cliente cli) {
       CliDAO cDAO = new CliDAO();
        cDAO.Incluir(cli);
    }
    
   
    
}
