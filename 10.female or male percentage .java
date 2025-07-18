import java.util.*;
class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String gender=sc.next();
        int age=sc.nextInt();
        if(gender=="female"){
        if(age>=1 && age<=58){
            System.out.println("The percentage of interest is 8.2%.");
        }
        else if(age>=59 && age<=100){
            System.out.println("The percentage of interest is 9.2%.");
        }}
        else {
          if(age>=1 && age<=58){
            System.out.println("The percentage of interest is 8.4%.");
          }
          else if(age>=59 && age<=100){
            System.out.println("The percentage of interest is 10.5%.");
          } 
        }
    }
}
