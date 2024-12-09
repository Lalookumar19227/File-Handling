package file_handling;
//file writing operation
import java.io.*;
import java.util.Scanner;
public class UserDetails {
	public static void main(String[] args) throws IOException {
		FileWriter fw=null;
		Scanner sc=new Scanner(System.in);
		System.out.print("ENter the name: ");
		String name=sc.nextLine();
		System.out.print("Enter Age: ");
		int age=sc.nextInt();
		System.out.print("ENter weight: ");
		double weight=sc.nextDouble();
		try {
			fw=new FileWriter("f:\\user.txt");
			System.out.println("File Is created!");
			fw.write("Name is: "+name);
			fw.write("\nAge is: "+age);
			fw.write("\nWeight is: "+weight);
		}
		catch(Exception e) {
			System.out.println("File is not created");
		}
		finally {
			fw.close();
		}
		System.out.println("====Program Ends====");
	}

}
