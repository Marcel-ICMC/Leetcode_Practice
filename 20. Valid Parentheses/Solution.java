import java.util.LinkedList;

class Solution {


    public static boolean isValid(String s) {
        LinkedList<Character> q = new LinkedList<Character>();
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '(') q.addLast((char)('(' + 1));
            else if(s.charAt(i) == '[' || s.charAt(i) == '{') q.addLast((char)(s.charAt(i) + 2));
            else if(q.peek() == null) return false;
            else if(s.charAt(i) == q.peekLast()) q.removeLast();
            else return false;
        }
        if(q.peek() == null) return true;
        return false;
    }
	public static void main(String[] args) {
		//System.out.println(isValid("[]"));
		//System.out.println(isValid("[]]"));
		//System.out.println(isValid("[[[]]"));

        System.out.println(isValid("()[]{}"));
        System.out.println(isValid("(]"));
        System.out.println(isValid("([)]"));
        System.out.println(isValid("{[]}"));
	}
}