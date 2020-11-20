package ex06;

public class Ex01 {
	public static void main(String[] args) {
		/*
		for(int i=0; i<args.length; i++) {
			System.out.println(i+"번째값:"+args[i]);
		}
		*/
		if("-version".equals(args[0])) {
			System.out.println("ver 1.1, park lee na");
		}
	}
}
