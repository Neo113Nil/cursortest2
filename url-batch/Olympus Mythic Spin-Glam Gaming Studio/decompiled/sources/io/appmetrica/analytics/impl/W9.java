package io.appmetrica.analytics.impl;

/* loaded from: classes8.dex */
public final class W9 {
    public final long a;

    public W9(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof W9) && this.a == ((W9) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return "ExternalAttributionConfig(collectingInterval=" + this.a + ')';
    }
}
