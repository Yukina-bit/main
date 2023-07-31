package curriculum_A;

import java.text.DecimalFormat;

public class Qes1_13 {
	
	public static void main(String[] args) {
	// ローカル変数として宣言し、初期化する
	byte b = 0;
	short s = 0;
	int i = 0;
	long l = 0l;
	float f = 0.0f;
	double d = 0.0d;
	char c = '\u0000';
	String str = null;
	boolean bool1 =false;
	// 変数に値を代入
	b = 10;
	s = 100;
	i = 1000;
	l = 10000;
	f = 9.5f;
	d = 10.5d;
	c = 'a';
	str = "ハロー";
	bool1 = !bool1;
	// 小数点以下を表示しない
	DecimalFormat format = new DecimalFormat("0.#");
	// 四則演算し、コンソールへ出力する
	System.out.println(b+s+i+l);
	System.out.println(b+b);
	System.out.println(c+str+bool1);
	System.out.println(format.format(b+s+i+l+f+d));
	System.out.println(b*s*i*l);
	System.out.println(d/s);
	System.out.println(b-s+"\n");
	// 「ハローJAVA43」とコンソールへ出力
	int num = 20;
	int num1 = 23;
	System.out.println("ハローJAVA"+(num+num1+"\n"));
	// 変数を宣言する
	String name = "山田太郎";
	int age = 18;
	double height = 170.5;
	double weight = 62.2;
	String food = "寿司";
	// 変数の値を代入し、コンソールへ出力する
	System.out.println("初めまして"+name+"です");
	System.out.println("年齢は"+age+"歳です");
	System.out.println("身長は"+height+"cmです");
	System.out.println("体重は"+weight+"kgです");
	System.out.println("好きな食べ物は"+food+"です\n");
	// BMIの値を演算し、コンソールへ出力する
	double bmi = weight/((height/100)*(height/100));
	System.out.println("BMIは"+bmi+"です\n");
	// 変数を再代入する
	name = "鈴木一郎";
	age = 24;
	height = 168.5;
	weight = 64.2;
	food = "オムライス";
	bmi = 22.6;
	// 再代入された値を入れ、コンソールへ出力する
	System.out.println("初めまして"+name+"です");
	System.out.println("年齢は"+age+"歳です");
	System.out.println("身長は"+height+"cmです");
	System.out.println("体重は"+weight+"kgです");
	System.out.println("好きな食べ物は"+food+"です");
	System.out.println("BMIは"+bmi+"です\n");
	// 変数の値を自己代入する
	age*= 2;
	height = height*2;
	weight = weight*2;
	bmi = bmi/2;
	// 自己代入された値を入れ、コンソールへ出力する
	System.out.println("初めまして"+name+"です");
	System.out.println("年齢は"+age+"歳です");
	System.out.println("身長は"+height+"cmです");
	System.out.println("体重は"+weight+"kgです");
	System.out.println("好きな食べ物は"+food+"です");
	System.out.println("BMIは"+bmi+"です\n");
	// 年齢が25歳以上ならtrueが出力される
	System.out.println(age <= 25);
	// 変数を宣言する
	age = 24;
	height = 168.5;
	weight = 64.2;
	// 数値を文字列型に変換し、繋げて出力する
	String ageTxt = String.valueOf(age);
	String heightTxt = String.valueOf(height);
	String weightTxt = String.valueOf(weight);
	System.out.println(ageTxt+heightTxt+weightTxt+"\n");
	// 文字列型の値を整数型に変換し、出力する
	int heightNum =(int)height;
	int ageNum = Integer.valueOf(age);
	int heightNum2 = Integer.valueOf(heightNum);
	System.out.println(ageNum+heightNum2+"\n");
	// 「年齢が25歳、もしくは身長が160以上」であればtrueを出力する
	boolean result = ((ageNum == 25)||(heightNum >= 165));
	System.out.println(result);
	}
}