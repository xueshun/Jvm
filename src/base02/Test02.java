package base02;

import java.util.HashMap;
import java.util.Map;

public class Test02 {
	public static void main(String[] args) {
		//������ -Xmx30M -Xms30M -XX:+UseSerialGC -XX:+PrintGCDetails -XX:PretenureSizeThreshold=1000
		//���������ԭ��Ϊ�� ��������������Ķ���
		//�����Ȱ����ݷ��䵽TLAB�����У���˾�ʧȥ�������������Ļ���
		
		//������-Xmx30M -Xms30M -XX:+UseSerialGC -XX:+PrintGCDetails -XX:PretenureSizeThreshold=1000 -XX:-UseTLAB
		//-XX:-UseTLAB
		
		Map<Integer,byte[]> m =new HashMap<Integer,byte[]>();
		for (int i = 0; i < 5*1024; i++) {
			byte[] b = new byte[1024];
			m.put(i, b);
		}
	}
}
