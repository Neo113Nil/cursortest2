package com.inmobi.media;

/* loaded from: classes12.dex */
public final class In extends AbstractC4295qm {
    public final long a;

    public In(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof In) && this.a == ((In) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return "VideoSkipped(currentPlaybackTime=" + this.a + ")";
    }
}
