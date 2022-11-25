import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int day, month;
        System.out.print("День: ");
        day=in.nextInt();
        if (day>31 | day<1){
            System.out.println("Неверно введен день");
            System.exit(0);
        }
        System.out.print("Месяц: ");
        month=in.nextInt();
        if (month<1 | month>12){
            System.out.println("Неверно введен месяц");
        }
        if (day>29 && month==2) {
            System.out.println("Неверно введен день");
        }

        if (month==12 | month<=2){
            System.out.println("Зима");
        }
        if (month>=3 && month<=5){
            System.out.println("Весна");
        }
        if (month>=6 && month<9){
            System.out.println("Лето");
        }
        if (month>=9 && month<12){
            System.out.println("Осень");
        }
    }
}
