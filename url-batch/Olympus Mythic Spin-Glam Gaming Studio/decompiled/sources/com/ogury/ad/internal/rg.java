package com.ogury.ad.internal;

/* loaded from: classes6.dex */
public final class rg {
    public boolean a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;

    public rg(boolean z, int i, int i2, int i3, int i4) {
        this.a = z;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
    }

    public static rg a(rg rgVar, int i, int i2, int i3) {
        boolean z = rgVar.a;
        int i4 = rgVar.b;
        int i5 = rgVar.c;
        if ((i3 & 8) != 0) {
            i = rgVar.d;
        }
        int i6 = i;
        if ((i3 & 16) != 0) {
            i2 = rgVar.e;
        }
        return new rg(z, i4, i5, i6, i2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rg)) {
            return false;
        }
        rg rgVar = (rg) obj;
        return this.a == rgVar.a && this.b == rgVar.b && this.c == rgVar.c && this.d == rgVar.d && this.e == rgVar.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + ((Integer.hashCode(this.d) + ((Integer.hashCode(this.c) + ((Integer.hashCode(this.b) + (Boolean.hashCode(this.a) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ResizeProps(allowOffscreen=" + this.a + ", width=" + this.b + ", height=" + this.c + ", offsetX=" + this.d + ", offsetY=" + this.e + ")";
    }

    public rg() {
        this(false, 0, 0, 0, 0);
    }
}
