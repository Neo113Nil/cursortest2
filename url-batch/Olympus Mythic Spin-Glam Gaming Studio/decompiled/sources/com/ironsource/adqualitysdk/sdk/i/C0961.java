package com.ironsource.adqualitysdk.sdk.i;

import android.app.Activity;
import android.os.Bundle;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᴘ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C0961 extends AbstractC0772 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0945 f2294;

    public C0961(C0945 c0945) {
        this.f2294 = c0945;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0772, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        this.f2294.f2250.removeCallbacksAndMessages(null);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0772, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        this.f2294.f2250.removeCallbacksAndMessages(null);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0772, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        C0945 c0945 = this.f2294;
        c0945.f2250.postDelayed(new C0953(c0945, activity), 500L);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0772, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        C0945 c0945 = this.f2294;
        if (c0945.f2252) {
            c0945.f2252 = false;
            c0945.f2251.mo4410(activity);
        }
        c0945.f2250.removeCallbacksAndMessages(null);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0772, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        this.f2294.f2250.removeCallbacksAndMessages(null);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0772, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        this.f2294.f2250.removeCallbacksAndMessages(null);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0772, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        this.f2294.f2250.removeCallbacksAndMessages(null);
    }
}
