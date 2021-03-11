/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividadederevisao02;

import java.util.Scanner;

/**
 *
 * @author edpac
 */
public class Questao02 {
    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        int num[] = new int[4];
        int menor;
        
        System.out.println("Informe o número 1");
        menor = leitor.nextInt();
        int posicao = 1;
        
        for (int i = 0; i<4; i++){
            
            System.out.println("Informe o numero " + (i+2));
            num[i] = leitor.nextInt();
            if (num[i] < menor){
                menor = num[i];
                posicao = i+2;
            }
        }
        System.out.println("O " + posicao + "º número digitado foi o menor: " + menor);
        
    }
    
   
    
    
    
    
}
