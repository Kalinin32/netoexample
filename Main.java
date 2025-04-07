import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int earnings = 0;    // доходы
        int spendings = 0;   // расходы
        while (true) {
            System.out.println("1. Добавить новый доход");
            System.out.println("2. Добавить новый расход");
            System.out.println("3. Выбрать систему налогообложения");
            String input =scanner.nextLine();
            if(input.equals("end")){
                System.out.println("Программа завершена!");
                break;
                }
            int operation=Integer.parseInt(input);
            switch (operation){
                case 1:
                    System.out.println("Введите сумму дохода:");
                    String incomE=scanner.nextLine();
                    int income=Integer.parseInt(incomE);
                    earnings+=income;
                    break;
                case 2:
                    System.out.println("Введите сумму расхода:");
                    String expenseS=scanner.nextLine();
                    int expenses=Integer.parseInt(expenseS);
                    spendings+=expenses;
                    break;
                case 3:
                    System.out.println("Мы советуем вам УСН доходы");
                    System.out.println("Ваш налог составит: "+SpendingsEarnings(earnings)+" рублей");
                    System.out.println("Налог на другой системе: "+EarningsSpendings(earnings,spendings)+" рублей");
                    System.out.println("Экономия: "+(EarningsSpendings(earnings,spendings)-SpendingsEarnings(earnings))+" рублей");
                    break;
                default:
                    System.out.println("Такой операции нет");
            }
        }
    }
    public static int EarningsSpendings(int earnings,int spendings){
        int num1=(earnings-spendings)*15/100;
        if(num1>=0){
            return num1;
        }else {
            return 0;
        }
    }
    public static int SpendingsEarnings(int earnings){
        int num2=earnings*6/100;
        if(num2>=0){
            return num2;
        }else {
            return 0;
        }
    }
}