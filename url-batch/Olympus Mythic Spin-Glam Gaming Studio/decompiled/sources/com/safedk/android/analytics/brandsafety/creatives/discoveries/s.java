package com.safedk.android.analytics.brandsafety.creatives.discoveries;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.text.TextUtils;
import android.webkit.WebView;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.RedirectDetails;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import com.safedk.android.analytics.brandsafety.creatives.h;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import com.safedk.android.analytics.brandsafety.creatives.infos.VerveCreativeInfo;
import com.safedk.android.utils.LimitedConcurrentHashMap;
import com.safedk.android.utils.Logger;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Matcher;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class s extends d {
    private static final String V = "(function(){var sdkId=\"{{SDK_ID}}\";var address=\"{{ADDRESS}}\";var log=function(message){try{console.log(\"message from verve privacy policy detector: \"+message);if(typeof window.webkit.messageHandlers.safedkDebug.postMessage===\"function\"){window.webkit.messageHandlers.safedkDebug.postMessage(message)}else{console.log(\"SafeDKWebApInterface safedkDebug object missing\")}}catch(error){}};var addObservers=function(){try{var dialogBoxElement=document.getElementById(\"survey_menu\");log(dialogBoxElement);if(dialogBoxElement){var allTextElements=dialogBoxElement.getElementsByTagName(\"text\");for(var textElement of allTextElements){var textContent=textElement.textContent;log(\"text content: \"+textContent);if(textContent){if(textContent.includes(\"Data Privacy Notice\")){var privacyTextParentElement=textElement.parentElement;if(privacyTextParentElement){var computedStyle=getComputedStyle(privacyTextParentElement);if(computedStyle){var displayState=computedStyle.display;if(displayState!=\"none\"){log(\"requesting no sampling\");if(typeof window.webkit.messageHandlers.safedkNoSampling.postMessage===\"function\"){window.webkit.messageHandlers.safedkNoSampling.postMessage(sdkId,address,window.outerHeight,window.outerWidth)}else{console.log(\"SafeDKWebApInterface safedkNoSampling object missing\")}}else{if(privacyTextParentElement.safedkPrivacyDialogObserver!=true){privacyTextParentElement.safedkPrivacyDialogObserver=true;try{var MutationObserver=window.WebKitMutationObserver||window.MutationObserver;var observer=new MutationObserver(function(mutations){mutations.forEach(function(mutation){switch(mutation.type){case\"attributes\":if(mutation.target.style.display!=\"none\"){log(\"requesting no sampling\");if(typeof window.webkit.messageHandlers.safedkNoSampling.postMessage===\"function\"){window.webkit.messageHandlers.safedkNoSampling.postMessage(sdkId,address,window.outerHeight,window.outerWidth)}else{console.log(\"SafeDKWebApInterface safedkNoSampling object missing\")}}log(\"verve privacy : Attribute name \"+mutation.attributeName+\" changed to \"+getComputedStyle(mutation.target).visibility+\" (was \"+mutation.oldValue+\")\");break}})});var config={attributes:true,attributeOldValue:true,attributeFilter:[\"style\"]};observer.observe(privacyTextParentElement,config)}catch(error){if(typeof window.webkit.messageHandlers.safedkNoSamplingExc.postMessage===\"function\"){window.webkit.messageHandlers.safedkNoSamplingExc.postMessage(error.message+\"\\n\"+error.stack)}else{console.log(\"SafeDKWebApInterface safedkNoSamplingExc object missing\")}}}}}}break}}}}else{log(\"verve privacy : no element to wrap\")}}catch(error){if(typeof window.webkit.messageHandlers.safedkNoSamplingExc.postMessage===\"function\"){window.webkit.messageHandlers.safedkNoSamplingExc.postMessage(error.message+\"\\n\"+error.stack)}else{console.log(\"SafeDKWebApInterface safedkNoSamplingExc object missing\")}}};addObservers();try{var MutationObserver=window.WebKitMutationObserver||window.MutationObserver;var observer=new MutationObserver(function(mutations){mutations.forEach(function(mutation){for(var i=0;i<mutation.addedNodes.length;i++){var node=mutation.addedNodes[i];if(node&&node.nodeName!=\"#text\"){addObservers()}}})});var config={childList:true,subtree:true};observer.observe(document,config)}catch(error){if(typeof window.webkit.messageHandlers.safedkNoSamplingExc.postMessage===\"function\"){window.webkit.messageHandlers.safedkNoSamplingExc.postMessage(error.message+\"\\n\"+error.stack)}else{console.log(\"SafeDKWebApInterface safedkNoSamplingExc object missing\")}}})();\n";
    private static final int W = 20;
    private static final int ad = 5;
    private static final String b = "VerveDiscovery";
    private static final String c = "admurl";
    private static final String d = "ads";
    private static final String e = "assets";
    private static final String f = "type";
    private static final String g = "beacons";
    private static final String h = "data";
    private static final String i = "vast";
    private static final String j = "html";
    private static final String k = "crid";
    private static final String l = "impID";
    private static final String m = "dspName";
    private static final String n = "net.pubnative.lite.sdk.mraid";
    private static final String o = "mraid://open";
    private static final String p = "url";
    private static final String q = "mraid://expand";
    private static final ConcurrentHashMap<String, String> X = new LimitedConcurrentHashMap(20);
    private static final ConcurrentHashMap<String, String> Y = new LimitedConcurrentHashMap(20);
    private static final int Z = 80;
    private static final ConcurrentHashMap<String, String> aa = new LimitedConcurrentHashMap(Z);
    private static final ConcurrentHashMap<String, String> ab = new LimitedConcurrentHashMap(Z);
    private static final ConcurrentHashMap<String, String> ac = new LimitedConcurrentHashMap(Z);
    private static final ConcurrentHashMap<String, WeakReference<WebView>> ae = new LimitedConcurrentHashMap(5);
    private static final ConcurrentHashMap<String, WeakReference<Object>> af = new LimitedConcurrentHashMap(5);

    public s() {
        super(com.safedk.android.utils.h.C, b);
        this.E.b(AdNetworkConfiguration.SUPPORTS_PREFETCH_RECEIVING_BY_APPLOVIN, true);
        this.E.b(AdNetworkConfiguration.SUPPORTS_BANNER_IMPRESSION_TRACKING, true);
        this.E.b(AdNetworkConfiguration.SUPPORTS_MREC_IMPRESSION_TRACKING, true);
        this.E.b(AdNetworkConfiguration.SUPPORTS_MREC_IMPRESSION_EOV, true);
        this.E.b(AdNetworkConfiguration.SUPPORTS_JAVASCRIPT_BASED_VIDEO_STATE_DETECTION, true);
        this.E.b(AdNetworkConfiguration.AD_NETWORK_SUPPORTS_PREFETCH_REUSE, true);
        this.E.b(AdNetworkConfiguration.SHOULD_GET_HTML_TEXT_TRAVERSE_IFRAMES, true);
        this.E.b(AdNetworkConfiguration.SHOULD_VIDEO_OBSERVER_TRAVERSE_IFRAMES, true);
        this.E.b(AdNetworkConfiguration.SUPPORTS_AUTO_REDIRECTS_IDENTIFICATION, true);
        this.E.b(AdNetworkConfiguration.SUPPORTS_EXPANDED_ADS_IDENTIFICATION, true);
        this.E.b(AdNetworkConfiguration.SHOULD_USE_RESOURCES_COLLECTION_SCRIPT_FULLSCREEN, true);
    }

    private void a(String str, c.a aVar) {
        JSONObject jSONObject;
        String str2 = null;
        try {
            jSONObject = new JSONObject(str);
            try {
                str2 = jSONObject.optString(c);
                if (str2.isEmpty()) {
                    Logger.d(b, "generate info - does not contain ad url param, exiting");
                    return;
                }
            } catch (Throwable th) {
                th = th;
                Logger.d(b, "generate info - not a valid JSON string: ", th.getMessage(), th);
                if (jSONObject != null) {
                }
                Logger.d(b, "generate info - obj is null or ad url is empty, ad url: ", str2, " skipping.");
                return;
            }
        } catch (Throwable th2) {
            th = th2;
            jSONObject = null;
        }
        if (jSONObject != null || TextUtils.isEmpty(str2)) {
            Logger.d(b, "generate info - obj is null or ad url is empty, ad url: ", str2, " skipping.");
            return;
        }
        Logger.d(b, "generate info - obj= ", jSONObject);
        VerveCreativeInfo verveCreativeInfo = new VerveCreativeInfo(BrandSafetyUtils.a(aVar.b), str2, aVar.d, aVar.b, aVar.c, this.I, aVar.a);
        synchronized (this.J) {
            this.J.put(str2, verveCreativeInfo);
        }
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d
    protected h.a a(CreativeInfo creativeInfo, String str, String str2, boolean z) {
        h.a a = super.a(creativeInfo, str, str2, z);
        if (a != null && creativeInfo.z()) {
            String c2 = a.c();
            Logger.d(b, "found inner vast ad id: ", c2, " setting in CI if not null");
            if (c2 != null) {
                ((VerveCreativeInfo) creativeInfo).a(c2);
            }
            List<String> i2 = a.i();
            if (!com.safedk.android.utils.n.a((Collection<?>) i2)) {
                Logger.printFullVerboseLog(b, "vast impression url to add: ", i2.get(i2.size() - 1));
                ((VerveCreativeInfo) creativeInfo).J(i2.get(i2.size() - 1));
            } else {
                Logger.d(b, "vast impression url - empty");
            }
        }
        return a;
    }

    private void d(CreativeInfo creativeInfo, String str) {
        if (a(creativeInfo, (String) null, str, true) != null) {
            Logger.d(b, "handle vast in prefetch: before - ", creativeInfo.h());
            if (creativeInfo.h() == null || !creativeInfo.h().contains("vast")) {
                creativeInfo.a("vast", "/");
            }
            Logger.d(b, "handle vast in prefetch: after - ", creativeInfo.h());
            if (!TextUtils.isEmpty(creativeInfo.O())) {
                Logger.d(b, "generate info - adding vast id: ", creativeInfo.O(), " with ad id: ", creativeInfo.L());
                ab.put(creativeInfo.O(), creativeInfo.L());
            }
        }
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d
    protected List<CreativeInfo> a(String str, String str2, Map<String, List<String>> map, c.a aVar, byte[] bArr) throws JSONException {
        Object[] objArr = new Object[2];
        objArr[0] = "generate info - started, url= ";
        int i2 = 1;
        objArr[1] = com.safedk.android.utils.n.a((Object) str) ? str : "content";
        Logger.d(b, objArr);
        if (aVar != null) {
            Logger.d(b, "max params are: ", aVar);
            a(str2, aVar);
            return new ArrayList();
        }
        CreativeInfo creativeInfo = this.J.get(str);
        if (creativeInfo == null) {
            Logger.d(b, "generate info - no mediate prefetch received for the following url");
            return new ArrayList();
        }
        int i3 = 4;
        Object[] objArr2 = new Object[4];
        objArr2[0] = "generate info - buffer size: ";
        objArr2[1] = str2 == null ? "0" : Integer.valueOf(str2.length());
        objArr2[2] = "requestHeaders: ";
        objArr2[3] = map;
        Logger.printFullVerboseLog(b, objArr2);
        Logger.d(b, "generate info - filling parameters for ci with id: ", creativeInfo.L(), " ad type: ", creativeInfo.K(), " ad format: ", creativeInfo.I());
        Logger.d(b, "generate info - ci placement id: ", creativeInfo.F(), " creative id: ", creativeInfo.N(), " event id: ", creativeInfo.n());
        ArrayList arrayList = new ArrayList();
        arrayList.add(creativeInfo);
        try {
            JSONArray jSONArray = new JSONObject(str2).getJSONArray("ads");
            Logger.d(b, "generate info - started iterating ", Integer.valueOf(jSONArray.length()), " ads");
            int i4 = 0;
            String str3 = null;
            while (i4 < jSONArray.length()) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i4);
                JSONArray jSONArray2 = optJSONObject.getJSONArray("assets");
                JSONObject jSONObject = jSONArray2.getJSONObject(0);
                String string = jSONObject.getString("type");
                Object[] objArr3 = new Object[i3];
                objArr3[0] = "generate info - first asset is: ";
                objArr3[i2] = jSONObject;
                objArr3[2] = " and content type is: ";
                objArr3[3] = string;
                Logger.d(b, objArr3);
                JSONObject jSONObject2 = jSONObject.has("data") ? jSONObject.getJSONObject("data") : null;
                if (string.startsWith("vast")) {
                    Object[] objArr4 = new Object[2];
                    objArr4[0] = "generate info - found vast prefetch: data - ";
                    objArr4[i2] = jSONObject2;
                    Logger.d(b, objArr4);
                    if (jSONObject2 != null && jSONObject2.has(string)) {
                        String string2 = jSONObject2.getString(string);
                        creativeInfo.e(string);
                        d(creativeInfo, string2);
                    }
                } else if (string.startsWith("html")) {
                    creativeInfo.e(string + "/mraid");
                    Object[] objArr5 = new Object[2];
                    objArr5[0] = "generate info - found html prefetch: data - ";
                    objArr5[i2] = jSONObject2;
                    Logger.d(b, objArr5);
                    if (jSONObject2 != null && jSONObject2.has("html")) {
                        String string3 = jSONObject2.getString("html");
                        if (com.safedk.android.analytics.brandsafety.creatives.h.b(string3)) {
                            d(creativeInfo, string3);
                        }
                        String g2 = com.safedk.android.utils.k.g(string3);
                        Object[] objArr6 = new Object[2];
                        objArr6[0] = "generate info - found html content: ";
                        objArr6[i2] = g2;
                        Logger.printFullVerboseLog(b, objArr6);
                        String replace = string3.replace("\\\"", "\"");
                        String b2 = b(replace, creativeInfo, "generateInfoImp");
                        String substring = b2 != null ? b2.substring(b2.indexOf("/") + i2) : null;
                        if (b2 != null) {
                            if (substring.equals(creativeInfo.N())) {
                                synchronized (aa) {
                                    if (aa.containsKey(b2)) {
                                        Logger.d(b, "generate info - impIdToAdId map already contains: ", b2);
                                    }
                                    aa.put(b2, creativeInfo.L());
                                    ((VerveCreativeInfo) creativeInfo).K(b2);
                                }
                            } else {
                                Logger.d(b, "generate info - found creative id: ", substring, " different than CI's creative id: ", creativeInfo.N());
                            }
                        } else {
                            Logger.d(b, "generate info - did not find impId with crid");
                        }
                        b(replace, creativeInfo);
                        e(creativeInfo, g2);
                        creativeInfo.b((List<String>) com.safedk.android.utils.n.f(g2));
                        str3 = g2.replaceAll("\\s+|\\r|\\\\n", "");
                    }
                } else {
                    Logger.d(b, "generate info - found unrecognized prefetch with content type: ", string);
                }
                int length = optJSONObject.getJSONArray("assets").length();
                Logger.d(b, "generate info - found assets count: ", Integer.valueOf(length));
                for (int i5 = 1; i5 < length; i5++) {
                    JSONObject jSONObject3 = jSONArray2.getJSONObject(i5);
                    if (jSONObject3.has("type")) {
                        creativeInfo.a(jSONObject3.getString("type"), "/");
                    }
                }
                int length2 = optJSONObject.has(g) ? optJSONObject.getJSONArray(g).length() : 0;
                Logger.d(b, "generate info - found ", Integer.valueOf(length2), " beacons");
                JSONArray jSONArray3 = length2 > 0 ? optJSONObject.getJSONArray(g) : null;
                for (int i6 = 0; i6 < length2; i6++) {
                    JSONObject jSONObject4 = jSONArray3.getJSONObject(i6);
                    if (jSONObject4.has("data")) {
                        Iterator<String> it = com.safedk.android.utils.n.f(com.safedk.android.utils.k.g(jSONObject4.getString("data"))).iterator();
                        while (it.hasNext()) {
                            creativeInfo.w(it.next());
                        }
                    }
                }
                synchronized (ae) {
                    if (string.startsWith("html") && str3 != null) {
                        Logger.d(b, "generate info - adding ad id: ", creativeInfo.L(), " to ad id to prefetch content map");
                        X.put(creativeInfo.L(), str3);
                        List<String> a = com.safedk.android.analytics.brandsafety.creatives.e.a(com.safedk.android.analytics.brandsafety.creatives.e.d(), str3, 1, false);
                        if (!a.isEmpty()) {
                            String str4 = a.get(0);
                            Logger.d(b, "generate info - adding ad id: ", creativeInfo.L(), " to html body to id. body resource= ", str4);
                            Y.put(str4, creativeInfo.L());
                        }
                    }
                    String H = creativeInfo.H();
                    if (H != null) {
                        Logger.d(b, "generate info - video url is: ", H);
                        synchronized (ac) {
                            if (ac.containsKey(H)) {
                                Logger.d(b, "generate info - found video url that appeared more than once, not entering");
                                ac.remove(H);
                            } else {
                                ac.put(H, creativeInfo.L());
                            }
                        }
                    }
                }
                i4++;
                i3 = 4;
                i2 = 1;
            }
        } catch (Throwable th) {
            Logger.d(b, "generate info - not a valid JSON string: ", th.getMessage(), th);
        }
        return arrayList;
    }

    private String a(String str, CreativeInfo creativeInfo, String str2) {
        try {
        } catch (Throwable th) {
            Logger.d(b, "extract json data - exception: ", th);
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        if (creativeInfo != null && jSONObject.has(m)) {
            String optString = jSONObject.optString(m);
            if (!TextUtils.isEmpty(optString)) {
                Logger.d(b, "extract json data - found buyer id - ", optString, " for ad id: ", creativeInfo.L());
                creativeInfo.m(optString);
            }
        }
        if (jSONObject.has(k) && jSONObject.has(l)) {
            String string = jSONObject.getString(k);
            String string2 = jSONObject.getString(l);
            Logger.d(b, "extract json data - found json with creative id: ", string, " and impId: ", string2, " origin method: ", str2);
            return string2 + "/" + string;
        }
        Logger.d(b, "extract json data - did not find creative id or impId origin method: ", str2);
        return null;
    }

    private String b(String str, CreativeInfo creativeInfo, String str2) {
        Matcher matcher = com.safedk.android.utils.g.a("adm.*?JSON.parse\\(.*?\\(\"(eyJ.*?)\"").matcher(str);
        if (matcher.find() && matcher.groupCount() >= 1) {
            String m2 = com.safedk.android.utils.k.m(matcher.group(1));
            Logger.printFullVerboseLog(b, "extract base64 json - found content: ", m2);
            return a(m2, creativeInfo, str2);
        }
        Matcher matcher2 = com.safedk.android.utils.g.a("(\\{\"[^{}]*\"crid\"[^{}]*\\})").matcher(str);
        if (matcher2.find() && matcher2.groupCount() >= 1) {
            String group = matcher2.group(1);
            Logger.printFullVerboseLog(b, "extract regular json - found content: ", group);
            return a(group, creativeInfo, str2);
        }
        return null;
    }

    private void e(CreativeInfo creativeInfo, String str) {
        String F;
        if (creativeInfo.M() == null && (F = F(str)) != null) {
            Logger.d(b, "set Click Url From Dsp - found ", F);
            creativeInfo.a(F, true);
        }
    }

    private void b(String str, CreativeInfo creativeInfo) {
        try {
            Matcher matcher = com.safedk.android.utils.g.a("=\"adm\">(.*?)</div>").matcher(str);
            if (matcher.find() && matcher.groupCount() >= 1) {
                String m2 = com.safedk.android.utils.k.m(matcher.group(1));
                Logger.printFullVerboseLog(b, "find encoded html in prefetch data - found content: ", m2);
                String g2 = com.safedk.android.utils.k.g(m2);
                creativeInfo.b((List<String>) com.safedk.android.utils.n.f(g2));
                e(creativeInfo, g2);
                if (com.safedk.android.analytics.brandsafety.creatives.h.b(g2)) {
                    d(creativeInfo, g2);
                }
            }
        } catch (Throwable th) {
            Logger.d(b, "exception occurred while trying to encode html section: ", th);
        }
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d
    protected String a(String str, CreativeInfo creativeInfo) {
        return str;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d
    protected boolean B(String str) {
        return false;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d
    protected boolean b(String str, Bundle bundle) {
        boolean z = str != null && this.J.containsKey(str);
        Logger.d(b, "should follow input stream for url: ", str, " result is: ", Boolean.valueOf(z));
        return z;
    }

    private String C(String str) {
        Logger.d(b, "find inner ad content, webview resource prefix value: ", str.substring(0, Math.min(500, str.length())));
        synchronized (X) {
            for (String str2 : X.keySet()) {
                String str3 = X.get(str2);
                if (str3 != null) {
                    Logger.d(b, "find inner ad content, prefetch content prefix is:    ", str3.substring(0, Math.min(500, str3.length())));
                    if (str.contains(str3)) {
                        Logger.d(b, "found inner ad content where the data loaded contains the prefetch html, is equal? ", Boolean.valueOf(str.equals(str3)));
                        return str2;
                    }
                    if (str3.contains(str)) {
                        Logger.d(b, "found inner ad content where the prefetch html contains the data loaded");
                        return str2;
                    }
                }
            }
            Logger.d(b, "find inner ad content, did not find any adId for the webview - ad id to prefetch map keys: ", X.keySet());
            List<String> a = com.safedk.android.analytics.brandsafety.creatives.e.a(com.safedk.android.analytics.brandsafety.creatives.e.d(), str, 1, false);
            if (!a.isEmpty()) {
                String str4 = Y.get(a.get(a.size() - 1));
                if (!TextUtils.isEmpty(str4)) {
                    Logger.d(b, "find inner ad content, found the data loaded html body equals to the prefetch html body. ad id= ", str4);
                    return str4;
                }
                return null;
            }
            return null;
        }
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public String a(String str, String str2, WeakReference<WebView> weakReference) {
        String str3;
        if (str == null) {
            return null;
        }
        synchronized (ae) {
            Object[] objArr = new Object[2];
            objArr[0] = "get ad id from resource started - webview: ";
            objArr[1] = weakReference != null ? weakReference.get() : null;
            Logger.d(b, objArr);
            String replaceAll = com.safedk.android.utils.k.g(str).replaceAll("\\s+|\\r|\\\\n", "");
            String C = C(replaceAll);
            if (C == null || !this.J.containsKey(C)) {
                String b2 = b(replaceAll, (CreativeInfo) null, "getAdIdFromResource");
                Logger.d(b, "get ad id from resource - impId and crid values are: ", b2);
                synchronized (aa) {
                    if (b2 == null) {
                        str3 = null;
                    } else {
                        try {
                            str3 = aa.get(b2);
                        } finally {
                        }
                    }
                    if (str3 != null) {
                        if (X.containsKey(str3)) {
                            String str4 = aa.get(b2);
                            Logger.d(b, Logger.FeatureTag.CI_MATCHING, "get ad id from resource - matching found via Imp Id, adId=", str4);
                            return str4;
                        }
                        Logger.d(b, "get ad id from resource - impIdCrid exists but ad id - ", str3, " was not found in adId to prefetch: ", X.keySet());
                    }
                    if (com.safedk.android.utils.n.a((Reference<?>) weakReference)) {
                        ae.put(replaceAll, weakReference);
                        Logger.d(b, "get ad id from resource - storing the webview address: ", BrandSafetyUtils.a((Object) weakReference.get()));
                    } else {
                        Logger.d(b, "get ad id from resource - webview is null, not storing the decoded value");
                    }
                    return null;
                }
            }
            Logger.d(b, Logger.FeatureTag.CI_MATCHING, "get ad id from resource - matching found via inner prefetch, adId=", C);
            return C;
        }
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d
    public void i() {
        super.i();
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public AdNetworkDiscovery.WebViewResourceMatchingMethod b() {
        return AdNetworkDiscovery.WebViewResourceMatchingMethod.WEBVIEW_LOOKUP;
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x015c, code lost:
    
        com.safedk.android.utils.Logger.d(com.safedk.android.analytics.brandsafety.creatives.discoveries.s.b, "try reverse matching: matching found via Imp Id, adId=", r14);
     */
    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean n(String str) {
        String str2;
        String str3;
        String next;
        synchronized (X) {
            if (!X.containsKey(str)) {
                Logger.d(b, "try reverse matching: with ad id - ad id ", str, " is not in the adIdToPrefetchContent keys: ", X.keySet());
                return false;
            }
            try {
                synchronized (X) {
                    str2 = X.get(str);
                }
            } catch (Throwable th) {
                Logger.d(b, "try reverse matching encountered exception: ", th);
            }
            if (str2 == null) {
                Logger.d(b, "try reverse matching: prefetchContent is null");
                return false;
            }
            Logger.printFullVerboseLog(b, "try reverse matching: prefetchContent: ", str2);
            Logger.printFullVerboseLog(b, "try reverse matching: adUrlToCI keys: ", this.J.keySet());
            synchronized (ae) {
                Logger.printFullVerboseLog(b, "try reverse matching: webViewContentToWebviewRef keys: ", ae.keySet());
                Logger.d(b, "try reverse matching: prefetch content prefix is: ", str2.substring(0, Math.min(500, str2.length())));
                Iterator<String> it = ae.keySet().iterator();
                while (true) {
                    str3 = null;
                    if (!it.hasNext()) {
                        break;
                    }
                    next = it.next();
                    if (next != null) {
                        Logger.d(b, "try reverse matching: webview resource prefix value: ", next.substring(0, Math.min(500, next.length())));
                        if (next.contains(str2)) {
                            Logger.d(b, "try reverse matching: matching found via inner prefetch where the data loaded contains the prefetch html, is equal? ", Boolean.valueOf(next.equals(str2)));
                            break;
                        }
                        if (str2.contains(next)) {
                            Logger.d(b, "try reverse matching: matching found via inner prefetch where the prefetch html contains the data loaded");
                            break;
                        }
                        List<String> a = com.safedk.android.analytics.brandsafety.creatives.e.a(com.safedk.android.analytics.brandsafety.creatives.e.d(), next, 1, false);
                        if (!a.isEmpty()) {
                            String str4 = Y.get(a.get(a.size() - 1));
                            if (!TextUtils.isEmpty(str4) && str4.equals(str)) {
                                Logger.d(b, "try reverse matching: matching found via inner prefetch where the html body loaded contains equals to prefetch html body");
                                break;
                            }
                        }
                        String b2 = b(next, (CreativeInfo) null, "tryReverseMatching");
                        Logger.d(b, "try reverse matching: impId and crid values are: ", b2);
                        synchronized (aa) {
                            if (b2 != null) {
                                try {
                                    str3 = aa.get(b2);
                                } finally {
                                }
                            }
                            if (str.equals(str3)) {
                                break;
                            }
                        }
                        break;
                    }
                }
                str3 = next;
            }
            if (str3 == null) {
                Logger.d(b, "try reverse matching: did not find any webview resources for the given prefetch with ad id: ", str);
                return false;
            }
            WeakReference<WebView> weakReference = ae.get(str3);
            if (!com.safedk.android.utils.n.a((Reference<?>) weakReference)) {
                Logger.d(b, "try reverse matching: webViewRef is null or points to null - webviewRef: ", weakReference);
                return false;
            }
            WebView webView = weakReference.get();
            if (this.J.get(str) != null) {
                if (c(webView, str)) {
                    Logger.d(b, Logger.FeatureTag.CI_MATCHING, "try reverse matching: found a match using reverse! adId=", str);
                    ae.remove(str3);
                    return true;
                }
            } else {
                Logger.d(b, "try reverse matching: adIdToCI does not contain adId");
            }
            return false;
        }
    }

    private void D(String str) {
        String remove;
        VerveCreativeInfo verveCreativeInfo;
        synchronized (X) {
            remove = X.remove(str);
        }
        Logger.d(b, "clean resources started with ad id: ", str, ", and source is: ", remove);
        synchronized (this.J) {
            verveCreativeInfo = (VerveCreativeInfo) this.J.remove(str);
        }
        if (verveCreativeInfo != null && verveCreativeInfo.au() != null) {
            aa.remove(verveCreativeInfo.au());
        }
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public void o(String str) {
        CreativeInfo creativeInfo = this.J.get(str);
        if (creativeInfo != null && creativeInfo.K() != BrandSafetyUtils.AdType.BANNER && creativeInfo.K() != BrandSafetyUtils.AdType.MREC) {
            D(str);
        }
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public void p(String str) {
        D(str);
    }

    private String a(List<String> list) {
        String str;
        synchronized (ac) {
            Iterator<String> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    str = null;
                    break;
                }
                str = it.next();
                if (ac.containsKey(str)) {
                    break;
                }
            }
        }
        if (str != null) {
            Logger.d(b, "link ad params to video url: found video url - ", str, " with CI id - ", ac.get(str));
        }
        return str;
    }

    public Object f(Object obj) {
        for (Field field : obj.getClass().getDeclaredFields()) {
            field.setAccessible(true);
            try {
            } catch (Throwable th) {
                Logger.d(b, "get ad params from controller - exception occurred!", th);
            }
            if (!field.getType().getSimpleName().endsWith("AdParams")) {
                continue;
            } else {
                Object obj2 = field.get(obj);
                Logger.d(b, "Field name: ", field.getName(), ", Field class: ", field.getType().getName(), ", adParams: ", obj2);
                return obj2;
            }
        }
        Logger.d(b, "get ad params from controller - did not find ad params object");
        return null;
    }

    private HashSet<String> g(Object obj) {
        Field declaredField;
        List list;
        try {
            Method declaredMethod = obj.getClass().getDeclaredMethod("getImpressions", new Class[0]);
            declaredMethod.setAccessible(true);
            List list2 = (List) declaredMethod.invoke(obj, new Object[0]);
            Object[] objArr = new Object[4];
            objArr[0] = "get inner impression url from ad params method - Returned class: ";
            objArr[1] = list2 != null ? list2.getClass().getName() : null;
            objArr[2] = " value: ";
            objArr[3] = list2;
            Logger.d(b, objArr);
            if (list2 != null && !list2.isEmpty() && (list2.get(0) instanceof String)) {
                Logger.d(b, "find inner impression url list in ad params method - Returned list: ", list2);
                return new HashSet<>(list2);
            }
        } catch (Throwable th) {
            Logger.d(b, "exception while extracting inner impression url from the Ad Params using getter: ", th);
        }
        try {
            declaredField = obj.getClass().getDeclaredField("impressions");
            declaredField.setAccessible(true);
            list = (List) declaredField.get(obj);
            Object[] objArr2 = new Object[4];
            objArr2[0] = "get inner impression url from ad params field - Returned class: ";
            objArr2[1] = list != null ? list.getClass().getName() : null;
            objArr2[2] = " value: ";
            objArr2[3] = list;
            Logger.d(b, objArr2);
        } catch (Throwable th2) {
            Logger.d(b, "exception while extracting inner impression url from the Ad Params using field: ", th2);
        }
        if (list != null && !list.isEmpty() && (list.get(0) instanceof String)) {
            Logger.d(b, "find inner impression url list in ad params field - Returned list: ", list);
            return new HashSet<>(list);
        }
        Logger.d(b, "did not find proper inner impression url in field, instead: Field class: ", declaredField.getType().getName(), " Field value: ", declaredField);
        return null;
    }

    private String h(Object obj) {
        Field declaredField;
        Object obj2;
        try {
            Method declaredMethod = obj.getClass().getDeclaredMethod("getId", new Class[0]);
            declaredMethod.setAccessible(true);
            Object invoke = declaredMethod.invoke(obj, new Object[0]);
            Object[] objArr = new Object[4];
            objArr[0] = "get vast id from ad params - Returned class: ";
            objArr[1] = invoke != null ? invoke.getClass().getName() : null;
            objArr[2] = " value: ";
            objArr[3] = invoke;
            Logger.d(b, objArr);
            if (invoke instanceof String) {
                return (String) invoke;
            }
        } catch (Throwable th) {
            Logger.d(b, "exception while extracting vast id from the Ad Params using getter: ", th);
        }
        try {
            declaredField = obj.getClass().getDeclaredField("id");
            declaredField.setAccessible(true);
            obj2 = declaredField.get(obj);
        } catch (Throwable th2) {
            Logger.d(b, "exception while extracting vast id from the Ad Params using field: ", th2);
        }
        if (!(obj2 instanceof String)) {
            Logger.d(b, "did not find proper vast id, instead: Field class: ", declaredField.getType().getName(), "Field value: ", obj2);
            return null;
        }
        return (String) obj2;
    }

    private String i(Object obj) {
        try {
            String a = BrandSafetyUtils.a(obj);
            Method declaredMethod = obj.getClass().getDeclaredMethod("getVideoFileUrlsList", new Class[0]);
            declaredMethod.setAccessible(true);
            Object invoke = declaredMethod.invoke(obj, new Object[0]);
            Object[] objArr = new Object[6];
            objArr[0] = "find video url in ad params - with address: ";
            objArr[1] = a;
            objArr[2] = " Returned class: ";
            objArr[3] = invoke != null ? invoke.getClass().getName() : null;
            objArr[4] = " value: ";
            objArr[5] = invoke;
            Logger.d(b, objArr);
            if (invoke instanceof List) {
                List<String> list = (List) invoke;
                if (!list.isEmpty() && (list.get(0) instanceof String)) {
                    Logger.d(b, "find video url in ad params - Returned list: ", list);
                    return a(list);
                }
            }
        } catch (Throwable th) {
            Logger.d(b, "exception while handling finding video url from the Ad Params: ", th);
        }
        Logger.d(b, "find video url in ad params - did not find video url");
        return null;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public CreativeInfo c(Object obj, Object obj2) {
        CreativeInfo remove;
        StringBuilder sb;
        try {
            af.put(BrandSafetyUtils.a(obj2), new WeakReference<>(obj));
            Object f2 = f(obj);
            if (f2 == null) {
                return null;
            }
            Logger.d(b, "on video bind to controller - started with adParams address: ", BrandSafetyUtils.a(f2));
            String h2 = h(f2);
            if (h2 == null) {
                Logger.d(b, "on video bind to controller - could not find vast id");
            }
            String i2 = i(f2);
            String str = h2 != null ? ab.get(h2) : null;
            if (str == null && i2 != null) {
                str = ac.get(i2);
                Logger.d(b, "on video bind to controller - retrieving ad id using the video url, adId: ", str);
            }
            if (str == null) {
                HashSet<String> g2 = g(f2);
                if (!com.safedk.android.utils.n.a((Collection<?>) g2)) {
                    synchronized (this.J) {
                        Iterator<Map.Entry<String, CreativeInfo>> it = this.J.entrySet().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            Map.Entry<String, CreativeInfo> next = it.next();
                            VerveCreativeInfo verveCreativeInfo = (VerveCreativeInfo) next.getValue();
                            Logger.d(b, "on video bind to controller - current inner impression is: ", verveCreativeInfo.at());
                            if (g2.contains(verveCreativeInfo.at())) {
                                String key = next.getKey();
                                Logger.d(b, "on video bind to controller - found ad id using inner impression url: ", verveCreativeInfo.at(), " ad id: ", key);
                                str = key;
                                break;
                            }
                        }
                    }
                }
            }
            if (str == null && h2 != null) {
                synchronized (this.J) {
                    Iterator<Map.Entry<String, CreativeInfo>> it2 = this.J.entrySet().iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        Map.Entry<String, CreativeInfo> next2 = it2.next();
                        if (h2.equals(((VerveCreativeInfo) next2.getValue()).as())) {
                            String key2 = next2.getKey();
                            Logger.d(b, "on video bind to controller - found ad id using inner vast ad id, vast id: ", h2, " ad id: ", key2);
                            str = key2;
                            break;
                        }
                    }
                }
            }
            if (str == null) {
                Logger.d(b, "on video bind to controller - did not find ad id");
                return null;
            }
            if (i2 != null && ac.get(i2) != null && !ac.get(i2).equals(str)) {
                Logger.d(b, "on video bind to controller - found a mismatch between video url stored - ", i2, " vs related ad id: ", str);
                return null;
            }
            if (i2 != null) {
                ac.remove(i2);
            }
            if (h2 != null) {
                ab.remove(h2);
            }
            Logger.d(b, "on video bind to controller - found ad id - ", str);
            synchronized (this.J) {
                remove = this.J.remove(str);
            }
            if (h2 != null) {
                sb = new StringBuilder();
                sb.append("vast=");
                sb.append(h2);
            } else {
                sb = new StringBuilder();
                sb.append("videoUrl=");
                sb.append(i2);
            }
            String sb2 = sb.toString();
            if (remove != null) {
                remove.u("MBT:" + sb2);
            }
            return remove;
        } catch (Throwable th) {
            Logger.d(b, "exception while handling binding between video view and prefetch: ", th);
            Logger.d(b, "on video bind to controller - did not find ad id");
            return null;
        }
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public String m(String str) {
        if (str != null && (str.contains(o) || str.contains(q))) {
            return com.safedk.android.utils.k.d(str, "url");
        }
        return str;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public RedirectDetails.RedirectType l(String str) {
        if (str != null) {
            if (str.contains(o)) {
                return RedirectDetails.RedirectType.REDIRECT;
            }
            if (str.contains(q)) {
                return RedirectDetails.RedirectType.EXPAND;
            }
        }
        return RedirectDetails.RedirectType.REDIRECT;
    }

    private MediaPlayer j(Object obj) {
        Object obj2;
        try {
            Field declaredField = obj.getClass().getDeclaredField("mMediaPlayer");
            declaredField.setAccessible(true);
            Logger.d(b, "get media player address - Field class: ", declaredField.getType().getName(), " value: ", declaredField);
            obj2 = declaredField.get(obj);
        } catch (Throwable th) {
            Logger.d(b, "exception while extracting media player address from the controller using field: ", th);
        }
        if (obj2 instanceof MediaPlayer) {
            Logger.d(b, "get media player address - found a mediaPlayer object: ", obj2);
            return (MediaPlayer) obj2;
        }
        Object[] objArr = new Object[2];
        objArr[0] = "get media player address - did not find a mediaPlayer object, instead found: ";
        objArr[1] = obj2 != null ? obj2.getClass() : null;
        Logger.d(b, objArr);
        return null;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public boolean a(com.safedk.android.analytics.brandsafety.c cVar) {
        List<String> x = cVar.x();
        Logger.d(b, "is MediaPlayer Playing started: ", x);
        for (String str : x) {
            if (af.get(str) != null) {
                WeakReference<Object> weakReference = af.get(str);
                if (com.safedk.android.utils.n.a((Reference<?>) weakReference)) {
                    MediaPlayer j2 = j(weakReference.get());
                    Logger.d(b, "found a media player: ", j2);
                    return com.safedk.android.utils.n.a(j2);
                }
            }
        }
        return false;
    }
}
