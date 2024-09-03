package Flight;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class FlightClient {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        int t1 = (int) System.currentTimeMillis();
        AirIndia airIndia = new AirIndia();
        IndigoFlights indigoFlights = new IndigoFlights();
        Vistara vistara = new Vistara();
        FlightTaskData flightTaskData1 = new FlightTaskData(airIndia, "delhi", "Bombay");
        FlightTaskData flightTaskData2 = new FlightTaskData(indigoFlights, "delhi", "Bombay");
        FlightTaskData flightTaskData3 = new FlightTaskData(vistara, "delhi", "Bombay");
        Future<List<FlightData>> f1 = executorService.submit(flightTaskData1);
        Future<List<FlightData>> f2 = executorService.submit(flightTaskData2);
        Future<List<FlightData>> f3 = executorService.submit(flightTaskData3);

        List<List<FlightData>> ans = new ArrayList<>();
        ans.add(f1.get());
        ans.add(f2.get());
        ans.add(f3.get());
        for(List<FlightData> f : ans)
        {
            for(FlightData d : f)
            {
                System.out.println(d);
            }
        }
        int t2 = (int) System.currentTimeMillis();
        System.out.println(t2-t1);
        executorService.shutdown();
    }

}
