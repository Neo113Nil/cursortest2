package com.ironsource.adqualitysdk.sdk.i;

import android.view.View;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ˇ, reason: contains not printable characters */
/* loaded from: classes12.dex */
public final class C0480 implements q {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C1244 f379;

    public C0480(C1244 c1244) {
        this.f379 = c1244;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.q
    /* renamed from: ﾇ */
    public final void mo3962(View view) {
        view.removeOnLayoutChangeListener(this.f379.f3255);
        this.f379.f3252.remove(view);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.q
    /* renamed from: ﾒ */
    public final void mo3963(View view) {
        view.addOnLayoutChangeListener(this.f379.f3255);
        C1244 c1244 = this.f379;
        c1244.f3252.put(view, c1244.f3255);
    }
}
