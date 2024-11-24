import java.util.ArrayList;
import java.util.List;

public class NewsAgency {
    private List<Subscriber> subscribers;

    public NewsAgency() {
        this.subscribers = new ArrayList<>();
    }

    public void subscribe(Subscriber subscriber) {
        subscribers.add(subscriber);
        System.out.println("Subscriber added: " + subscriber);
    }

    public void unsubscribe(Subscriber subscriber) {
        subscribers.remove(subscriber);
        System.out.println("Subscriber removed: " + subscriber);
    }

    public void publishNews(String news) {
        System.out.println("Publishing news: " + news);
        notifySubscribers(news);
    }

    private void notifySubscribers(String news) {
        for (Subscriber subscriber : subscribers) {
            subscriber.update(news);
        }
    }
}
