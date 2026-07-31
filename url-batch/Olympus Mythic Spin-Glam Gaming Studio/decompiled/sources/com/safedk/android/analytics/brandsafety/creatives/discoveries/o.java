package com.safedk.android.analytics.brandsafety.creatives.discoveries;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.inmobi.media.core.config.models.AdConfig;
import com.ironsource.X3;
import com.safedk.android.SafeDK;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.b;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import com.safedk.android.analytics.brandsafety.creatives.infos.PangleCreativeInfo;
import com.safedk.android.analytics.brandsafety.m;
import com.safedk.android.analytics.events.BrandSafetyEvent;
import com.safedk.android.utils.LimitedConcurrentHashMap;
import com.safedk.android.utils.LinkedHashSetWithItemLimit;
import com.safedk.android.utils.Logger;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.net.URLDecoder;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class o extends d {
    private static final String V = "endcard";
    private static final String W = "video_url";
    private static final String X = "cover_url";
    private static final String Y = "media_ext";
    private static final String Z = "request_id";
    private static final String aA = "(function(){var sdkId=\"{{SDK_ID}}\";var address=\"{{ADDRESS}}\";var log=function(message){try{if(typeof window.webkit.messageHandlers.safedkDebug.postMessage===\"function\"){window.webkit.messageHandlers.safedkDebug.postMessage(message)}else{console.log(\"SafeDKWebApInterface safedkDebug object missing\")}}catch(error){}};var lookForPrivacyPolicy=function(){try{var isPrivacyPolicy=document.getElementsByClassName(\"renderer-policy-dialog__container\").length>0;if(isPrivacyPolicy){if(typeof window.webkit.messageHandlers.safedkNoSampling.postMessage===\"function\"){window.webkit.messageHandlers.safedkNoSampling.postMessage(sdkId,address,0,0)}else{console.log(\"SafeDKWebApInterface safedkNoSampling object missing\")}}}catch(error){if(typeof window.webkit.messageHandlers.safedkNoSamplingExc.postMessage===\"function\"){window.webkit.messageHandlers.safedkNoSamplingExc.postMessage(error.message+\"\\n\"+error.stack)}else{console.log(\"SafeDKWebApInterface safedkNoSamplingExc object missing\")}}};lookForPrivacyPolicy();try{var MutationObserver=window.WebKitMutationObserver||window.MutationObserver;var observer=new MutationObserver(function(mutations){mutations.forEach(function(mutation){for(var i=0;i<mutation.addedNodes.length;i++){var node=mutation.addedNodes[i];if(node&&node.nodeName!=\"#text\"){lookForPrivacyPolicy()}}})});var config={childList:true,subtree:true};observer.observe(document,config)}catch(error){if(typeof window.webkit.messageHandlers.safedkNoSamplingExc.postMessage===\"function\"){window.webkit.messageHandlers.safedkNoSamplingExc.postMessage(error.message+\"\\n\"+error.stack)}else{console.log(\"SafeDKWebApInterface safedkNoSamplingExc object missing\")}}})();\n";
    private static final String aD = "com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog";
    private static final String aE = "com.bytedance.sdk.openadsdk.common.no";
    private static final String aF = "dynamic_creative";
    private static final String aG = "dpa_related_products";
    private static final String aH = "ivrv";
    private static final String aI = "render_type";
    private static final String aJ = "max_aggregation_endcard_count";
    private static final String aK = "show_endcard";
    private static final String aL = "show_origin_endcard";
    private static final String aM = "endcard_style";
    private static final String aa = "playable";
    private static final String ab = "playable_url";
    private static final String ac = "icon";
    private static final String ad = "image";
    private static final String ae = "dsp_vast";
    private static final String af = "url";
    private static final String ag = "title";
    private static final String ah = "app_name";
    private static final String ai = "button_text";
    private static final String aj = "source";
    private static final String ak = "description";
    private static final String al = "null";
    private static final String am = "tpl_info";
    private static final String an = "data";
    private static final String ao = "dpa_description";
    private static final String ap = "dpa_price_unit";
    private static final String aq = "dpa_price";
    private static final String ar = "dpa_sale_price";
    private static final String as = "url";
    private static final String at = "multi_ad_config";
    private static final String au = "auto_switch";
    private static final String av = "can_loop";
    private static final String aw = "ceiling_type";
    private static final String ax = "has_more";
    private static final String ay = "load_more_strategy";
    private static final String c = "PangleDiscovery";
    private static final String d = "creatives";
    private static final String e = "is_playable";
    private static final String f = "ext";
    private static final String g = "ad_id";
    private static final String h = "ad_slot_type";
    private static final String i = "rit";
    private static final String j = "creative_id";
    private static final String k = "is_dsp_ad";
    private static final String l = "app";
    private static final String m = "package_name";
    private static final String n = "download_url";
    private static final String o = "target_url";
    private static final String p = "video";
    private static final String q = "h265_video";
    private final Map<String, CreativeInfo> aN;
    private final Map<String, CreativeInfo> aO;
    private final Map<String, CreativeInfo> aP;
    private final Set<Integer> aQ;
    private final Map<String, c.a> aR;
    private final Map<String, CreativeInfo> aS;
    final ScheduledExecutorService b;
    private static final String[] az = {"pglstatp.com", "ipstatp.com", "pglstatp-toutiao.com", "pstatp.com"};
    private static final String[] aB = {"device", "thumbnail"};
    private static final String[] aC = {"app_version", "app_name", "developer_name", X3.i.n, "height", "width", "aspect_ratio", "lp", "is_pre_render"};

    public o() {
        super(com.safedk.android.utils.h.u, c);
        this.aN = new ConcurrentHashMap();
        this.aO = new ConcurrentHashMap();
        this.aP = new ConcurrentHashMap();
        this.aQ = new LinkedHashSetWithItemLimit(20L);
        this.aR = new LimitedConcurrentHashMap(50);
        this.aS = new LimitedConcurrentHashMap(50);
        this.b = Executors.newScheduledThreadPool(1);
        this.E.b(AdNetworkConfiguration.SUPPORTS_PREFETCH_RECEIVING_BY_APPLOVIN, true);
        this.E.b(AdNetworkConfiguration.SUPPORTS_BANNER_IMPRESSION_TRACKING, true);
        this.E.b(AdNetworkConfiguration.SUPPORTS_JAVASCRIPT_BASED_PRIVACY_BUTTON_CLICK_DETECTION_IN_FULLSCREEN_ADS, true);
        this.E.b(AdNetworkConfiguration.USE_WEBVIEW_LOADURL_AS_RESOURCE_LOADED_INDICATION, true);
        this.E.b(AdNetworkConfiguration.AD_NETWORK_SUPPORTS_PREFETCH_REUSE, true);
        this.E.b(AdNetworkConfiguration.SHOULD_EXTRACT_AD_ID_FROM_BANNER_WEB_VIEW, true);
        this.E.b(AdNetworkConfiguration.AD_ID_EXTRACTED_FROM_BANNER_WEB_VIEW_IS_MAX_CREATIVE_ID, true);
        this.E.b(AdNetworkConfiguration.JS_PRIVACY_BUTTON_CLICK_DETECTION_SCRIPT, aA);
        this.E.b(AdNetworkConfiguration.SUPPORTS_MREC_IMPRESSION_TRACKING, true);
        this.E.b(AdNetworkConfiguration.SUPPORTS_MREC_IMPRESSION_EOV, true);
        this.E.a(AdNetworkConfiguration.MREC_SCREENSHOT_TAKING_DELAY, 2L);
        this.E.b(AdNetworkConfiguration.SUPPORTS_NATIVE_IMPRESSION_TRACKING, true);
        Logger.d(c, "PangleDiscovery ctor created");
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d
    protected List<CreativeInfo> a(String str, String str2, Map<String, List<String>> map, c.a aVar, byte[] bArr) throws JSONException {
        Object[] objArr = new Object[6];
        objArr[0] = "generate info url: ";
        objArr[1] = str;
        objArr[2] = " , headers: ";
        objArr[3] = map != null ? map.toString() : "null";
        objArr[4] = ", buffer: ";
        objArr[5] = str2;
        Logger.printFullVerboseLog(c, objArr);
        if (aVar == null) {
            return C(str2);
        }
        Logger.d(c, "generate info, event id: ", aVar.a, ", max params: ", aVar);
        this.aR.put(aVar.a, aVar);
        return null;
    }

    private List<CreativeInfo> C(String str) throws JSONException {
        c.a aVar;
        String str2;
        String str3;
        ArrayList<CreativeInfo> arrayList = new ArrayList();
        if (!this.aQ.add(Integer.valueOf(str.hashCode()))) {
            Logger.d(c, "generate info, already parsed a similar prefetch, ignoring...");
            return arrayList;
        }
        if (!com.safedk.android.utils.n.n(str)) {
            Logger.d(c, "generate info - not a valid JSON string");
        } else {
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString("request_id");
            if (optString == null) {
                aVar = null;
            } else {
                c.a aVar2 = this.aR.get(optString);
                Logger.d(c, "generate info, request id: ", optString, ", max params: ", aVar2);
                aVar = aVar2;
            }
            ArrayList arrayList2 = new ArrayList();
            if (jSONObject.has(d)) {
                JSONArray jSONArray = jSONObject.getJSONArray(d);
                str2 = optString;
                Logger.d(c, "generate info creatives contains ", Integer.valueOf(jSONArray.length()), " items");
                int i2 = 0;
                while (i2 < jSONArray.length()) {
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
                    JSONArray jSONArray2 = jSONArray;
                    this.aQ.add(Integer.valueOf(jSONObject2.toString().hashCode()));
                    PangleCreativeInfo a = a(jSONObject2, i2, arrayList2, aVar);
                    if (a != null) {
                        arrayList.add(a);
                        if (!arrayList2.isEmpty()) {
                            arrayList.addAll(arrayList2);
                        }
                    }
                    i2++;
                    jSONArray = jSONArray2;
                }
            } else {
                str2 = optString;
                PangleCreativeInfo a2 = a(jSONObject, 0, arrayList2, aVar);
                if (a2 != null) {
                    arrayList.add(a2);
                    if (!arrayList2.isEmpty()) {
                        arrayList.addAll(arrayList2);
                    }
                }
            }
            Logger.d(c, "generate info - total creatives: ", Integer.valueOf(arrayList.size()));
            try {
                String str4 = "fe0";
                if (!arrayList.isEmpty() && jSONObject.has(at)) {
                    String string = jSONObject.getString(at);
                    if (TextUtils.isEmpty(string)) {
                        str4 = "fe=1|len=0";
                    } else {
                        String str5 = "fe=1|len=" + string.length();
                        JSONObject jSONObject3 = new JSONObject(string);
                        if (jSONObject3.has(au)) {
                            str5 = str5 + "|as=" + jSONObject3.getInt(au);
                        }
                        if (jSONObject3.has(av)) {
                            str5 = str5 + "|cl=" + jSONObject3.getInt(av);
                        }
                        if (jSONObject3.has(aw)) {
                            str5 = str5 + "|ct=" + jSONObject3.getInt(aw);
                        }
                        if (jSONObject3.has(ax)) {
                            str5 = str5 + "|hm=" + jSONObject3.getBoolean(ax);
                        }
                        if (!jSONObject3.has(ay)) {
                            str4 = str5;
                        } else {
                            str4 = str5 + "|lms=" + jSONObject3.getInt(ay);
                        }
                    }
                }
                Iterator it = arrayList.iterator();
                int i3 = 0;
                while (it.hasNext()) {
                    if (((PangleCreativeInfo) ((CreativeInfo) it.next())).av()) {
                        i3++;
                    }
                }
                String uuid = UUID.randomUUID().toString();
                String str6 = "/multi_ad/ad_count_" + arrayList.size() + PangleCreativeInfo.aa + i3;
                for (CreativeInfo creativeInfo : arrayList) {
                    creativeInfo.u(str4);
                    if (aVar != null) {
                        creativeInfo.h(aVar.a);
                    }
                    if (!TextUtils.isEmpty(creativeInfo.n()) || TextUtils.isEmpty(str2)) {
                        str3 = str2;
                    } else {
                        str3 = str2;
                        creativeInfo.h(str3);
                    }
                    if (arrayList.size() > 1) {
                        PangleCreativeInfo pangleCreativeInfo = (PangleCreativeInfo) creativeInfo;
                        pangleCreativeInfo.a(uuid);
                        pangleCreativeInfo.ao();
                        pangleCreativeInfo.e(pangleCreativeInfo.h() + str6 + PangleCreativeInfo.Z + pangleCreativeInfo.at());
                        Logger.d(c, "generate info - multi ci downstream struct set to ", pangleCreativeInfo.h(), " for id ", pangleCreativeInfo.L(), ", common multi UUD: ", uuid);
                    }
                    str2 = str3;
                }
            } catch (Exception e2) {
                Logger.d(c, "parsing exc: ", e2.getMessage());
            }
        }
        return arrayList;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public List<CreativeInfo> u(String str) {
        List<CreativeInfo> list;
        ArrayList<CreativeInfo> arrayList;
        try {
            list = this.K.get(str);
        } catch (Exception e2) {
            Logger.d(c, "multi: exc: ", e2.getMessage());
        }
        if (list != null && list.size() != 0) {
            if (list.size() == 1) {
                return list;
            }
            Logger.d(c, "multi: multiCiList size: ", Integer.valueOf(list.size()));
            synchronized (list) {
                arrayList = new ArrayList(list);
            }
            String str2 = null;
            for (CreativeInfo creativeInfo : arrayList) {
                if (creativeInfo instanceof PangleCreativeInfo) {
                    String as2 = ((PangleCreativeInfo) creativeInfo).as();
                    if (!TextUtils.isEmpty(as2)) {
                        str2 = as2;
                    }
                }
            }
            if (!TextUtils.isEmpty(str2)) {
                ArrayList arrayList2 = new ArrayList();
                for (CreativeInfo creativeInfo2 : arrayList) {
                    if (creativeInfo2 instanceof PangleCreativeInfo) {
                        PangleCreativeInfo pangleCreativeInfo = (PangleCreativeInfo) creativeInfo2;
                        if (str2.equals(pangleCreativeInfo.as())) {
                            Logger.d(c, "multi: current commonUuid: ", str2, ", ad ID: ", pangleCreativeInfo.L());
                            arrayList2.add(pangleCreativeInfo);
                        }
                    }
                }
                return arrayList2;
            }
            Logger.d(c, "multi: no commonUuid found in cis, adId: ", str);
            return null;
        }
        return null;
    }

    private PangleCreativeInfo a(JSONObject jSONObject, int i2, List<PangleCreativeInfo> list, c.a aVar) throws JSONException {
        BrandSafetyUtils.AdType adType;
        BrandSafetyUtils.AdType adType2;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        JSONObject jSONObject2;
        String str14;
        String str15;
        if (jSONObject.has("ext")) {
            JSONObject jSONObject3 = new JSONObject(jSONObject.getString("ext"));
            String optString = jSONObject3.optString(i, null);
            String optString2 = jSONObject3.optString("creative_id", null);
            int optInt = jSONObject3.optInt(h, 0);
            if (aVar == null) {
                adType = null;
            } else {
                adType = BrandSafetyUtils.a(aVar.b);
            }
            if (adType != null) {
                adType2 = adType;
            } else {
                BrandSafetyUtils.AdType adType3 = (optInt == 1 || optInt == 5) ? BrandSafetyUtils.AdType.BANNER : BrandSafetyUtils.AdType.INTERSTITIAL;
                Logger.d(c, "generate info - ad type fallback, adSlotType=", Integer.valueOf(optInt), ", adType=", adType3);
                adType2 = adType3;
            }
            if (!jSONObject.has(Y)) {
                str = null;
            } else {
                str = jSONObject.getJSONObject(Y).optString("request_id", null);
            }
            if (!jSONObject.has("app")) {
                str2 = null;
                str3 = null;
                str4 = PangleCreativeInfo.E;
                str5 = null;
            } else {
                JSONObject jSONObject4 = jSONObject.getJSONObject("app");
                String optString3 = jSONObject4.optString("package_name", null);
                str2 = jSONObject4.optString("download_url", null);
                str3 = optString3;
                str5 = jSONObject4.optString("app_name", null);
                str4 = "app";
            }
            String optString4 = jSONObject.optString(o, null);
            if (str2 == null) {
                str2 = optString4;
            }
            boolean optBoolean = jSONObject.optBoolean(e, false);
            String str16 = !optBoolean ? str4 : str4 + PangleCreativeInfo.Y;
            if (!jSONObject.has("video")) {
                str6 = null;
                str7 = null;
                str8 = null;
            } else {
                JSONObject jSONObject5 = jSONObject.getJSONObject("video");
                str7 = jSONObject5.optString("endcard", null);
                str8 = jSONObject5.optString("video_url", null);
                str6 = jSONObject5.optString(X, null);
            }
            if (!jSONObject.has(q)) {
                String str17 = str8;
                str9 = str7;
                str10 = str17;
            } else {
                JSONObject jSONObject6 = jSONObject.getJSONObject(q);
                if (TextUtils.isEmpty(str7)) {
                    str7 = jSONObject6.optString("endcard", null);
                }
                if (TextUtils.isEmpty(str8)) {
                    str8 = jSONObject6.optString("video_url", null);
                }
                if (TextUtils.isEmpty(str6)) {
                    str6 = jSONObject6.optString(X, null);
                }
                String str18 = str8;
                str9 = str7;
                str10 = str18;
            }
            String optString5 = jSONObject.optString(ab, null);
            if (optString5 == null && jSONObject.has("playable")) {
                optString5 = jSONObject.getJSONObject("playable").optString(ab, null);
            }
            if (optString5 == null) {
                optString5 = jSONObject3.optString(ab, null);
            }
            if (!"null".equals(optString5)) {
                str11 = optString5;
            } else {
                str11 = null;
            }
            String str19 = str10;
            String str20 = str2;
            String str21 = str;
            BrandSafetyUtils.AdType adType4 = adType2;
            String str22 = str5;
            String str23 = str9;
            PangleCreativeInfo pangleCreativeInfo = new PangleCreativeInfo(adType2, str, optString2, str20, str19, str11, optBoolean, optString, this.I, str3, str16);
            Logger.d(c, "generate info - CI created: ", pangleCreativeInfo);
            List<String> f2 = com.safedk.android.utils.n.f(a(jSONObject).toString());
            if (jSONObject.has(ae)) {
                a((CreativeInfo) pangleCreativeInfo, (String) null, jSONObject.getString(ae), true);
                pangleCreativeInfo.e("vast");
            } else {
                if (str19 != null) {
                    f2.remove(str19);
                }
                pangleCreativeInfo.b(f2);
            }
            List<String> arrayList = new ArrayList<>();
            for (String str24 : f2) {
                CharSequence[] charSequenceArr = az;
                int length = charSequenceArr.length;
                int i3 = 0;
                while (true) {
                    if (i3 >= length) {
                        break;
                    }
                    if (!str24.contains(charSequenceArr[i3])) {
                        i3++;
                    } else {
                        arrayList.add(str24);
                        break;
                    }
                }
            }
            if (TextUtils.isEmpty(str23)) {
                str12 = str23;
            } else {
                str12 = str23;
                arrayList.add(str12);
            }
            if (!TextUtils.isEmpty(str6)) {
                arrayList.add(str6);
            }
            pangleCreativeInfo.c(arrayList);
            if (optInt == 5 && aVar != null) {
                String optString6 = jSONObject.optString("app_name");
                JSONObject optJSONObject = jSONObject.optJSONObject("image");
                if (optJSONObject != null) {
                    str13 = optJSONObject.optString("url", null);
                } else {
                    JSONArray optJSONArray = jSONObject.optJSONArray("image");
                    if (optJSONArray != null && (jSONObject2 = optJSONArray.getJSONObject(0)) != null) {
                        str13 = jSONObject2.optString("url", null);
                    } else {
                        str13 = null;
                    }
                }
                JSONObject optJSONObject2 = jSONObject.optJSONObject("icon");
                if (optJSONObject2 == null) {
                    str14 = null;
                    str15 = null;
                } else {
                    str14 = null;
                    str15 = optJSONObject2.optString("url", null);
                }
                String optString7 = jSONObject.optString("title", str14);
                if (aVar.b == BrandSafetyEvent.AdFormatType.NATIVE) {
                    if (!TextUtils.isEmpty(str22)) {
                        optString6 = str22;
                    }
                    if (!TextUtils.isEmpty(str13)) {
                        str6 = str13;
                    }
                    String optString8 = jSONObject.optString(ao);
                    String optString9 = jSONObject.optString(ai);
                    if (!TextUtils.isEmpty(optString6)) {
                        pangleCreativeInfo.A(CreativeInfo.aK + optString6);
                    }
                    if (!TextUtils.isEmpty(str6)) {
                        pangleCreativeInfo.A(CreativeInfo.aL + str6);
                    }
                    if (!TextUtils.isEmpty(str15)) {
                        pangleCreativeInfo.A(CreativeInfo.aM + str15);
                    }
                    if (!TextUtils.isEmpty(optString7) || !TextUtils.isEmpty(optString8)) {
                        pangleCreativeInfo.A(CreativeInfo.aN + optString7 + " " + optString8);
                    }
                    if (!TextUtils.isEmpty(optString9)) {
                        pangleCreativeInfo.A(CreativeInfo.aO + optString9);
                    }
                } else if (aVar.b == BrandSafetyEvent.AdFormatType.BANNER || aVar.b == BrandSafetyEvent.AdFormatType.MREC) {
                    pangleCreativeInfo.z(optString7);
                    pangleCreativeInfo.z(optString6);
                    pangleCreativeInfo.z(str22);
                    pangleCreativeInfo.z(jSONObject.optString("source", null));
                    pangleCreativeInfo.y(str15);
                    pangleCreativeInfo.y(str13);
                }
            }
            if (adType4 == BrandSafetyUtils.AdType.INTERSTITIAL) {
                if (str12 != null) {
                    String a = com.safedk.android.utils.k.a(com.safedk.android.utils.k.a(com.safedk.android.utils.n.z(str12), aC), aB);
                    Logger.d(c, "generate info - keep interstitial CI by end-card: ", a);
                    synchronized (this.aO) {
                        this.aO.put(a, pangleCreativeInfo);
                    }
                    synchronized (this.aS) {
                        this.aS.put(a, pangleCreativeInfo);
                    }
                }
                if (!TextUtils.isEmpty(optString4)) {
                    String replace = com.safedk.android.utils.n.z(optString4).replace("/?", "?");
                    Logger.d(c, "generate info - keep interstitial CI by target url: ", replace);
                    synchronized (this.aO) {
                        this.aO.put(replace, pangleCreativeInfo);
                    }
                    synchronized (this.aS) {
                        this.aS.put(replace, pangleCreativeInfo);
                    }
                }
                if (!TextUtils.isEmpty(str11)) {
                    String replace2 = com.safedk.android.utils.n.z(str11).replace("/?", "?");
                    Logger.d(c, "generate info - clean playable url : ", replace2);
                    synchronized (this.aS) {
                        this.aS.put(replace2, pangleCreativeInfo);
                    }
                }
                String str25 = str20;
                if (str25 != null) {
                    try {
                        str25 = URLDecoder.decode(str25, "UTF-8");
                    } catch (Throwable th) {
                    }
                    String a2 = com.safedk.android.utils.k.a(str25, aB);
                    Logger.d(c, "generate info - keep interstitial CI by click url: ", a2);
                    synchronized (this.aN) {
                        this.aN.put(a2, pangleCreativeInfo);
                    }
                }
            } else {
                a(jSONObject, (CreativeInfo) pangleCreativeInfo);
            }
            Logger.d(c, "generate info - keep CI with adId: ", str21);
            synchronized (this.aP) {
                this.aP.put(str21, pangleCreativeInfo);
            }
            String optString10 = jSONObject.optString(ao);
            String optString11 = jSONObject.optString(ap);
            int optInt2 = jSONObject.optInt(aq, 0);
            int optInt3 = jSONObject.optInt(ar, 0);
            if (!TextUtils.isEmpty(optString10) || !TextUtils.isEmpty(optString11) || optInt2 > 0 || optInt3 > 0) {
                Logger.d(c, "generate info - DPA detected for adId ", str21);
                pangleCreativeInfo.au();
                pangleCreativeInfo.e(pangleCreativeInfo.h() + PangleCreativeInfo.ab);
            }
            a(jSONObject, pangleCreativeInfo, i2, list, aVar);
            return pangleCreativeInfo;
        }
        Logger.d(c, "generate info 'ext' element is missing");
        return null;
    }

    private JSONObject a(JSONObject jSONObject) {
        JSONObject optJSONObject;
        try {
            JSONObject jSONObject2 = new JSONObject(jSONObject.toString());
            Pair<JSONObject, String> b = b(jSONObject2);
            JSONObject jSONObject3 = (JSONObject) b.first;
            if (jSONObject3 != null) {
                jSONObject3.remove(d);
                jSONObject3.remove(aG);
                if (am.equals(b.second) && (optJSONObject = jSONObject2.optJSONObject((String) b.second)) != null) {
                    optJSONObject.put(aF, jSONObject3.toString());
                }
            }
            return jSONObject2;
        } catch (JSONException e2) {
            return jSONObject;
        }
    }

    private static Pair<JSONObject, String> b(JSONObject jSONObject) {
        JSONObject optJSONObject;
        JSONObject jSONObject2;
        JSONObject optJSONObject2 = jSONObject.optJSONObject(aF);
        String str = am;
        if (optJSONObject2 == null && (optJSONObject = jSONObject.optJSONObject(am)) != null) {
            String optString = optJSONObject.optString(aF);
            if (!TextUtils.isEmpty(optString)) {
                try {
                    jSONObject2 = new JSONObject(optString);
                } catch (JSONException e2) {
                    e = e2;
                }
                try {
                    Logger.d(c, "generate info - found dynamic creative block under creatives->tpl_info");
                    optJSONObject2 = jSONObject2;
                } catch (JSONException e3) {
                    e = e3;
                    optJSONObject2 = jSONObject2;
                    Logger.d(c, "generate info - failed to find dynamic creative block: ", e.getMessage());
                    return new Pair<>(optJSONObject2, str);
                }
                return new Pair<>(optJSONObject2, str);
            }
        }
        str = d;
        return new Pair<>(optJSONObject2, str);
    }

    private void a(JSONObject jSONObject, PangleCreativeInfo pangleCreativeInfo, int i2, List<PangleCreativeInfo> list, c.a aVar) {
        JSONObject jSONObject2;
        try {
            Pair<JSONObject, String> b = b(jSONObject);
            jSONObject2 = (JSONObject) b.first;
            pangleCreativeInfo.u("dcpo=" + ((String) b.second));
        } catch (Exception e2) {
            e = e2;
        }
        try {
            if (jSONObject2 != null) {
                JSONObject optJSONObject = jSONObject2.optJSONObject(aH);
                StringBuilder sb = new StringBuilder();
                if (optJSONObject != null) {
                    if (optJSONObject.has(aI)) {
                        sb.append("|ivrv_rt=");
                        sb.append(optJSONObject.getString(aI));
                    }
                    if (optJSONObject.has(aJ)) {
                        sb.append("|ivrv_maec=");
                        sb.append(optJSONObject.getInt(aJ));
                    }
                    if (optJSONObject.has(aK)) {
                        sb.append("|ivrv_se=");
                        sb.append(optJSONObject.getString(aK));
                    }
                    if (optJSONObject.has(aL)) {
                        sb.append("|ivrv_soe=");
                        sb.append(optJSONObject.getString(aL));
                    }
                    if (optJSONObject.has(aM)) {
                        sb.append("|ivrv_es=");
                        sb.append(optJSONObject.getInt(aM));
                    }
                }
                JSONArray optJSONArray = jSONObject2.optJSONArray(aG);
                if (optJSONArray != null && optJSONArray.length() > 0) {
                    pangleCreativeInfo.e(pangleCreativeInfo.h() + PangleCreativeInfo.ac + optJSONArray.length());
                }
                Object opt = jSONObject2.opt(d);
                String str = opt instanceof String ? (String) opt : null;
                if (str != null) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("creative=");
                    int i3 = i2 + 1;
                    sb2.append(i3);
                    sb2.append((Object) sb);
                    pangleCreativeInfo.u(sb2.toString());
                    Logger.d(c, "generate info - creatives contains DYNAMIC_CREATIVE creatives: ", pangleCreativeInfo.W());
                    if (str.trim().startsWith(X3.j.d)) {
                        if (str.trim().endsWith(X3.j.e)) {
                            try {
                                JSONArray jSONArray = new JSONArray(str);
                                for (int i4 = 0; i4 < jSONArray.length(); i4++) {
                                    try {
                                        JSONObject jSONObject3 = jSONArray.getJSONObject(i4);
                                        JSONObject optJSONObject2 = jSONObject3.optJSONObject("app");
                                        if (optJSONObject2 != null) {
                                            String string = optJSONObject2.getString("download_url");
                                            String string2 = optJSONObject2.getString("package_name");
                                            if (string != null && string.length() > 0 && string2 != null && string2.length() > 0) {
                                                HashSet hashSet = new HashSet();
                                                hashSet.add(string);
                                                pangleCreativeInfo.a(string2, hashSet);
                                                pangleCreativeInfo.d();
                                            }
                                        }
                                        if (list != null) {
                                            try {
                                                PangleCreativeInfo a = a(jSONObject3, i4, (List<PangleCreativeInfo>) null, aVar);
                                                if (a != null) {
                                                    list.add(a);
                                                    a.u("creative=" + i3 + "|dynamic=" + (i4 + 1));
                                                    Logger.d(c, "generate info - set dynamic creative debug info: ", a.W());
                                                }
                                            } catch (Exception e3) {
                                                e = e3;
                                                try {
                                                    Logger.d(c, "generate info - dynamic creatives malformed / unidentified creatives json exc: ", e);
                                                } catch (Exception e4) {
                                                    e = e4;
                                                    Logger.d(c, "generate info - dynamic creatives malformed / unidentified json exc: ", e.getMessage());
                                                    return;
                                                }
                                            }
                                        }
                                    } catch (Exception e5) {
                                        e = e5;
                                    }
                                }
                                if (list != null) {
                                    pangleCreativeInfo.b(list.size());
                                    Iterator<PangleCreativeInfo> it = list.iterator();
                                    while (it.hasNext()) {
                                        it.next().b(list.size());
                                    }
                                }
                            } catch (Exception e6) {
                                e = e6;
                            }
                        }
                    }
                }
                return;
            }
            Logger.d(c, "generate info - dynamic creatives not found");
        } catch (Exception e7) {
            e = e7;
            Logger.d(c, "generate info - dynamic creatives json analysis exc: ", e.getMessage());
        }
    }

    private void a(JSONObject jSONObject, CreativeInfo creativeInfo) {
        JSONObject optJSONObject = jSONObject.optJSONObject(am);
        Logger.d(c, "check if not video ad - tpl info obj= ", optJSONObject);
        if (optJSONObject != null) {
            String optString = optJSONObject.optString("data");
            Logger.d(c, "check if not video ad - tpl info string= ", optString);
            if (!TextUtils.isEmpty(optString)) {
                if (optString.contains("\\\"type\\\":\\\"video-") || optString.contains("\"type\":\"video-")) {
                    Logger.d(c, "check if not video ad - ad is video. adding to downstream struct");
                    creativeInfo.a("video", "/");
                } else {
                    Logger.d(c, "check if not video ad - setting ad not a video ad!");
                }
            }
        }
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d
    protected String a(String str, CreativeInfo creativeInfo) {
        return null;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d
    protected boolean B(String str) {
        String a = com.safedk.android.utils.k.a(str, aB);
        if (this.aN.containsKey(a)) {
            return true;
        }
        return this.aO.containsKey(com.safedk.android.utils.k.a(a, aC).replace("/?", "?"));
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d
    protected boolean b(String str, Bundle bundle) {
        return false;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public AdNetworkDiscovery.WebViewResourceMatchingMethod b() {
        return AdNetworkDiscovery.WebViewResourceMatchingMethod.WEBVIEW_LOOKUP;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public String c(String str, String str2) {
        Logger.d(c, "get ad ID from resource started, bufferValue = ", str, ", url =", str2);
        if (str2 == null) {
            return null;
        }
        String replace = com.safedk.android.utils.k.a(com.safedk.android.utils.k.a(str2, aB), aC).replace("/?", "?");
        PangleCreativeInfo pangleCreativeInfo = (PangleCreativeInfo) this.aO.get(replace);
        if (pangleCreativeInfo != null) {
            Logger.d(c, Logger.FeatureTag.CI_MATCHING, "get ad ID from resource - ci found for url : ", str2);
            if (pangleCreativeInfo.h() != null && pangleCreativeInfo.h().contains(PangleCreativeInfo.E)) {
                Logger.d(c, "get ad ID from resource - identified website end card for url : ", str2);
                pangleCreativeInfo.a(true);
                pangleCreativeInfo.a((Boolean) true);
            }
            Logger.d(c, "get ad ID from resource - found interstitial CI by end card: ", replace);
            return pangleCreativeInfo.L();
        }
        try {
            str2 = URLDecoder.decode(str2, "UTF-8");
        } catch (Throwable th) {
        }
        String a = com.safedk.android.utils.k.a(str2, aB);
        PangleCreativeInfo pangleCreativeInfo2 = (PangleCreativeInfo) this.aN.get(a);
        if (pangleCreativeInfo2 == null) {
            return null;
        }
        Logger.d(c, "get ad ID from resource - found interstitial CI by click url: ", a);
        return pangleCreativeInfo2.L();
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public boolean e(View view) {
        if (view == null) {
            Logger.d(c, "Ad View view is null");
            return false;
        }
        if (super.e(view) || view.getClass().getName().equals("com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView") || view.getClass().getName().equals("com.bytedance.sdk.openadsdk.component.reward.view.RFEndCardBackUpLayout") || view.getClass().getName().equals("com.bytedance.sdk.openadsdk.component.view.OpenScreenAdVideoExpressView") || view.getClass().getName().equals("com.bytedance.sdk.openadsdk.component.view.OpenScreenAdExpressView") || view.getClass().getName().startsWith("com.bytedance.sdk.openadsdk.core.video.nativevideo") || (view.getClass().getName().startsWith("com.bytedance.sdk.openadsdk.core") && (view instanceof FrameLayout))) {
            return true;
        }
        return (view.getClass().getName().startsWith("com.bytedance.sdk.openadsdk.core") || view.getClass().getName().startsWith("com.bytedance.sdk.component")) && (view instanceof FrameLayout);
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d
    protected List<String> j() {
        return Arrays.asList(com.safedk.android.utils.h.u);
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d
    protected String a(BrandSafetyUtils.AdType adType, Object obj, String str) {
        Object obj2;
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (map.containsKey("request_id") && (obj2 = map.get("request_id")) != null) {
                Logger.d(c, "extract ad info - request ID: ", obj2);
                return obj2.toString();
            }
            return null;
        }
        return null;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public CreativeInfo b(Object obj) {
        CreativeInfo creativeInfo;
        if (obj instanceof String) {
            String str = (String) obj;
            Logger.d(c, "match info find ci, creative infos by id: ", this.aP.keySet());
            synchronized (this.aP) {
                creativeInfo = this.aP.get(str);
            }
            if (creativeInfo != null) {
                Logger.d(c, "match info by id - MATCH FOUND, CI: ", creativeInfo.aa());
                creativeInfo.t("creative_id");
                Logger.d(c, Logger.FeatureTag.CI_MATCHING, "match info by id - MATCH FOUND, CI: ", creativeInfo.aa());
                return creativeInfo;
            }
            synchronized (this.aO) {
                Logger.d(c, "match info find ci, creative infos by endcard: ", this.aO.keySet());
                for (CreativeInfo creativeInfo2 : this.aO.values()) {
                    if (creativeInfo2.L().equals(str)) {
                        Logger.d(c, "match info by endcard - MATCH FOUND, ci: ", creativeInfo2.aa());
                        creativeInfo2.t("endcard");
                        return creativeInfo2;
                    }
                }
                synchronized (this.aP) {
                    Logger.d(c, "match info find ci, creative infos by event id: ", this.aO.keySet());
                    for (CreativeInfo creativeInfo3 : this.aP.values()) {
                        if (creativeInfo3.K() == BrandSafetyUtils.AdType.NATIVE && creativeInfo3.L().contains(str)) {
                            Logger.d(c, "match info by event id - MATCH FOUND, ci: ", creativeInfo3.aa());
                            return creativeInfo3;
                        }
                    }
                    Logger.d(c, "match info find ci no match cannot match with: ", str);
                    return null;
                }
            }
        }
        return null;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public void c(View view) {
        j(view);
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public void d(View view) {
        j(view);
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x004e A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean i(View view) {
        int intValue;
        int identifier = SafeDK.getInstance().m().getResources().getIdentifier("tt_reward_full_feedback", "drawable", SafeDK.getInstance().m().getPackageName());
        if (n(view)) {
            try {
                Field declaredField = ImageView.class.getDeclaredField("mResource");
                declaredField.setAccessible(true);
                intValue = ((Integer) declaredField.get(view)).intValue();
            } catch (Exception e2) {
                Logger.d(c, "on view clicked - could not get mResource from ShadowImageView");
            }
            return intValue != identifier;
        }
        intValue = -1;
        if (intValue != identifier) {
        }
    }

    private void j(View view) {
        boolean z;
        Drawable drawable;
        int identifier = SafeDK.getInstance().m().getResources().getIdentifier("tt_top_dislike", "id", SafeDK.getInstance().m().getPackageName());
        int identifier2 = SafeDK.getInstance().m().getResources().getIdentifier("tt_ad_endcard_logo", "id", SafeDK.getInstance().m().getPackageName());
        int identifier3 = SafeDK.getInstance().m().getResources().getIdentifier("tt_reward_full_feedback", "drawable", SafeDK.getInstance().m().getPackageName());
        if (identifier3 > 0 && (drawable = SafeDK.getInstance().m().getResources().getDrawable(identifier3)) != null && (view instanceof ImageView)) {
            ImageView imageView = (ImageView) view;
            Logger.d(c, "on view clicked ttRewardFullFeedBack ", Integer.valueOf(identifier3), ", drawable sha256 = ", a(drawable), ", view bg hash : ", a(imageView.getDrawable()));
            if (a(drawable).equals(a(imageView.getDrawable()))) {
                Logger.d(c, "on view clicked tt Reward Full FeedBack match");
                z = true;
                boolean k2 = k(view);
                boolean l2 = l(view);
                Logger.d(c, "on view clicked - view id = ", Integer.valueOf(view.getId()), ", ttTopDislikeResId : ", Integer.valueOf(identifier), ", ttAdEndcardLogoResId : ", Integer.valueOf(identifier2), ", isDynamicDislikeFeedBack =  ", Boolean.valueOf(k2), ", isTopLayoutDislike2 = ", Boolean.valueOf(l2));
                if (view.getId() != identifier || k2 || l2 || z) {
                    Logger.d(c, "on view clicked - view type is: ", view.getClass().getName());
                    if (!m(view) || i(view) || k2 || z) {
                        String a = BrandSafetyUtils.a(view);
                        Logger.d(c, Logger.FeatureTag.AD_CAPTURE, "on view clicked - clicked the 'top dislike' ShadowTextView. Stop taking screenshot for current impression, address=", a);
                        b.a(a, com.safedk.android.analytics.brandsafety.m.q, new m.a[0]);
                        CreativeInfoManager.b(com.safedk.android.utils.h.u, a);
                    }
                    return;
                }
                if (view.getId() == identifier2) {
                    Logger.d(c, "on view clicked - view type is =", view.getClass().getName());
                    if (view instanceof TextView) {
                        Logger.d(c, "on view clicked - clicked the 'ad endcard logo' TextView. Stop taking screenshot for current impression");
                        CreativeInfoManager.b(com.safedk.android.utils.h.u, BrandSafetyUtils.a(view));
                        return;
                    }
                    return;
                }
                Logger.d(c, "on view clicked - clicked view is not the 'top dislike' nor 'ad end-card logo' view.");
                return;
            }
        }
        z = false;
        boolean k22 = k(view);
        boolean l22 = l(view);
        Logger.d(c, "on view clicked - view id = ", Integer.valueOf(view.getId()), ", ttTopDislikeResId : ", Integer.valueOf(identifier), ", ttAdEndcardLogoResId : ", Integer.valueOf(identifier2), ", isDynamicDislikeFeedBack =  ", Boolean.valueOf(k22), ", isTopLayoutDislike2 = ", Boolean.valueOf(l22));
        if (view.getId() != identifier) {
        }
        Logger.d(c, "on view clicked - view type is: ", view.getClass().getName());
        if (!m(view)) {
        }
        String a2 = BrandSafetyUtils.a(view);
        Logger.d(c, Logger.FeatureTag.AD_CAPTURE, "on view clicked - clicked the 'top dislike' ShadowTextView. Stop taking screenshot for current impression, address=", a2);
        b.a(a2, com.safedk.android.analytics.brandsafety.m.q, new m.a[0]);
        CreativeInfoManager.b(com.safedk.android.utils.h.u, a2);
    }

    private boolean k(View view) {
        boolean z = view.getParent().getClass().getName().equals("com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicDislikeFeedBack") || (view.getParent().getClass().getName().startsWith("com.bytedance.sdk.component") && (view instanceof FrameLayout));
        if (z) {
            Logger.d(c, "isViewDynamicDislikeFeedBack identified ", view);
        }
        return z;
    }

    private boolean l(View view) {
        boolean z = view.getParent().getClass().getName().equals("com.bytedance.sdk.openadsdk.component.reward.top.TopLayoutDislike2") || (view.getParent() instanceof FrameLayout);
        if (z) {
            Logger.d(c, "isViewTopLayoutDislike2 identified ", view);
        }
        return z;
    }

    private boolean m(View view) {
        boolean z = view.getClass().getName().equals("com.bytedance.sdk.openadsdk.core.widget.ShadowTextView") || (view.getClass().getName().startsWith(com.safedk.android.utils.h.u) && (view instanceof TextView));
        if (z) {
            Logger.d(c, "isViewShadowTextView identified ", view);
        }
        return z;
    }

    private boolean n(View view) {
        boolean z = view.getClass().getName().equals("com.bytedance.sdk.openadsdk.core.widget.ShadowImageView") || (view.getClass().getName().startsWith(com.safedk.android.utils.h.u) && (view instanceof ImageView));
        if (z) {
            Logger.d(c, "isViewShadowImageView identified ", view);
        }
        return z;
    }

    private boolean a(WeakReference<View> weakReference) {
        if (weakReference == null || weakReference.get() == null) {
            return false;
        }
        boolean contains = weakReference.get().getClass().getName().contains("NativeExpressVideoView");
        if (contains) {
            Logger.d(c, "isViewNativeExpressVideoView identified ", weakReference.get());
        }
        return contains;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public void a(com.safedk.android.analytics.brandsafety.d dVar, List<WeakReference<View>> list) {
        boolean z = false;
        for (WeakReference<View> weakReference : list) {
            if (weakReference != null && weakReference.get() != null && a(weakReference)) {
                Logger.d(c, "save screenshot view - saving view= ", weakReference.get(), ", with key= ", dVar);
                this.Q.put(dVar, new WeakReference<>(weakReference.get()));
                z = true;
            }
        }
        if (!z) {
            super.a(dVar, list);
        }
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d
    public void i() {
        super.i();
        com.safedk.android.utils.e.a(this.aP, "PangleDiscovery:creativeInfosById");
        com.safedk.android.utils.e.a(this.aO, "PangleDiscovery:creativeInfosByEndcard");
        com.safedk.android.utils.e.a(this.aN, "PangleDiscovery:creativeInfosByClickUrl");
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public void a(View view, int i2, int i3) {
        boolean z = (View.MeasureSpec.getSize(i2) == 0 && View.MeasureSpec.getSize(i3) == 0) ? false : true;
        Logger.d(c, "view on measure - view= ", view, ",   size is not zero= ", Boolean.valueOf(z));
        String name = view.getClass().getName();
        if (TextUtils.isEmpty(name)) {
            return;
        }
        if ((name.equals(aD) || name.equals(aE)) && z) {
            String a = BrandSafetyUtils.a(view);
            Logger.d(c, Logger.FeatureTag.AD_CAPTURE, "view on measure - view is pp/dislike, Stop taking screenshot for current impression, address=", a);
            b.a(a, com.safedk.android.analytics.brandsafety.m.q, new m.a[0]);
            CreativeInfoManager.b(com.safedk.android.utils.h.u, a);
        }
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public boolean q(String str) {
        HashMap hashMap;
        if (str == null) {
            return false;
        }
        String replace = str.replace("/?", "?");
        synchronized (this.aS) {
            hashMap = new HashMap(this.aS);
        }
        for (String str2 : hashMap.keySet()) {
            if (replace.toLowerCase().startsWith(str2.toLowerCase())) {
                Logger.d(c, "should stop collecting resources, url: ", replace);
                PangleCreativeInfo pangleCreativeInfo = (PangleCreativeInfo) hashMap.get(str2);
                if (pangleCreativeInfo != null) {
                    Logger.d(c, "should stop collecting resources, ci found for url : ", replace);
                    if (pangleCreativeInfo.h() != null && pangleCreativeInfo.h().contains(PangleCreativeInfo.E)) {
                        Logger.d(c, "should stop collecting resources, identified website end card for url : ", replace);
                        List<CreativeInfo> list = this.K.get(pangleCreativeInfo.L());
                        if (list == null || list.isEmpty()) {
                            list = new ArrayList<>();
                            list.add(pangleCreativeInfo);
                        }
                        for (CreativeInfo creativeInfo : list) {
                            creativeInfo.a(true);
                            creativeInfo.a((Boolean) true);
                        }
                        return true;
                    }
                } else {
                    continue;
                }
            }
        }
        return false;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public boolean A(String str) {
        if (str.contains("\"did\"") && str.contains("\"s_send_ts\"")) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0131 A[ADDED_TO_REGION] */
    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void e(String str) {
        boolean z;
        JSONObject optJSONObject;
        try {
            if (!str.startsWith("{\"creatives\"") && !str.startsWith("{\"interaction_type\"")) {
                if (str.contains("{\"app_log_url\"")) {
                    Logger.printFullVerboseLog(c, "message is: ", str);
                    final SafeDK safeDK = SafeDK.getInstance();
                    if (!str.contains("\"tag\":\"fullscreen_interstitial_ad\"") && !str.contains("\"tag\":\"rewarded_video\"")) {
                        if (!str.contains("\"tag\":\"landingpage_direct\",\"label\":\"load_finish\"") && (!str.contains("\"tag\":\"landingpage_direct\"") || !str.contains("\"event\":\"progress_load_finish\""))) {
                            if (str.contains("\"tag\":\"banner_ad\"") && ((str.contains("\"event\":\"feed_over\"") || str.contains("\"event\":\"play_error\"")) && com.safedk.android.utils.n.n(str) && (optJSONObject = new JSONObject(str).optJSONObject("params")) != null)) {
                                JSONObject optJSONObject2 = optJSONObject.optJSONObject("log_extra");
                                String optString = optJSONObject.optString("log_extra");
                                if (!TextUtils.isEmpty(optString) && com.safedk.android.utils.n.n(optString) && optJSONObject2 == null) {
                                    optJSONObject2 = new JSONObject(optString);
                                }
                                if (optJSONObject2 != null) {
                                    final String string = optJSONObject2.getString("req_id");
                                    if (!TextUtils.isEmpty(string) && safeDK != null && safeDK.A() != null) {
                                        this.b.schedule(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.creatives.discoveries.o.1
                                            @Override // java.lang.Runnable
                                            public void run() {
                                                safeDK.A().g(o.this.U, string);
                                            }
                                        }, 1L, TimeUnit.SECONDS);
                                    }
                                }
                            }
                            z = false;
                            if (z && safeDK != null && safeDK.z() != null) {
                                safeDK.z().s(this.U);
                            }
                            return;
                        }
                        CreativeInfoManager.a(this.U, (String) null, true, "event");
                        if (safeDK != null && safeDK.z() != null) {
                            Logger.d(c, "landingpage_direct added to downstream struct");
                            safeDK.z().g(com.safedk.android.utils.h.u, "landingpage_direct");
                        }
                        z = true;
                        if (z) {
                            safeDK.z().s(this.U);
                        }
                        return;
                    }
                    if (!str.contains("\"label\":\"feed_over\"") && !str.contains("\"label\":\"skip\"") && (!str.contains("\"label\":\"endcard_page_info\"") || !str.contains("\"track_name\\\":\\\"endcard_pageview\\\""))) {
                        if (str.contains("\"event\":\"feed_play\"")) {
                            Logger.d(c, "video start event detected");
                            CreativeInfoManager.a(this.U, (String) null, false, "event");
                        }
                        z = false;
                        if (z) {
                        }
                        return;
                    }
                    CreativeInfoManager.a(this.U, (String) null, true, "event");
                    z = true;
                    if (z) {
                    }
                    return;
                }
                if (com.safedk.android.utils.n.n(str)) {
                    JSONObject jSONObject = new JSONObject(str);
                    String optString2 = jSONObject.optString("track_name");
                    if (!TextUtils.isEmpty(optString2) && optString2.equals("endcard_pageview")) {
                        Logger.d(c, "json object init - found endcard");
                        CreativeInfoManager.f(this.U);
                    } else if (!TextUtils.isEmpty(jSONObject.optString("video_url")) && !TextUtils.isEmpty(jSONObject.optString("total_duration"))) {
                        Logger.d(c, "json object init - video ended");
                        CreativeInfoManager.a(this.U, (String) null, true, "event");
                    }
                    if (jSONObject.has("clickAreaType") && jSONObject.get("clickAreaType").equals("View-DISLIKE")) {
                        Logger.d(c, "json object init - dislike view clicked");
                        List<com.safedk.android.analytics.brandsafety.o> a = SafeDK.getInstance().z().I.a(com.safedk.android.utils.h.u);
                        if (a != null && a.size() == 1) {
                            String a2 = BrandSafetyUtils.a(a.get(0).K());
                            Logger.d(c, Logger.FeatureTag.AD_CAPTURE, "json object init - clicked the 'top dislike' ShadowTextView. Stop taking screenshot for current impression, address=", a2);
                            b.a(a2, com.safedk.android.analytics.brandsafety.m.q, new m.a[0]);
                            CreativeInfoManager.b(com.safedk.android.utils.h.u, a2);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            CreativeInfoManager.a(this.U, "@!1:ad_fetch@!", str, (Map<String, List<String>>) null);
        } catch (Throwable th) {
            Logger.e(c, "Exception in json object detected", th);
        }
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public List<String> e() {
        List<String> e2 = super.e();
        e2.add("url");
        return e2;
    }

    public static String a(Drawable drawable) {
        if (drawable == null) {
            return null;
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            if (drawable instanceof BitmapDrawable) {
                BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
                if (bitmapDrawable.getBitmap() != null) {
                    byte[] ninePatchChunk = bitmapDrawable.getBitmap().getNinePatchChunk();
                    if (ninePatchChunk != null) {
                        messageDigest.update(ninePatchChunk);
                    } else {
                        messageDigest.update(bitmapDrawable.getBitmap().getConfig().toString().getBytes("UTF-8"));
                        messageDigest.update(String.valueOf(bitmapDrawable.getBitmap().getWidth()).getBytes("UTF-8"));
                        messageDigest.update(String.valueOf(bitmapDrawable.getBitmap().getHeight()).getBytes("UTF-8"));
                    }
                }
            } else if (drawable instanceof ColorDrawable) {
                messageDigest.update(String.valueOf(((ColorDrawable) drawable).getColor()).getBytes("UTF-8"));
            } else {
                messageDigest.update(drawable.getClass().getName().getBytes("UTF-8"));
                messageDigest.update(String.valueOf(drawable.getIntrinsicWidth()).getBytes("UTF-8"));
                messageDigest.update(String.valueOf(drawable.getIntrinsicHeight()).getBytes("UTF-8"));
            }
            byte[] digest = messageDigest.digest();
            StringBuilder sb = new StringBuilder();
            for (byte b : digest) {
                String hexString = Integer.toHexString(b & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
                if (hexString.length() == 1) {
                    sb.append('0');
                }
                sb.append(hexString);
            }
            return sb.toString();
        } catch (Exception e2) {
            Logger.d(c, "Exception : ", e2.getMessage(), e2);
            return null;
        }
    }
}
