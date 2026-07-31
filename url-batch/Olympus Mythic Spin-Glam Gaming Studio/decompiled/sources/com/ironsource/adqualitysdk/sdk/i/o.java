package com.ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import android.os.Build;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public abstract class o {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static final String f157 = StringFog.decrypt("xmeSZhF8qvfla5xD\n", "kQLwMHgZ3aI=\n");

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static boolean f156 = true;

    /* renamed from: ｋ, reason: contains not printable characters */
    public static boolean f155 = true;

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static boolean f154 = true;

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static boolean f153 = false;

    /* renamed from: ﻏ, reason: contains not printable characters */
    public static boolean f152 = false;

    /* renamed from: ﺙ, reason: contains not printable characters */
    public static n f151 = new n();

    /* renamed from: ﱡ, reason: contains not printable characters */
    public static n f150 = new n();

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static WebViewClient m3953(WebView webView) {
        JSONObject jSONObject;
        WebViewClient webViewClient;
        WebViewClient webViewClient2;
        if (Build.VERSION.SDK_INT >= 26) {
            C4555f m3955 = m3955();
            synchronized (m3955) {
                jSONObject = m3955.f2998;
            }
            boolean z = true;
            if (jSONObject.optBoolean(StringFog.decrypt("TKVrvQ==\n", "K9Id3qRYP1o=\n"), true)) {
                Context context = webView.getContext();
                if (f155) {
                    try {
                        f155 = false;
                        WebView webView2 = new WebView(context);
                        C0777 c0777 = new C0777(null, new C4558i());
                        webView2.setWebViewClient(c0777);
                        webViewClient2 = webView2.getWebViewClient();
                        if (c0777 != webViewClient2) {
                            z = false;
                        }
                        f153 = z;
                    } catch (Throwable th) {
                        AbstractC0577.m4068(f157, StringFog.decrypt("fQ8107dOsDpdHizVqwnzO15dNN2oC/MFXR8R1aAZkD5RGCnI\n", "OH1HvMVu01I=\n"), th, false);
                    }
                }
                if (f153) {
                    webViewClient = webView.getWebViewClient();
                    return webViewClient;
                }
            }
        }
        m3959(webView.getContext());
        InterfaceC0858 m3957 = m3957(webView, new l(), f151);
        if (m3957 != null) {
            return (WebViewClient) ((C0658) m3957).m4133();
        }
        throw new RuntimeException(StringFog.decrypt("QNHS8l7u6MYj2M7wXqCY12HozvtNw6PbZtDTvlzpqt5n\n", "A76nnjqAz7I=\n"));
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static synchronized C4555f m3955() {
        C4555f c4555f;
        synchronized (o.class) {
            c4555f = ((C0600) AbstractC0590.m4087()).f1017;
        }
        return c4555f;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static WebChromeClient m3954(WebView webView) {
        JSONObject jSONObject;
        WebChromeClient webChromeClient;
        WebChromeClient webChromeClient2;
        if (Build.VERSION.SDK_INT >= 26) {
            C4555f m3955 = m3955();
            synchronized (m3955) {
                jSONObject = m3955.f2998;
            }
            if (jSONObject.optBoolean(StringFog.decrypt("JkoMzA==\n", "QT1vr7KBWOs=\n"), true)) {
                Context context = webView.getContext();
                if (f154) {
                    f154 = false;
                    WebView webView2 = new WebView(context);
                    C0481 c0481 = new C0481(new j());
                    webView2.setWebChromeClient(c0481);
                    webChromeClient2 = webView2.getWebChromeClient();
                    f152 = c0481 == webChromeClient2;
                }
                if (f152) {
                    webChromeClient = webView.getWebChromeClient();
                    return webChromeClient;
                }
            }
        }
        m3959(webView.getContext());
        InterfaceC0858 m3957 = m3957(webView, new m(), f150);
        if (m3957 != null) {
            return (WebChromeClient) ((C0658) m3957).m4133();
        }
        throw new RuntimeException(StringFog.decrypt("2xzPROiAnK+4FdNG6M7svvow0lrjg96Y9BrfRvjO3bL9H94=\n", "mHO6KIzuu9s=\n"));
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static void m3959(Context context) {
        if (f156) {
            f156 = false;
            try {
                WebView webView = new WebView(context);
                C0777 c0777 = new C0777(null, new C4556g());
                webView.setWebViewClient(c0777);
                C0481 c0481 = new C0481(new C4557h());
                webView.setWebChromeClient(c0481);
                f151 = m3956(webView, c0777, new l());
                f150 = m3956(webView, c0481, new m());
            } catch (Throwable th) {
                AbstractC0577.m4068(f157, StringFog.decrypt("3j14P1UmEr7+LGE5SWFRsPQ9KjlJaBSkuyxmOUJoBaU=\n", "m08KUCcGcdY=\n"), th, false);
            }
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static n m3956(WebView webView, InterfaceC1077 interfaceC1077, InterfaceC0757 interfaceC0757) {
        n nVar = new n();
        C0839 c0839 = m3955().f2997;
        JSONObject jSONObject = c0839.f2054;
        String str = c0839.f2060;
        List list = c0839.f2062;
        String str2 = AbstractC1006.f2436;
        JSONArray optJSONArray = jSONObject.optJSONArray(str);
        if (optJSONArray != null) {
            list = AbstractC1006.m4289(optJSONArray);
        }
        C0839 c08392 = m3955().f2997;
        InterfaceC0858 m3958 = m3958(webView, interfaceC0757, list, c08392.f2054.optInt(c08392.f2059, 7));
        if (m3958 != null) {
            Object m4133 = ((C0658) m3958).m4133();
            if (m4133 == interfaceC1077) {
                nVar.f149 = true;
            } else {
                C0839 c08393 = m3955().f2997;
                JSONObject jSONObject2 = c08393.f2054;
                String str3 = c08393.f2058;
                List list2 = c08393.f2061;
                JSONArray optJSONArray2 = jSONObject2.optJSONArray(str3);
                if (optJSONArray2 != null) {
                    list2 = AbstractC1006.m4289(optJSONArray2);
                }
                C0839 c08394 = m3955().f2997;
                InterfaceC0858 m39582 = m3958(m4133, interfaceC0757, list2, c08394.f2054.optInt(c08394.f2057, 2));
                if (m39582 != null && ((C0658) m39582).m4133() == interfaceC1077) {
                    nVar.f148 = true;
                }
            }
        }
        return nVar;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static InterfaceC0858 m3958(Object obj, InterfaceC0757 interfaceC0757, List list, int i) {
        C0568 c0568 = C0860.m4221().f2085;
        k kVar = new k(list);
        c0568.getClass();
        C0628 c0628 = new C0628();
        C0635 c0635 = c0628.f1265;
        c0635.f1282 = -1;
        c0628.f1264 = interfaceC0757;
        c0628.f1263 = kVar;
        c0635.f1287 = list;
        c0635.f1286 = i;
        c0635.f1289 = interfaceC0757.getClass();
        c0628.f1265.f1288 = k.class;
        return c0568.m4062(obj, c0628);
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static InterfaceC0858 m3957(WebView webView, InterfaceC0757 interfaceC0757, n nVar) {
        Object m4133;
        try {
            if (!nVar.f149 && !nVar.f148) {
                return null;
            }
            C0839 c0839 = m3955().f2997;
            JSONObject jSONObject = c0839.f2054;
            String str = c0839.f2060;
            List list = c0839.f2062;
            String str2 = AbstractC1006.f2436;
            JSONArray optJSONArray = jSONObject.optJSONArray(str);
            if (optJSONArray != null) {
                list = AbstractC1006.m4289(optJSONArray);
            }
            C0839 c08392 = m3955().f2997;
            InterfaceC0858 m3958 = m3958(webView, interfaceC0757, list, c08392.f2054.optInt(c08392.f2059, 7));
            if (nVar.f148 && m3958 != null && (m4133 = ((C0658) m3958).m4133()) != null && !m4133.getClass().equals(((C0658) m3958).f1410.getType())) {
                C0839 c08393 = m3955().f2997;
                JSONObject jSONObject2 = c08393.f2054;
                String str3 = c08393.f2058;
                List list2 = c08393.f2061;
                JSONArray optJSONArray2 = jSONObject2.optJSONArray(str3);
                if (optJSONArray2 != null) {
                    list2 = AbstractC1006.m4289(optJSONArray2);
                }
                C0839 c08394 = m3955().f2997;
                return m3958(m4133, interfaceC0757, list2, c08394.f2054.optInt(c08394.f2057, 2));
            }
            return m3958;
        } catch (Throwable th) {
            AbstractC0577.m4068(f157, StringFog.decrypt("QhTturY2R7BzEva7ozZDuW4D8aHkcEmwawI=\n", "B2af1cQWINU=\n"), th, false);
            return null;
        }
    }
}
