public class ReverseInteger {
    public int reverse(long x) {
    	String str_reverse = reverseString(x);
    	long res = Long.parseLong(str_reverse);
    	if (res>2147483647 || res < -2147483648){
    	    return 0;
    	}
    	else{
    		int v = (int) res;
    		if (x>=0){
        		return v;
        	}
	        else{
	        	return 0-v;
	        }
    	}
        
    }

    public String reverseString(long x){
    	long value = Math.abs(x);
    	String strVal = Long.toString(value);
    	StringBuilder sb = new StringBuilder();
    	sb.append(strVal);
    	return sb.reverse().toString();
    }

    public static void main(String args[]){
    	ReverseInteger ri = new ReverseInteger();
    	System.out.println(ri.reverse(1534236469));
    }
}