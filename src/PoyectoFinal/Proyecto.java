package PoyectoFinal;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Proyecto {

   
    public static void main(String[] args) {
       Usuario u=new Usuario();
       u.setEmail("borguer@gmail.com");
       u.setNombre("Daniel");
       u.setSueldo(25000);
       PersistenciaUsuario per=new PersistenciaUsuario();
        try {
            per.guardar(u);
            System.out.println("Usuario guardado con éxito");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
    
}
