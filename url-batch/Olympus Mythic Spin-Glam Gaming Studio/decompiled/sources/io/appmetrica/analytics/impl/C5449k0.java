package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.k0, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C5449k0 {
    public final String a;
    public final long b;

    public C5449k0(String str, long j) {
        this.a = str;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C5449k0.class != obj.getClass()) {
            return false;
        }
        C5449k0 c5449k0 = (C5449k0) obj;
        if (this.b != c5449k0.b) {
            return false;
        }
        String str = this.a;
        String str2 = c5449k0.a;
        if (str != null) {
            if (str.equals(str2)) {
                return true;
            }
        } else if (str2 == null) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = str != null ? str.hashCode() : 0;
        long j = this.b;
        return (hashCode * 31) + ((int) (j ^ (j >>> 32)));
    }
}
