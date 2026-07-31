package io.bidmachine.media3.container;

import androidx.annotation.Nullable;
import io.bidmachine.media3.common.Metadata;
import io.bidmachine.media3.common.util.UnstableApi;
import io.bidmachine.media3.common.util.Util;
import java.util.Arrays;

@UnstableApi
/* loaded from: classes11.dex */
public final class XmpData implements Metadata.Entry {
    public final byte[] data;

    public XmpData(byte[] bArr) {
        this.data = bArr;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || XmpData.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.data, ((XmpData) obj).data);
    }

    public int hashCode() {
        return Arrays.hashCode(this.data);
    }

    public String toString() {
        return "XMP: " + Util.toHexString(this.data);
    }
}
