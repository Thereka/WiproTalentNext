import java.util.*;
class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int n=str.length();
        if(n==0){
            System.out.println("No values");
        }else{
            String[]a=str.split(" ");
            for(int i=0;i<a.length;i++){
                System.out.print(a[i]);
                if(i<a.length-1){
                    System.out.print(",");
                }
            }
        }
    }
}
