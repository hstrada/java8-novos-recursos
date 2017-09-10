package br.com.aula02;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class OrdenaStrings2 {

	public static void main(String[] args) {

		List<String> palavras = new ArrayList<String>();
		palavras.add("alura");
		palavras.add("fiap");
		palavras.add("pucsp");

		// Comparator<String> comparador = new ComparadorPorTamanho();

		// palavras.sort(comparador);

		palavras.sort((s1, s2) -> {
			if (s1.length() < s2.length())
				return -1;
			if (s1.length() > s2.length())
				return 1;
			return 0;

		});

		palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));

		System.out.println(palavras);

		// Consumer<String> consumidor = new Consumer<String>() {
		//
		// @Override
		// public void accept(String s) {
		// System.out.println(s);
		//
		// }
		//
		// };

		// palavras.forEach(new Consumer<String>() {
		//
		// @Override
		// public void accept(String s) {
		// System.out.println(s);
		//
		// }
		//
		// });

		// palavras.forEach((String s) -> {
		// System.out.println(s);
		// });

		palavras.forEach(s -> System.out.println(s));

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