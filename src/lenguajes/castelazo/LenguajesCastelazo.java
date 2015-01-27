
package lenguajes.castelazo;
import java.io.*;
import java.util.Scanner;

public class LenguajesCastelazo {
    

   
    public static void main(String[] args) {
        double peso, altura, imc;
        Scanner entrada=new Scanner(System.in);
        
        System.out.println("Calcular IMC");
        System.out.println("Introduce tu Peso");
        peso=entrada.nextDouble();
        System.out.println("Introduce tu altura en metros");
        altura=entrada.nextDouble();
        imc=peso/(altura*altura);
        System.out.println("Tu IMC es de: "+imc);
        
        if(imc<18){
            System.out.println("Peso bajo");
        }
        else{
            if(imc>=18 && imc<=24.9){
                System.out.println("Normal");
            }
            else{
                if(imc>=25 && imc<=26.9){
                    System.out.println("Sobrepeso");
                }
                else{
                    if(imc>=27 && imc<=29.9){
                        System.out.println("Obesidad grado I");
                    }
                    else{
                        if(imc>=30 && imc<=39.9){
                            System.out.println("Obesidad grado II");
                        }
                        else{
                            if(imc>=40){
                                System.out.println("Obesidad mórbida");
                            }
                        }
                    }
                }
            }
        }
        
        
    }
    
}
