package com.ironsource.adqualitysdk.sdk.i;

import android.app.Activity;
import android.os.Bundle;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ﮌ, reason: contains not printable characters */
/* loaded from: classes10.dex */
public final class C1220 extends AbstractRunnableC0913 {

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final /* synthetic */ C1187 f3209;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ Bundle f3210;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ Activity f3211;

    public C1220(C1187 c1187, Activity activity, Bundle bundle) {
        this.f3209 = c1187;
        this.f3211 = activity;
        this.f3210 = bundle;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0913
    /* renamed from: ﾒ */
    public final void mo3946() {
        if (C1187.m4448(this.f3209, this.f3211)) {
            this.f3209.f3082.getClass();
            Bundle bundle = this.f3210;
            if (bundle != null) {
                bundle.putBoolean(C1187.f3074, this.f3209.f3080);
            }
            this.f3209.f3078 = true;
        }
    }
}
