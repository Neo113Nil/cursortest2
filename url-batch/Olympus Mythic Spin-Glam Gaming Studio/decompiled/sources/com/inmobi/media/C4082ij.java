package com.inmobi.media;

/* renamed from: com.inmobi.media.ij, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C4082ij {
    public final int a;
    public final int b;
    public final int c;

    public C4082ij(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4082ij)) {
            return false;
        }
        C4082ij c4082ij = (C4082ij) obj;
        return this.a == c4082ij.a && this.b == c4082ij.b && this.c == c4082ij.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + Ai.a(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        return "SemVer(major=" + this.a + ", minor=" + this.b + ", patch=" + this.c + ")";
    }
}
