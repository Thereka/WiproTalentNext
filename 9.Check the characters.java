import java.util.*;
class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        char ch=sc.next().charAt(0);
        if(ch>='a' && ch<='z'||ch>='A'&&ch<='Z'){
            System.out.println("Alphabets");
        }
        else if(ch>='0' && ch<='9'){
            System.out.println("Numbers");
        }
        else{
            System.out.println("Special Characters");
        }
    }
