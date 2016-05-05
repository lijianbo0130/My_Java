package baisc_property;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

/*
 * Author:Lijianbo
 * date:2016年4月29日
 * time:下午1:48:13
**/
public class Get_Property {
	/*
	 * 使用property得到配置
	 */
	public static void main(String[] args) throws FileNotFoundException, IOException {
		Properties properties = new Properties();
		properties.load(new FileInputStream("src/baisc_property/1.txt"));
		// 得到所有的key
		Set<Object> set= properties.keySet();
		Iterator<Object> it =set.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
			
		}
		

	}

}