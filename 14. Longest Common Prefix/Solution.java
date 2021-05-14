class Solution {
    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";

        //pega o menor tamanho de string
        int min = Integer.MAX_VALUE;
    	for(String str: strs){
    		min = Math.min(str.length(), min);
    	}
    	
    	int high = min, low = 1, middle;
    	while(low <= high){
    		middle = ((low + high)/2);
    		if(isPrefix(strs, middle)){
    			low = middle + 1;
    		} else{
    			high = middle - 1;
    		}
    	}
    	return strs[0].substring(0, (low+high)/2);
    }

    public static boolean isPrefix(String[] strs, int index){
    	for(String str: strs){
    		if(!strs[0].substring(0, index).equals(str.substring(0, index))){
    			return false;
    		}
    	}

    	return true;
    }
	
	public static void main(String[] args) {
		//String[] strs = {"banana", "bananan", "banca"};
		//String[] strs = {"flower","flow","flight"};
		//String[] strs = {"dog","racecar","car"};
		//String[] strs = {""};
		//String[] strs = {"reflower","flow","flight"};
		System.out.println(longestCommonPrefix(strs));
	}
}