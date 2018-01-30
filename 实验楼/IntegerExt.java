package 实验楼;


public class IntegerExt {
    private int i;
    private static IntegerExt[] IntegerCaches;
    private static int low =-128;
    private static int  high= 127;
    
    static {
    	IntegerCaches = new IntegerExt[127<<1+1]; //255
    	int index =0;
    	for (int i = -127; i < high+1; i++) {
    		IntegerCaches[index] = new IntegerExt(i);
    		index++;
		}
    }
    private IntegerExt(int i){
        this.i = i;
    }
    public int toIntValue(){
        return i;
    }
    public static IntegerExt getInstance(int i){
    	 if (i >= low && i <= high)
             return IntegerCaches[i + (-low)-1];
         return new IntegerExt(i);
       
    }
    @Override
    public boolean equals(Object obj) {
    	if(obj==null){
    		return false;
    	}
    	
    	if(! (obj instanceof IntegerExt)&& !(obj instanceof Integer)){
    		return false;
    	}
    	if(obj instanceof Integer){
    		return ((Integer)obj).intValue() ==this.i;
    		
    	}
    	return ((IntegerExt)obj).i ==this.i;
    }
    
    public static void main(String[] args) {
    	IntegerExt i1 = IntegerExt.getInstance(2);
    	IntegerExt i2 = IntegerExt.getInstance(-1);
    	IntegerExt i3 = IntegerExt.getInstance(new Integer(1111));
    	IntegerExt i4 = IntegerExt.getInstance(new Integer(1111));
    	System.out.println(i1==i2);
    	System.out.println(i1.i);
    	System.out.println(i1.equals(i2));
    	System.out.println(i3==i4);
    	System.out.println(127<<1);
    	
	}
}