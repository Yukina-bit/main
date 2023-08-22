package curricilum_B;

import java.util.Scanner;

public class Qes7 {
	/* Quest7
	 * [概要]N人の生徒の成績を管理する
	 * [詳細]入力された生徒の成績を平均し、表示する。
	 */
	public static void main(String[] args) {
		// Scannerのインスタンス化
		Scanner stdIn = new Scanner(System.in);
		// 各科目名を配列に格納する
		String[] subjects = { "英語", "数学", "理科", "社会" };
		System.out.print("生徒の人数を入力してください（2以上）");

		// 生徒の人数の読み取りを行う
		int num = stdIn.nextInt();

		// 入力値が2よりも小さい場合、入力をループする
		while (num < 2) {
			System.out.print("生徒の人数を入力してください（2以上）");
			num = stdIn.nextInt();
		}

		/* 入力値が2よりも大きい場合、下記の処理を行う
		 * subjects[]をループし、各科目の点数の読み取りを行う
		 */
		if (num >= 2) {
			int[][] scores = new int[num][subjects.length];
			for (int i = 0; i < scores.length; i++) {
				for (int j = 0; j < scores[i].length; j++) {
					System.out.print((i + 1) + "人目の『" + subjects[j] + "』の点数を入力してください：");
					scores[i][j] = stdIn.nextInt();
				}
				// 改行する
				System.out.println();
			}

			// 生徒毎の平均点を計算し、表示する
			for (int i = 0; i < scores.length; i++) {
				int sum = 0;
				for (int score : scores[i]) {
					sum += score;
				}
				System.out.println((i + 1) + "人目の平均点は" +
						String.format("%.2f", (double) sum / scores[i].length) + "点です。");
			}
			// 改行する
			System.out.println();

			// 科目毎の平均点を計算し、表示する
			for (int i = 0; i < subjects.length; i++) {
				int sum = 0;
				for (int j = 0; j < scores.length; j++) {
					sum += scores[j][i];
				}
				System.out.println(subjects[i] + "の平均点は" +
						String.format("%.2f", (double) sum / scores.length) + "点です。");
			}
			// sumを初期化
			int sum = 0;
			// 全体の平均点を計算し、表示する
			for (int i = 0; i < scores.length; i++) {
				for (int j = 0; j < scores[i].length; j++) {
					sum += scores[i][j];
				}
			}
			int allaverage = sum / (4 * num);
			System.out.println("全体の平均点は" + String.format("%.2f", (double) allaverage) + "点です。");
		}
		// // Scannerをクローズ
		stdIn.close();
	}
}
