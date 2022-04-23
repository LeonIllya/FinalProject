package base;

public interface Income {
    double payment(int quantity, double price);

    double clearIncome(double income, double tax);
}
