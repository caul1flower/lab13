package task2;

public class Main {
    public static void main(String[] args){
        ProxyScraper sc = new ProxyScraper();

        String contents = sc.scrape("https://www.newhomesource.com");

        System.out.println(contents);
    }
}