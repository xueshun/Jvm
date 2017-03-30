package base02;

import java.util.HashMap;
import java.util.Map;

public class Test01 {
	public static void main(String[] args) {
		//初始的对象在eden区
		//      -Xms64 初始化堆大小     -Xmx64M  最大堆大小
		//参数：-Xmx64M -Xms64M -XX:+PrintGCDetails
	/*	for (int i = 0; i < 5; i++) {
			byte[] b = new byte[1024*1024];
		}*/
	
		
		
		//测试进入老年代的对象
		
		//参数 ：-Xmx1024M -Xms1024M -XX:+UseSerialGC -XX:MaxTenuringThreshold=15 -XX:+PrintGCDetails
		//-XX+PrintHeapAtGC
		
		
		/*
		 * 一般而言对象首次创建会被放置在eden区，如果没有GC介入，则对象不会离开eden区，那么eden区的对象
		 * 如何进入老年代呢？一般来讲，只要对象的年龄达到一定的大小，就会自动离开新生代，对象年龄是由对象
		 * 经历GC次数决定的，在新生代每次GC之后如果对象没有被回收则年龄加1，
		 * 虚拟机提供了一个参数来控制新生代对象的最大年龄，当超过这个年龄范围就会晋升为老年代
		 * 	
		 * 	-XX:MaxTenuringThreshole参数，可以指定新生代对象经过多少次进入老年代
		 * 
		 * 	另外，大对象(新生代eden区无法装入是，也会直接进入老年代)。JVM里有个参数可以设置对象的大小
		 *  超过指定的大小之后，直接晋升老年代
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
