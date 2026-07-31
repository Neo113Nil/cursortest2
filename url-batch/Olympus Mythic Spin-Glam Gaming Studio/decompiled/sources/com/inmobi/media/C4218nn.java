package com.inmobi.media;

/* renamed from: com.inmobi.media.nn, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C4218nn extends AbstractC4295qm {
    public final long a;

    public C4218nn(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4218nn) && this.a == ((C4218nn) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return "VideoPause(currentPlaybackTime=" + this.a + ")";
    }
}
