package Porta;
public class Porta {
    boolean aberta;
    String cor;
    float dimensaoX; 
    float dimensaoY;

    public boolean abre () {
        return aberta = true;
    }
    
    public boolean fecha () {
        return aberta = false;
    }

    public void pinta () {
        System.out.println(this.cor);
    }
    public boolean estaAberta () {
        return aberta;
    }
}
