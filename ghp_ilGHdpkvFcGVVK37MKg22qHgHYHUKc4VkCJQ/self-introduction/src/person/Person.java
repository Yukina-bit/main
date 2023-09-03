package person;

import vehicle.Bicycle;
import vehicle.Car;

public class Person {
	// インスタンスフィールドを定義
	public String firstName, lastName;
	public int age;
	public double height, weight;
	static int count = 0;

	// コンストラクタを定義しインスタンスフィールドに値をセット
	public Person(String firstName, String lastName, int age, double height, double weight) {
		Person.count++;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}

	// 合計人数を出力するメソッド
	public static void printCount() {
		System.out.println("合計" + Person.count + "人です\n");
	}

	// 出力用メソッド
	public void print() {
		System.out.println("名前は" + this.fullName() + "です");
		System.out.println("年は" + this.age + "才です");
		// BMIは小数点切り捨て
		System.out.println("BMIは" + Math.floor(bmiCalc()) + "です\n");
	}

	// BMIの計算メソッド
	public double bmiCalc() {
		return this.weight / ((this.height) * (this.height));
	}

	// フルネームにするメソッド
	public String fullName() {
		return this.firstName + this.lastName;
	}

	// ownerメソッドの値をセットし、出力するメソッド
	public void buy(Car car) {
		car.setOwner(this.fullName());
		System.out.println(car.getOwner() + "が購入しました");
	}

	// ownerメソッドの値をセットし、出力するメソッド
	public void buy(Bicycle bicycle) {
		bicycle.setOwner(this.fullName());
		System.out.println(bicycle.getOwner() + "が購入しました");
	}
}