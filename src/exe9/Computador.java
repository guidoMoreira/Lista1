package exe9;

public class Computador {
    public String Nome;
    public String Marca;
    public Data data = new Data();
    public Computador setNome(String nome){
        this.Nome = nome;
        return this;
    }
    public Data setMarca(String marca){
        this.Marca = marca;
        return data;
    }
}
