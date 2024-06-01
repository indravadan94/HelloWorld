import java.util.Scanner;
public class Demo1 {
	
	public static void main(String args[]){
		
		reverseString();
		swapString();
		fibonnaciSeries();
		
	}
	
	public static void reverseString() {
		String a ="Hello World!";
		String b = "";
		
		for(int i=a.length()-1;i>=0;i--) {
			b+=a.charAt(i);
		}
		System.out.println(b);
	}
	
	public static void swapString() {
		String a = "Hello";
		String b = "World";
		
		a+=b;//HelloWorld
		b=a.substring(0, a.length()-b.length());//
		a=a.substring(b.length());
		
		System.out.println(a);
		System.out.println(b);
	}

	public static void fibonnaciSeries() {
		int r =0;
		
		// Use scanner class to get the user input.
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		r = sc.nextInt();
		
		int []num = new int[r];
		num[0]=0;
		num[1]=1;
		
		for(int i=2;i<r;i++) {
			num[i]=num[i-1]+num[i-2];
		}
		
		
		
		for(int i=0;i<r;i++) {
			System.out.println(num[i] + " ");
		}
		
	}
}
