package io.appmetrica.analytics.impl;

/* loaded from: classes12.dex */
public final class Xm {
    public final long a;

    public Xm(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && Xm.class == obj.getClass() && this.a == ((Xm) obj).a;
    }

    public final int hashCode() {
        long j = this.a;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        return "StatSending{disabledReportingInterval=" + this.a + '}';
    }
}
