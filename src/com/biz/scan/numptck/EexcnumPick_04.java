package com.biz.scan.numptck;

public class EexcnumPick_04 {

	public static void main(String[] args) {

		NumPick_04 np = new NumPick_04();

		np.makeRandom(); // 새로운 숫자 1개 생성
		while (true) {

			boolean bExit = np.kayIuput(); // 키보드 입력을 받기

			// if(bExit==true)
			if (bExit) {
				System.out.println("game over");
				break;
			} else {
				int result =np.Pickup();
				if (result==0) {
					System.out.println("참잘했어요");
					System.out.println(np.gatnum()+"번만에 맞았네요");
					np.resetnum();
				}else if(result>0) {
					System.out.println("큰 수를 입력했네요");
				}else {
					System.out.println("작은 수를 입력했네요");
				}
				// System.out.println("to be contnue");
			}
				
		}

	}

}
