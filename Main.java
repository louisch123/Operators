class Main {
  public static void main(String[] args) {
    // operators
    boolean bool1 = true;
  boolean bool2 = false;
  System.out.println(bool1 && bool2); // prints false
  
  int num1 = 5;
  int num2 = 3;
  System.out.println(num1 + num2); // prints 8

  System.out.println(num1 < num2); // false

  System.out.println(num1++); // 5
  System.out.println(num1); // 6

  num2 -= 1;
  System.out.println(num2); // 2
    /* Assignment Operators (Gives Values Back)
      =  Assignment Operatior 
      Addition (+)
      Subtraction (-)
      Multiplication (*)
      Division (/)
      Modulus (remainder operator) (%)
      //Rational 
      Shorthand (+=, -=, *=, /=, %=)
      // Other
      Increment (++)
      Decrement (- -)
                 */
    int x = 8;
    int y = 6;
    /*//Sum
    System.out.println (x+y);
    System.out.println (x);
    x = (x+y);
    System.out.println(x);
    // Subtraction-Difference
    System.out.println(x - y);
    // Product-Multiple
    System.out.println(x * y);
    //Quotient- Divide - Will return a whole value. 6 goes into 8       once
    System.out.println(x / y);// 8/6 = 1
    // Remainder-Modulus - helpful to determine if a number is a multiple of another, and is used often to find odd or even values.
    System.out.println(x % y);
    //Shorthand
    x += y;// x = x + y = 8 + 6; x=14
    System.out.println(x);
    
    x -= 3;// x = x - 3; x = 5
    System.out.println(x);*/
    
    // Increment- Add 1; Changes the value then allows the new value to be used 
    //POstFix- Use the value of the operand in the expressiion and 
      //then update it 
    System.out.println(x++);// Operand x will add 1 to the value of     x after the next println expression ;
    System.out.println(x);//9 ; Postfix 
    System.out.println(x++);//9 ; Postfix
    System.out.println(x);//10; Postfix
    //PreFix - We first update the value of the operand and then we use the new value in the expression
    System.out.println(++x);// asking to add 1 before the x; 11; Prefix
    System.out.println(x); //11; Prefix
    
    //Decrement subtract1;
    //Postfix
    System.out.println(x--); //Postfix
    System.out.println(x); // Postfix
    //Prefix
    System.out.println(--x);
    System.out.println(x);
  }
}