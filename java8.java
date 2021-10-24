public class Java8Tester {
   public static void main(String args[]){
      Java8Tester tester = new Java8Tester();
		
      
      //with parenthesis and Java 11
      GreetingService greetService1 = message ->
      System.out.println("Hello " + message);
		
		greetService1.sayMessage("world");
		
      () -> System.out.println("Hello World");
   }
	
  
	
   interface GreetingService {
      void sayMessage(String message);
   }
	
  
}
