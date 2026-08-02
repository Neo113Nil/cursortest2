package com.meta.analytics.dsp.uinode;

import android.webkit.WebView;
import com.facebook.ads.AdError;

/* renamed from: com.facebook.ads.redexgen.X.as, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0979as implements C6U {
    public final C00661c A00;
    public final InterfaceC00801q A01;
    public final C01946c A02;
    public final C0889Yn A03;
    public final boolean A04;

    public C0979as(C0889Yn c0889Yn, InterfaceC00801q interfaceC00801q, C01946c c01946c, C00661c c00661c, boolean z) {
        this.A03 = c0889Yn;
        this.A01 = interfaceC00801q;
        this.A02 = c01946c;
        this.A00 = c00661c;
        this.A04 = z;
    }

    private final void A00() {
        WebView webView = new WebView(this.A03);
        webView.getSettings().setCacheMode(1);
        webView.setWebViewClient(new C00811r(this.A00, this.A01, this.A04));
        webView.loadUrl(this.A00.A0E());
    }

    private void A01(boolean z) {
        if (this.A00.A09() == EnumC00671d.A05) {
            A00();
            return;
        }
        String A0E = this.A00.A0E();
        if (z) {
            C01946c c01946c = this.A02;
            String markupUrlResult = this.A00.A0E();
            A0E = c01946c.A0R(markupUrlResult);
        }
        this.A00.A0H(A0E);
        this.A01.ACa();
    }

    @Override // com.meta.analytics.dsp.uinode.C6U
    public final void AB2() {
        if (this.A04) {
            this.A01.ACZ(AdError.CACHE_ERROR);
        } else {
            A01(false);
        }
    }

    @Override // com.meta.analytics.dsp.uinode.C6U
    public final void ABB() {
        A01(true);
    }
}
