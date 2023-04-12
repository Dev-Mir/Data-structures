import java.util.*;
class SimpleRecursion{
	public static void main(String[] sk){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		dsc(N);
		asc(N);
		System.out.println();
		printF("abcdef".toCharArray());
		printR("abcdef".toCharArray());
	}
	static void dsc(int N){
		if(N == 0){
			System.out.println();
			return;
		}
		System.out.print(N+" ");
		dsc(N-1);
	}
	static void asc(int N){
		if(N>1){
			asc(N-1);
		}
		System.out.print(N+" ");
	}
	static void printF(char[] ch){
		if(ch.length == 0){
			System.out.println();
			return;
		}
		System.out.print(ch[0]);
		printF(new String(ch, 1, ch.length-1).toCharArray());
	}
	static void printR(char[] ch){
		if(ch.length>1){
			printR(new String(ch, 1, ch.length-1).toCharArray());
		}
		System.out.print(ch[0]);
	}
}