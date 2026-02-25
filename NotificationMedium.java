/**
 * NotificationMedium.java
 * 
 * 
 * 
 * This class is part of a modular notification system designed
 * using composition principles. Public methods are documented
 * to support maintainability and ownership readiness.
 *
 * Version: 1.0.0
 * Last Updated: 2/24/2026
 */

package FlexibleNotificationSystem;
/**
 * Generic interface for generalized notification medium.
 * NotificationMedium contains one method
 * Generally defines how a notification is sent.
 *
 * Uses composition rather than inheritance
 * New types can be added to the notification schema without requiring
 * significant modifications to the system's logic
 *
 * @author Peter Hornbach
 * @version 1.0
 */
public interface NotificationMedium {

    /**
     * Sends a notification message.
     *
     * @param message the message to be sent
     */
    void send(String message);
}
