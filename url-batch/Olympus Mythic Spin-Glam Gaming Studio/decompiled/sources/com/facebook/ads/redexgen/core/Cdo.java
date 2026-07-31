package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.do, reason: invalid class name */
/* loaded from: assets/audience_network/classes2.dex */
public final class Cdo {
    public String A02;
    public String A03;
    public String A04;
    public final NY A06;
    public final C2488Nm A07;
    public final C3218gi A08;
    public C2476Na A01 = C2476Na.A01(null);
    public int A00 = 1000;
    public boolean A05 = false;

    public Cdo(C3218gi c3218gi, NY ny, C2488Nm c2488Nm) {
        this.A08 = c3218gi;
        this.A06 = ny;
        this.A07 = c2488Nm;
    }

    public final Cdo A09(int i) {
        this.A00 = i;
        return this;
    }

    public final Cdo A0A(C2476Na c2476Na) {
        this.A01 = c2476Na;
        return this;
    }

    public final Cdo A0B(String str) {
        this.A04 = str;
        return this;
    }

    public final Cdo A0C(String str) {
        this.A02 = str;
        return this;
    }

    public final Cdo A0D(String str) {
        this.A03 = str;
        return this;
    }

    public final Cdo A0E(boolean z) {
        this.A05 = z;
        return this;
    }

    public final C3041dq A0F() {
        return new C3041dq(this, null);
    }
}
