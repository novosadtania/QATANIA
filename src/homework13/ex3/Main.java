package homework13.ex3;

public class Main {
    public static void main(String[] args)  {

        Dad dad = new Dad("Павло", 2500, Products.APPLE, 3, Products.MILK, 2);
        Methods methods = new Methods();
        try {
            methods.iWantBuy(dad);
        } catch (ExceptionNoDivisibleBy3 e) {
            System.err.println(e.getMessage());
        } catch (ExceptionNoMoney e) {
            System.err.println(e.getMessage());
        } catch (ExceptionBadProduct e) {
            System.err.println(e.getMessage());
        }
    }
}
