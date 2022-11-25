import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int day, month, year, year2, month2, day2;
		int daynow=25;
		int monthnow=11;
		int yearnow=2022;
		System.out.print("День рождения: ");
		day=in.nextInt();
		if (day>31 | day<1){
		    System.out.println("Неверно введен день рождения");
		    System.exit(0);
		}
		System.out.print("Месяц рождения: ");
		month=in.nextInt();
		if (month<1 | month>12){
		    System.out.println("Неверно введен месяц рождения");
		    System.exit(0);
		}
		System.out.print("Год рождения: ");
		year=in.nextInt();
		if (year<1){
		    System.out.println("Неверно введен год рождения");
		    System.exit(0);
		}
		year2=yearnow-year;
		month2=monthnow-month;
		day2=daynow-day;
		if(month2<1){
		    year2=year2-1;
		    month2=month2+12;
		}
		if(day2<1){
		    month2=month2-1;
		    day2=day2+31;
		}
		System.out.println(year2+" лет, "+month2+" месяцев и "+day2+" дней");
	}
}