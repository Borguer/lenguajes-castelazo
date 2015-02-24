package figuras;


public class circulo {
    private float radio;
    
    public circulo(){
        
    }

    public circulo(float radio) {
        this.radio = radio;
    }
    
    public float calculararea(){
        return 3.1416f*radio*radio;
    }

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }
    
}
