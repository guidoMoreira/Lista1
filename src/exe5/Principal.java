package exe5;

//Exercicio 5
public class Principal {
    public static void main(String[] args){
        //Classe do Exercicio 6
        Exercicio6 contador;

        int digt = 0;
        Descobrir desc = new Descobrir();

        //Classe com o registro do contador copiada para classe principal
        contador = desc.ValorDigitado();

        //Imprime numero de tentativas usadas
        contador.print();
    }
}
