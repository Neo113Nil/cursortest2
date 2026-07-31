package com.safedk.android.analytics.brandsafety.creatives.discoveries;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import android.webkit.WebView;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.RedirectDetails;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import com.safedk.android.analytics.brandsafety.creatives.infos.SmaatoCreativeInfo;
import com.safedk.android.analytics.events.BrandSafetyEvent;
import com.safedk.android.utils.LimitedConcurrentHashMap;
import com.safedk.android.utils.Logger;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Matcher;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class q extends d {
    private static final String V = "adtype";
    private static final String W = "adSourceId";
    private static final String X = "track.smaato.net";
    private static final String Y = "clicktrackers";
    private static final String Z = "t";
    private static final String aa = "KEY_CTA_URL";
    private static final String ab = "smaato_sdk_video_companion_view_id";
    private static final String ac = "signaldata";
    private static final String ad = "adm";
    private static final String ae = "ads";
    private static final String af = "assets";
    private static final String ag = "data";
    private static final String ah = "html";
    private static final String ai = "vast2";
    private static final int an = 15;
    public static final String b = "smaato://open";
    public static final String c = "smaato://expand";
    public static final String d = "url";
    private static final String f = "SmaatoDiscovery";
    private static final String g = "seatbid";
    private static final String h = "bid";
    private static final String i = "adm";
    private static final String j = "richmedia";
    private static final String k = "mediadata";
    private static final String l = "content";
    private static final String m = "id";
    private static final String n = "adomain";
    private static final String o = "iurl";
    private static final String p = "ext";
    private static final String q = "smt";
    private final Map<String, CreativeInfo> aj;
    public static final String[] e = {"smaato://addEventListener", "smaato://close"};
    private static final Map<String, Set<CreativeInfo>> ak = new ConcurrentHashMap();
    private static final Map<Integer, Set<CreativeInfo>> al = new ConcurrentHashMap();
    private static final Map<String, CreativeInfo> am = new ConcurrentHashMap();
    private static final Map<String, WeakReference<WebView>> ao = new LimitedConcurrentHashMap(15);
    private static final Map<String, String> ap = new LimitedConcurrentHashMap(15);

    public q() {
        super(com.safedk.android.utils.h.v, f);
        this.aj = new ConcurrentHashMap();
        this.E.b(AdNetworkConfiguration.SUPPORTS_PREFETCH_RECEIVING_BY_APPLOVIN, true);
        this.E.b(AdNetworkConfiguration.SUPPORTS_BANNER_IMPRESSION_TRACKING, true);
        this.E.b(AdNetworkConfiguration.SUPPORTS_MREC_IMPRESSION_TRACKING, true);
        this.E.b(AdNetworkConfiguration.SHOULD_EXTRACT_AD_ID_FROM_BANNER_WEB_VIEW, true);
        this.E.b(AdNetworkConfiguration.USE_INPUT_STREAM_EVENT_AS_RESOURCE_LOADED_INDICATION, true);
        this.E.b(AdNetworkConfiguration.AD_NETWORK_TO_IGNORE, "SMAATO_NETWORK");
        this.E.b(AdNetworkConfiguration.SHOULD_ALLOW_CI_MATCHING_WITH_INCOMPATIBLE_EVENT_IDS, true);
        this.E.b(AdNetworkConfiguration.SUPPORTS_JAVASCRIPT_BASED_VIDEO_STATE_DETECTION, true);
        this.E.b(AdNetworkConfiguration.SHOULD_CAPTURE_SURFACE_VIEW_WHEN_USING_PIXELCOPY, true);
        this.E.b(AdNetworkConfiguration.SUPPORTS_AUTO_REDIRECTS_IDENTIFICATION, true);
        this.E.b(AdNetworkConfiguration.SUPPORTS_EXPANDED_ADS_IDENTIFICATION, true);
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d
    protected List<CreativeInfo> a(String str, String str2, Map<String, List<String>> map, c.a aVar, byte[] bArr) throws JSONException {
        Logger.printFullVerboseLog(f, Logger.FeatureTag.PREFETCH, "generate info started, url: ", str, ", max params: ", aVar, ", bufferValue: ", str2);
        ArrayList arrayList = new ArrayList();
        if (com.safedk.android.utils.n.n(str2)) {
            JSONObject jSONObject = new JSONObject(str2);
            if (jSONObject.has(g)) {
                JSONArray jSONArray = jSONObject.getJSONArray(g);
                for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
                    if (jSONObject2.has("bid")) {
                        JSONArray jSONArray2 = jSONObject2.getJSONArray("bid");
                        for (int i3 = 0; i3 < jSONArray2.length(); i3++) {
                            arrayList.add(a(jSONArray2.getJSONObject(i3), aVar));
                        }
                    }
                }
            }
        } else {
            Logger.d(f, "generate info - not a valid JSON string");
        }
        return arrayList;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public String a(String str, String str2, WeakReference<WebView> weakReference) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        ao.put(str, weakReference);
        String replaceFirst = str.replaceFirst("<head>[\\S\\s]*</head>", "<head></head>");
        for (String str3 : am.keySet()) {
            if (str.contains(str3)) {
                CreativeInfo creativeInfo = am.get(str3);
                Logger.d(f, "get ad id from resource - ci found= ", creativeInfo);
                if (creativeInfo != null) {
                    return creativeInfo.L();
                }
            } else if (replaceFirst.contains(str3.replaceFirst("<head>[\\S\\s]*</head>", "<head></head>"))) {
                CreativeInfo creativeInfo2 = am.get(str3);
                Logger.d(f, "get ad id from resource - ci found (no head tag)= ", creativeInfo2);
                if (creativeInfo2 != null) {
                    return creativeInfo2.L();
                }
            } else {
                continue;
            }
        }
        return null;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public boolean n(String str) {
        if (!ap.containsKey(str)) {
            Logger.d(f, "try reverse matching with ad id - ad id ", str, " is not in the adIdToSource keys: ", ap.keySet());
            return false;
        }
        return a(ap.get(str), com.safedk.android.utils.h.v, ao, am, d.t);
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d
    public boolean a(String str, String str2, Map<String, WeakReference<WebView>> map, Map<String, CreativeInfo> map2, String str3) {
        WeakReference<WebView> weakReference;
        try {
            Logger.printFullVerboseLog(f, "try reverse matching, source: ", str);
            String replaceFirst = str.replaceFirst("<head>[\\S\\s]*</head>", "<head></head>");
            weakReference = null;
            Iterator<String> it = map.keySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                String next = it.next();
                if (next.contains(str)) {
                    Logger.printFullVerboseLog(f, "try reverse matching by html, webViewRef: ", null);
                    weakReference = map.get(next);
                    break;
                }
                if (next.replaceFirst("<head>[\\S\\s]*</head>", "<head></head>").contains(replaceFirst)) {
                    Logger.printFullVerboseLog(f, "try reverse matching without head tag, webViewRef: ", null);
                    weakReference = map.get(next);
                    break;
                }
            }
        } catch (Throwable th) {
            Logger.printFullVerboseLog(f, "try reverse matching encountered exception: ", th);
        }
        if (!com.safedk.android.utils.n.a((Reference<?>) weakReference)) {
            Logger.d(f, "try reverse matching, webViewRef is null or not valid: ", weakReference);
            return false;
        }
        WebView webView = weakReference.get();
        if (map2.containsKey(str)) {
            CreativeInfo creativeInfo = map2.get(str);
            if (creativeInfo != null) {
                String L = creativeInfo.L();
                if ((str3.equals(d.s) && c(webView, L)) || (str3.equals(d.t) && !a(webView, L).isEmpty())) {
                    Logger.d(f, Logger.FeatureTag.CI_MATCHING, "try reverse matching, found a match using reverse! adId=", L);
                    return true;
                }
            }
        } else {
            Logger.d(f, "try reverse matching, keyToCIsMap does not contain source");
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x01ee A[Catch: JSONException -> 0x021d, TRY_LEAVE, TryCatch #3 {JSONException -> 0x021d, blocks: (B:107:0x01df, B:108:0x01e8, B:110:0x01ee), top: B:106:0x01df }] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0274  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private CreativeInfo a(JSONObject jSONObject, c.a aVar) throws JSONException {
        String str;
        String str2;
        String str3;
        String str4;
        boolean z;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        BrandSafetyUtils.AdType adType;
        String str11;
        String str12;
        char c2;
        JSONObject jSONObject2;
        String str13;
        boolean z2;
        JSONArray jSONArray;
        String str14;
        JSONArray jSONArray2;
        String str15;
        ArrayList arrayList = new ArrayList();
        if (!jSONObject.has("id")) {
            str = null;
        } else {
            str = jSONObject.getString("id");
        }
        if (!jSONObject.has(o)) {
            str2 = null;
        } else {
            str2 = jSONObject.getString(o);
        }
        if (!jSONObject.has("ext")) {
            str3 = str;
            str4 = null;
            z = false;
            str5 = null;
            str6 = null;
        } else {
            JSONObject jSONObject3 = jSONObject.getJSONObject("ext");
            if (!jSONObject3.has(q)) {
                str5 = null;
            } else {
                str5 = jSONObject3.getJSONObject(q).optString(V, null);
            }
            JSONObject optJSONObject = jSONObject3.optJSONObject(ac);
            if (optJSONObject != null) {
                str3 = str;
                c2 = 0;
            } else {
                String optString = jSONObject3.optString(ac);
                if (TextUtils.isEmpty(optString)) {
                    str3 = str;
                    c2 = 0;
                } else {
                    try {
                        jSONObject2 = new JSONObject(optString);
                        str3 = str;
                        c2 = 0;
                    } catch (Exception e2) {
                        StringBuilder sb = new StringBuilder();
                        str3 = str;
                        sb.append("parse creative - exception= ");
                        sb.append(e2);
                        c2 = 0;
                        Logger.d(f, sb.toString());
                    }
                    Object[] objArr = new Object[2];
                    objArr[c2] = "parse creative - signal data= ";
                    objArr[1] = jSONObject2;
                    Logger.printFullVerboseLog(f, objArr);
                    if (jSONObject2 != null) {
                        str13 = str5;
                    } else {
                        JSONObject optJSONObject2 = jSONObject2.optJSONObject("adm");
                        if (optJSONObject2 == null) {
                            str13 = str5;
                        } else {
                            JSONArray optJSONArray = optJSONObject2.optJSONArray("ads");
                            if (optJSONArray == null) {
                                str13 = str5;
                            } else {
                                int i2 = 0;
                                boolean z3 = false;
                                String str16 = null;
                                str6 = null;
                                while (true) {
                                    z2 = z3;
                                    if (i2 >= optJSONArray.length()) {
                                        break;
                                    }
                                    JSONObject optJSONObject3 = optJSONArray.optJSONObject(i2);
                                    if (optJSONObject3 == null) {
                                        jSONArray = optJSONArray;
                                        str14 = str5;
                                    } else {
                                        jSONArray = optJSONArray;
                                        JSONArray optJSONArray2 = optJSONObject3.optJSONArray("assets");
                                        if (optJSONArray2 == null) {
                                            str14 = str5;
                                        } else {
                                            int i3 = 0;
                                            while (true) {
                                                str14 = str5;
                                                if (i3 < optJSONArray2.length()) {
                                                    JSONObject optJSONObject4 = optJSONArray2.optJSONObject(i3);
                                                    if (optJSONObject4 == null) {
                                                        jSONArray2 = optJSONArray2;
                                                        str15 = str16;
                                                    } else {
                                                        jSONArray2 = optJSONArray2;
                                                        JSONObject optJSONObject5 = optJSONObject4.optJSONObject("data");
                                                        if (optJSONObject5 == null) {
                                                            str15 = str16;
                                                        } else {
                                                            Object opt = optJSONObject5.opt("html");
                                                            String str17 = str16;
                                                            if (!(opt instanceof String)) {
                                                                str16 = str17;
                                                            } else {
                                                                Logger.d(f, "parse creative - found html data, new prefetch");
                                                                str16 = (String) opt;
                                                                arrayList.addAll(com.safedk.android.utils.n.f(C(str16)));
                                                            }
                                                            String optString2 = optJSONObject5.optString("vast2");
                                                            if (!TextUtils.isEmpty(optString2)) {
                                                                Logger.d(f, "parse creative - found vast data, new prefetch");
                                                                str6 = optString2;
                                                                z2 = true;
                                                            }
                                                            i3++;
                                                            str5 = str14;
                                                            optJSONArray2 = jSONArray2;
                                                        }
                                                    }
                                                    str16 = str15;
                                                    i3++;
                                                    str5 = str14;
                                                    optJSONArray2 = jSONArray2;
                                                }
                                            }
                                        }
                                    }
                                    z3 = z2;
                                    i2++;
                                    optJSONArray = jSONArray;
                                    str5 = str14;
                                }
                                str4 = str16;
                                z = z2;
                            }
                        }
                    }
                    str5 = str13;
                    str4 = null;
                    z = false;
                    str6 = null;
                }
            }
            jSONObject2 = optJSONObject;
            Object[] objArr2 = new Object[2];
            objArr2[c2] = "parse creative - signal data= ";
            objArr2[1] = jSONObject2;
            Logger.printFullVerboseLog(f, objArr2);
            if (jSONObject2 != null) {
            }
            str5 = str13;
            str4 = null;
            z = false;
            str6 = null;
        }
        if (!jSONObject.has("adomain")) {
            str7 = null;
        } else {
            str7 = jSONObject.getJSONArray("adomain").getString(0);
        }
        if (!jSONObject.has("adm")) {
            str8 = str6;
            str9 = null;
            str10 = null;
        } else {
            str8 = jSONObject.getString("adm");
            arrayList.addAll(com.safedk.android.utils.n.f(str8));
            if (com.safedk.android.analytics.brandsafety.creatives.h.b(str8)) {
                str9 = null;
                str10 = null;
            } else {
                try {
                    JSONObject jSONObject4 = new JSONObject(str8);
                    if (!jSONObject4.has(j)) {
                        str9 = null;
                        str12 = null;
                    } else {
                        JSONObject jSONObject5 = jSONObject4.getJSONObject(j);
                        if (jSONObject5.has(k)) {
                            JSONObject jSONObject6 = jSONObject5.getJSONObject(k);
                            if (jSONObject6.has("content")) {
                                String C = C(jSONObject6.getString("content"));
                                str12 = F(C);
                                try {
                                    arrayList.addAll(com.safedk.android.utils.n.f(C));
                                    if (jSONObject5.has("clicktrackers")) {
                                        str9 = null;
                                    } else {
                                        JSONArray jSONArray3 = jSONObject5.getJSONArray("clicktrackers");
                                        str9 = null;
                                        for (int i4 = 0; i4 < jSONArray3.length(); i4++) {
                                            try {
                                                String string = jSONArray3.getString(i4);
                                                if (com.safedk.android.utils.k.d(string, Z) != null) {
                                                    str9 = com.safedk.android.utils.k.d(string, Z);
                                                    Logger.d(f, "generate info - adId is ", str9);
                                                }
                                            } catch (JSONException e3) {
                                                Logger.d(f, "generate info - not a json string");
                                                str10 = str12;
                                                str8 = str6;
                                                if (aVar.b != BrandSafetyEvent.AdFormatType.INTER) {
                                                }
                                                adType = BrandSafetyUtils.AdType.INTERSTITIAL;
                                                if (str8 == null) {
                                                }
                                                if (str9 == null) {
                                                }
                                                Logger.d(f, "generate info - id: ", str9, ", max params: ", aVar);
                                                SmaatoCreativeInfo smaatoCreativeInfo = new SmaatoCreativeInfo(str9, aVar.d, adType, aVar.b, aVar.c, str7, str2, str11, this.I, str10);
                                                smaatoCreativeInfo.a = z;
                                                if (!TextUtils.isEmpty(str4)) {
                                                }
                                                smaatoCreativeInfo.h(aVar.a);
                                                this.aj.put(str9, smaatoCreativeInfo);
                                                if (str8 != null) {
                                                }
                                                ArrayList<String> f2 = com.safedk.android.utils.n.f(jSONObject.toString());
                                                f2.addAll(arrayList);
                                                smaatoCreativeInfo.b((List<String>) f2);
                                                return smaatoCreativeInfo;
                                            }
                                        }
                                    }
                                } catch (JSONException e4) {
                                    str9 = null;
                                    Logger.d(f, "generate info - not a json string");
                                    str10 = str12;
                                    str8 = str6;
                                    if (aVar.b != BrandSafetyEvent.AdFormatType.INTER) {
                                    }
                                    adType = BrandSafetyUtils.AdType.INTERSTITIAL;
                                    if (str8 == null) {
                                    }
                                    if (str9 == null) {
                                    }
                                    Logger.d(f, "generate info - id: ", str9, ", max params: ", aVar);
                                    SmaatoCreativeInfo smaatoCreativeInfo2 = new SmaatoCreativeInfo(str9, aVar.d, adType, aVar.b, aVar.c, str7, str2, str11, this.I, str10);
                                    smaatoCreativeInfo2.a = z;
                                    if (!TextUtils.isEmpty(str4)) {
                                    }
                                    smaatoCreativeInfo2.h(aVar.a);
                                    this.aj.put(str9, smaatoCreativeInfo2);
                                    if (str8 != null) {
                                    }
                                    ArrayList<String> f22 = com.safedk.android.utils.n.f(jSONObject.toString());
                                    f22.addAll(arrayList);
                                    smaatoCreativeInfo2.b((List<String>) f22);
                                    return smaatoCreativeInfo2;
                                }
                            }
                        }
                        str12 = null;
                        if (jSONObject5.has("clicktrackers")) {
                        }
                    }
                    str10 = str12;
                    str8 = str6;
                } catch (JSONException e5) {
                    str9 = null;
                    str12 = null;
                }
            }
        }
        if (aVar.b != BrandSafetyEvent.AdFormatType.INTER || aVar.b == BrandSafetyEvent.AdFormatType.REWARD) {
            adType = BrandSafetyUtils.AdType.INTERSTITIAL;
        } else {
            adType = BrandSafetyUtils.AdType.BANNER;
        }
        if (str8 == null) {
            str11 = str5;
        } else if (TextUtils.isEmpty(str5)) {
            str11 = "vast";
        } else {
            str11 = str5 + "/vast";
        }
        if (str9 == null) {
            str9 = str3;
        }
        Logger.d(f, "generate info - id: ", str9, ", max params: ", aVar);
        SmaatoCreativeInfo smaatoCreativeInfo22 = new SmaatoCreativeInfo(str9, aVar.d, adType, aVar.b, aVar.c, str7, str2, str11, this.I, str10);
        smaatoCreativeInfo22.a = z;
        if (!TextUtils.isEmpty(str4)) {
            am.put(str4, smaatoCreativeInfo22);
            ap.put(smaatoCreativeInfo22.L(), str4);
            Logger.d(f, "parse creative - saving ci id= ", str9, ",   htmlStr= ", str4);
        }
        smaatoCreativeInfo22.h(aVar.a);
        this.aj.put(str9, smaatoCreativeInfo22);
        if (str8 != null) {
            a((CreativeInfo) smaatoCreativeInfo22, (String) null, str8, false);
            if (smaatoCreativeInfo22.H() != null && !ak.containsKey(com.safedk.android.utils.k.q(smaatoCreativeInfo22.H()))) {
                Logger.d(f, "generate info - no entry for video url, calling handleVastMediaFile for ", smaatoCreativeInfo22.H());
                a(smaatoCreativeInfo22.H(), (CreativeInfo) smaatoCreativeInfo22);
            }
        }
        ArrayList<String> f222 = com.safedk.android.utils.n.f(jSONObject.toString());
        f222.addAll(arrayList);
        smaatoCreativeInfo22.b((List<String>) f222);
        return smaatoCreativeInfo22;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d
    protected String a(String str, CreativeInfo creativeInfo) {
        String str2;
        Logger.d(f, "handle vast media file - started, mediaUrl = ", str);
        if (!(creativeInfo instanceof SmaatoCreativeInfo)) {
            str2 = null;
        } else if (((SmaatoCreativeInfo) creativeInfo).a) {
            str2 = Long.toString(str.hashCode() & 4294967295L);
            Logger.d(f, "handle vast media file - new hashing method. hash code= ", str2);
            d(creativeInfo, str2);
        } else {
            str2 = com.safedk.android.utils.k.q(str);
            Logger.d(f, "handle vast media file - old hashing method. hash code= ", str2);
            d(creativeInfo, str2);
        }
        Logger.d(f, "handle vast media file - mediaUrl = ", str, ", url hash = ", str2, " , ci id = ", creativeInfo.L(), ", videoUrlHashSetToCiMap keys: ", ak.keySet());
        return null;
    }

    private static void d(CreativeInfo creativeInfo, String str) {
        Set<CreativeInfo> set = ak.get(str);
        if (set == null) {
            set = new HashSet<>();
            ak.put(str, set);
        }
        set.add(creativeInfo);
        Logger.d(f, "save vast video identifier to ci - saving to videoIdToCiMap.  videoUrl= ", str, ",    ci= ", creativeInfo.aa());
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public void b(Object obj, Object obj2) {
        try {
            String a = a(Uri.parse((String) obj2));
            Logger.d(f, "handle media player set data source call - hash = ", a, ", videoUrlHashSetToCiMap keys = ", ak.keySet());
            if (!TextUtils.isEmpty(a) && ak.containsKey(a)) {
                Set<CreativeInfo> D = D(a);
                Logger.d(f, "handle media player set data source call - found? ci set= ", D);
                if (D != null) {
                    int identityHashCode = System.identityHashCode(obj);
                    Logger.d(f, "handle media player set data source call - putting mediaPlayerHashToCiSetMap playerId= ", Integer.valueOf(identityHashCode));
                    al.put(Integer.valueOf(identityHashCode), D);
                }
            }
        } catch (Exception e2) {
            Logger.e(f, "exception when trying to add mediaPlayer id and SmaatoCreativeInfo ", e2.getMessage());
        }
    }

    private static Set<CreativeInfo> D(String str) {
        Logger.d(f, "find ci by video url - videoUrlToCiSetMap size= ", Integer.valueOf(ak.size()), ",   keys= ", ak.keySet());
        if (!TextUtils.isEmpty(str)) {
            for (String str2 : ak.keySet()) {
                if (str2.contains(str)) {
                    Set<CreativeInfo> set = ak.get(str2);
                    Logger.d(f, "find ci by video url - creative info set found= ", set);
                    return set;
                }
            }
            return null;
        }
        return null;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public String c(Object obj) {
        int identityHashCode = System.identityHashCode(obj);
        Logger.d(f, "get creative info after media player start call - mediaPlayer= ", obj, ", player id= ", Integer.valueOf(identityHashCode));
        Set<CreativeInfo> set = al.get(Integer.valueOf(identityHashCode));
        if (set != null) {
            Logger.d(f, "get creative info after media player start call - found ? ci set (", Integer.valueOf(set.size()), ")= ", set);
            if (set.size() == 1) {
                CreativeInfo next = set.iterator().next();
                if (next != null) {
                    Logger.d(f, "get creative info after media player start call - found ci Id = ", next.L());
                    e(next);
                    return next.L();
                }
                return null;
            }
            if (set.size() > 1) {
                try {
                    CreativeInfo next2 = set.iterator().next();
                    set.remove(next2);
                    Logger.d(f, "get creative info after media player start call - found ci id = ", next2.L());
                    return next2.L();
                } catch (Throwable th) {
                    Logger.d(f, "get creative info after media player start call exception : ", th, th);
                    return null;
                }
            }
            Logger.d(f, "get creative info after media player start call - = could not find ci. ci set= ", set);
            return null;
        }
        return null;
    }

    private static void e(CreativeInfo creativeInfo) {
        if (creativeInfo != null) {
            Logger.d(f, "remove matched ci from all collections - removing ci from collection mediaPlayerHashToCiSetMap");
            c(f, creativeInfo, al);
            Logger.d(f, "remove matched ci from all collections - removing ci from collection videoUrlToCiListMap");
            c(f, creativeInfo, ak);
        }
    }

    public static String a(Uri uri) {
        String path = uri.getPath();
        if (path == null || path.isEmpty()) {
            return "";
        }
        int lastIndexOf = path.lastIndexOf(47);
        if (lastIndexOf != -1) {
            path = path.substring(lastIndexOf + 1);
        }
        int indexOf = path.indexOf(46);
        return indexOf != -1 ? path.substring(0, indexOf) : path;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d
    protected boolean B(String str) {
        return false;
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
    public List<String> e() {
        List<String> e2 = super.e();
        e2.add(aa);
        return e2;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public CreativeInfo b(Object obj) {
        Logger.d(f, "generate info adInstance: ", obj.getClass().getName(), ": ", obj, ", hashes: ", this.aj.keySet().toString());
        if (obj instanceof String) {
            String str = (String) obj;
            CreativeInfo remove = this.aj.remove(str);
            if (remove != null) {
                Logger.printFullVerboseLog(f, Logger.FeatureTag.CI_MATCHING, "generate info adInstance - MATCH FOUND, CI: ", remove);
                return remove;
            }
            Logger.d(f, "generate info adInstance - no match cannot match with ad ID: ", str, ", creativeInfosById keyset : ", this.aj);
            return null;
        }
        return null;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public boolean e(View view) {
        if (super.e(view) || com.safedk.android.utils.n.c(view, "AdContentView")) {
            return true;
        }
        return false;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d
    protected List<String> j() {
        return Arrays.asList(com.safedk.android.utils.h.v);
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d
    protected String a(BrandSafetyUtils.AdType adType, Object obj, String str) {
        if (obj instanceof Collection) {
            Logger.printFullVerboseLog(f, "extract ad info, found field class: ", obj.getClass().getName(), ", type: ", obj.getClass().getName(), ", name: ", str, ", value: ", obj);
            return a((Collection<?>) obj);
        }
        if (obj instanceof Map) {
            Logger.printFullVerboseLog(f, "extract ad info, found field class: ", obj.getClass().getName(), ", type: ", obj.getClass().getName(), ", name: ", str, ", value: ", obj);
            return a(((Map) obj).values());
        }
        return null;
    }

    private String a(Collection<?> collection) {
        return a(collection, 0);
    }

    private String a(Collection<?> collection, int i2) {
        if (i2 >= 3) {
            Logger.d(f, "extract ad id from url list - tried to extract 3 times and encountered ConcurrentModificationException, exiting with null");
            return null;
        }
        if (i2 > 0) {
            Logger.d(f, "extract ad id from url list - retrying for the ", Integer.valueOf(i2), " time after getting Concurrent Modification Exception");
        }
        try {
            for (Object obj : collection) {
                Logger.d(f, "extract ad info - list: ", collection);
                if (obj.toString().contains(X)) {
                    String d2 = com.safedk.android.utils.k.d(obj.toString(), Z);
                    if (d2 != null) {
                        Logger.d(f, "extract ad info - ad source ID: ", d2);
                        return d2;
                    }
                    String d3 = com.safedk.android.utils.k.d(obj.toString(), W);
                    if (d3 != null) {
                        Logger.d(f, "extract ad info - ad source ID: ", d3);
                        return d3;
                    }
                }
            }
            return null;
        } catch (ConcurrentModificationException e2) {
            return a(collection, i2 + 1);
        }
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public WeakReference<WebView> a(List<WeakReference<WebView>> list, String str) {
        if (list.isEmpty()) {
            return null;
        }
        for (WeakReference<WebView> weakReference : list) {
            if (weakReference.get() != null) {
                try {
                    e(str, BrandSafetyUtils.a(weakReference));
                    Logger.d(f, "select WebView: ", weakReference.get(), " context: ", weakReference.get().getContext());
                    if (weakReference.get().getResources().getResourceEntryName(weakReference.get().getId()).equals(ab)) {
                        return weakReference;
                    }
                } catch (NullPointerException e2) {
                    Logger.d(f, "select WebView failed to get resource entry name. selecting default webview.");
                }
            }
        }
        return list.get(0);
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public RedirectDetails.RedirectType l(String str) {
        if (str != null) {
            if (str.startsWith(b)) {
                return RedirectDetails.RedirectType.REDIRECT;
            }
            if (str.startsWith(c)) {
                return RedirectDetails.RedirectType.EXPAND;
            }
            for (String str2 : e) {
                if (str.startsWith(str2)) {
                    return null;
                }
            }
        }
        return RedirectDetails.RedirectType.REDIRECT;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public String m(String str) {
        if (str != null && (str.startsWith(b) || str.startsWith(c))) {
            return com.safedk.android.utils.k.d(str, "url");
        }
        return str;
    }

    public static String C(String str) {
        Matcher matcher = com.safedk.android.utils.g.a("<div\\s+[^>]*id=[\"']adm[\"'][^>]*>(.*?)</div>", 32).matcher(str);
        if (matcher.find()) {
            try {
                String str2 = new String(Base64.decode(matcher.group(1), 0));
                StringBuffer stringBuffer = new StringBuffer();
                matcher.appendReplacement(stringBuffer, Matcher.quoteReplacement("<div id=\"adm\">" + str2 + "</div>"));
                matcher.appendTail(stringBuffer);
                return stringBuffer.toString();
            } catch (Throwable th) {
                Logger.d(f, "Exception decoding html : ", th.getMessage(), th);
            }
        }
        return str;
    }
}
