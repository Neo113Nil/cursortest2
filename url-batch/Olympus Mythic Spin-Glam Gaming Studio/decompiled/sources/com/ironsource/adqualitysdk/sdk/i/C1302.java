package com.ironsource.adqualitysdk.sdk.i;

import android.app.Activity;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ｋ, reason: contains not printable characters */
/* loaded from: classes15.dex */
public final class C1302 extends AbstractRunnableC0913 {

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ C1187 f3531;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ Activity f3532;

    public C1302(C1187 c1187, Activity activity) {
        this.f3531 = c1187;
        this.f3532 = activity;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0913
    /* renamed from: ﾒ */
    public final void mo3946() {
        if (C1187.m4448(this.f3531, this.f3532)) {
            AbstractC1026.m4316(new C1338(this));
            C1187 c1187 = this.f3531;
            if (c1187.f3079 && c1187.f3080 && this.f3532.isFinishing()) {
                C1187 c11872 = this.f3531;
                c11872.m4223(this.f3532);
                c11872.f3080 = false;
            }
        }
    }
}
