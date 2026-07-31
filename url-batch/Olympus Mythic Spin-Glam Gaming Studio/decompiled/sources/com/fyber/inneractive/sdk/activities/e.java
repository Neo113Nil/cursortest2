package com.fyber.inneractive.sdk.activities;

import android.view.View;
import com.fyber.inneractive.sdk.util.r;

/* loaded from: classes6.dex */
public final class e implements View.OnSystemUiVisibilityChangeListener {
    public final /* synthetic */ InneractiveFullscreenAdActivity a;

    public e(InneractiveFullscreenAdActivity inneractiveFullscreenAdActivity) {
        this.a = inneractiveFullscreenAdActivity;
    }

    @Override // android.view.View.OnSystemUiVisibilityChangeListener
    public final void onSystemUiVisibilityChange(int i) {
        if ((i & 2) == 0) {
            r.b.postDelayed(this.a.mHideNavigationBarTask, 3000L);
        }
    }
}
