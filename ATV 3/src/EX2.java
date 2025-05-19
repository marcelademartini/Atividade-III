import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class EX2 {

    public static int simularJogo(int n, int k) {
        Queue<Integer> fila = new LinkedList<>();

        for (int i = 1; i <= n; i++) {
            fila.add(i);
        }

        while (fila.size() > 1) {
            for (int i = 1; i < k; i++) {
                int participante = fila.poll(); 
                fila.add(participante);         

            }

            int eliminado = fila.poll();
            System.out.println("Participante eliminado: " + eliminado);
        }

        return fila.peek(); 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o número de participantes (n): ");
        int n = scanner.nextInt();

        System.out.print("Informe o número de batidas (k): ");
        int k = scanner.nextInt();

        int vencedor = simularJogo(n, k);

        System.out.println("\nO vencedor é o participante número: " + vencedor);

        scanner.close();
    }
}
