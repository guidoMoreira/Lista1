package exe5;

//Contador de numero de tentativas
public class Exercicio6 {
    public int NumTentativas = 0;
    public Exercicio6(){
    }
    public void IncreaseTentat(){
        NumTentativas++;
    }
    public void print(){
        System.out.println("Você precisou de "+NumTentativas+" Tentativas.");
    }
}
