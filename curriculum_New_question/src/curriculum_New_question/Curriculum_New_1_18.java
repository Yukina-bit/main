package curriculum_New_question;

import java.util.Arrays;
import java.util.Random;

public class Curriculum_New_1_18 {

	// Q1：引数に文字列型と整数型をいれてコンソールに「Hello JavaSE 11」と出力するメソッドを作成してください。

	// Q2：引数に整数を渡すと渡した値同士を乗算しコンソールに出力するメソッドを作成してください

	// Q3：引数として整数の配列を渡すと、受け取った値を順番にコンソールに出力するメソッドを作成してください

	// Q4：Q2をオーバーロードして引数を小数2つに変更し、引数同士を和算しコンソールに出力してください。

	// Q5：引数に整数を渡すと、1～100までのランダムな数字を引数の回数分格納して
	// 格納した値を順番にコンソールで出力後、格納した値を返すメソッドを作成してください。
	// ※0は出力＆格納しないようにしてください。

	// Q6：引数にQ5で作成したメソッドの返り値を受け取り、受け取った配列の要素の平均値をコンソールに出力するメソッドを作成してください。
	// ※小数点以下も表示されるようにしてください。

	// Q7：引数にQ6で作成したメソッドの返り値を受け取り、受け取った値が50以上ならばtrueそれ以外はfalseを返しコンソールに出力してください

	// Q1
	//  String型とint型を引数にし、連結させて返す
	public static String printData(String hello, int num) {
		String que1 = hello + num;
		return que1;
	}

	// Q2
	// int型を引数にし、合算して返す
	public static int addNumber(int num1, int num2) {
		int que2 = num1 + num2;
		return que2;
	}

	// Q3
	// int型配列を引数にし、順番に出力する
	public static void printArray(int[] ar) {
		for (int que3 : ar) {
			System.out.print(que3 + " ");
		}
		// 改行する
		System.out.println("\n");
	}

	// Q4
	// double型を引数にし、合算して返す
	public static double addNumber(double num1, double num2) {
		double que4 = num1 + num2;
		return que4;
	}

	// Q5
	// 1-100までのランダムな配列を作成。引数のint型値分、値を返す
	public static int[] randNum(int num3) {
		int[] que5 = new Random().ints(num3, 1, 101).toArray();
		return que5;
	}

	// Q6
	// que5の値を引数にし、平均点を計算後に値を返す
	public static double calc_ave(int[] que5) {
		double sum = 0;
		for (int i = 0; i < que5.length; i++) {
			sum += que5[i];
		}
		double ave = sum / que5.length;
		return ave;
	}

	// Q7
	// que6の値を引数にし、50以上ならtrue,それ以外はfalseを返す
	public static boolean isEven(double ave) {
		return (ave >= 50);
	}

	// 作成したメソッドの結果を以下に出力する
	public static void main(String[] args) {
		// Q1
		// string型,int型を作成する
		String que1;
		que1 = printData("Hello JavaSE ", 11);
		// Q1の結果を出力する
		System.out.println(que1 + "\n");

		// Q2
		// int型を作成する
		int que2;
		que2 = addNumber(10, 3);
		// Q2の結果を出力する
		System.out.println(que2 + "\n");

		// Q3
		// int型の配列を作成する
		int[] array = { 1, 2, 3, 4, 5 };
		printArray(array);

		// Q4
		// double型を作成する
		double que4;
		que4 = addNumber(1.12, 2.02);
		// Q4の結果を出力する
		System.out.println(que4 + "\n");

		// Q5
		// que5の個数を指定する
		int[] que5 = randNum(3);
		// Q5の結果を出力する
		System.out.println(Arrays.toString(que5) + "\n");

		// Q6
		// que5のメソッドを受け取り、double型にする
		double ave = calc_ave(que5);
		// Q6の結果を出力する
		System.out.println(ave + "\n");

		// Q7
		// 結果がtrueならtrueを出力、それ以外はfalseを出力する
		if (isEven(ave) == true)
			System.out.print(true);
		else
			System.out.print(false);
	}
}
