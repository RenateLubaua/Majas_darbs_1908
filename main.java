import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("Izvēlies: Akmens, Šķēres, Papīrīts");
            String tavaIzvēle = scan.nextLine().toLowerCase();
            String[] elements = {"akmens", "šķēres", "papīrīts"};
            String datoraIzvēle = elements[new Random().nextInt(elements.length)];
            System.out.println("Datora izvēle -" + datoraIzvēle);
            {
                if (tavaIzvēle.equals(datoraIzvēle)) {
                    System.out.println("Neizšķirts!");
                } else if (tavaIzvēle.equals("akmens")) {
                    System.out.println(datoraIzvēle.equals("papīrīts") ? "Tu zaudēji!" : "Tu uzvarēji!");
                } else if (tavaIzvēle.equals("šķēres")) {
                    System.out.println(datoraIzvēle.equals("akmens") ? "Tu zaudēji!" : "Tu uzvarēji!");
                } else if (tavaIzvēle.equals("papīrīts")) {
                    System.out.println(datoraIzvēle.equals("šķēres") ? "Tu zaudēji!" : "Tu uzvarēji!");
                } else System.out.println("Drukas kļūda, mēģini vēlreiz");
                //        Ternary operator variable = (condition) ? expressionTrue : expressionFalse;

                System.out.println("Vēlies Turpināt? Jā/Nē");
                String atbilde = scan.nextLine().toLowerCase();
                if (atbilde.equals("nē")) {
                    System.out.println("Paldies par spēli");
                    break;
                } else if (atbilde.equals("jā")){
                    System.out.println("Veiksmi!");
                } else System.out.println("Drukas kļūda, mēģini vēlreiz");

            }
        }
    }
}
