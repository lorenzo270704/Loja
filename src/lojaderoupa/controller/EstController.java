/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lojaderoupa.controller;

import lojaderoupa.model.Produto;

/**
 *
 * @author 66211020764
 */
public class EstController {
   public void Cadastrar(String nomeProd, String TamanhoProd, String valorUnit, String Categoria) {
       if(!nomeProd.equals("")&&!TamanhoProd.equals("")&&!valorUnit.equals("")&&!Categoria.equals(""))
        {
            Produto prod = new Produto();
            prod.Cadastrar(prod);
        }
    }

    public Produto Excluir(String nomeProd) {
        Produto prod = new Produto();
        prod.Excluir(nomeProd);
    }
//Ver porque parametros não
    public void Alterar(String nomeProd, String TamanhoProd, String valorUnit, String Categoria) {
         if(!nomeProd.equals("")&&!TamanhoProd.equals("")&&!valorUnit.equals("")&&!Categoria.equals(""))
        {
//            Produto prod = new Produto(NomeProd, TamanhoProd, valorUnit, Categoria);
//            prod.Alterar(prod);
        }
    }

    public void Consultar(String nomeProd) {
       Produto prod = new Produto();
       prod.Consultar(nomeProd);
    }  
}
