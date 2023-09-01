import java.util.ArrayList;
import java.util.List;

public class Sentimentos {
    public static void main(String[] args) {
       
        List<String> comentarios = new ArrayList<>();
        comentarios.add("Adorei minha estadia! Ótimo serviço e comida deliciosa.");
        comentarios.add("O quarto estava limpo, mas o Wi-Fi era um pouco lento.");
        comentarios.add("A localização do hotel é perfeita, perto de todas as atrações.");
        comentarios.add("Não gostei do atendimento na recepção, mas o café da manhã era incrível.");
        comentarios.add("As instalações do hotel são excelentes, especialmente a piscina.");

        String[] palavrasPositivas = {"adorei", "ótimo", "perfeito", "incrível", "excelentes", "deliciosa"};
        String[] palavrasNegativas = {"não gostei", "lento", "ruim"};

        for (String comentario : comentarios) {
            String comentarioLower = comentario.toLowerCase();
            String sentimento;

            if (contemPalavraChave(comentarioLower, palavrasPositivas)) {
                sentimento = "positivo";
            } else if (contemPalavraChave(comentarioLower, palavrasNegativas)) {
                sentimento = "negativo";
            } else {
                sentimento = "neutro";
            }

            System.out.println("Comentário: " + comentario);
            System.out.println("Sentimento: " + sentimento + "\n");
        }
    }

    private static boolean contemPalavraChave(String texto, String[] palavrasChave) {
        for (String palavra : palavrasChave) {
            if (texto.contains(palavra)) {
                return true;
            }
        }
        return false;
    }

	public static String determinarSentimento(String comentario, String[] palavrasPositivas,
			String[] palavrasNegativas) {
		return null;
	}
}
