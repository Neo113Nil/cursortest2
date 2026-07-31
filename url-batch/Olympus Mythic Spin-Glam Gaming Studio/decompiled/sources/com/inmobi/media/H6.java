package com.inmobi.media;

/* loaded from: classes10.dex */
public final class H6 extends K6 {
    public final short a;

    public H6(short s) {
        this.a = s;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof H6) && this.a == ((H6) obj).a;
    }

    public final int hashCode() {
        return Short.hashCode(this.a);
    }

    public final String toString() {
        return "Failure(errorCode=" + ((int) this.a) + ")";
    }
}
