package com.ironsource.adqualitysdk.sdk.i;

import android.webkit.WebView;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ʿ, reason: contains not printable characters */
/* loaded from: classes12.dex */
public final class C0476 extends AbstractRunnableC0913 {

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final /* synthetic */ C0497 f371;

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final /* synthetic */ boolean f372;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ String f373;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ WebView f374;

    public C0476(C0497 c0497, WebView webView, String str, boolean z) {
        this.f371 = c0497;
        this.f374 = webView;
        this.f373 = str;
        this.f372 = z;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0913
    /* renamed from: ﾒ */
    public final void mo3946() {
        AbstractViewOnLayoutChangeListenerC0474 abstractViewOnLayoutChangeListenerC0474 = this.f371.f441;
        if (abstractViewOnLayoutChangeListenerC0474.f364) {
            List list = abstractViewOnLayoutChangeListenerC0474.f367;
            if (list == null || list.isEmpty()) {
                C0497 c0497 = this.f371;
                WebView webView = this.f374;
                String str = this.f373;
                boolean z = this.f372;
                c0497.getClass();
                AbstractC1026.m4314(new C1091(c0497, webView, str, z));
                return;
            }
            Iterator it = this.f371.f441.f367.iterator();
            while (it.hasNext()) {
                if (this.f373.startsWith((String) it.next())) {
                    C0497 c04972 = this.f371;
                    WebView webView2 = this.f374;
                    String str2 = this.f373;
                    boolean z2 = this.f372;
                    c04972.getClass();
                    AbstractC1026.m4314(new C1091(c04972, webView2, str2, z2));
                    return;
                }
            }
        }
    }
}
