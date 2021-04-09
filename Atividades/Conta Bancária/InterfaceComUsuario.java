
package contabancaria;

import java.util.Scanner;

public class InterfaceComUsuario {
    public static void main(String[] args) {
        
        
       ContaBancaria conta1 = new ContaBancaria();
        
       
        Scanner leitor = new Scanner(System.in);
        int opcao = 5;
        
        float valorS=0;
        
        System.out.println("Caro cliente por favor Informe seu nome");
        conta1.setNomeTitular(leitor.next());
        System.out.println("Por favor, informe a agência");
        conta1.setNumAgencia(leitor.next());
        System.out.println("Por favor, informe a conta");
        conta1.setNumConta(leitor.next());
        
        System.out.println("\n\t\t\tSeja bem vindo(a)," + conta1.getNomeTitular()+ "!\n");
        
        while (opcao >4 || opcao <0){
        
            System.out.println("\t\t ESCOLHA UMA DAS SEGUINTES OPÇÕES ABAIXO:");
            System.out.println("\n\n1 - SALDO \t 2 - SAQUE \t 3 - DEPOSITO \t 4 - RELATÓRIO 0 - SAIR");
            opcao = leitor.nextInt();
            if (opcao <0 || opcao >4){
                System.out.println("\n\t\tOpcão Inválida. Por favor, tente novamente.\n"); 
            }                
        }
       
        while (opcao >=1 && opcao <5){
            
            
            
            switch (opcao){
                
                case 0 -> {
                    System.exit(0);
                }
                case 1 -> System.out.println("Seu saldo é de R$=" + conta1.getSaldo());
            
                case 2 -> {
                    int x = 0;
                    while ( x==0){
                        System.out.println("Por favor, informe o valor que deseja sacar");
                        float valor= leitor.nextFloat();
                        if (conta1.getSaldo() >= valor && conta1.getSaldo() > 0){
                            conta1.sacar(valor);
                            
                            valorS+=valor;
                            x=1;
                        }else{
                        System.out.println("Saldo insuficiciente.");
                        }
                    }
                }
                
                case 3 -> {
                    System.out.println("Por favor, informe o valor que deseja depositar");
                    conta1.depositar(leitor.nextFloat());
                    
                }
                
                case 4 ->{
                    conta1.imprimir(valorS);
                }
                
            }
            
            opcao = -1;
            while (opcao >4 || opcao <0){
        
                System.out.println("\t\t ESCOLHA UMA DAS SEGUINTES OPÇÕES ABAIXO:");
                System.out.println("\n\n1 - SALDO \t 2 - SAQUE \t 3 - DEPOSITO\t 4 - RELATÓRIO\t 0 - SAIR");
                opcao = leitor.nextInt();
                if (opcao <0 || opcao >4){
                    System.out.println("\n\t\tOpcão Inválida. Por favor, tente novamente.\n"); 
                }                
            }
            
        }
    }
}

