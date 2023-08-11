package curricilum_B;

import java.util.Random;
import java.util.Scanner;

public class Qes1_3 {

	/* Quest1,2
	 * [概要]ユーザー名の登録
	 * [詳細]コンソールに入力し、エンターキーを押すと実行される。入力値が正常な場合、
	 * ユーザー名を登録し、Quest3を実行する。
	 */
	public static void main(String[] args) {
		// Scannerのインスタンス化
		Scanner scanner = new Scanner(System.in);
		// ユーザー名の読み取りを行う
		String name = scanner.nextLine();

		// nameが10文字以上であれば「名前を10文字以内にしてください」と表示する
		if (name.length() > 10) {
			System.out.println("「名前を10文字以内にしてください」");
			// nameが空白の時「名前を入力してください」と表示する
		} else if (name.isEmpty()) {
			System.out.println("「名前を入力してください」");
			// nameが半角英数字以外の場合「半角英数字のみで名前を入力してください」と表示する
		} else if (name.matches("[^A-Za-z0-9]+$")) {
			System.out.println("「半角英数字のみで名前を入力してください」");
			// nameが正常な値の場合「ユーザー名〇〇を登録しました」と表示する
		} else {
			System.out.println("ユーザー名「" + name + "」を登録しました");

			/* Quest3
			 * じゃんけん。ユーザーが手を入力後、pcのランダムな手と対戦する。
			 * ユーザーが勝利するまで処理を繰り返す。
			 */

			// 勝敗の数を初期化する
			int winCount = 0;
			int loseCount = 0;

			// Scannerのインスタンス化
			Scanner stdin = new Scanner(System.in);
			// 一勝するまでループする
			while (winCount < 1) {

				// メッセージを表示する
				System.out.println("グー：0,チョキ：1,パー：2 どれかの数字をいれてください。");

				// ユーザーの手を読みとる
				int userHands = stdin.nextInt();

				// 入力値が0〜2以外の値であれば、メッセージを再表示する
				while (userHands < 0 || userHands > 2) {
					System.out.println("グー：0,チョキ：1,パー：2 どれかの数字をいれてください。");
					userHands = stdin.nextInt();
				}

				// PCのじゃんけんの手をランダムにする
				Random rand = new Random();
				int pcHands = rand.nextInt(3);

				// resultを初期化する
				String result = null;

				// あいこの場合
				if (userHands == pcHands) {
					result = "DRAW あいこ もう一回しましょう！";
					loseCount++;
					// ユーザーが勝利した場合
				} else if ((userHands == 0 && pcHands == 1) ||
						(userHands == 1 && pcHands == 2) ||
						(userHands == 2 && pcHands == 0)) {
					result = "やるやん。次は俺にリベンジさせて";
					winCount++;
					// pcにグーで負けた場合
				} else if (userHands == 1 && pcHands == 0) {
					result = "俺の勝ち！\n負けは次につながるチャンスです！\nネバーギブアップ";
					loseCount++;
					// pcにチョキで負けた場合
				} else if (userHands == 2 && pcHands == 1) {
					result = "俺の勝ち！\nたかがじゃんけん、そう思ってないですか？\nそれやったら次も俺が勝ちますよ。";
					loseCount++;
					// pcにパーで負けた場合
				} else if (userHands == 0 && pcHands == 2) {
					result = "俺の勝ち！\nなんで負けたか、明日まで考えといてください。\nそしたら何か見えてくるはずです";
					loseCount++;
				}

				// 勝ち数と負け数を足し算する
				int answer = loseCount + winCount;

				// 判定結果を表示
				String[] hands = { "グー", "チョキ", "パー" };
				System.out.println(name + "の手は「" + hands[userHands] + "」");
				System.out.println("相手の手は「" + hands[pcHands] + "」");
				System.out.println(result);
				if (winCount >= 1) {
					System.out.println("勝つまでにかかった合計回数は" + answer + "回です");
				}
			}
			// Scannerをクローズ
			scanner.close();
			stdin.close();
		}
	}
}
