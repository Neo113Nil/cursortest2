package com.ogury.ad.internal;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class r1 extends t1 {
    public final int a;
    public final String b;

    public r1(int i, String errorMessage) {
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        this.a = i;
        this.b = errorMessage;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r1)) {
            return false;
        }
        r1 r1Var = (r1) obj;
        return this.a == r1Var.a && Intrinsics.areEqual(this.b, r1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "Error(errorCode=" + this.a + ", errorMessage=" + this.b + ")";
    }
}
