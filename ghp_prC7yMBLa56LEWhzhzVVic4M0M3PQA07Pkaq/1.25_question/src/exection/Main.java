package exection;

import java.util.Objects;

import process.Sub;

public class Main {

	public static void main(String[] args) {

		// クラスをインスタンス化する
		Sub sub = new Sub();
		// サブクラスのnullチェック
		if (Objects.nonNull(sub)) {
			// null出ないとき、メソッドを実行する
			sub.main();
		} else {
			// サブクラスがnullのとき出力する
			System.out.println("subがnullです");
		}
	}
}