package com.javalec.base;

import java.util.Scanner;

public class Quiz_10 {

	public static void main(String[] args) {
		// 몇 개의 숫자를 입력할지 결정한 후 숫자를 입력하고
		// 이중 검색을 원하는 숫자의 위치를 파악.

		int num = 0;
		int shcNum = 0;
		int cnt = 0;
		int[] arrNum;
		Scanner sc = new Scanner(System.in);

		System.out.print("입력할 숫자의 갯수 ? : ");
		num = sc.nextInt();
		System.out.println(num + "개의 숫자를 입력하세요! ");

		arrNum = new int[num];

		for (int i = 0; i < num; i++) {
			System.out.print((i + 1) + "의 숫자 : ");
			arrNum[i] = sc.nextInt();
		}
		System.out.print("검색할 숫자는 ? : ");
		shcNum = sc.nextInt();
		sc.close();

		for (int i = 0; i < num; i++) {
			if (arrNum[i] == shcNum) {
				cnt = i + 1;
				break;
			} else {
				cnt = 0;
			}
		}
		if (cnt == 0) {
			System.out.print(shcNum + "은(는) 존재하지 않습니다. ");
		} else {
			System.out.print(shcNum + "의 위치는 " + cnt + "번째 입니다.");
		}

	}

}
