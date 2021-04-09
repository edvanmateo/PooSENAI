/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividades;



public class Motorista {
   private String nome;
   private int anoNascimento;
   private char tipoCNH;
   
   public Motorista (String nome, int anoNascimento ){
       this.nome = nome;
       this.anoNascimento = anoNascimento;
       this.tipoCNH = '-';
   }
  
   
    public String getNome(){
        return this.nome;
        
   }
   
   public int getAnoNascimento(){
       return this.anoNascimento;
   }
   
   public char getTipoCnh(){
      return Character.toUpperCase(this.tipoCNH);
     
   }
   
   public void setTipoCNH(char tipo){
       if (Character.toUpperCase(tipo) == 'A' || Character.toUpperCase(tipo) == 'B' || Character.toUpperCase(tipo)== 'C') {
       this.tipoCNH = tipo;
       }
           
       
       
        
       
   }
  
}
