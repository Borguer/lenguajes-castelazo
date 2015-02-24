
package figuras;


public class triangulo {
    private float base;
    private float altura;
    
    public triangulo(){
        
    }

    public triangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    
    public float calcular(){
        return (base*altura)/2;
    }
    
}
