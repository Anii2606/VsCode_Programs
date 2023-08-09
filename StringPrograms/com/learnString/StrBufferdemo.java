package com.learnString;

public class StrBufferdemo {

  public static void main(String[] args) {
    StrBufferdemo sbd = new StrBufferdemo();
    sbd.caPacity();
  }

  void caPacity() {
    System.out.println("capacity()");
    StringBuffer sb1 = new StringBuffer();
    System.out.println(sb1.capacity()); // 16
    //////////////////////////////////////////////////////

    StringBuffer stb1 = new StringBuffer(1000);
    System.out.println(stb1.capacity()); // 1000
    /////////////////////////////////////////////////////////////

    StringBuffer stb2 = new StringBuffer(); // capacity is 16
    // default capacity is 16 but you gave above 16 than automatically increase capacity by (16*2)+2=34(old capacity *2)+2)
    stb2.append("Anikesh"); //capacity under 16
    stb2.append("chouhan java"); // outof 16 so capacity is (16*2)+2=34
    System.out.println(stb2.capacity()); //34
    ///////////////////////////////////////////////////////////

    StringBuffer sb2 = new StringBuffer("Anikesh"); // but here capacity is 16+7=23
    //capacity is 23 but you gave above 23 than automatically increase capacity by (23*2)+2=48
    sb2.append("Chouhan is gooodd");
    System.out.println(sb2.capacity()); // 48

    lengtH();
  }

  void lengtH() {
    System.out.println("Length()");
    StringBuffer sb1 = new StringBuffer("Anikesh is learning java language");
    System.out.println(sb1.length()); // 33
    apPend();
  }

  void apPend() {
    System.out.println("append()");
    StringBuffer sb1 = new StringBuffer("Anikesh is learning java language");
    System.out.println(sb1.append("\nHe has good Coding Skills"));
    // Anikesh is learning java language
    // He has good Coding Skills
    char0At();
  }

  void char0At() {
    System.out.println("char0At()");
    StringBuffer sb1 = new StringBuffer("Anikesh is learning java language");
    System.out.println(sb1.charAt(30));

    deletee();
  }

  void deletee() {
    System.out.println("delete()");
    StringBuffer sb1 = new StringBuffer("Anikesh is learning java language");
    System.out.println(sb1.delete(24, 33));
    // Anikesh is learning java
    deleteeCharAt();
  }

  void deleteeCharAt() {
    System.out.println("delete()");
    StringBuffer sb1 = new StringBuffer("Anikesh is learning java language");
    System.out.println(sb1.deleteCharAt(20));
    // Anikesh is learning ava language , j got delete
    equalss();
  }

  void equalss() {
    System.out.println("Equals()");
    StringBuffer d = new StringBuffer("Anikesh Chouhan");
    StringBuffer e = new StringBuffer("Anikesh Chouhan");
    System.out.println(d.equals(e)); // false
    // so we can say that in StringBuffer  equals()Method is not work
    // because d and e refer differnt object
    System.out.println(d == e); //false , Not working
    // but
    d = e.append("java"); // This is working
    System.out.println(d.equals(e)); // true , because d and e both are  refer one object
    index0f();
  }

  void index0f() {
    System.out.println("index0f()");
    StringBuffer name1 = new StringBuffer("Anikesh ");
    StringBuffer name2 = new StringBuffer("Maheshwari ");
    System.out.println(name1.indexOf("i")); // 2
    System.out.println(name2.indexOf("i")); // 9
    lastindex0f();
  }

  void lastindex0f() {
    System.out.println("lastindex0f()");
    StringBuffer name1 = new StringBuffer("Anikesh ");
    StringBuffer name2 = new StringBuffer("Maheshwari ");
    System.out.println(name1.lastIndexOf("e")); // 5
    System.out.println(name2.lastIndexOf("a")); // 7
    insertt();
  }

  void insertt() {
    System.out.println("insert()");
    StringBuffer name1 = new StringBuffer("Anikesh ");
    StringBuffer name2 = new StringBuffer("Maheshwari ");
    System.out.println(name1.insert(0, "Ani")); //AniAnikesh
    System.out.println(name2.insert(2, "akale")); //Maakaleheshwari
    rePlace();
  }

