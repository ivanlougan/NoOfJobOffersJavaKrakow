import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;

public class Main {

//    https://www.pracuj.pl/praca/java;kw/krakow;wp?rd=30

    // <span class="results-header__offer-count-text-number">76</span>

    public static void main(String[] args) {



        try {
            Document document = Jsoup.connect("https://www.pracuj.pl/praca/java;kw/krakow;wp?rd=30").get();
            Elements elements = document.getElementsByClass("results-header__offer-count-text-number");
            System.out.println("liczba ofert pracy dla programistów Java w Krakowie to " + elements.get(0).text());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
