package main.java.LongParameterList;

import com.sun.xml.internal.messaging.saaj.packaging.mime.MessagingException;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.util.Properties;

public class BirthdayService {

    public void sendGreetings(String fileName, XDate xDate, String smtpHost, int smtpPort) throws IOException, ParseException, MessagingException {
        BufferedReader in = new BufferedReader(new FileReader(fileName));
        String str = "";
        str = in.readLine(); // skip header
        while ((str = in.readLine()) != null) {
            String[] employeeData = str.split(", ");
            Employee employee = new Employee(employeeData[1], employeeData[0], employeeData[2], employeeData[3]);
            if (employee.isBirthday(xDate)) {
                String recipient = employee.getEmail();
                String body = "Happy Birthday, dear %NAME%".replace("%NAME%", employee.getFirstName());
                String subject = "Happy Birthday!";
                sendMessage(smtpHost, smtpPort, "sender@here.com", subject, body, recipient);
            }
        }
    }

    private void sendMessage(String smtpHost, int smtpPort, String sender, String subject, String body, String recipient) throws MessagingException {
        // Create a mail session
        java.util.Properties props = new java.util.Properties();
        props.put("mail.smtp.host", smtpHost);
        props.put("mail.smtp.port", "" + smtpPort);
        Session session = Session.getInstance(props, null);

        // Construct the message
        Message msg = new Message(session);
        msg.setFrom(new InternetAddress(sender));
        msg.setRecipient(new InternetAddress(recipient));
        msg.setSubject(subject);
        msg.setText(body);

        // Send the message
        Transport.send(msg);
    }

    public static class Session {
        public static Session getInstance(Properties props, Object o) {
            return null;
        }
    }

    private static class Transport {
        public static void send(Message msg) {

        }
    }

    private class Message {
        public Object RecipientType;
        private InternetAddress from;
        private String subject;
        private String text;
        private InternetAddress recipient;

        public Message(Session session) {

        }

        public void setFrom(InternetAddress from) {
            this.from = from;
        }

        public void setSubject(String subject) {
            this.subject = subject;
        }

        public void setText(String text) {
            this.text = text;
        }

        public void setRecipient(InternetAddress recipient) {
            this.recipient = recipient;
        }
    }
}
