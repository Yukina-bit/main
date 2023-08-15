package curricilum_B;

import java.util.Random;
import java.util.Scanner;

public class Qes6 {

	/* Quest6
	 * [概要]入力した商品の残り台数が表示される
	 * [詳細]商品一覧内の値が入力された場合、残り台数をランダムで表示する。
	 */
	public static void main(String[] args) {
		// Scannerのインスタンス化
		Scanner scanner = new Scanner(System.in);
		// 入力値を読み取る
		String input = scanner.nextLine();
		// 入力値を「、」区切りで取得して配列に格納する
		String[] goods = input.split("、");
		// ランダムな数値を作成する
		Random rand = new Random();
		int stocks1 = rand.nextInt(11);
		int stocks2 = rand.nextInt(11);
		int stocks3 = rand.nextInt(11);
		int stocks4 = rand.nextInt(11);
		int stocks5 = rand.nextInt(11);
		int stocks6 = rand.nextInt(11);
		// 11からランダム値を引き算する
		int stocks7 = 11 - stocks6;

		// 文字列"テレビ"を作成する
		String tv = "テレビ";
		String result;

		// switch文で条件分岐する
		// 入力値がcaseに該当する場合、残数を表示する
		for (String item : goods) {
			switch (item) {
			case "パソコン":
				System.out.println("パソコンの残り台数は" + stocks1 + "台です\n");
				break;
			case "冷蔵庫":
				System.out.println("冷蔵庫の残り台数は" + stocks2 + "台です\n");
				break;
			case "扇風機":
				System.out.println("扇風機の残り台数は" + stocks3 + "台です\n");
				break;
			case "洗濯機":
				System.out.println("扇風機の残り台数は" + stocks4 + "台です\n");
				break;
			case "加湿器":
				System.out.println("加湿器の残り台数は" + stocks5 + "台です\n");
				break;
			// テレビ、ディスプレイは条件演算子で表示する
			case "テレビ":
			case "ディスプレイ":
				result = (item.equals(tv)) ? "テレビの残り台数は" + stocks6 + "台です\n"
						: "ディスプレイの残り台数は" + stocks7 + "台です\n";
				System.out.println(result);
				break;
			default:
				System.out.println("『 その他商品 』は指定の商品ではありません\n");

			}
			// Scannerをクローズ
			scanner.close();
		}

	}
}
