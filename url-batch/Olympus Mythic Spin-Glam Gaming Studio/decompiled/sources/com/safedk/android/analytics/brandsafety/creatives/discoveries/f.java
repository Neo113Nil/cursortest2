package com.safedk.android.analytics.brandsafety.creatives.discoveries;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import android.webkit.WebView;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.analytics.brandsafety.creatives.ProtobufMessageParser;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import com.safedk.android.analytics.brandsafety.creatives.infos.ChartboostCreativeInfo;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import com.safedk.android.utils.Logger;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class f extends d {
    private static final String V = "renderables";
    private static final String W = "impID";
    private static final String X = "config";
    private static final String Y = "markup_type";
    private static final String Z = "/renderable_count_";
    private static final String aa = "adm.js";
    private static final String ab = "ad_domain";
    private static final String ac = "app_name";
    private static final String ad = "elements";
    private static final String ae = "name";
    private static final String af = "type";
    private static final String ag = "value";
    private static final String ah = "events";
    private static final String ai = "images";
    private static final String aj = "impression_id";
    private static final String ak = "media-type";
    private static final String al = "preCachedVideo";
    private static final String am = "webview";
    private static final String an = "chartboost.com";
    private static final String ao = "cb_val";
    private static final String ap = "url";
    private static final String aq = "buyerId6";
    private static final String ar = "buyerId8";
    private static final String as = "{\"1\":[\"url\",\"string\"],\"6\":[\"buyerId6\",\"string\"],\"8\":[\"buyerId8\",\"string\"]}";
    private static final String at = "bics=";
    private static final String au = "null";
    private static final String av = "CHARTBOOST_NETWORK";
    private static final String aw = "KEY_INTENT_URL";
    public static final String b = "(function(){var sdkId=\"{{SDK_ID}}\";var address=\"{{ADDRESS}}\";var ppDetectReported=false;var ppElementFound=false;var log=function(message){try{if(typeof window.webkit.messageHandlers.safedkDebug.postMessage===\"function\"){window.webkit.messageHandlers.safedkDebug.postMessage(\"chartboost pp, address \"+address+\": \"+message)}else{console.log(\"SafeDKWebApInterface safedkDebug object missing\")}}catch(error){}};function observeClassChanges(element){const classObserver=new MutationObserver((mutationsList,classObserver)=>{for(const mutation of mutationsList){if(mutation.type===\"attributes\"&&mutation.attributeName===\"class\"){var elementClassName=element.className;if(elementClassName&&elementClassName.includes(\"privacy_overlay\")){if(typeof window.webkit.messageHandlers.safedkNoSampling.postMessage===\"function\"){window.webkit.messageHandlers.safedkNoSampling.postMessage(sdkId,address,0,0);classObserver.disconnect()}else{console.log(\"SafeDKWebApInterface safedkNoSampling object missing\")}}}}});classObserver.observe(element,{attributes:true,attributeFilter:[\"class\"]})}function checkIfBannerElementVisible(element){var elementClassName=element.className;if(elementClassName&&!elementClassName.includes(\"hidden\")&&!ppDetectReported){if(typeof window.webkit.messageHandlers.safedkNoSampling.postMessage===\"function\"){ppDetectReported=true;log(\"banner pp element found\");window.webkit.messageHandlers.safedkNoSampling.postMessage(sdkId,address,0,0);classObserver.disconnect()}else{console.log(\"SafeDKWebApInterface safedkNoSampling object missing\")}}}function observeClassChangesBanner(element){checkIfBannerElementVisible(element);const classObserver=new MutationObserver((mutationsList,classObserver)=>{for(const mutation of mutationsList){if(mutation.type===\"attributes\"&&mutation.attributeName===\"class\"){checkIfBannerElementVisible(element)}}});classObserver.observe(element,{attributes:true,attributeFilter:[\"class\"]})}function findPrivacyPolicyElement(){const privacyPolicyElement=document.getElementById(\"privacy-policy\");if(privacyPolicyElement){ppElementFound=true;observeClassChanges(privacyPolicyElement)}const privacyPolicyBannerElement=document.getElementById(\"privacy-policy-banner\");if(privacyPolicyBannerElement){ppElementFound=true;observeClassChangesBanner(privacyPolicyBannerElement)}}function observeElementAddition(){const observer=new MutationObserver((mutationsList,observer)=>{findPrivacyPolicyElement()});observer.observe(document,{childList:true,subtree:true})}var counter=0;setTimeout(()=>{if(!ppElementFound&&counter<4){counter++;findPrivacyPolicyElement()}},500);observeElementAddition()})();\n";
    private static final String c = "ChartboostDiscovery";
    private static final String d = "/auction/sdk/banner";
    private static final String e = "crid";
    private static final String f = "imptrackers";
    private static final String g = "adm";
    private static final String h = "adomain";
    private static final String i = "bid";
    private static final String j = "bundle";
    private static final String k = "crtype";
    private static final String l = "ext";
    private static final String m = "impressionid";
    private static final String n = "seatbid";
    private static final String o = "seat";
    private static final String p = "nurl";
    private static final String q = "lurl";
    private static final Map<String, String> ax = new HashMap();
    private static final Map<String, List<CreativeInfo>> ay = new HashMap();
    private static final List<List<CreativeInfo>> az = new ArrayList();
    private static final Map<String, CreativeInfo> aA = new HashMap();
    private static final Map<String, WeakReference<WebView>> aB = new HashMap();

    public f() {
        super(com.safedk.android.utils.h.c, c);
        this.E.b(AdNetworkConfiguration.SUPPORTS_PREFETCH_RECEIVING_BY_APPLOVIN, true);
        this.E.b(AdNetworkConfiguration.SUPPORTS_BANNER_IMPRESSION_TRACKING, true);
        this.E.b(AdNetworkConfiguration.SUPPORTS_MREC_IMPRESSION_TRACKING, true);
        this.E.b(AdNetworkConfiguration.SUPPORTS_JAVASCRIPT_BASED_VIDEO_STATE_DETECTION, true);
        this.E.b(AdNetworkConfiguration.SHOULD_VIDEO_OBSERVER_TRAVERSE_IFRAMES, true);
        this.E.b(AdNetworkConfiguration.SHOULD_GET_HTML_TEXT_TRAVERSE_IFRAMES, true);
        this.E.b(AdNetworkConfiguration.SUPPORTS_AUTO_REDIRECTS_IDENTIFICATION, true);
        this.E.b(AdNetworkConfiguration.JS_PRIVACY_BUTTON_CLICK_DETECTION_SCRIPT, b);
        this.E.b(AdNetworkConfiguration.SUPPORTS_JAVASCRIPT_BASED_PRIVACY_BUTTON_CLICK_DETECTION_IN_FULLSCREEN_ADS, true);
        this.E.b(AdNetworkConfiguration.SHOULD_USE_RESOURCES_COLLECTION_SCRIPT_FULLSCREEN, true);
        this.E.b(AdNetworkConfiguration.DONT_USE_PLACEMENT_ID_IN_BANNER_AD_INFO_KEY, av);
        this.E.b(AdNetworkConfiguration.USE_INPUT_STREAM_EVENT_AS_RESOURCE_LOADED_INDICATION, true);
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d
    protected List<CreativeInfo> a(String str, String str2, Map<String, List<String>> map, c.a aVar, byte[] bArr) throws JSONException {
        boolean z;
        Logger.d(c, "generate info impl - started. max params= ", aVar, ", url= ", str);
        BrandSafetyUtils.AdType adType = BrandSafetyUtils.AdType.INTERSTITIAL;
        if (aVar != null) {
            adType = BrandSafetyUtils.b(aVar.b.name());
            z = true;
        } else if (!str.contains(d)) {
            z = false;
        } else {
            adType = BrandSafetyUtils.AdType.BANNER;
            z = true;
        }
        Logger.d(c, "generate info impl - ad type set to= ", adType);
        ChartboostCreativeInfo chartboostCreativeInfo = new ChartboostCreativeInfo(adType, com.safedk.android.utils.h.c, this.I);
        ArrayList arrayList = new ArrayList();
        arrayList.add(chartboostCreativeInfo);
        if (aVar != null) {
            chartboostCreativeInfo.h(aVar.a);
            chartboostCreativeInfo.j(aVar.c);
        }
        if (z) {
            try {
                str2 = new String(Base64.decode(str2, 0));
            } catch (Exception e2) {
                Logger.d(c, "generate info impl - buffer value is not encoded");
            }
        }
        if (com.safedk.android.utils.n.n(str2)) {
            JSONObject jSONObject = new JSONObject(str2);
            if (z) {
                Logger.d(c, "generate info impl - updating ci bidding info");
                a(arrayList, jSONObject, aVar);
            } else {
                Logger.d(c, "generate info impl - updating ci network info");
                a(chartboostCreativeInfo, jSONObject);
            }
        }
        Logger.d(c, "generate info impl - creative info list= ", arrayList);
        return arrayList;
    }

    private void a(List<CreativeInfo> list, JSONObject jSONObject, c.a aVar) throws JSONException {
        if (list == null || list.isEmpty()) {
            return;
        }
        Logger.printFullVerboseLog(c, "update bidding ci - prefetch json obj= \n", jSONObject.toString(4));
        JSONArray optJSONArray = jSONObject.optJSONArray(n);
        JSONArray optJSONArray2 = jSONObject.optJSONArray(V);
        if (optJSONArray != null && optJSONArray.length() > 0) {
            Logger.d(c, "update bidding ci - prefetch is seat bid");
            a((ChartboostCreativeInfo) list.get(0), optJSONArray);
        } else if (optJSONArray2 != null && optJSONArray2.length() > 0) {
            Logger.d(c, "update bidding ci - prefetch is renderables");
            b(list, jSONObject, aVar);
        }
    }

    private void b(List<CreativeInfo> list, JSONObject jSONObject, c.a aVar) {
        JSONArray optJSONArray;
        JSONArray jSONArray;
        String str;
        JSONObject optJSONObject;
        String str2;
        List<CreativeInfo> list2 = list;
        if (list2 == null || list.isEmpty() || aVar == null || (optJSONArray = jSONObject.optJSONArray(V)) == null || optJSONArray.length() == 0) {
            return;
        }
        BrandSafetyUtils.AdType K = list2.get(0).K();
        list2.remove(0);
        int length = optJSONArray.length();
        int i2 = 0;
        while (i2 < optJSONArray.length()) {
            String str3 = Z + length;
            JSONObject optJSONObject2 = optJSONArray.optJSONObject(i2);
            ChartboostCreativeInfo chartboostCreativeInfo = new ChartboostCreativeInfo(K, com.safedk.android.utils.h.c, this.I);
            list2.add(chartboostCreativeInfo);
            String str4 = aVar.d;
            String str5 = aVar.a + "_" + i2;
            if (optJSONObject2 == null) {
                jSONArray = optJSONArray;
                str = "";
            } else {
                String optString = optJSONObject2.optString(Y);
                jSONArray = optJSONArray;
                Logger.d(c, "update renderables bidding ci - markup type= ", optString);
                if (TextUtils.isEmpty(optString)) {
                    str2 = str3;
                } else {
                    str2 = str3 + "/" + optString;
                }
                str = optJSONObject2.optString("adm");
                if (TextUtils.isEmpty(str)) {
                    str3 = str2;
                } else {
                    Logger.printFullVerboseLog(c, "update renderables bidding ci - adm found= ", str);
                    String a = a(com.safedk.android.utils.g.a("[\\\"'`](ey[A-Za-z0-9+/=]{100,})[\\\"'`]", 32), str);
                    if (!TextUtils.isEmpty(a)) {
                        try {
                            JSONObject jSONObject2 = new JSONObject(new String(Base64.decode(a, 0)));
                            str4 = jSONObject2.optString(e, str4);
                            str5 = jSONObject2.optString(W, str5);
                        } catch (JSONException e2) {
                            Logger.d(c, "update renderables bidding ci - exception: ", e2);
                        }
                    }
                    if (com.safedk.android.analytics.brandsafety.creatives.h.b(str)) {
                        str3 = str2 + "/vast";
                        chartboostCreativeInfo.d(true);
                        Logger.d(c, "update renderables bidding ci - adm is vast");
                        a((CreativeInfo) chartboostCreativeInfo, (String) null, str, true);
                    } else {
                        str3 = str2 + "/mraid";
                        Logger.d(c, "update renderables bidding ci - adm is html");
                        chartboostCreativeInfo.b((List<String>) com.safedk.android.utils.n.f(str));
                    }
                }
            }
            if (length == 1 && (optJSONObject = jSONObject.optJSONObject(X)) != null) {
                chartboostCreativeInfo.b((List<String>) com.safedk.android.utils.n.f(optJSONObject.toString()));
            }
            chartboostCreativeInfo.h(aVar.a);
            chartboostCreativeInfo.j(aVar.c);
            Logger.d(c, "update renderables bidding ci - setting creative id= ", str4);
            chartboostCreativeInfo.k(str4);
            Logger.d(c, "update renderables bidding ci - setting ad id= ", str5);
            chartboostCreativeInfo.r(str5);
            Iterator<String> it = com.safedk.android.analytics.brandsafety.creatives.h.a(com.safedk.android.analytics.brandsafety.creatives.e.c(), str, 1, false).iterator();
            while (it.hasNext()) {
                String replaceAll = it.next().replaceAll("\\s+", "");
                Logger.printFullVerboseLog(c, "update renderables bidding ci - html body resource= ", replaceAll);
                ax.put(replaceAll, str5);
            }
            chartboostCreativeInfo.e(str3);
            Logger.d(c, "update renderables bidding ci - index= ", Integer.valueOf(i2), ",       creative info= ", chartboostCreativeInfo);
            i2++;
            list2 = list;
            optJSONArray = jSONArray;
        }
    }

    private void a(ChartboostCreativeInfo chartboostCreativeInfo, JSONArray jSONArray) {
        JSONArray optJSONArray;
        JSONObject optJSONObject;
        JSONObject optJSONObject2 = jSONArray.optJSONObject(0);
        if (optJSONObject2 != null && (optJSONArray = optJSONObject2.optJSONArray("bid")) != null && optJSONArray.length() > 0 && (optJSONObject = optJSONArray.optJSONObject(0)) != null) {
            ArrayList arrayList = new ArrayList();
            String str = "";
            String optString = optJSONObject.optString("adm");
            String optString2 = optJSONObject.optString(e);
            Logger.d(c, "update seat bid bidding ci - setting creative id= ", optString2);
            if (!"null".equals(optString2)) {
                chartboostCreativeInfo.k(optString2);
            }
            String optString3 = optJSONObject.optString("bundle");
            Logger.d(c, "update seat bid bidding ci - setting bundle= ", optString3);
            if (!"null".equals(optString3)) {
                chartboostCreativeInfo.a(optString3);
            }
            JSONArray optJSONArray2 = optJSONObject.optJSONArray("adomain");
            if (optJSONArray2 != null && optJSONArray2.length() > 0) {
                String optString4 = optJSONArray2.optString(0);
                Logger.d(c, "update seat bid bidding ci - setting ad domain= ", optString4);
                if (!"null".equals(optString4)) {
                    chartboostCreativeInfo.i(optString4);
                }
            }
            JSONObject optJSONObject3 = optJSONObject.optJSONObject("ext");
            if (optJSONObject3 != null) {
                JSONArray optJSONArray3 = optJSONObject3.optJSONArray("imptrackers");
                Logger.d(c, "update seat bid bidding ci - adding dsp url list= ", optJSONArray3);
                if (optJSONArray3 != null) {
                    for (int i2 = 0; i2 < optJSONArray3.length(); i2++) {
                        String optString5 = optJSONArray3.optString(i2);
                        if (!"null".equals(optString5)) {
                            arrayList.add(optString5);
                        }
                    }
                }
                String optString6 = optJSONObject3.optString(k);
                if (!TextUtils.isEmpty(optString6) && !"null".equals(optString6)) {
                    str = "" + optString6 + "/";
                }
                String optString7 = optJSONObject3.optString(m);
                Logger.d(c, "update seat bid bidding ci - setting ad id= ", optString7);
                if (!"null".equals(optString7)) {
                    chartboostCreativeInfo.r(optString7);
                }
            }
            String optString8 = optJSONObject.optString("nurl");
            Logger.d(c, "update seat bid bidding ci - nurl= ", optString8);
            if (!"null".equals(optString8)) {
                arrayList.add(optString8);
            }
            String optString9 = optJSONObject.optString("lurl");
            Logger.d(c, "update seat bid bidding ci - lurl= ", optString9);
            if (!"null".equals(optString9)) {
                arrayList.add(optString9);
            }
            String a = a(chartboostCreativeInfo, optString, str, arrayList);
            Logger.d(c, "update seat bid bidding ci - setting downstream struct= ", a);
            if (!TextUtils.isEmpty(a)) {
                chartboostCreativeInfo.e(a);
            }
        }
    }

    private void a(ChartboostCreativeInfo chartboostCreativeInfo, JSONObject jSONObject) throws JSONException {
        Logger.printFullVerboseLog(c, "update network ci - prefetch json obj= \n", jSONObject.toString(4));
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        String optString = jSONObject.optString(ak);
        String str = "";
        if (!TextUtils.isEmpty(optString) && !"null".equals(optString)) {
            str = "" + optString + "/";
        }
        a(jSONObject, (List<String>) arrayList);
        JSONObject optJSONObject = jSONObject.optJSONObject("webview");
        if (optJSONObject != null) {
            a(optJSONObject, (List<String>) arrayList);
            JSONArray optJSONArray = optJSONObject.optJSONArray(ad);
            if (optJSONArray != null) {
                String str2 = null;
                String str3 = null;
                String str4 = null;
                for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                    JSONObject optJSONObject2 = optJSONArray.optJSONObject(i2);
                    if (optJSONObject2 != null) {
                        String optString2 = optJSONObject2.optString("name");
                        String optString3 = optJSONObject2.optString("type");
                        String optString4 = optJSONObject2.optString("value");
                        if ("null".equals(optString4)) {
                            Logger.d(c, "update network ci - element value is null, skipping.");
                        } else if (optString2.equals(e)) {
                            Logger.d(c, "update network ci - setting creative id= ", optString4);
                            chartboostCreativeInfo.k(optString4);
                        } else if (optString3.equals(al)) {
                            Logger.d(c, "update network ci - setting candidate video url= ", optString4);
                            str4 = optString4;
                        } else if (optString2.equals("imptrackers")) {
                            arrayList.add(optString4);
                        } else if (optString3.equals(ai)) {
                            hashSet.add(optString4);
                        } else if (optString2.equals("ad_domain")) {
                            Logger.d(c, "update network ci - setting ad domain= ", optString4);
                            chartboostCreativeInfo.i(optString4);
                        } else if (optString2.equals("app_name")) {
                            Logger.d(c, "update network ci - setting buyer id= ", optString4);
                            str3 = optString4;
                        } else if (optString2.equals(aa)) {
                            str2 = optString4;
                        } else if (optString2.equals("impression_id")) {
                            Logger.d(c, "update network ci - setting ad id= ", optString4);
                            chartboostCreativeInfo.r(optString4);
                        }
                    }
                }
                String a = a(chartboostCreativeInfo, str2, str, arrayList);
                if (TextUtils.isEmpty(chartboostCreativeInfo.P()) && !TextUtils.isEmpty(str3)) {
                    chartboostCreativeInfo.m(str3);
                }
                if (TextUtils.isEmpty(chartboostCreativeInfo.H()) && !TextUtils.isEmpty(str4)) {
                    Logger.d(c, "update network ci - setting choosing candidate video url= ", str4);
                    chartboostCreativeInfo.p(str4);
                }
                Logger.d(c, "update network ci - setting downstream struct= ", a);
                if (!TextUtils.isEmpty(a)) {
                    chartboostCreativeInfo.e(a);
                }
                Logger.d(c, "update network ci - adding prefetch resource list= ", hashSet);
                chartboostCreativeInfo.b(new ArrayList<>(hashSet));
            }
        }
    }

    private String a(CreativeInfo creativeInfo, String str, String str2, List<String> list) {
        boolean z;
        if (!TextUtils.isEmpty(str)) {
            String str3 = "";
            try {
                str = new String(Base64.decode(str, 0));
            } catch (Exception e2) {
                Logger.d(c, "update ci adm - exception while decoding adm: ", e2);
            }
            if (list == null) {
                z = true;
            } else {
                z = true;
                for (String str4 : list) {
                    if (str4.contains(an)) {
                        String d2 = com.safedk.android.utils.k.d(str4, ao);
                        if (!TextUtils.isEmpty(d2)) {
                            try {
                                JSONObject a = ProtobufMessageParser.a(Base64.decode(d2, 8), as);
                                Logger.d(c, "update ci adm - cb val url json obj= ", a);
                                if (a != null) {
                                    String optString = a.optString("url");
                                    Logger.d(c, "update ci adm - cb val url= ", optString);
                                    if (!TextUtils.isEmpty(optString)) {
                                        creativeInfo.x(optString);
                                    }
                                    String optString2 = a.optString(ar);
                                    Logger.d(c, "update ci adm - buyer id= ", optString2);
                                    if (!TextUtils.isEmpty(optString2) && TextUtils.isEmpty(creativeInfo.P())) {
                                        creativeInfo.m(optString2);
                                    }
                                    if (!TextUtils.isEmpty(optString2)) {
                                        str3 = str3 + optString2 + StringUtils.COMMA;
                                    }
                                }
                            } catch (Exception e3) {
                                Logger.d(c, "update ci adm - exception= ", e3);
                            }
                        }
                    } else {
                        creativeInfo.x(str4);
                        z = false;
                    }
                }
            }
            if (!TextUtils.isEmpty(str3)) {
                creativeInfo.u(at + str3);
            }
            if (com.safedk.android.analytics.brandsafety.creatives.h.b(str)) {
                String str5 = str2 + "vast";
                creativeInfo.d(true);
                Logger.d(c, "update ci adm - seat is vast!");
                a(creativeInfo, (String) null, str, true);
                return str5;
            }
            if (com.safedk.android.utils.k.k(str)) {
                String str6 = str2 + "mraid";
                Logger.d(c, "update ci adm - seat is mraid!");
                if (z) {
                    Logger.d(c, "update ci adm - dsp url list is empty, extract from html");
                    creativeInfo.b((List<String>) com.safedk.android.utils.n.f(str));
                    return str6;
                }
                return str6;
            }
            return str2;
        }
        return str2;
    }

    private void a(JSONObject jSONObject, List<String> list) {
        JSONObject optJSONObject;
        JSONArray optJSONArray;
        if (jSONObject != null && (optJSONObject = jSONObject.optJSONObject("events")) != null && (optJSONArray = optJSONObject.optJSONArray("imptrackers")) != null) {
            for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                String optString = optJSONArray.optString(i2);
                if (!TextUtils.isEmpty(optString)) {
                    list.add(optString);
                }
            }
        }
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public String a(String str, String str2, WeakReference<WebView> weakReference) {
        CreativeInfo creativeInfo;
        List<CreativeInfo> list;
        Logger.d(c, "get ad id from resource - value= ", str);
        String a = a(com.safedk.android.utils.g.a("Chartboost\\.BiddingParams\\s*=\\s*.*\"impressionId\"\\s*:\\s*\"(.*?)\"", 32), str);
        Logger.d(c, "get ad id from resource - impression id for bidding found= ", a);
        if (TextUtils.isEmpty(a)) {
            a = a(com.safedk.android.utils.g.a("Chartboost\\.Params\\s*=.*?impressionId\\s*:\\s*\"(.*?)\"", 32), str);
            Logger.d(c, "get ad id from resource - impression id for network found= ", a);
        }
        if (TextUtils.isEmpty(a)) {
            Iterator<String> it = com.safedk.android.analytics.brandsafety.creatives.h.a(com.safedk.android.analytics.brandsafety.creatives.e.c(), str, 1, false).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                String replaceAll = it.next().replaceAll("\\s+", "");
                Logger.printFullVerboseLog(c, "get ad id from resource - html body resource= ", replaceAll);
                if (ax.containsKey(replaceAll)) {
                    a = ax.get(replaceAll);
                    Logger.d(c, "get ad id from resource - impression id for renderables bidding found= ", a);
                    break;
                }
                aB.put(replaceAll, weakReference);
            }
        }
        if (TextUtils.isEmpty(a)) {
            CreativeInfo creativeInfo2 = aA.get(str);
            Logger.d(c, Logger.FeatureTag.CI_MATCHING, "get ad id from resource - ci found by tracking url= ", creativeInfo2);
            if (creativeInfo2 != null) {
                Iterator<List<CreativeInfo>> it2 = az.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        list = null;
                        break;
                    }
                    list = it2.next();
                    if (list != null && list.contains(creativeInfo2)) {
                        String L = creativeInfo2.L();
                        Logger.d(c, "get ad id from resource - ci found by tracking id verified. impression id= ", L);
                        a = L;
                        break;
                    }
                }
                if (list != null) {
                    list.remove(creativeInfo2);
                    az.remove(list);
                }
            }
        }
        if (TextUtils.isEmpty(a)) {
            creativeInfo = null;
        } else {
            creativeInfo = this.J.get(a);
        }
        Logger.d(c, "get ad id from resource - ci found?= ", creativeInfo);
        if (creativeInfo == null) {
            return null;
        }
        Logger.d(c, Logger.FeatureTag.CI_MATCHING, "get ad id from resource - returning ad id= ", creativeInfo.L());
        return creativeInfo.L();
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public boolean n(String str) {
        Logger.d(c, "try reverse matching - started, ad id= ", str);
        for (String str2 : ax.keySet()) {
            Logger.printFullVerboseLog(c, "try reverse matching - html= ", str2);
            String str3 = ax.get(str2);
            Logger.d(c, "try reverse matching - impression id found?= ", str3);
            if (!TextUtils.isEmpty(str3) && str3.equals(str)) {
                WeakReference<WebView> weakReference = aB.get(str2);
                Logger.d(c, "try reverse matching - webView ref found?= ", weakReference);
                if (weakReference != null && weakReference.get() != null) {
                    WebView webView = weakReference.get();
                    Logger.d(c, "try reverse matching - webView found?= ", webView);
                    return c(webView, str);
                }
            }
        }
        return false;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d
    protected String a(String str, CreativeInfo creativeInfo) {
        Logger.d(c, "handle vast media file - video url= ", str, ",    ci= ", creativeInfo);
        List<CreativeInfo> list = ay.get(str);
        if (list == null) {
            list = new ArrayList<>();
        }
        if (!list.contains(creativeInfo)) {
            Logger.d(c, "handle vast media file - ci added to collection");
            list.add(creativeInfo);
        } else {
            Logger.d(c, "handle vast media file - ci already exists in collection, skipping");
        }
        Logger.d(c, "handle vast media file - video url= ", str, ",    ci list size after= ", Integer.valueOf(list.size()));
        ay.put(str, list);
        return null;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d
    protected boolean B(String str) {
        boolean containsKey = aA.containsKey(str);
        Logger.d(c, "should follow get url impl - url= ", str, ",        contained in collection?= ", Boolean.valueOf(containsKey));
        return containsKey;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d
    protected boolean b(String str, Bundle bundle) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        boolean find = com.safedk.android.utils.g.a("chartboost\\.com/webview/(.*?)/(reward|interstitial|banner)|chartboost\\.com/auction/(.*?)/(reward|interstitial|banner)", 32).matcher(str).find();
        Logger.d(c, "should follow input stream impl url = ", str, ", shouldFollow = ", Boolean.valueOf(find));
        return find;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public AdNetworkDiscovery.WebViewResourceMatchingMethod b() {
        return AdNetworkDiscovery.WebViewResourceMatchingMethod.WEBVIEW_LOOKUP;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public List<String> e() {
        List<String> e2 = super.e();
        e2.add(aw);
        return e2;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public void e(Object obj) {
        String str;
        String str2;
        String str3;
        CreativeInfo creativeInfo;
        Logger.d(c, "handle on video start - source= ", obj);
        if (obj == null) {
            str = null;
            str2 = null;
            str3 = null;
        } else {
            str = null;
            str2 = null;
            str3 = null;
            for (Field field : obj.getClass().getDeclaredFields()) {
                if (field != null) {
                    field.setAccessible(true);
                    try {
                        Object obj2 = field.get(obj);
                        if (obj2 instanceof URL) {
                            str = obj2.toString();
                            Logger.d(c, "handle on video start - field is URL= ", obj2);
                        } else if (obj2 instanceof View) {
                            str2 = BrandSafetyUtils.a(obj2);
                            str3 = field.getType().getName();
                            Logger.d(c, "handle on video start - field is view= ", obj2);
                        }
                    } catch (Exception e2) {
                        Logger.d(c, "handle on video start - exception: ", e2);
                    }
                }
            }
        }
        Logger.d(c, "handle on video start - viewType= ", str3, ",    viewAddress= ", str2, ",     url= ", str);
        if (!TextUtils.isEmpty(str)) {
            List<CreativeInfo> list = ay.get(str);
            Logger.d(c, "handle on video start - creative info list= ", list);
            if (list != null && !list.isEmpty()) {
                Logger.d(c, "handle on video start - creative info list size= ", Integer.valueOf(list.size()));
                if (list.size() == 1) {
                    creativeInfo = list.remove(0);
                    Logger.d(c, "handle on video start - creative info found?= ", creativeInfo);
                    if (creativeInfo == null && !TextUtils.isEmpty(str2)) {
                        creativeInfo.b(str2, str3);
                        Logger.d(c, "handle on video start - setting creative in ad finder");
                        CreativeInfoManager.a(creativeInfo, CreativeInfo.k, (String) null, creativeInfo.W());
                        return;
                    }
                }
                az.add(list);
            }
        }
        creativeInfo = null;
        Logger.d(c, "handle on video start - creative info found?= ", creativeInfo);
        if (creativeInfo == null) {
        }
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d
    protected void c(CreativeInfo creativeInfo, String str) {
        Logger.d(c, "handle vast video tracking event - tracking url= ", str, ",    ci=  ", creativeInfo);
        aA.put(str, creativeInfo);
    }
}
