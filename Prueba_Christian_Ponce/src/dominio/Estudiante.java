
package dominio;

public class Estudiante {
    private String nombre;
    private char genero;
    private double nota;

    public Estudiante(String nombre, char genero, double nota) {
        this.nombre = nombre;
        this.genero = genero;
        this.nota = nota;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public String getNombre() {
        return nombre;
    }

    public char getGenero() {
        return genero;
    }

    public double getNota() {
        return nota;
    }

    @Override
    public String toString(){
        return this.nombre+" "+this.genero+" "+this.nota; 
    }

}
