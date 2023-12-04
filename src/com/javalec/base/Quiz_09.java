package com.javalec.base;

import java.util.Scanner;

public class Quiz_09 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int[] histo = new int[10];

		System.out.println("Input score: ");

		for (int i = 0; i < histo.length; i++) {
			System.out.print((i + 1) + "의 score :");
			int kk = scanner.nextInt();
			histo[kk / 10]++;
		}

		scanner.close();

		System.out.println("-------Histogram-------");

		for (int i = (histo.length - 1); i >= 0; i--) {
			System.out.print(String.format("%3d : ", i * 10));
			for (int j = 1; j <= histo[i]; j++) {
				System.out.print("#");
			}
			System.out.println();
		}

	}

}
