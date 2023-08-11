package curricilum_B;

public class Qes4 {
	/* Ques4
	 * [概要]掛け算をコンソール上へ表示する
	 * [詳細]各数値が2桁になるよう0埋めして表示する
	 */
	public static void main(String[] args) {
		// iを1から9まで繰り返す
		for (int i = 1; i <= 9; i++) {
			// jを1から9まで繰り返す
			for (int j = 1; j <= 9; j++) {
				// iとjを掛け算する式を作成する
				int answer = i * j;
				// 「i * j = answer ||」をコンソール上へ表示する
				System.out.print(String.format("%02d", i) + " * " + String.format("%02d", j) + " = "
						+ String.format("%02d", answer) + " || ");
			}
			// 改行する
			System.out.println();
		}
	}
}