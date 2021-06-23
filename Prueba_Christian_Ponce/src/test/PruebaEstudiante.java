
package test;

import dominio.Estudiante;
import java.util.Scanner;

public class PruebaEstudiante {
    static Scanner datos = new Scanner(System.in);
    public static void main(String[] args){
        int nroHombres,estudiante;
        System.out.println("Cuantos estudiantes desea ingresar");
        int n=datos.nextInt();
        Estudiante [] estudiantes = new Estudiante[n];
        llenaEstudiante(estudiantes);
        System.out.println("Listado de estudiantes ordenados de mayor a menor nota:");
        ordenamiento(estudiantes);
        nroHombres=porcentajeGenero(estudiantes);
        System.out.println("El % de hombres por encima del promedio: "+porcentajePromedio(estudiantes, nroHombres, 'm'));
        System.out.println("El % de mujeres por encima del promedio: "+porcentajePromedio(estudiantes, nroHombres, 'f'));
        estudiante=notaAlta(estudiantes);
        System.out.println("El estudiante con la mas alta nota es: "+estudiantes[estudiante].getNombre());
      
    }
    public static void llenaEstudiante(Estudiante est[]){
        String nombre;
        char sexo;
        double nota;
        for(int i=0; i<est.length;i++){
            datos.nextLine();
            System.out.println("Estudiante Nro: "+(i+1));
            System.out.print("Nombre: ");
            nombre = datos.nextLine();
            System.out.print("Sexo <<m>><<f>>:  ");
            sexo= datos.next().charAt(0);
            System.out.print("Nota: ");
            nota= datos.nextDouble();
            est[i]= new Estudiante(nombre,sexo,nota);
        }   
    }
    public static int porcentajeGenero(Estudiante est[]){
        int cuentahombres=0, cuentamujeres=0;
        double porc;
        for(int i=0;i<est.length;i++){
            if(est[i].getGenero()=='m'){
                cuentahombres++;
            }
        }
        cuentamujeres=est.length-cuentahombres;
        System.out.println("Porcentaje hombres = "+(cuentahombres*100/est.length)+" %");
        System.out.println("Porcentaje mujeres = "+(cuentamujeres*100/est.length)+" %");
        porc=cuentahombres*100/est.length;
        return cuentahombres;
    } 
    public static double porcentajePromedio(Estudiante est[], int homb, char sex){
        int muj = est.length-homb;
        int cuenta=0;
        double promedio=0, porch, porcm;
        for(int i=0;i<est.length;i++){
            promedio+=est[i].getNota();
        }
        promedio = promedio/est.length;
        
        for(int i =0; i<est.length;i++){
            if(est[i].getNota()>promedio && est[i].getGenero()==sex){
                cuenta++;
            }
        }
        porch= homb*100/est.length;
        porcm= muj*100/est.length;
        if(sex=='m' && homb>0){
            porch = cuenta*porch/homb;
            return porch;
        }
        else if(muj>0){
            porcm = cuenta*porcm/muj;
            return porcm;
        }
        else{
            return 0;
        }
    }
    public static int notaAlta(Estudiante est[]){
        double mayor;
        int indice=0;
        mayor = est[0].getNota();
        for(int i=1; i<est.length; i++){
            if(est[i].getNota()>mayor){
                mayor = est[i].getNota();
                indice=i;
            }
        }
        return indice;
    }
    public static void ordenamiento(Estudiante est[]){
        Estudiante aux;
        for(int i=0; i<(est.length-1); i++){
            for(int j=0; j <(est.length-1); j++){
                if(est[j].getNota()<=est[j+1].getNota()){
                    aux=est[j];
                    est[j]=est[j+1];
                    est[j+1]=aux;
                }
            }
        }
        for(int i=0; i<est.length;i++){
            System.out.println(est[i]);
        }
    }
}
