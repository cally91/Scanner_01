package com.biz.scan.numptck;

import java.util.Random;
import java.util.Scanner;

public class NumPick_03 {

	private int intNum;//자동으로 0으로 초기화
	private Random rnd; // 초기화 코드 (=new Random())를 생성자로
	private Scanner scan;

	public NumPick_03() {
		intNum=10;
		rnd = new Random();
		scan = new Scanner(System.in);
	}
	public void Pickup() {
	int intrnd = rnd.nextInt(10) + 1;



	int num = 0;
	while (true) {
		System.out.print("숫자(1~10) 입력 종료(--END)>>");
		String strKey = scan.nextLine();
		if (strKey.equals("--END"))
			break;
		int intkey = Integer.valueOf(strKey.trim());
		num++;
		
		if (intkey == intrnd) {
			System.out.println("잘맞추었네요");
			System.out.println(num+"번만에 맞추었네요");
			intrnd = rnd.nextInt(10) + 1;
			num = 0;
		} else {

			if (intkey > intrnd) {
				System.out.println("큰수를 입력했군요");
			} else if (intkey < intrnd) {
				System.out.println("작은수을 입력했군요");

			}
		} 
			
			
	}
	System.out.println();
	System.out.println("GAME OVER");
}
	

}
