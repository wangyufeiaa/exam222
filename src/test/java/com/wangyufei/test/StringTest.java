package com.wangyufei.test;

import java.util.Scanner;


import com.wangyufei.utils.StringUtils;

public class StringTest {

	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		//手机号验证
//		Test01();
		
		//邮箱验证
		Test02();
	}
	
	//手机号验证
	private static void Test01() {

		System.out.println("请输入手机号:");
		String phone = sc.next();
		
		boolean b = StringUtils.isPhone(phone);
		System.out.println(b);
		
	}
	
	//邮箱验证
	private static void Test02() {

		System.out.println("请输入邮箱:");
		String email = sc.next();
		
		boolean b = StringUtils.isEmail(email);
		System.out.println(b);
		
	}
	
	public static void Test03(String text) {

		if (StringUtils.isNull(text)) {
			String html = StringUtils.toHtml(text);
			
			System.out.println(html);
		}
		
	}
}
