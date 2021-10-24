//one dimentional Array
/*
import java.lang.String;
import java.lang.System;
public class Arraypractice
{
     public static void main(String[] arg)
	 {
       int A[]=new int[10];
       int B[]={1,2,3,4,5};
       int C[];
       C=new int[10];
       int D[]=new int[5];
       int E [] = new int[5];
       B[2]	=15;
       for(int i=0;i<A.length;i++)
       {
	   System.out.println("Length of Array A is:" +A[i]);
	   }	   
	   for(int i=0;i<B.length;i++)
	   {
		   System.out.println("Lenght of Array is:" +B[i]);
	   }
	   for(int x:B)
	   {
		   System.out.println("Printing the values in Arry B using for each loop:" +x);
	   }
	   for(int x:B)
	   {
		   System.out.println("Checking whether the for each loop incement the values in Array B or not:" +(x++));
	   }
	   for(int x:B)
	   {
		   System.out.println("printing the values of Array B after increment:" +x);
	   }
	   for(int i=0;i<B.length;i++)
	   {
		   System.out.println("increasing the values in Array B" +B[i]++);
	   }
	   float B1[]={1,2,3,4,5};
	   System.out.println(B1);
	   System.out.println(B1.length);
	 }
}
*/
/*
import java.lang.String;
import java.lang.System;
import java.util.Scanner;
public class Arraypractice
{
	public static void main(String[] arg)
{    
    
     int A[] = {3,9,7,8,12,6,15,5,4,10};
	 int sum=0,p=0,key=0;
	for(int i=0;i<A.length;i++)
	{
		sum+= A[i];
	}System.out.println("Addition of all elements are:" +sum);
	for(int x:A)//using for each loop
	{
		p+= x;
	}System.out.println("Addition of all elements are:" +p);
	/*
	//searching an element
	System.out.println("Enter a key value:");
	int key1;
	 Scanner sc=new Scanner(System.in);
	 int A1[] = {3,9,7,8,12,6,15,5,4,10};
	 key1=sc.nextInt();
	for(int j=0;j<A1.length;j++)
	{
		key++;
		if(key1==A[j])
		{
			System.out.println("Element is found at index"+" " +j);
			System.exit(0)
		}
	}System.out.println("Element is not found");
}
}
*/
	/*
// finging maximum element
import java.lang.String;
import java.lang.System;
import java.util.Scanner;
public class Arraypractice
{
	public static void main(String[] arg)
{    
System.out.println("Enter a key value:");
	int key2;
	 Scanner sc1=new Scanner(System.in);
	 int A2[] = {3,9,7,8,12,6,15,5,4,10};
	 key2=A2[0];
	for(int j1=0;j1<A2.length;j1++)
	{
		
		if(key2<A2[j1])
		{
			key2=A2[j1];
		}
	}System.out.println("max Element is :" +" " +key2);
}
}
*/
/*
//printing second largest element
import java.lang.String;
import java.lang.System;
import java.util.Scanner;
public class Arraypractice
{
	public static void main(String[] arg)
	{
		int A[] = {3,9,7,8,12,6,15,5,4,10};
		int max1,max2;
		max1=max2=A[0];
		for(int i=0;i<A.length;i++)
		{
			if(A[i]>max1)
			{
				max2=max1;
				max1=A[i];
			}
			else if(A[i]>max2)
			{
				max2=A[i];
			}
		}System.out.println("Second largest element is:" +" " +max2);
	}
}
*/
/*
//left rotation of an array
import java.lang.String;
import java.lang.System;
public class Arraypractice
{
	public static void main(String[] arg)
	{
		int A[]={5,9,6,10,12,7,3,5,4,2};
		int temp;
		temp=A[0];
		for(int x:A)
			System.out.print(x+",");
		System.out.println("");
		System.out.print("Rotating an Array:");
		
		for(int i=1;i<A.length;i++)
		{
			A[i-1]=A[i];
			
	    }A[A.length-1]=temp;
		for(int x:A)
			System.out.print(x+",");
		System.out.println("");
	}
}
*/
/*
//inserting an element at given index 
import java.lang.String;
import java.lang.System;
public class Arraypractice
{
	public static void main(String[] arg)
	{
		int A[]=new int[10];
		A[0]=5;A[1]=9;A[2]=6;A[3]=10;A[4]=12;A[5]=7;
		int n=6,index;
		for(int i=0;i<n;i++)
			System.out.print(A[i] +",");
		System.out.println("");
		int x=20;
	     index =2;
		for(int i=6;i>index;i--)
		{
			A[i]=A[i-1];
		}A[index]=x;
		for(int i=0;i<n;i++)
			System.out.print(A[i] +",");
		System.out.println("");
	}
}
*/
//copying an array
import java.lang.String;
import java.lang.System;
public class Arraypractice
{
	public static void main(String[] arg)
	{
		int A[]={8,6,10,9,2,15,7,13,14,11};
		int B[]=new int[10];
		System.out.println("Array A:");
		for(int x:A)
			System.out.print(x +" ");
		System.out.println("");
	for(int i=0;i<A.length;i++)
		B[i]=A[i];
	System.out.println("");
	System.out.println("Array A copied to Array B:");
	for(int i=0;i<B.length;i++)
		System.out.print(B[i] +" ");
	System.out.println("");
	}
}