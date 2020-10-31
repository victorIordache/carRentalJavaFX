package sample.Events;

import javafx.event.Event;
import javafx.event.EventTarget;
import javafx.event.EventType;

public class ViewChangeEvent extends Event {

    public static final EventType<ViewChangeEvent> SIGNUP = new EventType<>(Event.ANY, "SIGNUP");
    public static final EventType<ViewChangeEvent> LOGIN = new EventType<>(Event.ANY, "LOGIN");

    public ViewChangeEvent(EventType<? extends Event> eventType) {
        super(eventType);
    }

    public ViewChangeEvent(Object o, EventTarget eventTarget, EventType<? extends Event> eventType) {
        super(o, eventTarget, eventType);
    }


}
