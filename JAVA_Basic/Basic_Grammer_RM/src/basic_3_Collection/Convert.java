package basic_3_Collection;

import java.util.ArrayList;
import java.util.Arrays;
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
		/*
		 * list-list-set
		 */
		List<String> list1 = new ArrayList<>();
		// list->list 传入构造函数
		List<String> list2 = new LinkedList<>(list1);
		// list->set 传入构造函数
		HashSet<String> hashSet = new HashSet<>(list1);
		// set->list
		List<String> list3 = new LinkedList<>(hashSet);
		/*
		 * list to array
		 */
		List<String> list4 = new LinkedList<>();
		list4.add("a");
		list4.add("4");
		String[] arrayString = (String[]) list4.toArray(new String[list4.size()]);
		System.out.println(arrayString[0]);
		/*
		 * array->list
		 */
		int[] s = { 1, 2, 3, 4 };
		ArrayList<int[]> arrayList = new ArrayList<>(Arrays.asList(s));
		
	}

}
