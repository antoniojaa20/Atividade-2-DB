import java.util.List;
public class Main {
	    public static void main(String[] args) {
	      
	        List<String> comentarios = List.of(
	                "Adorei minha estadia! Ótimo serviço e comida deliciosa.",
	                "O quarto estava limpo, mas o Wi-Fi era um pouco lento.",
	                "A localização do hotel é perfeita, perto de todas as atrações.",
	                "Não gostei do atendimento na recepção, mas o café da manhã era incrível.",
	                "As instalações do hotel são excelentes, especialmente a piscina."
	        );

	      
	        String[] palavrasPositivas = {"adorei", "ótimo", "perfeito", "incrível", "excelentes", "deliciosa"};
	        String[] palavrasNegativas = {"não gostei", "lento", "ruim"};

	     
	        for (String comentario : comentarios) {
	            String sentimento = Sentimentos.determinarSentimento(comentario, palavrasPositivas, palavrasNegativas);

	            System.out.println("Comentário: " + comentario);
	            System.out.println("Sentimento: " + sentimento + "\n");
	        }
	    }
	}
