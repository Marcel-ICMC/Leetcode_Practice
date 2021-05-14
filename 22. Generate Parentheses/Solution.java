import java.util.List;
import java.util.ArrayList;

class Solution {
    private static void coiso(List<String> result, StringBuilder text, int n, int opens, int closes){
        if(text.length() == n*2){
            result.add(text.toString());
            return;
        }

        if(opens < n){
            text.append("(");
            coiso(result, text, n, opens+1, closes);
            text.deleteCharAt(text.length() - 1);
        } if(closes < opens){
            text.append(")");
            coiso(result, text, n, opens, closes+1);
            text.deleteCharAt(text.length() - 1);
        }
    }
    public static List<String> generateParenthesis(int n){
        List<String> result = new ArrayList<String>();
        coiso(result, new StringBuilder(), n, 0, 0);
        return result;
    }

	
    // public List<String> generateParenthesis(int n) {
    //     List<String> ans = new ArrayList();
    //     if (n == 0) {
    //         ans.add("");
    //     } else {
    //         for (int c = 0; c < n; ++c)
    //             for (String left: generateParenthesis(c))
    //                 for (String right: generateParenthesis(n-1-c))
    //                     ans.add("(" + left + ")" + right);
    //     }
    //     return ans;
    // }

    public static void main(String[] args) {
		List<String> result = generateParenthesis(3);
        for (int i = 0; i < result.size(); i++)
            System.out.println(result.get(i));
	}
}