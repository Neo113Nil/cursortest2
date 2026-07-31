package com.ironsource.adqualitysdk.sdk.i;

import android.webkit.WebView;
import com.ironsource.adqualitysdk.sdk.StringFog;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ͺ, reason: contains not printable characters */
/* loaded from: classes11.dex */
public final class C0497 implements InterfaceC0938 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ AbstractViewOnLayoutChangeListenerC0474 f441;

    public C0497(AbstractViewOnLayoutChangeListenerC0474 abstractViewOnLayoutChangeListenerC0474) {
        this.f441 = abstractViewOnLayoutChangeListenerC0474;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0938
    /* renamed from: ﾒ */
    public final void mo3950(WebView webView, String str, String str2) {
        WeakReference weakReference;
        String substring = str2.substring(0, str2.indexOf(63));
        String substring2 = str2.substring(str2.indexOf(63) + 1);
        if (substring.equals(StringFog.decrypt("P7ueVwUM\n", "TM/8NGRpMb8=\n"))) {
            this.f441.m4011(webView);
            return;
        }
        if (substring.equals(StringFog.decrypt("O3FQeTBj\n", "SAUyGlEBZoA=\n"))) {
            JSONObject m4010 = AbstractViewOnLayoutChangeListenerC0474.m4010(this.f441, substring2);
            AbstractViewOnLayoutChangeListenerC0474 abstractViewOnLayoutChangeListenerC0474 = this.f441;
            abstractViewOnLayoutChangeListenerC0474.mo3975(m4010, webView, abstractViewOnLayoutChangeListenerC0474.mo4009(webView));
            return;
        }
        if (substring.equals(StringFog.decrypt("EFY3MmSp\n", "YyJVUQXIcqA=\n"))) {
            JSONObject m40102 = AbstractViewOnLayoutChangeListenerC0474.m4010(this.f441, substring2);
            AbstractViewOnLayoutChangeListenerC0474 abstractViewOnLayoutChangeListenerC04742 = this.f441;
            C4554e c4554e = abstractViewOnLayoutChangeListenerC04742.f363;
            abstractViewOnLayoutChangeListenerC04742.mo3977(m40102, webView, (c4554e == null || (weakReference = c4554e.f145.f430) == null) ? null : (InterfaceC0488) weakReference.get(), this.f441.mo4009(webView));
            return;
        }
        if (substring.equals(StringFog.decrypt("j3/MpFGW\n", "/AuuxzD160E=\n"))) {
            JSONObject m40103 = AbstractViewOnLayoutChangeListenerC0474.m4010(this.f441, substring2);
            m40103.remove(AbstractC1183.f3064);
            AbstractViewOnLayoutChangeListenerC0474 abstractViewOnLayoutChangeListenerC04743 = this.f441;
            abstractViewOnLayoutChangeListenerC04743.mo3971(m40103, webView, abstractViewOnLayoutChangeListenerC04743.mo4009(webView));
            return;
        }
        if (substring.equals(StringFog.decrypt("fq4zLal/\n", "DdpRTsgbyGg=\n"))) {
            JSONObject m40104 = AbstractViewOnLayoutChangeListenerC0474.m4010(this.f441, substring2);
            try {
                AbstractC0577.m4066(m40104.optString(StringFog.decrypt("lDd1\n", "4FYSjrZwQy4=\n")), m40104.optString(StringFog.decrypt("Bj8iK8A=\n", "Y01PWKf0zGo=\n")), m40104.optString(StringFog.decrypt("SxpvQKTt\n", "LmgML8CIRoE=\n")), m40104.optString(StringFog.decrypt("ZSgyIe8=\n", "AFpBVYTMkDI=\n")));
            } catch (Throwable unused) {
            }
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0938
    /* renamed from: ﾒ */
    public final void mo3951(WebView webView, String str, boolean z) {
        AbstractC1026.m4316(new C0476(this, webView, str, z));
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0938
    /* renamed from: ﾒ */
    public final void mo3948(WebView webView) {
        this.f441.m4011(webView);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0938
    /* renamed from: ﾒ */
    public final void mo3949(WebView webView, String str) {
        try {
            JSONObject jsonObjectInit = IronSourceNetworkBridge.jsonObjectInit();
            jsonObjectInit.put(AbstractC1183.f3060, str);
            jsonObjectInit.put(AbstractC1183.f3059, AbstractC1183.f3058);
            JSONObject jsonObjectInit2 = IronSourceNetworkBridge.jsonObjectInit();
            jsonObjectInit2.put(AbstractC1183.f3061, jsonObjectInit);
            AbstractViewOnLayoutChangeListenerC0474 abstractViewOnLayoutChangeListenerC0474 = this.f441;
            abstractViewOnLayoutChangeListenerC0474.mo3982(jsonObjectInit2, webView, this, abstractViewOnLayoutChangeListenerC0474.mo4009(webView));
        } catch (Exception e) {
            AbstractC0577.m4068(StringFog.decrypt("Mq4KOWhYVYwBgwkBZVFHvw==\n", "ZctobwE9Is0=\n"), StringFog.decrypt("QsKGhipft5Vi0YCANhj0kGTT1IwuGrqTJ9qHhjY=\n", "B7D06Vh/1Oc=\n"), (Throwable) e, false);
        }
    }
}
