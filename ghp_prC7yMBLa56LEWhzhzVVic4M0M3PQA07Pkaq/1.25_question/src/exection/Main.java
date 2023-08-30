package exection;

import java.util.Objects;
import java.util.Scanner;

import process.Sub;

public class Main {

	public static void main(String[] args) {

		// クラスをインスタンス化する
		Sub sub = new Sub();

		// ユーザー名を入力してもらう
		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();

		if (name.length() == 0) {
			// 未入力の場合、エラー文を出す
			System.out.println("名前を入力してください");
		} else {
			// 上記以外の場合、出力する
			// サブクラスのnullチェック
			if (Objects.nonNull(sub)) {
				System.out.println("こんにちは「 " + name+ " 」さん\nステータス");
				sub.AbilityProcess();
				System.out.println("さあ冒険に出かけよう！");
			} else {
				// サブクラスがnullのとき出力する
				System.out.println("subがnullです");
			}
		}
		//scaanerを閉じる
		scanner.close();
	}

}
