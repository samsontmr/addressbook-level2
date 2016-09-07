/**
 * 
 */
package seedu.addressbook.data.person;

import seedu.addressbook.data.exception.IllegalValueException;

/**
 * Contains methods and variables common to Phone, Email and Address classes
 */

public class Contact {
    public final String value;
    private boolean isPrivate;

    /**
     * Validates given contact information.
     *
     * @throws IllegalValueException if given address string is invalid.
     */
    public Contact(String _value, boolean isPrivate, String VALUE_VALIDATION_REGEX, String MESSAGE_VALUE_CONSTRAINTS) throws IllegalValueException {
        this.isPrivate = isPrivate;
        if (!isValidValue(_value, VALUE_VALIDATION_REGEX)) {
            throw new IllegalValueException(MESSAGE_VALUE_CONSTRAINTS);
        }
        this.value = _value;
    }
    
    /**
     * Checks if a given string is a valid person value based on validation regex provided.
     */
    public static boolean isValidValue(String test, String VALUE_VALIDATION_REGEX) {
        return test.matches(VALUE_VALIDATION_REGEX);
    }
    
    @Override
    public String toString() {
        return value;
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }

    public boolean isPrivate() {
        return isPrivate;
    }
}
