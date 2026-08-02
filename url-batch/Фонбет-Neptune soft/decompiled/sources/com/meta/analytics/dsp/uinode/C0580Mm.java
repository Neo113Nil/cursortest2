package com.meta.analytics.dsp.uinode;

/* renamed from: com.facebook.ads.redexgen.X.Mm, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0580Mm {
    public int A00;
    public EnumC0564Lw A01;
    public InterfaceC0584Mq A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public final C0889Yn A0C;
    public boolean A0A = true;
    public boolean A0B = true;
    public boolean A09 = true;
    public boolean A07 = true;
    public boolean A08 = true;

    public C0580Mm(C0889Yn c0889Yn, InterfaceC0584Mq interfaceC0584Mq) {
        this.A0C = c0889Yn;
        this.A02 = interfaceC0584Mq;
    }

    public final C0580Mm A0D(int i) {
        this.A00 = i;
        return this;
    }

    public final C0580Mm A0E(EnumC0564Lw enumC0564Lw) {
        this.A01 = enumC0564Lw;
        return this;
    }

    public final C0580Mm A0F(String str) {
        this.A03 = str;
        return this;
    }

    public final C0580Mm A0G(String str) {
        this.A04 = str;
        return this;
    }

    public final C0580Mm A0H(String str) {
        this.A05 = str;
        return this;
    }

    public final C0580Mm A0I(String str) {
        this.A06 = str;
        return this;
    }

    public final C0580Mm A0J(boolean z) {
        this.A09 = z;
        return this;
    }

    public final C0580Mm A0K(boolean z) {
        this.A0A = z;
        return this;
    }

    public final C0580Mm A0L(boolean z) {
        this.A0B = z;
        return this;
    }

    public final C0581Mn A0M() {
        return new C0581Mn(this, null);
    }
}
