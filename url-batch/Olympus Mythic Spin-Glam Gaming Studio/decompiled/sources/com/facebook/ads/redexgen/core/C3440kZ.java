package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.kZ, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C3440kZ implements InterfaceC2448Lx {
    public final InterfaceC2445Lu A00;

    public C3440kZ(InterfaceC2445Lu interfaceC2445Lu) {
        this.A00 = interfaceC2445Lu;
    }

    public final InterfaceC2445Lu A00() {
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2448Lx
    public final C8J ACL() {
        return new C8J(this);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2448Lx
    public final C3444kd ACM() {
        return new C3444kd(this);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2448Lx
    public final C3444kd ACN(String str) {
        return new C3444kd(this, str);
    }
}
