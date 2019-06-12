package com.biz.scan.numptck;

import java.util.Random;
import java.util.Scanner;

/*
 * main() method가없는 크래스는
 * helper클래스라고도 하며
 *	 다른 클래스, method에서 객체로 생성하여
 * 	사용하는 클래스
 */
public class NumPick_01 {
	
	//맴버변수 영역 (scope),필드 변수 영역
	//rnd 와scan 객체를 각 각 의 클래스로 선언만
	//rnd 와scan 에 포함된 method 들을 아직 사용할수 없다
	private Random rnd;
	private Scanner scan;
	
	// 클래스의 생성자 메서드
	//1. 클래스명과 똑같이(첫글자 대문자 등)이름을 정하고
	// 2.리턴 type기 정의 되지않는다
	public  NumPick_01() {
		rnd =new Random();
				scan =new Scanner(System.in);
	}
	
	
	public Scanner gatScan() {
		return scan;
	}

}
