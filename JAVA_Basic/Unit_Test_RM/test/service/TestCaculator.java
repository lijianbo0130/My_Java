package service;

//静态导入
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class TestCaculator {
	Calculate cal;

	// 执行任意一个方法之前都会执行Setup方法
	@Before
	public void setUp() {
		cal = new Calculate();
	}

	// @Test表示是单元测试
	@Test
	public void testAdd() {
		int rel = cal.add(12, 22);
		// 断言 参数:出错的提示 方法的返回值 期望值
		Assert.assertEquals("加法有问题", rel, 34);
	}
	
	@Test
	public void testMinus() {
		int rel = cal.minus(20, 10);
		// 断言 参数:出错的提示 方法的返回值 期望值
		Assert.assertEquals("减法有问题", rel, 10);
	}

}
