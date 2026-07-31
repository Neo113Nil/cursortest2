package com.ironsource.adqualitysdk.sdk.i;

import android.view.KeyEvent;
import android.view.View;
import org.json.JSONObject;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᴬ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C0971 extends AbstractRunnableC0913 {

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final /* synthetic */ KeyEvent.Callback f2324;

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final /* synthetic */ View f2325;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ JSONObject f2326;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC1156 f2327;

    public C0971(InterfaceC1156 interfaceC1156, JSONObject jSONObject, View view, KeyEvent.Callback callback) {
        this.f2327 = interfaceC1156;
        this.f2326 = jSONObject;
        this.f2325 = view;
        this.f2324 = callback;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0913
    /* renamed from: ﾒ */
    public final void mo3946() {
        this.f2327.mo3983(this.f2326, this.f2325, this.f2324);
    }
}
