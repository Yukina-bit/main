package exection;

import java.util.Objects;

import process.Sub;

public class Main {

	public static void main(String[] args) {

		Sub sub = new Sub();

		if (Objects.nonNull(sub)) {
			sub.main();
		} else {
			System.out.println("subがnullです");
		}
	}
}