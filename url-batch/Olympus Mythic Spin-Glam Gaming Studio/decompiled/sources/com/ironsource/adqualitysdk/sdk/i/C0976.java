package com.ironsource.adqualitysdk.sdk.i;

import android.view.KeyEvent;
import android.view.View;
import org.json.JSONObject;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᴲ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0976 extends AbstractRunnableC0913 {

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final /* synthetic */ KeyEvent.Callback f2341;

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final /* synthetic */ View f2342;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ JSONObject f2343;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC1156 f2344;

    public C0976(InterfaceC1156 interfaceC1156, JSONObject jSONObject, View view, KeyEvent.Callback callback) {
        this.f2344 = interfaceC1156;
        this.f2343 = jSONObject;
        this.f2342 = view;
        this.f2341 = callback;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0913
    /* renamed from: ﾒ */
    public final void mo3946() {
        this.f2344.mo3973(this.f2343, this.f2342, this.f2341);
    }
}
