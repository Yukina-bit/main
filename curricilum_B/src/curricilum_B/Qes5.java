package curricilum_B;

public class Qes5 {
	/* Qes5
	 * [概要]掛け算をコンソール上へ表示する
	 * [詳細]各数値が3桁になるよう0埋めして表示する
	 */
	public static void main(String[] args) {
		// jを1から9まで繰り返す
		for (int j = 1; j <= 9; j++) {
			// iを1から20まで繰り返す
			for (int i = 1; i <= 20; i++) {
				// iとjを掛け算する式を作成する
				int answer = i * j;
				// 「i * j = answer ||」をコンソール上へ表示する
				System.out.print(String.format("%03d", i) + " * " + String.format("%03d", j) + " = "
						+ String.format("%03d", answer) + " || ");
			}
			// 改行する
			System.out.println();
		}
	}

}
