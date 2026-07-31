package com.my.target;

import android.graphics.Insets;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes6.dex */
public final class oi {
    public static final oi e = new oi(0, 0, 0, 0);
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    private oi(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public static oi a(int i, int i2, int i3, int i4) {
        return (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) ? e : new oi(i, i2, i3, i4);
    }

    public String toString() {
        return "TrgInsets{left=" + this.a + ", top=" + this.b + ", right=" + this.c + ", bottom=" + this.d + '}';
    }

    public static oi a(Insets insets) {
        int i;
        int i2;
        int i3;
        int i4;
        i = insets.left;
        i2 = insets.top;
        i3 = insets.right;
        i4 = insets.bottom;
        return a(i, i2, i3, i4);
    }
}
