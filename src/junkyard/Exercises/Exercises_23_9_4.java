package ajian000.junkyard.Exercises;

import java.util.Scanner;

public class Exercises_23_9_4 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Scanner sc = new Scanner(System.in);
		//���벿��
		String inPut = new String();
		System.out.println("���������鳤��");
		int numsLength = sc.nextInt();
		int[] nums = new int[numsLength];
		for(int i = 0;i < numsLength;i++) {
			System.out.println("�������"+(i+1)+"������");
			nums[i] = sc.nextInt();
		}
		
		//���������ڵ���,ʵ��̫�鷳������
//		System.out.println("��������Ϊ"+nums);
		
		//����target
		System.out.println("������target");
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
