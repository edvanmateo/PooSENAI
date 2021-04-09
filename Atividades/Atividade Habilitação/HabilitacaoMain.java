
package atividades;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;


public class HabilitacaoMain {

    
    public static void main(String[] args) {
        
        int x =1;
        while (x ==1){
        
            System.out.println("\t\t\t----SIATEMA DE CNH----");
            System.out.println("Por favor, Informe seu nome");
            Scanner leitor = new Scanner(System.in);
            String nome = leitor.nextLine();
            System.out.println("Por favor, Informe o ano do seu nascimento");
            int anoNascimento = leitor.nextInt();
            Calendar cal = GregorianCalendar.getInstance();


            if(   (cal.get(Calendar.YEAR) - anoNascimento) >= 18){

                Motorista m1 = new Motorista(nome, anoNascimento);
                System.out.println("Por favor, Informe a categoria desejada:  A - B ou Z ?");
                m1.setTipoCNH(leitor.next().charAt(0)); 
                
                System.out.println("NOME:" + m1.getNome());
                System.out.println("ANO DE NASCIMENTO:" + m1.getAnoNascimento());
                System.out.println("TIPO DE CNH:" +  m1.getTipoCnh());
                
                 System.out.println("DESEJA CONTINUAR\n"
                        + "1 - SIM \t 2 - NÃO");
                  x = leitor.nextInt();
            }else{

                System.out.println("Você ainda não tem idade para dirigir");
                System.out.println("DESEJA CONTINUAR\n"
                        + "1 - SIM \t 2 - NÃO");
                x = leitor.nextInt();

            }
        }
    
    }
}
        
            
        
        
       
        
        
       
