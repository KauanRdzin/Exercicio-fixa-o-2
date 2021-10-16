public class Q2_principal_post {

    public static void main(String[] args){

        Q2_post n1 = new Q2_post("Why d You Only Call Me When You re High", "https://www.youtube.com/watch?v=6366dxFf-Os");

        n1.curtir();
        n1.curtir();
        n1.curtir();

        System.out.println("\nNumero de curtidas: "+n1.getNumeroCurtidas());

        n1.compartilhar();
        n1.compartilhar();

        System.out.println("\nNumero de compartilhamento: "+n1.getNumeroCompartilhamento());
    }
