/**
 * AlertSystem.java
 * 
 * 
 * 
 * This class is part of a modular notification system designed
 * using composition principles. Public methods are documented
 * to support maintainability.
 *
 * Version: 1.0.0
 * Last Updated: 2/24/2026
 */

package FlexibleNotificationSystem;

import java.util.ArrayList;

/**
 * AlertSystem acts as a container that delegates
 * notification delivery to a NotificationMedium.
 * 
 * Using composition, rather than inheritance, allows
 * the specific notification behavior to be swapped 
 * appropriately at runtime
 *
 * This acts as a decision making or 'controller' class in the system
 * delegating tasks to EmailService and SMSService
 *
 * Maintains a rudimentary log of the messages sent for a given session
 * 
 *
 * @author Peter Hornbach
 * @version 1.0
 */
public class AlertSystem {

    private NotificationMedium medium;
    private ArrayList<String> messageLog;

    /**
     * Constructs an AlertSystem object with an empty message log.
     */
    public AlertSystem() {
        messageLog = new ArrayList<>();
    }

    /**
     * Sets the current notification medium.
     *
     * @param medium the notification medium to use
     */
    public void setMedium(NotificationMedium medium) {
        this.medium = medium;
    }

    /**
     * Sends a notification using the active medium
     * and logs the message.
     *
     * @param message the message to send
     */
    public void notifyUser(String message) {
        if (medium == null) {
            System.out.println("No notification medium set.");
            return;
        }

        medium.send(message);
        messageLog.add(message);
    }

    /**
     * Prints all messages sent during this session.
     */
    public void printLog() {
        System.out.println("\n*** Notification Log ***");
        for (String msg : messageLog) {
            System.out.println(msg);
        }
    }

    /**
     * CLI entry point for the program.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        AlertSystem alertSystem = new AlertSystem();

        // Use case for email notification
        alertSystem.setMedium(new EmailService());
        alertSystem.notifyUser("Assignment Posted, Great Job!");

        // Swap to SMS notification at runtime
        alertSystem.setMedium(new SMSService());
        alertSystem.notifyUser("Reminder: Assignment due tonight.");

        // Display log
        alertSystem.printLog();
    }
}
