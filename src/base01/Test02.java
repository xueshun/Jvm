package base01;

public class Test02 {
	public static void main(String[] args) {
		
		//��һ������
		//-Xms20M -Xmx20M -Xmn1M -XX:SurvivorRatio=2 -XX:+PrintGCDetails -XX:+UseSerialGC
		
		//�ڶ�������
		//-Xms20M -Xmx20M -Xmn7m -XX:SurvivorRatio=2 -XX:+PrintGCDetails -XX:+UseSerialGC
		
		//����������
		//-XX:NewRatio=�����/������
		//-Xms20m -Xmx20m -XX:SurvivorRatio=2 -XX:+PrintGCDetails -XX:+UseSerialGC
		
		/**
		 * ������������
		 * 	-Xmn�����������������Ĵ�С������һ���Ƚϴ�������������������Ĵ�С�����������ϵͳ����
		 * 			�Լ�GC��Ϊ�кܴ��Ӱ�죬��������Сһ������������ѿռ��1/3--1/4����
		 * 	-XX:SurvivorRatio: ���������������е�eden�ռ��from/to�ռ����
		 * 	-XX:SurvivorRatio = eden/from = eden/to
		 * 	-XX:NewRation = �����/������
		 */
		byte[] b = null;
		for(int i = 0; i < 10; i++){
			b = new byte[1*1024*1024];
		}
	}
}
