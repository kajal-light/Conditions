package com.Ifloop;

import java.util.Scanner;

public class Day {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("enter the input");
int x=sc.nextInt();
String ans="";

switch(x) {

case 1:
	ans="monday";
	break;
case 2:
	ans="TUesday";
	break;
case 3:
	ans="wed";
	break;
case 4:
	ans="thus";
	break;
case 5:
	ans="fri";
	break;
case 6:
	ans="sat";
	
case 7:
	ans="sun";
	break;
case 8:
	ans="null";
	break;
	
	
		
}

System.out.println(ans);
}
}