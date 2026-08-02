package com.meta.analytics.dsp.uinode;

/* renamed from: com.facebook.ads.redexgen.X.Pe, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0650Pe {
    public String A02;
    public String A03;
    public final C1N A04;
    public final C00641a A05;
    public final C0889Yn A06;
    public C1P A01 = C1P.A01(null);
    public int A00 = 1000;

    public C0650Pe(C0889Yn c0889Yn, C1N c1n, C00641a c00641a) {
        this.A06 = c0889Yn;
        this.A04 = c1n;
        this.A05 = c00641a;
    }

    public final C0650Pe A07(int i) {
        this.A00 = i;
        return this;
    }

    public final C0650Pe A08(C1P c1p) {
        this.A01 = c1p;
        return this;
    }

    public final C0650Pe A09(String str) {
        this.A02 = str;
        return this;
    }

    public final C0650Pe A0A(String str) {
        this.A03 = str;
        return this;
    }

    public final C0652Pg A0B() {
        return new C0652Pg(this, null);
    }
}
