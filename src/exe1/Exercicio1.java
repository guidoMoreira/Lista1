package exe1;
import java.util.Scanner;
import java.lang.Math;

public class Exercicio1{
    public Exercicio1(){
    }
    public static float x;
    public static float y;
    public static void main(String[] args){
        float[] var = new float[2];
        Scanner num = new Scanner(System.in);
        for(int i = 0; i < 2;i++) {
            System.out.println("Digite um valor: ");
            var[i] = num.nextFloat();
        }
        x = var[0];
        y = var[1];
        int choice = 0;
        while(choice != 11){
            System.out.println("Qual operação deseja realizar?\n1-Abs de x\n2-Ceil de x\n3-Cos de x\n4-Exp de x\n5-Floor de x\n6-Log de x\n7-Maior entre x e y\n8-menor entre x e y\n9-x elevado a y\n10-raiz de x\n11-Sair do programa");
            choice = num.nextInt();
            switch(choice) {
                case 1:
                    Abs();
                    break;
                case 2:
                    Ceil();
                    break;
                case 3:
                    Cos();
                    break;
                case 4:
                    Exp();
                    break;
                case 5:
                    Floor();
                    break;
                case 6:
                    Log();
                    break;
                case 7:
                    Max();
                    break;
                case 8:
                    Min();
                    break;
                case 9:
                    Pow();
                    break;
                case 10:
                    Sqrt();
                    break;
                default:
                    // code block
            }
            System.out.println("------------\n");
        }
        Exercicio2 funcionalidade = new Exercicio2();
        funcionalidade.func();
    }
    public static void Abs(){
        System.out.println("Resultado:" + Math.abs(x));
    }
    public static void Ceil(){
        System.out.println("Resultado:" + Math.ceil(x));
    }
    public static void Cos(){
        System.out.println("Resultado:" + Math.cos(x));
    }
    public static void Exp(){
        System.out.println("Resultado:" + Math.exp(x));
    }
    public static void Floor(){
        System.out.println("Resultado:" + Math.floor(x));
    }
    public static void Log(){
        System.out.println("Resultado:" + Math.log(x));
    }
    public static void Max(){
        System.out.println("Resultado:" + Math.max(x,y));
    }
    public static void Min(){
        System.out.println("Resultado:" + Math.min(x,y));
    }
    public static void Pow(){
        System.out.println("Resultado:" + Math.pow(x,y));
    }
    public static void Sqrt(){
        System.out.println("Resultado:" + Math.sqrt(x));
    }
}
