package base02;

public class Test03 {
	public static void alloc(){
		byte[] b = new byte[2];
	}
	public static void main(String[] args) {

		//TLAB����
		//������-XX:+UseTLAB -XX:+PrintTLAB -XX:+PrintGC -XX:TLABSize=102400 -XX:-ResizeTLAB -XX:TLABRefillWasteFraction=100 -XX:-DoEscapeAnalysis -server
		
		//-XX:+UseTLAB ʹ��TLAB
		//-XX:TLABSize ����TLAB��С
		//-XX:TLABRefillWasteFraction ����ά������TALB�ռ�ĵ��������С��
		//     ����һ������ֵ��Ĭ��ֵΪ64�������������������ռ��1/64�����ڶѴ�������
		
		//-XX:+PrintTLAB �鿴TLAB��Ϣ
		//-XX:ResizeTLAB �ӵ���TLABRefillWasteFraction ��ֵ
		
		for(int i=0; i<10000000;i++){
			alloc();
		}

	}
}
