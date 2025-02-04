public class Fahrenheit {
    public static void main(String[] args) {
        double tempCelsius = 30;

        double tempFaheranheit = 1;
        System.out.println("Temperatura em Faheranheit" + tempFaheranheit);

        double formula = (tempFaheranheit * 1.8) +32;

        int resultadoFormula = (int) formula;

        System.out.println(resultadoFormula);

    }

}
