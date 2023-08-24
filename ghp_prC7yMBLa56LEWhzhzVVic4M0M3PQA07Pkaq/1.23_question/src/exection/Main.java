package exection;

import java.util.Objects;

import process.Sub;
import process.Sub.Length;
import process.Sub.Name;
import process.Sub.Speed;

public class Main {

	// クラスをインスタンス化する
	static Sub sub = new Sub();
	static Name name = sub.new Name();
	static Length length = sub.new Length();
	static Speed speed = sub.new Speed();

	public static void main(String[] args) {

		// 変数に値を代入する
		String animal = "ライオン";
		double doubleLength = 2.1;
		int intSpeed = 80;
		String objNull = null;

		// setterメソッドに変数を渡す
		name.setName(animal);
		length.setLength(doubleLength);
		speed.setSpeed(intSpeed);

		// nullチェック
		if (Objects.nonNull(objNull)) {
			System.out.print(objNull);
		} else {
			// nullではなかった場合、下記の処理を実行する
			// getterメソッドでsetterでセットした変数を取得し出力する
			System.out.println("動物名：" + name.getName());
			System.out.println("体長：" + length.getLength() + "m");
			System.out.println("速度：" + speed.getSpeed() + "km/h");
		}
	}
}