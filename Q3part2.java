public class Q3_principal_aviao {

    public static void main(String[] args){

        Q3_aviao boing = new Q3_aviao(900, 10);

        System.out.println("\nVelocidade: "+boing.getVelocidade()+" Km/h");
        System.out.println("Altitude: "+boing.getAltitude()+" Km\n");

        boing.diminuirAltitude(1);
        boing.diminuirVelocidade(100);

        System.out.println("\nVelocidade: "+boing.getVelocidade()+" Km/h");
        System.out.println("Altitude: "+boing.getAltitude()+" Km\n");
    }
}
