package process;

public class GetterSetterAnimal {

	// 配列を作成する
	private String[] animalNames = { "ライオン", "ゾウ", "パンダ", "チンパンジー", "シマウマ", "インコ" };
	private double[] height = { 2.1, 3.2, 1.9, 0.94, 2.4, 0.1 };
	private int[] speed = { 80, 40, 30, 25, 65, 50 };
	private String[] scientificNames = { "パンテラ レオ", "ロキソドンタ・サイクロティス", "アイルロポダ・メラノレウカ",
			"パン・トゥログロディテス", "チャップマンシマウマ", "不明" };
	
	// getterを作成する
		public String[] getAnimalNames() {
			return animalNames;
		}

		public double[] getHeight() {
			return height;
		}

		public int[] getSpeed() {
			return speed;
		}

		public String[] getScientificNames() {
			return scientificNames;
		}

		// setterを作成する
		public void setAnimalNames(String[] animalNames) {
			this.animalNames = animalNames;
		}

		public void setHeight(double[] height) {
			this.height = height;
		}

		public void setSpeed(int[] speed) {
			this.speed = speed;
		}

		public void setScientificNames(String[] scientificNames) {
			this.scientificNames = scientificNames;
		}	
}
