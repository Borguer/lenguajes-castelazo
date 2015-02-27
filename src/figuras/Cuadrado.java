package figuras;

public class Cuadrado implements Superficies {
    private float lado;
    /**
     * Este constructor tiene un argumento de tipo flotante
     * @param lado El parametro que debes ingresar es el valor del cuadrado
     */
    public Cuadrado(){
        
    }
    
    public Cuadrado(float lado){
        this.lado=lado;
    }
    
    public void setLado(float lado) throws NumeroNoNegativoException, FueraDeRangoException{
        validarvalores.validarValorNoNegativo(lado);
        validarvalores.validarRango(lado);
        this.lado=lado;
    }
     public float getLado(){
         return lado;
     }
     
     public float calcularArea(){
         System.out.print("El área del cuadrado es: ");
         float area=lado*lado;
         return area;
     }
}
