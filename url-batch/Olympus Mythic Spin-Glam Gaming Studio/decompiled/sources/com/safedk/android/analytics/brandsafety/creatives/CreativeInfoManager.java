package com.safedk.android.analytics.brandsafety.creatives;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.android.volley.Response;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.ads.MaxAdView;
import com.ironsource.X3;
import com.pubmatic.sdk.common.POBCommonConstants;
import com.safedk.android.SafeDK;
import com.safedk.android.analytics.brandsafety.BannerFinder;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.InterstitialFinder;
import com.safedk.android.analytics.brandsafety.NativeFinder;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.l;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import com.safedk.android.analytics.brandsafety.m;
import com.safedk.android.analytics.brandsafety.o;
import com.safedk.android.analytics.brandsafety.p;
import com.safedk.android.analytics.brandsafety.v;
import com.safedk.android.analytics.events.BrandSafetyEvent;
import com.safedk.android.analytics.reporters.CrashReporter;
import com.safedk.android.internal.SafeDKSource;
import com.safedk.android.internal.SafeDKSourceMBridge;
import com.safedk.android.internal.SafeDKSourceMintegral;
import com.safedk.android.utils.LinkedHashSetWithItemLimit;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.annotations.AdNetworkDependency;
import com.safedk.android.utils.annotations.SDKDependancy;
import com.safedk.android.utils.n;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import okio.BufferedSource;

/* loaded from: classes13.dex */
public class CreativeInfoManager {
    private static final String A = "ADMOB_BIDDING";
    private static final String B = "ADMOB_NATIVE_NETWORK";
    private static final String C = "GOOGLE_AD_MANAGER_DIRECT_SOLD";
    private static final String D = "MINTEGRAL_NETWORK";
    private static final String E = "MINTEGRAL_BIDDING";
    private static final String F = "MINTEGRAL_NATIVE_BIDDING";
    private static final String G = "FYBER_NETWORK";
    private static final String H = "FYBER_BIDDING";
    private static final String I = "INNERACTIVE_BIDDING";
    private static final String J = "ADCOLONY_NETWORK";
    private static final String K = "ADCOLONY_BIDDING";
    private static final String L = "AMAZON_NETWORK";
    private static final String M = "AMAZON_BIDDING";
    private static final String N = "AMAZON_MARKETPLACE_NETWORK";
    private static final String O = "CHARTBOOST_NETWORK";
    private static final String P = "CHARTBOOST_BIDDING";
    private static final String Q = "GOOGLE_AD_MANAGER_NETWORK";
    private static final String R = "GOOGLE_AD_MANAGER_BIDDING";
    private static final String S = "GOOGLE_AD_MANAGER_NATIVE_NETWORK";
    private static final String T = "INMOBI_NETWORK";
    private static final String U = "INMOBI_BIDDING";
    private static final String V = "INMOBI_NATIVE_BIDDING";
    private static final String W = "MAIO_NETWORK";
    private static final String X = "MAIO_BIDDING";
    private static final String Y = "MYTARGET_NETWORK";
    private static final String Z = "MYTARGET_BIDDING";
    public static final String a = "mime-type";
    private static final String aA = "MOBILEFUSE_BIDDING";
    private static final String aB = "PUBMATIC_BIDDING";
    private static boolean aE = false;
    private static final String aa = "NEND_NETWORK";
    private static final String ab = "NEND_BIDDING";
    private static final String ac = "OGURY_NETWORK";
    private static final String ad = "OGURY_BIDDING";
    private static final String ae = "OGURY_PRESAGE";
    private static final String af = "TIKTOK_NETWORK";
    private static final String ag = "TIKTOK_BIDDING";
    private static final String ah = "TIKTOK_NATIVE_BIDDING";
    private static final String ai = "SMAATO_NETWORK";
    private static final String aj = "SMAATO_BIDDING";
    private static final String ak = "SNAP_NETWORK";
    private static final String al = "SNAP_BIDDING";
    private static final String am = "TAPJOY_NETWORK";
    private static final String an = "TAPJOY_BIDDING";
    private static final String ao = "VERIZON_NETWORK";
    private static final String ap = "VERIZON_BIDDING";
    private static final String aq = "YANDEX_NETWORK";
    private static final String ar = "YANDEX_BIDDING";
    private static final String as = "YANDEX_NATIVE_BIDDING";
    private static final String at = "LINE_NETWORK";
    private static final String au = "LINE_BIDDING";
    private static final String av = "VERVE_NETWORK";
    private static final String aw = "VERVE_BIDDING";
    private static final String ax = "BIDMACHINE_BIDDING";
    private static final String ay = "MOLOCO_BIDDING";
    private static final String az = "MOLOCO_NATIVE_BIDDING";
    public static final String b = "encoding";
    public static final String c = "Content-Type";
    public static final String e = "APPLOVIN_NETWORK";
    public static final String f = "APPLOVIN_EXCHANGE";
    public static final String g = "APPLOVIN_DIRECTSOLD";
    public static final String h = "CUSTOM_NETWORK";
    public static final String i = "/mediate";
    public static final String k = "@!1:ad_fetch@!";
    private static final String m = "CreativeInfoManager";
    private static final String n = "timestamp";
    private static final String o = "urls";
    private static final String s = "IRONSOURCE_NETWORK";
    private static final String t = "IRONSOURCE_BIDDING";
    private static final String u = "VUNGLE_NETWORK";
    private static final String v = "VUNGLE_BIDDING";
    private static final String w = "VUNGLE_NATIVE_BIDDING";
    private static final String x = "UNITY_NETWORK";
    private static final String y = "UNITY_BIDDING";
    private static final String z = "ADMOB_NETWORK";
    private static final List<String> p = new ArrayList();
    private static TreeMap<String, AdNetworkDiscovery> adNetworkDiscoveries = new TreeMap<>();
    private static final Map<String, String> q = new HashMap();
    private static final HashSet<String> r = new HashSet<>();
    public static final Set<String> d = new LinkedHashSetWithItemLimit(10);
    public static final List<String> j = Arrays.asList("ms.applovin.com", "ms.applvn.com", "ms4.applovin.com", "ms4.applvn.com");
    private static final AtomicBoolean aC = new AtomicBoolean(false);
    private static final ExecutorService aD = Executors.newFixedThreadPool(2);
    public static boolean l = false;

    public static HashSet<String> a() {
        return r;
    }

    public static void a(String str, WebView webView, String str2) {
        AdNetworkDiscovery j2 = j(str);
        if (j2 != null && str2 != null && j2.a(str2)) {
            String a2 = BrandSafetyUtils.a((Object) webView);
            if (j2.b(str2)) {
                Logger.d(m, "handle mraid events : video begin for address = ", a2, ", sdk = ", str, ", url = ", str2);
                a(str, a2, false, "mraid-event");
            } else if (j2.c(str2)) {
                Logger.d(m, "handle mraid events : video end for address = ", a2, ", sdk = ", str, ", url = ", str2);
                a(str, a2, true, "mraid-event");
            } else if (j2.d(str2)) {
                Logger.d(m, Logger.FeatureTag.AD_CAPTURE, "handle mraid events : PP detection for address = ", a2, ", sdk = ", str);
                com.safedk.android.analytics.brandsafety.b.a(a2, m.q, new m.a[0]);
                a(str, a2);
            }
        }
    }

    public static void a(String str, String str2) {
        List<CreativeInfo> list;
        List<CreativeInfo> list2;
        if (SafeDK.getInstance() == null) {
            return;
        }
        if (SafeDK.getInstance().z() == null) {
            list = null;
        } else {
            list = SafeDK.getInstance().z().a(str, str2);
        }
        if (SafeDK.getInstance().A() == null) {
            list2 = null;
        } else {
            list2 = SafeDK.getInstance().A().a(str, str2);
        }
        List<CreativeInfo> a2 = SafeDK.getInstance().B() != null ? SafeDK.getInstance().B().a(str, str2) : null;
        if (list != null && !list.isEmpty()) {
            Logger.d(m, "request no sampling by address, calling interstitial method, : address = ", str2);
            b(str, str2);
            return;
        }
        if (list2 != null && !list2.isEmpty()) {
            Logger.d(m, "request no sampling by address, calling banner method, : address = ", str2);
            a(str, BrandSafetyUtils.AdType.BANNER, str2);
        } else if (a2 != null && !a2.isEmpty()) {
            Logger.d(m, "request no sampling by address, calling MREC method, : address = ", str2);
            a(str, BrandSafetyUtils.AdType.MREC, str2);
        } else {
            Logger.d(m, "request no sampling by address, WebView not found, : address = ", str2);
        }
    }

    public static void a(String str) {
        List<CreativeInfo> list;
        List<CreativeInfo> list2;
        List<CreativeInfo> list3;
        if (SafeDK.getInstance() == null) {
            return;
        }
        if (SafeDK.getInstance().z() == null) {
            list = null;
        } else {
            list = SafeDK.getInstance().z().b(str);
        }
        if (SafeDK.getInstance().A() == null) {
            list2 = null;
        } else {
            list2 = SafeDK.getInstance().A().b(str);
        }
        if (SafeDK.getInstance().B() == null) {
            list3 = null;
        } else {
            list3 = SafeDK.getInstance().B().b(str);
        }
        if (list != null && !list.isEmpty()) {
            Logger.d(m, "request no sampling by sdk , calling interstitial method");
            b(str, (String) null);
            return;
        }
        if (list2 != null && !list2.isEmpty()) {
            Logger.d(m, "request no sampling by sdk, calling banner method");
            a(str, BrandSafetyUtils.AdType.BANNER, (String) null);
        } else if (list3 != null && !list3.isEmpty()) {
            Logger.d(m, "request no sampling by sdk, calling MREC method");
            a(str, BrandSafetyUtils.AdType.MREC, (String) null);
        } else {
            Logger.d(m, "request no sampling by sdk, View not found, : sdkPackageName = ", str);
        }
    }

