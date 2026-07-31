package com.five_corp.ad.internal.ad.beacon;

import com.google.common.base.Objects;

/* loaded from: classes15.dex */
public final class j {
    public static final j e = new j(k.NOT_OBSTRUCTED_RATIO, i.MAIN_ASSET, 0.5d);
    public final k a;
    public final i b;
    public final double c;
    public final int d;

    public j(k kVar, i iVar, double d) {
        this.a = kVar;
        this.b = iVar;
        this.c = d;
        this.d = (int) (d * 1000000.0d);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.a == jVar.a && this.b == jVar.b && this.d == jVar.d;
    }

    public final int hashCode() {
        return Objects.hashCode(this.a, this.b, Integer.valueOf(this.d));
    }
}
