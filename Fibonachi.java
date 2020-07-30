

import java.lang.Math; // headers MUST be above the first class

// one class needs to have a main() method
public class Fibonachi
{
  // arguments are passed using the text field below this editor
  public static void main(String[] args)
  {
	System.out.println(fibNaiv(5));
	// System.out.println(fibEfective(100));
  }


  // you can add other public classes to this editor in any order
  private static long fibEfective(int n)
  {
	long[] arr = new long[n+1];
	arr[0] = 0;
	arr[1] = 1;

    for(int i = 2; i<= n ; i++) {

      arr[i] = arr[i-1] + arr[i-2]; 
    }
    
    return arr[n];
  }
  // better way
  private static long fibNaiv(int n)
  {
	if ( n <= 1 )
		return n;

	return fibNaiv(n-1) + fibNaiv(n-2);
  }
  
}
