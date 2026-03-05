import java.util.Scanner;

public class PracticeProblem {
	Scanner input = new Scanner(System.in);

	public static void main(String args[]) {
		q1();
		q2();
		q3();
		q4();
		q5();
	}

	public static void q1() {
		Scanner input = new Scanner(System.in);
		String name;
		System.out.print("What is your name: ");
		name =input.nextLine();
		System.out.println(name);
		//Write question 1 code here
	}

	public static void q2() {
		Scanner input = new Scanner(System.in);
		int num;
		System.out.print("Input a whole number: ");
		num=input.nextInt();
		System.out.println((num*2)+2);
	}
		//Write question 2 code here

	public static void q3() {

		Scanner scanner= new Scanner(System.in);
		Double radius;
		System.out.print("Input a radius: ");
		radius=scanner.nextDouble();
		System.out.println(radius*2*3.14);
		System.out.println(radius*radius*3.14);
		//Write question 3 code here
	}

	public static void q4() {
		Scanner scanner=new Scanner(System.in);
		String word1;
		String word2;
		int num1;

		System.out.print("Input a first name: ");
		word1=scanner.nextLine();
		System.out.print("Input a last name: ");
		word2=scanner.nextLine();
		System.out.print("Input an age: ");
		num1=scanner.nextInt();
		System.out.println(word2+", "+ word1+" - "+num1);

		//Write question 4 code here
	}

	public static void q5() {
		Scanner scanner=new Scanner(System.in);
		String name;
		int age;
		System.out.print("Input a name: ");
		name=scanner.nextLine();
		System.out.print("Input an age: ");
		age=scanner.nextInt();
		int iq;
		iq=age+3;
		System.out.println(name+iq);
		System.out.println(age);


		//Write question 5 code here
	}

}
