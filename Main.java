public class Main {
    public static void main(String[] args) {
        NewsAgency agency = new NewsAgency();

        Subscriber user1 = new UserSubscriber("Alice");
        Subscriber user2 = new UserSubscriber("Bob");

        agency.subscribe(user1);
        agency.subscribe(user2);

        agency.publishNews("Breaking: New Iphone Series released!");

        agency.unsubscribe(user1);

        agency.publishNews("Update: Alice unsubscribed from the service.");
    }
}
