package com.five_corp.ad.internal.layouter;

/* loaded from: classes3.dex */
public final class g {
    public final int a;
    public final int b;
    public final int c;
    public final float d;
    public final boolean e;
    public final boolean f;
    public final boolean g;

    public g(int i, int i2, int i3, float f, boolean z, boolean z2, boolean z3) {
        this.a = i;
        this.c = i2;
        this.b = i3;
        this.d = f;
        this.e = z;
        this.f = z2;
        this.g = z3;
    }

    public static g a(int i, int i2, boolean z, boolean z2, boolean z3) {
        int min;
        float f;
        int i3;
        float f2;
        if (z) {
            f2 = 1.0f;
            i3 = i2;
        } else {
            if (i2 <= 0) {
                min = 0;
                f = 0.0f;
            } else {
                min = Math.min(i, i2);
                f = min / i2;
            }
            i3 = min;
            f2 = f;
        }
        return new g(i3, i2, i2 - i3, f2, z, z2, z3);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.a == gVar.a && this.c == gVar.c && this.e == gVar.e && this.f == gVar.f && this.g == gVar.g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.g) + ((Boolean.hashCode(this.f) + ((Boolean.hashCode(this.e) + (((this.a * 13) + this.c) * 13)) * 13)) * 13);
    }
}
