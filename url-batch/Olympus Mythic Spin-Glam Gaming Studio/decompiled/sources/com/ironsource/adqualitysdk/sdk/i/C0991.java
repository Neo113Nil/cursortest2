package com.ironsource.adqualitysdk.sdk.i;

import android.view.KeyEvent;
import android.view.View;
import org.json.JSONObject;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᵁ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0991 extends AbstractRunnableC0913 {

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final /* synthetic */ KeyEvent.Callback f2368;

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final /* synthetic */ View f2369;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ JSONObject f2370;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC1156 f2371;

    public C0991(InterfaceC1156 interfaceC1156, JSONObject jSONObject, View view, KeyEvent.Callback callback) {
        this.f2371 = interfaceC1156;
        this.f2370 = jSONObject;
        this.f2369 = view;
        this.f2368 = callback;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0913
    /* renamed from: ﾒ */
    public final void mo3946() {
        this.f2371.mo3978(this.f2370, this.f2369, this.f2368);
    }
}
