package octavo.java.cap1;

public class Aplicacionimc {

 
    public static void main(String[] args) {
       
        Imc pez=new Imc(); 
        pez.setPeso(89);
        pez.setEstatura(1.68);
        System.out.println("Tu imc es: "+pez.calcular());
    }
    
}
