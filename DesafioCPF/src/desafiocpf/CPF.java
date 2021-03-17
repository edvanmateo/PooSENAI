/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desafiocpf;


import java.util.Scanner;

public class CPF {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe os 9 primeiros dígitos do CPF (apenas números): ");
        String digitos = teclado.next();
        int[] cpf = converterStringParaVetorInt(digitos);

       
        
        ////////////////////////////////////////////////////////////////
            int controle = 10;
            int decimoDigito = 0, decPrimeiroDigito = 0;
            
        for (int i =0; i<11; i++){ // Descobrindo o décimo dígito
            decimoDigito += (controle*cpf[i]);
            controle-=1;
        }
        
        int resto = decimoDigito % 11;
        
        if (resto == 1 || resto ==0){
            cpf[9]= 0;
        }else{
            cpf[9]= 11-resto;
        }
        
        controle =10; 
        
        for (int i =1; i<10; i++){  //Descobrindo décimo primeiro dígito.
            decPrimeiroDigito += (controle*cpf[i]);
            controle-=1;
        }
        
         resto = decPrimeiroDigito % 11;
        
        if (resto == 1 || resto ==0){
            cpf[10]= 0;
        }else{
            cpf[10]= 11-resto;
        }
      //////////////////////////////////////////////////////////////////////////  
        
      
        System.out.println("CPF completo: " + converterVetorIntParaString(cpf));
    }
    
    // Esta função converte o CPF (os 9 dígitos informados na entrada) de String para um vetor de int
    // Também insere dois 0 no fim, para completar os 11 dí­gitos de um CPF
    // Ex.: "963852741" vira [9, 6, 3, 8, 5, 2, 7, 4, 1, 0, 0]
    static int[] converterStringParaVetorInt(String cpfString) {
        int[] cpfNumerico = new int[11];
        for (int i = 0; i < cpfString.length(); i++) {
            cpfNumerico[i] = Character.getNumericValue(cpfString.charAt(i));
        }
        return cpfNumerico;
    }
    
    // Esta função converte o CPF de vetor de int (usado nos cálculos) para String
    // Ex.: [9, 6, 3, 8, 5, 2, 7, 4, 1, 2, 8] vira "96385274128"
    static String converterVetorIntParaString(int[] cpfNumerico) {
        String cpfString = "";
        for (int i = 0; i < cpfNumerico.length; i++) {
            cpfString += Integer.toString(cpfNumerico[i]);
        }
        return cpfString;
    }

}