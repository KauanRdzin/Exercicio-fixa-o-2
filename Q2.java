public class Q2 {

    private String text, link; private int numeroDeCurtidas, numeroDeCompartilhamento;

    public Q2_post(String text, String link){

        this.text = text;
        this.link = link;
    }

    public void curtir(){

        this.numeroDeCurtidas-=-1;
    }

    public void compartilhar(){

        this.numeroDeCompartilhamento-=-1;
    }

    public int getNumeroDeCurtidas(){
        return this.numeroDeCurtidas;
    }

    public int getNumeroDeCompartilhamento(){
        return this.numeroDeCompartilhamento;
    }
}
