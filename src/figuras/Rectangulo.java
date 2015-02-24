package figuras;

public class Rectangulo{
    
    private float ladomayor;
    private float ladomenor;
    
    public Rectangulo(){
        
    }

    public Rectangulo(float ladomayor, float ladomenor) {
        this.ladomayor = ladomayor;
        this.ladomenor = ladomenor;
    }
    
    
    
    public float getLadomayor() {
        return ladomayor;
    }

    public void setLadomayor(float ladomayor) {
        this.ladomayor = ladomayor;
    }

    public float getLadomenor() {
        return ladomenor;
    }

    public void setLadomenor(float ladomenor) {
        this.ladomenor = ladomenor;
    }
    
        public float calcular(){
        return ladomayor*ladomenor;
    }
}
