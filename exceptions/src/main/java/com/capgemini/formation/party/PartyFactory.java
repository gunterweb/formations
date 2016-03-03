package com.capgemini.formation.party;

import java.io.Serializable;
import java.nio.file.Path;
import java.nio.file.Paths;

import com.capgemini.formation.exception.TechnicalException;
import com.capgemini.formation.utils.PropertyHelper;

/**
 * Party factory <br>
 * Used to initialize common parties data
 * 
 * @author fbontemp
 *
 */
public class PartyFactory implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = -4809776117038846332L;

    private static final String OUTPUT_PATH = "output.path";
    private static final String INVITED_MESSAGE_KEY = "message.invited";
    private static final String UNKNOWN_MESSAGE_KEY = "message.unknown";

    /**
     * The path where to put the party details
     */
    static Path partyPath;

    /**
     * The message format
     */
    static String messageTemplate;

    /**
     * The unknown property
     */
    static String unknownProperty;

    /**
     * Singleton instance
     */
    private static PartyFactory instance;

    private PartyFactory() {
    }

    /**
     * Get current Factory instance
     * 
     * @return PartyFactory instance
     */
    public static PartyFactory getInstance() throws TechnicalException {
        if (instance == null) {
            instance = new PartyFactory();
            PartyFactory.init();
        }
        return instance;
    }

    /**
     * Party initialization
     */
    private static void init() throws TechnicalException {
        partyPath = Paths.get(PropertyHelper.getProperty(OUTPUT_PATH));
        messageTemplate = PropertyHelper.getMessageProperty(INVITED_MESSAGE_KEY);
        unknownProperty = PropertyHelper.getMessageProperty(UNKNOWN_MESSAGE_KEY);

    }

    /**
     * Creates a party
     * 
     * @param leader
     *            leader
     * @return Party
     */
    public Party createParty(PartyLeader leader) {
        return new Party(leader);
    }
}
