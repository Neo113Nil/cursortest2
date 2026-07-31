package com.fyber.inneractive.sdk.activities;

import android.window.OnBackInvokedCallback;

/* loaded from: classes6.dex */
public final class b implements OnBackInvokedCallback {
    public final /* synthetic */ InneractiveBaseActivity a;

    public b(InneractiveBaseActivity inneractiveBaseActivity) {
        this.a = inneractiveBaseActivity;
    }

    public final void onBackInvoked() {
        this.a.onBackPressed();
    }
}
