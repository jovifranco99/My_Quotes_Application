package ca.jovanifrancis.myquotesapplication;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class QuotesData {

    public static List<QuotesList> getLifeQuotes(){

        final List<QuotesList> lifeQuotesList = new ArrayList<>();

        QuotesList lifeQuote1 = new QuotesList("Life is a mountain. Your is to find you path, not to reach the top.", "Maxime Lagace");
        lifeQuotesList.add(lifeQuote1);

        QuotesList lifeQuote2 = new QuotesList("Three things in life - your health, your mission, and the people you love. That's it", "Naval Ravikant");
        lifeQuotesList.add(lifeQuote2);

        QuotesList lifeQuote3 = new QuotesList("Life is from the inside out. When you shift on the inside, life shifts on the outside.", "Kamal Ravikant");
        lifeQuotesList.add(lifeQuote3);

        QuotesList lifeQuote4 = new QuotesList("If you spend too much time thinking about a thing, you'll never get it done", "Bruce Lee");
        lifeQuotesList.add(lifeQuote4);

        return lifeQuotesList;
    }

    public static List<QuotesList> getInspirationalQuotes(){

        final List<QuotesList> inspirationalQuotesList = new ArrayList<>();

        QuotesList inspirationalQuote1 = new QuotesList("I wasn't there to compete. I was there to win.", "Arnold Schwarzenegger");
        inspirationalQuotesList.add(inspirationalQuote1);

        QuotesList inspirationalQuote2 = new QuotesList("Someone once told me growth and comfort do not coexist.", "Ginni Rometty");
        inspirationalQuotesList.add(inspirationalQuote2);

        QuotesList inspirationalQuote3 = new QuotesList("All the power is within you. You can do anything.", "Swami Vivekananda");
        inspirationalQuotesList.add(inspirationalQuote3);

        QuotesList inspirationalQuote4 = new QuotesList("The place between your comfort zone and your dream is where life takes place", "Helen Keller");
        inspirationalQuotesList.add(inspirationalQuote4);

        return inspirationalQuotesList;
    }


//    public static Collection<? extends QuotesList> getSuccessQuotes() {
//
//
//        return null;
//    }
//
//    public static Collection<? extends QuotesList> getSmilesQuotes() {
//
//        return null;
//    }
//
//
//    public static Collection<? extends QuotesList> getLoveQuotes() {
//
//        return null;
//    }
}
