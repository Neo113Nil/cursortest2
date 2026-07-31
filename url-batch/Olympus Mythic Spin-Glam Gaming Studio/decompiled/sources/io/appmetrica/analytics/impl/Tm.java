package io.appmetrica.analytics.impl;

/* loaded from: classes9.dex */
public final class Tm {
    public final int a;

    public Tm(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Tm) && this.a == ((Tm) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return "StartupUpdateConfig(intervalSeconds=" + this.a + ')';
    }
}
