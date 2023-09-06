package main;

import util.Rand;

public class Main {
	public static void main(String[] args) {
		int[] random = new int[100];
		for(int i = 0;i < random.length;i++) {
			int temp =  Rand.ranInt();
			for(int j = 0;j < i;j++) {
				if(temp == random[j]) {
					continue;
				}
			}
			random[i] = temp;
		}
		for(int i = 0;i < 100;i++) {
			System.out.println(random[i]+',');
		}
	}
}
