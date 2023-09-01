package aula;

import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class Main {
	public static void main(String[] args) throws IOException {
		
		Document doc = Jsoup.connect("https://pt.wikipedia.org/wiki/Fórmula_1").get();
		
		System.out.println(doc.getElementsContainingOwnText("o verde para as equipes inglesas, "));
	}

}
