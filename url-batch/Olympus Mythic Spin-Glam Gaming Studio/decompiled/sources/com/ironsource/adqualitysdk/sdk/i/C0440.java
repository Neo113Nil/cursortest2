package com.ironsource.adqualitysdk.sdk.i;

import android.view.View;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ɽ, reason: contains not printable characters */
/* loaded from: classes12.dex */
public final class C0440 extends AbstractRunnableC0913 {

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final /* synthetic */ C0363 f309;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ View f310;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ ViewOnClickListenerC0408 f311;

    public C0440(C0363 c0363, ViewOnClickListenerC0408 viewOnClickListenerC0408, View view) {
        this.f309 = c0363;
        this.f311 = viewOnClickListenerC0408;
        this.f310 = view;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0913
    /* renamed from: ﾒ */
    public final void mo3946() {
        this.f309.f180.mo3990(this.f311, this.f310);
    }
}
