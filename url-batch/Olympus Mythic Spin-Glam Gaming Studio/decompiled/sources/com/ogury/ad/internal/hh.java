package com.ogury.ad.internal;

import java.io.Serializable;

/* loaded from: classes8.dex */
public final class hh implements Serializable {
    public final int a;
    public final int b;

    public hh(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final String toString() {
        return "Size(width=" + this.a + ", height=" + this.b + ")";
    }
}
