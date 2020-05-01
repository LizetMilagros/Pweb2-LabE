import java.util.*;
class Fib{
    	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println( liz(n));
	}
	public static int liz(int n){
		if( n == 0 || n == 1 ) return 1;
		return liz( n - 1 ) + liz( n - 2 );
	}
}
