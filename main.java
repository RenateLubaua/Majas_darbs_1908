import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("Izvēlies: Akmens, Šķēres, Papīrīts");
            String tavaIzvēle = scan.nextLine();
            String[] elements = {"Akmens", "Šķēres", "Papīrīts"};
            String datoraIzvēle = elements[new Random().nextInt(elements.length)];
            System.out.println("Datora izvēle -" + datoraIzvēle);
            {
                if (tavaIzvēle.equals(datoraIzvēle)) {
                    System.out.println("Neizšķirts!");
                } else if (tavaIzvēle.equals("Akmens")) {
                    System.out.println(datoraIzvēle.equals("Papīrīts") ? "Tu zaudēji!" : "Tu uzvarēji!");
                } else if (tavaIzvēle.equals("Šķēres")) {
                    System.out.println(datoraIzvēle.equals("Akmens") ? "Tu zaudēji!" : "Tu uzvarēji!");
                } else if (tavaIzvēle.equals("Papīrīts")) {
                    System.out.println(datoraIzvēle.equals("Šķēres") ? "Tu zaudēji!" : "Tu uzvarēji!");
                } else System.out.println("Drukas kļūda, mēģini vēlreiz");
                //        Ternary operator variable = (condition) ? expressionTrue : expressionFalse;

                System.out.println("Vēlies Turpināt? Jā/Nē");
                String atbilde = scan.nextLine();
                if (atbilde.equals("Nē")) {
                    System.out.println("Paldies par spēli");
                    break;
                } else if (atbilde.equals("Jā")){
                    System.out.println("Veiksmi!");
                } else System.out.println("Drukas kļūda, mēģini vēlreiz");

                }
            }
        }
    }
