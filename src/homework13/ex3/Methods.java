package homework13.ex3;

public class Methods {
    public void positiveExit(Dad dad) {
        System.out.println("Шановний, " + dad.getName() + ".Вартість вашої покупки складає : " + ((dad.getProduct1().getCost() * dad.getNumberOfProduct1()) + (dad.getProduct2().getCost()) * dad.getNumberOfProduct2()) + " грн.\n" +
                "Ви придбали : " + dad.getProduct1() + " у розмірі " + dad.getNumberOfProduct1() + " одиниць, та " + dad.getProduct2() + " у розмірі " + dad.getNumberOfProduct2() + " одиниць. \n" +
                "Передбачення для Вас : Не здавайтесь! \n Вдалого дня!");
    }
    private void badProduct(Dad dad) throws ExceptionBadProduct {
        if (dad.getProduct1() == Products.TOBACCO || dad.getProduct1() == Products.BEER || dad.getProduct2() == Products.TOBACCO || dad.getProduct2() == Products.BEER) {
            throw new ExceptionBadProduct();
        }
    }

    private void noDivisibleBy3(Dad dad) throws ExceptionNoDivisibleBy3 {
        if (dad.getNumberOfProduct1() % 3 != 0 && dad.getNumberOfProduct2() % 3 != 0) {
            throw new ExceptionNoDivisibleBy3();
        }

    }

    private void noMoney(Dad dad) throws ExceptionNoMoney {
        if (dad.getProduct1().getCost() + dad.getProduct2().getCost() > dad.getMoney()) {
            throw new ExceptionNoMoney();
        }
    }

    public void iWantBuy(Dad dad) throws  ExceptionNoDivisibleBy3, ExceptionNoMoney, ExceptionBadProduct {
        noMoney(dad);
        noDivisibleBy3(dad);
        badProduct(dad);
        dad.positiveExit();
    }
}
