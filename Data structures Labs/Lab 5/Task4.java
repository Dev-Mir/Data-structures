/*
Name: Shankar
Cms: 023-19-0063
section: bscs3 (B)
Task 4
*/
import java.util.*;
class Task4{
	public static void main(String[] sk){
		Scanner sc = new Scanner(System.in);
		System.out.print("String: ");
		String str = sc.next();
		System.out.println("Is Balanced: " + balanced(str));
		
	}
	static boolean balanced(String str){
		Stack<Character> s = new Stack<Character>();
		for(char c: str.toCharArray()){
			if("[{(".contains(c+"")){
				s.push(c);
			}
			else if(")}]".contains(c+"")){
				char ch = s.pop();
				if((c ==')' && ch=='(') || (c =='}' && ch=='{') || (c ==']' && ch=='[')){
					continue;
				}
				else
					return false;
			}
		}
		return s.isEmpty();
	}
}