package org.example.comportamental.chain;

public class ChainOfResponsibilityImpl {
    public static void main(String[] args) {
        Notifier reportNotifier = new SimpleReportNotifier(Priority.ROUTINE);
        Notifier emailNotifier = new EmailNotifier(Priority.IMPORTANT);
        Notifier smsNotifier = new SMSNotifier(Priority.ASAP);

        reportNotifier.setNextNotifier(emailNotifier);
        emailNotifier.setNextNotifier(smsNotifier);

        reportNotifier.notifyManager("tot ok", Priority.ROUTINE);
        reportNotifier.notifyManager("ceva nu a mers dupa plan", Priority.IMPORTANT);
        reportNotifier.notifyManager("Houston u nas problemi", Priority.ASAP);
    }
}
