package process;

import java.text.SimpleDateFormat;
import java.util.Date;

/*

下記がコンソールに出力されるように作成してください

	こんにちは！ここは日本です！
	この寿司はうまい
	寿司は和食です
	今の現在日時は2023/03/09 10:23:39です

【条件】
	・JavaProjectを新規作成し、実行用のpackageと処理用のpackageを作成してください。
	・適切なファイルにフィールドで変数を必要な数作ってください。
	・thisを使って作成してください。
	・日時は今日の日付を取得してください。
	
*/

public class Sub {
	// フィールドを作成する
	public String introStr;
	public String timeStamp;

	// 日付を取得する
	Date getDate = new Date();
	// 日付のフォーマットを指定する
	SimpleDateFormat getDateFormat = new SimpleDateFormat("yyyy/MM/dd H:m:s");

	// コンストラクタを作成する
	public Sub() {
		this("こんにちは！ここは日本です！\nこの寿司はうまい\n寿司は和食です");
	}

	// コンストラクタを作成する
	public Sub(String introStr) {
		this.introStr = introStr;
		timeStamp = this.getDateFormat.format(getDate);

	}

}
