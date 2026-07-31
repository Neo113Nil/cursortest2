package com.ironsource.adqualitysdk.sdk.i;

import android.app.Activity;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ﭤ, reason: contains not printable characters */
/* loaded from: classes10.dex */
public final class C1204 extends AbstractC0772 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0880 f3133;

    public C1204(C0880 c0880) {
        this.f3133 = c0880;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0772, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        C0880 c0880 = this.f3133;
        c0880.m4238(AbstractC1183.f3031, C0880.m4227(c0880, activity));
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0772, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        C0880 c0880 = this.f3133;
        c0880.m4238(AbstractC1183.f3030, C0880.m4227(c0880, activity));
    }
}
