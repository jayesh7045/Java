package Flight;

import java.util.ArrayList;
import java.util.List;

public class FlightClientWithoutMT {
    public static void main(String[] args) {
        int t1 =(int) System.currentTimeMillis();
        AirIndia airIndia = new AirIndia();
        IndigoFlights indigoFlights = new IndigoFlights();
        Vistara vistara = new Vistara();
        FlightTaskData flightTaskData1 = new FlightTaskData(airIndia, "delhi", "Bombay");
        FlightTaskData flightTaskData2 = new FlightTaskData(indigoFlights, "delhi", "Bombay");
        FlightTaskData flightTaskData3 = new FlightTaskData(vistara, "delhi", "Bombay");

        List<List<FlightData>> ans = new ArrayList<>();
        ans.add(airIndia.getFlights("delhi", "mumbai"));
        ans.add(vistara.getFlights("delhi", "mumbai"));
        ans.add(indigoFlights.getFlights("delhi", "mumbai"));
        for(List<FlightData> l:ans)
        {
            for(FlightData u : l)
            {
                System.out.println(u);
            }
        }
        int t2 = (int)System.currentTimeMillis();
        System.out.println(t2-t1);
    }
}
