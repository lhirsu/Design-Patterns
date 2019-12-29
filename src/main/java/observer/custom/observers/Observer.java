package observer.custom.observers;

import observer.custom.observable.Subject;

public interface Observer {

    void update(Subject subject);

}