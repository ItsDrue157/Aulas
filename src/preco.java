public class preco {
    public static void main(String[] args) {
        double precoProduto = 200;
        int quantidade = 10;
        double valorTotal = precoProduto * quantidade;
        int valorTotalInteiro = (int) valorTotal;
        System.out.println("O Valor total eh : "+ valorTotalInteiro + " reais");
    }
}
