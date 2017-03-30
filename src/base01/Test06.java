package base01;

/**
 * 	直接内存配置
 * 
 * 
 * 		直接内存也是java程序中非常重要的组成部分，特别是广泛用在NIO中，直接内存跳过了java堆，使java程序可以
 * 	直接访问原生堆空间，因此在一定程度上加快了内存空间的访问速度。但是说直接内存一定就可以提高内存访问速度
 *  也不见的，具体情况具体分析
 *  
 *  	相关配置参数：-XX:MaxDirectMemorySize,如果不设置默认值为最大空间，即-Xmx。
 *  直接内存使用达到上限时，就会触发垃圾回收，如果不能有效的释放空间，也会引起系统的OOM
 * 
 * @author Administrator
 *
 */
public class Test06 {
	public static void main(String[] args) {
		
	}
}
