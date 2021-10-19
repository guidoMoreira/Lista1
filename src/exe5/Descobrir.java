package exe5;
import java.util.Random;
import java.util.Scanner;

//Parte exercicio 5
public class Descobrir {
    public int randval = 0;
    Exercicio6 cont;
    public Descobrir(){
        cont = new Exercicio6();
        this.Rand();
    }
    public void Rand(){
        Random random = new Random();
        this.randval = random.nextInt(10)+1;
    }
    public Exercicio6 ValorDigitado(){
        int choice;
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um valor: ");
        choice = scan.nextInt();
        while(choice != this.randval){
            cont.IncreaseTentat();
            if(choice > this.randval){
                System.out.println("O valor digitado é maior do que o numero gerado aleatoriamente.\nTente novamente: ");
            }else{
                System.out.println("O valor digitado é menor do que o numero gerado aleatoriamente.\nTente novamente: ");
            }
            choice = scan.nextInt();
        }
        cont.IncreaseTentat();
        System.out.println("Correto! o valor aleatorio era: " + this.randval);
        System.out.println(cont.NumTentativas);

        return cont;
    }
}
