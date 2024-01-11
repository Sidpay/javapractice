import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeConvert{
    public static String convertTime(String time) {
        try {
            // Parse the input time in 12-hour format
            SimpleDateFormat inputFormat = new SimpleDateFormat("hh:mm:ssa");
            Date date = inputFormat.parse(time);

            // Convert the parsed time to 24-hour format
            SimpleDateFormat outputFormat = new SimpleDateFormat("HH:mm:ss");
            return outputFormat.format(date);
        } catch (ParseException e) {
            e.printStackTrace();
            return null; // Handle parsing errors
        }
    }

    public static void main(String[] args) {
        // Example usage
        String inputTime = "01:26:17PM";
        String militaryTime = convertTime(inputTime);

        System.out.println("Input 12 hour Time: " + inputTime);
        System.out.println("Military Time: " + militaryTime);
    }
}


