import java.util.*;
class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        char ch1=sc.next().charAt(0);
        char ch2=sc.next().charAt(0);
        int c1=(int)ch1;
        int c2=(int)ch2;
        if(c1>c2){
            System.out.print(ch2+" "+ch1);
        }else{
            System.out.println(ch1+" "+ch2);
        }
    }
}
