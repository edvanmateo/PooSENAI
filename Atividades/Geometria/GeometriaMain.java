
package atividade;

import static java.lang.Math.sqrt;

/**
 *
 * @author edpac
 */
public class GeometriaMain {

    
    public static void main(String[] args) {
       
        Quadrado.setDiag(1.41);
        Quadrado Q1 = new Quadrado(2.5);
        
        System.out.println("\t\tQUADRADO COM DIAGONAL 1.41");
        System.out.printf("Área de Q1: %.3f cm² \n" , Q1.getArea());
        System.out.printf("Perímetro de Q1: %.3f cm\n", Q1.getPerimetro());
        System.out.printf("Diagonal de Q1: %.3f cm\n", Q1.getDiagonal());
        Quadrado.setDiag(sqrt(2));
        System.out.println("\n\t\tQUADRADO COM DIAGINAL DA CLASSE MATH");
        System.out.printf("Diagonal de Q1: %.3f cm\n", Q1.getDiagonal());
        
        Circulo.setPi(3.14);
        Circulo C1 = new Circulo(2.5);
        System.out.println("\n\t\tCÍRCULO COM PI 3.14");
        System.out.printf("Área de C1: %.3f cm² \n" , C1.getArea());
        System.out.printf("Circunferência de C1: %.3f cm \n" , C1.getCircunferencia());
        Circulo.setPi(Math.PI);
        System.out.println("\n\t\tCÍRCULO COM PI DA CLASSE MATH");
        System.out.printf("Área de C1: %.3f cm² \n" , C1.getArea());
        System.out.printf("Circunferência de C1: %.3f cm \n" , C1.getCircunferencia());
    }
    
}
