package exe3;
import java.util.Scanner;
import java.util.ArrayList;
//Exercicio 4
//Essa classe permite que o usuario digite os registros e adicione quantos quiser
public class Exercicio4 {
    public Exercicio4(){
    }
    public ArrayList<Vaga> AdicionarReg(){
        ArrayList<Vaga> Estacionamento = new ArrayList<>();
        int aux = 0;
        while(aux == 0) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Digite o tipo do veiculo: ");
            String tipVeic = scan.nextLine();
            System.out.println("Digite a placa do veiculo: ");
            String Placa = scan.nextLine();
            System.out.println("Digite a hora de chegada do veiculo: ");
            Float Hin = scan.nextFloat();
            System.out.println("Digite hora de saida do veiculo: ");
            Float Hout = scan.nextFloat();
            Estacionamento.add(new Vaga(tipVeic,Placa,Hin,Hout));
            System.out.println("Adicionar outro veiculo?\n0 - Sim\n1 - Não");
            aux = scan.nextInt();
        }
        return Estacionamento;
    }
}
