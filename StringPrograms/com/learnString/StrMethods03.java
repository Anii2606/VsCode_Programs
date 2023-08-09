package com.learnString;

public class StrMethods03 {

  void concat() {
    System.out.println("Concat()");
    String name1 = "Anikesh";
    String name2 = "Maheshwari";
    System.out.println(name1.concat(name2));
    //AnikeshMaheshwari
    join();
  }

  void join() {
    System.out.println("join()");
    String name1 = "Anikesh";
    String name2 = "Maheshwari";
    System.out.println(String.join(",", name1, name2));
    // Anikesh,Maheshwari
    subsequence();
  }

  void subsequence() {
    System.out.println("subsequence()");
    String name1 = "Anikesh";
    String name2 = "Maheshwari";
    System.out.print(name1.subSequence(0, 4));
    System.out.println(name2.subSequence(3, 10));
    // Anikeshwari
    substring01();
  }

  void substring01() {
    System.out.println("subString() 01");
    String name1 = "Anikesh";
    String name2 = "Maheshwari";
    System.out.print(name1.substring(3)); //kesh
    System.out.println(name2.substring(8)); // ri
    // Keshri
    substring02();
  }

  void substring02() {
    System.out.println("subString() 02");
    String name1 = "Anikesh";
    String name2 = "Maheshwari";
    System.out.print(name1.substring(3, 4));
    System.out.println(name2.substring(5, 10));
    // Khwari
    char0At();
  }

  void char0At() {
    System.out.println("char0At()");
    String name1 = "Anikesh";
    String name2 = "Maheshwari";
    System.out.println(name1.charAt(0));
    System.out.println(name1.charAt(4));
    System.out.println(name1.charAt(6));
    System.out.println(name1.charAt(1));
    System.out.println(name1.charAt(2));
    System.out.println(name1.charAt(3));
    System.out.println(name2.charAt(0));
    System.out.println(name2.charAt(5));
    System.out.println(name2.charAt(7));
    System.out.println(name2.charAt(8));
    System.out.println(name2.charAt(8));
    System.out.println(name2.charAt(6));
    System.out.println(name2.charAt(4));
    System.out.println(name2.charAt(1));
    System.out.println(name2.charAt(3));
    // Keshri
    rePlace();
  }

  void rePlace() {
    System.out.println("rePlace()");
    String name1 = "Anikesh";
    String name2 = "Maheshwari";
    System.out.print(name1.replace('k', 'm'));
    System.out.println(name2.replace('w', 'v'));
    // AnimeshMaheshvari
    System.out.println();
    rePlaceFirst();
  }

  void rePlaceFirst() {
    System.out.println("rePlaceFirst()");
    String name1 = "Aniekesh";
    String name2 = "Maheshwari";
    System.out.print(name1.replaceFirst("e", "i"));
    System.out.println(name2.replaceFirst("h", "n"));
    // Aniikesh
    // maneshwari
    System.out.println();
    rePlaceAll();
  }

  // in this method we can give regex
  //for ex-  name1.replaceAll("ni(.)","k") (.)-regex
  void rePlaceAll() {
    System.out.println("rePlaceAll()");
    String name = "Anikesh"; // Anikk kka
    String name1 = "This is loop";
    String name2 = "Maheshwari es";
    System.out.print(name.replaceAll("sh", "t"));
    System.out.println(name2.replaceAll("Ma", "rud"));
    System.out.println(name1.replaceAll("is(.)", "was")); // spaces are removed
    System.out.println(name2.replaceAll("es(.*)", "k")); // removed all after character
    // Aniketrudheshwari
    //thwaswasloop
    //Mahk
    //System.out.println();
    toUpperAndLowerCase();
  }

  void toUpperAndLowerCase() {
    System.out.println("toUpperAndLowerCase()");
    String name1 = "Anikesh";
    String name2 = "Maheshwari";
    System.out.println(name1.toUpperCase());
    System.out.println(name2.toLowerCase());
    // ANIKESH
    // maheshwari
    index0f();
  }

  void index0f() {
    System.out.println("index0f()");
    String name1 = "Anikesh";
    String name2 = "Maheshwari";
    System.out.println(name1.indexOf('i')); // 2
    System.out.println(name1.indexOf("kesh")); //3
    System.out.println(name2.indexOf('a', 0)); // 1
    System.out.println(name2.indexOf('a', 2)); // 7
    System.out.println(name1.indexOf("ke", 0)); // 3
    System.out.println(name2.indexOf("ari", 2)); // 7
    lastindex0f();
  }

  void lastindex0f() {
    System.out.println("lastindex0f()");
    String name1 = "Aniikesh";
    String name2 = "Maheshwari";
    System.out.println(name1.lastIndexOf('i')); // 3
    System.out.println(name1.lastIndexOf("kesh")); //4
    System.out.println(name2.lastIndexOf('a')); // 7
    System.out.println(name2.lastIndexOf('h')); // 5
    System.out.println(name1.lastIndexOf("ke")); // 4
    System.out.println(name2.lastIndexOf("ari")); // 7
    c0ntain();
  }

  void c0ntain() {
    System.out.println("c0ntain()");
    String name1 = "Anikesh";
    String name2 = "Maheshwari";
    System.out.println(name1.contains("sh")); // true
    System.out.println(name2.contains("wari")); //true
    System.out.println(name2.contains("SH")); // false
    // ANIKESH
    // maheshwari
    System.out.println();
    startWiith();
  }

  void startWiith() {
    System.out.println("startWiith() 01");
    String name1 = "Anikesh";
    String name2 = "Maheshwari";
    System.out.println(name1.startsWith("An")); // true
    System.out.println(name2.startsWith("Ma")); //true
    System.out.println(name2.startsWith("an")); // false
    // startWith(String str ,int start index )
    System.out.println("startWiith() 02");
    //System.out.println();
    System.out.println(name1.startsWith("ke", 3)); // true
    System.out.println(name2.startsWith("wa", 6)); //true
    System.out.println(name2.startsWith("sh", 1)); // false
    System.out.println();
    endsWiith();
  }

  void endsWiith() {
    System.out.println("endsWiith()");
    String name1 = "Anikesh";
    String name2 = "Maheshwari";
    System.out.println(name1.endsWith("sh")); // true
    System.out.println(name2.endsWith("ri")); //true
    System.out.println(name2.endsWith("ar")); // false
    valueof();
  }

  void valueof() {
    System.out.println("valueof()");
    // String name1 = "Anikesh";
    // String name2 = "Maheshwari";
    int a = 10;
    int b = 20;
    int c = 30;
    System.out.println(String.valueOf(a)); // 10
    System.out.println(String.valueOf(b)); // 20
    System.out.println(String.valueOf(c)); // 30
    toCharArr();
  }

  void toCharArr() {
    System.out.println("toCharArray");
    String name1 = "Anikesh";
    String name2 = "Maheshwari";
    char[] c = name1.toCharArray();
    char[] d = name2.toCharArray();
    System.out.println(c); //Anikesh
    System.out.println(d); // Maheshwari
  }

  public static void main(String[] args) {
    StrMethods03 sm = new StrMethods03();
    sm.concat();
  }
}
