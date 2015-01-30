package octavo.java.cap1;


public class Imc {
    private double estatura;
    private float peso;
    
    public void setPeso(float peso){
        this.peso=peso;
    }
    
    public void setEstatura(double estatura){
        this.estatura=estatura;
    }
    public double calcular(){
        double algo=peso/(estatura*estatura);
        return algo;
    }
}
