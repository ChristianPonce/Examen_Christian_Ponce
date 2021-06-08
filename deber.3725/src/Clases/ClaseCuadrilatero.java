
package Clases;


public class ClaseCuadrilatero {
    
     int base, altura;
    
    public ClaseCuadrilatero(int base, int altura){
        
        this.base=base;
        this.altura=altura;
        
    }
    public int area(){
        int a=this.base*this.altura; 
        return a;
    }
    
    public int perimetro(){
        int p=2*this.base+2*this.altura; 
        return p;
    }
}
