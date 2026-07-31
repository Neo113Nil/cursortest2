package com.inmobi.media;

/* renamed from: com.inmobi.media.db, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C3940db extends AbstractC3994fb {
    public final int a;

    public C3940db(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3940db) && this.a == ((C3940db) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return "InValid(errorCode=" + this.a + ")";
    }
}
