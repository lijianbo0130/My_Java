package advance_Design.single;

/*
 * Author:Lijianbo
 * date:2016年4月28日
 * time:下午4:15:26
 * 单例模式，只会生成一个实例对象
**/
public class Single {

	public static void main(String[] args) {
		/*
		 * 在其他对象中调用单例 因为构造方法不公开无法new对象
		 * 只能用静态的getInstance
		 */
		SinglePattern pattern = SinglePattern.getInstance();
	}

}

class SinglePattern {
	/*
	 * 单例模式，只会生成一个实例对象
	 */
	private static SinglePattern instance = null;

	// 私有构造方法外部不能访问
	private SinglePattern() {
		// TODO Auto-generated constructor stub
	}

	// 静态方法，通过类名去掉用 synchronized 防止多个线程同时访问
	public static synchronized SinglePattern getInstance() {
		if (SinglePattern.instance == null) {
			instance = new SinglePattern();
		}
		return instance;
	}

}