package com.inmobi.media;

import com.inmobi.media.ads.nativeAd.MediaView;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class I6 extends K6 {
    public final MediaView a;
    public final Jl b;

    public I6(MediaView mediaView, Jl jl) {
        Intrinsics.checkNotNullParameter(mediaView, "mediaView");
        this.a = mediaView;
        this.b = jl;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof I6)) {
            return false;
        }
        I6 i6 = (I6) obj;
        return Intrinsics.areEqual(this.a, i6.a) && Intrinsics.areEqual(this.b, i6.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Jl jl = this.b;
        return hashCode + (jl == null ? 0 : jl.hashCode());
    }

    public final String toString() {
        return "Success(mediaView=" + this.a + ", vastBeaconData=" + this.b + ")";
    }
}
