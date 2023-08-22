package basicClass;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Animal {

	public static void main(String[] args) {
		// Q1：Dogクラスを呼び出して変数に代入し、動物の名前をコンソールに出力してください。
		// Q2：Dogクラスを呼び出して変数に代入し、動物の数をコンソールに出力してください。
		// 現在の日時を「yyyy-MM-dd H:m:s」形式で変数に代入して、コンソールに出力してください

		// Q1 
		// Dogクラスを呼び出す
		Dog dogClass = new Dog();
		// Dogクラス 変数godを出力する
		System.out.println(dogClass.dog + "\n");

		// Q2
		// Dogクラス 変数dogNumを出力する
		Dog num = new Dog(4);
		System.out.println(num.dogNum + "\n");

		// Q3
		// 日付（今回は現在の日時）を取得する
		Date exDate = new Date();
		// 「yyyy-MM-dd H:m:s」形式に指定する
		SimpleDateFormat exDateFormat = new SimpleDateFormat("yyyy-MM-dd H:m:s");
		// フォーマットを指定し出力する
		System.out.println(exDateFormat.format(exDate));

	}
}
