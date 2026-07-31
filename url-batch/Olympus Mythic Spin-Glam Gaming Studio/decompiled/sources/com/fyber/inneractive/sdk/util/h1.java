package com.fyber.inneractive.sdk.util;

/* loaded from: classes9.dex */
public final class h1 {
    public int a;
    public int b;

    public h1(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || h1.class != obj.getClass()) {
            return false;
        }
        h1 h1Var = (h1) obj;
        return this.a == h1Var.a && this.b == h1Var.b;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }
}
