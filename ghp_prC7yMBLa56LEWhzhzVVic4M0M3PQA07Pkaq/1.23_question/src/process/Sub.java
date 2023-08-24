package process;

public class Sub {
	/*
	 * 下記がコンソールに出力されるように作成してください
	    ※thisとsetterとgetterとフィールドを使ってください
	    
	    動物名：ライオン
	    体長：2.1m
	    速度：80km/h
	 * 
	 */

	public class Name {
		// フィールドを宣言する
		private String name;

		// getterメソッドを作成する
		public String getName() {
			return name;
		}

		// setterメソッドを作成する
		public void setName(String name) {
			this.name = name;
		}
	}

	public class Length {
		// フィールドを宣言する
		private double length;

		// getterメソッドを作成する
		public double getLength() {
			return length;
		}

		// setterメソッドを作成する
		public void setLength(double length) {
			this.length = length;
		}
	}

	public class Speed {
		// フィールドを宣言する
		private int speed;

		// getterメソッドを作成する
		public int getSpeed() {
			return speed;
		}

		// setterメソッドを作成する
		public void setSpeed(int speed) {
			this.speed = speed;
		}
	}

}
