package service;

import org.junit.Assert;
import org.junit.Test;

/*
 * 作者:Lijianbo
 * 日期:2016年5月18日:上午11:46:54
 * 程序作用:
**/
public class TestCaculartor2 {
	/*
	 * 是否一定要before
	 */
	@Test
	public void testAdd() {
		Calculate cal = new Calculate();
		int rel = cal.add(12, 22);
		// 断言 参数:出错的提示 方法的返回值 期望值
		Assert.assertEquals("加法有问题", rel, 34);
	}

}
