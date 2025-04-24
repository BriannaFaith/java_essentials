package javaProgram;

import java.util.Arrays;

public class helloWorld {

	public static void main(String[] args) {
		System.out.println("Hello World!!");
		System.out.print("Brianna ");
		System.out.print("is a good girl ");
		System.out.println("who wants to learn java"); //Brianna is a good girl who wants to learn java
		
		//variables and data types
		int myInt = 10;
		double myDecimal = myInt;
		char myLetter = 'A';
		boolean answer;
		
		myDecimal = 2.5;
		myInt = (int)myDecimal; //2
		myInt = (int)myLetter; //65

		
		System.out.println("The Value of my integer is: "+ myInt);
		System.out.println(myDecimal); //2.5
		
		//arithmetic operators
		int a = 5;
		int b = 3;
		int sum = a+b;//8
		int diff = a-b;//2
		int prod = a*b ;//15
		int rem = a%b;//2
		double div = (double)a/b;// 1.6666666666666667	
		int maths = a+b*3; //14
		a+=b; //8
		a-=b; //5
		
		int result = 10 + 52;
		System.out.println(sum);
		System.out.println(diff);
		System.out.println(prod);
		System.out.println(rem);
		System.out.println(div);
		System.out.println(maths);
		System.out.println(a);
		System.out.println(result);
		
		//increment and decrement operators
		a++;//6
		++a; //7
		--a; //6
		int d = ++a; //7
		int e = 10;
		System.out.println(e++);
		
		//bitwise and shift operators
		int g=5; //bin - 101
		int h=3; //bin -011
		int result1= g & h; //1
		int result2= g | h; //7
		int result3 = g^h; //6
		int result4 = ~g; //-6
		int result5 = g<<1; //10
		int result6 = g>>1; //2

		System.out.println(result2);
		
		//relational operators
		int f = 10;
		int k = 5;
		boolean result7  = f!=k; //true
		boolean result8 = b>=a; //false
		System.out.println(result8);
		
		//logical operators
		//&& true and false returns false
		//|| true and false returns true
		boolean isRaining = true;
		boolean hasUmbrella = false;
		boolean staysDry = isRaining && hasUmbrella; //false
		boolean stays_dry = isRaining || hasUmbrella; // true
		boolean notRaining = !isRaining; //false
		System.out.println(notRaining);
		
		//conditional flow statements
		//if else if  else
		double total = 150;
		double discount;
		double finalTotal = 0;
		
		if (total<50)
		{
			discount=0;
		}
		else if(total>=50 && total<100)
		{
			discount = 0.2;
		}
		else if(total>100 && total<200) {
			discount = 0.25;
		}
		else 
		{
			discount=0.3;
		}

		finalTotal = total - total*discount;
		System.out.println("The final total:" +finalTotal);
		
		//switch case statements
		double balance = 1500;
		double amount = 200;
		int operation=5; //invalid choice
		switch(operation) {
		case 1:
			if (amount<=balance)
			{
				balance = balance - amount;
				System.out.println(balance); //1300				
			}
			else {
				System.out.println("Insufficient balance");
			}
		break;
		case 2:
			balance = balance+amount;
			System.out.println(balance); //1700
			break;
		default:
			System.out.println("Invalid choice");
		}
		
		//iterations
		//while, do while, for 
		int i = 1;
		while(i<=5) {
			System.out.println("java"); //prints java 5 times
			i++;
		}
		
		int m =6, t1=0, t2=1;
		System.out.println("First" + m + "terms: ");
		int j =1;
		
		while (j <= m) {
			System.out.print(t1);
			
			int sum1= t1+t2;
			t1 = t2;
			t2 = sum1;
			j++; //011235
		}
		
		int o = 2;
		int count = 1;
		do {
			System.out.println(o);
			o +=2;
			count++;
		}
		while (count <=10);//20
		
		//arrays
		int[] cars= {12, 13, 14, 15};
		int first_selection = cars[1]; //13
		cars[0]=10; //10
		int length = cars.length;//4
		for(int r=0; r<cars.length;r++) { 
			System.out.println("Numbers in the array:" + cars[r]); //prints all numbers in the array
			int add=0;
			add = sum+cars[r];
			System.out.println("The sum is" +add);
		}
		Arrays.sort(cars); //[10, 13, 14, 15]
		int index=Arrays.binarySearch(cars, 14); //2
		System.out.println(Arrays.toString(cars)); 
		System.out.println(index);
		int [] new_cars=Arrays.copyOf(cars, 4); //[10, 13, 14, 15]
		System.out.println(Arrays.toString(new_cars));
		
		//strings
		String myString = "Hello Bri";
		System.out.println(myString.length());//9
		System.out.println(myString.charAt(4)); //o
		System.out.println(myString.substring(2, 9)); //llo Bri
		System.out.println(myString.equals("Hello, Bri")); //false
		System.out.println(myString.toUpperCase()); //HELLO BRI
		System.out.println(myString.toLowerCase()); //hello bri
		System.out.println(myString.concat(" Welcome to Java")); //Hello Bri Welcome to Java
		System.out.println(myString.replace('o', 'a')); // Hella Bri
		//password checker application
		
		String password = "password";
		boolean hasUpperCase = !password.equals(password.toLowerCase());
		boolean hasLowerCase = !password.equals(password.toUpperCase());
		boolean hasDigit = false;
		boolean hasSpecialCharacter = false;
		boolean hasValidLength = password.length()>=8;
		
		for (int s =0; s<password.length(); s++) {
			if (password.charAt(s)>='0' && password.charAt(s)<='9') {
				hasDigit = true;	
			}
			if (password.charAt(s) =='!') {
				hasSpecialCharacter = true;
			}
			
		}
		if(hasUpperCase && hasLowerCase && hasDigit && hasSpecialCharacter && hasValidLength) {
			System.out.println("Password is strong");
		} else {
			System.out.println("Password is not strong enough");
			if(!hasSpecialCharacter);
			System.out.println("Password is missing a special character");
			if(!hasDigit);
			System.out.println("Password should have at least one digit");
			if(!hasLowerCase);
			System.out.println("Password should have lower case strings");
		}	
		
	}
}
