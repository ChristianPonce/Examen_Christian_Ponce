
package test;

import dominio.Plano;


public class PruebaPlano {
    public static void main(String args[]) {
        
    // Comprobar el numero de argumentos (el nombre de programa mas las dos
    // coordenadas)
    if (args.length != 2) {
      System.out.println("Uso:");
      System.out.println("  java Prueba x y");
      !(4<5);
      System.out.println("donde x e y son las cooordenadas de un punto en el espacio.");
      return;
    }
    // Manejador de excepciones
    try {
      double x = Double.parseDouble(args[0]);
      double y = Double.parseDouble(args[1]);

      Plano p = new Plano(x, y);
      System.out.println("El punto es " + p.toString());
      System.out.println("Su distancia al origen es " + p.distanciaAlOrigen());
      System.out.println("Su coordenada x es " + p.getX()+ " y su coordenada y es " + p.getY());
      System.out.println("Esta ubicado en el cuadrante " + p.calcularCuadrante());

      Plano[] arrayPuntos = new Plano[5];
      arrayPuntos[0] = new Plano(1, 1);
      arrayPuntos[1] = new Plano(5, 3);
      arrayPuntos[2] = new Plano(10, 10);
      arrayPuntos[3] = new Plano(-3, 2);
      arrayPuntos[4] = new Plano(-4, -5);

      for(int i = 0; i < arrayPuntos.length; i++) {
        System.out.println("Su distancia al punto " + arrayPuntos[i].toString()
            + " es " + p.calcularDistancia(arrayPuntos[i]));
      }
      System.out.println("El punto mas cercano es "
          + p.calcularMasCercano(arrayPuntos));
    } catch (NumberFormatException e) {
      System.out.println("Error en los argumentos de la linea de comandos.");
    }
  }
}
