package ajian000.junkyard.Exercises;

import java.util.Scanner;

public class Exercises_23_9_4 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner sc = new Scanner(System.in);
		//输入部分
		String inPut = new String();
		System.out.println("请输入数组长度");
		int numsLength = sc.nextInt();
		int[] nums = new int[numsLength];
		for(int i = 0;i < numsLength;i++) {
			System.out.println("请输入第"+(i+1)+"个数字");
			nums[i] = sc.nextInt();
		}
		
		//输出数组便于调试,实测太麻烦了弃用
//		System.out.println("输入数组为"+nums);
		
		//输入target
		System.out.println("请输入target");
		int target = sc.nextInt();
		
		for(int i = 0;i<nums.length;i++) {
			for(int j = i+1;j < nums.length-i-1;j++) {
				if(nums[i]+nums[j] == target) {
					System.out.println("["+i+","+j+"]");
				}
			}
		}
	}

}
