package com.globallogic.predefinedfunctinalinterfaces;

import java.util.function.BiConsumer;

/*interface BiConsumer<T, U> {
	void accept(T t, U u);
}*/

public class BiConsumerDemo {

	public static void main(String[] args) {

		BiConsumer<Integer, Integer> add = (a, b) -> System.out.println(a + b);

		add.accept(2, 8);
		add.accept(80, 63);

	}

}
