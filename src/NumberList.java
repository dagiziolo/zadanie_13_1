import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.TreeSet;

public class NumberList {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> lista = getNumbers(scan);
        TreeSet<Integer> set = new TreeSet<>(lista);

        System.out.println("Wprowadzona lista " + lista);
        printReverse(lista);
        sumElements(lista);
        System.out.println("Najmniejsza liczba: " + set.first());
        System.out.println("Najwiejsza liczba: " + set.last());
    }

    private static ArrayList<Integer> getNumbers(Scanner scan) {
        ArrayList<Integer> lista = new ArrayList<>();
        int tmp = 0;
        do {
            try {
                System.out.println("Podaj liczbę: ");
                tmp = scan.nextInt();
                if (tmp >= 0)
                    lista.add(tmp);
            } catch (InputMismatchException e) {
                System.out.println("Podana wartość nie jest liczbą całkowitą");
                scan.nextLine();
            }
        } while (tmp >= 0);
        return lista;
    }

    private static void printReverse(ArrayList<Integer> lista) {
        System.out.print("Odwrotna kolejność ");
        for (int i = lista.size() - 1; i >= 0; i--) {
            System.out.print(lista.get(i) + " ");
        }
        System.out.println(" ");
    }

    private static void sumElements(ArrayList<Integer> lista) {
        int sum = 0;
        System.out.print("Suma: ");
        for (int i = 0; i < lista.size(); i++) {
            sum += lista.get(i);
            if (i != lista.size() - 1)
                System.out.print(lista.get(i) + " + ");
            else
                System.out.print(lista.get(i) + " = ");
        }
        System.out.println(sum);
    }

}
