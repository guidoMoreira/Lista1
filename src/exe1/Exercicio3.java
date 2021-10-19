package exe1;

public class Exercicio3 {

    private String tipVeiculo;
    private String placa;
    private double horaIn;
    private double horaOut;

    public Exercicio3 (){
    }
    public Exercicio3(String tipo, String placa, double horaIn, double horaOut){
        this.Estacionou(tipo,placa,horaIn,horaOut);
    }
    public void Estacionou(String tipo, String placa, double horaIn, double horaOut){
        this.tipVeiculo = tipo;
        this.placa = placa;
        this.horaIn = horaIn;
        this.horaOut = horaOut;
    }
    public double gerPreco(){
        double temp = horaOut - horaIn;
        if(temp <= 0.5){
            return 0;
        }else if(0.5< temp && temp<= 1){
            return 10;
        }else{
            return 20;
        }
    }
}