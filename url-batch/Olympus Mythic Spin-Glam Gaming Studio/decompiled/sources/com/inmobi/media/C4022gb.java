package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.gb, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C4022gb {
    public final int a;
    public final Integer b;

    public C4022gb(int i) {
        this.a = i;
        this.b = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4022gb)) {
            return false;
        }
        C4022gb c4022gb = (C4022gb) obj;
        return this.a == c4022gb.a && Intrinsics.areEqual(this.b, c4022gb.b);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        Integer num = this.b;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "OpenRequestResultData(result=" + this.a + ", errorCode=" + this.b + ")";
    }

    public C4022gb(int i, Integer num) {
        this.a = i;
        this.b = num;
    }
}
