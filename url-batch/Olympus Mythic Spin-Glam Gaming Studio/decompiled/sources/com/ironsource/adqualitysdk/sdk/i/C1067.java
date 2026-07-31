package com.ironsource.adqualitysdk.sdk.i;

import android.app.Activity;
import android.os.Bundle;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ị, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C1067 extends AbstractC0772 {

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ C0880 f2717;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ ArrayList f2718;

    public C1067(C0880 c0880, ArrayList arrayList) {
        this.f2717 = c0880;
        this.f2718 = arrayList;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0772, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        if (C0880.m4229(this.f2717, activity, this.f2718)) {
            m4358(StringFog.decrypt("N6Zhh4yY4OYssWOWnZDi6jw=\n", "WMgg5Pjxlo8=\n"), Arrays.asList(activity, bundle));
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0772, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        if (C0880.m4229(this.f2717, activity, this.f2718)) {
            m4358(StringFog.decrypt("18qe955XpofM3ZvxmUqigcHBuw==\n", "uKTflOo+0O4=\n"), Collections.singletonList(activity));
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0772, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        if (C0880.m4229(this.f2717, activity, this.f2718)) {
            m4358(StringFog.decrypt("xw6cRML6JOvcGY1Gw+A35g==\n", "qGDdJ7aTUoI=\n"), Collections.singletonList(activity));
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0772, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        if (C0880.m4229(this.f2717, activity, this.f2718)) {
            m4358(StringFog.decrypt("xVqnX1RbbMTeTbRZU0d3yM4=\n", "qjTmPCAyGq0=\n"), Collections.singletonList(activity));
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0772, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        if (C0880.m4229(this.f2717, activity, this.f2718)) {
            m4358(StringFog.decrypt("NZegtMZq0+YugLK2xGbs4SmNgLnRZvb7O42E\n", "Wvnh17IDpY8=\n"), Arrays.asList(activity, bundle));
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0772, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        if (C0880.m4229(this.f2717, activity, this.f2718)) {
            m4358(StringFog.decrypt("3KOmO5boW+jHtLQsg/NZ5Nc=\n", "s83nWOKBLYE=\n"), Collections.singletonList(activity));
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0772, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        if (C0880.m4229(this.f2717, activity, this.f2718)) {
            m4358(StringFog.decrypt("am3jCC/AUDlxevEfNNlWNWE=\n", "BQOia1upJlA=\n"), Collections.singletonList(activity));
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0772, com.ironsource.adqualitysdk.sdk.i.InterfaceC1096
    /* renamed from: ﾇ */
    public final void mo4165(Activity activity) {
        m4358(StringFog.decrypt("CIPf2VaS4kMSn/DMQpTocQif+85Ur/JZAw==\n", "Z+2eqSbAhzc=\n"), Collections.singletonList(activity));
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0772, com.ironsource.adqualitysdk.sdk.i.InterfaceC1096
    /* renamed from: ﾒ */
    public final void mo4166(Activity activity) {
        m4358(StringFog.decrypt("9hSIVPGbqf/tLqZm4Kun9usVvErl\n", "mXrJJIHIzJE=\n"), Collections.singletonList(activity));
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final void m4358(String str, List list) {
        C0880.m4228(this.f2717, AbstractC0584.m4083("AG3/JxfzEMINZ+0rAuMH1yQg\n", "QQ6LTmGaZLs=\n", new StringBuilder(), str), true, false, list);
        AbstractC1026.m4313(new C1137(this, str, list));
    }
}
