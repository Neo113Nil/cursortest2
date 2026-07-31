package com.ironsource.adqualitysdk.sdk.i;

import android.app.Activity;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ڕ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C0664 extends AbstractC0772 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0654 f1417;

    public C0664(C0654 c0654) {
        this.f1417 = c0654;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0772, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        AbstractC1026.m4316(new C0669(this));
    }
}
