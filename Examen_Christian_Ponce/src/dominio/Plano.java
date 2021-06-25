
package dominio;


public class Plano {
    private double x;
    private double y;

  // Constructor
  public Plano(double x, double y) {
    this.x = x;
    this.y = y;
  }
  
  public String toString() {
  
    return "(" + x + ", " + y + ")";
  }
 
  public double distanciaAlOrigen() {

    return Math.sqrt(x * x + y * y);
  }
 
  public double getX() {
    return x;
  }

  public double getY() {
    return y;
  }

  // devuelve la distancia a otro punto
  public double calcularDistancia(Plano otroPunto) {
    double x1 = x - otroPunto.getX();
    double y1 = y - otroPunto.getY();
    return Math.sqrt(x1 * x1 + y1 * y1);
  }
}

