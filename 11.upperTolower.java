import java.util.*;
class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        char ch=sc.next().charAt(0);
        if(ch>='A' && ch<='Z'){
            System.out.print(Character.toLowerCase(ch));
        }else{
            System.out.print(Character.toUpperCase(ch));
        }
    }
}
