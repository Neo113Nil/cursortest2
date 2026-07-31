package com.ogury.ad.internal;

/* loaded from: classes10.dex */
public final class bb {
    public final int a;
    public final int b;
    public final int c;

    public bb(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bb)) {
            return false;
        }
        bb bbVar = (bb) obj;
        return this.a == bbVar.a && this.b == bbVar.b && this.c == bbVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + ((Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31)) * 31);
    }

    public final String toString() {
        return "OverlayPosition(gravity=" + this.a + ", xMargin=" + this.b + ", yMargin=" + this.c + ")";
    }
}
