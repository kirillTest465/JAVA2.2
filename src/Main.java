
public class Main {
    public static void main(String[] args) {
        int initialBalance = 200; // начальный баланс
        int replenishmenentAmount = 1300; // cумма пополнения

        int bonuses = 0; // бонусы

        if (replenishmenentAmount > 1000) {
            bonuses = replenishmenentAmount / 100; // Бонус 1 рубль за каждые 100 рублей
        }

        int finalBalance = initialBalance + replenishmenentAmount + bonuses; // Итоговая сумма на счету клиента
        //Выводим на экран

        System.out.println("Начальный баланс-" + initialBalance + "рублей");
        System.out.println("Сумма пополнения-" + replenishmenentAmount + "рублей");
        System.out.println("Бонусы-" + bonuses + "рублей");
        System.out.println("Итоговая сумма на счету клиента-" + finalBalance + "рублей");


        // Объявляете переменные для входных данных и
        // параметров программы: начального счёта,
        // суммы пополнения и тп

        // Условным оператором проверяете, превысила ли
        // сумма пополнения порог, и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран.
    }
}