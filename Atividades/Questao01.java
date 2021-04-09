/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividadederevisao02;

import java.util.Scanner;
public class Questao01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        float vet[];
        vet = new float[3];
        float soma = 0;
       
       for (int i=0; i<3; i++){
       
           System.out.println("Informe a nota" + (i+1));
           Scanner leitor = new Scanner(System.in);
           vet[i]= leitor.nextFloat();
           
           soma= soma + vet[i];
       }
       
       
       float media= soma/3;
       
       if (media>= 9){
           System.out.println("Aprovado com média" + media +" conceito A");
      
       }else if (media >=8){
                System.out.println("Aprovado com média" + media +" conceito B");
       }    else if(media >=7){
                    System.out.println("Aprovado com média" + media +" conceito C");
                }else if (media >=6) {
                            System.out.println("Reprovado com média" + media +" conceito D");
                        }else {
                            System.out.println("Reprovado com média" + media +" conceito F");
                        }         
       
       
    }
    
}
