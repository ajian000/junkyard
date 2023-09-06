package util;

import java.util.Random;




/**
 * ����ཫ��Random��������Ż������еķ�������Ϸ���������и�����ʹ��
 * */
public class Rand{
	private Rand() {}
	
	static Random r = new Random();
	
	/**
	 * �ⲿ���ǻ�ȡ���������ط���
	 * Ĭ��Ϊ�������0~100֮��������
	 * */
	public static int ranInt() {
		int result;
		result = r.nextInt(101);
		return result;
	}
	/**
	 * ����һ����ȡ�����������
	 * @param minNumber �������Сֵ
	 * @param maxNumber ��������ֵ
	 * @return ������ɵ������
	 * */
	public static int ranInt(int minNumber,int maxNumber) {
		int result;
		while(true) {
			result = r.nextInt(maxNumber);
			if(result <= maxNumber && result >= minNumber){
				break;
			}else {
			}
		}
		return result;
	}
	/***********************************************************************/
	/**
	 * ��ȡ�������������
	 * Ĭ�Ϸ���0~1֮������������
	 * */
	public static float ranFloat() {
		float result = r.nextFloat();
		return result;
	}
	/**
	 * ��ȡ�������������
	 * @param minNumber ��Сֵ
	 * @param maxNumber ���ֵ
	 * @return ���ɵ������
	 * */
	public static float ranFloat(float minNumber,float maxNumber) {
		float result;
		while(true) {
			result = maxNumber*r.nextFloat();
			if(result <= maxNumber && result >= minNumber){
				break;
			}else {
			}
		}
		return result;
	}
	public static float ranFloat(int minNumber,int maxNumber) {
		float result;
		while(true) {
			result = maxNumber*r.nextFloat();
			if(result <= maxNumber && result >= minNumber){
				break;
			}else {
			}
		}
		return result;
	}
	/********************************************************************/
	/**
	 * �����������������
	 * */
	public static boolean ranBoolean() {
		if(ranInt(0,2) == 0) {
			return true;
		}else {
			return false;
		}
	}
}