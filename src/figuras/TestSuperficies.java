package figuras;


public class TestSuperficies {
    public static void main (String args[])throws Exception{
        for(Superficies s:GenerarSuperficies.obtenerFiguras()){
            System.out.println(s.calcularArea());
        }
    }
}
