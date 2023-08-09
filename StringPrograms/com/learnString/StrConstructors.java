package com.learnString;

//import java.util.Arrays;

public class StrConstructors {

  public static void main(String[] args) {
    String str = "Anikesh";
    //String str1 = str;
    StringBuffer sbuf = new StringBuffer("Yatish");
    StringBuilder sbui = new StringBuilder("Khushi");
    str.concat("Maheshwari");
    //str + "Maheshwari";
    sbuf.append("Prajapat");
    sbui.append("Yadav");
    System.out.print("str " + str + "\t" + "sbuf " + sbuf + "\t" + sbui + "\t");
    //System.out.println(str1);
    char[] chr = { 'a', 'b', 'c', 'd' };
    String a = new String(chr);
    System.out.println(a);
    byte[] by = { 101, 120, 13, 14, 15, 16 };
    String b = new String(by);
    System.out.println(b);
    String name = "  Anikesh  ";
    String email = " Anikeshmaheshwari558@gmail.com ";
    String Phone = " 9179901034 ";
    String name1 = new String("Ram");
    //String name1 = null;
    // it will give Exception
    System.out.println(name + " Len is :" + name.length());
    System.out.println(email + " Len is : " + email.length());
    System.out.println(Phone + " Len is : " + Phone.length());
    if (name1.length() == 0) {
      System.out.println("String is Empty");
    } else {
      System.out.println(name1 + " Len is :" + name1.length());
    }
    String name2 = new String();
    System.out.println(name2 + " Empty " + name2.isEmpty());
    System.out.println(name + " Len is :" + name.isEmpty());
    System.out.println(email + " Len is : " + email.isEmpty());
    System.out.println(Phone + " Len is : " + Phone.isEmpty());

    System.out.println(name2 + " Empty " + name2.trim());
    System.out.println(name + " Len is :" + name.trim());
    System.out.println(email + " Len is : " + email.trim());
    System.out.println(Phone + " Len is : " + Phone.trim());
  }
}
