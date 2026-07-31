package com.ironsource.adqualitysdk.sdk.i;

import android.webkit.WebView;
import com.ironsource.adqualitysdk.sdk.StringFog;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import java.lang.ref.WeakReference;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ʾ, reason: contains not printable characters */
/* loaded from: classes12.dex */
public final class C0475 extends AbstractRunnableC0913 {

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final /* synthetic */ C1091 f368;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ Object f369;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ String f370;

    public C0475(C1091 c1091, String str, Object obj) {
        this.f368 = c1091;
        this.f370 = str;
        this.f369 = obj;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0913
    /* renamed from: ﾒ */
    public final void mo3946() {
        WeakReference weakReference;
        JSONObject jsonObjectInit = IronSourceNetworkBridge.jsonObjectInit();
        try {
            jsonObjectInit.put(AbstractC1183.f3052, this.f368.f2778);
            jsonObjectInit.put(AbstractC1183.f3051, StringFog.decrypt("vBp8\n", "y2wff0tMhkU=\n"));
            jsonObjectInit.put(AbstractC1183.f3063, this.f370);
            if (this.f368.f2777) {
                jsonObjectInit.put(AbstractC1183.f3062, true);
            }
        } catch (JSONException e) {
            AbstractC0580.m4072(StringFog.decrypt("BLu9/jVqxeo3lr7GOGPX2Q==\n", "U97fqFwPsqs=\n"), StringFog.decrypt("waytrzklOSThv6upJWJ6Nei3vKtrbyk56uT/\n", "hN7fwEsFWlY=\n") + e.getLocalizedMessage());
        }
        C1091 c1091 = this.f368;
        AbstractViewOnLayoutChangeListenerC0474 abstractViewOnLayoutChangeListenerC0474 = c1091.f2776.f441;
        WebView webView = c1091.f2779;
        C4554e c4554e = abstractViewOnLayoutChangeListenerC0474.f363;
        abstractViewOnLayoutChangeListenerC0474.mo3981(jsonObjectInit, webView, (c4554e == null || (weakReference = c4554e.f145.f430) == null) ? null : (InterfaceC0488) weakReference.get(), this.f369);
    }
}
