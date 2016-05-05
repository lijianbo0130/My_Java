package basic_Collection;

public class Array_1 {

	public static void main(String[] args) {
		/*
		 * 介绍数组的使用
		 * 数组的长度必须在创建时指定
		 * String[] xArray = new String[]; 没有指定长度会报错
		 * [] 放前面和后面都行 但是我更倾向于放前面。
		 * 因为这样表示是一个String的数组看上去更明显
		 */
		// 新建数组

//		String qArray[] = new String[5]; 不建议这样使用
		String[] aArray = new String[5];
		String[] bArray = { "a", "b", "c", "d", "e" };// 直接赋值
		String[] cArray = new String[] { "a", "b", "c", "d", "e" };
		// 遍历数组 数组有length属性
		for (int i = 0; i < cArray.length; i++) {
			System.out.println(cArray[i]);

		}
		/*
		 * 类的数组
		 */
		Array_My_HClass[] class_array=new Array_My_HClass[5];
		// 初始化对象
		class_array[0]=new Array_My_HClass();

	}

}

class Array_My_HClass {

	void bark() {// 必须实现父类的抽象方法
		// TODO Auto-generated method stub
		System.out.println("狗叫");
	}
}
