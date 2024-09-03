package Multi.CallableClassDemo;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

public class CallableTask implements Callable{
    @Override
    public String call()  {
        return "I am inside the callable Class";
    }

}
