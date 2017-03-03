package main.java.LongParameterList;

import com.sun.xml.internal.messaging.saaj.packaging.mime.MessagingException;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;

public class BirthdayService {

    public void sendGreetings(String fileName, BirthDate xDate) throws IOException, ParseException, MessagingException {
        BufferedReader in = new BufferedReader(new FileReader(fileName));
        String str = "";
        str = in.readLine(); // skip header
        NotificationService notification = new NotificationService();
        while ((str = in.readLine()) != null) {
            String[] employeeData = str.split(", ");
            Employee employee = new Employee(employeeData[1], employeeData[0], employeeData[2], employeeData[3]);
            if (employee.isBirthday(xDate)) {
                String recipient = employee.getEmail();
                String body = "Happy Birthday, dear %NAME%".replace("%NAME%", employee.getFirstName());
                String subject = "Happy Birthday!";
                String smtpHost = "company.smtp.com";
                int smtpPort = 25;

                notification.sendMessage(smtpHost, smtpPort, "sender@here.com", subject, body, recipient);
            }
        }
    }




}
