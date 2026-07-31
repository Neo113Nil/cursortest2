package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.গ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C0703 extends AbstractRunnableC0913 {

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final /* synthetic */ C0696 f1559;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ C0786 f1560;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ String f1561;

    public C0703(C0696 c0696, String str, C0786 c0786, boolean z) {
        this.f1559 = c0696;
        this.f1561 = str;
        this.f1560 = c0786;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0913
    /* renamed from: ﾒ */
    public final void mo3946() {
        C0715 m4141 = this.f1559.m4141(this.f1561);
        if (m4141 != null) {
            C0786 c0786 = this.f1560;
            C1112 c1112 = c0786.f1857;
            m4141.f1590 = c1112.f2830;
            m4141.f1589 = c1112.f2829;
            m4141.f1588 = c0786.f1854.m4101();
            if (StringFog.decrypt("Fo70F4nT6w==\n", "U8C1VcWWr/M=\n").equals(m4141.f1588) || StringFog.decrypt("8o6nKhyHGkw=\n", "tsf0a17LXwg=\n").equals(m4141.f1588)) {
                m4141.f1588 = C0715.f1582;
            }
            C1112 c11122 = c0786.f1857;
            m4141.f1587 = c11122.f2828;
            m4141.f1586 = c11122.f2827;
            m4141.f1585 = c0786.m4185();
        }
    }
}
