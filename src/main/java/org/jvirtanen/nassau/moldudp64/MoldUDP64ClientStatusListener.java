package org.jvirtanen.nassau.moldudp64;

import java.io.IOException;

/**
 * The interface for inbound status events on a MoldUDP64 client.
 */
public interface MoldUDP64ClientStatusListener {

    /**
     * Indicates that a downstream packet was processed successfully.
     *
     * @throws IOException if an I/O error occurs
     */
    void downstream() throws IOException;

    /**
     * Indicates that a request packet was sent.
     *
     * @param sequenceNumber the sequence number
     * @param requestedMessageCount the requested message count
     * @throws IOException if an I/O error occurs
     */
    void request(long sequenceNumber, int requestedMessageCount) throws IOException;

    /**
     * Indicates that a downstream packet indicating the End of Session was
     * received.
     *
     * @throws IOException if an I/O error occurs
     */
    void endOfSession() throws IOException;

}
