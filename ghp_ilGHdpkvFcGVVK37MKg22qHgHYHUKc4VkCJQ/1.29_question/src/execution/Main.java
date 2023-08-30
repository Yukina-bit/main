package execution;

import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;
import java.util.Scanner;
import java.util.stream.Stream;

import process.Sub;

public class Main {

	public static void main(String[] args) {

		// サブクラスをインスタンス化する
		Sub sub = new Sub(0);
		// 入力値を読み取る
		System.out.println("1〜10の数字を入力してください。");
		Scanner sc = new Scanner(System.in);

		// 「,」で区切った入力値を配列に格納する
		String[] input = sc.nextLine().split(",");

		// String型配列をint型配列に変換
		int[] intInput = Stream.of(input).mapToInt(Integer::parseInt).toArray();

		// int型配列をInteger型に変換
		Integer[] boxedArray = new Integer[intInput.length];
		for (int i = 0; i < intInput.length; i++) {
			boxedArray[i] = Integer.valueOf(intInput[i]);
		}

		// 昇順・降順の値を入力してもらう
		System.out.print("出力順を選択してください（1：昇順 or 2：降順）-- >");
		int sort = sc.nextInt();
		// サブクラスのnullチェック
		if (Objects.nonNull(sub)) {

			if (sort == 1) {
				// 配列の数値を昇順に並べ替え
				Arrays.sort(boxedArray);
			} else if (sort == 2) {
				// 配列の数値を降順に並べ替え
				Arrays.sort(boxedArray, Collections.reverseOrder());
			} else {
				// 1.2以外が入力された場合出力する
				System.out.println("入力値に誤りがあります。");
			}
		} else {
			System.out.println("sub is null.");
		}

		// 格納された分だけループする
		for (int intInputs : boxedArray) {
			// メソッドを呼び出す
			sub.getInfo(intInputs);
		}

		// スキャナーを閉じる
		sc.close();
	}
}
