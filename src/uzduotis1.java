import java.util.Scanner;

public class uzduotis1 {

    public static void main(String[] args) {
        System.out.println("iveskite skaiciu  ");
        Scanner skaitytuvas = new Scanner(System.in);
        int n=skaitytuvas.nextInt();
        primeCal(n);

    }
    static void primeCal(int num)
    {
        int count=0;
        for(int i=1;i<=num;i++)
        {
            if(num%i==0)
            {
                count++;
            }
        }
        if(count==2)
            System.out.println("prime skaicius ");
        else
            System.out.println("Ne prime skaicius ");
    }
}




