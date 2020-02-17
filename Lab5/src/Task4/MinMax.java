package Task4;

public class MinMax {
	
	static class MinAndMax{
		
		private int min;
		private int max;
		
		public MinAndMax() 
		{
			min = Integer.MAX_VALUE;
			max = Integer.MIN_VALUE;
		}
		public int getMin() {
			return min;
		}
		public int getMax() {
			return max;
		}
		public String toString() {
			return "Max value: "+getMax()+"\nMin value: "+getMin(); 
		}
	}
	
	static MinAndMax minmax(int values[])
	{
		MinAndMax mm = new MinAndMax(); 
		
		for(int i=0; i<values.length; i++) {
	    	if(mm.min > values[i]) 
	    		mm.min = values[i];
	    	if(mm.max < values[i]) 
	    		mm.max = values[i];
	    }
	    
	    return mm;
	}

}
