package homework13.ex2;

public class UnderZeroException extends Exception {
    public String getMessage() {
        return "Ви ввели від'ємне число";
    }
}
