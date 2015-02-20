package figuras;


public class Figura {

    
    public static void main(String[] args) throws NumeroNoNegativoException {
     Cuadrado c=new Cuadrado();
     Rectangulo r=new Rectangulo(); 
     c.setLado(4);
     c.calcular();
        System.out.println("El área del cuadrado es: "+c.getLado());
     r.setLadoa(7);
     r.setLadob(4);
     r.calcular();
        System.out.println("El área del rectangulo es: "+r.calcular());
        
    }
    
}
