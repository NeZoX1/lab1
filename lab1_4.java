import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N,dotsonacircle;
		float X,Y,R;
		System.out.print("Количество точек: ");
		N=in.nextInt();
		if (N<1){
		    System.out.println("Количество точек должно быть от 1 или больше");
		    System.exit(0);
		}
		System.out.print("Радиус окружности: ");
		R=in.nextFloat();
		if (R<0){
		    System.out.println("Радиус должен быть от 0 и больше");
		    System.exit(0);
		}
		dotsonacircle=0;
		int forxandy=1;
		while (N>0){
		    System.out.print("X "+forxandy+" точки: ");
		    X=in.nextFloat();
		    System.out.print("Y "+forxandy+" точки: ");
		    Y=in.nextFloat();
		    if (X*X+Y*Y<=R*R){
		        dotsonacircle++;
		    }
		    forxandy++;
		    N--;
		}
		System.out.println(dotsonacircle+" точек/ки попали в окружность");
    }
}

