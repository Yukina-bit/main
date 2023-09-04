package main;

import person.Person;

class Main {
	public static void main(String[] args) {
		// コンストラクタを作成し、値を渡す
		Person person1 = new Person("鈴木太郎", 20, 1.7, 60);

		// 出力する
		System.out.println(person1.name);
		System.out.println(person1.age);
		System.out.println(person1.height);

		// 出力用のメソッドを表示
		person1.print();
		// 合計人数を出力するメソッドを表示
		Person.printCount();

	}
}