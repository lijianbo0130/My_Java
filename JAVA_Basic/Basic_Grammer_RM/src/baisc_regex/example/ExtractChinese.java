package baisc_regex.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * Author:Lijianbo
 * date:2016年4月27日
 * time:上午11:37:19
**/
public class ExtractChinese {
	


	public static void main(String[] args) {
		String str = "aaa我来到北aa京清华大学     aa我来到北aa京清华大学";
		Pattern pattern = Pattern.compile("[\u4E00-\u9FA5]+");
		Matcher match = pattern.matcher(str);
		while (match.find()) {
			String matchStr = match.group(0);
			System.out.println(matchStr);
		}

	}

}
