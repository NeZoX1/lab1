import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n,i,x,analogx;
        System.out.print("x: ");
        x = in.nextInt();
        System.out.print("n: ");
        n = in.nextInt();
        if (n < -15 | n > 15) {
            System.out.println("Неверно введено n");
            System.exit(0);
        }
        analogx=x;
        if (n>0) {
            for (i=1; i < n; ++i) {
                analogx = analogx * x;
            }
            System.out.println(analogx);
        }
        if(n<0){
            float analogxfloat=x;
            while (n<-1) {
                analogxfloat = analogxfloat * x;
                ++n;
            }
            float result=1/analogxfloat;
            System.out.println(result);
        }
        if(n==0){
            analogx=analogx/analogx;
            System.out.println(analogx);
        }
    }
}