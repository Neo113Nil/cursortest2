package com.ironsource.adqualitysdk.sdk.i;

import android.view.MotionEvent;
import android.view.View;
import java.util.List;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ċ, reason: contains not printable characters */
/* loaded from: classes13.dex */
public final class C0360 implements InterfaceC1166 {

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final /* synthetic */ C1284 f174;

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final /* synthetic */ List f175;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ C0880 f176;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ C0785 f177;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C1064 f178;

    public C0360(C1284 c1284, C1064 c1064, C0785 c0785, C0880 c0880, List list) {
        this.f174 = c1284;
        this.f178 = c1064;
        this.f177 = c0785;
        this.f176 = c0880;
        this.f175 = list;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC1166
    /* renamed from: ﾒ, reason: contains not printable characters */
    public final boolean mo3989(ViewOnTouchListenerC1165 viewOnTouchListenerC1165, View view, MotionEvent motionEvent) {
        return this.f178.m4337(this.f177, this.f176, C1284.m4531(this.f174, this.f175, new Object[]{this, viewOnTouchListenerC1165, view, motionEvent})).m4250();
    }
}
