package base02;

import java.util.HashMap;
import java.util.Map;

public class Test01 {
	public static void main(String[] args) {
		//��ʼ�Ķ�����eden��
		//      -Xms64 ��ʼ���Ѵ�С     -Xmx64M  ���Ѵ�С
		//������-Xmx64M -Xms64M -XX:+PrintGCDetails
	/*	for (int i = 0; i < 5; i++) {
			byte[] b = new byte[1024*1024];
		}*/
	
		
		
		//���Խ���������Ķ���
		
		//���� ��-Xmx1024M -Xms1024M -XX:+UseSerialGC -XX:MaxTenuringThreshold=15 -XX:+PrintGCDetails
		//-XX+PrintHeapAtGC
		
		
		/*
		 * һ����Զ����״δ����ᱻ������eden�������û��GC���룬����󲻻��뿪eden������ôeden���Ķ���
		 * ��ν���������أ�һ��������ֻҪ���������ﵽһ���Ĵ�С���ͻ��Զ��뿪�������������������ɶ���
		 * ����GC���������ģ���������ÿ��GC֮���������û�б������������1��
		 * ������ṩ��һ�����������������������������䣬������������䷶Χ�ͻ����Ϊ�����
		 * 	
		 * 	-XX:MaxTenuringThreshole����������ָ�����������󾭹����ٴν��������
		 * 
		 * 	���⣬�����(������eden���޷�װ���ǣ�Ҳ��ֱ�ӽ��������)��JVM���и������������ö���Ĵ�С
		 *  ����ָ���Ĵ�С֮��ֱ�ӽ��������
		 *  
		 *  -XX:PretenureSizeThreshold
		 */
		
		Map<Integer, byte[]> m = new HashMap<Integer, byte[]>();
		
		for (int i = 0; i < 5; i++) {
			byte[] b = new byte[1024*1024*1];
			m.put(i, b);
		}
		
		for (int i = 0; i < 20; i++) {
			for (int j = 0; j < args.length; j++) {
				byte[] b =new byte[1024*1024];
			}
		}
	}
}
