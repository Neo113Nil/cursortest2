package com.ironsource.adqualitysdk.sdk.i;

import android.app.Activity;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ﮉ, reason: contains not printable characters */
/* loaded from: classes10.dex */
public final class C1217 extends AbstractRunnableC0913 {

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ C1187 f3205;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ Activity f3206;

    public C1217(C1187 c1187, Activity activity) {
        this.f3205 = c1187;
        this.f3206 = activity;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0913
    /* renamed from: ﾒ */
    public final void mo3946() {
        if (C1187.m4448(this.f3205, this.f3206)) {
            this.f3205.f3082.onActivityPaused(this.f3206);
        }
    }
}
