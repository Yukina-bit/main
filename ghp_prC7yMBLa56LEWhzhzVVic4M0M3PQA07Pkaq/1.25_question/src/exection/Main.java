package exection;

import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

import process.Sub;
import process.Sub.StrSub;

public class Main {

	public static void main(String[] args) {

		// クラスをインスタンス化する
		Sub sub = new Sub();
		StrSub strsub = sub.new StrSub();

		// ランダムな値を作成する
		Random rand = new Random();

		// setterメソッドに変数を渡す
		sub.setHp(rand.nextInt(999));
		sub.setMp(rand.nextInt(999));
		sub.setAttack(rand.nextInt(999));
		sub.setSpeed(rand.nextInt(999));
		sub.setDefence(rand.nextInt(999));

		// ユーザー名を入力してもらう
		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();

		// 名前が未入力の時に出力する
		if (name.length() == 0) {
			System.out.println("名前を入力してください");
			return;
		}

		if (Objects.nonNull(sub)) {
			if (Objects.nonNull(strsub)) {
				strsub.greeting1();
				System.out.print(name);
				strsub.greeting2();
				System.out.println("HP：" + sub.getHp());
				System.out.println("MP：" + sub.getMp());
				System.out.println("攻撃力：" + sub.getAttack());
				System.out.println("素早さ：" + sub.getSpeed());
				System.out.println("防御力：" + sub.getDefence());
				// 改行する
				System.out.println();
				strsub.endingStr();

			} else {
				System.out.println("strsubがnullです");
			}
		} else {
			System.out.println("subがnullです");
		}
	}
}
