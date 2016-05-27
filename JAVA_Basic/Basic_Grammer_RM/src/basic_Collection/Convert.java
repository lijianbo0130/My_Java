package basic_Collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

/*
 * 作者:Lijianbo
 * 日期:2016年5月18日:上午10:43:30
 * 程序作用:
**/
public class Convert {

	public static void main(String[] args) {
		List<String> list1 = new ArrayList<>();
		// list->list 传入构造函数
		List<String> list2 = new LinkedList<>(list1);
		// list->set 传入构造函数
		HashSet<String> hashSet = new HashSet<>(list1);
		// set->list
		List<String> list3 = new LinkedList<>(hashSet);
	}

}
