public class Main {
    public static void main(String[] args) {
        int balance = 100;
        int deposit = 901;
        int rubForBonus = 100;
        int bonusRub = 0;

        if (deposit >= 1_000) {
            bonusRub = deposit / rubForBonus;
            balance = balance + deposit + bonusRub;

        } else {
            balance = balance + deposit;
        }

        System.out.println("Текущий баланс: " + balance + " руб.");
        System.out.println("Бонусных рублей: " + bonusRub);
    }
}
