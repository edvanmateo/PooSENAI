
package atividade;

public class Circulo {
  private double raio;
  private static double pi;
  
  
  public Circulo (double raio){
      this.raio = raio;
  }
    
  public double getArea(){
    return pi* (Math.pow(raio,2)); 
  }
   
  public double getCircunferencia(){
       return 2*pi*raio;
    }
    
    public static void setPi(double pi){
        Circulo.pi = pi;
    }
}
