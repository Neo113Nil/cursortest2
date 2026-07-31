package com.ironsource.adqualitysdk.sdk.i;

import android.webkit.WebView;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.WeakHashMap;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.e, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4554e implements InterfaceC0938 {

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static final WeakHashMap f143;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final HashSet f144 = new HashSet();

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final C0487 f145;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final String f146;

    static {
        StringFog.decrypt("xBFm1UPg8bz6B3DmROD0\n", "k3QEgyqFhvA=\n");
        f143 = new WeakHashMap();
    }

    public C4554e(WebView webView, String str) {
        this.f146 = str;
        C0487 c0487 = new C0487(webView);
        this.f145 = c0487;
        m3947();
        new C4553d(this);
        WebView webView2 = (WebView) c0487.f431.get();
        if (webView2 != null) {
            try {
                o.m3954(webView2);
            } catch (Exception e) {
                AbstractC0577.m4068(C0487.f428, StringFog.decrypt("0ianIowXK1fjILwjmRcbV/UXvT+RWilx+z2wI4o=\n", "l1TVTf43TDI=\n"), (Throwable) e, false);
            }
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final void m3947() {
        C0487 c0487 = this.f145;
        C4552c c4552c = new C4552c(this);
        WebView webView = (WebView) c0487.f431.get();
        if (webView != null) {
            try {
                C0777 c0777 = new C0777(o.m3953(webView), c4552c);
                c0487.f430 = new WeakReference(c0777);
                webView.setWebViewClient(c0777);
                c0487.f429 = true;
                return;
            } catch (Exception e) {
                AbstractC0577.m4068(C0487.f428, StringFog.decrypt("GVV8Qi57Fq0oU2dDO3smrT5xZ0grGB2hOUl6\n", "XCcOLVxbccg=\n"), (Throwable) e, false);
            }
        }
        c0487.f429 = false;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0938
    /* renamed from: ﾒ, reason: contains not printable characters */
    public final void mo3948(WebView webView) {
        Iterator it = new HashSet(this.f144).iterator();
        while (it.hasNext()) {
            InterfaceC0938 interfaceC0938 = (InterfaceC0938) it.next();
            if (interfaceC0938 != null) {
                interfaceC0938.mo3948(webView);
            }
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0938
    /* renamed from: ﾒ, reason: contains not printable characters */
    public final void mo3950(WebView webView, String str, String str2) {
        Iterator it = new HashSet(this.f144).iterator();
        while (it.hasNext()) {
            InterfaceC0938 interfaceC0938 = (InterfaceC0938) it.next();
            if (interfaceC0938 != null) {
                interfaceC0938.mo3950(webView, str, str2);
            }
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0938
    /* renamed from: ﾒ, reason: contains not printable characters */
    public final void mo3951(WebView webView, String str, boolean z) {
        Iterator it = new HashSet(this.f144).iterator();
        while (it.hasNext()) {
            InterfaceC0938 interfaceC0938 = (InterfaceC0938) it.next();
            if (interfaceC0938 != null) {
                interfaceC0938.mo3951(webView, str, z);
            }
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0938
    /* renamed from: ﾒ, reason: contains not printable characters */
    public final void mo3949(WebView webView, String str) {
        Iterator it = new HashSet(this.f144).iterator();
        while (it.hasNext()) {
            InterfaceC0938 interfaceC0938 = (InterfaceC0938) it.next();
            if (interfaceC0938 != null) {
                interfaceC0938.mo3949(webView, str);
            }
        }
    }
}
