package com.ironsource.adqualitysdk.sdk.i;

import android.view.KeyEvent;
import android.view.View;
import org.json.JSONObject;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᵃ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0993 extends AbstractRunnableC0913 {

    /* renamed from: ﻏ, reason: contains not printable characters */
    public final /* synthetic */ KeyEvent.Callback f2373;

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC0488 f2374;

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final /* synthetic */ View f2375;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ JSONObject f2376;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC1156 f2377;

    public C0993(InterfaceC1156 interfaceC1156, JSONObject jSONObject, View view, InterfaceC0488 interfaceC0488, KeyEvent.Callback callback) {
        this.f2377 = interfaceC1156;
        this.f2376 = jSONObject;
        this.f2375 = view;
        this.f2374 = interfaceC0488;
        this.f2373 = callback;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0913
    /* renamed from: ﾒ */
    public final void mo3946() {
        this.f2377.mo3977(this.f2376, this.f2375, this.f2374, this.f2373);
    }
}
