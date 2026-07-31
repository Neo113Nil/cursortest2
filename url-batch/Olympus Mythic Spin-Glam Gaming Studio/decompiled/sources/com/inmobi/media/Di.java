package com.inmobi.media;

import android.webkit.WebView;
import android.webkit.WebViewRenderProcess;
import android.webkit.WebViewRenderProcessClient;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes9.dex */
public final class Di extends WebViewRenderProcessClient {
    public final InterfaceC4466x9 a;
    public final Hi b;

    public Di(InterfaceC4466x9 interfaceC4466x9, Hi hi) {
        this.a = interfaceC4466x9;
        this.b = hi;
    }

    public final void onRenderProcessResponsive(WebView view, WebViewRenderProcess webViewRenderProcess) {
        Xh xh;
        Intrinsics.checkNotNullParameter(view, "view");
        InterfaceC4466x9 interfaceC4466x9 = this.a;
        if (interfaceC4466x9 != null) {
            ((C4493y9) interfaceC4466x9).a("RenderViewRenderProcessClient", "onRenderProcessResponsive " + view + " " + webViewRenderProcess);
        }
        Hi hi = this.b;
        if (hi != null) {
            Map a = hi.a();
            a.put("creativeId", hi.a.g);
            int i = hi.e + 1;
            hi.e = i;
            a.put("count", Integer.valueOf(i));
            String a2 = hi.a("RenderProcessResponsive");
            C4425vk c4425vk = C4425vk.a;
            C4425vk.b(a2, a, EnumC4530zk.a);
        }
        InterfaceC4466x9 interfaceC4466x92 = this.a;
        if (interfaceC4466x92 == null || (xh = ((C4493y9) interfaceC4466x92).a) == null) {
            return;
        }
        xh.a();
    }

    public final void onRenderProcessUnresponsive(WebView view, WebViewRenderProcess webViewRenderProcess) {
        Xh xh;
        Intrinsics.checkNotNullParameter(view, "view");
        InterfaceC4466x9 interfaceC4466x9 = this.a;
        if (interfaceC4466x9 != null) {
            ((C4493y9) interfaceC4466x9).a("RenderViewRenderProcessClient", "onRenderProcessUnresponsive " + view + " " + webViewRenderProcess);
        }
        Hi hi = this.b;
        if (hi != null) {
            Map a = hi.a();
            a.put("creativeId", hi.a.g);
            int i = hi.d + 1;
            hi.d = i;
            a.put("count", Integer.valueOf(i));
            String a2 = hi.a("RenderProcessUnResponsive");
            C4425vk c4425vk = C4425vk.a;
            C4425vk.b(a2, a, EnumC4530zk.a);
        }
        InterfaceC4466x9 interfaceC4466x92 = this.a;
        if (interfaceC4466x92 == null || (xh = ((C4493y9) interfaceC4466x92).a) == null) {
            return;
        }
        xh.a();
    }
}
