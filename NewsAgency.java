package ObserverPattern;
import java.util.ArrayList;
import java.util.List;
class NewsAgency {
    private List<NewsSubscriber> subscribers;
    private List<News> newsList;
    public NewsAgency()
    {
        this.subscribers = new ArrayList<>();
        this.newsList = new ArrayList<>();
    }
    public void subscribe(NewsSubscriber subscriber)
    {
        subscribers.add(subscriber);
    }
    public void unsubscribe(NewsSubscriber subscriber)
    {
        subscribers.remove(subscriber);
    }
    public void publishNews(String headline)
    {
        News news = new News(headline);
        newsList.add(news);
        for (NewsSubscriber subscriber : subscribers)
        {
            subscriber.updateNews(news);
        }
    }
}
