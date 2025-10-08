public class Employee {
    private int employeeNumber;
    private double payRate;

    public static final int MAX_EMPLOYEE_NUMBER = 9999;
    public static final double MAX_RATE = 60.00;
    public static final double OVERTIME_MULTIPLIER = 1.5;

    public Employee(int employeeNumber, double payRate) {
        if (employeeNumber > MAX_EMPLOYEE_NUMBER)
            employeeNumber = MAX_EMPLOYEE_NUMBER;
        if (payRate > MAX_RATE)
            payRate = MAX_RATE;

        this.employeeNumber = employeeNumber;
        this.payRate = payRate;
    }

    public int getEmployeeNumber() {
        return employeeNumber;
    }

    public double getPayRate() {
        return payRate;
    }

    public double computeRegularPay(double hoursWorked) {
        if (hoursWorked <= 40)
            return hoursWorked * payRate;
        else
            return 40 * payRate;
    }

    public double computeOvertimePay(double hoursWorked) {
        if (hoursWorked > 40)
            return hoursWorked * payRate * OVERTIME_MULTIPLIER;
        else
            return 0.0;
    }
}
