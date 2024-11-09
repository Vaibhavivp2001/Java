class Airthematic {
    private int num1;
    private int num2;
    void setValue(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    void performOperation() {
        int sum = num1 + num2;
        int sub = num1 - num2;
        int mul = num1 * num2;
        int divide = num1 / num2;
        System.out.println("Sum: " + sum);
        System.out.println("sub: " + sub);
        System.out.println("mul: " + mul);
        System.out.println("divide: " + divide);
    }
    void showValue() {
       System.out.println("First number: " + num1);
       System.out.println("Second number: " + num2);
    }
}
public class Main{
    public static void main(String[] args) {
      Airthematic airthematic = new Airthematic();
      airthematic.setValue(10, 5);
      airthematic.performOperation();
      airthematic.showValue();
    }
}