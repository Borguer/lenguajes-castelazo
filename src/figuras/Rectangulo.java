package figuras;

public class Rectangulo {
    private int ladoa, ladob;
    
    public void setLadoa(int ladoa){
        this.ladoa=ladoa;
    }
    
    public int getLadoa(){
        return ladoa;
    }
    
    public void setLadob(int ladob){
        this.ladob=ladob;
    }
    
    public int getLadob(){
       return ladob;
    }
    
    public int calcular(){
        int area=ladoa*ladob;
        return area;
    }
}
