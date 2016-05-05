package baisc_zhengzhe;

/*
 * Author:Lijianbo
 * date:2016年4月27日
 * time:上午11:50:18
**/
public class String_2_Split {

	public static void main(String[] args) {
		/*
		 * String可以直接使用 
		 * 不使用pattern
		 */
		// 把句子按!分割
		String str = "Kevin has seen !seveal times,because ! film!";
		String[] result = str.split("!");
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}

	}

}
