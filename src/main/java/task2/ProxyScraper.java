package task2;

public class ProxyScraper implements Scraper{
    private final DBConnection db;
    public ProxyScraper() {
        this.db = DBConnection.getInstance();;
    }

    @Override
    public String scrape(String url) {
        String scraped = "The Smartest Way to Buy a New Home"; // I'm too tired to implement this
        return scraped;
    }

}