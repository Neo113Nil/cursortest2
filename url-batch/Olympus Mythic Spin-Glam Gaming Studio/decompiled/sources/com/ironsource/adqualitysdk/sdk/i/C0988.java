package com.ironsource.adqualitysdk.sdk.i;

import android.view.KeyEvent;
import android.view.View;
import org.json.JSONObject;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᴾ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0988 extends AbstractRunnableC0913 {

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final /* synthetic */ KeyEvent.Callback f2362;

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final /* synthetic */ View f2363;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ JSONObject f2364;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC1156 f2365;

    public C0988(InterfaceC1156 interfaceC1156, JSONObject jSONObject, View view, KeyEvent.Callback callback) {
        this.f2365 = interfaceC1156;
        this.f2364 = jSONObject;
        this.f2363 = view;
        this.f2362 = callback;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0913
    /* renamed from: ﾒ */
    public final void mo3946() {
        this.f2365.mo3975(this.f2364, this.f2363, this.f2362);
    }
}
