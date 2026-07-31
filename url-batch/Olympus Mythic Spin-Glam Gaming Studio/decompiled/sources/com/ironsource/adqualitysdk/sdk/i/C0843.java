package com.ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import org.json.JSONException;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᓑ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0843 implements InterfaceC1153 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0839 f2066;

    public C0843(C0839 c0839) {
        this.f2066 = c0839;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC1153
    /* renamed from: ﾒ, reason: contains not printable characters */
    public final void mo4217(String str) {
        C0839 c0839 = this.f2066;
        c0839.getClass();
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            c0839.f2054 = IronSourceNetworkBridge.jsonObjectInit(str);
        } catch (JSONException unused) {
        }
    }
}
