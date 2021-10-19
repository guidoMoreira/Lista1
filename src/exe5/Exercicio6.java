package exe5;

//Contador de numero de tentativas
public class Exercicio6 {
    public int NumTentativas = 0;
    public Exercicio6(){
    }
    //Aumenta mais uma tentativa
    public void IncreaseTentat(){
        NumTentativas++;
    }
    //Imprime quantas tentativas foram necessarias
    public void print(){
        System.out.println("Você precisou de "+NumTentativas+" Tentativas.");
    }
}
