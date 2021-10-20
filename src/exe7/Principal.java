package exe7;

import javax.swing.*;

public class Principal {

    public static void main(String[] args){
        Pendulo pend = new Pendulo();
        JFrame frame = new JFrame("Pendulo");

        //Limite de ticks exercicio 8
        Exercicio8 LimitadorTicks = new Exercicio8();
        int maxTicks = LimitadorTicks.getLim_ticks();

        for(int i = 0; i < maxTicks; i++){
            pend.C++;
            final JLabel label = new JLabel("A["+pend.A+",30] | B["+pend.B+",30] Z C["+pend.C+",30]");
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
            if(pend.C == 30){
                pend.C30();
            }if(pend.B == 30){
                pend.B30();
            }if(pend.A == 30){
                pend.A30();
            }
        }
    }
}
