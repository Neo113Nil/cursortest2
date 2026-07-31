package com.inmobi.media;

/* renamed from: com.inmobi.media.om, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C4243om extends AbstractC4295qm {
    public final long a;

    public C4243om(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4243om) && this.a == ((C4243om) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return "VideoComplete(duration=" + this.a + ")";
    }
}
