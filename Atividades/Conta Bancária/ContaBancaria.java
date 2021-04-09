
package contabancaria;

public class ContaBancaria {
  private String numAgencia;
  private String numConta;
  private String nomeTitular;
  private float saldo;
 
 
    
 
    
    
    // get e set da Agência
    public void setNumAgencia(String numAgencia){ 
        this.numAgencia= numAgencia;
    }
    
    public String getNumAgencia(){
        return numAgencia;
    }
    
    
    // get e set do número da conta
    public void setNumConta(String numConta){
        this.numConta= numConta;
    }
    
    public String getNumConta(){
        return numConta;
    }
    
    
    
     float acumuloDeposito =0;                
    // método para depositar
    public void depositar(float valor){
        if (valor > 0 ){
            this.saldo+=valor;
            acumuloDeposito+=valor;
        }
    }
      public float getDepositar(){
        return acumuloDeposito;
} 
             
    // método para sacar
    public void sacar(float valor){
        saldo-=valor;
    }
    
    
    // método para pegar o saldo
    public float getSaldo(){
        return saldo;
    }
    
    // método para setar nome do usuário
    public void setNomeTitular (String nomeTitular){
        this.nomeTitular = nomeTitular;
    }
    
    // método para retornar nome do titular
    public String getNomeTitular(){
        return nomeTitular;
    }
    
    
   public void imprimir( float valorS){
       
       float acumuloSaque=0;
       
       acumuloSaque+=valorS;
       
       System.out.println("Nome do titular - "+ this.nomeTitular);
       System.out.println("Agencia nº - " +this.numAgencia);
       System.out.println("Conta nº -" +this.numConta);
       System.out.println("Você depositou R$ ="+ acumuloDeposito);
       System.out.println("Você sacou R$ = "+ acumuloSaque);
       System.out.println("Seu saldo é de R$="+ this.saldo );
   }
    
    
    
    
}
