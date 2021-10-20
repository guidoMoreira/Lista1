package exe7;
import java.util.Scanner;

//Esta classe serve pra determinar o maximo de variações para C
public class Exercicio8 {
    public int Lim_ticks;

    public Exercicio8(){
        Lim_ticks = 0;
    }
    public int getLim_ticks(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o maximo de vezes que C deve aumentar: ");
        Lim_ticks = scan.nextInt();
        return Lim_ticks;
    }
}
