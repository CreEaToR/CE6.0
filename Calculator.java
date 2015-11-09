
public class Calculator{
	
	
	public static double sum(double [] a){
		
		double sum = 0.0;
		
		for(int i = 0; a.length>i;i++){
			
			sum += a[i];
			
		}
		
		return sum;
		
	}
	
	public static int sum(int [] a){
		
		int sum = a[0];
		
		for(int i = 1; i<a.length;i++){
			
			sum = sum + a[i];
			
		}
		
		return sum;
		
	}
	
	
	public static double average(double [] a ){
		
		double sum = 0.0;
		
		for(int i = 0; a.length>i;i++){
			
			sum += a[i];
			
		}
		
		return (sum/a.length);
		}
	

	public static int average(int [] a ){
		
		int sum = 0;
		
		for(int i = 0; a.length>i;i++){
			
			sum += a[i];
			
		}
		
		return (sum/a.length);
		}
	
	
	public static double product(double [] a){
		
		
	double nums = 0.0;
		
		for(int i = 0; a.length>i;i++){
			
			nums = nums * a[i];
			
		}
		
		return nums;
		}
	
public static int product(int [] a){
	
	
int nums = 0;
	
	for(int i = 0; a.length>0;i++){
		
		nums *= a[i];
		
	}
	
	return nums;
	}

	public static int factorial(int [] a){
		
		for(int x = 0; a.length>x;x++){
		int n = a[x];
		
		int result = 1;
	       for (int i = 1; i <= n; i++) {
	           result = result * i;
	       }
	       
	       System.out.println("Fatorial for: " + n + " is " + result);
	      
		
	       
	}
		return 1;
}


}

