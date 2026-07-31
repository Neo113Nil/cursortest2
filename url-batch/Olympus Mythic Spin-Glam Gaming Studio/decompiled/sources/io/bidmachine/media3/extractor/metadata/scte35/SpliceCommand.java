package io.bidmachine.media3.extractor.metadata.scte35;

import io.bidmachine.media3.common.Metadata;
import io.bidmachine.media3.common.util.UnstableApi;

@UnstableApi
/* loaded from: classes11.dex */
public abstract class SpliceCommand implements Metadata.Entry {
    public String toString() {
        return "SCTE-35 splice command: type=" + getClass().getSimpleName();
    }
}
