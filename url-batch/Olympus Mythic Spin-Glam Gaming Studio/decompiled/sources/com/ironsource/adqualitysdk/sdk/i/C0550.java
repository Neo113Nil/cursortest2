package com.ironsource.adqualitysdk.sdk.i;

import android.view.ViewGroup;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.о, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0550 extends AbstractRunnableC0913 {

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final /* synthetic */ ViewOnLayoutChangeListenerC0558 f792;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ C0554 f793;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ ViewGroup f794;

    public C0550(ViewGroup viewGroup, C0554 c0554, ViewOnLayoutChangeListenerC0558 viewOnLayoutChangeListenerC0558) {
        this.f794 = viewGroup;
        this.f793 = c0554;
        this.f792 = viewOnLayoutChangeListenerC0558;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0913
    /* renamed from: ﾒ */
    public final void mo3946() {
        this.f794.addView(this.f793, new ViewGroup.LayoutParams(-1, -1));
        this.f794.removeOnLayoutChangeListener(this.f792);
        this.f794.addOnLayoutChangeListener(this.f792);
    }
}
