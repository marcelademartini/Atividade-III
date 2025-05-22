import java.util.*;

public class EX1 {
    public static int calcularDiasAteEstabilizar(int[] cargas) {
        List<Integer> servidores = new ArrayList<>();
        for (int carga : cargas) {
            servidores.add(carga);
        }

        int dias = 0;

        boolean teveDesligamento;

        do {
            teveDesligamento = false;
            Stack<Integer> novaLista = new Stack<>();
            novaLista.push(servidores.get(0)); 

            for (int i = 1; i < servidores.size(); i++) {
                if (servidores.get(i) > servidores.get(i - 1)) {
                    teveDesligamento = true;
                    // não adiciona à nova lista -> será desligado
                } else {
                    novaLista.push(servidores.get(i));
                }
            }

            if (teveDesligamento) {
                // preparar para o próximo dia
                servidores = new ArrayList<>(novaLista);
                dias++;
            }

        } while (teveDesligamento);

        return dias;
    }

    public static void main(String[] args) {
        int[] cargas = {30, 25, 40, 20, 35, 50, 45};
        int dias = calcularDiasAteEstabilizar(cargas);
        System.out.println("Número de dias até estabilizar: " + dias);
    }
}