    public static void a(String str, String str2, String str3, Map<String, List<String>> map, c.a aVar) {
        if (!aE || !aC.get()) {
            return;
        }
        Logger.d(m, "handle prefetch started, networkName=", str, ", url=", str2);
        String c2 = c(str);
        if (c2 == null) {
            return;
        }
        if (!i(str2) && !str2.equals("@!1:ad_fetch@!")) {
            return;
        }
        b k2 = k(c2);
        if (k2 != null) {
            if (k2.b(AdNetworkConfiguration.SUPPORTS_PREFETCH_RECEIVING_BY_APPLOVIN)) {
                b(c2, str2, str3, null, map, aVar, null);
                return;
            }
            return;
        }
        Logger.d(m, "handle prefetch sdkPackage does not exist");
    }

    public static void a(String str, String str2, String str3) {
        AdNetworkDiscovery j2 = j(str);
        if (j2 != null) {
            Logger.d(m, "onVideoKeyAndUrlPairCreated started, sdkPackageName = ", str, ", localFileCacheKey = ", str2, ", remoteUrl = ", str3);
            j2.g(str2, str3);
        }
    }

    private static class a {
        ArrayList<String> a = new ArrayList<>();
        long b;

        private a() {
        }
    }

    public static synchronized void b() {
        synchronized (CreativeInfoManager.class) {
            try {
            } finally {
            }
            if (SafeDK.getInstance() != null && SafeDK.getInstance().p()) {
                if (!aC.get()) {
                    Logger.d(m, "initCreativeInfoManager started");
                    c();
                    CreativeInfoManagerInitializer.init(adNetworkDiscoveries);
                    Logger.d(m, "Number of adNetworkDiscoveries classes is ", Integer.valueOf(adNetworkDiscoveries.size()));
                    aC.set(true);
                } else {
                    Logger.d(m, "initCreativeInfoManager already executed, skipping");
                }
            }
        }
    }

    private static void init() {
    }

    public static void c() {
        if (SafeDK.getInstance() == null || !SafeDK.getInstance().p()) {
            return;
        }
        r.add("APPLOVIN_NETWORK");
        r.add("APPLOVIN_EXCHANGE");
        r.add("APPLOVIN_DIRECTSOLD");
        r.add(h);
        q.put("APPLOVIN_NETWORK", com.safedk.android.utils.h.a);
        q.put("APPLOVIN_EXCHANGE", com.safedk.android.utils.h.a);
        q.put("APPLOVIN_DIRECTSOLD", com.safedk.android.utils.h.a);
        q.put(s, com.safedk.android.utils.h.f);
        q.put(t, com.safedk.android.utils.h.f);
        q.put(u, com.safedk.android.utils.h.d);
        q.put(v, com.safedk.android.utils.h.d);
        q.put(w, com.safedk.android.utils.h.d);
        q.put(x, "com.unity3d.ads");
        q.put(y, "com.unity3d.ads");
        q.put(z, com.safedk.android.utils.h.h);
        q.put(A, com.safedk.android.utils.h.h);
        q.put(B, com.safedk.android.utils.h.h);
        q.put(C, com.safedk.android.utils.h.h);
        q.put(D, com.safedk.android.utils.h.o);
        q.put(E, com.safedk.android.utils.h.o);
        q.put(F, com.safedk.android.utils.h.o);
        q.put(G, com.safedk.android.utils.h.p);
        q.put(H, com.safedk.android.utils.h.p);
        q.put(I, com.safedk.android.utils.h.p);
        q.put(J, com.safedk.android.utils.h.b);
        q.put(K, com.safedk.android.utils.h.b);
        q.put(O, com.safedk.android.utils.h.c);
        q.put(P, com.safedk.android.utils.h.c);
        q.put(Q, com.safedk.android.utils.h.h);
        q.put(R, com.safedk.android.utils.h.h);
        q.put(S, com.safedk.android.utils.h.h);
        q.put(T, com.safedk.android.utils.h.i);
        q.put(U, com.safedk.android.utils.h.i);
        q.put(V, com.safedk.android.utils.h.i);
        q.put(W, com.safedk.android.utils.h.q);
        q.put(X, com.safedk.android.utils.h.q);
        q.put(Y, com.safedk.android.utils.h.r);
        q.put(Z, com.safedk.android.utils.h.r);
        q.put(aa, com.safedk.android.utils.h.s);
        q.put(ab, com.safedk.android.utils.h.s);
        q.put(ac, com.safedk.android.utils.h.t);
        q.put(ad, com.safedk.android.utils.h.t);
        q.put(ae, com.safedk.android.utils.h.t);
        q.put(af, com.safedk.android.utils.h.u);
        q.put(ag, com.safedk.android.utils.h.u);
        q.put(ah, com.safedk.android.utils.h.u);
        q.put(ai, com.safedk.android.utils.h.v);
        q.put(aj, com.safedk.android.utils.h.v);
        q.put(ak, com.safedk.android.utils.h.w);
        q.put(al, com.safedk.android.utils.h.w);
        q.put(am, com.safedk.android.utils.h.j);
        q.put(an, com.safedk.android.utils.h.j);
        q.put(ao, com.safedk.android.utils.h.x);
        q.put(ap, com.safedk.android.utils.h.x);
        q.put(aq, com.safedk.android.utils.h.y);
        q.put(ar, com.safedk.android.utils.h.y);
        q.put(as, com.safedk.android.utils.h.y);
        q.put(at, "com.five_corp.ad");
        q.put(au, "com.five_corp.ad");
        q.put(L, com.safedk.android.utils.h.A);
        q.put(M, com.safedk.android.utils.h.A);
        q.put(N, com.safedk.android.utils.h.A);
        q.put(av, com.safedk.android.utils.h.C);
        q.put(aw, com.safedk.android.utils.h.C);
        q.put(ax, "io.bidmachine");
        q.put(ay, com.safedk.android.utils.h.D);
        q.put(az, com.safedk.android.utils.h.D);
        q.put(aA, com.safedk.android.utils.h.E);
        q.put(aB, com.safedk.android.utils.h.F);
    }

    public static AdNetworkDiscovery.WebViewResourceMatchingMethod b(String str) {
        AdNetworkDiscovery adNetworkDiscovery = adNetworkDiscoveries.get(str);
        if (adNetworkDiscovery == null) {
            return null;
        }
        return adNetworkDiscovery.b();
    }

    public static String c(String str) {
        String str2 = q.get(str);
        if (!TextUtils.isEmpty(str2)) {
            return str2;
        }
        return null;
    }

    public static void a(boolean z2) {
        aE = z2;
        Logger.d(m, "setting active mode to ", Boolean.valueOf(z2));
    }

    private static WebResourceResponse a(String str, WebView webView, String str2, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        Logger.d(m, "on webView response helper - sdk= ", str, ",   webview=", webView, ",   url= ", str2, ",   webResourceRequest= ", webResourceRequest, ",    response= ", webResourceResponse);
        if (Build.VERSION.SDK_INT >= 21 && TextUtils.isEmpty(str2) && webResourceRequest != null && webResourceRequest.getUrl() != null) {
            str2 = webResourceRequest.getUrl().toString();
            Logger.d(m, "on webView response helper - url updated to= ", str2);
        }
        if (!TextUtils.isEmpty(str2)) {
            Logger.d(m, "on webView response helper - calling follow webview response if needed, sdk= ", str, ",   url= ", str2);
            webResourceResponse = a(str, webView, str2, webResourceResponse);
        }
        if (webResourceRequest != null) {
            a(str, webView, webResourceRequest, str2);
        }
        AdNetworkDiscovery j2 = j(str);
        if (j2 != null) {
            j2.b(webView, str2);
        }
        return webResourceResponse;
    }

    public static WebResourceResponse onWebViewResponse(String sdkPackageName, WebView webView, String url, WebResourceResponse response) {
        try {
            Logger.d(m, "on webView response ", sdkPackageName, ", webview ", webView, ", url ", url, ", isOnUiThread = ", Boolean.valueOf(n.c()));
            if (aE && aC.get()) {
                return a(sdkPackageName, webView, url, (WebResourceRequest) null, response);
            }
            return response;
        } catch (Throwable th) {
            Logger.e(m, "on webView response exception", th);
            return response;
        }
    }

    public static WebResourceResponse onWebViewResponseWithHeaders(String sdkPackageName, WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse response) {
        try {
            Logger.d(m, "on webView response with headers ", sdkPackageName, ", webview ", webView, ", isOnUiThread = ", Boolean.valueOf(n.c()));
            if (aE && aC.get()) {
                return a(sdkPackageName, webView, (String) null, webResourceRequest, response);
            }
            return response;
        } catch (Throwable th) {
            Logger.e(m, "on webView response with headers exception", th);
            return response;
        }
    }

