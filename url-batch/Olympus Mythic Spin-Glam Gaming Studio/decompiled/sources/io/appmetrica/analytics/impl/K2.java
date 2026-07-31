package io.appmetrica.analytics.impl;

/* loaded from: classes11.dex */
public final class K2 {
    public final J2 a;
    public final Boolean b;

    public K2(J2 j2, Boolean bool) {
        this.a = j2;
        this.b = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || K2.class != obj.getClass()) {
            return false;
        }
        K2 k2 = (K2) obj;
        if (this.a != k2.a) {
            return false;
        }
        Boolean bool = this.b;
        return bool != null ? bool.equals(k2.b) : k2.b == null;
    }

    public final int hashCode() {
        J2 j2 = this.a;
        int hashCode = (j2 != null ? j2.hashCode() : 0) * 31;
        Boolean bool = this.b;
        return hashCode + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        return "BackgroundRestrictionsState{mAppStandByBucket=" + this.a + ", mBackgroundRestricted=" + this.b + '}';
    }
}
