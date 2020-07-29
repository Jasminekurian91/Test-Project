import java.util.Scanner;

public class QuestionThree {
	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r=0;
        System.out.print("Enter the nth number you want from the smallest numbernumber");
        int n=sc.nextInt();
        int min=(int)Math.random();;
        int count=1;
        for(int i=1;i<500;i++){
        r=(int)Math.random();
        if(r<min)
            min=r;
        count++;
        if (count==n)
            
            break;
       }  
        
        System.out.print("the smallest number at "+n+"position is" + r);
       
    }
}



