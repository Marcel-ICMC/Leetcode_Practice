class Solution {
/*
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
*/
    public static int romanToInt(String s) {
        int result = 0;

        for(int i = 0; i < s.length(); i++){
            if(i < s.length() - 1){
                if(s.charAt(i) == 'I' && s.charAt(i + 1) == 'V'){
                    result += 4;
                    i++;
                    continue;
                }
                
                if(s.charAt(i) == 'I' && s.charAt(i + 1) == 'X'){
                    result += 9;
                    i++;
                    continue;
                }


                if(s.charAt(i) == 'X' && s.charAt(i + 1) == 'L'){
                    result += 40;
                    i++;
                    continue;
                }
                
                if(s.charAt(i) == 'X' && s.charAt(i + 1) == 'C'){
                    result += 90;
                    i++;
                    continue;
                }


                if(s.charAt(i) == 'C' && s.charAt(i + 1) == 'D'){
                    result += 400;
                    i++;
                    continue;
                }
                
                if(s.charAt(i) == 'C' && s.charAt(i + 1) == 'M'){
                    result += 900;
                    i++;
                    continue;
                }
            }

            if(s.charAt(i) == 'I') result += 1;
            if(s.charAt(i) == 'V') result += 5;
            if(s.charAt(i) == 'X') result += 10;
            if(s.charAt(i) == 'L') result += 50;
            if(s.charAt(i) == 'C') result += 100;
            if(s.charAt(i) == 'D') result += 500;
            if(s.charAt(i) == 'M') result += 1000;
        }


        return result;
    }
	public static void main(String[] args) {
		System.out.println(romanToInt("III"));
        System.out.println(romanToInt("IV"));
        System.out.println(romanToInt("IX"));
        System.out.println(romanToInt("LVIII"));
        System.out.println(romanToInt("MCMXCIV"));
	}
}