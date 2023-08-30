package process;

public class AbilitySub extends Ability {

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