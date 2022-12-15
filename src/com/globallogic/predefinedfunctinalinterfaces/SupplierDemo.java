package com.globallogic.predefinedfunctinalinterfaces;

import java.util.function.Supplier;

/*interface Supplier<R>{
    R get();
}*/
public class SupplierDemo {

	public static void main(String[] args) {

		Supplier<String> otps = () -> {
			String otp = "";

			for (int i = 1; i <= 4; i++) {
				otp = otp + (int) Math.random() * 10;
			}

			return otp;
		};

		System.out.println(otps.get());
		System.out.println(otps.get());

	}

}
