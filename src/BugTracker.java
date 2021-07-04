public class BugTracker {
    public static void main(String[] args) {
        Notifier report = new SimpleReport(Priority.ROUTINE);
        Notifier email = new EmailNotifier(Priority.IMPORTANT);
        Notifier sms = new SMS(Priority.ASAP);

        C:\Users\Mers\IdeaProjects\ Chain of Responsibility

        report.setNextNotifier(email);
        email.setNextNotifier(sms);

        report.notifyManager("Everything is OK.",Priority.ROUTINE);
        report.notifyManager("Something went wrong!",Priority.IMPORTANT);
        report.notifyManager("Some problem!",Priority.ASAP);

    }
}
