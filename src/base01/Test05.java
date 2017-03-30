package base01;

/**
 * 方法区
 * 
 * 和java堆一样，方法区是一块先生共享的内存区域，它用于保存系统的类信息，方法区(永久区)可以保存多少信息
 * 可以对齐进行配置，在默认情况下，-XX:MaxPermSize = 64M ,如果系统运行时产生大量的类，就需要设置一个相对
 * 合适的方法区，以免出现永久区内存溢出的问题
 * 
 * 	-XX:PermSize=64M
 * @author Administrator
 *
 */
public class Test05 {
	
	public static void main(String[] args) {
		
	}
}
