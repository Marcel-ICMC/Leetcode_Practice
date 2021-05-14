class Solution {
    public static int reverse(int x) {
    	int result = 0, copy = x;
    	while(copy != 0){
    		try{
    			result = Math.multiplyExact(result, 10);
    			result = Math.addExact(result, (copy % 10));
    		}catch(ArithmeticException e) {
    			return 0;
    		}
    		copy = (copy - (copy % 10))/10;
    	}

    	return result;
	}

	public static void main(String[] args) {
		System.out.println(reverse(Integer.MAX_VALUE));
	}
}