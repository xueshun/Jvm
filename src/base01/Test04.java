package base01;

public class Test04 {
	
	//-Xss1m
	
	//-Xss5m
	//ջ�������
	//Java������ṩ�˲���-Xss��ָ���̵߳����ջ�ռ䣬�������Ҳֱ�Ӿ����˺���
	//�ɵ��õ�������
	private static int count;
	
	public static void recursion(){
		count++;
		recursion();
	}
	
	public static void main(String[] args) {
		try {
			recursion();
		} catch (Throwable t) {
			System.err.println("���������ȣ�"+count);
			t.printStackTrace();
		}
	}
}
