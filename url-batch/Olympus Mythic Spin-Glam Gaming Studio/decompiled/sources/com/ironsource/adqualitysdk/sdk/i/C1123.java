package com.ironsource.adqualitysdk.sdk.i;

import android.app.Activity;
import com.ironsource.adqualitysdk.sdk.StringFog;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ⅱ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C1123 implements InterfaceC1130 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C1086 f2870;

    public C1123(C1086 c1086) {
        this.f2870 = c1086;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static JSONObject m4409(C1123 c1123, Activity activity) {
        c1123.getClass();
        JSONObject jsonObjectInit = IronSourceNetworkBridge.jsonObjectInit();
        try {
            jsonObjectInit.put(StringFog.decrypt("p4tdWJRMjQ==\n", "xugpFvUh6JM=\n"), activity.getClass().getName());
        } catch (JSONException unused) {
            AbstractC0580.m4072(StringFog.decrypt("bMmxv7V1hYVe\n", "LafQ08wB7OY=\n"), StringFog.decrypt("FKjoyOQ6UNw1s/TAtntSzDis89PvOl/ZPL8=\n", "Udqap5YaMbg=\n"));
        }
        return jsonObjectInit;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC1130
    /* renamed from: ﾇ, reason: contains not printable characters */
    public final void mo4410(Activity activity) {
        AbstractC1026.m4313(new C1129(this, activity));
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC1130
    /* renamed from: ﾒ, reason: contains not printable characters */
    public final void mo4411(Activity activity) {
        AbstractC1026.m4313(new C1133(this, activity));
    }
}
