package streams.lista12.exercicio04;

import java.util.List;

public class UtilTexto {

    public static List<String> processarLista(
            List<String> lista, TransformadorTexto regra) {

        return lista.stream()
                .map(texto -> regra.transformar(texto))
                .toList();
    }
}