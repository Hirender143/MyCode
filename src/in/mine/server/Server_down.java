package in.mine.server;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Timer;
import java.util.TimerTask;

public class Server_down {

    public static void main(String[] args) {
        String apiUrl = "https://results.jeeadv.ac.in/jeeadv2024/2425455";
        Timer timer = new Timer();
        
        TimerTask repeatedTask = new TimerTask() {
            public void run() {
                hitApi(apiUrl);
            }
        };
        
        long delay  = 0L;
        long period = 15000L;  // 15 seconds
        timer.scheduleAtFixedRate(repeatedTask, delay, period);
    }

    public static void hitApi(String urlString) {
        HttpURLConnection connection = null;

        try {
            URL url = new URL(urlString);
            connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");

            int status = connection.getResponseCode();
            if (status == 200) {
                BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                String inputLine;
                StringBuilder content = new StringBuilder();
                while ((inputLine = in.readLine()) != null) {
                    content.append(inputLine);
                }
                in.close();
                System.out.println(content.toString());
                System.out.println("API request successful.");
            } else {
                System.out.println("Failed to fetch data. Status code: " + status);
            }
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            if (connection != null) {
                connection.disconnect();
            }
        }
    }
}
