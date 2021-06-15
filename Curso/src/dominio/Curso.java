
package dominio;

public class Curso {
    private double [] notas;
    private double promedio;
    private int estudiantesEncimaPromedio;

    public Curso(){
        notas=new double[12];
    }
    public void setNotas(double [] notas){
        this.notas=notas;
    }
    public void mostrarNotas(){
        for(int i=0;i<12;i++){
            System.out.println(this.notas[i]);
        }
    }
    public void setPromedio(){
        double promedio=0;
        this.promedio=promedio;
        
    }
    public void setEstudiantesEncimaPromedio(){
        int estudiantes=0;
        this.estudiantesEncimaPromedio=estudiantes;
    }
    public double getPromedio(){
        double sumar=0;
        int elementos=0;
        for(int i=0;i<12;i++){
            sumar +=notas[i];
            elementos++;
        }
        System.out.println("La suma total de las notas es: "+sumar);
        promedio= sumar/elementos;
        return this.promedio;
    }
    public int getnroEstudiantesEncimaPromedio(){
        int reprobados=0;
        for(int i=0;i<12;i++){
            if(notas[i]>=promedio){
                estudiantesEncimaPromedio++;
            }
            else{
                reprobados++;
            }
        }
        System.out.println("El Nro. Estudiantes Debajo del Promedio es : "+reprobados);
        return this.estudiantesEncimaPromedio;
    }
}
