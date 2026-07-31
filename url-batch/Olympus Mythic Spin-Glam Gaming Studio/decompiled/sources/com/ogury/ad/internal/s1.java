package com.ogury.ad.internal;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class s1 extends t1 {
    public final boolean a;
    public final String b;
    public final int c;
    public final long d;

    public s1(boolean z, String str, int i, long j) {
        this.a = z;
        this.b = str;
        this.c = i;
        this.d = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s1)) {
            return false;
        }
        s1 s1Var = (s1) obj;
        return this.a == s1Var.a && Intrinsics.areEqual(this.b, s1Var.b) && this.c == s1Var.c && this.d == s1Var.d;
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.a) * 31;
        String str = this.b;
        return Long.hashCode(this.d) + ((Integer.hashCode(this.c) + ((hashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31);
    }

    public final String toString() {
        return "Success(isBlank=" + this.a + ", colorRef=" + this.b + ", deviance=" + this.c + ", duration=" + this.d + ")";
    }
}
