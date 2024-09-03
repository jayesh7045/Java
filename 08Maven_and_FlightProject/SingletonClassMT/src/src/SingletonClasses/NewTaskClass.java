package SingletonClasses;

import java.util.concurrent.Callable;

public class NewTaskClass implements Callable {

    @Override
    public NewLogging call() throws Exception {
        return NewLogging.getInstance();
    }
}
