package ExceptionHandling;

public class UserDefinedDemo {
	
    public static void main(String[] args) throws InvalidAgeException{
    		int age = 16;
    	
        try {
        		if (age < 18)
                throw new InvalidAgeException("Age below 18");
        } 
        catch (Exception e) {
//        	System.out.println(e);
            System.out.println(e+" "+e.getMessage());
        }
    }
}

