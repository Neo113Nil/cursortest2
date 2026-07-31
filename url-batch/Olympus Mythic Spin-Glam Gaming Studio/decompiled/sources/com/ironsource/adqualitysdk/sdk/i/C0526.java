package com.ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import android.content.Intent;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ϛ, reason: contains not printable characters */
/* loaded from: classes10.dex */
public final class C0526 extends AbstractRunnableC0913 {

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final /* synthetic */ C0518 f525;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ Intent f526;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ Context f527;

    public C0526(C0518 c0518, Context context, Intent intent) {
        this.f525 = c0518;
        this.f527 = context;
        this.f526 = intent;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0913
    /* renamed from: ﾒ */
    public final void mo3946() {
        C0518 c0518 = this.f525;
        c0518.f487.m4337(c0518.f486, c0518.f485, C1284.m4531(c0518.f483, c0518.f484, new Object[]{c0518, this.f527, this.f526}));
    }
}
