import java.util.Scanner;

public class Main{
public static void main(String[] args) {
    Calculo c = new Calculo();

    Scanner scanner = new Scanner(System.in);
    float a = scanner.nextFloat();
    float b = scanner.nextFloat();
    String d = scanner.nextLine();

    System.out.println(c.Calcular(a,b,d));

}}
