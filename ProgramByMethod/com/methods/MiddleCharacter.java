package com.methods;

import java.util.Scanner;
public class MiddleCharacter {
static int position;
static int length;
public static String middle(String inp){//anikesh=6
if(inp.length()%2==0){
position=inp.length()/2-1;
length=2;
}else{
    position=inp.length()/2;
    length=1;
}
return inp.substring(position,position+length);
}

 public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter any String Value :");
    String inp=sc.nextLine();
   String m= middle(inp);
System.out.print("Middle is :"+m);

 }
    }
