package process;

public class Ability {

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
