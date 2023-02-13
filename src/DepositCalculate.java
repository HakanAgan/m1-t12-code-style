import java.util.Scanner;

public class DepositCalculate
{
    double CalculateComplexPercent(double amount, double year, int deposit) {
        double pay = amount * Math.pow((1 + year / 12), 12 * deposit);
        return Random(pay, 2);
    }
    double CalculateSimplePercent(double doubleAmount, double doubleYearRate, int depositPeriod) {
        return Random(doubleAmount+doubleAmount * doubleYearRate * depositPeriod, 2);
    }
    double Random(double value, int places) {
        double scale = Math.pow (10, places);
        return Math.round(value * scale) / scale;
    }

    void PlanSavingOfAmountToPeriod()
    {
        int amount;
        int period;
        int action;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите сумму вклада в рублях:");
        amount = scanner.nextInt();

        System.out.println("Введите срок вклада в годах:") ;
        period = scanner.nextInt();

        System.out.println("Выберите тип вклада, 1 - вклад с обычным процентом, 2 - вклад с капитализацией:");
        action = scanner.nextInt();

        double sumFinalAmountWithPercent = 0;

        if (action == 1) {
            sumFinalAmountWithPercent = CalculateSimplePercent(amount, 0.06, period);
        } else if (action == 2) {
            sumFinalAmountWithPercent = CalculateComplexPercent(amount, 0.06, period);
        }
            System.out.println("Результат вклада: " + amount + " за " + period + " лет превратятся в " +
                    sumFinalAmountWithPercent); // лучше не вылезать за серую черту - границу, в остальном все супер!
    }

public static void main(String[] args)
    {
        new DepositCalculate().PlanSavingOfAmountToPeriod();
    }
}
