package com.ironsource.adqualitysdk.sdk.i;

import android.app.Activity;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ﭴ, reason: contains not printable characters */
/* loaded from: classes11.dex */
public final class C1208 extends AbstractRunnableC0913 {

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ C1187 f3177;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ Activity f3178;

    public C1208(C1187 c1187, Activity activity) {
        this.f3177 = c1187;
        this.f3178 = activity;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0913
    /* renamed from: ﾒ */
    public final void mo3946() {
        if (C1187.m4448(this.f3177, this.f3178)) {
            AbstractC1026.m4316(new C1209(this));
            C1187 c1187 = this.f3177;
            if (c1187.f3079 && !c1187.f3078 && this.f3178.isFinishing()) {
                C1187 c11872 = this.f3177;
                c11872.m4223(this.f3178);
                c11872.f3080 = false;
            }
        }
    }
}
