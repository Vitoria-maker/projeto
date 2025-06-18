import java.util.Scanner;

public class ConversorTemperatura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a temperatura em Celsius: ");
        double celsius = scanner.nextDouble();

        // Conversão para Fahrenheit
        double fahrenheit = (celsius * 9.0 / 5.0) + 32;

        // Conversão para Kelvin
        double kelvin = celsius + 273.15;

        System.out.printf("Temperatura em Fahrenheit: %.2f°F%n", fahrenheit);
        System.out.printf("Temperatura em Kelvin: %.2f K%n", kelvin);

        scanner.close();
    }
}
