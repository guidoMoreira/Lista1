package exe10;

public class Periodo {
    public int periodo;

    public Periodo() {

    }

    public Periodo(int periodo) {
        this.periodo = periodo;
        verificaPeriodo(periodo);
    }

    public void verificaPeriodo(int periodo) {
        if(periodo == 1) {
            System.out.println("Você está no " + periodo +  " periodo." + " Você completou 0% do seu curso");
        } else if(periodo == 2) {
            System.out.println("Você está no " + periodo +  " periodo." + " Você completou 10% do seu curso");
        } else if(periodo == 3) {
            System.out.println("Você está no " + periodo +  " periodo." + " Você completou 20% do seu curso");
        } else if(periodo == 4) {
            System.out.println("Você está no " + periodo +  " periodo." + " Você completou 30% do seu curso");
        } else if(periodo == 5) {
            System.out.println("Você está no " + periodo +  " periodo." + " Você completou 40% do seu curso");
        } else if(periodo == 6) {
            System.out.println("Você está no " + periodo +  " periodo." + " Você completou 50% do seu curso");
        } else if(periodo == 7) {
            System.out.println("Você está no " + periodo +  " periodo." + " Você completou 60% do seu curso");
        } else if(periodo == 8) {
            System.out.println("Você está no " + periodo +  " periodo." + " Você completou 70% do seu curso");
        } else if(periodo == 9) {
            System.out.println("Você está no " + periodo +  " periodo." + " Você completou 80% do seu curso");
        } else if(periodo == 10) {
            System.out.println("Você está no " + periodo +  " periodo." + " Você completou 90% do seu curso, parabéns e boa sorte com o seu TCC :)");
        } else {
            System.out.println("este não  é um periodo existente.");
        }

    }

}