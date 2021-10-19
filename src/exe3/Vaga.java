package exe3;

public class Vaga {
    private static String tipVeiculo;
    private String placa;
    private double horaIn;
    private double horaOut;
    public Vaga(){
    }
    public Vaga(String tipo, String placa, double horaIn, double horaOut){
        this.Cadastrar(tipo,placa,horaIn,horaOut);
    }
    public void Cadastrar(String tipo, String placa, double horaIn, double horaOut){
        tipVeiculo = tipo;
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
    public String gettipo(){
        return tipVeiculo;
    }
}
