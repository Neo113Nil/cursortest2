package io.bidmachine.media3.common.util;

@UnstableApi
/* loaded from: classes11.dex */
public interface TimestampIterator {
    TimestampIterator copyOf();

    default long getLastTimestampUs() {
        return -9223372036854775807L;
    }

    boolean hasNext();

    long next();
}
