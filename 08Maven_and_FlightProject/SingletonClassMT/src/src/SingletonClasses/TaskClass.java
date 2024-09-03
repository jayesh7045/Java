package SingletonClasses;

import java.util.concurrent.Callable;

public class TaskClass implements Callable {

    @Override
    public Object call() throws Exception {
        Object x = Logging.getInstance();
        return x;
    }
}
