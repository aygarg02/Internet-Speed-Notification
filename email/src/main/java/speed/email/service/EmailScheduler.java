package speed.email.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmailScheduler {

    @Autowired
    private InternetSpeedTracker tracker;

    @Autowired
    private EmailService emailService;

    @Scheduled(cron = "0 * * 23 * ?") 
    public void sendDailyReport() {
        List<String> logs = tracker.getLogs();
        if (!logs.isEmpty()) {
            System.out.println("about to send");
            String report = String.join("\n", logs);
            emailService.sendEmail("hided@gmail.com", "speed reduced this much time during the process "+tracker.count, report);
            System.out.println("sending the email");
            logs.clear(); 
        }
        tracker.count=0;
    }
}
