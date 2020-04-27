package com.wangchao.utils;

import java.util.HashSet;
import java.util.Random;

public class RandNumUtil {
	
	/**
	 * 返回min-max之间的随机整数（包含min和不包含max值），例如返回1-3之间的随机数，则返回1或2，不能是其他数值
	 */
	public static int random(int min, int max){
		
		Random r = new Random();
		
		return r.nextInt(max-min+1)+min;
		
		} 	
	
	
	public static int[] subRandom (int min, int max, int subs){
		 
		if(subs>(max-min +1))
		 throw new RuntimeException("数据范围有误！");
		
		HashSet<Integer> set = new HashSet<Integer>();//用来存放中间数据。主要是用来过滤重复数据
		while(set.size()!=subs) {//如果set集合的元素个数不等于subs则继续循环
		  set.add(random(min,max));
		}
		int[] x = new int[subs];//目标数组
		int i=0;
		for (Integer integer : set) {
			x[i] =integer;
			i++;
		}
		return x;
	}
	//方法3-1：返回1个1-9,a-Z之间的随机字符。 (8分)
	public static char randomCharacter (){
		String str ="123456789qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM";
		return  str.charAt(random(0, str.length()-1));
	}
	
	//方法3-2：返回个0-9。 (8分)
		public static String randomNumber (int length){
			String str ="1234567890";
			String result="";
			for(int i=0;i<length;i++) {
				result+=str.charAt(random(0, str.length()-1));
			}
			return result ;
		}
	
	//方法4：返回参数length个字符串(5分)，方法内部要调用randomCharacter()方法 (4分)
	public static String randomString(int length){
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < length; i++) {
			sb.append(randomCharacter());
		}
		return sb.toString();
	}



}
