package com.ironsource.adqualitysdk.sdk.i;

import android.view.View;
import com.ironsource.adqualitysdk.sdk.StringFog;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ˡ, reason: contains not printable characters */
/* loaded from: classes10.dex */
public final class ViewOnLayoutChangeListenerC0492 implements View.OnLayoutChangeListener {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C1244 f434;

    public ViewOnLayoutChangeListenerC0492(C1244 c1244) {
        this.f434 = c1244;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        try {
            this.f434.m4496(view);
        } catch (Throwable th) {
            AbstractC0577.m4068(StringFog.decrypt("30WA/M2PdsLoQoHn6Zk=\n", "iSzli4zrBYo=\n"), StringFog.decrypt("xFzRV4lshLGhQc10mjWCqvVty1mVK4g=\n", "gS6jOPtM7d8=\n"), th, false);
        }
    }
}
