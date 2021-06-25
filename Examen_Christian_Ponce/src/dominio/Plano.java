
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
  // devuelve el cuadrante
  public int calcularCuadrante() {
    if (x > 0.0 && y > 0.0) {
      return 1;
    } else if (x < 0.0 && y > 0.0) {
      return 2;
    } else if (x < 0.0 && y < 0.0) {
      return 3;
    } else if (x > 0.0 && y < 0.0) {
      return 4;
    } else {
      // (x==0.0 || y==0.0)
      return 0;
    }
  }

  // calcula el punto mas cercano del array
  public Plano calcularMasCercano(Plano[] otrosPuntos) {
    Plano puntoMasCercano = null;

    if (otrosPuntos != null && otrosPuntos.length > 0) {
      // me guardo el primero como mas cercano
      double distanciaMinima = calcularDistancia(otrosPuntos[0]);
      puntoMasCercano = otrosPuntos[0];

      for (int i = 1; i < otrosPuntos.length; i++) {
        // si encuentro otro mas cercano, lo sustituyo
        double distancia = calcularDistancia(otrosPuntos[i]);
        if (distancia < distanciaMinima) {
          distancia = distanciaMinima;
          puntoMasCercano = otrosPuntos[i];
        }
      }
    }
    // devuelve el punto encontrado si el array contiene puntos, null en caso
    // contrario
    return puntoMasCercano;
  }
}

