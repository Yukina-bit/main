package process;

/*
	
0, "北海道:札幌市:83424"
1, "青森県:青森市:9646"
2, "岩手県:盛岡市:15275"
3, "宮城県:仙台市:7282"
4, "秋田県:秋田市:11638"
5, "山形県:山形市:9323"
6, "福島県:福島市:13784"
7, "茨城県:水戸市:6097"
8, "栃木県:宇都宮市:6408"
9, "群馬県:前橋市:6362"
10, "埼玉県:さいたま市:3798"
	
	コンソールに数字と昇順・降順の値が入力されると上記配列に対応する
	都道府県がソートされてコンソールに出力されるように作ってください
	※Packageを2つ作ってください
	※複数選択できるようにしてください
	
	例:
	8,5,9,.....
	と入力された場合（昇順）
	
	都道府県名：山形県
県庁所在地：山形市
面積：9323.0km2
	
	都道府県名：栃木県
県庁所在地：宇都宮市
面積：6408.0km2

	都道府県名：群馬県
県庁所在地：前橋市
面積：6362.0km2

*/

public class Sub {

	Array array = new Array();
	public int i = 0;
	public int intInputs;

	// 結果を表示するメソッドを作成する
	public void printInfo() {
		// 「：」区切りで分けて、一次元配列に格納する
		String[] str = array.array[i][0].split(":");
		// 出力内容
		System.out.println("都道府県名：" + str[0] + "\n県庁所在地：" +
				str[1] + "\n面積：" + str[2] + ".0km2\n");
	}

	// switch文のメソッドを作成
	public void getInfo(int intInputs) {
		switch (intInputs) {
		case 0:
			i = 0;
			printInfo();
			break;
		case 1:
			i = 1;
			printInfo();
			break;
		case 2:
			i = 2;
			printInfo();
			break;
		case 3:
			i = 3;
			printInfo();
			break;
		case 4:
			i = 4;
			printInfo();
			break;
		case 5:
			i = 5;
			printInfo();
			break;
		case 6:
			i = 6;
			printInfo();
			break;
		case 7:
		 i = 7;
			printInfo();
			break;
		case 8:
			i = 8;
			printInfo();
			break;
		case 9:
			i = 9;
			printInfo();
			break;
		case 10:
			i = 10;
			printInfo();
			break;
		}
	}
	
	public Sub(int intInputs) {
		this.intInputs = intInputs;
	}
	
	
}