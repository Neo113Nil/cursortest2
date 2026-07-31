package io.bidmachine.media3.exoplayer.dash.manifest;

import androidx.annotation.Nullable;
import io.bidmachine.media3.common.util.UnstableApi;
import java.util.Objects;

@UnstableApi
/* loaded from: classes12.dex */
public final class Descriptor {

    @Nullable
    public final String id;
    public final String schemeIdUri;

    @Nullable
    public final String value;

    public Descriptor(String str, @Nullable String str2, @Nullable String str3) {
        this.schemeIdUri = str;
        this.value = str2;
        this.id = str3;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Descriptor.class != obj.getClass()) {
            return false;
        }
        Descriptor descriptor = (Descriptor) obj;
        return Objects.equals(this.schemeIdUri, descriptor.schemeIdUri) && Objects.equals(this.value, descriptor.value) && Objects.equals(this.id, descriptor.id);
    }

    public int hashCode() {
        int hashCode = this.schemeIdUri.hashCode() * 31;
        String str = this.value;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.id;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
