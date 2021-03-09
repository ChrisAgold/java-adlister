import models.Album;
import models.Author;
import models.Quote;

import java.util.ArrayList;
import java.util.List;

public class BeanTest {

    public static void main(String[] args) {

        Album oneAlbum = new Album(1,"Billy Idle","White Wedding",1985,28.7f,"rock and new wave");

        Author somebody = new Author();
        somebody.setFirstName("Dean");
        somebody.setLastName("Koontz");


        Quote aQuote = new Quote(1,"Where ever you go there you are", somebody);

        Quote goldRule = new Quote(1, "Empathy puts you at the mercy of the last sob story you heard", new Author(1,"Daniel","Cortes"));

        Quote quoteA = new Quote(1, "Success didn’t spoil me, I’ve always been insufferable", new Author(1,"Fran","Lebowitz"));

        List<Quote> quotes = new ArrayList<>();

        quotes.add(aQuote);
        quotes.add(goldRule);
        quotes.add(quoteA);


        for (Quote quote : quotes)
        {
            System.out.println(quote.getContent());
            System.out.println("~ " + quote.getAuthor().getFirstName() + ", " + quote.getAuthor().getLastName() + "\n");
        }


    }

}