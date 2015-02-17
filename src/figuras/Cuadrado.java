package figuras;

public class Cuadrado {
    private float lado;
    /**
     * Este constructor tiene un argumento de tipo flotante
     * @param lado El parametro que debes ingresar es el valor del cuadrado
     */
    
    public void setLado(float lado){
        this.lado=lado;
    }
     public float getLado(){
         return lado;
     }
     
     public float calcular(){
         float area=lado*lado;
         return area;
     }
}
