package com.ogury.ad.internal;

import android.app.Activity;
import androidx.fragment.app.FragmentActivity;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class va extends a {
    public final /* synthetic */ wa a;

    public va(wa waVar) {
        this.a = waVar;
    }

    @Override // com.ogury.ad.internal.a, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (activity instanceof FragmentActivity) {
            wa waVar = this.a;
            FragmentActivity fragmentActivity = (FragmentActivity) activity;
            fragmentActivity.getSupportFragmentManager().unregisterFragmentLifecycleCallbacks(waVar.e);
            fragmentActivity.getSupportFragmentManager().removeOnBackStackChangedListener(waVar.f);
            waVar.a.a();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (activity instanceof FragmentActivity) {
            wa waVar = this.a;
            FragmentActivity fragmentActivity = (FragmentActivity) activity;
            waVar.c = fragmentActivity;
            fragmentActivity.getSupportFragmentManager().registerFragmentLifecycleCallbacks(waVar.e, true);
            fragmentActivity.getSupportFragmentManager().addOnBackStackChangedListener(waVar.f);
        }
    }
}
