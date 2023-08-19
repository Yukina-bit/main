package zikkou;

import shori.Question;

public class Sample {

	public static void main(String[] args) {
		// shoriパッケージのクラスを呼び出す
		Question str1 = new Question();
		// 変数を出力する
		System.out.println(str1.str);

		// shoriパッケージのクラスを呼び出す
		Question time = new Question();
		// 変数を出力する
		System.out.println("今の現在日時は " + time.timeStamp + " です");

	}

}