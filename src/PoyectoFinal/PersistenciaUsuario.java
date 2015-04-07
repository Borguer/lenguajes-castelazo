package PoyectoFinal;

import java.io.*;

public class PersistenciaUsuario {
    public void guardar(Usuario u) throws Exception{
        File file=new File("D:\\.archivaldo.txt");
        FileOutputStream fos=new FileOutputStream(file);
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(u);
        oos.close();
    }
    
    public Usuario leer() throws Exception{
         File file=new File("D:\\.archivaldo.txt");
         FileInputStream fis=new FileInputStream(file);
         ObjectInputStream ois=new ObjectInputStream(fis);
         Usuario u=new Usuario();
         u=(Usuario)ois.readObject();
         ois.close();
         return u;
    }
}
