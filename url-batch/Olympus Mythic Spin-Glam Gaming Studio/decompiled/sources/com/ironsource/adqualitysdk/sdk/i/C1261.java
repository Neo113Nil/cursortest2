package com.ironsource.adqualitysdk.sdk.i;

import android.app.Activity;
import android.os.Bundle;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ﺙ, reason: contains not printable characters */
/* loaded from: classes15.dex */
public final class C1261 extends AbstractRunnableC0913 {

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final /* synthetic */ C1187 f3424;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ Bundle f3425;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ Activity f3426;

    public C1261(C1187 c1187, Activity activity, Bundle bundle) {
        this.f3424 = c1187;
        this.f3426 = activity;
        this.f3425 = bundle;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0913
    /* renamed from: ﾒ */
    public final void mo3946() {
        if (C1187.m4448(this.f3424, this.f3426)) {
            this.f3424.f3082.getClass();
            this.f3424.getClass();
            C1187 c1187 = this.f3424;
            c1187.f3079 = false;
            Bundle bundle = this.f3425;
            if (bundle == null) {
                c1187.f3080 = false;
                return;
            }
            c1187.f3080 = bundle.getBoolean(C1187.f3074);
            C1187 c11872 = this.f3424;
            if (c11872.f3080) {
                c11872.f3079 = true;
            }
            c11872.f3077 = true;
        }
    }
}
