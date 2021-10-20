package exe7;


public class Pendulo {
    public int A;
    public int B;
    public int C;
    public Pendulo(){
        A = 0;
        B = 0;
        C = 0;
    }
    public void C30(){
        C = 0;
        B++;
    }
    public void B30(){
            C = 0;
            B = 0;
            A++;
    }
    public void A30(){
        C = 0;
        B = 0;
        A = 0;
    }
}