    public static void a(String str, WebView webView, WebResourceRequest webResourceRequest, String str2) {
        try {
            if (Build.VERSION.SDK_INT < 21) {
                Logger.d(m, "on webView response with headers impl - Android SDK version too low.");
                return;
            }
            AdNetworkDiscovery adNetworkDiscovery = adNetworkDiscoveries.get(str);
            Logger.d(m, "on webView response with headers impl - ", str, ", webview ", webView, ", url ", str2, ", isOnUiThread = ", Boolean.valueOf(n.c()));
            if (webResourceRequest == null || webResourceRequest.getRequestHeaders() == null) {
                Logger.d(m, "on webView response with headers impl - web resource request is null");
            } else if (!webResourceRequest.getRequestHeaders().isEmpty() && webResourceRequest.getRequestHeaders().containsKey(n.c)) {
                a(str, webView, str2, webResourceRequest.getRequestHeaders());
                if (adNetworkDiscovery != null) {
                    AdNetworkDiscovery.WebViewResourceMatchingMethod b2 = adNetworkDiscovery.b();
                    boolean a2 = a(str, AdNetworkConfiguration.SHOULD_CALL_RESOURCE_LOADED_FROM_SHOULD_INTERCEPT_REQUEST, false);
                    if (b2 == AdNetworkDiscovery.WebViewResourceMatchingMethod.DIRECT_CREATIVE_INFO || a2) {
                        adNetworkDiscovery.a(str2, str2, webView);
                    }
                }
            }
        } catch (Throwable th) {
            try {
                new CrashReporter().caughtException(th);
                Logger.e(m, "on webView response with headers impl - exception: ", th);
            } catch (Throwable th2) {
            }
        }
    }

    private static void a(WebResourceResponse webResourceResponse, Map<String, List<String>> map) {
        HashMap hashMap = new HashMap();
        for (String str : map.keySet()) {
            List<String> list = map.get(str);
            if (list != null && !list.isEmpty()) {
                hashMap.put(str, list.get(0));
            }
        }
        if (Build.VERSION.SDK_INT >= 21) {
            webResourceResponse.setResponseHeaders(hashMap);
        }
    }

    private static WebResourceResponse a(String str, String str2, WebResourceResponse webResourceResponse, Bundle bundle) {
        WebResourceResponse webResourceResponse2;
        WebResourceResponse webResourceResponse3 = webResourceResponse;
        try {
            Logger.d(m, "Wrapping input stream started, sdkPackageName = ", str, ", url = ", str2);
            if (webResourceResponse3 == null) {
                URLConnection openConnection = new URL(str2).openConnection();
                webResourceResponse2 = new WebResourceResponse(bundle.getString(a, POBCommonConstants.CONTENT_TYPE_JAVASCRIPT), bundle.getString(b, "UTF-8"), new com.safedk.android.internal.f(str, str2, openConnection.getInputStream(), null, false));
                try {
                    a(webResourceResponse2, openConnection.getHeaderFields());
                } catch (IOException e2) {
                    e = e2;
                    webResourceResponse3 = webResourceResponse2;
                    Logger.e(m, "Error wrapping input stream for URL: ", str2, e);
                    return webResourceResponse3;
                }
            } else {
                if (!(webResourceResponse.getData() instanceof com.safedk.android.internal.f)) {
                    webResourceResponse3.setData(new com.safedk.android.internal.f(str, str2, webResourceResponse.getData(), null, false));
                }
                webResourceResponse2 = webResourceResponse3;
            }
            Logger.d(m, "Wrapping input stream in response: ", webResourceResponse2, ", MIME type: ", webResourceResponse2.getMimeType(), ", Encoding: ", webResourceResponse2.getEncoding());
            return webResourceResponse2;
        } catch (IOException e3) {
            e = e3;
        }
    }

    private static WebResourceResponse a(String str, WebView webView, String str2, WebResourceResponse webResourceResponse) {
        Logger.d(m, "follow WebView response if needed started, sdkPackageName = ", str, ", webView = ", webView, ", URL = ", str2);
        try {
        } catch (Throwable th) {
            Logger.d(m, "following webView response failed: ", th.getMessage(), th);
        }
        if (aE && aC.get()) {
            AdNetworkDiscovery adNetworkDiscovery = adNetworkDiscoveries.get(str);
            Bundle bundle = new Bundle();
            if (adNetworkDiscovery != null && adNetworkDiscovery.a(str2, bundle)) {
                Logger.d(m, "follow webview response if needed for ", str, ", url ", str2);
                webResourceResponse = a(str, str2, webResourceResponse, bundle);
            }
            return webResourceResponse;
        }
        Logger.d(m, "follow WebView response if needed SafeDK not initialized");
        return webResourceResponse;
    }

    public static InputStream a(String str, String str2, InputStream inputStream, Map<String, List<String>> map) {
        boolean z2;
        try {
            Logger.d(m, "followInputStreamIfNeeded started for url ", str2);
            if (aE && aC.get()) {
                if (a(str, AdNetworkConfiguration.USE_INPUT_STREAM_EVENT_AS_RESOURCE_LOADED_INDICATION, false)) {
                    onResourceLoaded(str, null, str2);
                }
                AdNetworkDiscovery adNetworkDiscovery = adNetworkDiscoveries.get(str);
                Bundle bundle = new Bundle();
                if (map.containsKey("Content-Type")) {
                    bundle.putStringArrayList("Content-Type", new ArrayList<>(map.get("Content-Type")));
                }
                boolean z3 = adNetworkDiscovery != null && adNetworkDiscovery.a(str2, bundle);
                if (z3) {
                    Object[] objArr = new Object[2];
                    objArr[0] = "should follow input stream? ";
                    objArr[1] = adNetworkDiscovery != null ? Boolean.valueOf(z3) : POBCommonConstants.NULL_VALUE;
                    Logger.d(m, objArr);
                }
                if (adNetworkDiscovery != null && z3) {
                    boolean j2 = adNetworkDiscovery.j(str2);
                    boolean a2 = a(str, AdNetworkConfiguration.ENFORCE_CLOSE_INPUT_STREAM_VAST_IN_VAST, false);
                    boolean a3 = a(str, AdNetworkConfiguration.ENFORCE_CLOSE_INPUT_STREAM, false);
                    Logger.d(m, "following input stream for url ", str2, ", enforce close value for sdk ", str, " is ", Boolean.valueOf(a3), ", enforce close VIV value for sdk = ", Boolean.valueOf(a2));
                    if (!a3 && (!a2 || !j2)) {
                        z2 = false;
                        return new com.safedk.android.internal.f(str, str2, inputStream, map, z2);
                    }
                    z2 = true;
                    return new com.safedk.android.internal.f(str, str2, inputStream, map, z2);
                }
                return inputStream;
            }
            Logger.d(m, "should follow input stream SafeDK not initialized");
            return inputStream;
        } catch (Throwable th) {
            try {
                Logger.e(m, "Exception following input stream : ", th.getMessage(), th);
                new CrashReporter().caughtException(th);
            } catch (Throwable th2) {
            }
            return inputStream;
        }
    }

    @SDKDependancy(packageName = "okio")
    public static BufferedSource a(String str, String str2, BufferedSource bufferedSource, int i2) {
        try {
            if (aE && aC.get()) {
                AdNetworkDiscovery adNetworkDiscovery = adNetworkDiscoveries.get(str);
                if (adNetworkDiscovery != null && adNetworkDiscovery.a(str2, (Bundle) null)) {
                    Logger.d(m, "following source stream for url ", str2);
                    return SafeDKSource.create(bufferedSource, i2);
                }
                return bufferedSource;
            }
            Logger.d(m, "following source stream SafeDK not initialized");
            return bufferedSource;
        } catch (Throwable th) {
            Logger.e(m, th.getMessage(), th);
            new CrashReporter().caughtException(th);
            return bufferedSource;
        }
    }

    @AdNetworkDependency(className = "com.mintegral.msdk.thrid.okio.BufferedSource")
    public static com.mintegral.msdk.thrid.okio.BufferedSource a(String str, String str2, com.mintegral.msdk.thrid.okio.BufferedSource bufferedSource, int i2) {
        try {
            if (aE && aC.get()) {
                AdNetworkDiscovery adNetworkDiscovery = adNetworkDiscoveries.get(str);
                if (adNetworkDiscovery != null && adNetworkDiscovery.a(str2, (Bundle) null)) {
                    Logger.d(m, "following source stream for url ", str2);
                    return SafeDKSourceMintegral.create(bufferedSource, i2);
                }
                return bufferedSource;
            }
            Logger.d(m, "following source stream SafeDK not initialized");
            return bufferedSource;
        } catch (Throwable th) {
            Logger.e(m, th.getMessage(), th);
            new CrashReporter().caughtException(th);
            return bufferedSource;
        }
    }

    @AdNetworkDependency(className = "com.mbridge.msdk.thrid.okio.BufferedSource")
    public static com.mbridge.msdk.thrid.okio.BufferedSource a(String str, String str2, com.mbridge.msdk.thrid.okio.BufferedSource bufferedSource, int i2) {
        try {
            if (aE && aC.get()) {
                AdNetworkDiscovery adNetworkDiscovery = adNetworkDiscoveries.get(str);
                if (adNetworkDiscovery != null && adNetworkDiscovery.a(str2, (Bundle) null)) {
                    Logger.d(m, "following source stream for url ", str2);
                    return SafeDKSourceMBridge.create(bufferedSource, i2);
                }
                return bufferedSource;
            }
            Logger.d(m, "following source stream SafeDK not initialized");
            return bufferedSource;
        } catch (Throwable th) {
            Logger.e(m, th.getMessage(), th);
            new CrashReporter().caughtException(th);
            return bufferedSource;
        }
    }

