package com.safedk.android.analytics.brandsafety.creatives.discoveries;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.webkit.WebView;
import com.mbridge.msdk.out.MBConfiguration;
import com.pubmatic.sdk.common.POBCommonConstants;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.RedirectDetails;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.l;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import com.safedk.android.analytics.brandsafety.creatives.infos.MintegralCreativeInfo;
import com.safedk.android.analytics.events.BrandSafetyEvent;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.PersistentConcurrentHashMap;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.security.InvalidParameterException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Matcher;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class k extends d {
    private static final String c = "MintegralDiscovery";
    private static final String i = "url";
    private static final String j = "http";
    private static final String k = "mof_data";
    private static final String l = "crt_rid";
    private static final String m = "impressionURL";
    private static final String n = "(function(){var sdkId=\"{{SDK_ID}}\";var address=\"{{ADDRESS}}\";var log=function(message){try{if(typeof window.webkit.messageHandlers.safedkDebug.postMessage===\"function\"){window.webkit.messageHandlers.safedkDebug.postMessage(message)}else{console.log(\"SafeDKWebApInterface safedkDebug object missing\")}}catch(error){}};var lookForPrivacyPolicy=function(){try{var isPrivacyPolicy=document.getElementsByClassName(\"g-dialog-contianer\").length>0;if(isPrivacyPolicy){if(typeof window.webkit.messageHandlers.safedkNoSampling.postMessage===\"function\"){window.webkit.messageHandlers.safedkNoSampling.postMessage(sdkId,address,0,0)}else{console.log(\"SafeDKWebApInterface safedkNoSampling object missing\")}}}catch(error){if(typeof window.webkit.messageHandlers.safedkNoSamplingExc.postMessage===\"function\"){window.webkit.messageHandlers.safedkNoSamplingExc.postMessage(error.message+\"\\n\"+error.stack)}else{console.log(\"SafeDKWebApInterface safedkNoSamplingExc object missing\")}}};lookForPrivacyPolicy();try{var MutationObserver=window.WebKitMutationObserver||window.MutationObserver;var observer=new MutationObserver(function(mutations){mutations.forEach(function(mutation){for(var i=0;i<mutation.addedNodes.length;i++){var node=mutation.addedNodes[i];if(node&&node.nodeName!=\"#text\"){lookForPrivacyPolicy()}}})});var config={childList:true,subtree:true};observer.observe(document,config)}catch(error){if(typeof window.webkit.messageHandlers.safedkNoSamplingExc.postMessage===\"function\"){window.webkit.messageHandlers.safedkNoSamplingExc.postMessage(error.message+\"\\n\"+error.stack)}else{console.log(\"SafeDKWebApInterface safedkNoSamplingExc object missing\")}}})();\n";
    private static Map<String, CreativeInfo> o;
    private static final String d = ".rayjump.com/openapi/ad";
    private static final String e = ".rayjump.com/load";
    private static final String f = "mtgglobals.com/load";
    private static final String g = "mtgglobals.com/openapi/ad/v3";
    private static final List<String> h = Arrays.asList(d, e, f, g, l.j, l.k, l.l);
    private static final Set<String> p = new HashSet();
    public static final Map<String, c.a> b = new ConcurrentHashMap();

    private void h() {
        this.E.b(AdNetworkConfiguration.SUPPORTS_PREFETCH_RECEIVING_BY_APPLOVIN, true);
        this.E.b(AdNetworkConfiguration.SUPPORTS_BANNER_IMPRESSION_TRACKING, true);
        this.E.b(AdNetworkConfiguration.SUPPORTS_BIDDING_INTERSTITIAL_IMPRESSION_MATCHING_BY_MAX, true);
        this.E.b(AdNetworkConfiguration.SHOULD_EXTRACT_AD_ID_FROM_BANNER_WEB_VIEW, true);
        this.E.b(AdNetworkConfiguration.SHOULD_REPORT_AD_ID_ON_CI_CREATION, false);
        this.E.b(AdNetworkConfiguration.SUPPORTS_AUTO_REDIRECTS_IDENTIFICATION, true);
        this.E.b(AdNetworkConfiguration.SUPPORTS_EXPANDED_ADS_IDENTIFICATION, true);
        this.E.b(AdNetworkConfiguration.SHOULD_IGNORE_BANNER_MULTI_AD_DID_CLICK_EVENT, true);
        this.E.b(AdNetworkConfiguration.SUPPORTS_MREC_IMPRESSION_TRACKING, true);
        this.E.b(AdNetworkConfiguration.SUPPORTS_MREC_IMPRESSION_EOV, true);
        this.E.b(AdNetworkConfiguration.SET_AD_FORMAT_FROM_APPLOVIN_BUNDLE, true);
        this.E.b(AdNetworkConfiguration.SUPPORTS_JAVASCRIPT_BASED_PRIVACY_BUTTON_CLICK_DETECTION_IN_FULLSCREEN_ADS, true);
        this.E.b(AdNetworkConfiguration.JS_PRIVACY_BUTTON_CLICK_DETECTION_SCRIPT, n);
        this.E.b(AdNetworkConfiguration.SUPPORTS_NATIVE_IMPRESSION_TRACKING, true);
    }

    private void k() {
        try {
            if (CreativeInfoManager.l) {
                o = new ConcurrentHashMap();
            } else {
                PersistentConcurrentHashMap persistentConcurrentHashMap = new PersistentConcurrentHashMap("MintegralDiscovery_kToCInfo");
                o = persistentConcurrentHashMap;
                Logger.d(c, "generate collections - k to Ci info loaded, keyset=", persistentConcurrentHashMap.keySet());
            }
        } catch (InvalidParameterException e2) {
            Logger.e(c, "generate collections - error initializing caching will not be available", e2);
        }
    }

    public k() {
        super(com.safedk.android.utils.h.o, c);
        h();
        k();
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d
    protected List<CreativeInfo> a(String str, String str2, Map<String, List<String>> map, c.a aVar, byte[] bArr) throws JSONException {
        Object[] objArr = new Object[6];
        objArr[0] = "generate info - started, url: ";
        objArr[1] = str;
        objArr[2] = ", maxParams = ";
        objArr[3] = aVar;
        objArr[4] = ", buffer size: ";
        objArr[5] = str2 == null ? POBCommonConstants.NULL_VALUE : Integer.valueOf(str2.length());
        Logger.d(c, objArr);
        try {
            JSONObject jSONObject = new JSONObject(str2);
            int optInt = jSONObject.optInt("status", -1);
            if (optInt != 1) {
                if (b.containsKey(str)) {
                    Logger.d(c, "generate info - processing as new prefetch format");
                    List<CreativeInfo> b2 = l.b(jSONObject, null, this.I, b.remove(str));
                    a(b2);
                    return b2;
                }
                Logger.d(c, "generate info - no status or status is not okay, skipping. status= ", Integer.valueOf(optInt));
                return null;
            }
            if (!jSONObject.has("data")) {
                Logger.d(c, "generate info - JSON object does not contain a 'data' key. this is not s prefetch");
                return null;
            }
            JSONObject jSONObject2 = jSONObject.getJSONObject("data");
            if (!l.e(jSONObject2) && !b(str, jSONObject2)) {
                Logger.d(c, "generate info - invalid ad type= ", Integer.valueOf(l.d(jSONObject2)));
                return null;
            }
            if (!l.a(jSONObject2)) {
                List<CreativeInfo> a = l.a(jSONObject2, (CreativeInfo) null, this.I, b.get(str));
                a(a);
                a(str, a);
                return a;
            }
            Logger.d(c, "generate info - data object is complementary prefetch");
            a(str, jSONObject2);
            return null;
        } catch (Throwable th) {
            Logger.d(c, "generate info - not a valid JSON string: ", th.getMessage());
            if (aVar != null) {
                Logger.d(c, "generate info - saving max params of native ad. token id= ", str2, ", max params= ", aVar);
                b.put(str2, aVar);
            }
            return null;
        }
    }

    private void a(List<CreativeInfo> list) {
        for (CreativeInfo creativeInfo : list) {
            if (creativeInfo instanceof MintegralCreativeInfo) {
                MintegralCreativeInfo mintegralCreativeInfo = (MintegralCreativeInfo) creativeInfo;
                synchronized (o) {
                    o.put(mintegralCreativeInfo.as(), creativeInfo);
                }
                Logger.d(c, "save creative info - adding CI to k map, key: ", mintegralCreativeInfo.as(), ", new map size: ", Integer.valueOf(o.size()));
            }
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:44:0x00c4
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1179)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    private void a(java.lang.String r9, org.json.JSONObject r10) {
        /*
            Method dump skipped, instructions count: 265
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.safedk.android.analytics.brandsafety.creatives.discoveries.k.a(java.lang.String, org.json.JSONObject):void");
    }

    private static boolean b(String str, JSONObject jSONObject) {
        return l.d(jSONObject) == 42 && b.containsKey(str);
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public CreativeInfo b(Object obj) {
        CreativeInfo creativeInfo;
        Logger.d(c, "match info - started. ad instance= ", obj);
        if (obj == null) {
            Logger.d(c, "match info - ad instance is null, returning.");
            return null;
        }
        String str = (String) obj;
        synchronized (this.J) {
            creativeInfo = this.J.get(str);
        }
        Logger.d(c, "match info - ci: ", creativeInfo);
        return creativeInfo;
    }

    public static String C(String str) {
        l.a d2 = l.d(str);
        if (d2 == null) {
            return null;
        }
        return l.a(d2);
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public String c(Object obj) {
        int identityHashCode = System.identityHashCode(obj);
        Logger.d(c, "get creative info after media player start call - player id= ", Integer.valueOf(identityHashCode));
        return c((String) null, String.valueOf(identityHashCode));
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public String c(String str, String str2) {
        Logger.d(c, "get ad id from resource - started, value: ", str, ", ad ID:", str2);
        if (str2 != null && !str2.startsWith("http")) {
            return str2;
        }
        return null;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public boolean e(View view) {
        if (!super.e(view) && !view.getClass().getName().startsWith(MBConfiguration.LOG_TAG)) {
            return false;
        }
        Logger.d(c, "is ad view: ", view.getClass().getName(), " is a Mintegral ad content view");
        return true;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d
    protected List<String> j() {
        return Arrays.asList(MBConfiguration.LOG_TAG);
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d
    protected String a(BrandSafetyUtils.AdType adType, Object obj, String str) {
        Object obj2;
        if ((obj instanceof String) && str.equals(m)) {
            String obj3 = obj.toString();
            Logger.d(c, "extract ad info - impression url: ", obj3);
            String C = C(obj3);
            if (!TextUtils.isEmpty(C)) {
                return C;
            }
            return null;
        }
        if ((obj instanceof Map) && (obj2 = ((Map) obj).get("showModel")) != null) {
            Logger.printFullVerboseLog(c, "extract ad info - showModelObj: ", obj2.toString());
            Matcher matcher = com.safedk.android.utils.g.a("currentAdModel=.*?imp_url=\\[(.*?)\\]").matcher(obj2.toString());
            while (matcher.find()) {
                String[] split = matcher.group(1).split(StringUtils.COMMA);
                Logger.printFullVerboseLog(c, "extract ad info - url size: ", Integer.valueOf(split.length));
                for (String str2 : split) {
                    Logger.printFullVerboseLog(c, "extract ad info - url: ", str2);
                    String C2 = C(str2);
                    if (!TextUtils.isEmpty(C2)) {
                        return C2;
                    }
                }
            }
            return null;
        }
        return null;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d
    protected String a(String str, CreativeInfo creativeInfo) {
        return null;
    }

    private static boolean D(String str) {
        boolean z;
        Iterator<String> it = h.iterator();
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            }
            if (str.contains(it.next())) {
                z = true;
                break;
            }
        }
        Logger.d(c, "should follow url - returning= ", Boolean.valueOf(z), ", url= ", str);
        return z;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d
    protected boolean B(String str) {
        boolean D = D(str);
        Logger.d(c, "should follow get url impl - returning= ", Boolean.valueOf(D), ", url= ", str);
        return D;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d
    protected boolean b(String str, Bundle bundle) {
        boolean D = D(str);
        Logger.d(c, "should follow input stream impl - returning= ", Boolean.valueOf(D), ", url= ", str);
        return D;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public Set<String> c() {
        return new HashSet();
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public AdNetworkDiscovery.WebViewResourceMatchingMethod b() {
        Logger.d(c, "get webView resource matching method - returning= ", AdNetworkDiscovery.WebViewResourceMatchingMethod.WEBVIEW_LOOKUP);
        return AdNetworkDiscovery.WebViewResourceMatchingMethod.WEBVIEW_LOOKUP;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public boolean k(String str) {
        Logger.d(c, "should ignore redirect url - ignoring redirect url: ", str);
        return false;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d
    public void i() {
        super.i();
        com.safedk.android.utils.e.a(o, "MintegralDiscovery:kToCInfo");
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public void e(String str) {
        if (str != null && str.contains("\"ads\"") && str.contains("\"ad_type\"")) {
            if (str.contains("\"bid_tk\"") || str.contains("\"bid_token\"")) {
                for (String str2 : b.keySet()) {
                    if (str.contains(str2)) {
                        Logger.printFullVerboseLog(c, Logger.FeatureTag.PREFETCH, "on JsonObject detected (new format prefetch): ", str);
                        CreativeInfoManager.a(this.U, str2, str, (Map<String, List<String>>) null);
                        return;
                    }
                }
                return;
            }
            if (str.startsWith("{\"status\"")) {
                Logger.printFullVerboseLog(c, Logger.FeatureTag.PREFETCH, "on JsonObject detected (legacy): ", str);
                CreativeInfoManager.a(this.U, "@!1:ad_fetch@!", str, (Map<String, List<String>>) null);
            }
        }
    }

    public static void a(Object obj, JSONObject jSONObject) {
        String f2 = f(obj);
        Logger.d(c, "on mintegral native controller - token id found= ", f2);
        if (!TextUtils.isEmpty(f2)) {
            CreativeInfoManager.a(com.safedk.android.utils.h.o, f2, jSONObject.toString(), (Map<String, List<String>>) null);
        }
    }

    private static String f(Object obj) {
        Object obj2;
        if (obj != null && obj.getClass().getSuperclass() != null) {
            for (Field field : obj.getClass().getSuperclass().getDeclaredFields()) {
                field.setAccessible(true);
                try {
                    obj2 = field.get(obj);
                } catch (Exception e2) {
                    Logger.d(c, "get token id from controller - exception= ", e2);
                }
                if (!(obj2 instanceof String)) {
                    continue;
                } else {
                    return (String) obj2;
                }
            }
            return null;
        }
        return null;
    }

    private static void a(String str, List<CreativeInfo> list) {
        c.a remove = b.remove(str);
        Logger.d(c, "handle native ci - max param found= ", remove);
        if (remove != null) {
            for (CreativeInfo creativeInfo : list) {
                creativeInfo.h(remove.a);
                creativeInfo.j(remove.c);
                if (remove.b == BrandSafetyEvent.AdFormatType.NATIVE) {
                    creativeInfo.r(str);
                }
            }
        }
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public List<String> e() {
        List<String> e2 = super.e();
        e2.add("url");
        return e2;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public void a(WeakReference<WebView> weakReference, String str) {
        if (weakReference == null || weakReference.get() == null || str == null) {
            return;
        }
        WebView webView = weakReference.get();
        try {
            Matcher matcher = com.safedk.android.utils.g.a("(.+?)://(.+?):(.+?)/(.+?)\\?(.*)?").matcher(str);
            if (!matcher.find()) {
                if (str.startsWith("mraid://")) {
                    String b2 = com.safedk.android.utils.k.b(str);
                    String d2 = com.safedk.android.utils.k.d(str, "url");
                    if ("open".equals(b2) || com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.n.e.equals(b2)) {
                        RedirectDetails.RedirectType redirectType = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.n.e.equals(b2) ? RedirectDetails.RedirectType.EXPAND : RedirectDetails.RedirectType.REDIRECT;
                        Logger.d(c, "on JS prompt, webview: ", webView, ", url: ", d2, ", command: mraid.js.", b2);
                        BrandSafetyUtils.a(com.safedk.android.utils.h.o, webView, d2, redirectType, "mraid.js." + b2);
                        return;
                    }
                    return;
                }
                return;
            }
            String group = matcher.group(1);
            String group2 = matcher.group(2);
            String group3 = matcher.group(4);
            String group4 = matcher.group(5);
            Logger.d(c, "on JS prompt, object: ", group2, ", command: ", group3, ", jsonParams: ", group4);
            if ("mv".equals(group) && ("click".equals(group3) || "load".equals(group3))) {
                JSONObject optJSONObject = new JSONObject(group4).optJSONObject("pt");
                if (optJSONObject != null) {
                    String optString = optJSONObject.optString("click_url");
                    Logger.d(c, "on JS prompt, webview: ", webView, ", url: ", optString, ", command: ", group, ".", group3);
                    BrandSafetyUtils.a(com.safedk.android.utils.h.o, webView, optString, RedirectDetails.RedirectType.REDIRECT, group + "." + group3);
                }
            } else if (("mv".equals(group) && "openUrl".equals(group3)) || ("mraid".equals(group) && ("open".equals(group3) || com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.n.e.equals(group3)))) {
                String optString2 = new JSONObject(group4).optString("url");
                RedirectDetails.RedirectType redirectType2 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.n.e.equals(group3) ? RedirectDetails.RedirectType.EXPAND : RedirectDetails.RedirectType.REDIRECT;
                Logger.d(c, "on JS prompt, webview: ", webView, ", url: ", optString2, ", command: ", group, ".", group3);
                BrandSafetyUtils.a(com.safedk.android.utils.h.o, webView, optString2, redirectType2, group + "." + group3);
            }
        } catch (Exception e2) {
            Logger.d(c, "on JS prompt exception, webview: ", webView, e2);
        }
    }
}
