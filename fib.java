class Fib{
    	public static void main(string []ags){
		Scanner sc=new Scanner(System.in);

		int n = sc.nextInt();
		System.out.println( fib(n));
	}
	public int fib(int n){
		if( n == 0 || n == 1 ) return 1;
		return fib( n - 1 ) + fib( n - 2 );
	}
}
