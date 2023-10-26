public class Main {
    public static void main(String[] args) {

        int balance = 100;
        int money = 1200;
        int bonus = money / 100;

        if (money > 1000) {
            System.out.println("баланс:" + (balance + money + bonus));
            System.out.println("бонусы:" + bonus);
        }
        else {
            System.out.println("баланс:" + (balance + money));
            System.out.println("бонусы:" + 0);
        };



    }
}
