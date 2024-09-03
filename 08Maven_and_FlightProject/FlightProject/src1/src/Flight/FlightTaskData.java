package Flight;

import java.util.List;
import java.util.concurrent.Callable;

public class FlightTaskData implements Callable {
    private FlightService flightService;
    private String src;
    private String dest;
    public  FlightTaskData(FlightService flightService, String src, String dest)
    {
        this.flightService = flightService;
        this.src = src;
        this.dest = dest;
    }
    @Override
    public List<FlightData> call() throws Exception{
        return flightService.getFlights(src, dest);
    }
}
