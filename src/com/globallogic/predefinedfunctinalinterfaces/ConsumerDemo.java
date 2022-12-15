package com.globallogic.predefinedfunctinalinterfaces;

import java.util.function.Consumer;

/*interface Consumer<T> {
	void accept(T t);
}*/
public class ConsumerDemo {

	public static void main(String[] args) {

		char[] letters = { 'a', 'b', 'c', 'd', 'e' };

		Consumer<Character> consumer = letter -> System.out.println(letter);

		for (char c : letters) {
			consumer.accept(c);
		}

	}

}
