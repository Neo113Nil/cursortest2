package com.ironsource.adqualitysdk.sdk.i;

import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ҫ, reason: contains not printable characters */
/* loaded from: classes9.dex */
public final class C0571 extends AbstractRunnableC0913 {

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final /* synthetic */ C0546 f955;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ JSONObject f956;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ String f957;

    public C0571(C0546 c0546, String str, JSONObject jSONObject) {
        this.f955 = c0546;
        this.f957 = str;
        this.f956 = jSONObject;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0913
    /* renamed from: ﾒ */
    public final void mo3946() {
        C0546 c0546 = this.f955;
        String str = this.f957;
        JSONObject jSONObject = this.f956;
        c0546.getClass();
        Iterator it = new HashSet(c0546.f624).iterator();
        while (it.hasNext()) {
            JSONObject mo4239 = ((InterfaceC1078) it.next()).mo4239(str, jSONObject);
            if (mo4239 != null) {
                AbstractC1006.m4293(jSONObject, mo4239, false);
            }
        }
        JSONObject jsonObjectInit = IronSourceNetworkBridge.jsonObjectInit();
        try {
            String str2 = AbstractC1183.f3069;
            jsonObjectInit.put(str2, jSONObject.remove(str2));
            String str3 = AbstractC1183.f3023;
            jsonObjectInit.put(str3, jSONObject.remove(str3));
        } catch (JSONException unused) {
        }
        c0546.f625.m4389(str, jSONObject, jsonObjectInit, new C0548(c0546, str));
    }
}
