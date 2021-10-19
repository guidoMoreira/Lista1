package exe1;
import java.util.Scanner;


public class Exercicio1{
    public Exercicio1(){
    }
    public static void main(String[] args){
        float[] var = new float[2];
        Scanner num1 = new Scanner(System.in);
        for(int i = 0; i < 2;i++) {
            System.out.println("Digite um valor: ");
            var[i] = num1.nextFloat();
        }
        Math mat = new Math(var[0],var[1]);


        System.out.println( var[0]+ var[1]);

    }
}