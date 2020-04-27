package com.wangchao.utils;

import java.util.HashSet;
import java.util.Random;

public class RandNumUtil {
	
	/**
	 * ����min-max֮����������������min�Ͳ�����maxֵ�������緵��1-3֮�����������򷵻�1��2��������������ֵ
	 */
	public static int random(int min, int max){
		
		Random r = new Random();
		
		return r.nextInt(max-min+1)+min;
		
		} 	
	
	
	public static int[] subRandom (int min, int max, int subs){
		 
		if(subs>(max-min +1))
		 throw new RuntimeException("���ݷ�Χ����");
		
		HashSet<Integer> set = new HashSet<Integer>();//��������м����ݡ���Ҫ�����������ظ�����
		while(set.size()!=subs) {//���set���ϵ�Ԫ�ظ���������subs�����ѭ��
		  set.add(random(min,max));
		}
		int[] x = new int[subs];//Ŀ������
		int i=0;
		for (Integer integer : set) {
			x[i] =integer;
			i++;
		}
		return x;
	}
	//����3-1������1��1-9,a-Z֮�������ַ��� (8��)
	public static char randomCharacter (){
		String str ="123456789qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM";
		return  str.charAt(random(0, str.length()-1));
	}
	
	//����3-2�����ظ�0-9�� (8��)
		public static String randomNumber (int length){
			String str ="1234567890";
			String result="";
			for(int i=0;i<length;i++) {
				result+=str.charAt(random(0, str.length()-1));
			}
			return result ;
		}
	
	//����4�����ز���length���ַ���(5��)�������ڲ�Ҫ����randomCharacter()���� (4��)
	public static String randomString(int length){
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < length; i++) {
			sb.append(randomCharacter());
		}
		return sb.toString();
	}



}
