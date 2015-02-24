package figuras;


public class Figura {

    
    public static void main(String[] args) throws NumeroNoNegativoException {
     Cuadrado c=new Cuadrado();
     Rectangulo r=new Rectangulo(); 
     c.setLado(15);
     c.calcularArea();
        System.out.println("El área del cuadrado es: "+c.getLado());
     r.setLadomayor(7);
     r.setLadomenor(4);
     r.calcularArea();
        System.out.println("El área del rectangulo es: "+r.calcularArea());
        
    }
    
}
