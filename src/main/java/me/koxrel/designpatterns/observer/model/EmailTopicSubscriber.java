package me.koxrel.designpatterns.observer.model;

import lombok.RequiredArgsConstructor;
import me.koxrel.designpatterns.observer.interfaces.Observer;
import me.koxrel.designpatterns.observer.interfaces.Subject;

import java.util.Objects;

@RequiredArgsConstructor
public class EmailTopicSubscriber implements Observer {
    private final String name;
    private Subject subject;

    @Override
    public void update() {
        var message = (String) subject.getUpdate(this);
        if (message == null) {
            System.out.printf("%s: No new messages\n", name);
        } else {
            System.out.printf("%s: Retrieving message: %s\n", name, message);
        }
    }

    @Override
    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmailTopicSubscriber that = (EmailTopicSubscriber) o;
        return name.equals(that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
