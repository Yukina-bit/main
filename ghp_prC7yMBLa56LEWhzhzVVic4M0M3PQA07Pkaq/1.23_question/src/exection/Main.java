package exection;

import java.util.Objects;

import process.Sub;

public class Main {

	public static void main(String[] args) {
		// クラスをインスタンス化する
		Sub sub = new Sub();

		// getterを使ってプロパティを代入する
		sub.setName("ライオン");
		sub.setLength(2.1);
		sub.setSpeed(80);

		// サブクラスnullチェック
		if (Objects.nonNull(sub)) {
			// 名前nullチェック
			if (Objects.nonNull(sub.getName())) {
				// 文章を作成する　
				System.out.println("動物名：" + sub.getName());
				System.out.println("体長：" + sub.getLength() + "m");
				System.out.println("速度：" + sub.getSpeed() + "km/h");
			} else {
				// 名前がnullの場合に出力する
				System.out.println("nameはnullです");
			}
		} else {
			// サブクラスがnullの場合に出力する
			System.out.println("subはnullです");
		}
	}
}