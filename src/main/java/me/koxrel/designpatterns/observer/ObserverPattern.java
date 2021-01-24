package me.koxrel.designpatterns.observer;

import me.koxrel.designpatterns.Driver;
import me.koxrel.designpatterns.observer.model.EmailTopic;
import me.koxrel.designpatterns.observer.model.EmailTopicSubscriber;

public class ObserverPattern implements Driver {
    @Override
    public void run() {
        var topic = new EmailTopic();

        var firstObserver = new EmailTopicSubscriber("Observer #1");
        var secondObserver = new EmailTopicSubscriber("Observer #2");
        var thirdObserver = new EmailTopicSubscriber("Observer #3");

        topic.register(firstObserver);
        topic.register(secondObserver);
        topic.register(thirdObserver);

        firstObserver.setSubject(topic);
        secondObserver.setSubject(topic);
        thirdObserver.setSubject(topic);

        firstObserver.update();

        topic.postMessage("Hello, readers!");

        topic.unregister(new EmailTopicSubscriber("Observer #1"));
        topic.postMessage("Bye, the first one!");
    }
}
