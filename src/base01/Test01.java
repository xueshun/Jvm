package base01;

public class Test01 {
	
	public static void main(String[] args) {
		
		//-Xms5m -Xmx20m -XX:+PrintGCDetails -XX:+UseSerialGC -XX:+PrintCommandLineFlags
		
		/*
		 * -Xms5M 设置java程序启动时初始化堆大小
		 * -Xmx5M 设置java程序能获得的最大堆大小
		 * -XX:+printGCDetails 可以查看详情信息，包括各个区的情况
		 * -XX:UseSerialGC 单线程回收机制
		 * -XX:+PringCommandLineFlags 可以将隐式或者显示传给虚拟机的参数输出
		 * 
		 * 在实际工作中直接初始化的堆大小与最大堆大小设置相等，这样的好处是可以减少程序运行时的垃圾回收
		 * 次数，从而提高性能
		 * 
		 * 
		 */
		//查看GC信息
		System.out.println("max memory:" + Runtime.getRuntime().maxMemory());
		System.out.println("free memory:" + Runtime.getRuntime().freeMemory());
		System.out.println("total memory:" + Runtime.getRuntime().totalMemory());
		
		byte[] b1 = new byte[1*1024*1024];
		System.out.println("分配了1M");
		System.out.println("max memory:" + Runtime.getRuntime().maxMemory());
		System.out.println("free memory:" + Runtime.getRuntime().freeMemory());
		System.out.println("total memory:" + Runtime.getRuntime().totalMemory());
		
		byte[] b2 = new byte[4*1024*1024];
		System.out.println("分配了4M");
		System.out.println("max memory:" + Runtime.getRuntime().maxMemory());
		System.out.println("free memory:" + Runtime.getRuntime().freeMemory());
		System.out.println("total memory:" + Runtime.getRuntime().totalMemory());
	}
}
