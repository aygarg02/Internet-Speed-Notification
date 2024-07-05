package speed.email.service;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
@Service
public class InternetSpeedTracker {
int count=0;
    private List<String> logs = new ArrayList<>();
@Scheduled(fixedRate = 60000) // Run every 60 seconds
    public void checkSpeed() {
        System.out.println(" i am measuring the speed  ");
        double currentSpeed = getInternetSpeed();
        double threshold = 10000.0; // Define your threshold value here
     System.out.println("this is the measured spped"+currentSpeed);
        if (currentSpeed < threshold) {
            count++;
            logs.add("Speed dropped below threshold at " + new Date().toString() + ": " + currentSpeed + " Mbps"+"this is the re");
        }
    }

    public List<String> getLogs() {
        return logs;
    }

    private double getInternetSpeed() {
        try {
            ProcessBuilder processBuilder = new ProcessBuilder("speedtest-cli", "--simple");
            Process process = processBuilder.start();
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));

            String line;
            double downloadSpeed = 0.0;
            while ((line = reader.readLine()) != null) {
                if (line.startsWith("Download:")) {
                    String[] parts = line.split(" ");
                    downloadSpeed = Double.parseDouble(parts[1]);
                    break;
                }
            }

            process.waitFor();
            return downloadSpeed;
        } catch (Exception e) {
            e.printStackTrace();
            return 0.0;
        }
    }
}
