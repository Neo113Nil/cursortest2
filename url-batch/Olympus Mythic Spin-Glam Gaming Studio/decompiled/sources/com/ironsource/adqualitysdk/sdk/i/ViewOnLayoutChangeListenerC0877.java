package com.ironsource.adqualitysdk.sdk.i;

import android.view.View;
import android.webkit.WebView;
import com.ironsource.adqualitysdk.sdk.StringFog;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᔃ, reason: contains not printable characters */
/* loaded from: classes9.dex */
public final class ViewOnLayoutChangeListenerC0877 implements View.OnLayoutChangeListener {

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC0872 f2119;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ Object f2120;

    public ViewOnLayoutChangeListenerC0877(AbstractC0872 abstractC0872, Object obj) {
        this.f2119 = abstractC0872;
        this.f2120 = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        try {
            ArrayList arrayList = new ArrayList();
            this.f2119.mo3968(this.f2120, arrayList);
            if (arrayList.isEmpty()) {
                return;
            }
            View mo3966 = this.f2119.mo3966(this.f2120);
            if (mo3966 != null && !this.f2119.f2098.f2108) {
                mo3966.removeOnLayoutChangeListener(this);
            }
            this.f2119.m4225(this.f2120, arrayList);
            this.f2119.mo3983(IronSourceNetworkBridge.jsonObjectInit(), (WebView) arrayList.get(0), this.f2120);
        } catch (Throwable th) {
            AbstractC0577.m4068(StringFog.decrypt("RAKyNE6f3oBnGZ88dZ3CgW4SrA==\n", "AnfeWD38rOU=\n"), StringFog.decrypt("Ym7aL4ia2fMHc8YMm8Pf6FNfwCGU3dU=\n", "JxyoQPq6sJ0=\n"), th, false);
        }
    }
}
