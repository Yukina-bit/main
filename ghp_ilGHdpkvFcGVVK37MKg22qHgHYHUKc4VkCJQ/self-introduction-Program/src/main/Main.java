package main;

import person.Person;
import vehicle.Bicycle;
import vehicle.Car;

class Main {
	public static void main(String[] args) {
		// コンストラクタを作成し、値を渡す
		Person person1 = new Person("鈴木太郎", 20, 1.7, 60);
		Person person2 = new Person("山田花子", 22, 1.5, 40);

		Car car = new Car();
		Bicycle bicycle = new Bicycle();

		//ownerを設定
		car.setOwner(person1.name);
		bicycle.setOwner(person2.name);
		System.out.println(car.getOwner());
		System.out.println(bicycle.getOwner());

		// 乗り物を購入
		person1.buy(car);
		person2.buy(bicycle);

		// 出力する
		//		System.out.println(person1.name);
		//		System.out.println(person1.age);
		//		System.out.println(person1.height);

		// 出力用のメソッドを表示
		//		person1.print();
		// 合計人数を出力するメソッドを表示
		//		Person.printCount();

	}
}