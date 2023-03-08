package Porta;

public class Casa {
    String corCasa;
    Porta porta1, porta2, porta3;
    int cont;
    
    public void pintar(String s) {
        this.corCasa = s;
    }

    public int qantasPortasEstaoAbertas (int cont) {
        this.cont = cont;
        if(porta1.estaAberta() == true) {
            cont ++;
        }
        if(porta2.estaAberta() == true) {
            cont ++;
        }
        if(porta3.estaAberta() == true) {
            cont ++;
        }
        return cont;
    }

}
