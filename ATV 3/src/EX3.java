import java.util.LinkedList;
import java.util.Scanner;

public class EX3 {

    public static LinkedList<Integer> intercalarOrdenadas(LinkedList<Integer> lista1, LinkedList<Integer> lista2) {
        LinkedList<Integer> resultado = new LinkedList<>();
        int i = 0, j = 0;

        while (i < lista1.size() && j < lista2.size()) {
            if (lista1.get(i) <= lista2.get(j)) {
                resultado.add(lista1.get(i));
                i++;
            } else {
                resultado.add(lista2.get(j));
                j++;
            }
        }

        while (i < lista1.size()) {
            resultado.add(lista1.get(i));
            i++;
        }

        while (j < lista2.size()) {
            resultado.add(lista2.get(j));
            j++;
        }

        return resultado;
    }

    public static LinkedList<Integer> lerLista(Scanner scanner, String nomeLista) {
        LinkedList<Integer> lista = new LinkedList<>();
        System.out.print("Quantos elementos deseja inserir na " + nomeLista + "? ");
        int n = scanner.nextInt();

        System.out.println("Digite os " + n + " elementos em ordem crescente:");
        for (int i = 0; i < n; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            int num = scanner.nextInt();
            lista.add(num);
        }

        return lista;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedList<Integer> lista1 = lerLista(scanner, "Lista 1");
        LinkedList<Integer> lista2 = lerLista(scanner, "Lista 2");

        LinkedList<Integer> intercalada = intercalarOrdenadas(lista1, lista2);

        System.out.println("\nLista 1: " + lista1);
        System.out.println("Lista 2: " + lista2);
        System.out.println("Lista Intercalada e Ordenada: " + intercalada);

        scanner.close();
    }
}
