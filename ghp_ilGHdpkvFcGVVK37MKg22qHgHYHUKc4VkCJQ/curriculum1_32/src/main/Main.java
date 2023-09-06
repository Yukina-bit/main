package main;

import person.Person;

public class Main {

	public static void main(String[] argos) {
		Person person1 = new Person("鈴木太郎", 20, 1.7, 60);
		person1.print();

		Person person2 = new Person("山田花子", 22, 1.5, 40);
		person2.print();

		// 合計人数を出力する
		System.out.println("合計" + Person.count + "人です\n");
		// 合計人数を出力するメソッドを表示
		Person.printCount();
	}

}
