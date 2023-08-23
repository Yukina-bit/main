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

	// フィールド変数を作成する
	private String name;
	private double length;
	private int speed;

	// getterメソッドを作成する
	public String getName() {
		return name;
	}
	
	public double getLength() {
		return length;
	}

	public int getSpeed() {
		return speed;
	}

	// setterメソッドを作成する
	public void setName(String name) {
		this.name = name;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public static void main(String[] args) {

		// クラスをインスタンス化する
		Main main = new Main();
		
		// 変数に値を代入する
		String animal = "ライオン";
		double length = 2.1;
		int speed = 80;

		// setterメソッドに変数を渡す
		main.setName(animal);
		main.setLength(length);
		main.setSpeed(speed);
		
		// getterメソッドでsetterでセットした変数を取得し出力する
		System.out.println("動物名：" + main.getName());
		System.out.println("体長：" + main.getLength() + "m");
		System.out.println("速度：" + main.getSpeed() + "km/h");
	}

}