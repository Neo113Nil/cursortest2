package com.ironsource.adqualitysdk.sdk.i;

import com.tapjoy.TJSplitWebView;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᐢ, reason: contains not printable characters */
/* loaded from: classes11.dex */
public final class C0782 implements InterfaceC0595 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0721 f1828;

    public C0782(C0721 c0721) {
        this.f1828 = c0721;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0595
    /* renamed from: ﾒ */
    public final Object mo3938(ArrayList arrayList, C1189 c1189) {
        C0721 c0721 = this.f1828;
        TJSplitWebView tJSplitWebView = (TJSplitWebView) arrayList.get(0);
        c0721.getClass();
        return tJSplitWebView.getLastUrl();
    }
}
