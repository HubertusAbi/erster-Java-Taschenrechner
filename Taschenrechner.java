import java.util.Scanner;

public class Taschenrechner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Taschenrechner-Programm");
        System.out.println("-----------------------");
        
        System.out.print("Bitte geben Sie die erste Zahl ein: ");
        double zahl1 = scanner.nextDouble();

        System.out.print("Bitte geben Sie den Operator ein (+, -, *, /): ");
        String operator = scanner.next();

        System.out.print("Bitte geben Sie die zweite Zahl ein: ");
        double zahl2 = scanner.nextDouble();

        double ergebnis = 0.0;

        if (operator.equals("+")) {
            ergebnis = zahl1 + zahl2;
            System.out.println("Ergebnis: " + ergebnis);
        } else {
            if (operator.equals("-")) {
                ergebnis = zahl1 - zahl2;
                System.out.println("Ergebnis: " + ergebnis);
            } else {
                if (operator.equals("*")) {
                    ergebnis = zahl1 * zahl2;
                    System.out.println("Ergebnis: " + ergebnis);
                } else {
                    if (operator.equals("/")) {
                        if (zahl2 == 0) {
                            System.out.println("Fehler: Division durch Null ist nicht erlaubt.");
                        } else {
                            ergebnis = zahl1 / zahl2;
                            System.out.println("Ergebnis: " + ergebnis);
                        }
                    } else {
                        System.out.println("Fehler: Ungültiger Operator.");
                    }
                }
            }
        }

    }
}