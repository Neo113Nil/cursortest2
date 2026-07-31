package com.ironsource.adqualitysdk.sdk.i;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ﾌ, reason: contains not printable characters */
/* loaded from: classes15.dex */
public final class C1342 implements InterfaceC1166 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC1166 f3695;

    public C1342(InterfaceC1166 interfaceC1166) {
        this.f3695 = interfaceC1166;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC1166
    /* renamed from: ﾒ */
    public final boolean mo3989(ViewOnTouchListenerC1165 viewOnTouchListenerC1165, View view, MotionEvent motionEvent) {
        AbstractC1026.m4313(new C1343(this, viewOnTouchListenerC1165, view, motionEvent));
        return false;
    }
}
