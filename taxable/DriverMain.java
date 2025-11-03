package taxable;

public class DriverMain {
    public static void main(String[] args) {
        Employee emp = new Employee(1001,"aakash",1200000l);
        Product pd = new Product(102,500,4);

        emp.calTax();
        pd.calTax();
    }
}
