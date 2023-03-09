package core.com;

public class Heap {
	
	public static void main(String[] args) {
		Runtime runtime= Runtime.getRuntime();
		long max=runtime.maxMemory();
		long total=runtime.totalMemory();
		long free=runtime.freeMemory()
;
		long use=runtime.availableProcessors();
		System.out.println(max);
		System.out.println(total);
		System.out.println(free);
		System.out.println(use);
		
	}

}
