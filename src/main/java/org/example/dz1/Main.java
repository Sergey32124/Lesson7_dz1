package org.example.dz1;

public class Main {
    public static void main(String[]args){
        String a="asdo";
        boolean r=text(a);
        System.out.println(r);
    }
    public static Boolean text(String s){

        if (s.length()%2==0){
            return true;
        }
        else {
            return false;
        }
    }
}