    public static OutputStream a(String str, String str2, OutputStream outputStream) {
        try {
            if (aE && aC.get()) {
                AdNetworkDiscovery adNetworkDiscovery = adNetworkDiscoveries.get(str);
                if (adNetworkDiscovery != null && adNetworkDiscovery.g(str2)) {
                    Logger.d(m, "following output stream for url ", str2);
                    return new com.safedk.android.internal.g(str, str2, outputStream);
                }
                return outputStream;
            }
            Logger.d(m, "following output stream SafeDK not initialized");
            return outputStream;
        } catch (Throwable th) {
            try {
                Logger.e(m, th.getMessage(), th);
                new CrashReporter().caughtException(th);
            } catch (Throwable th2) {
            }
            return outputStream;
        }
    }

    public static FileOutputStream a(String str, String str2, FileOutputStream fileOutputStream) {
        try {
            if (aE && aC.get()) {
                AdNetworkDiscovery adNetworkDiscovery = adNetworkDiscoveries.get(str);
                if (adNetworkDiscovery != null && adNetworkDiscovery.g(str2)) {
                    Logger.d(m, "follow output file stream if needed sdk = ", str, ", path = ", str2, ", stream ", fileOutputStream);
                    return new com.safedk.android.internal.e(str, str2, fileOutputStream);
                }
                return fileOutputStream;
            }
            Logger.d(m, "following output stream for file SafeDK not initialized");
            return fileOutputStream;
        } catch (Throwable th) {
            try {
                Logger.e(m, th.getMessage(), th);
                new CrashReporter().caughtException(th);
            } catch (Throwable th2) {
            }
            return fileOutputStream;
        }
    }

    public static boolean d(String str) {
        AdNetworkDiscovery adNetworkDiscovery = adNetworkDiscoveries.get(str);
        if (adNetworkDiscovery == null) {
            return false;
        }
        return adNetworkDiscovery.a();
    }

    public static void viewOnMeasure(String sdkPackageName, View view, int width, int height) {
        try {
            AdNetworkDiscovery j2 = j(sdkPackageName);
            if (j2 != null) {
                j2.a(view, width, height);
            }
        } catch (Throwable th) {
            Logger.e(m, "view on measure exception", th);
        }
    }

