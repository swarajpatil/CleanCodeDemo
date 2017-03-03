package main.java.LongParameterList;

import com.sun.xml.internal.messaging.saaj.packaging.mime.MessagingException;

public class NotificationService {

    public void sendMessage(String smtpHost, int smtpPort, String sender, String subject, String body, String recipient) throws MessagingException {
        // Create a mail session
        java.util.Properties props = new java.util.Properties();
        props.put("mail.smtp.host", smtpHost);
        props.put("mail.smtp.port", "" + smtpPort);

        // Construct the message
        Message msg = new Message();
        msg.setFrom(sender);
        msg.setRecipient(recipient);
        msg.setSubject(subject);
        msg.setText(body);

        // Send the message
        Transport.send(msg);
    }

    private static class Transport {
        public static void send(Message msg) {

        }
    }

    private class Message {
        public Object RecipientType;
        private String from;
        private String subject;
        private String text;
        private String recipient;

        public void setFrom(String from) {
            this.from = from;
        }

        public void setSubject(String subject) {
            this.subject = subject;
        }

        public void setText(String text) {
            this.text = text;
        }

        public void setRecipient(String recipient) {
            this.recipient = recipient;
        }
    }
}
