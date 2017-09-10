package br.com.aula03;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class OrdenaStrings3 {
	public static void main(String[] args) {

		List<String> palavras = new ArrayList<String>();
		palavras.add("alura");
		palavras.add("fiap");
		palavras.add("pucsp");

		palavras.sort((s1, s2) -> {
			if (s1.length() < s2.length())
				return -1;
			if (s1.length() > s2.length())
				return 1;
			return 0;

		});

		// palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));

		palavras.sort(Comparator.comparing(s -> s.length()));
		palavras.sort(Comparator.comparing(String::length));
		palavras.sort(Comparator.comparing(String::toLowerCase));

		Function<String, Integer> funcao = String::length;
		Function<String, Integer> funcao2 = s -> s.length();

		// new Function<String, Integer>() {
		// @Override
		// public Integer apply(String s) {
		// return s.length();
		// }
		// };

		Comparator<String> comparador = Comparator.comparing(funcao);

		System.out.println(palavras);

		Consumer<String> impressor = System.out::println;
		palavras.forEach(impressor);

		palavras.forEach(s -> System.out.println(s));

	}

}
