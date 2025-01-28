// Mariah Dungey 01/27/2025
public class Main {
    public static void main(String[] args) {
        int[] highTemp = {45, 29, 10, 22, 41, 28, 33};
        int[] precipationProb = { 95, 60, 25, 5, 0, 75,90};
        String[] wkDays = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        //goes through each it in wkDays
        for (int i = 0; i < wkDays.length; i++) {
            if ( 32 >= highTemp[i] && 50 < precipationProb[i]){
                System.out.println(wkDays[i] + " is likely to snow.");
            } else {
                System.out.println(wkDays[i] + " Isn't likly to snow.");
            }

        }


    }
}
