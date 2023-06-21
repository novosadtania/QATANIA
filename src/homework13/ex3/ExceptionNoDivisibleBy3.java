package homework13.ex3;

public class ExceptionNoDivisibleBy3 extends Exception {
    public String getMessage() {
        return "Ти не зможеш поділити порівно на всіх ці продукти! Йди докупи ще!";
    }
}
