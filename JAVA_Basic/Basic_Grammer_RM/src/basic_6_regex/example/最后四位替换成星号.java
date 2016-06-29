package basic_6_regex.example;

/*
 * Author:Lijianbo
 * date:2016年4月28日
 * time:下午2:23:21
**/
public class 最后四位替换成星号 {
	
	public static void main(String[] args) {
		System.out.println("123456789".replaceAll("\\d{4}$", "****"));
	}

}
