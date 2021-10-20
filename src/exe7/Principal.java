package exe7;

import javax.swing.*;

public class Principal {

    public static void main(String[] args){
        Pendulo pend = new Pendulo();
        JFrame frame = new JFrame("Pendulo");

        //Limite de ticks exercicio 8
        Exercicio8 LimitadorTicks = new Exercicio8();
        int maxTicks = LimitadorTicks.getLim_ticks();

        //Tamanho até mudar
        int tam = LimitadorTicks.getTamanhovariarcao();
        for(int i = 0; i < maxTicks; i++){
            pend.C++;
            final JLabel label = new JLabel("A["+pend.A+","+tam+"] | B["+pend.B+","+tam+"] Z C["+pend.C+","+tam+"]");
            frame.getContentPane().add(label);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.pack();
            frame.setVisible(true);

            //Pausa de meio segundo
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            frame.getContentPane().remove(label);
            if(pend.C == tam){
                pend.C30();
            }if(pend.B == tam){
                pend.B30();
            }if(pend.A == tam){
                pend.A30();
            }
        }
    }
}
