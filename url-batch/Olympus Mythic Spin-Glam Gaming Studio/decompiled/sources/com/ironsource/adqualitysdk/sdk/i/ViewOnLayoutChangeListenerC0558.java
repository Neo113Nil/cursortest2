package com.ironsource.adqualitysdk.sdk.i;

import android.view.View;
import android.view.ViewGroup;
import com.ironsource.adqualitysdk.sdk.StringFog;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.э, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class ViewOnLayoutChangeListenerC0558 implements View.OnLayoutChangeListener {

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ C0506 f804;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ ViewGroup f805;

    public ViewOnLayoutChangeListenerC0558(C0506 c0506, ViewGroup viewGroup) {
        this.f804 = c0506;
        this.f805 = viewGroup;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        boolean z;
        C1213 m4452 = C1213.m4452();
        synchronized (m4452) {
            z = m4452.f3198;
        }
        if (z) {
            return;
        }
        try {
            C0506.m4031(this.f804, this.f805, this);
        } catch (Throwable th) {
            AbstractC0577.m4068(StringFog.decrypt("+0oH23l/tnDJRQD1cWCWetJDGup9YZR230M=\n", "vCZouRgT4h8=\n"), StringFog.decrypt("Xr4phns+lIY7ozWlaGeSnW+PM4hneZg=\n", "G8xb6Qke/eg=\n"), th, false);
        }
    }
}