    public static void onResourceLoaded(final String sdkPackageName, final WebView webView, final String resource) {
        try {
            if ((!aE || !aC.get()) && !l) {
                return;
            }
            if (l) {
                c(sdkPackageName, webView, resource);
            } else {
                aD.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager.1
                    @Override // java.lang.Runnable
                    public void run() {
                        CreativeInfoManager.c(sdkPackageName, webView, resource);
                    }
                });
            }
        } catch (Throwable th) {
            try {
                new CrashReporter().caughtException(th);
            } catch (Throwable th2) {
            }
            Logger.e(m, th.getMessage(), th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(String str, WebView webView, String str2) {
        String str3;
        try {
            if (l || (aE && aC.get())) {
                String z2 = n.z(str2);
                if (webView == null) {
                    str3 = null;
                } else {
                    str3 = BrandSafetyUtils.a((Object) webView);
                    l.a(str, str3, str2);
                }
                AdNetworkDiscovery adNetworkDiscovery = adNetworkDiscoveries.get(str);
                if (adNetworkDiscovery != null && adNetworkDiscovery.b(z2, str3)) {
                    adNetworkDiscovery.a(z2, z2, webView);
                }
                a(str, webView, z2, (Map<String, String>) null);
            }
        } catch (Throwable th) {
            new CrashReporter().caughtException(th);
            Logger.d(m, "resource loaded failed", th);
        }
    }

    public static void onMaxAdViewCreated(MaxAdView maxAdView, MaxAdFormat adFormat, String adUnitId) {
        try {
            Logger.d(m, "Max ad view created: ", maxAdView, " ad format: ", adFormat, " ad unit id: ", adUnitId);
            if (maxAdView != null && adFormat != null) {
                if (adFormat == MaxAdFormat.BANNER || adFormat == MaxAdFormat.LEADER || adFormat == MaxAdFormat.MREC) {
                    BannerFinder.a(adUnitId, maxAdView, adFormat == MaxAdFormat.MREC ? BrandSafetyUtils.AdType.MREC : BrandSafetyUtils.AdType.BANNER);
                }
            }
        } catch (Throwable th) {
            Logger.e(m, "Max ad view created exception", th);
        }
    }

    public static void a(MaxAdView maxAdView) {
        if (maxAdView != null) {
            String e2 = n.e(com.safedk.android.utils.g.a("adUnitId='(.*?)'", 2), maxAdView.toString());
            if (e2 != null) {
                Logger.d(m, "Max ad view destroyed: ", maxAdView, " ad unit id: ", e2, ", isOnUiThread = ", Boolean.valueOf(n.c()));
                BannerFinder.a(e2, maxAdView);
            } else {
                Logger.d(m, "Max ad view destroyed: ", maxAdView);
                BannerFinder.a(maxAdView);
            }
        }
    }

    public static void onMaxNativeAdViewRendered(Object maxRenderNativeAdTask) {
        Object obj;
        try {
            if (maxRenderNativeAdTask.getClass().getName().equals("com.applovin.reactnative.AppLovinMAXNativeAdView$RenderNativeAdTask")) {
                Logger.d(m, "on max native ad view rendered, native ad task: ", maxRenderNativeAdTask);
                for (Field field : maxRenderNativeAdTask.getClass().getDeclaredFields()) {
                    field.setAccessible(true);
                    try {
                        Object obj2 = field.get(maxRenderNativeAdTask);
                        if (obj2.getClass().getName().equals("com.applovin.reactnative.AppLovinMAXNativeAdView")) {
                            Logger.d(m, "on max native ad view rendered, native ad view: ", field.get(maxRenderNativeAdTask));
                            for (Field field2 : obj2.getClass().getDeclaredFields()) {
                                field2.setAccessible(true);
                                try {
                                    obj = field2.get(obj2);
                                } catch (IllegalAccessException e2) {
                                    Logger.d(m, "on max native ad view rendered, failed to get max ad from: ", obj2, e2);
                                }
                                if (!(obj instanceof MaxAd)) {
                                    continue;
                                } else {
                                    MaxAd maxAd = (MaxAd) obj;
                                    Logger.d(m, "on max native ad view rendered, max ad: ", maxAd);
                                    onMaxNativeAdLoaded((ViewGroup) obj2, maxAd);
                                    return;
                                }
                            }
                        } else {
                            continue;
                        }
                    } catch (IllegalAccessException e3) {
                        Logger.d(m, "on max native ad view rendered, failed to get native ad view from: ", maxRenderNativeAdTask, e3);
                    }
                }
                return;
            }
            Logger.d(m, "on max native ad view rendered, wrong type: ", maxRenderNativeAdTask);
        } catch (Throwable th) {
            Logger.e(m, "on max native ad view rendered exception", th);
        }
    }

    public static void onMaxNativeAdLoaded(final ViewGroup maxAdView, final MaxAd ad2) {
        try {
            if (n.c()) {
                aD.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager.12
                    @Override // java.lang.Runnable
                    public void run() {
                        CreativeInfoManager.b(maxAdView, ad2);
                    }
                });
            } else {
                b(maxAdView, ad2);
            }
        } catch (Throwable th) {
            Logger.e(m, "Max native ad loaded exception", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(ViewGroup viewGroup, MaxAd maxAd) {
        if (aE && aC.get() && maxAd != null) {
            String adUnitId = maxAd.getAdUnitId();
            Bundle a2 = com.safedk.android.analytics.brandsafety.creatives.discoveries.c.a(maxAd);
            if (a2 != null) {
                String string = a2.getString("eventId");
                String string2 = a2.getString("sdk");
                String string3 = a2.getString("bidResponse");
                Logger.d(m, "Max native ad loaded: ", viewGroup, " ad unit id: ", adUnitId, ", network: ", maxAd.getNetworkName(), ", isOnUiThread = ", Boolean.valueOf(n.c()));
                NativeFinder C2 = SafeDK.getInstance().C();
                if (C2 != null && viewGroup != null) {
                    C2.a(string, string2, viewGroup);
                }
                b(string2, string3, viewGroup);
            }
        }
    }

    public static void onMaxNativeAdCreated(ViewGroup maxAdView) {
        NativeFinder C2;
        try {
            if (aE && aC.get()) {
                Logger.d(m, "Max native ad created: ", maxAdView);
                if (maxAdView != null && (C2 = SafeDK.getInstance().C()) != null) {
                    C2.b(maxAdView);
                }
            }
        } catch (Throwable th) {
            Logger.e(m, "Max native ad created exception", th);
        }
    }

    private static void a(String str, WebView webView, String str2, Map<String, String> map) {
        AdNetworkDiscovery adNetworkDiscovery;
        if (aE && aC.get() && str != null && (adNetworkDiscovery = adNetworkDiscoveries.get(str)) != null) {
            Logger.d(m, "handle resource attachment if necessary started sdk=", str, ", webview= ", webView, ", resource=", str2, ", headers=", map, ", matching method for ", str, " is ", adNetworkDiscovery.b().name());
            if (adNetworkDiscovery.q(str2)) {
                Logger.d(m, "handle resource attachment if necessary. should stop collecting resources.  sdk=", str, ", webview= ", webView, ", resource=", str2);
                SafeDK.getInstance().z().s(str);
            } else if (webView != null) {
                g.a(str, webView, str2, map);
            }
        }
    }

    public static void a(String str, String str2, String str3, Map<String, List<String>> map) {
        a(str, str2, str3, null, map, null);
    }

    public static void a(final String str, final String str2, final String str3, final byte[] bArr, final Map<String, List<String>> map, final String str4) {
        try {
            if ((!aE || !aC.get()) && !l) {
                return;
            }
            Logger.d(m, "ad fetched package: ", str, " url: ", str2, " , content size=", Integer.valueOf(str3.length()));
            if (a(str, AdNetworkConfiguration.SHOULD_USE_EARLY_VAST_AD_TAG_URI_PARSING, false)) {
                h.a(str3, e(str), str);
            }
            if (l) {
                Logger.d(m, "ad fetched executor service started ", str, " url: ", str2);
                b(str, str2, str3, bArr, map, null, str4);
            } else {
                aD.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager.16
                    @Override // java.lang.Runnable
                    public void run() {
                        CreativeInfoManager.b(str, str2, str3, bArr, map, null, str4);
                    }
                });
            }
        } catch (Throwable th) {
            Logger.e(m, th.getMessage(), th);
            try {
                new CrashReporter().caughtException(th);
            } catch (Throwable th2) {
            }
        }
    }

    public static String[] e(String str) {
        String a2 = a(str, AdNetworkConfiguration.VAST_URL_QUERY_PARAMS_TO_IGNORE, (String) null);
        if (TextUtils.isEmpty(a2)) {
            return null;
        }
        return a2.split(StringUtils.COMMA);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(String str, String str2, String str3, byte[] bArr, Map<String, List<String>> map, c.a aVar, String str4) {
        try {
            AdNetworkDiscovery adNetworkDiscovery = adNetworkDiscoveries.get(str);
            if (adNetworkDiscovery != null) {
                Logger.d(m, "ad fetched Impl sdk: ", str, " url: ", str2, " , content size=", Integer.valueOf(str3.length()));
                long nanoTime = System.nanoTime();
                List<CreativeInfo> a2 = adNetworkDiscovery.a(str2, str3, bArr, map, aVar);
                int size = a2 != null ? a2.size() : 0;
                if (size > 0) {
                    Logger.d(m, "ad network discovery generate info sdk ", str, " took ", Long.valueOf((System.nanoTime() - nanoTime) / 1000000), " ms, number of CIs: ", Integer.valueOf(size));
                    for (CreativeInfo creativeInfo : a2) {
                        if (creativeInfo.J()) {
                            Logger.d(m, "ci is empty");
                        } else if (str4 != null) {
                            creativeInfo.u("isci=(" + str4 + ")");
                        }
                    }
                }
                return;
            }
            Logger.d(m, "no discovery object found for SDK ", str);
        } catch (Throwable th) {
            try {
                new CrashReporter().caughtException(th);
                Logger.e(m, "Exception in ad fetch: ", th.getMessage(), th);
            } catch (Throwable th2) {
            }
        }
    }

    public static void a(final String str, final String str2, final WebView webView, final String str3) {
        try {
            AdNetworkDiscovery adNetworkDiscovery = adNetworkDiscoveries.get(str3);
            if (adNetworkDiscovery != null) {
                adNetworkDiscovery.a(webView);
            }
            if (aE && aC.get()) {
                if (str2 == null) {
                    Logger.d(m, "data loaded to webView is null for package: ", str3, " and webview: ", webView);
                    return;
                } else {
                    Logger.d(m, "data loaded to webView ", webView, ", package: ", str3, ", baseUrl: ", str);
                    aD.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager.17
                        @Override // java.lang.Runnable
                        public void run() {
                            try {
                                AdNetworkDiscovery adNetworkDiscovery2 = (AdNetworkDiscovery) CreativeInfoManager.adNetworkDiscoveries.get(str3);
                                if (adNetworkDiscovery2 != null) {
                                    adNetworkDiscovery2.b(str, str2, webView);
                                }
                            } catch (Throwable th) {
                                new CrashReporter().caughtException(th);
                                Logger.d(CreativeInfoManager.m, "Exception in data loaded to webView : ", th);
                            }
                        }
                    });
                    return;
                }
            }
            Logger.d(m, "data loaded to webView SafeDK not initialized for package: ", str3, " and webview: ", webView);
        } catch (Throwable th) {
            try {
                Logger.d(m, "Exception in data loaded to webView : ", th);
                new CrashReporter().caughtException(th);
            } catch (Throwable th2) {
            }
        }
    }

    public static void b(final String str, final String str2, final String str3) {
        try {
            if (aE && aC.get()) {
                Logger.d(m, "File output stream completed ", str, " , ", str2);
                aD.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager.18
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            AdNetworkDiscovery adNetworkDiscovery = (AdNetworkDiscovery) CreativeInfoManager.adNetworkDiscoveries.get(str);
                            if (adNetworkDiscovery == null) {
                                Logger.d(CreativeInfoManager.m, "no discovery object for SDK ", str);
                            } else if (adNetworkDiscovery.d().b(AdNetworkConfiguration.FILE_WRITE_AS_NETWORK_READ)) {
                                CreativeInfoManager.b(str, str2, str3, null, null, null, null);
                            } else {
                                adNetworkDiscovery.d(str2, str3);
                            }
                        } catch (Throwable th) {
                            new CrashReporter().caughtException(th);
                            Logger.e(CreativeInfoManager.m, th.getMessage(), th);
                        }
                    }
                });
                return;
            }
            Logger.d(m, "File output stream completed SafeDK not initialized");
        } catch (Throwable th) {
            try {
                Logger.e(m, th.getMessage(), th);
                new CrashReporter().caughtException(th);
            } catch (Throwable th2) {
            }
        }
    }

    public static void a(final String str, final String str2, final String str3, final byte[] bArr) {
        try {
            if (aE && aC.get()) {
                aD.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager.19
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            AdNetworkDiscovery adNetworkDiscovery = (AdNetworkDiscovery) CreativeInfoManager.adNetworkDiscoveries.get(str);
                            if (adNetworkDiscovery == null) {
                                Logger.d(CreativeInfoManager.m, "no discovery object for SDK ", str);
                                return;
                            }
                            String a2 = adNetworkDiscovery.a(str2, str3, bArr);
                            if (a2 != null) {
                                for (CreativeInfo creativeInfo : adNetworkDiscovery.t(a2)) {
                                    if (creativeInfo.K() == BrandSafetyUtils.AdType.INTERSTITIAL || creativeInfo.K() == BrandSafetyUtils.AdType.BANNER || creativeInfo.K() == BrandSafetyUtils.AdType.MREC) {
                                        CreativeInfoManager.a(creativeInfo, CreativeInfo.m);
                                        Logger.d(CreativeInfoManager.m, "set CI in ad finder: ", creativeInfo);
                                    }
                                }
                            }
                        } catch (Throwable th) {
                            new CrashReporter().caughtException(th);
                            Logger.e(CreativeInfoManager.m, th.getMessage(), th);
                        }
                    }
                });
                return;
            }
            Logger.d(m, "handling output stream SafeDK not initialized");
        } catch (Throwable th) {
            Logger.e(m, "Exception handling output stream : ", th.getMessage(), th);
            try {
                new CrashReporter().caughtException(th);
            } catch (Throwable th2) {
            }
        }
    }

    public static void a(final String str, final String str2, final BrandSafetyEvent.AdFormatType adFormatType, final Object obj) {
        try {
            if (aE && aC.get()) {
                aD.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager.20
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            Logger.d(CreativeInfoManager.m, "handling shown ad by api, sdk: ", str, ", message: ", str2, ", ad format type: ", adFormatType, ", isOnUiThread = ", Boolean.valueOf(n.c()));
                            AdNetworkDiscovery adNetworkDiscovery = (AdNetworkDiscovery) CreativeInfoManager.adNetworkDiscoveries.get(str);
                            if (adNetworkDiscovery != null) {
                                adNetworkDiscovery.a(str2, str2, adFormatType, obj);
                            }
                        } catch (Throwable th) {
                            new CrashReporter().caughtException(th);
                            Logger.d(CreativeInfoManager.m, "handling shown ad by api failed", th);
                        }
                    }
                });
            }
        } catch (Throwable th) {
            Logger.d(m, "Exception handling shown ad by api :", th.getMessage(), th);
            try {
                new CrashReporter().caughtException(th);
            } catch (Throwable th2) {
            }
        }
    }

    public static boolean a(CreativeInfo creativeInfo, String str) {
        return a(creativeInfo, str, (String) null, (String) null);
    }

    public static boolean a(CreativeInfo creativeInfo, String str, String str2) {
        return a(creativeInfo, str, str2, (String) null);
    }

    public static boolean a(CreativeInfo creativeInfo, String str, String str2, String str3) {
        boolean a2;
        if (!aE || !aC.get()) {
            return false;
        }
        if (creativeInfo.X() != null) {
            Logger.printFullVerboseLog(m, "setting creative in ad finder - ci already have matching method. ci: ", creativeInfo);
            return false;
        }
        Logger.d(m, "setting creative in ad finder, ci id =", creativeInfo.L(), ", ad type: ", creativeInfo.K());
        com.safedk.android.analytics.brandsafety.a a3 = SafeDK.getInstance().a(creativeInfo.K());
        if (a3 != null) {
            if (a(creativeInfo.Q(), AdNetworkConfiguration.SHOULD_REPORT_AD_ID_ON_CI_CREATION, true)) {
                a2 = a3.a(new p(creativeInfo, str, str2, str3));
            } else {
                a2 = a3.a(new p(creativeInfo, str, str2));
            }
            Logger.d(m, "setting creative in ad finder updating ci ", Boolean.valueOf(a2), ", matching method=", str, "_", str2, ", ad id=", creativeInfo.L(), ", ad type=", creativeInfo.K());
            return a2;
        }
        Logger.d(m, "setting creative in ad finder - cannot update ad finder");
        return false;
    }

    public static void b(String str, String str2) {
        if (!aE || !aC.get()) {
            return;
        }
        Logger.d(m, "request to stop take screenshots from current interstitial impression, package: ", str, ", address: ", str2);
        InterstitialFinder z2 = SafeDK.getInstance().z();
        if (z2 == null) {
            Logger.d(m, "interstitial finder is null, exiting");
        } else {
            z2.a(str, str2, false);
        }
    }

    public static void a(String str, BrandSafetyUtils.AdType adType, String str2) {
        if (!aE || !aC.get()) {
            return;
        }
        Logger.d(m, "request to stop take screenshots from current ", adType.name(), " impression received");
        BannerFinder bannerFinder = (BannerFinder) SafeDK.getInstance().a(adType);
        if (bannerFinder == null) {
            Logger.d(m, adType.name(), " finder is null, exiting");
        } else if (str2 != null) {
            bannerFinder.p(str2);
        } else {
            bannerFinder.q(str);
        }
    }

    public static void a(final String str, final Object obj, final Object obj2) {
        try {
            if (aE && aC.get()) {
                aD.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager.21
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            Logger.d(CreativeInfoManager.m, "Media player set data source event received ", obj, ", video file ", obj2);
                            AdNetworkDiscovery adNetworkDiscovery = (AdNetworkDiscovery) CreativeInfoManager.adNetworkDiscoveries.get(str);
                            if (adNetworkDiscovery == null) {
                                Logger.d(CreativeInfoManager.m, "no discovery object found for SDK ", str);
                            } else {
                                adNetworkDiscovery.b(obj, obj2);
                            }
                        } catch (Throwable th) {
                            try {
                                new CrashReporter().caughtException(th);
                                Logger.e(CreativeInfoManager.m, th.getMessage());
                            } catch (Throwable th2) {
                            }
                        }
                    }
                });
                return;
            }
            Logger.d(m, "Media player set data source event SafeDK not initialized");
        } catch (Throwable th) {
            Logger.e(m, th.getMessage(), th);
            try {
                new CrashReporter().caughtException(th);
            } catch (Throwable th2) {
            }
        }
    }

    public static void a(final String str, final Object obj) {
        try {
            if (aE && aC.get()) {
                aD.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager.22
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            Logger.d(CreativeInfoManager.m, "media player start event ", obj);
                            AdNetworkDiscovery adNetworkDiscovery = (AdNetworkDiscovery) CreativeInfoManager.adNetworkDiscoveries.get(str);
                            if (adNetworkDiscovery == null) {
                                Logger.d(CreativeInfoManager.m, "no discovery object found for SDK ", str);
                                return;
                            }
                            String c2 = adNetworkDiscovery.c(obj);
                            if (c2 != null) {
                                for (CreativeInfo creativeInfo : adNetworkDiscovery.t(c2)) {
                                    creativeInfo.a(obj);
                                    Logger.d(CreativeInfoManager.m, "calling set creative in ad finder after media player start called. video url: ", creativeInfo.H());
                                    CreativeInfoManager.a(creativeInfo, CreativeInfo.k);
                                }
                            }
                        } catch (Throwable th) {
                            try {
                                new CrashReporter().caughtException(th);
                                Logger.d(CreativeInfoManager.m, "Media player start event error ", th);
                            } catch (Throwable th2) {
                            }
                        }
                    }
                });
                return;
            }
            Logger.d(m, "media player start SafeDK not initialized");
        } catch (Throwable th) {
            Logger.d(m, "Media player start event error ", th);
            try {
                new CrashReporter().caughtException(th);
            } catch (Throwable th2) {
            }
        }
    }

    public static void b(final String str, final Object obj, final Object obj2) {
        try {
            if (aE && aC.get()) {
                aD.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager.2
                    @Override // java.lang.Runnable
                    public void run() {
                        Logger.d(CreativeInfoManager.m, "Ad Object ready Executor started ", str, " ad instance: ", obj, ", matching object: ", obj2, ", isOnUiThread = ", Boolean.valueOf(n.c()));
                        CreativeInfoManager.d(str, obj, obj2);
                    }
                });
                return;
            }
            Logger.d(m, "Ad Object ready SafeDK not initialized");
        } catch (Throwable th) {
            Logger.e(m, th.getMessage(), th);
            try {
                new CrashReporter().caughtException(th);
            } catch (Throwable th2) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void d(String str, Object obj, Object obj2) {
        try {
            Logger.d(m, "ad object ready impl ", obj);
            AdNetworkDiscovery adNetworkDiscovery = adNetworkDiscoveries.get(str);
            if (adNetworkDiscovery == null) {
                Logger.d(m, "ad object ready impl no discovery object for SDK ", str);
            } else {
                adNetworkDiscovery.d(obj, obj2);
            }
        } catch (Throwable th) {
            new CrashReporter().caughtException(th);
            Logger.d(m, "ad object ready impl error ", th);
        }
    }

    public static void f(String str) {
        SafeDK safeDK = SafeDK.getInstance();
        if (safeDK != null && safeDK.z() != null) {
            safeDK.z().m(str);
        }
    }

    public static void g(String str) {
        SafeDK safeDK = SafeDK.getInstance();
        if (safeDK != null && safeDK.z() != null) {
            safeDK.z().n(str);
        }
    }

    public static void h(String str) {
        SafeDK safeDK = SafeDK.getInstance();
        if (safeDK != null && safeDK.z() != null) {
            safeDK.z().o(str);
        }
    }

    public static void onVideoCompleted(String sdkPackageName, Object source, String originatedBy) {
        if (source == null) {
            onVideoCompleted(sdkPackageName, originatedBy);
        } else {
            a(sdkPackageName, BrandSafetyUtils.a(source), true, originatedBy);
        }
    }

    public static void onVideoStart(String sdkPackageName, Object source, String originatedBy) {
        try {
            AdNetworkDiscovery adNetworkDiscovery = adNetworkDiscoveries.get(sdkPackageName);
            if (adNetworkDiscovery != null) {
                adNetworkDiscovery.e(source);
            }
            a(sdkPackageName, BrandSafetyUtils.a(source), false, originatedBy);
        } catch (Throwable th) {
            Logger.e(m, "video start exception", th);
        }
    }

    public static void onVideoCompleted(final String sdkPackageName, final String originatedBy) {
        if (n.c()) {
            aD.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager.3
                @Override // java.lang.Runnable
                public void run() {
                    CreativeInfoManager.f(sdkPackageName, originatedBy);
                }
            });
        } else {
            f(sdkPackageName, originatedBy);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void f(String str, String str2) {
        try {
            if (aE && aC.get()) {
                Logger.d(m, "video completed event sdk=", str, ", originated by= ", str2);
                SafeDK safeDK = SafeDK.getInstance();
                if (safeDK != null && safeDK.z() != null) {
                    safeDK.z().f(str, str2);
                }
            }
        } catch (Throwable th) {
            Logger.e(m, "video completed exception", th);
        }
    }

    public static void a(final String str, final String str2, final boolean z2, final String str3) {
        try {
            if (n.c()) {
                aD.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager.4
                    @Override // java.lang.Runnable
                    public void run() {
                        CreativeInfoManager.c(str, str2, z2, str3);
                    }
                });
            } else {
                c(str, str2, z2, str3);
            }
        } catch (Throwable th) {
            Logger.e(m, "video completed exception", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(String str, String str2, boolean z2, String str3) {
        if (!aE || !aC.get()) {
            return;
        }
        Object[] objArr = new Object[8];
        objArr[0] = "video ";
        objArr[1] = z2 ? "completed" : X3.i.d0;
        objArr[2] = " event sdk=";
        objArr[3] = str;
        objArr[4] = ", view address=";
        objArr[5] = str2;
        objArr[6] = ", originated by= ";
        objArr[7] = str3;
        Logger.d(m, objArr);
        SafeDK safeDK = SafeDK.getInstance();
        if (safeDK != null) {
            for (com.safedk.android.analytics.brandsafety.a aVar : Arrays.asList(safeDK.z(), safeDK.B())) {
                if (aVar != null && aVar.a(str, str2, z2, str3)) {
                    return;
                }
            }
        }
        if (!z2) {
            Logger.d(m, "video started event added to videoStartViewList, sdk=", str, ", view address=", str2);
            d.add(str2);
        }
    }

    public static void onViewClicked(final String sdkPackageName, final View view) {
        try {
            if (view == null) {
                Logger.d(m, "View clicked event sdk=", sdkPackageName, ", view=null, exiting.");
                return;
            }
            Logger.d(m, "View clicked event sdk=", sdkPackageName, ", view id = ", Integer.toString(view.getId(), 16));
            if (n.c()) {
                aD.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager.5
                    @Override // java.lang.Runnable
                    public void run() {
                        CreativeInfoManager.c(sdkPackageName, view);
                    }
                });
            } else {
                c(sdkPackageName, BrandSafetyUtils.a(view), true, "view-click");
            }
        } catch (Throwable th) {
            Logger.e(m, "View clicked event exception", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(String str, View view) {
        try {
            if (view == null) {
                Logger.d(m, "View clicked event sdk=", str, ", view=null, exiting.");
                return;
            }
            Logger.d(m, "View clicked event sdk=", str, ", view id = ", Integer.toString(view.getId(), 16), ", isOnUiThread = ", Boolean.valueOf(n.c()));
            if (aE && aC.get()) {
                AdNetworkDiscovery j2 = j(str);
                if (j2 != null) {
                    j2.c(view);
                } else {
                    Logger.d(m, "clicked from unsupported SDK: ", str);
                }
            }
        } catch (Throwable th) {
            Logger.e(m, "View clicked event exception", th);
        }
    }

    public static boolean onViewTouched(final String sdkPackageName, final View view, MotionEvent motionEvent) {
        try {
        } catch (Throwable th) {
            Logger.e(m, "View touched event exception", th);
        }
        if (view == null) {
            Logger.d(m, "View touched event sdk=", sdkPackageName, ", view=null, exiting.");
            return false;
        }
        if (aE && aC.get()) {
            int action = motionEvent.getAction();
            Logger.d(m, "View touched event sdk=", sdkPackageName, ", view id = ", Integer.toString(view.getId(), 16), ", motion event=", motionEvent.toString());
            if (action != 0 && action != 11) {
                Logger.d(m, "View touched event sdk=", sdkPackageName, ", motion event=", Integer.valueOf(action), ". exiting.");
                return false;
            }
            if (n.c()) {
                aD.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager.6
                    @Override // java.lang.Runnable
                    public void run() {
                        CreativeInfoManager.d(sdkPackageName, view);
                    }
                });
            } else {
                d(sdkPackageName, view);
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void d(String str, View view) {
        try {
            Logger.d(m, "onViewTouchedImpl started, sdkPackageName = ", str, ", view = ", view);
            AdNetworkDiscovery j2 = j(str);
            if (j2 == null) {
                Logger.d(m, "View touched event clicked from unsupported SDK: ", str);
            } else {
                j2.d(view);
            }
        } catch (Throwable th) {
            Logger.e(m, "View touched event exception", th);
        }
    }

    public static boolean i(String str) {
        if (n.a(str, j) && str.contains(i)) {
            return true;
        }
        return false;
    }

    public static synchronized void a(final String str, final String str2, final String str3, final String str4, final String str5) {
        synchronized (CreativeInfoManager.class) {
            try {
            } catch (Throwable th) {
                Logger.e(m, th.getMessage(), th);
                try {
                    new CrashReporter().caughtException(th);
                } catch (Throwable th2) {
                }
            }
            if (aE && aC.get()) {
                aD.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager.7
                    @Override // java.lang.Runnable
                    public void run() {
                        Logger.d(CreativeInfoManager.m, "updating creative info details from Max, sdk=", str, ", placement id=", str2, ", creative id=", str3, ", ad format=", str5);
                        AdNetworkDiscovery adNetworkDiscovery = (AdNetworkDiscovery) CreativeInfoManager.adNetworkDiscoveries.get(str);
                        if (adNetworkDiscovery != null) {
                            adNetworkDiscovery.a(str2, str3, str4, str5);
                        } else {
                            Logger.d(CreativeInfoManager.m, "no discovery object for SDK ", str);
                        }
                    }
                });
                return;
            }
            Logger.d(m, "updating creative info details SafeDK not initialized");
        }
    }

    public static AdNetworkDiscovery j(String str) {
        if (!aE || !aC.get() || str == null) {
            return null;
        }
        return adNetworkDiscoveries.get(str);
    }

    public static b k(String str) {
        AdNetworkDiscovery adNetworkDiscovery;
        if (aE && aC.get() && (adNetworkDiscovery = adNetworkDiscoveries.get(str)) != null) {
            return adNetworkDiscovery.d();
        }
        return null;
    }

    public static boolean a(String str, AdNetworkConfiguration adNetworkConfiguration, boolean z2) {
        AdNetworkDiscovery adNetworkDiscovery;
        if (!aE || !aC.get()) {
            return z2;
        }
        if (str != null && (adNetworkDiscovery = adNetworkDiscoveries.get(str)) != null && adNetworkDiscovery.d() != null && adNetworkDiscovery.d().a(adNetworkConfiguration)) {
            return adNetworkDiscovery.d().b(adNetworkConfiguration);
        }
        return z2;
    }

    public static long a(String str, AdNetworkConfiguration adNetworkConfiguration, long j2) {
        AdNetworkDiscovery adNetworkDiscovery;
        if (!aE || !aC.get()) {
            return j2;
        }
        if (str != null && (adNetworkDiscovery = adNetworkDiscoveries.get(str)) != null && adNetworkDiscovery.d() != null && adNetworkDiscovery.d().a(adNetworkConfiguration)) {
            return adNetworkDiscovery.d().e(adNetworkConfiguration);
        }
        return j2;
    }

    public static String a(String str, AdNetworkConfiguration adNetworkConfiguration, String str2) {
        if (!aE || !aC.get()) {
            return str2;
        }
        AdNetworkDiscovery adNetworkDiscovery = adNetworkDiscoveries.get(str);
        if (adNetworkDiscovery != null && adNetworkDiscovery.d() != null && adNetworkDiscovery.d().a(adNetworkConfiguration)) {
            return adNetworkDiscovery.d().c(adNetworkConfiguration);
        }
        return str2;
    }

    public static float a(String str, AdNetworkConfiguration adNetworkConfiguration, float f2) {
        AdNetworkDiscovery adNetworkDiscovery;
        if (!aE || !aC.get()) {
            return f2;
        }
        if (str != null && (adNetworkDiscovery = adNetworkDiscoveries.get(str)) != null && adNetworkDiscovery.d() != null && adNetworkDiscovery.d().a(adNetworkConfiguration)) {
            return adNetworkDiscovery.d().d(adNetworkConfiguration);
        }
        return f2;
    }

    public static void a(AdNetworkConfiguration adNetworkConfiguration, float f2) {
        if (!aE || !aC.get()) {
            return;
        }
        for (AdNetworkDiscovery adNetworkDiscovery : adNetworkDiscoveries.values()) {
            if (adNetworkDiscovery.d() != null) {
                adNetworkDiscovery.d().a(adNetworkConfiguration, f2);
                Logger.d(m, "Config bundle for sdk ", adNetworkDiscovery, " updated config item ", adNetworkDiscovery.f(), " to ", Float.valueOf(f2));
            }
        }
    }

    public static void a(AdNetworkConfiguration adNetworkConfiguration, long j2) {
        if (!aE || !aC.get()) {
            return;
        }
        for (AdNetworkDiscovery adNetworkDiscovery : adNetworkDiscoveries.values()) {
            if (adNetworkDiscovery.d() != null) {
                adNetworkDiscovery.d().a(adNetworkConfiguration, j2);
                Logger.d(m, "Config bundle for sdk ", adNetworkDiscovery, " updated config item ", adNetworkDiscovery.f(), " to ", Long.valueOf(j2));
            }
        }
    }

    public static void d() {
        if (!aE || !aC.get()) {
            return;
        }
        for (AdNetworkDiscovery adNetworkDiscovery : adNetworkDiscoveries.values()) {
            if (adNetworkDiscovery.d() != null) {
                Logger.d(m, "Config item SDK ", adNetworkDiscovery.f(), " min image uniformity threshold is ", Float.valueOf(adNetworkDiscovery.d().d(AdNetworkConfiguration.SDK_SPECIFIC_MIN_UNIFORM_PIXELS_PERCENTAGE_FOR_UNIFORM_IMAGE)));
            }
        }
    }

    public static void onHandleInvocation(String packageName, Object target, String data) {
        try {
            if (aE && aC.get()) {
                Logger.printFullVerboseLog(m, "handle invocation packageName = ", packageName, ", interface name: ", target, ", data is: ", data);
                AdNetworkDiscovery adNetworkDiscovery = adNetworkDiscoveries.get(packageName);
                if (adNetworkDiscovery == null) {
                    Logger.d(m, "handle invocation: couldn't find discovery for package: ", packageName);
                } else {
                    adNetworkDiscovery.a(data, target);
                }
            }
        } catch (Throwable th) {
            Logger.e(m, "handle invocation exception", th);
        }
    }

    public static void onWebviewInterfaceConstruction(final String packageName, final Object bridge) {
        try {
            if (n.c()) {
                aD.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager.8
                    @Override // java.lang.Runnable
                    public void run() {
                        CreativeInfoManager.c(packageName, bridge);
                    }
                });
            } else {
                c(packageName, bridge);
            }
        } catch (Throwable th) {
            Logger.e(m, "onWebviewInterfaceConstructionImpl exception", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(String str, Object obj) {
        if (!aE || !aC.get()) {
            return;
        }
        String a2 = BrandSafetyUtils.a(obj);
        Logger.printFullVerboseLog(m, "onWebviewInterfaceConstruction: packageName is: ", str, ", isOnUiThread = ", Boolean.valueOf(n.c()), ", bridge address is: ", a2);
        AdNetworkDiscovery adNetworkDiscovery = adNetworkDiscoveries.get(str);
        if (adNetworkDiscovery == null) {
            Logger.d(m, "onWebviewInterfaceConstruction: couldn't find discovery for package: ", str);
        } else {
            adNetworkDiscovery.x(a2);
        }
    }

    public static Set<String> e() {
        return adNetworkDiscoveries.keySet();
    }

    public static boolean l(String str) {
        SafeDK safeDK;
        return (!aE || !aC.get() || (safeDK = SafeDK.getInstance()) == null || safeDK.z() == null || safeDK.z().I.a(str, false) == null) ? false : true;
    }

    public static boolean m(String str) {
        SafeDK safeDK;
        return (!aE || !aC.get() || (safeDK = SafeDK.getInstance()) == null || safeDK.z() == null || safeDK.z().I.e(str) == null) ? false : true;
    }

    public static boolean n(String str) {
        SafeDK safeDK;
        if (!aE || !aC.get() || (safeDK = SafeDK.getInstance()) == null || safeDK.A() == null) {
            return false;
        }
        return safeDK.A().s(str);
    }

    public static void a(String str, String str2, BrandSafetyUtils.AdType adType, String str3) {
        if (!aE || !aC.get()) {
            return;
        }
        SafeDK safeDK = SafeDK.getInstance();
        if (safeDK != null && safeDK.a(adType) != null) {
            Logger.d(m, "sendMessageToAdInfo: sending message: ", str2, " to address: ", str);
            safeDK.a(adType).c(str, str2, str3);
        } else {
            Logger.d(m, "sendMessageToAdInfo: NOT sending message: ", str2, " to address: ", str, "because ad finder not available");
        }
    }

    public static void onReceiveMessageFromExternal(final String sdkPackage, final Object object, final String data) {
        aD.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager.9
            @Override // java.lang.Runnable
            public void run() {
                try {
                    AdNetworkDiscovery j2 = CreativeInfoManager.j(sdkPackage);
                    if (j2 != null) {
                        j2.a(object, data);
                    }
                } catch (Throwable th) {
                    Logger.e(CreativeInfoManager.m, "onReceiveMessageFromExternal exception", th);
                }
            }
        });
    }

    public static void onBindView(final String packageName, final Object controller, final View videoView) {
        aD.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager.10
            @Override // java.lang.Runnable
            public void run() {
                try {
                    Logger.d(CreativeInfoManager.m, "on bind view - controller: ", controller, " (", BrandSafetyUtils.a(controller), "), video view: ", videoView, " (", BrandSafetyUtils.a(videoView), ")");
                    AdNetworkDiscovery j2 = CreativeInfoManager.j(packageName);
                    if (j2 != null) {
                        CreativeInfoManager.a(j2, j2.c(controller, videoView), videoView);
                    }
                } catch (Throwable th) {
                    Logger.e(CreativeInfoManager.m, "on bind view exception", th);
                }
            }
        });
    }

    public static void c(final String str, final String str2) {
        aD.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager.11
            @Override // java.lang.Runnable
            public void run() {
                try {
                    AdNetworkDiscovery j2 = CreativeInfoManager.j(str);
                    if (j2 != null && str2 != null) {
                        j2.e(str2);
                    }
                } catch (Throwable th) {
                    Logger.e(CreativeInfoManager.m, "on json object detected exception", th);
                }
            }
        });
    }

    public static String d(String str, String str2) {
        AdNetworkDiscovery j2 = j(str);
        if (j2 != null) {
            return j2.f(str2);
        }
        return null;
    }

    public static void onFeedbackPopup(String sdkPackageName) {
        o r2;
        try {
            Logger.d(m, "on feedback popup started, sdkPackageName: ", sdkPackageName);
            InterstitialFinder z2 = SafeDK.getInstance().z();
            if (z2 != null && (r2 = z2.r(sdkPackageName)) != null && r2.i() != null) {
                Logger.d(m, Logger.FeatureTag.AD_CAPTURE, "on feedback popup : PP detection for sdk = ", sdkPackageName);
                r2.i().a(m.q, new m.a[0]);
                z2.a(r2, false);
            }
        } catch (Throwable th) {
            Logger.e(m, "on feedback popup exception", th);
        }
    }

    public static void onInitVFPData(String sdkPackageName, Object view) {
        try {
            Logger.d(m, "on init VFP data, sdkPackageName: ", sdkPackageName, " and view: ", view);
            a(sdkPackageName, BrandSafetyUtils.a(view), false, "video-view");
        } catch (Throwable th) {
            Logger.e(m, "on init VFP data exception", th);
        }
    }

    public static void onAdReadyToPlay(final String sdkPackageName, final Object vastPlayer, final Object videoPlayerView) {
        aD.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager.13
            @Override // java.lang.Runnable
            public void run() {
                try {
                    String a2 = BrandSafetyUtils.a(vastPlayer);
                    String a3 = BrandSafetyUtils.a(videoPlayerView);
                    Logger.d(CreativeInfoManager.m, "on ad ready to play - vast player is: ", vastPlayer, " and address is: ", a2);
                    Logger.d(CreativeInfoManager.m, "on ad ready to play - video player view is: ", videoPlayerView, " and address is: ", a3);
                    AdNetworkDiscovery j2 = CreativeInfoManager.j(sdkPackageName);
                    if (j2 != null) {
                        j2.c(vastPlayer, videoPlayerView);
                    }
                } catch (Throwable th) {
                    Logger.e(CreativeInfoManager.m, "on ad ready to play exception", th);
                }
            }
        });
    }

    public static void onAdStarted(final String sdkPackageName, final Object vastPlayer) {
        aD.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager.14
            @Override // java.lang.Runnable
            public void run() {
                try {
                    Logger.d(CreativeInfoManager.m, "on ad start - vast player is: ", vastPlayer, " and address is: ", BrandSafetyUtils.a(vastPlayer));
                    AdNetworkDiscovery j2 = CreativeInfoManager.j(sdkPackageName);
                    if (j2 != null) {
                        CreativeInfoManager.a(j2, j2.d(vastPlayer), (Object) null);
                    }
                } catch (Throwable th) {
                    Logger.e(CreativeInfoManager.m, "on ad start exception", th);
                }
            }
        });
    }

    public static void onVolleyStringRequestCtor(String sdkPackageName, String url, Response.Listener responseListener) {
        try {
            String a2 = BrandSafetyUtils.a(responseListener);
            Logger.d(m, "on volley string request ctor started with sdk: ", sdkPackageName, " url is: ", url, " and response listener: ", responseListener, " and address: ", a2);
            AdNetworkDiscovery j2 = j(sdkPackageName);
            if (j2 != null) {
                j2.f(a2, url);
            }
        } catch (Throwable th) {
            Logger.e(m, "on volley string request ctor exception", th);
        }
    }

    public static void onVolleyGetResponse(final String sdkPackageName, final Response.Listener responseListener, final Object responseObj) {
        aD.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager.15
            @Override // java.lang.Runnable
            public void run() {
                String a2;
                String y2;
                try {
                    Logger.d(CreativeInfoManager.m, "on volley get response started with sdk: ", sdkPackageName, " instance is: ", responseListener, " and response object: ", responseObj);
                    if ((responseObj instanceof String) && h.b((String) responseObj)) {
                        Logger.printFullVerboseLog(CreativeInfoManager.m, "on volley get response - object is a vast string");
                        AdNetworkDiscovery j2 = CreativeInfoManager.j(sdkPackageName);
                        if (j2 != null && (y2 = j2.y((a2 = BrandSafetyUtils.a(responseListener)))) != null) {
                            Logger.d(CreativeInfoManager.m, "on volley get response - for listener address: ", a2, " found url: ", y2);
                            j2.a(y2, (String) responseObj, null, null, null);
                        }
                    }
                } catch (Throwable th) {
                    Logger.e(CreativeInfoManager.m, "on volley get response exception", th);
                }
            }
        });
    }

    public static void onCronetClientGetResponse(String sdkPackageName, Object urlResponseInfo, byte[] byteStream) {
        Logger.d(m, "on cronet client get response - sdk: ", sdkPackageName, ", response info: ", urlResponseInfo);
        try {
            String str = (String) urlResponseInfo.getClass().getMethod("getUrl", new Class[0]).invoke(urlResponseInfo, new Object[0]);
            AdNetworkDiscovery j2 = j(sdkPackageName);
            if (byteStream != null && j2 != null && j2.a(str, (Bundle) null)) {
                j2.a(str, new String(byteStream), byteStream, null, null);
            }
        } catch (Exception e2) {
            Logger.d(m, "on cronet client get response - failed to get url or data: ", e2);
        }
    }

    public static void a(AdNetworkDiscovery adNetworkDiscovery, CreativeInfo creativeInfo, Object obj) {
        if (creativeInfo == null) {
            return;
        }
        List<CreativeInfo> list = null;
        if (creativeInfo.an()) {
            list = adNetworkDiscovery.v(creativeInfo.L());
        }
        if (list == null) {
            list = new ArrayList<>();
            list.add(creativeInfo);
        }
        for (CreativeInfo creativeInfo2 : list) {
            if (obj != null) {
                creativeInfo2.a(obj);
            }
            a(creativeInfo2, CreativeInfo.n);
        }
    }

    public static void a(String str, v vVar) {
        Logger.d(m, "registerSafeDKSavePrefetchEventListener started , sdk = ", str);
        AdNetworkDiscovery adNetworkDiscovery = adNetworkDiscoveries.get(str);
        if (adNetworkDiscovery != null) {
            adNetworkDiscovery.a(vVar);
            Logger.d(m, "save prefetch event listener registered fpr Ad network discovery class ", str, ", discovery = ", adNetworkDiscovery.f());
        } else {
            Logger.d(m, "save prefetch event listener cannot be registered, Ad network discovery class not found for ", str);
        }
    }

    public static void b(String str, v vVar) {
        Logger.d(m, "registerSafeDKRewriteEventListener started , sdk = ", str);
        AdNetworkDiscovery adNetworkDiscovery = adNetworkDiscoveries.get(str);
        if (adNetworkDiscovery != null) {
            adNetworkDiscovery.b(vVar);
            Logger.d(m, "rewrite event listener registered for Ad network discovery class ", str, ", discovery = ", adNetworkDiscovery.f());
        } else {
            Logger.d(m, "rewrite event listener cannot be registered, Ad network discovery class not found for ", str);
        }
    }
}
