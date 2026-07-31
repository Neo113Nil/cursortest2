package com.inmobi.media;

/* loaded from: classes13.dex */
public final class Pg extends AbstractC4376to {
    public final int a;

    public Pg(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Pg) && this.a == ((Pg) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return "PollingVisibilityTrackerConfig(pollingIntervalInMillis=" + this.a + ")";
    }
}
