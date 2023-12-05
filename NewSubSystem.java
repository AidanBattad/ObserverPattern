package ObserverPattern;

public class NewSubSystem {
    public static void main(String[] args)
    {
        NewsSubscriber maria = new EmailNewsSubscriber("maria@example.com");
        NewsSubscriber juan = new EmailNewsSubscriber("juan@example.com");
        NewsSubscriber oliver = new EmailNewsSubscriber("Tamad@example.com");
        NewsAgency newsAgency = new NewsAgency();
        newsAgency.subscribe(maria);
        newsAgency.subscribe(juan);
        newsAgency.subscribe(oliver);
        newsAgency.publishNews("Breaking News: Important Event!");
        newsAgency.unsubscribe(juan);
        newsAgency.publishNews("Breaking News: Exciting News!");
    }
}
