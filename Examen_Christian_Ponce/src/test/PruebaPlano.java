
package test;

import dominio.Plano;
import java.util.Scanner;


public class PruebaPlano {
    public static void main(String args[]) {
    double x,y;
    Scanner entrada=new Scanner(System.in);
    System.out.println("Digite el numero de movimientos a realizar: ");
    int n=entrada.nextInt();    
    x=(int)(Math.random()*100);
    y=(int)(Math.random()*100);
    
  //  for(int i=0;i<n;i++){
  //      for(int j=0;j<n;j++){
            System.out.println(x+"\n");
            System.out.println(y);
            Plano p = new Plano(x, y);
            System.out.println("El punto es: " + p.toString());
            System.out.println("Su distancia es: " + p.distanciaAlOrigen());
            System.out.println("Su coordenada x es " + p.getX()+ " y su coordenada y es " + p.getY());
    //    }
  //  }
    
  }
}
