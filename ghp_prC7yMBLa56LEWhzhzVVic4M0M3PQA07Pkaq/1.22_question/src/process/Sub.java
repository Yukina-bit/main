package shori;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Question {

	public String str;
	// 日付を取得する
	Date exDate = new Date();
	// 日付のフォーマットを指定する
	SimpleDateFormat exDateFormat = new SimpleDateFormat("yyyy/MM/dd H:m:s");
	// 日付の変数を作成する
	public String timeStamp = this.exDateFormat.format(exDate);

	// コンストラクタを作成する
	public Question() {
		this("こんにちは！ここは日本です！\nこの寿司はうまい\n寿司は和食です");
	}
	// 変数に引数を代入するコンストラクタを作成する
	public Question(String str) {
		this.str = str;
	}
}