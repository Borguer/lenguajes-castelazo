package figuras;


public class circulo implements Superficies {
    private float radio;
    
    public circulo(){
        
    }

    public circulo(float radio) {
        this.radio = radio;
    }
    
    public float calcularArea(){
        System.out.print("El área del circulo es: ");
        return 3.1416f*radio*radio;
    }

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }
    
}
