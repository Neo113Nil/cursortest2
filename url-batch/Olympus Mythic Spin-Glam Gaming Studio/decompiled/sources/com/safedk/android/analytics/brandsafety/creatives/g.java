package com.safedk.android.analytics.brandsafety.creatives;

import android.text.TextUtils;
import android.webkit.WebView;
import com.pubmatic.sdk.common.POBCommonConstants;
import com.safedk.android.SafeDK;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.u;
import com.safedk.android.analytics.brandsafety.creatives.infos.AdMobCreativeInfo;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import com.safedk.android.analytics.brandsafety.l;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.SdksMapping;
import com.safedk.android.utils.SimpleConcurrentHashSet;
import com.safedk.android.utils.k;
import com.safedk.android.utils.n;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes14.dex */
public class g {
    public static final String a = "ResourceUrlFilter";
    public static final String b = "attribution.urls";
    public static final String c = "general_exclusion_list";
    public static final String d = "general_inclusion_list";
    public static final String e = "http";
    private static final float i = 1.1f;
    private static final float j = 1.3f;
    private static final String k = "BannerView";
    private static final float l = 6.0f;
    private static final float m = 8.0f;
    private static final int o = 10;
    private static final ConcurrentHashMap<String, String[]> h = b();
    private static final LinkedHashSet<String> n = new LinkedHashSet<>();
    public static int f = 691155085;
    public static int g = 2105362402;
    private static final ConcurrentHashMap<String, a> p = new ConcurrentHashMap<>();

    public static ConcurrentHashMap<String, String[]> a() {
        return h;
    }

    private static class a {
        SimpleConcurrentHashSet<String> a = new SimpleConcurrentHashSet<>();
        SimpleConcurrentHashSet<String> b = new SimpleConcurrentHashSet<>();

        a() {
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            synchronized (this.b) {
                sb.append("networkResources=");
                sb.append(this.b != null ? this.b.toString() : POBCommonConstants.NULL_VALUE);
            }
            synchronized (this.a) {
                sb.append(", webpageResources=");
                sb.append(this.a != null ? this.a.toString() : POBCommonConstants.NULL_VALUE);
            }
            return sb.toString();
        }
    }

