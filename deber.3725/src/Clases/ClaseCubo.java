
package Clases;


public class ClaseCubo {
    int alto, ancho, profundo;
    
    public ClaseCubo(int alto, int ancho, int profundo){
        this.alto=alto;
        this.ancho=ancho;
        this.profundo=profundo;
    }
    
    public ClaseCubo(){
        System.out.println("Ingresar los tres valores (alto, ancho y profundo");
    }
    
    public int res(){
        int resultado=this.alto*this.ancho*this.profundo; 
        return resultado;
    }
}
