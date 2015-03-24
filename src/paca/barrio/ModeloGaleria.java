
package paca.barrio;

import java.util.*;


public class ModeloGaleria {
    public static ArrayList<Galeria> generarGaleria(){
       ArrayList<Galeria> arreglo=new ArrayList<Galeria>();
       Galeria g1=new Galeria("Titulo 1","Descripcion 1","/paca/barrio/Uno.jpg");
       Galeria g2=new Galeria("Titulo 2","Descripción 2","/paca/barrio/Dos.jpg");
       Galeria g3=new Galeria("Titulo 3","Descripcion 3","/paca/barrio/Tres.jpg");
       arreglo.add(g1);
       arreglo.add(g2);
       arreglo.add(g3);
       return arreglo;
    }
}
