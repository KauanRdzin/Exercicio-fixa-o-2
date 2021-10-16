public class Q4 {

    public static void main(String[] args){

        Q4_produto chocolate= new Q4_produto("chocolate", 10, 5.50);

        System.out.println("\nNome do produto: "+chocolate.getNome());
        System.out.println("Preco: "+chocolate.getPreco());

        chocolate.Comprar(1);

        System.out.println("Quantidade em estoque: "+chocolate.getQuantidade());

        chocolate.Comprar(1);

        System.out.println("Quantidade em estoque: "+chocolate.getQuantidade());

        chocolate.Comprar(9);

        System.out.println("Quantidade em estoque: "+chocolate.getQuantidade());
    }
}
