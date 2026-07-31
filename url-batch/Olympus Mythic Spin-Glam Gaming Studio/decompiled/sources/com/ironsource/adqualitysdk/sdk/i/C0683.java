package com.ironsource.adqualitysdk.sdk.i;

import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ܕ, reason: contains not printable characters */
/* loaded from: classes14.dex */
public final class C0683 extends AbstractRunnableC0913 {

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final /* synthetic */ ViewOnAttachStateChangeListenerC0679 f1496;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ ArrayList f1497;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ C1064 f1498;

    public C0683(ViewOnAttachStateChangeListenerC0679 viewOnAttachStateChangeListenerC0679, C1064 c1064, ArrayList arrayList) {
        this.f1496 = viewOnAttachStateChangeListenerC0679;
        this.f1498 = c1064;
        this.f1497 = arrayList;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0913
    /* renamed from: ﾒ */
    public final void mo3946() {
        C1064 c1064 = this.f1498;
        ViewOnAttachStateChangeListenerC0679 viewOnAttachStateChangeListenerC0679 = this.f1496;
        c1064.m4337(viewOnAttachStateChangeListenerC0679.f1488, viewOnAttachStateChangeListenerC0679.f1487, this.f1497);
    }
}
