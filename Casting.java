import java.util.Scanner;

class typeCasting{
  @Override
	public String toString() {
		return "typeCasting []";
	}
// Casting - Remember the range of the Datatype used. 
public static void main(final String[] args){
    final Scanner typeCasting = new Scanner(System.in);
  //Upcasting
      int value = 5;
        double value2 = 6.5;
      double sum = value + value2;
    System.out.println(sum);

//Downcasting 
  int sum2 = value + (int)value2;
  System.out.println(sum2);

  // Downcasteed
  byte aByte = 20;
  short aShort = 50;

  byte sum3 = (byte) (aByte + aShort);
  System.out.println(sum3);

  short sum4 = (short) (aByte + aShort); //storing the sum in the smaller datatype
  System.out.println(sum4);
  
  }
}
