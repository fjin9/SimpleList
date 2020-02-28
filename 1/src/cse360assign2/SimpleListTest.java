//Name: Feifan Jin
//ClassID: 151
//Assignment 1
package cse360assign2;

import java.util.Scanner;

public class SimpleListTest {
	public static void main(String[] args) 
	{
        int choice;
        Scanner sc = new Scanner(System.in);

        SimpleList sl = new SimpleList();

        boolean done = false;

        while (!done) 
        {
            System.out.println("\n1.Add");

            System.out.println("2.Remove");

            System.out.println("3.Search");

            System.out.println("4.Print List");

            System.out.println("5.Display Size");

            System.out.println("6.Append");

            System.out.println("7.Display First Element");

            System.out.println("8.Display Current Capacity");

            System.out.println("9.Exit");

            System.out.print("Enter Choice :");

            choice = sc.nextInt();

            switch (choice) 
            {
            case 1:
            {
                System.out.print("Enter Number to add :");

                int num = sc.nextInt();

                sl.add(num);

                break;
             }

             case 2: 
             {
            	 System.out.print("Enter Number to remove :");

                 int num = sc.nextInt();

                 sl.remove(num);

                 break;

             }

             case 3: 
             {
                 System.out.print("Enter Number to search :");

                 int num = sc.nextInt();

                 int indx = sl.search(num);

                 if (indx == -1)
                 {

                     System.out.println(num + " not found in the list");

                 }
                 else 
                 {

                     System.out.println(num + " is found in the list index " + indx);

                 }

                 break;

             }

             case 4: 
             {

                 System.out.println(sl);

                 break;

             }

             case 5: 
             {

                 System.out.println("List size is :" + sl.count());

                 break;

             }

             case 6: 
             {

                 System.out.print("Enter Number to append :");

                 int num = sc.nextInt();

                 sl.append(num);

                 break;

             }

             case 7: 
             {

                 if (sl.count() == 0) 
                 {

                     System.out.println("Sorry! List is empty!");

                 } 
                 else 
                 {
                	 System.out.println("First element is :" + sl.first());
                 }


                 break;

             }

             case 8: 
             {

                 System.out.println("Current list capacity is :" + sl.size());

                 break;

             }

             case 9: 
             {

                 done = true;

                 break;

             }

             default:

                 System.out.println("Invalid Choice");

             }

        }

    }

}
