package com.five_corp.ad.internal.ad.beacon;

/* loaded from: classes15.dex */
public final class g {
    public final String a;
    public final String b;

    public g(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.a.equals(gVar.a) && this.b.equals(gVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
