import java.util.Scanner;

public class ex09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a temperatura em graus fahrenheit: ");
        double f = input.nextDouble();
        double c = 5*((f-32)/9);
        System.out.println("A temperatura em graus celsius é: "+c+"ºC");
        input.close();
    }
}
