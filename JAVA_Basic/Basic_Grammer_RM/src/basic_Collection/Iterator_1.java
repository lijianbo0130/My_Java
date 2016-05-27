package basic_Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * Author:Lijianbo
 * date:2016年4月27日
 * time:下午6:25:19
**/
public class Iterator_1 {
	/*
	 * 在Iterator中不要用原来对象remove
	 * 在Iterator中元素会被锁住
	 */
	public static void main(String[] args) {
		List<String> arList = new ArrayList<>();
		arList.add("1");
		arList.add("asv");
		arList.add("11");
		Iterator<String> it = arList.iterator();
		// 一种遍历方法
		while (it.hasNext()) {
			String string = (String) it.next();
			if (string.length() > 5) {
				// 不要使用collection.remove()
				it.remove();
			}
		}
		
		// 用下标遍历
		for (int i = 0; i < arList.size(); i++) {
			System.out.println(arList.get(i));
			if (i==0){
				// 可以在里面使用remove
				arList.remove(i);
			}
		}
		System.out.println(arList.size());

	}

}
