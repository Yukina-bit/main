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

	// フィールド変数を作成する
	public String openingStr1;
	public String openingStr2;
	public String endingStr;
	private int hp;
	private int mp;
	private int attack;
	private int speed;
	private int defence;

	// getterメソッドを作成する
	public int getHp() {
		return hp;
	}

	public int getMp() {
		return mp;
	}

	public int getAttack() {
		return attack;
	}

	public int getSpeed() {
		return speed;
	}

	public int getDefence() {
		return defence;
	}

	// コンストラクタを作成する
	public Sub() {
		openingStr1 = "こんにちは「 ";
		openingStr2 = " 」さん";
		endingStr = "さあ冒険に出かけよう！";
	}

	// setterメソッドを作成する
	public void setName(int hp, int mp, int attack, int speed, int defence) {
		this.hp = hp;
		this.mp = mp;
		this.attack = attack;
		this.speed = speed;
		this.defence = defence;
	}

	// サブクラスを作成する
	public class SubClass extends Sub {
		Random rand = new Random();
		int numHp = rand.nextInt(999);
		int numMp = rand.nextInt(999);
		int numAttack = rand.nextInt(999);
		int numSpeed = rand.nextInt(999);
		int numDefence = rand.nextInt(999);
		{
			// 変数に値を代入する
			hp = numHp;
			mp = numMp;
			attack = numAttack;
			speed = numSpeed;
			defence = numDefence;
			// setterメソッドに変数を渡す
			setName(hp, mp, attack, speed, defence);
		}

	}

}
