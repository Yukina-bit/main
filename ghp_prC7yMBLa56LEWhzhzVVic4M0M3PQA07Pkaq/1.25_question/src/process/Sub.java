package process;

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
	
	// フィールドを宣言する
	public int hp;
	public int mp;
	public int attack;
	public int speed;
	public int defence;

	// getterを作成する
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

	// setterを作成する
	public void setHp(int hp) {
		this.hp = hp;
	}

	public void setMp(int mp) {
		this.mp = mp;
	}

	public void setAttack(int attack) {
		this.attack = attack;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public void setDefence(int defence) {
		this.defence = defence;
	}
	
	// サブクラスを作成する
	public class StrSub extends Sub {
		// メソッドを作成する
		public void greeting1() {
			System.out.print("こんにちは「 ");
		}

		public void greeting2() {
			System.out.println(" 」さん\nステータス");
		}

		public void endingStr() {
			System.out.println("さあ冒険に出かけよう！");
		}

	}
}
