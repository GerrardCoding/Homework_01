package com.javalec.base;

import java.util.Scanner;

public class Quiz_11 {

	public static void main(String[] args) {
		/*
		 * 입력할 숫자의 개수? :
		 * 4개의 숫자를 입력하세요! :
		 * 1의 숫자 : 11
		 * 2의 숫자 : 22
		 * 3의 숫자 : 44
		 * 4의 숫자 : 55
		 * 숫자를 삽입하고자 하는 위치는 ? :
		 * 삽입하고자 하는 숫자 ? : 33
		 * --------------- 결과 ---------------
		 * 11
		 * 22
		 * 33
		 * 44
		 * 55
		 */
		
		Scanner scanner = new Scanner(System.in);
		int[] num;
		int input = 0;
		int place = 0;
		int inputNum = 0;
		
		System.out.print("입력할 숫자의 개수? : ");
		input = scanner.nextInt();  //배열 길이를 알기 위하여 숫자를 받는다
		num = new int[input];		//그리고 그 숫자를 배열의 길이에 담는다
		
		System.out.println(input + "개의 숫자를 입력하세요! :");
		for(int i=0; i<num.length; i++) {	//각 수를 배열에 순서대로 넣어준다
			System.out.print((i+1) + "의 숫자 : ");
			num[i] = scanner.nextInt();
		}
			
		//index 몇번째 정하기
		System.out.print("숫자를 삽입하고자 하는 위치는 ? : "); //기존의 배열에 수를 넣어주기 위해
		place = scanner.nextInt() -1;	//입력값을 받는데 여기서 배열은 0부터 시작하므로 반드시 -1 해준다
		
		System.out.print("삽입하고자 하는 수는 ? : ");	//그리고 value 값을 받는다
		inputNum = scanner.nextInt();
		
		//새로운 배열의 길이 - 여기서 하나를 추가 받으니 for문을 안쓰고 (상수) + 1을 해준다
		int newArrLength = num.length + 1;

		//새로운 배열 생성 - 길이를 옮겨 담는다
		int[] newArr = new int[newArrLength];
		
		//지정된 위치에 새로운 값 추가하며, 새로운 배열에 담기
		for(int i=0; i<newArr.length; i++) {
			if(i<place) {
				newArr[i] = num[i];
			}else if(i == place) {
				newArr[i] = inputNum;
			}else {
				newArr[i] = num[i-1]; //place가 2를 받았을경우 i가 2보다 클때 기존 배열에 있던 값들이 뒤로 간다
			}
		}
		
		System.out.println("------ 결과 -------");
		for(int i=0; i<newArr.length; i++) {
			System.out.println(newArr[i]);
		}
			
			
		}

//		이걸 보고 참고하였다
//		//원본 배열
//		String[] arr = {"A", "B", "D"};
//		
//		 // 추가할 value, index        
//		String newValue = "C";
//		int position = 2;         
//		
//		// 새로운 배열의 길이        
//		int newArrLength = arr.length + 1;         
//		// 새로운 배열 생성       
//		String[] newArr = new String[newArrLength];         
//		
//		// 지정된 위치에 새로운 값 추가하며, 새로운 배열에 담기        
//		
//		for (int i = 0; i < newArrLength; i++) {
//			if (i < position) {
//				newArr[i] = arr[i];
//			} else if (i == position) {
//				newArr[i] = newValue;
//			} else {
//				newArr[i] = arr[i - 1];
//			}
//		}
//		System.out.println(newArr[0] +":"+ newArr[1]+":"+ newArr[2]+":"+newArr[3]);
		
}
