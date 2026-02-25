/**
 * EmailService.java
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
 * EmailService is a class with one public method
 * that prints a simulated 'email sent' verification
 * 
 * EmailService is one of the 'worker' classes in the system
 * responsible for carrying out a task rather than making decisions
 *
 * @author Peter Hornbach
 * @version 1.0
 */
public class EmailService implements NotificationMedium {

    /**
     * Sends a message using an email service.
     *
     * @param message the message to be sent
     */
    @Override
    public void send(String message) {
        System.out.println("Email sent: " + message);
    }
}
