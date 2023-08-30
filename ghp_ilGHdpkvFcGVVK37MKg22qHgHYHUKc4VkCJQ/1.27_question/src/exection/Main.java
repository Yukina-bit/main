package exection;

import java.util.Objects;
import java.util.Scanner;

import process.Sub;

// 実行クラス
public class Main {

	public static void main(String[] args) {
		// クラスをインスタンス化する
		Sub sub = new Sub();

		// ユーザーに入力してもらう
		Scanner scanner = new Scanner(System.in);
		System.out.println("コンソールに文字を入力してください");
		// 入力値を読み取る
		String input = scanner.nextLine();
		// 入力値を「,」区切りで取得して配列に格納する
		String[] inputAnimal = input.split(",");

		// 入力値がない場合、エラー文を出力する
		if (input.length() == 0) {
			System.out.println("【エラー】コンソールに文字を入力してください");
		} else {
			// サブクラスのnullチェックをする
			if (Objects.nonNull(sub)) {
				// 上記以外の場合、入力値によって結果を出力する
				for (String animal : inputAnimal) {
					switch (animal) {
					case "ライオン:2.1:80":
						sub.i = 0;
						sub.main();
						break;
					case "ゾウ:3.2:40":
						sub.i = 1;
						sub.main();
						break;
					case "パンダ:1.9:30":
						sub.i = 2;
						sub.main();
						break;
					case "チンパンジー:0.94:25":
						sub.i = 3;
						sub.main();
						break;
					case "シマウマ:2.4:65":
						sub.i = 4;
						sub.main();
						break;
					case "インコ:0.1:50":
						sub.i = 5;
						sub.main();
						break;
					default:
						System.out.println("対象はありません\n");
					}
				}
			} else {
				System.out.println("subがnullです");
			}
			// スキャナーを閉じる
			scanner.close();
		}
	}
}