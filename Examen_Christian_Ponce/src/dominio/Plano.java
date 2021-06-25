
package dominio;


public class Plano {
    private double x;
    private double y;

  // Constructor
  public Plano(double x, double y) {
    this.x = x;
    this.y = y;
  }
  // toString: devuelve una cadena con la representacion del objeto
  public String toString() {
    // el signo + para cadenas no significa "suma matematica" sino concatenacion
    return "(" + x + ", " + y + ")";
  }
  // devuelve la distancia al origen
  public double distanciaAlOrigen() {
    // NOTA: se podria haber hecho con la distancia a (0,0):
    // return calcularDistancia(new Punto(0,0));
    return Math.sqrt(x * x + y * y);
  }
  // metodos de acceso
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

