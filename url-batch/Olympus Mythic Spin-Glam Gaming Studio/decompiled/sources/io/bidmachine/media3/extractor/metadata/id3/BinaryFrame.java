package io.bidmachine.media3.extractor.metadata.id3;

import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import io.bidmachine.media3.common.util.UnstableApi;
import java.util.Arrays;

@UnstableApi
/* loaded from: classes5.dex */
public final class BinaryFrame extends Id3Frame {
    public final byte[] data;

    public BinaryFrame(String str, byte[] bArr) {
        super(str);
        this.data = bArr;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || BinaryFrame.class != obj.getClass()) {
            return false;
        }
        BinaryFrame binaryFrame = (BinaryFrame) obj;
        return this.id.equals(binaryFrame.id) && Arrays.equals(this.data, binaryFrame.data);
    }

    public int hashCode() {
        return ((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.id.hashCode()) * 31) + Arrays.hashCode(this.data);
    }
}
