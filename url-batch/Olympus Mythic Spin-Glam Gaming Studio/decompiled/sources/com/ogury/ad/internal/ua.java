package com.ogury.ad.internal;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class ua extends FragmentManager.FragmentLifecycleCallbacks {
    public final /* synthetic */ wa a;

    public ua(wa waVar) {
        this.a = waVar;
    }

    @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
    public final void onFragmentPaused(FragmentManager fm, Fragment f) {
        Intrinsics.checkNotNullParameter(fm, "fm");
        Intrinsics.checkNotNullParameter(f, "f");
        FragmentActivity activity = f.getActivity();
        FragmentManager supportFragmentManager = activity != null ? activity.getSupportFragmentManager() : null;
        if (supportFragmentManager != null) {
            this.a.a(supportFragmentManager);
        }
    }

    @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
    public final void onFragmentResumed(FragmentManager fm, Fragment f) {
        Intrinsics.checkNotNullParameter(fm, "fm");
        Intrinsics.checkNotNullParameter(f, "f");
        FragmentActivity activity = f.getActivity();
        FragmentManager supportFragmentManager = activity != null ? activity.getSupportFragmentManager() : null;
        if (supportFragmentManager != null) {
            this.a.a(supportFragmentManager);
        }
    }
}
