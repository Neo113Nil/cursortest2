package com.ogury.ad.internal;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class n3 implements Serializable {
    public final boolean a;
    public final o3 b;

    public n3(boolean z, o3 o3Var) {
        this.a = z;
        this.b = o3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n3)) {
            return false;
        }
        n3 n3Var = (n3) obj;
        return this.a == n3Var.a && this.b == n3Var.b;
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.a) * 31;
        o3 o3Var = this.b;
        return hashCode + (o3Var == null ? 0 : o3Var.hashCode());
    }

    public final String toString() {
        return "ImpressionSettings(isPaidImpression=" + this.a + ", impressionSource=" + this.b + ")";
    }

    public n3() {
        o3 o3Var = o3.a;
        this.a = false;
        this.b = o3Var;
    }
}
