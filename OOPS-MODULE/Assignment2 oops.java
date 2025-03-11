
1. Arithmetic & Assignment Operators//

Q1:  Write a program to swap two numbers  without using a third variable  and without 
using arithmetic operators like  +  or  -  . 
Hint  : Use bitwise XOR  ^  operator.

 class Main {
    public static void main(String[] args) {
        int a = 5;  
        int b = 10; 
        System.out.println("Before swapping: a = " + a + ", b = " + b);
        a = a ^ b;  
        b = a ^ b;  
        a = a ^ b;  
        System.out.println("After swapping: a = " + a + ", b = " + b);
    }
}

Q2:  Write a program to check whether a given number is  even or odd  using only  bitwise 
operators  . 
Hint  : Use  n & 1  to check.
class Main {
    public static void main(String[] args) {
        int number = 10; 
        if ((number & 1) == 0) {
            System.out.println(number + " is Even.");
        } else {
            System.out.println(number + " is Odd.");
        }
    }
}

Q3:  Implement a program that calculates the  sum of digits  of an integer using  modulus 
(  %  ) and division (  /  ) operators.

 class Main {
    public static void main(String[] args) {
        int number = 12345;  
        int sum = 0;
        
          while (number != 0) {
            int digit = number % 10;
            sum += digit;
            number /= 10;
        }
        System.out.println("Sum of digits: " + sum);
    }
}

Q4:  Write a program to find whether a given number is  divisible by 3  without using the 
modulus (  %  ) or division (  /  ) operators. 
Hint  : Use  subtraction and bitwise shifts 

public class DivisibleByThree {
    public static boolean isDivisibleByThree(int number) {
        number = Math.abs(number);
        while (number >= 3) {
            number -= 3;
        }
        return number == 0;
    }
    public static void main(String[] args) {
        int num = 9; 
        if (isDivisibleByThree(num)) {
            System.out.println(num + " is divisible by 3.");
        } else {
            System.out.println(num + " is not divisible by 3.");
        }
    }
}

Q5:  Write a Java program to  swap two numbers  using the  +=  and  -=  operators only.

public class SwapNumbers {
    public static void main(String[] args) {
        int num1 = 10; 
        int num2 = 20; 
        System.out.println("Before swapping: num1 = " + num1 + ", num2 = " + num2);
        num1 += num2; 
        num2 = num1 - num2;  
        num1 -= num2;  
        System.out.println("After swapping: num1 = " + num1 + ", num2 = " + num2);
    }
}

2. Relational & Logical Operators 

Q6:  Write a program to find the  largest of three numbers  using only the  ternary operator 
(  ? :  ) 
public class LargestNumber {
    public static void main(String[] args) {
        int num1 = 10, num2 = 20, num3 = 15;
        int largest = (num1 > num2) ? ((num1 > num3) ? num1 : num3) : ((num2 > num3) ? num2 : num3);
        System.out.println("The largest number is: " + largest);
    }
}
Q7:  Implement a Java program that checks whether a given year is a  leap year or not  using 
logical (  &&  ,  ||  ) operators
 
import java.util.Scanner;
public class LeapYearCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();
        boolean isLeapYear = (year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0));
        if (isLeapYear) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }
}
Q8:  Write a program that  takes three boolean inputs  and prints  true  if at least two of 
them are  true  . 
Hint  : Use logical operators (  &&  ,  || 
import java.util.Scanner;

public class AtLeastTwoTrue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first boolean value (true/false): ");
        boolean a = scanner.nextBoolean();
        
        System.out.print("Enter second boolean value (true/false): ");
        boolean b = scanner.nextBoolean();
        
        System.out.print("Enter third boolean value (true/false): ");
        boolean c = scanner.nextBoolean();
        boolean result = (a && b) || (a && c) || (b && c);
        System.out.println("At least two are true: " + result);
    }
}
Q9:  Implement a Java program that checks if a number is  within a specific range (20 to 
50)  without using  if-else  . 
Hint  : Use  logical AND (  &&  ) in a print statement
import java.util.Scanner;

public class CheckNumberInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        System.out.println((number >= 20 && number <= 50) ? "Number is within the range 20 to 50" : "Number is outside the range 20 to 50");
    }
}
Q10:  Write a program to determine if a  character is a vowel  or a consonant using the 
ternary operator.
import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0);

        String result = (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                        ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') 
                        ? "Vowel" 
                        : "Consonant";
        System.out.println(ch + " is a " + result);
    }
}

3. Bitwise Operators

