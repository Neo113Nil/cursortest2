package com.five_corp.ad.internal.ad.beacon;

/* loaded from: classes15.dex */
public final class a {
    public final int a;
    public final int b;
    public final long c;
    public final j d;

    public a(int i, int i2, long j, j jVar) {
        this.a = i;
        this.b = i2;
        this.c = j;
        this.d = jVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.a == aVar.a && this.b == aVar.b && this.c == aVar.c && this.d.equals(aVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((((h.a(this.b) + ((c.a(this.a) + 2969) * 2969)) * 2969) + ((int) this.c)) * 2969);
    }
}
