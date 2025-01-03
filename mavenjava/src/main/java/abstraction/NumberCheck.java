package abstraction;

public class NumberCheck {

 
static int n;
static int m;
    public static void main(String[] args) {
    	
    	System.out.println("Are both numbers positive? " + check(20, 10)); 
        System.out.println("Are both numbers positive? " + check(-5, 10));
    	
    }
        public static boolean check(int n,int m)
        {
            
        	
        	
        	if(n>0 && m>0)
        	{
        		
        		return true;
        	}
        	else 
        	{
        		
        		return false;
			}
			
        }

    
}
