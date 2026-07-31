package io.grpc.internal;

import java.io.InputStream;
import javax.annotation.Nullable;

/* loaded from: classes7.dex */
public interface StreamListener {

    public interface MessageProducer {
        @Nullable
        InputStream next();
    }

    void messagesAvailable(MessageProducer messageProducer);

    void onReady();
}
