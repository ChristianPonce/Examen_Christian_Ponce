
package Clases;


public class PruebaCubo {
    
    public static void main(String[] args){
        
        System.out.println("Los valores a tomar son alto=2, ancho=3, profundo=6");
        
        ClaseCubo obj1=new ClaseCubo(2,3,6);
        
        System.out.println("El volumen del cubo es "+obj1.res());
    }
    
}
