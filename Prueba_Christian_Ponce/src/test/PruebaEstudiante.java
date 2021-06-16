
package test;

import dominio.Estudiante;
import java.util.Scanner;

public class PruebaEstudiante {
    static Scanner datos = new Scanner(System.in);
    public static void main(String[] args){
        Estudiante [] estudiantes;
        int n=4;
        estudiantes = new Estudiante[2];
        llenaDatos(estudiantes);
        System.out.println("Datos Almacenados");
        
        for(int i=0; i<estudiantes.length; i++){
            System.out.print(estudiantes[i].getNombre()+"\n"+estudiantes[i].getGenero()+"\n"+estudiantes[i].getNota());
        }
    }
    public static void llenaDatos(Estudiante est[]){
        String nombre;
        char genero;
        double nota;
        System.out.println("Ingrese los datos de los 4 estudiantes: ");
        for (int i =0; i<est.length; i++){
            System.out.print("Nombre: ");
            nombre = datos.nextLine();  
            System.out.print("Genero: ");
            genero = datos.next().charAt(0);
            System.out.print("Nota: ");
            nota = datos.nextDouble(); 
            est[i] = new Estudiante(nombre, genero, nota);
            datos.nextLine();
        }
    }
  
    
}


