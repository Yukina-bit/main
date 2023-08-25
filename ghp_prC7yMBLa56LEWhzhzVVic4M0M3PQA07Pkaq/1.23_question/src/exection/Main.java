package exection;

import process.Sub;

public class Main {

	public static void main(String[] args) {
		// クラスをインスタンス化する
		Sub sub = new Sub();

		// getterを使ってプロパティを代入する
		sub.setName("ライオン");
		sub.setLength(2.1);
		sub.setSpeed(80);

		// nullチェック
		if (sub != null) {
			// setterを使ってプロパティを取得する
			System.out.println("動物名：" + sub.getName());
			System.out.println("体長：" + sub.getLength() + "m");
			System.out.println("速度：" + sub.getSpeed() + "km/h");
		}
	}

}