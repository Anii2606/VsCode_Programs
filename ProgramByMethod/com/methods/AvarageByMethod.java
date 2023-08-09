package com.methods;
public class AvarageByMethod {
    float arg; 
    float avarage( float a,float b,float c){
    arg=(a+b+c)/3;
    return arg;
    }
    public static void main(String[] args) {
        AvarageByMethod m=new AvarageByMethod();
        m.avarage(25 , 45, 65);
        System.out.println("Avarage is :"+m.arg);
    }   
}
