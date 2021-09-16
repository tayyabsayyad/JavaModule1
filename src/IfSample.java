
public class IfSample {
    public static void main(String[] args){
        int time;
        int crossing=0;
        int x_at=0;
        int y_at=100;
        int x_lap;
        int y_lap;

        // Loop Example
        for(time=0;time<100;time=time+1)
        {
            x_at = x_at + 2;
            y_at = y_at - 1;
            System.out.println("X="+x_at+" "+"Y="+y_at);
            if(x_at<y_at)
                crossing = crossing + 1 ;
        }

//                X-------------------------
//                --------------------------Y
//
//                        1 unit X can cross 2M
//                        1 unit Y can cross 1M
//                        Calculate if X and Y both are running in RR
//                        How many time they will cross each other
//                        X completed the 5 Laps
//                        Line distance is 100
    }
}


