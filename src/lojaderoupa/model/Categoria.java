/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lojaderoupa.model;

/**
 *
 * @author 66211020764
 */
public enum Categoria {
   CAMISETA("Camiseta"),
   CROPPED("Cropped"),
   BERMUDA("Bermuda"),
   SHORT("Short"),
   SAIA("Saia"),
   VESTIDO("Vestido"),
   CALCA("Calça"),
   CASACO("Casaco"),
   MOLETOM("Moletom"),
   CUECA("Cueca"),
   PECAINTIMA("Peça intima"),
   ACESSORIO("Acessório");
   
   private String descricao;
   
   Categoria(String descricao){
       this.descricao = descricao;
   }
   
   public String getDescricao(){
       return descricao;
   }    
}
//teste branch