package date4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

	public static void main(String[] args) throws ParseException {
		// 自分の好きな形式で日付を入力する
		SimpleDateFormat f = 
				new SimpleDateFormat("yyyy/MM/dd HH:mm");
		Date d = f.parse("2020/09/22 08:20");
		System.out.println(d);
		
		// 自分の好きな形式で日付を取得する
		Date now = new Date();  // 現在時刻
		String s = f.format(d);  // 時刻の文字列
		System.out.println(s);
	}

}
