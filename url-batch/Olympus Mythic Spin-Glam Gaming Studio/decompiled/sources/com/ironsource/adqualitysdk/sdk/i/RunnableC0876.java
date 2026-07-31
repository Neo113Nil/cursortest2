package com.ironsource.adqualitysdk.sdk.i;

import android.webkit.WebView;
import java.util.ArrayList;
import org.json.JSONObject;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᔂ, reason: contains not printable characters */
/* loaded from: classes9.dex */
public final class RunnableC0876 implements Runnable {

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC0872 f2115;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ JSONObject f2116;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ ArrayList f2117;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ Object f2118;

    public RunnableC0876(AbstractC0872 abstractC0872, Object obj, ArrayList arrayList, JSONObject jSONObject) {
        this.f2115 = abstractC0872;
        this.f2118 = obj;
        this.f2117 = arrayList;
        this.f2116 = jSONObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f2115.m4225(this.f2118, this.f2117);
        AbstractC0872.m4222(this.f2115, this.f2116, (WebView) this.f2117.get(0), this.f2118);
    }
}
