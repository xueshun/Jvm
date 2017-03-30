package base01;

public class Test01 {
	
	public static void main(String[] args) {
		
		//-Xms5m -Xmx20m -XX:+PrintGCDetails -XX:+UseSerialGC -XX:+PrintCommandLineFlags
		
		/*
		 * -Xms5M ����java��������ʱ��ʼ���Ѵ�С
		 * -Xmx5M ����java�����ܻ�õ����Ѵ�С
		 * -XX:+printGCDetails ���Բ鿴������Ϣ�����������������
		 * -XX:UseSerialGC ���̻߳��ջ���
		 * -XX:+PringCommandLineFlags ���Խ���ʽ������ʾ����������Ĳ������
		 * 
		 * ��ʵ�ʹ�����ֱ�ӳ�ʼ���ĶѴ�С�����Ѵ�С������ȣ������ĺô��ǿ��Լ��ٳ�������ʱ����������
		 * �������Ӷ��������
		 * 
		 * 
		 */
		//�鿴GC��Ϣ
		System.out.println("max memory:" + Runtime.getRuntime().maxMemory());
		System.out.println("free memory:" + Runtime.getRuntime().freeMemory());
		System.out.println("total memory:" + Runtime.getRuntime().totalMemory());
		
		byte[] b1 = new byte[1*1024*1024];
		System.out.println("������1M");
		System.out.println("max memory:" + Runtime.getRuntime().maxMemory());
		System.out.println("free memory:" + Runtime.getRuntime().freeMemory());
		System.out.println("total memory:" + Runtime.getRuntime().totalMemory());
		
		byte[] b2 = new byte[4*1024*1024];
		System.out.println("������4M");
		System.out.println("max memory:" + Runtime.getRuntime().maxMemory());
		System.out.println("free memory:" + Runtime.getRuntime().freeMemory());
		System.out.println("total memory:" + Runtime.getRuntime().totalMemory());
	}
}
