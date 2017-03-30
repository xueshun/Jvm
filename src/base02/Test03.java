package base02;

public class Test03 {
	public static void alloc(){
		byte[] b = new byte[2];
	}
	public static void main(String[] args) {

		//TLAB分配
		//参数：-XX:+UseTLAB -XX:+PrintTLAB -XX:+PrintGC -XX:TLABSize=102400 -XX:-ResizeTLAB -XX:TLABRefillWasteFraction=100 -XX:-DoEscapeAnalysis -server
		
		//-XX:+UseTLAB 使用TLAB
		//-XX:TLABSize 设置TLAB大小
		//-XX:TLABRefillWasteFraction 设置维护进入TALB空间的单个对象大小，
		//     它是一个比例值，默认值为64，即如果对象大于整个空间的1/64，则在堆创建对象
		
		//-XX:+PrintTLAB 查看TLAB信息
		//-XX:ResizeTLAB 子调整TLABRefillWasteFraction 阀值
		
		for(int i=0; i<10000000;i++){
			alloc();
		}

	}
}
