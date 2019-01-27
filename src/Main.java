import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int number;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Podaj liczbę: ");
            number = scanner.nextInt();
            showAlert(number);
        } while (!(number > 100 && number < 200 && number % 3 == 0));
        //lub z prawa De Morgana: (number <= 100 || number >= 200 || number % 3 =! 0) :)

    }

    private static void showAlert(int number) {
        if (number < 100)
            System.out.println("Podana liczba jest za mała.");
        else if (number > 200)
            System.out.println("Podana liczba jest za duża.");
        else if (!(number % 3 == 0))
            System.out.println("Podana liczba nie jest podzielna przez 3.");
        else
            System.out.println("Twoja liczba jest ok.");
    }

}