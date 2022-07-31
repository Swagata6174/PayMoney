package com.greatlearning.notecount.main;
import com.greatlearning.notecount.service.*;

import java.util.Scanner;

public class NoteCountDriver {
	public static void main(String args[])
	{
		MergeSortImplementation mergeSortImplementation=new MergeSortImplementation();
		NoteCountService notesCount=new NoteCountService();
		System.out.println("enter the size of currency denomination");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int[] notes=new int[size];
		System.out.println("enter the currency denominations value");
		for(int i=0;i<size;i++)
		{
			notes[i]=sc.nextInt();
		}
		System.out.println("enter the amount you want to pay");
		int amount=sc.nextInt();
		mergeSortImplementation.sort(notes,0,notes.length-1);
		notesCount.notesCountImplementation(notes,amount);
		sc.close();
		
	}

}
