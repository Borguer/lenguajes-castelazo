package figuras;

import java.util.*;

public class GenerarSuperficies {
    public static ArrayList<Superficies>obtenerFiguras(){
        ArrayList<Superficies> figuritas=new ArrayList<Superficies>();
       
        //Se crean los cuadrados
        Cuadrado c1=new Cuadrado(12);
        Cuadrado c2=new Cuadrado(14);
        Cuadrado c3=new Cuadrado(13);
       
//Crear 1 rectangulo
        Rectangulo r=new Rectangulo(14,20); 
       
        //Crear 2 trianglulos
        triangulo t1=new triangulo(12,17);
        triangulo t2=new triangulo(11,15);
        
//Crear dos circulos
        circulo o1=new circulo(13);
        circulo o2=new circulo(16);
        
        //Agregarlos a la ArrayList
        
        figuritas.add(c1);
        figuritas.add(c2);
        figuritas.add(c3);
        figuritas.add(r);
        figuritas.add(t1);
        figuritas.add(t2);
        figuritas.add(t2);
        figuritas.add(o1);
        figuritas.add(o2);
        return figuritas;
    }
}
