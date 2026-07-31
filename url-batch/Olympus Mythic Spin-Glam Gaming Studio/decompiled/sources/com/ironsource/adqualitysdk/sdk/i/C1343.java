package com.ironsource.adqualitysdk.sdk.i;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ﾍ, reason: contains not printable characters */
/* loaded from: classes15.dex */
public final class C1343 extends AbstractRunnableC0913 {

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final /* synthetic */ C1342 f3696;

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final /* synthetic */ MotionEvent f3697;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ View f3698;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ ViewOnTouchListenerC1165 f3699;

    public C1343(C1342 c1342, ViewOnTouchListenerC1165 viewOnTouchListenerC1165, View view, MotionEvent motionEvent) {
        this.f3696 = c1342;
        this.f3699 = viewOnTouchListenerC1165;
        this.f3698 = view;
        this.f3697 = motionEvent;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0913
    /* renamed from: ﾒ */
    public final void mo3946() {
        this.f3696.f3695.mo3989(this.f3699, this.f3698, this.f3697);
    }
}
