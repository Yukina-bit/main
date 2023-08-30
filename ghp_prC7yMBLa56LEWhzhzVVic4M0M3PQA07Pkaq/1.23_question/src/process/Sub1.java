package process;

public class Sub1 {
	/*
	 * 下記がコンソールに出力されるように作成してください
	    ※thisとsetterとgetterとフィールドを使ってください
	    
	    動物名：ライオン
	    体長：2.1m
	    速度：80km/h
	 * 
	 */

	// フィールドを宣言する
	private String name;
	private double length;
	private int speed;
	
	// getterを作成する
	public String getName() {
		return name;
	}
	public double getLength() {
		return length;
	}
	public int getSpeed() {
		return speed;
	}
	
	// setterを作成する
	public void setName(String name) {
		this.name = name;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
}
