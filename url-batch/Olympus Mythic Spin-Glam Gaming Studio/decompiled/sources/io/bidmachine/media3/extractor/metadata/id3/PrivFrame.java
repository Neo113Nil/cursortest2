package io.bidmachine.media3.extractor.metadata.id3;

import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import io.bidmachine.media3.common.util.UnstableApi;
import java.util.Arrays;
import java.util.Objects;

@UnstableApi
/* loaded from: classes5.dex */
public final class PrivFrame extends Id3Frame {
    public static final String ID = "PRIV";
    public final String owner;
    public final byte[] privateData;

    public PrivFrame(String str, byte[] bArr) {
        super("PRIV");
        this.owner = str;
        this.privateData = bArr;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || PrivFrame.class != obj.getClass()) {
            return false;
        }
        PrivFrame privFrame = (PrivFrame) obj;
        return Objects.equals(this.owner, privFrame.owner) && Arrays.equals(this.privateData, privFrame.privateData);
    }

    public int hashCode() {
        String str = this.owner;
        return ((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + (str != null ? str.hashCode() : 0)) * 31) + Arrays.hashCode(this.privateData);
    }

    @Override // io.bidmachine.media3.extractor.metadata.id3.Id3Frame
    public String toString() {
        return this.id + ": owner=" + this.owner;
    }
}
