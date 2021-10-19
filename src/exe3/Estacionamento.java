package exe3;
import java.util.ArrayList;
import java.util.List;

public class Estacionamento {

    public Estacionamento (){
    }

    public static void main(String[] args) {
        //Parte exercicio 3
        ArrayList<Vaga> Estacionamento1 = new ArrayList<>();
        Estacionamento1.add(new Vaga("Carro1", "12345789", 10, 11));
        Estacionamento1.add(new Vaga("Carro3", "12345789", 8.5, 8.9));
        Estacionamento1.add(new Vaga("Moto", "12345789", 18, 21));
        for(int i = 0; i < Estacionamento1.size(); i++) {
            System.out.println("O Preço pago por " + Estacionamento1.get(i).gettipo() + " R$" + Estacionamento1.get(i).gerPreco());
        }
        //Incluindo funcionalidades da classe exercicio4
       Exercicio4 MenuRegistrar = new Exercicio4();
       ArrayList<Vaga> Estacionamento2 = MenuRegistrar.AdicionarReg();
       for(int i = 0; i < Estacionamento2.size(); i++) {
           System.out.println("O Preço pago por " + Estacionamento2.get(i).gettipo() + " R$" + Estacionamento2.get(i).gerPreco());
       }
    }

}
