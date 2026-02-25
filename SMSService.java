/**
 * SMSService.java
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


/**
 * Concrete implementation of NotificationMedium
 * Prints a simulation of an SMS message being sent
 * SMSService is one of the 'worker' classes in the system
 * responsible for carrying out a task rather than making decisions
 * 
 * Functions similarly to EmailService while simulating a different notification medium
 *
 * @author Peter Hornbach
 * @version 1.0
 */
public class SMSService implements NotificationMedium {

    /**
     * Sends a message using an SMS service.
     *
     * @param message the message to be sent
     */
    @Override
    public void send(String message) {
        System.out.println("SMS sent: " + message);
    }
}

