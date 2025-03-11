Question 1:
class ArithmeticOperations
{
  public static void main(String args[])
  {
     int num1 = 85;
     int num2 = 6;

     int add = num1 + num2;
     System.out.println("Addition:" + add);

     int sub = num1 - num2;
     System.out.println("Substraction:" + sub);

     int mul = num1 * num2;
     System.out.println("Multiplication:" + mul);

     int div = num1 / num2;
     System.out.println("Division:" + div);

     int mod = num1 % num2;
     System.out.println("Modulus:" + mod);
   }
}
Question 2:
class DataDeclareAndInitiate
{
  public static void main(String args[])
   {
      byte bt = 120;
      short s = 5000;
      int i = 547872125;
      long l = 54879874125457845L;
      float f = 45.12F;
      double d = 787.4587D;
      char c = 'R';
      boolean b = true;


     System.out.println("Byte:" + bt);
     System.out.println("Short:" + s);
     System.out.println("Int:" + i);
     System.out.println("Long:" + l);
     System.out.println("Float:" + f);
     System.out.println("Double:" + d);
     System.out.println("Char:" + c);
     System.out.println("Boolean:" + b); 
   }
}
Question 3:
class ImplicitAndExplicitTypeCast
{
  public static void main(String args[])
   {
     int i = 50000;
     long l = i;
     float f  = l;

     System.out.println("Implicit (Automatically) Type Casting");
     System.out.println("int to long: " + l);
     System.out.println("long to float: " + f);

    double d = 88.9999;
    int i1 = (int) d;
    char c = (char) i1;

     System.out.println("Explicit (Manually) Type Casting");
     System.out.println("double to int: " + i1);
     System.out.println("int to char: " + c);
     
     }
}
Question 4:
class Q4 {
    public static void main(String[] args)
   {
       
       Integer intValue = 42; 
        Double doubleValue = intValue.doubleValue(); 
        System.out.println("Integer value: " + intValue);
        System.out.println("Converted to Double: " + doubleValue);

        
        Double doubleNumber = 42.99; 
        Integer intNumber = doubleNumber.intValue();
        System.out.println("Double value: " + doubleNumber);
        System.out.println("Converted to Integer: " + intNumber);
    }
}
Question 5:
class Q5
{
  public static void main(String args[])
  {
     int num1 = 10;
     int num2 = 20;
     int num3 = 30;
     int num4 = 40;
     
  System.out.println("Before Swapping numbers without temp variable: " + num1 + " & " + num2);
  
     num1 = num1 + num2;
     num2 = num1 - num2;
     num1 = num1 - num2;
	 
    System.out.println("After Swapping numbers without temp variable: " + num1 + " & " + num2); 
	
    System.out.println();  
	
    System.out.println("Before Swapping numbers with temp variable: " + num3 + " & " + num4);
	
    int temp = num3;
        num3 = num4;
        num4 = temp;
		
    System.out.println("After Swapping numbers with temp variable: " + num3 + " & " + num4); 

  }
}
Question:6
import java.util.Scanner;
class Q6
{
  public static void main(String args[])
  {
        Scanner sc = new Scanner(System.in);
   
        System.out.print("Enter alphabet:");
        char c = sc.next().charAt(0);
  
       if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
          c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U')
          {
              System.out.println(c + " is a Vowel.");
           }
        else
            System.out.println(c + " is a consonant.");
  }






















