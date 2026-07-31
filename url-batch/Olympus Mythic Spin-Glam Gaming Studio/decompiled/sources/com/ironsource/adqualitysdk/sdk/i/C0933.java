package com.ironsource.adqualitysdk.sdk.i;

import com.unity3d.services.core.webview.WebViewApp;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᗮ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C0933 implements InterfaceC0595 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C1011 f2230;

    public C0933(C1011 c1011) {
        this.f2230 = c1011;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0595
    /* renamed from: ﾒ */
    public final Object mo3938(ArrayList arrayList, C1189 c1189) {
        C1011 c1011 = this.f2230;
        Object obj = arrayList.get(0);
        c1011.getClass();
        return new C1168(c1011, (WebViewApp) obj, c1189);
    }
}
