package com.lijianbo.Service;

import com.lijianbo.User.User;

/*
 * Author:Lijianbo
 * date:2016年4月29日
 * time:上午10:49:56
**/
public class Service {
	
	/*
	 * 使用maven工程在Service直接调用Maven_User项目中的User对象
	 * 不用自己引用包,这样可以更方便的管理工程
	 */
	public static void main(String[] args) {
		User user=new User();

	}

}
