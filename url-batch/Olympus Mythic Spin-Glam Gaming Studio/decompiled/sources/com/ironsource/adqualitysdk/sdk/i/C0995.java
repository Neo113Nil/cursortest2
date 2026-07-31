package com.ironsource.adqualitysdk.sdk.i;

import android.view.KeyEvent;
import android.view.View;
import org.json.JSONObject;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᵅ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0995 extends AbstractRunnableC0913 {

    /* renamed from: ﻏ, reason: contains not printable characters */
    public final /* synthetic */ KeyEvent.Callback f2417;

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC0488 f2418;

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final /* synthetic */ View f2419;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ JSONObject f2420;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC1156 f2421;

    public C0995(InterfaceC1156 interfaceC1156, JSONObject jSONObject, View view, InterfaceC0488 interfaceC0488, KeyEvent.Callback callback) {
        this.f2421 = interfaceC1156;
        this.f2420 = jSONObject;
        this.f2419 = view;
        this.f2418 = interfaceC0488;
        this.f2417 = callback;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0913
    /* renamed from: ﾒ */
    public final void mo3946() {
        this.f2421.mo3981(this.f2420, this.f2419, this.f2418, this.f2417);
    }
}
