package p05.lecture;

import java.util.Arrays;

public class A10Array {
	// 그림 : 06.배열.png
	public static void main(String[] args) {
		//array (배열) : 여러개의 값을 갖는 자료형
		
		int i;
		i = 5;
		
		int [] arr; // 배열도 참조타입
		arr = new int[3];
		
		// arr [ (0) , (1) , (2) ]
		arr[0] = 5; // arr 3개의 배열 중 0번째에 5의 값을 넣는다 arr [ 5 , (1) , (2) ]
		arr[1] = 7; // arr 3개의 배열 중 1번째에 7의 값을 넣는다 arr [ 5 , 7 , (2) ]
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		
		System.out.println(Arrays.toString(arr)); // 한 번에 출력하는 방법
	}
}