    private static ConcurrentHashMap<String, String[]> b() {
        ConcurrentHashMap<String, String[]> concurrentHashMap = new ConcurrentHashMap<>();
        concurrentHashMap.put(com.safedk.android.utils.h.a, new String[]{".applovin.com", ".applvn.com", ".appl.vn", ".axon.ai"});
        concurrentHashMap.put(com.safedk.android.utils.h.f, new String[]{".supersonicads.com", ".supersonic.com", "streamrail.com", "streamrail.net", "simharif.com", "atom-data.io", "supersonicads-a.akamaihd.net", ".ssacdn.com", ".isprog.com", "unity3d.com", "ironsrc.mobi"});
        concurrentHashMap.put(com.safedk.android.utils.h.d, new String[]{".vungle.com", ".liftoff.com", ".liftoff.io", ".chinaliftoff.io", "liftoff-creatives.io"});
        concurrentHashMap.put("com.unity3d.ads", new String[]{".unity3d.com"});
        concurrentHashMap.put("com.facebook.ads", new String[]{".facebook.com"});
        concurrentHashMap.put(com.safedk.android.utils.h.h, new String[]{".doubleclick.net", ".google.com", ".googlesyndication.com", ".googleadservices.com", ".googleapis.com", ".youtube.com", ".googleusercontent.com", ".gstatic.com", ".googlevideo.com"});
        concurrentHashMap.put(com.safedk.android.utils.h.o, new String[]{"rayjump.com", "mobvista.com", "mintegral.com", "mindworks-creative.com", "mtgglobals.com"});
        concurrentHashMap.put(com.safedk.android.utils.h.b, new String[]{"adcolony.com", "adccache.cn", "adtilt.com", "admarvel.com"});
        concurrentHashMap.put(b, new String[]{POBCommonConstants.PLAY_STORE_DOMAIN, ".appsflyer.com", ".adjust.com", ".singular.net", ".tenjin.io", ".kochava.com", ".tune.com", ".partytrack.it", ".tapstream.com", ".apsalar.com", ".adj.st", ".singular.com", ".sng.link", ".tenjin.com", ".doubleverify.com", ".onelink.me", ".moatads.com", ".moatpixel.com", ".adsafeprotected.com"});
        concurrentHashMap.put(com.safedk.android.utils.h.p, new String[]{".inner-active.mobi", ".inner-active.com", "w3.org"});
        concurrentHashMap.put(com.safedk.android.utils.h.i, new String[]{"inmobicdn.net", "inmobi.com"});
        concurrentHashMap.put(com.safedk.android.utils.h.u, new String[]{"pangle.io", "byteoversea.com", "tiktokcdn.com", "ipstatp.com", "pglstatp.com", "snssdk.com", "pangolin-sdk-toutiao.com", "toutiao.com", "ibytedtos.com", "tiktokpangle-cdn-us.com"});
        concurrentHashMap.put("com.five_corp.ad", new String[]{"fivecdm.io", "fivecdm.com", "line.me"});
        concurrentHashMap.put(com.safedk.android.utils.h.v, new String[]{"smaato.net"});
        concurrentHashMap.put(com.safedk.android.utils.h.D, new String[]{"moloco.com"});
        concurrentHashMap.put("io.bidmachine", new String[]{"bidmachine.io", "bm-ads.io", "lazybumblebee.com"});
        concurrentHashMap.put(com.safedk.android.utils.h.C, new String[]{"pubnative.net"});
        concurrentHashMap.put(com.safedk.android.utils.h.E, new String[]{"mobilefuse.com"});
        concurrentHashMap.put(com.safedk.android.utils.h.c, new String[]{"chartboost.com"});
        concurrentHashMap.put(com.safedk.android.utils.h.F, new String[]{POBCommonConstants.PUBMATIC_IDENTIFIER_FOR_ERROR_TRACKER_URL});
        concurrentHashMap.put(com.safedk.android.utils.h.A, new String[]{"amazon-adsystem.com", "media-amazon.com"});
        concurrentHashMap.put(com.safedk.android.utils.h.y, new String[]{"yandex.net", "yandex.ru", u.b});
        concurrentHashMap.put(c, new String[]{"outcome-cdn.supersonicads.com/", "click-haproxy.supersonicads.com/", "supersonicads.com/pixel", "supersonicads.com/endcardclick", "supersonicads.com/videoimpression", "supersonicads.com/isendcardclick", "supersonicads.com/isvideoimpression", "k.isprog.com", "events.isprog.com", ".simharif.com", "csi.gstatic.com/csi", "googleads.g.doubleclick.net/pagead/conversion", ".applovin.com/imp", ".applovin.com/click", ".applovin.com/interact", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.i, ".applvn.com/imp", ".applvn.com/click", ".applvn.com/interact", ".applvn.com/redirect", "event.inner-active.mobi", "events.inner-active.mobi"});
        concurrentHashMap.put(d, new String[]{"gstatic.com", "googleusercontent.com", "tpc.googlesyndication.com", "/simgad/", "pglstatp.com", "ipstatp.com", "pglstatp-toutiao.com", "pstatp.com", "googleadsserving.cn", "ggpht.com", "ibyteimg.com"});
        return concurrentHashMap;
    }

    public static boolean a(String[] strArr, String str) {
        for (String str2 : strArr) {
            if (!a(SdksMapping.getMainSdkPackage(str2), str)) {
                return false;
            }
        }
        return true;
    }

    public static boolean a(String str, String str2) {
        boolean z;
        String[] strArr;
        int i2 = 0;
        if (!str2.startsWith("http")) {
            return false;
        }
        String c2 = k.c(str2);
        String mainSdkPackage = SdksMapping.getMainSdkPackage(str);
        if (!TextUtils.isEmpty(mainSdkPackage) && (strArr = h.get(mainSdkPackage)) != null) {
            for (String str3 : strArr) {
                if (c2.contains(str3)) {
                    Logger.d(a, "isDspUrlTracking filtering out ", str2);
                    z = true;
                    break;
                }
            }
        }
        z = false;
        String[] strArr2 = h.get(b);
        if (strArr2 != null) {
            int length = strArr2.length;
            while (true) {
                if (i2 >= length) {
                    break;
                }
                if (!c2.contains(strArr2[i2])) {
                    i2++;
                } else {
                    z = true;
                    break;
                }
            }
        }
        return !z;
    }

