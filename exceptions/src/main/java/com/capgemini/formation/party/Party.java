package com.capgemini.formation.party;

import java.io.IOException;
import java.io.Writer;
import java.nio.file.Files;
import java.text.MessageFormat;
import java.util.List;

import com.capgemini.formation.exception.FormationException;
import com.capgemini.formation.exception.FunctionalReason;
import com.capgemini.formation.exception.TechnicalException;
import com.capgemini.formation.party.exception.PartyException;
import com.capgemini.formation.people.Friend;
import com.capgemini.formation.people.Friendship;

/**
 * Yeah : party !
 * 
 * @author fbontemp
 *
 */
public class Party implements Friendship {

    /**
     * 
     */
    private static final long serialVersionUID = 1544715696612984574L;

    /**
     * the Party Leader
     */
    private PartyLeader leader;

    /**
     * Create a party with a leader
     * 
     * @param leader
     *            leader
     */
    protected Party(PartyLeader leader) {
        super();
        setLeader(leader);
    }

    /**
     * write the party invitation
     */
    public void writeParty() throws FormationException {
        if (leader.getFriends() != null && !leader.getFriends().isEmpty()) {
            for (Friend friend : leader.getFriends()) {
                writePartyDetails(friend);
            }
        } else {
            throw new PartyException(FunctionalReason.NO_GUEST);
        }
    }

    /**
     * Write party details
     * 
     * @param friend
     *            friend
     */
    private void writePartyDetails(Friend friend) throws TechnicalException {
        try (Writer out = Files.newBufferedWriter(PartyFactory.partyPath)) {
            out.write(MessageFormat.format(PartyFactory.messageTemplate,
                    friend.getName() == null ? PartyFactory.unknownProperty : friend.getName(),
                    friend.getAge() == null ? PartyFactory.unknownProperty : friend.getAge(),
                    friend.getAddress() == null ? PartyFactory.unknownProperty : friend.getAddress()));
        } catch (IOException e) {
            throw new TechnicalException(e);
        }
    }

    public PartyLeader getLeader() {
        return leader;
    }

    public void setLeader(PartyLeader leader) {
        this.leader = leader;
    }

    @Override
    public List<Friend> getFriends() {
        return leader.getFriends();
    }
}
