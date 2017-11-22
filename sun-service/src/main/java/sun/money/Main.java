package sun.money;

import java.util.Currency;
import java.util.Locale;

/**
 * @author outofmemory.cn
 */
public class Main {

    public void displayCurrencySymbols() {

        Currency currency = Currency.getInstance(Locale.US);
        System.out.println("United States: " + currency.getSymbol());

        currency = Currency.getInstance(Locale.UK);
        System.out.println("United Kingdom: " + currency.getSymbol());

        currency = Currency.getInstance(Locale.FRANCE);
        System.out.println("France: " + currency.getSymbol());

    }

    public void test() {
        for (CurrencyMarkEnum currenyEnum : CurrencyMarkEnum.values()) {
            System.out.println(currenyEnum.getCode()+":    " + Currency.getInstance(currenyEnum.getCode()));
        }

    }

    public static void main(String[] args) {

        new Main().test();
    }

}