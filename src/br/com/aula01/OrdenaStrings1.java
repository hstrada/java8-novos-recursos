package br.com.aula01;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class OrdenaStrings1 {

	public static void main(String[] args) {

		List<String> palavras = new ArrayList<String>();
		palavras.add("alura");
		palavras.add("fiap");
		palavras.add("pucsp");

		Comparator<String> comparador = new ComparadorPorTamanho();

		palavras.sort(comparador);
		
		// Collections.sort(palavras, comparador);
		System.out.println(palavras);
		
		// for (String p : palavras) {
		// System.out.println(p);
		// }
		
		Consumer<String> consumidor = new ImprimeNaLinha();
		palavras.forEach(consumidor);

	}

}

class ImprimeNaLinha implements Consumer<String> {
	public void accept(String s) {
		System.out.println(s);
	}
}

class ComparadorPorTamanho implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {
		if (s1.length() < s2.length())
			return -1;
		if (s1.length() > s2.length())
			return 1;
		return 0;
	}

}