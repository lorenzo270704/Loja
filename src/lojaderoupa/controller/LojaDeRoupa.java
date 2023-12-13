/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//joao
package lojaderoupa.controller;

import javax.swing.JFrame;
import lojaderoupa.view.LojaRoupa;

/**
 *
 * @author 182200155
 */
public class LojaDeRoupa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LojaRoupa l = new LojaRoupa();
        l.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        l.setSize(569, 589);
        l.setVisible(true);

    }
    
}
