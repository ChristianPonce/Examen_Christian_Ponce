
package Clases;


public class PruebaCuadrilátero {
    
    public static void main(String[] args){
        System.out.println("Cálculo de área y perímetro del Rectángulo (Base=5, Altura=6)");
        ClaseCuadrilatero obj2=new ClaseCuadrilatero(5,6);
        System.out.println("El área del rectángulo es: "+obj2.area());
        ClaseCuadrilatero obj3=new ClaseCuadrilatero(5,6);
        System.out.println("El perímetro del rectángulo es: "+obj3.perimetro());
    }
}
