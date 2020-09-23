package exercise1;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

        Scanner input = new Scanner(System.in);
		
		Singers singer1 = new Singers();

		System.out.println(singer1.printInfo());
		System.out.println("----------");
        
        System.out.print("Enter ID: ");
        singer1.setId(input.nextLine());
        System.out.print("Enter Name: ");
        singer1.setName(input.nextLine());
        System.out.print("Enter Address: ");
        singer1.setAddress(input.nextLine());
        System.out.print("Enter Birth Date: ");
        singer1.setBirthDate(input.nextLine());
        System.out.print("Enter Albuns #: ");
        singer1.setNumAlbum(input.nextInt());   
        System.out.println("----------");

        System.out.println(singer1.printInfo());
        
        input.close();
                
	}
	
}