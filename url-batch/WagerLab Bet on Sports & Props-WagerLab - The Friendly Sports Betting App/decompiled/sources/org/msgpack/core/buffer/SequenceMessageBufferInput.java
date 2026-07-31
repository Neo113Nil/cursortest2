package org.msgpack.core.buffer;

import java.io.IOException;
import java.util.Enumeration;
import org.msgpack.core.Preconditions;

/* loaded from: classes9.dex */
public class SequenceMessageBufferInput implements MessageBufferInput {
    private MessageBufferInput input;
    private Enumeration<? extends MessageBufferInput> sequence;

    public SequenceMessageBufferInput(Enumeration<? extends MessageBufferInput> enumeration) {
        this.sequence = (Enumeration) Preconditions.checkNotNull(enumeration, "input sequence is null");
        try {
            nextInput();
        } catch (IOException unused) {
        }
    }

    @Override // org.msgpack.core.buffer.MessageBufferInput
    public MessageBuffer next() throws IOException {
        MessageBufferInput messageBufferInput = this.input;
        if (messageBufferInput == null) {
            return null;
        }
        MessageBuffer next = messageBufferInput.next();
        if (next != null) {
            return next;
        }
        nextInput();
        return next();
    }

    private void nextInput() throws IOException {
        MessageBufferInput messageBufferInput = this.input;
        if (messageBufferInput != null) {
            messageBufferInput.close();
        }
        if (this.sequence.hasMoreElements()) {
            MessageBufferInput nextElement = this.sequence.nextElement();
            this.input = nextElement;
            if (nextElement == null) {
                throw new NullPointerException("An element in the MessageBufferInput sequence is null");
            }
            return;
        }
        this.input = null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        do {
            nextInput();
        } while (this.input != null);
    }
}
