
package atividade;


public class Quadrado {
    private double lado;
    private static double diag;
    
    
    public Quadrado(double lado){
    this.lado = lado;
}
    
    public double getArea(){
        return (lado*lado);
    }
    
    public double getPerimetro(){
        return lado*4;
    }
    
    public double getDiagonal(){
        return lado*diag;
    }
    
    public static void setDiag(double diag){
          Quadrado.diag = diag; 
    }
}