    private static void a(String str, String str2, String str3, Map<String, String> map, List<l> list, boolean z) {
        char c2 = 2;
        if (z || a(str, str3, map)) {
            String y = n.y(str3);
            for (l lVar : list) {
                if (lVar != null) {
                    if (lVar.j() != null && lVar.j().m()) {
                        Logger.FeatureTag featureTag = Logger.FeatureTag.NW_RESOURCES;
                        Object[] objArr = new Object[10];
                        objArr[0] = "add resource to impression if needed, skip resource for ";
                        objArr[1] = str2;
                        objArr[c2] = ", type: ";
                        objArr[3] = lVar.j;
                        objArr[4] = ", package: ";
                        objArr[5] = str;
                        objArr[6] = ", impression id: ";
                        objArr[7] = lVar.k();
                        objArr[8] = ", resource: ";
                        objArr[9] = y;
                        Logger.d(a, featureTag, objArr);
                    } else {
                        lVar.b(y);
                        Logger.d(a, Logger.FeatureTag.NW_RESOURCES, "add resource to impression if needed, added resource for ", str2, ", type: ", lVar.j, ", package: ", str, ", impression id: ", lVar.k(), ", resource: ", y);
                    }
                }
                c2 = 2;
            }
            return;
        }
        if (a(str, str3)) {
            Logger.d(a, "add resource to impression if needed, WebView resource discarded (should not be added to dsp domains). resource = ", str3);
        }
    }

    private static a a(String str) {
        a aVar;
        synchronized (p) {
            aVar = p.get(str);
            if (aVar == null) {
                aVar = new a();
                p.put(str, aVar);
            }
        }
        return aVar;
    }

