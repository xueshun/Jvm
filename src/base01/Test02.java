package base01;

public class Test02 {
	public static void main(String[] args) {
		
		//第一次配置
		//-Xms20M -Xmx20M -Xmn1M -XX:SurvivorRatio=2 -XX:+PrintGCDetails -XX:+UseSerialGC
		
		//第二次配置
		//-Xms20M -Xmx20M -Xmn7m -XX:SurvivorRatio=2 -XX:+PrintGCDetails -XX:+UseSerialGC
		
		//第三次配置
		//-XX:NewRatio=老年代/新生代
		//-Xms20m -Xmx20m -XX:SurvivorRatio=2 -XX:+PrintGCDetails -XX:+UseSerialGC
		
		/**
		 * 新生代的配置
		 * 	-Xmn：可以设置新生代的大小，设置一个比较大的新生代会减少老年代的大小，这个参数对系统性能
		 * 			以及GC行为有很大的影响，新生代大小一般会设置整个堆空间的1/3--1/4左右
		 * 	-XX:SurvivorRatio: 用来设置新生代中的eden空间和from/to空间比例
		 * 	-XX:SurvivorRatio = eden/from = eden/to
		 * 	-XX:NewRation = 老年代/新生代
		 */
		byte[] b = null;
		for(int i = 0; i < 10; i++){
			b = new byte[1*1024*1024];
		}
	}
}
