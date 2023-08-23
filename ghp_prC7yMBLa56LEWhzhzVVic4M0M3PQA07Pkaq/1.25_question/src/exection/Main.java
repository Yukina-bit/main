package exection;

import java.util.Scanner;

import process.Sub;
import process.Sub.SubClass;

public class Main {

	public static void main(String[] args) {
		// スーパークラスをインスタンス化する
		Sub sub = new Sub();
		// サブクラスをインスタンス化する
		SubClass subClass = sub.new SubClass();

		// ユーザー名を入力してもらう
		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();

		System.out.println(sub.openingStr1 + name + sub.openingStr2);
		// getterメソッドでsetterでセットした変数を取得し出力する
		System.out.println("HP：" + subClass.getHp());
		System.out.println("MP：" + subClass.getMp());
		System.out.println("攻撃力：" + subClass.getAttack());
		System.out.println("素早さ：" + subClass.getSpeed());
		System.out.println("防御力：" + subClass.getDefence());

		// 改行する
		System.out.println();
		// 文章を挿入する
		System.out.println(sub.endingStr);
	}

}
