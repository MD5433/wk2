import java.time.DayOfWeek;

public class Main {
    public static void main(String[] args) {
        int lowTemperature = 32;
        System.out.println(true | (lowTemperature+=5)>0);
        System.out.println(lowTemperature);
        int currentTemperature = 3;
        int warmThreshold = 60;

        if (currentTemperature>warmThreshold)
            System.out.println("it is warm outside");
        else
            System.out.println("it is cold outside");

        System.out.println(currentTemperature>warmThreshold ? "its warm outside":"its cold outside");

        String windDirection = "west";

        switch(windDirection){
            case "north":
                System.out.println("the wind is going north");
                break;
            case "south":
                System.out.println("the wind is going south");
                break;
            case "west":
                System.out.println("the wind is going west");
                break;
            case "east":
                System.out.println("the wind is going east");
                break;

            default:
                System.out.println("I do not know where the wind is going");
        }
        int i = 0;
        for(; i < 10;){
            System.out.println(i);
            i++;
        }

        String[] daysOfWeek = {"sunday","monday","tuesday","wednesday"};

        int[] temps ={1,2,3,4};
        double[] precipitation = {4,3,2,1};

        for(int k = 0; 0 < DayOfWeek.length ; k++){
            if((temps[k]>32) && (precipitation[k]<.5)){
                
            }
        }

    }
}