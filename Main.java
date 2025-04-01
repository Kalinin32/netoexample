import java.util.Scanner;
public class Main {
    public static int YearDays(int year){
        if((year%400==0)||(year%100!=0 && year%4==0)){
            return 366;
        }else {
            return 365;
        }
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Введите год в формате уууу: ");
        int year=scanner.nextInt();
        int days=YearDays(year);
        System.out.println("Количество дней: "+days);

   }
}