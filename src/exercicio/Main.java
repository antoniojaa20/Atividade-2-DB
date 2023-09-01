package exercicio;

import java.io.FileWriter;
import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class Main {
	public static void main(String[] args) throws IOException {		
	
            Document doc = Jsoup.connect("https://pt.wikipedia.org/wiki/BTS").get();
            
            try (FileWriter escritor = new FileWriter("titulos.txt")){
            	for (int i = 1; i <= 6; i++) {
            		String titulos = "h" + i; 
            		for (org.jsoup.nodes.Element title : doc.select(titulos)) {
                        String tituloTexto = title.text();
                        escritor.write(tituloTexto);
                        escritor.write(System.lineSeparator());
                        System.out.println("Títulos gravados com sucesso");
                    }
            	}
            }
            catch (IOException e) {
                e.printStackTrace();
                System.out.println("Erro ao escrever no arquivo");
            }
		}
	}
