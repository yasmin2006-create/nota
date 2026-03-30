import java.util.Scanner;

public class nota {
public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);

 double nota;

System.out.print("Digite a nota (0 a 100): ");
 nota = sc.nextDouble();


while (nota < 0 || nota > 100) {
System.out.println("Nota inválida. Tente novamente.");
 System.out.print("Digite a nota (0 a 100): ");
 nota = sc.nextDouble();
        }

   
if (nota >= 90) {
System.out.println("Conceito: A");
} else if (nota >= 75) {
System.out.println("Conceito: B");
 } else if (nota >= 60) {
System.out.println("Conceito: C");
 } else {
  System.out.println("Conceito: D (Reprovado)");
        }

        sc.close();
    }
}