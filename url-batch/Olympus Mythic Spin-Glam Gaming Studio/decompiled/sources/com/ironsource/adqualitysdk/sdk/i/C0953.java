package com.ironsource.adqualitysdk.sdk.i;

import android.app.Activity;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᴉ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C0953 extends AbstractRunnableC0913 {

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ C0945 f2271;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ Activity f2272;

    public C0953(C0945 c0945, Activity activity) {
        this.f2271 = c0945;
        this.f2272 = activity;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0913
    /* renamed from: ﾒ */
    public final void mo3946() {
        C0945 c0945 = this.f2271;
        c0945.f2252 = true;
        InterfaceC1130 interfaceC1130 = c0945.f2251;
        if (interfaceC1130 != null) {
            interfaceC1130.mo4411(this.f2272);
        }
    }
}
