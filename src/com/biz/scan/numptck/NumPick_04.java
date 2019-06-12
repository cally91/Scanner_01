package com.biz.scan.numptck;

import java.util.Random;
import java.util.Scanner;

public class NumPick_04 {

	private int intNum;// 자동으로 0으로 초기화
	private Random rnd; // 초기화 코드 (=new Random())를 생성자로
	private Scanner scan;
	private int intRnd;
	private int num;
	private int intkey;

	public void resetnum(){
		num =0;
	}
	
	public int gatnum() {
		return num;
	}
	public NumPick_04() {
		intNum = 10;
		rnd = new Random();
		scan = new Scanner(System.in);
	}

	public void makeRandom() {
		intRnd = rnd.nextInt(10) + 1;
	}

	public boolean kayIuput() {
		System.out.print("숫자(1~10) 입력 종료(--END)>>");
		String strKey = scan.nextLine();
		if (strKey.equals("--END")) {
			return true;
		}
		intkey = Integer.valueOf(strKey);
		return false;
	}

	public int Pickup() {
		
		int ret =intkey -intRnd;
		if (ret==0) {
			intRnd = rnd.nextInt(10) + 1;
			// num = 0;
		}		
		return ret;
		/*
		num++;
		if (intkey == intRnd) {
			System.out.println("잘맞추었네요");
			System.out.println(num + "번만에 맞추었네요");
			intRnd = rnd.nextInt(10) + 1;
			num = 0;
		} else {
			if (intkey > intRnd) {
				System.out.println("큰수를 입력했군요");
			} else if (intkey < intRnd) {
				System.out.println("작은수을 입력했군요");

			}

		}
		 */
	}

}
