package com.ironsource.adqualitysdk.sdk.i;

import android.view.KeyEvent;
import android.view.View;
import org.json.JSONObject;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᴱ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C0975 extends AbstractRunnableC0913 {

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final /* synthetic */ KeyEvent.Callback f2337;

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final /* synthetic */ View f2338;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ JSONObject f2339;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC1156 f2340;

    public C0975(InterfaceC1156 interfaceC1156, JSONObject jSONObject, View view, KeyEvent.Callback callback) {
        this.f2340 = interfaceC1156;
        this.f2339 = jSONObject;
        this.f2338 = view;
        this.f2337 = callback;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0913
    /* renamed from: ﾒ */
    public final void mo3946() {
        this.f2340.mo3971(this.f2339, this.f2338, this.f2337);
    }
}
