package basicClass;

public class Dog {
	// Q1：フィールドに動物の名前の変数を定義してください。
	// Q2：フィールドに動物の数の変数を定義してください。
	// Q3：Q1で作成した変数に「犬」を代入するコンストラクタを作成してください。
	// Q4：Q2で作成した変数に引数を代入するコンストラクタを作成してください。

	// Q1 動物の名前の変数を定義する
	public String dog;

	// Q2 動物の数の変数を定義する
	public int dogNum;

	// Q3 変数に「犬」を代入するコンストラクタを作成する
	public Dog() {
		dog = "犬";
	}

	// Q4 変数に引数を代入するコンストラクタを作成する
	public Dog(int dogNum){
	    this.dogNum = dogNum;
	  }
	
}
