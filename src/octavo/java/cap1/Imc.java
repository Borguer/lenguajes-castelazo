package octavo.java.cap1;


public class Imc {
    private float estatura;
    private float peso;
    
    public void setPeso(float peso){
        this.peso=peso;
    }
    
    public void setEstatura(){
        this.estatura=estatura;
    }
    public float calcular(){
        float algo=peso/(estatura*estatura);
        return algo;
    }
}
