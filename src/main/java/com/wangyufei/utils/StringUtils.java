package com.wangyufei.utils;

import java.util.regex.Pattern;

public class StringUtils {

	public static String toHtml(String text) {

		text.replaceAll("\\r\\n", "\\n");
		text.replaceAll("\\r", "<br/>");
		
		return text;
	}
	
	public static boolean isNull(String text) {

		if(text == null || "null".equals(text) || "".equals(text)){
			return false;
		}
		
		return true;
	}
	
	//验证手机号
	public static boolean isPhone(String phone) {

		String a = "^1(3|5|7|8)\\d{9}$";
		boolean b = Pattern.matches(a, phone);
		
		return b;
	}
	
	//验证邮箱
	public static boolean isEmail(String email) {

		String a = "^\\w+@\\w{0,4}+\\.(cn|com|net)$";
		boolean b = Pattern.matches(a, email);
		
		return b;
	}
	
	
}
