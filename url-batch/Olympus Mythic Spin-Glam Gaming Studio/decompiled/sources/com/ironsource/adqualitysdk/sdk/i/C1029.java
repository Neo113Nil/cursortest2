package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᵨ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C1029 extends AbstractRunnableC0913 {

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final /* synthetic */ C1007 f2613;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ C1098 f2614;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC1075 f2615;

    public C1029(C1007 c1007, InterfaceC1075 interfaceC1075, C1098 c1098) {
        this.f2613 = c1007;
        this.f2615 = interfaceC1075;
        this.f2614 = c1098;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0913
    /* renamed from: ﾒ */
    public final void mo3946() {
        boolean z;
        InterfaceC1075 interfaceC1075 = this.f2615;
        C1098 c1098 = this.f2614;
        C0951 c0951 = this.f2613.f2439;
        synchronized (c0951) {
            z = c0951.f2268;
        }
        if (!z) {
            m4318(interfaceC1075, c1098);
            return;
        }
        try {
            C1335 m4394 = c1098.m4394();
            if (m4394 != null) {
                String str = AbstractC1099.f2810;
                String str2 = m4394.f3682;
                AbstractC0580.m4073(StringFog.decrypt("zQE/mUGeeebiCiqJS54=\n", "g2RL7i7sEqs=\n"), StringFog.decrypt("pHgjuf9VSoqAdDLq7VVLmpBnOPftEBmZkXg6ue0QS4mGZXfu9wFR34d2I/ikVQ==\n", "4xdXmZ51Of8=\n") + str2);
                AbstractC1026.m4312(new C1081(m4394, interfaceC1075));
            } else {
                AbstractC1026.m4312(new C1080(m4394, interfaceC1075));
            }
        } catch (Exception e) {
            interfaceC1075.mo4124(null, StringFog.decrypt("FE7OxgUhAoMuANzBByAClDRT28sEZFCSMFXK1x1k\n", "QSCvpGlEIvc=\n") + e.getLocalizedMessage());
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final void m4318(InterfaceC1075 interfaceC1075, C1098 c1098) {
        C0951 c0951 = this.f2613.f2439;
        C1036 c1036 = new C1036(this, interfaceC1075, c1098);
        synchronized (c0951) {
            c0951.f2267.add(c1036);
        }
    }
}
