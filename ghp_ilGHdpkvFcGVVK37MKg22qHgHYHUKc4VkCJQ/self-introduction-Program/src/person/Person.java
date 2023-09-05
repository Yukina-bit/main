package person;

import vehicle.Bicycle;
import vehicle.Car;

public class Person {
	// インスタンスフィールドを定義
	public String name;
	public int age;
	public double height;
	public double weight;
	static int count = 0;

	// コンストラクタを定義しインスタンスフィールドに値をセット
	public Person(String name, int age, double height, double weight) {
		Person.count++;
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}

	// BMIの計算メソッド
	public double bmiCalc() {
		return this.weight / ((this.height) * (this.height));
	}

	// 出力用メソッド
	public void print() {
		System.out.println("名前は" + this.name + "です");
		System.out.println("年は" + this.age + "才です");
		// BMIは小数点切り捨て
		System.out.println("BMIは" + Math.floor(bmiCalc()) + "です\n");
	}

	// 合計人数を出力するメソッド
	public static void printCount() {
		System.out.println("合計" + Person.count + "人です\n");
	}

	// ownerメソッドの値をセットし、出力するメソッド
	public void buy(Car car) {
		car.setOwner(this.name);
		System.out.println(car.getOwner() + "が購入しました");
	}

	// ownerメソッドの値をセットし、出力するメソッド
	public void buy(Bicycle bicycle) {
		bicycle.setOwner(this.name);
		System.out.println(bicycle.getOwner() + "が購入しました");
	}

}