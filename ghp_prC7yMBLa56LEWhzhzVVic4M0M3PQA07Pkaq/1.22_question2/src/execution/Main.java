package execution;

import process.Sub;

public class Main {

	public static void main(String[] args) {

		// 処理パッケージのクラスを呼び出す
		Sub subStr = new Sub();

		// 変数を出力する
		System.out.println(subStr.countryStr);
		System.out.println(subStr.foodStr);
		System.out.println(subStr.cookStr);
		System.out.println("今の現在日時は " + subStr.timeStamp + " です");
	}
}
