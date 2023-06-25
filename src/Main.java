//Tabliczka mnożenia: Napisz program, który wyświetli tabliczkę mnożenia dla liczb od 1 do 10.
// Wykorzystaj pętle do iteracji przez liczby i wyświetl wyniki mnożenia.
public class Main {
    public static void main(String[] args) {


        for (int i = 1; i <= 10; i++) {

            for (int j = 1; j <= 10; j++) {
                int wynik = i * j;
                System.out.print(wynik + "\t");
                System.out.println();

            }
        }
    }
}