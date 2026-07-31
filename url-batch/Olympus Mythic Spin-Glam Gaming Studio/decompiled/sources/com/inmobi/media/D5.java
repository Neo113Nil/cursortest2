package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class D5 {
    public final boolean a;
    public final String b;

    public D5(String str, boolean z) {
        this.a = z;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof D5)) {
            return false;
        }
        D5 d5 = (D5) obj;
        return this.a == d5.a && Intrinsics.areEqual(this.b, d5.b);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.a) * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "PlayStoreSnapshot(disabled=" + this.a + ", version=" + this.b + ")";
    }
}
