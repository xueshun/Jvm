package base01;

public class Test04 {
	
	//-Xss1m
	
	//-Xss5m
	//栈调用深度
	//Java虚拟机提供了参数-Xss来指定线程的最大栈空间，这个参数也直接决定了函数
	//可调用的最大深度
	private static int count;
	
	public static void recursion(){
		count++;
		recursion();
	}
	
	public static void main(String[] args) {
		try {
			recursion();
		} catch (Throwable t) {
			System.err.println("调用最大深度："+count);
			t.printStackTrace();
		}
	}
}
