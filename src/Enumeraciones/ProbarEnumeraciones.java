
package Enumeraciones;


public class ProbarEnumeraciones {

    public static void main(String[] args) {
       MaquinaBuena maquina=new MaquinaBuena();
       maquina.setEstado(EstadoDeMaquina.LINEA);
       System.out.println("El estado de la máquina es: "+maquina.getEstado());
    }
    
}
