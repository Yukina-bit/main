package process;

import java.util.Random;
import java.util.Scanner;
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

	public void main() {
		// ユーザー名を入力してもらう
		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();

		// 未入力の場合、エラー文を出す
		if (name.length() == 0) {
			System.out.println("名前を入力してください");
		} else {
			// 上記以外の場合、出力する
			System.out.println("こんにちは「 " + name
					+ " 」さん\nステータス");
			System.out.println(sub.toString() + "\n");
			System.out.println("さあ冒険に出かけよう！");
		}
		// scaanerを閉じる
		scanner.close();
	}
}

// クラスを作成する
class Ability {
	// フィールドを宣言する
	int hp;
	int mp;
	int attack;

	public Ability(int hp, int mp, int attack) {
		this.hp = hp;
		this.mp = mp;
		this.attack = attack;
	}

	// 出力用のメソッドを作成する
	public String toString() {
		return "HP：" + this.hp + "\n" + "MP：" + this.mp + "\n" +
				"攻撃力：" + this.attack + "\n";
	}

}

// サブクラスを作成する
class AbilitySub extends Ability {
	// フィールドを作成する
	int speed;
	int defence;

	// getterを作成する
	public int getSpeed() {
		return speed;
	}

	public int getDefence() {
		return defence;
	}

	// setterを作成する
	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public void setDefence(int defence) {
		this.defence = defence;
	}

	public AbilitySub(int hp, int mp, int attack, int speed, int defence) {
		super(hp, mp, attack);
		this.speed = speed;
		this.defence = defence;
	}

	// メソッドを作成する
	public String toString() {
		return super.toString() + "素早さ：" + getSpeed() + "\n" +
				"攻撃力：" + getDefence();
	};

}
