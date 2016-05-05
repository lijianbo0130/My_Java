package basic_Grammer;

import java.lang.reflect.Method;

public class Fan_She_1_Class {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		Genn<Bird> genn = new Genn<Bird>(new Bird());
		genn.show();
		String str="abc";
		// 得到字节码 三种都是String类的字节码 
		Class class1=str.getClass();
		Class class2=String.class;
		Class class3=Class.forName("java.lang.String");
		// 相等
		System.out.println(class1==class2);// true
		System.out.println(class3==class2);// true
		// 是否是基本类型
		System.out.println(class1.isPrimitive());// false
		System.out.println(int.class.isPrimitive());// true
		// 基本类型和包装类型
		// false 基本类型和包装类型字节码不同
		System.out.println(int.class== Integer.class);// flase
		// 使用TYPE得到基本类型的字节码
		System.out.println(int.class== Integer.TYPE);// true
		// 是不是数字
		System.out.println(int[].class.isArray());// true

	}

}

class Genn<T> {
	public T t;

	public Genn(T t) {
		this.t = t;
	}

	public void show() {
		// 输出泛型的类型
		System.out.println(this.t.getClass().getName());
		// 得到所有申明的方法 得到所有的方法名数组
		Method[] m = t.getClass().getDeclaredMethods();
		for (int i = 0; i < m.length; i++) {
			System.out.println(m[i].getName());
		}

	}
}