  void rePlace() {
    System.out.println("rePlace()");
    StringBuffer name1 = new StringBuffer("Anikesh ");
    StringBuffer name2 = new StringBuffer("Maheshwari ");
    System.out.println(name1.replace(3, 7, "Ani")); //AniAni
    System.out.println(name2.replace(1, 4, "akale")); // Makaleshwari
    reverse();
  }

  void reverse() {
    System.out.println("reverse()");
    StringBuffer name1 = new StringBuffer("Anikesh ");
    StringBuffer name2 = new StringBuffer("Maheshwari ");
    System.out.println(name1.reverse()); // hsekina
    System.out.println(name2.reverse()); // irawhsehaM
    subsequence();
  }

  void subsequence() {
    System.out.println("subsequence()");
    StringBuffer name1 = new StringBuffer("Anikesh ");
    StringBuffer name2 = new StringBuffer("Maheshwari ");
    System.out.println(name1.subSequence(0, 4)); // Anik
    System.out.println(name2.subSequence(3, 10)); //eshwari
    substring();
  }

  void substring() {
    System.out.println("subString()");
    StringBuffer name1 = new StringBuffer("Anikesh ");
    StringBuffer name2 = new StringBuffer("Maheshwari ");
    System.out.print(name1.substring(3)); // kesh
    System.out.println(name2.substring(8)); // ri

    System.out.print(name1.substring(3, 5)); // ke
    System.out.println(name2.substring(3, 5)); // es

    tostring();
  }

  void tostring() {
    System.out.println("toString()");
    StringBuffer name1 = new StringBuffer("Anikesh ");
    StringBuffer name2 = new StringBuffer("Maheshwari ");
    // toString method is used for convert StringBuffer to String(Type casting)
    System.out.print(name1.toString()); // kesh
    System.out.println(name2.toString()); // ri
    ensureCapaCity();
  }

  void ensureCapaCity() {
    System.out.println("ensureCapaCity()");
    StringBuffer name1 = new StringBuffer();
    System.out.println("Before : " + name1.capacity()); // 16
    name1.ensureCapacity(50);
    System.out.println("After : " + name1.capacity()); // 50
    StringBuffer name2 = new StringBuffer("Maheshwari ");
    System.out.println("Before : " + name2.capacity()); // 27
    name2.ensureCapacity(100);
    System.out.println("After : " + name2.capacity()); // 100
    setcharAt();
  }

  void setcharAt() {
    System.out.println("setCharAt()");
    StringBuffer name1 = new StringBuffer("Anikeshh");
    name1.setCharAt(7, 'a');
    System.out.println(name1); // Anikesha
    StringBuffer name2 = new StringBuffer("Maheshwari ");
    name2.setCharAt(3, 'k');
    System.out.println(name2); // mahkshwari
    setlength();
  }

  void setlength() {
    System.out.println("setlength()");
    StringBuffer name1 = new StringBuffer("Anikeshh");
    name1.setLength(4);
    System.out.println(name1); // Anik
    StringBuffer name2 = new StringBuffer("Maheshwari ");
    name2.setLength(4);
    System.out.println(name2); // mahes
    trimToSize();
  }

  void trimToSize() {
    System.out.println("trimToSize()");
    StringBuffer name1 = new StringBuffer();
    // name1.trimToSize();  // output is 0
    System.out.println("Before : " + name1.capacity()); // 16
    name1.ensureCapacity(50); //
    name1.append("Anikesh"); // charcter size is 7 but declare size 50 So 43 sizes is wasted So in this case we can use trimtoSize method.
    System.out.println("After declare size : " + name1.capacity()); // 50
    name1.trimToSize();
    System.out.println("After trim size : " + name1.capacity()); // 50

    StringBuffer name2 = new StringBuffer("Maheshwari");
    System.out.println("Before : " + name2.capacity()); // 27
    name2.ensureCapacity(100);
    System.out.println("After declare size: " + name2.capacity()); // 100
    name2.trimToSize();
    System.out.println("After trim size : " + name2.capacity()); // 50
  }
}
