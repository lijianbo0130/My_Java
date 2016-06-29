package basic_3_Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/*
 * 作者:Lijianbo
 * 日期:2016年6月2日:上午10:35:20
 * 程序作用:
**/
public class Collect_Function {

	public static void main(String[] args) {
		getMax();

	}

	/**
	 * 用途说明：得到集合里面的最大值
	 */
	private static void getMax() {
		List<Integer> collection=new ArrayList<>();
		collection.add(1);
		collection.add(2);
		collection.add(5);
		collection.add(4);
		collection.add(19);
		Integer max = Collections.max(collection);
		System.out.println(max);
	}

}
