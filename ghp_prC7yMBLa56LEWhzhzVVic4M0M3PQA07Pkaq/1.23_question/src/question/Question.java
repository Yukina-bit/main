package question;

public class Question {

	// フィールド変数を作成する
	private String name;
	private double length;
	private int speed;

	// getterメソッドを作成する
	public String getName() {
		return name;
	}
	
	public double getLength() {
		return length;
	}

	public int getSpeed() {
		return speed;
	}

	// setterメソッドを作成する
	public void setName(String name) {
		this.name = name;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public static void main(String[] args) {

		// クラスをインスタンス化する
		Question quest = new Question();
		
		// 変数に値を代入する
		String animal = "ライオン";
		double length = 2.1;
		int speed = 80;

		// setterメソッドに変数を渡す
		quest.setName(animal);
		quest.setLength(length);
		quest.setSpeed(speed);
		
		// getterメソッドでsetterでセットした変数を取得し出力する
		System.out.println("動物名：" + quest.getName());
		System.out.println("体長：" + quest.getLength() + "m");
		System.out.println("速度：" + quest.getSpeed() + "km/h");
	}

}