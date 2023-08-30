package process;

import java.util.Random;

/*
 * 名前を入力したら下記がコンソールに出力されるように作ってください
    条件：数値は毎回変わるように作ってください
         サブクラスを使用してください
         スーパークラスを使用してください
         getterとsetterを使用してください
         packageを2つ作ってメインと処理を分けてください
         命名する場合は規則にのっとってください
         コンストラクタを使用してください

    こんにちは 「 名前 」 さん
    ステータス
    HP：849
    MP：862
    攻撃力：375
    素早さ：937
    防御力：24

    さあ冒険に出かけよう！
 * 
 */
public class Sub {

	// ランダムな値を作成する
	Random rand = new Random();
	AbilitySub sub = new AbilitySub(rand.nextInt(999), rand.nextInt(999),
			rand.nextInt(999), rand.nextInt(999), rand.nextInt(999));

	public void AbilityProcess() {
		System.out.println(sub + "\n");
	}

}