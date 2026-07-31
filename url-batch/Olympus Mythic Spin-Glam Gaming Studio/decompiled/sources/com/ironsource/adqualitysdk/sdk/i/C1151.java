package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ヾ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C1151 extends AbstractRunnableC0913 {

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ C1143 f2908;

    public C1151(C1143 c1143) {
        this.f2908 = c1143;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0913
    /* renamed from: ﾒ */
    public final void mo3946() {
        C1086 c1086 = this.f2908.f2893;
        String str = C1086.f2754;
        c1086.m4391(false);
        C0548 c0548 = this.f2908.f2894;
        if (c0548 != null) {
            try {
                c0548.mo3946();
            } catch (Exception e) {
                AbstractC0577.m4069(StringFog.decrypt("pO1W3hvQ9dKW\n", "5YM3smKknLE=\n"), StringFog.decrypt("6FJEuLsbZU6NU1O5rX56RcNUDPemVU9PwFBasr1SY04=\n", "rSA218k7DCA=\n"), e, false, false, true);
            }
        }
    }
}
