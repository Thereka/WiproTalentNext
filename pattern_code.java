import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=n;i>0;i--){
		    for(int j=0;j<i;j++){
		        System.out.print("*");
		    }
		   System.out.println();
		}
	}
}


public class Main {
    public static void main(String[] args) {
        int n = 5; 
        for (int i = n; i >= 1; i--) {
            for (int j = 0; j < (n - i); j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

