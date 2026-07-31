package com.inmobi.media;

/* loaded from: classes10.dex */
public final class Gn extends AbstractC4295qm {
    public final long a;

    public Gn(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Gn) && this.a == ((Gn) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return "VideoResume(currentPlaybackTime=" + this.a + ")";
    }
}
