public class Condicional {
    public static void main(String[] args) {
        int anoDeLancamento = 2022;

        boolean incluidoNoPlano = true;

        double notaDoFilme = 8.1;

        String tipoPlano = "plus";


        if (anoDeLancamento >= 2022) {
            System.out.println("lancamentos que os clientes estao curtindo");
        }
        else {
            System.out.println("Vale a pena de assistir");
        }
        
        if (incluidoNoPlano == true && tipoPlano.equals("plus"))
        {   
            System.out.println("Filme Liberado");
        }

        else{
            System.out.println("Nao incluido no plano");
        }




    }

}
