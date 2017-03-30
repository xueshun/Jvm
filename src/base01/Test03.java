package base01;

import java.util.Vector;

public class Test03 {

	public static void main(String[] args) {

		//-Xms1m -Xmx1m -XX:+HeapDumpOnOutOfMemoryError -XX:HeapDumpPath=d:/Test03.dump
		//¶ÑÄÚ´æÒç³ö
		Vector v = new Vector();
		for(int i=0; i < 5; i ++){
			v.add(new Byte[1*1024*1024]);
		}
	}
}
