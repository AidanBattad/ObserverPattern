package ObserverPattern;
class EmailNewsSubscriber implements NewsSubscriber {
    private String email;
    public EmailNewsSubscriber(String email)
    {
        this.email = email;
    }
    @Override
    public void updateNews(News news)
    {
        System.out.println("Email sending to " + email + ": " + news.getHeadline());
    }
}
