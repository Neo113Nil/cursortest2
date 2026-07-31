package com.ogury.ad.internal;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.pubmatic.sdk.common.POBCommonConstants;
import java.util.Locale;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class h8 implements x7 {
    public final e8 a;
    public k6 b;
    public l6 c;
    public final String[] d;

    public h8(e8 browser, f8 multiWebViewCommandExecutor) {
        Intrinsics.checkNotNullParameter(browser, "browser");
        Intrinsics.checkNotNullParameter(multiWebViewCommandExecutor, "multiWebViewCommandExecutor");
        this.a = browser;
        this.d = new String[]{"ogyCreateWebView", "ogyUpdateWebView", "ogyCloseWebView", "ogyNavigateBack", "ogyNavigateForward"};
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.ogury.ad.internal.x7
    public final boolean a(String url, y7 webView, b ad) {
        NetworkInfo networkInfo;
        y7 mraidWebView;
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(webView, "webView");
        Intrinsics.checkNotNullParameter(ad, "ad");
        Intrinsics.checkNotNullParameter(url, "<this>");
        Locale US = Locale.US;
        Intrinsics.checkNotNullExpressionValue(US, "US");
        String lowerCase = url.toLowerCase(US);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        if (!StringsKt.startsWith$default(lowerCase, "http://ogymraid", false, 2, (Object) null) && !StringsKt.startsWith$default(lowerCase, "https://ogymraid", false, 2, (Object) null)) {
            return false;
        }
        JSONObject jSONObject = new JSONObject(gi.a(jh.a(url)));
        String optString = jSONObject.optString("method", "");
        String optString2 = jSONObject.optString("callbackId", "");
        JSONObject optJSONObject = jSONObject.optJSONObject("args");
        if (optJSONObject == null) {
            optJSONObject = new JSONObject();
        }
        Intrinsics.checkNotNull(optString);
        Intrinsics.checkNotNull(optString2);
        switch (optString.hashCode()) {
            case -1797727422:
                if (optString.equals("ogyCloseWebView")) {
                    String webViewName = optJSONObject.optString("webViewId", "");
                    e8 e8Var = this.a;
                    Intrinsics.checkNotNull(webViewName);
                    Intrinsics.checkNotNullParameter(webViewName, "webViewName");
                    y7 webView2 = (y7) e8Var.b.get(webViewName);
                    if (webView2 != null) {
                        e8Var.a(webViewName, ob.A);
                        v1 v1Var = e8Var.d;
                        Intrinsics.checkNotNullParameter(webView2, "webView");
                        v1Var.b.removeView(webView2);
                        e8Var.a(webViewName, ob.B);
                    }
                    e8Var.b.remove(webViewName);
                    e8Var.c.remove(webViewName);
                    f8.a(webView, optString2, webViewName);
                    break;
                }
                break;
            case -1244773540:
                if (optString.equals("ogyCreateWebView")) {
                    Context context = webView.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                    Intrinsics.checkNotNullParameter(context, "context");
                    Intrinsics.checkNotNullParameter(context, "<this>");
                    Intrinsics.checkNotNullParameter(context, "<this>");
                    Intrinsics.checkNotNullParameter(context, "<this>");
                    Intrinsics.checkNotNullParameter("android.permission.ACCESS_NETWORK_STATE", "permission");
                    if (context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0) {
                        Object systemService = context.getSystemService("connectivity");
                        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
                        networkInfo = ((ConnectivityManager) systemService).getActiveNetworkInfo();
                    } else {
                        networkInfo = null;
                    }
                    if (networkInfo != null && networkInfo.isConnected()) {
                        li webViewArgs = mi.a(optJSONObject);
                        e8 e8Var2 = this.a;
                        Intrinsics.checkNotNullParameter(webViewArgs, "webViewArgs");
                        e8Var2.a(webViewArgs.c, ob.y);
                        v1 v1Var2 = e8Var2.d;
                        Intrinsics.checkNotNullParameter(webViewArgs, "webViewArgs");
                        FrameLayout.LayoutParams a = v1.a(webViewArgs, null);
                        y7 a2 = b8.a(v1Var2.a, v1Var2.c);
                        if (a2 == null) {
                            mraidWebView = null;
                        } else {
                            a2.setTag(webViewArgs.c);
                            w1.a(a2);
                            v1Var2.b.addView(a2, a);
                            mraidWebView = a2;
                        }
                        if (mraidWebView != null) {
                            e8Var2.b.put(webViewArgs.c, mraidWebView);
                            e8Var2.c.put(webViewArgs.c, new xi(webViewArgs.h, webViewArgs.i, webViewArgs.a, 56));
                            h8 h8Var = e8Var2.j;
                            if (h8Var == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("multiWebViewUrlHandler");
                                h8Var = null;
                            }
                            g3 g3Var = e8Var2.h;
                            Intrinsics.checkNotNullParameter(mraidWebView, "mraidWebView");
                            Context context2 = g3Var.a;
                            w6 mraidCommandExecutor = mraidWebView.getMraidCommandExecutor();
                            t6 t6Var = g3Var.b;
                            s7 s7Var = s7.a;
                            mraidWebView.setMraidUrlHandler(new f2(new x7[]{h8Var, new j3(context2, mraidCommandExecutor, t6Var, ne.g.a(g3Var.a), new r0(g3Var.a), new q0(g3Var.a))}));
                            mraidWebView.setClientAdapter(new d8(e8Var2, mraidWebView));
                            Intrinsics.checkNotNullParameter(mraidWebView, "<this>");
                            mraidWebView.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
                            mraidWebView.getSettings().setSupportMultipleWindows(true);
                            mraidWebView.setWebChromeClient(new yi());
                            if (webViewArgs.j) {
                                zi.c(mraidWebView);
                                mraidWebView.getSettings().setCacheMode(1);
                            }
                            if (webViewArgs.a.length() > 0) {
                                mraidWebView.loadUrl(webViewArgs.a);
                            } else {
                                mraidWebView.loadDataWithBaseURL(e8Var2.a.i, webViewArgs.b, POBCommonConstants.CONTENT_TYPE_HTML, "UTF-8", null);
                            }
                            e8Var2.a(webViewArgs.c, ob.z);
                        }
                        f8.a(webView, optString2, webViewArgs.c);
                        k6 k6Var = this.b;
                        if (k6Var != null) {
                            k6Var.mo4828invoke();
                            break;
                        }
                    } else {
                        l6 l6Var = this.c;
                        if (l6Var != null) {
                            l6Var.mo4828invoke();
                            break;
                        }
                    }
                }
                break;
            case -692274449:
                if (optString.equals("ogyUpdateWebView")) {
                    li webViewArgs2 = mi.a(optJSONObject);
                    e8 e8Var3 = this.a;
                    Intrinsics.checkNotNullParameter(webViewArgs2, "webViewArgs");
                    y7 webView3 = (y7) e8Var3.b.get(webViewArgs2.c);
                    if (webView3 != null) {
                        Intrinsics.checkNotNullParameter(webView3, "webView");
                        Intrinsics.checkNotNullParameter(webViewArgs2, "webViewArgs");
                        ViewGroup.LayoutParams layoutParams = webView3.getLayoutParams();
                        webView3.setLayoutParams(v1.a(webViewArgs2, layoutParams instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams : null));
                        if (webViewArgs2.a.length() > 0 || webViewArgs2.b.length() > 0) {
                            if (webViewArgs2.a.length() > 0) {
                                webView3.loadUrl(webViewArgs2.a);
                            } else {
                                webView3.loadDataWithBaseURL(e8Var3.a.i, webViewArgs2.b, POBCommonConstants.CONTENT_TYPE_HTML, "UTF-8", null);
                            }
                        }
                    }
                    f8.a(webView, optString2, webViewArgs2.c);
                    break;
                }
                break;
            case 960350259:
                if (optString.equals("ogyNavigateForward")) {
                    String webViewName2 = optJSONObject.optString("webViewId", "");
                    e8 e8Var4 = this.a;
                    Intrinsics.checkNotNull(webViewName2);
                    Intrinsics.checkNotNullParameter(webViewName2, "webViewName");
                    y7 y7Var = (y7) e8Var4.b.get(webViewName2);
                    if (y7Var != null && y7Var.canGoForward()) {
                        y7Var.goForward();
                        break;
                    }
                }
                break;
            case 1635219001:
                if (optString.equals("ogyNavigateBack")) {
                    String webViewName3 = optJSONObject.optString("webViewId", "");
                    e8 e8Var5 = this.a;
                    Intrinsics.checkNotNull(webViewName3);
                    Intrinsics.checkNotNullParameter(webViewName3, "webViewName");
                    y7 y7Var2 = (y7) e8Var5.b.get(webViewName3);
                    if (y7Var2 != null && y7Var2.canGoBack()) {
                        y7Var2.goBack();
                        break;
                    }
                }
                break;
        }
        return ArraysKt.contains(this.d, optString);
    }
}
