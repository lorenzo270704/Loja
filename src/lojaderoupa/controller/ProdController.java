/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lojaderoupa.controller;

import javax.swing.JOptionPane;
import lojaderoupa.model.Categoria;
import lojaderoupa.model.Produto;

/**
 *
 * @author 66211020764
 */
public class ProdController {
    
    public void Cadastrar(String nomeProd, String TamanhoProd, String valorUnit, String Categoria) {
       if(!nomeProd.equals("")&&!TamanhoProd.equals("")&&!valorUnit.equals("")&&!Categoria.equals(""))
        {
            Produto prod = new Produto();
            prod.Cadastrar(prod);
        }
       else {
           JOptionPane.showMessageDialog(null, "Preencha os campos");
       }
    }

    public Produto Consultar(String nomeProd) {
       Produto prod = new Produto();
       return prod.Consultar(nomeProd);
    }

    public void Excluir(String nomeProd) {
        Produto prod = new Produto();
        prod.Excluir(nomeProd);
    }
//Ver com sor, se 'categoria' deve ser mencionada assim ou não
    public void Alterar(String nomeProd, String TamanhoProd, Double valorUnit, Categoria categoria) {
      if(!nomeProd.equals("")&&!TamanhoProd.equals("")&&!valorUnit.equals("")&&!categoria.equals(""))
        {
           Produto prod = new Produto(nomeProd, TamanhoProd, valorUnit,categoria);
           prod.Alterar(prod);
        }
    }
     
}
