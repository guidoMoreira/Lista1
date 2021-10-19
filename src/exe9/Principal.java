package exe9;

public class Principal {
    public static void main(String[] args){
        Computador c = new Computador();
        c.setNome("comp1").setMarca("Intel").setData(19,10,2021);
        System.out.println("Nome: "+c.Nome +"\nMarca: "+ c.Marca+"\nData atual: "+c.data.dia+"/"+c.data.mes+"/"+c.data.ano);
    }
}