    private static boolean b(String str, String str2) {
        for (com.safedk.android.analytics.brandsafety.b bVar : SafeDK.getInstance().y()) {
            if (bVar != null) {
                List<CreativeInfo> a2 = bVar.a(str, str2);
                if (n.a((Collection<?>) a2)) {
                    continue;
                } else {
                    Iterator<CreativeInfo> it = a2.iterator();
                    while (it.hasNext()) {
                        if (it.next().m()) {
                            Logger.d(a, Logger.FeatureTag.RESOURCES, "should stop collecting resource for CI returned true with webViewAddress ", str2, " is set to not collect resources");
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public static void a(String str, String str2, String str3, Map<String, String> map, boolean z) {
        if (z || a(str, str3, map)) {
            a a2 = a(str2);
            String y = n.y(str3);
            if (!b(str, str2)) {
                Logger.d(a, Logger.FeatureTag.NW_RESOURCES, "add resource to collection, added resource for ", str2, ", package: ", str, ", resource: ", y);
                synchronized (a2.b) {
                    a2.b.a((SimpleConcurrentHashSet<String>) y);
                }
                return;
            }
            Logger.d(a, Logger.FeatureTag.NW_RESOURCES, "did not add resource to collection, webViewAddress = ", str2, ", ci stopCollectingResources is true  for at least one CI , resource = ", y);
            return;
        }
        if (a(str, str3)) {
            Logger.d(a, "add resource to collection, WebView resource discarded (should not be added to dsp domains). resource = ", str3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0028 A[Catch: all -> 0x00e2, TryCatch #0 {all -> 0x00e2, blocks: (B:3:0x0004, B:4:0x000d, B:6:0x0013, B:8:0x001b, B:13:0x0028, B:19:0x0030, B:22:0x0038, B:24:0x0042, B:25:0x0044, B:35:0x007d, B:36:0x007e, B:37:0x0080, B:46:0x00b9, B:48:0x00bc, B:50:0x00c2, B:52:0x00ca, B:54:0x00d0, B:55:0x00d6, B:64:0x00e0, B:39:0x0081, B:40:0x00b5, B:27:0x0045, B:28:0x0079, B:57:0x00d7, B:58:0x00dc), top: B:2:0x0004, inners: #1, #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x002f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(String str, l lVar, WeakReference<WebView> weakReference, List<String> list, boolean z) {
        ArrayList arrayList;
        WebView webView;
        String a2;
        boolean z2;
        try {
            arrayList = new ArrayList();
            for (String str2 : list) {
                if (!z && !a(str, str2, (Map<String, String>) null)) {
                    z2 = false;
                    if (!z2) {
                        arrayList.add(n.y(str2));
                    }
                }
                z2 = true;
                if (!z2) {
                }
            }
        } catch (Throwable th) {
            Logger.e(a, "Exception: ", th.getMessage(), th);
        }
        if (!arrayList.isEmpty()) {
            if (lVar != null) {
                if (lVar.v) {
                    synchronized (lVar.p) {
                        lVar.p.a(arrayList);
                        Logger.d(a, Logger.FeatureTag.JS_RESOURCES, "adding ", Integer.valueOf(arrayList.size()), " expanded webpage resources, type: ", lVar.j, ", package: ", str, ", impression id: ", lVar.k());
                    }
                    return;
                } else {
                    synchronized (lVar.n) {
                        lVar.n.a(arrayList);
                        Logger.d(a, Logger.FeatureTag.JS_RESOURCES, "adding ", Integer.valueOf(arrayList.size()), " webpage resources, type: ", lVar.j, ", package: ", str, ", impression id: ", lVar.k());
                    }
                    return;
                }
            }
            if (weakReference != null && weakReference.get() != null && (webView = weakReference.get()) != null && (a2 = BrandSafetyUtils.a((Object) webView)) != null) {
                a a3 = a(a2);
                synchronized (a3.a) {
                    a3.a.a(arrayList);
                }
                return;
            }
            return;
            Logger.e(a, "Exception: ", th.getMessage(), th);
        }
    }

    private static void a(String str, WebView webView, String str2, Map<String, String> map, com.safedk.android.analytics.brandsafety.a aVar) {
        boolean a2;
        try {
            a2 = a(str, str2, map);
        } catch (Throwable th) {
            Logger.e(a, "Exception: ", th.getMessage(), th);
        }
        if (a2 && a2) {
            String a3 = BrandSafetyUtils.a((Object) webView);
            Logger.d(a, Logger.FeatureTag.NW_RESOURCES, "add resource to collection started, current resource: ", str2, " for ", a3, " is resource: ", Boolean.valueOf(a2));
            String y = n.y(str2);
            if (!b(str, a3)) {
                com.safedk.android.analytics.brandsafety.c cVar = null;
                if (aVar != null) {
                    cVar = aVar.c(a3);
                }
                if (cVar != null) {
                    l i2 = cVar.i();
                    if (i2 != null) {
                        if (i2.v) {
                            Logger.d(a, Logger.FeatureTag.NW_RESOURCES, "add expanded resource to collection, added resource ", y, " into ", a3);
                            synchronized (i2.q) {
                                i2.q.a((SimpleConcurrentHashSet<String>) y);
                            }
                        } else {
                            synchronized (i2.o) {
                                i2.o.a((SimpleConcurrentHashSet<String>) y);
                            }
                        }
                    }
                    return;
                }
                a a4 = a(a3);
                synchronized (a4.b) {
                    a4.b.a((SimpleConcurrentHashSet<String>) y);
                }
                return;
                Logger.e(a, "Exception: ", th.getMessage(), th);
            }
        }
    }

    private static void a(String str, l lVar, WeakReference<WebView> weakReference, List<String> list) {
        if (lVar != null) {
            try {
                synchronized (lVar.r) {
                    lVar.r.a(list);
                    Logger.d(a, Logger.FeatureTag.JS_RESOURCES, "adding ", Integer.valueOf(list.size()), " hidden webpage resources, type: ", lVar.j, ", package: ", str, ", impression id: ", lVar.k());
                }
            } catch (Throwable th) {
                Logger.e(a, "Exception: ", th.getMessage(), th);
            }
        }
    }

    public static void a(List<WeakReference<WebView>> list, com.safedk.android.analytics.brandsafety.c cVar) {
        String a2;
        a a3;
        List<l> g2;
        if (list != null) {
            try {
                if (!list.isEmpty()) {
                    for (WeakReference<WebView> weakReference : list) {
                        if (n.a((Reference<?>) weakReference) && (a2 = BrandSafetyUtils.a((Object) weakReference.get())) != null && (a3 = a(a2)) != null) {
                            if (CreativeInfoManager.a(cVar.c(), AdNetworkConfiguration.DETECT_MULTIPLE_ADS_BY_WEB_VIEW_CHANGE, false)) {
                                g2 = new ArrayList<>();
                                g2.add(cVar.i());
                            } else {
                                g2 = cVar.g();
                            }
                            p.remove(a2);
                            SimpleConcurrentHashSet<String> simpleConcurrentHashSet = a3.b;
                            SimpleConcurrentHashSet<String> simpleConcurrentHashSet2 = a3.a;
                            for (l lVar : g2) {
                                if (lVar != null) {
                                    Logger.d(a, "propagateWebviewResourcesToImpression, webview: ", a2, ", view address: ", lVar.b());
                                    if (simpleConcurrentHashSet != null && !simpleConcurrentHashSet.isEmpty()) {
                                        Logger.FeatureTag featureTag = Logger.FeatureTag.NW_RESOURCES;
                                        Object[] objArr = new Object[2];
                                        objArr[0] = "propagate network resources, shouldStopCollectingResources=";
                                        objArr[1] = lVar.j() != null ? Boolean.valueOf(lVar.j().m()) : null;
                                        Logger.d(a, featureTag, objArr);
                                        if (lVar.j() != null && lVar.j().m()) {
                                            Logger.d(a, Logger.FeatureTag.NW_RESOURCES, "propagate network resources, skip ", Integer.valueOf(simpleConcurrentHashSet.size()), " resources for ", a2, ", type: ", lVar.j, ", package: ", cVar.c(), ", impression id: ", lVar.k());
                                        } else {
                                            Logger.d(a, Logger.FeatureTag.NW_RESOURCES, "propagate network resources, adding ", Integer.valueOf(simpleConcurrentHashSet.size()), " resources to collection for ", a2, ", type: ", lVar.j, ", package: ", cVar.c(), ", impression id: ", lVar.k());
                                            synchronized (lVar.o) {
                                                lVar.o.putAll(simpleConcurrentHashSet);
                                            }
                                        }
                                    }
                                    if (simpleConcurrentHashSet2 != null && !simpleConcurrentHashSet2.isEmpty()) {
                                        if (lVar.j() != null && lVar.j().m()) {
                                            Logger.d(a, Logger.FeatureTag.JS_RESOURCES, "propagate webpage resources, skip ", Integer.valueOf(simpleConcurrentHashSet2.size()), " resources for ", a2, ", type: ", lVar.j, ", package: ", cVar.c(), ", impression id: ", lVar.k());
                                        } else {
                                            Logger.d(a, Logger.FeatureTag.JS_RESOURCES, "propagate webpage resources, adding ", Integer.valueOf(simpleConcurrentHashSet2.size()), " resources to collection for ", a2, ", type: ", lVar.j, ", package: ", cVar.c(), ", impression id: ", lVar.k());
                                            synchronized (lVar.n) {
                                                lVar.n.putAll(simpleConcurrentHashSet2);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                Logger.d(a, "caught exception: ", th);
            }
        }
    }

    public static void a(List<WeakReference<WebView>> list) {
        String a2;
        if (list != null) {
            try {
                if (!list.isEmpty()) {
                    for (WeakReference<WebView> weakReference : list) {
                        if (weakReference.get() != null && (a2 = BrandSafetyUtils.a((Object) weakReference.get())) != null) {
                            p.remove(a2);
                        }
                    }
                }
            } catch (Throwable th) {
                Logger.d(a, "caught exception: ", th);
            }
        }
    }

    public static void a(String str, String str2, WeakReference<WebView> weakReference, String str3, List<String> list, boolean z, Boolean bool, Boolean bool2, List<String> list2) {
        String mainSdkPackage;
        boolean z2;
        List<l> g2;
        boolean z3;
        boolean z4;
        if (SafeDK.getInstance() == null || !SafeDK.ab() || (mainSdkPackage = SdksMapping.getMainSdkPackage(str)) == null) {
            return;
        }
        com.safedk.android.analytics.brandsafety.c cVar = null;
        if (!TextUtils.isEmpty(str3)) {
            cVar = BrandSafetyUtils.k(str3);
        }
        char c2 = 2;
        if (cVar == null) {
            Logger.d(a, "no info object found by event id: ", str3);
            cVar = BrandSafetyUtils.l(str2);
            z2 = true;
        } else {
            z2 = false;
        }
        if (cVar != null) {
            String w = cVar.w();
            if (CreativeInfoManager.a(str, AdNetworkConfiguration.DETECT_MULTIPLE_ADS_BY_WEB_VIEW_CHANGE, false)) {
                g2 = new ArrayList<>();
                g2.add(cVar.i());
            } else {
                g2 = cVar.g();
            }
            for (l lVar : g2) {
                if (lVar != null) {
                    Object[] objArr = new Object[4];
                    objArr[0] = "handleResourcesCollected, webview: ";
                    objArr[1] = str2;
                    objArr[c2] = ", view address: ";
                    objArr[3] = lVar.b();
                    Logger.d(a, objArr);
                    if (z2) {
                        lVar.w = 1;
                    }
                    if (w == null || !w.equals(str3)) {
                        Logger.d(a, "event ids don't match. current = ", w, " js: ", str3);
                        lVar.w += 2;
                    } else {
                        if (bool != null) {
                            if (lVar.m == null) {
                                z4 = bool.booleanValue();
                            } else {
                                z4 = lVar.m.booleanValue() || bool.booleanValue();
                            }
                            lVar.m = Boolean.valueOf(z4);
                        }
                        if (bool2 != null) {
                            if (lVar.x == null) {
                                z3 = bool2.booleanValue();
                            } else {
                                z3 = lVar.x.booleanValue() || bool2.booleanValue();
                            }
                            lVar.x = Boolean.valueOf(z3);
                        }
                        if (lVar.j() != null && lVar.j().m()) {
                            Logger.FeatureTag featureTag = Logger.FeatureTag.NW_RESOURCES;
                            Object[] objArr2 = new Object[10];
                            objArr2[0] = "handle resources collected, skip resource for ";
                            objArr2[1] = str2;
                            objArr2[c2] = ", type: ";
                            objArr2[3] = lVar.j;
                            objArr2[4] = ", package: ";
                            objArr2[5] = mainSdkPackage;
                            objArr2[6] = ", impression id: ";
                            objArr2[7] = lVar.k();
                            objArr2[8] = ", resources: ";
                            objArr2[9] = Boolean.valueOf(z);
                            Logger.printFullVerboseLog(a, featureTag, objArr2);
                        } else {
                            if (list != null) {
                                a(mainSdkPackage, lVar, weakReference, list, z);
                            }
                            if (list2 != null) {
                                a(mainSdkPackage, lVar, weakReference, list2);
                            }
                        }
                    }
                    c2 = 2;
                }
            }
        }
    }

    public static void a(String str, WebView webView, String str2, Map<String, String> map) {
        if (webView == null || !SafeDK.ab()) {
            return;
        }
        String a2 = BrandSafetyUtils.a((Object) webView);
        String mainSdkPackage = SdksMapping.getMainSdkPackage(str);
        boolean a3 = CreativeInfoManager.a(mainSdkPackage, AdNetworkConfiguration.SUPPORTS_MREC_IMPRESSION_TRACKING, false);
        Logger.d(a, "handle resource url ", mainSdkPackage, " on webview ", a2, ", resource ", str2, ", headers = ", map, ", supportsMrecMonitoring = ", Boolean.valueOf(a3), ", webview = ", webView, ", getMaxAdViewFromChildView : ", n.c(webView), ", isMrecWebView = ", Boolean.valueOf(n.a(webView)));
        if (!a3 && (n.b(webView.getWidth(), webView.getHeight()) || n.a(webView))) {
            Logger.d(a, "handle resource url - ignoring url ", str2, ",  supportsMrecMonitoring = ", Boolean.valueOf(a3), ", webview = ", webView, ", isMrecWebView =  ", Boolean.valueOf(n.a(webView)), " , isMrecRatio = ", Boolean.valueOf(n.b(webView.getWidth(), webView.getHeight())));
            b(Arrays.asList(a2));
            return;
        }
        Iterator<com.safedk.android.analytics.brandsafety.b> it = SafeDK.getInstance().y().iterator();
        BrandSafetyUtils.AdType adType = null;
        List<l> list = null;
        BrandSafetyUtils.AdType adType2 = null;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            com.safedk.android.analytics.brandsafety.b next = it.next();
            if (next != null) {
                com.safedk.android.analytics.brandsafety.c c2 = next.c(a2);
                if (adType == null && c2 != null) {
                    adType = c2.p;
                }
                if (next.b(mainSdkPackage, a2, str2)) {
                    Logger.d(a, "handle resource url - skip redirect URL and stop collecting resources: ", str2, " for ", a2, ", type=", next.a());
                    return;
                }
                if (c2 == null) {
                    c2 = next.d(a2);
                }
                if (c2 != null) {
                    list = c2.h();
                    adType2 = c2.p;
                }
                if (list != null && !list.isEmpty()) {
                    Logger.d(a, "handle resource url found ", Integer.valueOf(list.size()), " ", adType2, " impressions for webview ", a2);
                    break;
                }
            }
        }
        if (str2.startsWith("text:") && !com.safedk.android.utils.a.a(mainSdkPackage)) {
            Logger.d(a, "handle resource url, sdk ", mainSdkPackage, " does not support banner monitoring, skipping text resources");
            return;
        }
        BrandSafetyUtils.AdType a4 = com.safedk.android.analytics.brandsafety.b.a(mainSdkPackage, webView);
        if (list != null && !list.isEmpty()) {
            boolean isInterstitialActivity = com.safedk.android.internal.b.getInstance().isInterstitialActivity(webView.getContext());
            if (str2.startsWith("text:") && (adType2 == BrandSafetyUtils.AdType.INTERSTITIAL || a4 == BrandSafetyUtils.AdType.INTERSTITIAL)) {
                Logger.d(a, "handle resource url, skipping text resource for interstitial ", mainSdkPackage, " on webview ", a2, ", resource ", str2, ", interstitial activity = ", Boolean.valueOf(isInterstitialActivity));
                return;
            } else {
                a(mainSdkPackage, a2, str2, map, list, false);
                return;
            }
        }
        a(mainSdkPackage, a2, str2, map, false);
    }

    public static void b(List<String> list) {
        a remove;
        if (list != null) {
            synchronized (list) {
                for (String str : list) {
                    if (str != null && (remove = p.remove(str)) != null) {
                        Logger.d(a, "clearing for ", str, " succeeded, ", Integer.valueOf(remove.a.size()), " webpageResources removed, ", Integer.valueOf(remove.b.size()), " networkResourcess removed");
                    }
                }
            }
        }
    }

    public static void a(String str, String str2, l lVar) {
        AdNetworkDiscovery j2;
        if (str2 != null && lVar != null && (j2 = CreativeInfoManager.j(str)) != null) {
            j2.r(str2).add(str2);
        }
    }

    public static void a(String str, WebView webView, String str2, String str3, Map<String, String> map) {
        if (webView == null) {
            return;
        }
        String a2 = BrandSafetyUtils.a((Object) webView);
        String mainSdkPackage = SdksMapping.getMainSdkPackage(str);
        boolean a3 = CreativeInfoManager.a(mainSdkPackage, AdNetworkConfiguration.SUPPORTS_MREC_IMPRESSION_TRACKING, false);
        Logger.d(a, "handle resource url ", mainSdkPackage, " on webview ", a2, ", context: ", webView.getContext(), " resource: ", str2, " size: ", Integer.valueOf(webView.getWidth()), StringUtils.COMMA, Integer.valueOf(webView.getHeight()), ", webView id: ", Integer.toHexString(webView.getId()), ", headers: ", map, ", supportsMrecMonitoring = ", Boolean.valueOf(a3), ", webview = ", webView, ", getMaxAdViewFromChildView : ", n.c(webView), ", isMrecWebView = ", Boolean.valueOf(n.a(webView)));
        if (!a3 && (n.b(webView.getWidth(), webView.getHeight()) || n.a(webView))) {
            Logger.d(a, "handle resource url - ignoring url ", str2, ",  supportsMrecMonitoring = ", Boolean.valueOf(a3), ", webview = ", webView, ", isMrecWebView =  ", Boolean.valueOf(n.a(webView)), " , isMrecRatio = ", Boolean.valueOf(n.b(webView.getWidth(), webView.getHeight())));
            b(Arrays.asList(a2));
            return;
        }
        if (map != null) {
            Logger.d(a, "handle resource url - headers: ", map);
        }
        boolean isInterstitialActivity = com.safedk.android.internal.b.getInstance().isInterstitialActivity(webView.getContext());
        BrandSafetyUtils.AdType a4 = com.safedk.android.analytics.brandsafety.b.a(mainSdkPackage, webView);
        Logger.d(a, "handle resource url - interstitial activity: ", Boolean.valueOf(isInterstitialActivity), " adType: ", a4);
        if (!isInterstitialActivity && (a4 == BrandSafetyUtils.AdType.MREC || a4 == BrandSafetyUtils.AdType.BANNER)) {
            if (!com.safedk.android.utils.a.a(mainSdkPackage)) {
                Logger.d(a, "Sdk ", mainSdkPackage, " does not support banner monitoring, skipping");
                return;
            }
            if ("com.unity3d.ads".equals(mainSdkPackage) && webView.getContext().toString().contains("UnityPlayerActivity")) {
                return;
            }
            if (!com.safedk.android.utils.h.p.equals(mainSdkPackage)) {
                Logger.d(a, a2, " will be added to Webview address list");
                n.add(a2);
            } else {
                AdNetworkDiscovery j2 = CreativeInfoManager.j(mainSdkPackage);
                if (j2 != null && j2.g().containsKey(Integer.valueOf(webView.getId()))) {
                    return;
                }
            }
            boolean a5 = a(webView);
            Logger.d(a, "webview context: ", webView.getContext(), " size: ", Integer.valueOf(webView.getWidth()), StringUtils.COMMA, Integer.valueOf(webView.getHeight()), ", interstitial: ", Boolean.valueOf(a5));
            if (!a5) {
                Logger.d(a, "handle resource url - no interstitial, skipping");
                return;
            }
        }
        if (a(mainSdkPackage, str2, map)) {
            com.safedk.android.analytics.brandsafety.a aVar = null;
            if (a4 != null) {
                aVar = SafeDK.getInstance().a(a4);
            }
            a(mainSdkPackage, webView, str2, map, aVar);
        }
    }

    public static boolean a(String str, String str2, Map<String, String> map) {
        return n.a(str2, map) || c(str, str2);
    }

    private static boolean c(String str, String str2) {
        if (!SdksMapping.getMainSdkPackage(str).equals("com.unity3d.ads")) {
            return false;
        }
        boolean a2 = AdMobCreativeInfo.a(str2);
        if (a2) {
            Logger.d(a, "admob known domain url = ", str2);
        }
        return a2;
    }

    public static boolean a(WebView webView) {
        try {
            float width = webView.getWidth();
            float height = webView.getHeight();
            if (height > 0.0f) {
                float f2 = width / height;
                Logger.d(a, "interstitial webView proportions : ", Float.valueOf(f2));
                return (((f2 > i ? 1 : (f2 == i ? 0 : -1)) >= 0 && (f2 > j ? 1 : (f2 == j ? 0 : -1)) <= 0) || ((f2 > l ? 1 : (f2 == l ? 0 : -1)) >= 0 && (f2 > 8.0f ? 1 : (f2 == 8.0f ? 0 : -1)) <= 0)) ? false : true;
            }
        } catch (Throwable th) {
            Logger.d(a, "Exception in interstitial webView proportions : ", th.getMessage(), th);
        }
        return true;
    }
}
