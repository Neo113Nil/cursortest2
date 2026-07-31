package com.ironsource.adqualitysdk.sdk.i;

import android.view.KeyEvent;
import android.view.View;
import org.json.JSONObject;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᴖ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C0959 extends AbstractRunnableC0913 {

    /* renamed from: ﻏ, reason: contains not printable characters */
    public final /* synthetic */ KeyEvent.Callback f2288;

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final /* synthetic */ C0497 f2289;

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final /* synthetic */ View f2290;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ JSONObject f2291;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC1156 f2292;

    public C0959(InterfaceC1156 interfaceC1156, JSONObject jSONObject, View view, C0497 c0497, KeyEvent.Callback callback) {
        this.f2292 = interfaceC1156;
        this.f2291 = jSONObject;
        this.f2290 = view;
        this.f2289 = c0497;
        this.f2288 = callback;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0913
    /* renamed from: ﾒ */
    public final void mo3946() {
        this.f2292.mo3982(this.f2291, this.f2290, this.f2289, this.f2288);
    }
}
