import java.util.Locale;
import java.util.Scanner;
import java.util.InputMismatchException;

public class AboutMe {
    public static void main(String[] args) {
        try{
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome:");
        String nome = scan.nextLine();

        System.out.println("Digite seu sobrenome:");
        String sobrenome = scan.nextLine();

        System.out.println("Digite sua idade:");
        int idade = scan.nextInt();
        
        System.out.println("Digite sua altura:");
        double altura = scan.nextDouble();

        System.out.println("Olá, me chamo " + nome.toUpperCase() + " " + sobrenome.toUpperCase());
        System.out.printf("Tenho %d anos", idade);
        System.out.printf("\nMinha altura é %.2f cm", altura);
        scan.close();
        }
        catch (InputMismatchException e){
            System.err.println("Os campos idade e altura precisam ser numéricos!!!");
        }
    }
}
