package exe3;
import java.util.ArrayList;
import java.util.List;

public class Estacionamento {

    public Estacionamento (){
    }

    public static void main(String[] args) {
        ArrayList<Vaga> Vagas = new ArrayList<>();
        Vagas.add(new Vaga("Carro1", "12345789", 10, 11));
        Vagas.add(new Vaga("Carro3", "12345789", 8.5, 8.9));
        Vagas.add(new Vaga("Moto", "12345789", 18, 21));
        for(int i = 0; i < Vagas.size(); i++){
        System.out.println("O Preço pago por " + Vagas.get(i).gettipo() + " R$" + Vagas.get(i).gerPreco());
    }

    }



}