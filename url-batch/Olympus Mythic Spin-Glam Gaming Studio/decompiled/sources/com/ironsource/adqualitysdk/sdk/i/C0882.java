package com.ironsource.adqualitysdk.sdk.i;

import com.unity3d.services.core.webview.WebViewApp;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᔈ, reason: contains not printable characters */
/* loaded from: classes9.dex */
public final class C0882 implements InterfaceC0595 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C1011 f2148;

    public C0882(C1011 c1011) {
        this.f2148 = c1011;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0595
    /* renamed from: ﾒ */
    public final Object mo3938(ArrayList arrayList, C1189 c1189) {
        C1011 c1011 = this.f2148;
        Object obj = arrayList.get(0);
        c1011.getClass();
        WebViewApp.setCurrentApp((C1168) obj);
        return null;
    }
}
