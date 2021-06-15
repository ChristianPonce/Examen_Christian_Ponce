
package test;

import dominio.Curso;

public class TestCurso {
    public static void main(String[] args){
        Curso cursoA=new Curso();
        double [] notas= new double[12];
        llenaNotas(notas);
        cursoA.setNotas(notas);
        System.out.println("El Promedio del curso es: "+cursoA.getPromedio());
        System.out.println("El Nro. Estudiantes Encima del Promedio es: "+
                cursoA.getnroEstudiantesEncimaPromedio());
    }
    public static void llenaNotas(double[] notas){
        for(int i=0;i<12;i++){
            notas[i]=Math.random()*6;
            System.out.println("Nota "+(i+1)+": "+notas[i]);  
        }
    }
}
