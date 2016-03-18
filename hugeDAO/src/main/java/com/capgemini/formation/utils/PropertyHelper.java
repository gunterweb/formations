package com.capgemini.formation.utils;

import java.util.Locale;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

import com.capgemini.formation.exception.TechnicalException;

/**
 * Property helper
 * 
 * @author fbontemp
 *
 */
public class PropertyHelper {
    private static final String MESSAGE_NOT_DEFINED = "Message not defined for key : ";
    private static final String PROPERTY_NOT_DEFINED = "Property not defined for key : ";
    /**
     * Application bundle
     */
    private static final String APPLICATION_BUNDLE = "application";

    /**
     * Messages bundle
     */
    private static final String MESSAGES_BUNDLE = "messages";

    private PropertyHelper() {

    }

    /**
     * Get property from key
     * 
     * @param key
     *            key
     * @return property value
     * @throws TechnicalException
     *             TechnicalException
     */
    public static String getProperty(String key) throws TechnicalException {
        Locale currentLocale = Locale.getDefault();
        ResourceBundle bundle = ResourceBundle.getBundle(APPLICATION_BUNDLE, currentLocale);
        String propertyValue = null;
        try {
            propertyValue = bundle.getString(key);
        } catch (MissingResourceException e) {
            throw new TechnicalException(PROPERTY_NOT_DEFINED + key, e);
        }
        return propertyValue;
    }

    /**
     * Get property from key
     * 
     * @param key
     *            key
     * @return property value
     * @throws TechnicalException
     *             TechnicalException
     */
    public static String getMessageProperty(String key) throws TechnicalException {
        Locale currentLocale = Locale.getDefault();
        ResourceBundle bundle = ResourceBundle.getBundle(MESSAGES_BUNDLE, currentLocale);
        String propertyValue = null;
        try {
            propertyValue = bundle.getString(key);
        } catch (MissingResourceException e) {
            throw new TechnicalException(MESSAGE_NOT_DEFINED + key, e);
        }
        return propertyValue;
    }
}
