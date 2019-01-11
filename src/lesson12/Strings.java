package lesson12;

public class Strings {
    public static void main(String[] args) {
       validateString("I like java!!!");
       //validateString("I like .NET");

       System.out.println("Index: "+"I like Java".indexOf("Java"));
    }

    private static void validateString(String str){
        System.out.println(str);
        System.out.println(str.endsWith("!!!"));
        System.out.println(str.startsWith("I like"));
        System.out.println("Last char in the string "+str.charAt(str.length()-1));
        System.out.println(str.replace('a', 'o'));
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        System.out.println(str.substring(str.indexOf("java"),(str.length()-3)));
    }
}
