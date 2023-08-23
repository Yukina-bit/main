package main;

/*
 * 下記がコンソールに出力されるように作成してください
    ※thisとsetterとgetterとフィールドを使ってください
    
    動物名：ライオン
    体長：2.1m
    速度：80km/h
 * 
 */

public class Main {

	class Name {
		// フィールドを宣言する
		private String name;

		// getterメソッドを作成する
		public String getName() {
			return name;
		}

		// setterメソッドを作成する
		public void setName(String name) {
			this.name = name;
		}
	}

	class Length {
		// フィールドを宣言する
		private double length;

		// getterメソッドを作成する
		public double getLength() {
			return length;
		}

		// setterメソッドを作成する
		public void setLength(double length) {
			this.length = length;
		}
	}

	class Speed {
		// フィールドを宣言する
		private int speed;

		// getterメソッドを作成する
		public int getSpeed() {
			return speed;
		}

		// setterメソッドを作成する
		public void setSpeed(int speed) {
			this.speed = speed;
		}
	}

	public static void main(String[] args) {

		// クラスをインスタンス化する
		Main main = new Main();
		Name name = main.new Name();
		Length length = main.new Length();
		Speed speed = main.new Speed();

		// 変数に値を代入する
		String animal = "ライオン";
		double doubleLength = 2.1;
		int intSpeed = 80;

		// setterメソッドに変数を渡す
		name.setName(animal);
		length.setLength(doubleLength);
		speed.setSpeed(intSpeed);

		// getterメソッドでsetterでセットした変数を取得し出力する
		System.out.println("動物名：" + name.getName());
		System.out.println("体長：" + length.getLength() + "m");
		System.out.println("速度：" + speed.getSpeed() + "km/h");
	}

}