Q11:  Write a program to check if a given number is a  power of 2  using bitwise operators. 
Hint  :  n & (n - 1) == 0  for positive numbers.
import java.util.Scanner;
 class PowerOfTwo {  
    public static boolean isPowerOfTwo(int n) {
       
        return n > 0 && (n & (n - 1)) == 0;
    }
    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (isPowerOfTwo(n)) {
            System.out.println(n + " is a power of 2.");
        } else {
            System.out.println(n + " is not a power of 2.");
        }
    }
}
Q12:  Write a Java program to  multiply a number by 8  without using  *  or  /  operators. 
Hint  : Use bitwise left shift (  << 
import java.util.Scanner;
 class MultiplyByEight {
    public static int multiplyByEight(int n) {
        return n << 3;  
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int result = multiplyByEight(number);
        System.out.println("The number " + number + " multiplied by 8 is: " + result);
    }
}

Q13:  Implement a Java program to find the  absolute value  of an integer using bitwise 
operators. 
Hint  :  mask = num >> 31; abs = (num + mask) ^ mask
import java.util.Scanner;
public class AbsoluteValue {
    public static int absoluteValue(int num) {
        int mask = num >> 31;
        return (num + mask) ^ mask;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);      
        System.out.print("Enter an integer: ");
        int number = sc.nextInt();    
        int result = absoluteValue(number);
        System.out.println("The absolute value of " + number + " is: " + result);        
    }
}
Q14:  Write a program to count the  number of 1s (set bits)  in a binary representation of a 
number using bitwise operations. 
Hint  : Use  n & (n - 1) 
public class CountSetBits {
    public static void main(String[] args) {
        int n = 29; 
        int count = countSetBits(n);
        System.out.println("Number of set bits in " + n + " is: " + count);
    }
    public static int countSetBits(int n) {
        int count = 0;
        while (n > 0) {
            n = n & (n - 1);
            count++;
        }
        
        return count;
    }
}
Q15:  Implement a program to swap  odd and even bits  of a number using bitwise 
operators. 
Hint  : Use masks:  (x & 0xAAAAAAAA) >> 1 | (x & 0x55555555) << 1

public class SwapOddEvenBits {
    public static void main(String[] args) {
        int x = 29;  
        int swapped = swapOddEvenBits(x);
        System.out.println("Original number: " + x);
        System.out.println("Number after swapping odd and even bits: " + swapped);
    }
    public static int swapOddEvenBits(int x) {
        // Masks for even and odd bit positions
        int EVEN_MASK = 0xAAAAAAAA;  // 10101010... (Even positions)
        int ODD_MASK = 0x55555555;   // 01010101... (Odd positions)
        return ((x & EVEN_MASK) >> 1) | ((x & ODD_MASK) << 1);
    }
}
4. Ternary Operator Challenges
 
Q16:  Write a program that determines whether a given number is  positive, negative, or 
zero  using only the  ternary operator
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        String result = (number > 0) ? "Positive" : (number < 0) ? "Negative" : "Zero";
        System.out.println("The number is " + result);
    }
}
Q17:  Implement a Java program that finds the  minimum of four numbers  using nested 
ternary operators. 
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        
        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();
        
        System.out.print("Enter the fourth number: ");
        int num4 = scanner.nextInt();

        int min = (num1 < num2 && num1 < num3 && num1 < num4) ? num1 :
               (num2 < num1 && num2 < num3 && num2 < num4) ? num2 :
               (num3 < num1 && num3 < num2 && num3 < num4) ? num3 : num4;
        System.out.println("The minimum number is: " + min);      
    }
}
Q18:  Given a student’s percentage, print  “Pass”  if the percentage is 40 or above; 
otherwise, print  “Fail”  , using only the ternary operator. 
public class Main {
    public static void main(String[] args) {
        double percentage = 45.0;   
        String result = (percentage >= 40) ? "Pass" : "Fail";        
        System.out.println(result);
    }
}
Q19:  Write a Java program that checks whether a character is  uppercase, lowercase, or 
not a letter  using only the ternary operator.
import java.util.Scanner;

public class CharacterCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  
        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0);
        String result = (Character.isUpperCase(ch)) ? "Uppercase letter" :
                        (Character.isLowerCase(ch)) ? "Lowercase letter" :
                        "Not a letter";
        System.out.println(result);
    }
}
Q20:  Implement a Java program that  returns the absolute value  of a given number using 
the ternary operator (without using  Math.abs()  ). 
import java.util.Scanner;

public class AbsoluteValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);     
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int absoluteValue = (number < 0) ? -number : number;
        System.out.println("The absolute value is: " + absoluteValue);       
    }
}

5. Miscellaneous Operator Questions 

Q21:  Write a program that  increments a number without using  +  or  ++  operators. 
Hint  : Use bitwise  - (~x) 
public class Main {
    public static void main(String[] args) {
        int num = 5; 
        System.out.println("Original number: " + num);   
        int incrementedNum = increment(num);      
        System.out.println("Incremented number: " + incrementedNum);
    }    
    public static int increment(int num) {
        return ~(~num) - 1;
    }
}
Q22:  Implement a  calculator  that takes two numbers and an operator (  +  ,  -  ,  *  ,  /  ) as input 
and prints the result using only  switch-case  . 
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {      
        Scanner scanner = new Scanner(System.in);     
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();      
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();
        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0); 
        
        double result; 
        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println("Result: " + num1 + " + " + num2 + " = " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println("Result: " + num1 + " - " + num2 + " = " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println("Result: " + num1 + " * " + num2 + " = " + result);
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("Error! Division by zero is not allowed.");
                } else {
                    result = num1 / num2;
                    System.out.println("Result: " + num1 + " / " + num2 + " = " + result);
                }
                break;
            default:
                System.out.println("Error! Invalid operator.");
                break;
        }

    }
}
Q23:  Given a number, find whether it is  odd or even  using the  &  bitwise operator and print 
the result without using  if-else
public class Main {
    public static void main(String[] args) {
        int num = 7; 
        String result = num%2==0 ? "Even" : "odd";      
        System.out.println("The number is: " + result);
    }
}
Q24:  Write a program that prints  all even numbers from 1 to 100  using only  bitwise AND 
(  &  )  and  for  loop
public class Main {
    public static void main(String[] args) {
        for (int num = 1; num <= 100; num++) {       
            if ((num & 1) == 0) {
                System.out.println(num); 
            }
        }
    }
}














































