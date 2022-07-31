package com.greatlearning.transaction.main;
import com.greatlearning.transaction.service.*;
import java.util.Scanner;

public class transactionDriver {
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the size of transaction array");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("enter the values of the array"); 
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("enter the total no of targets that needs to be achieved");
		int targetNo=sc.nextInt();
		transactionService TransactionService=new transactionService();
		TransactionService.checkTransaction(arr,targetNo);
		sc.close();
	}
}
