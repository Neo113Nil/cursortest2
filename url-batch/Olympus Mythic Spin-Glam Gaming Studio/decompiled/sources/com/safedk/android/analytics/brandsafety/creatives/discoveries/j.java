package com.safedk.android.analytics.brandsafety.creatives.discoveries;

import android.R;
import android.app.Dialog;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.ironsource.X3;
import com.safedk.android.SafeDK;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import com.safedk.android.analytics.brandsafety.creatives.infos.LineCreativeInfo;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.PersistentConcurrentHashMap;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.lang.ref.WeakReference;
import java.security.InvalidParameterException;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class j extends d {
    private static final String V = "ic";
    private static final String W = "u";
    private static final String X = "bcns";
    private static final String Y = "cfgs";
    private static final String Z = "p";
    private static final String aa = "tr";
    private static final String ab = "k";
    private static final String ac = "v";
    private static final String ad = "ots";
    private static final int ae = 8;
    private static MessageDigest ah = null;
    private static final String b = "LineDiscovery";
    private static final String g = "terms.line";
    private static final String h = "com.five_corp.ad.FiveAdCustomLayout";
    private static final String i = "ads";
    private static final String j = "lad";
    private static final String k = "ad";
    private static final String l = "cr";
    private static final String m = "au";
    private static final String n = "ru";
    private static final String o = "whitesi";
    private static final String p = "scfg";
    private static final String q = "m";
    private static final CharSequence c = "ad2.fivecdm.com/ad";
    private static final CharSequence d = "adchk.fivecdm.com/chk";
    private static final CharSequence e = "adchk.fivecdm.com/v1";
    private static final CharSequence f = "ad2.fivecdm.com/v";
    private static Map<String, LineCreativeInfo> af = null;
    private static String ag = null;

    static {
        try {
            ah = MessageDigest.getInstance("SHA-256");
        } catch (Throwable th) {
        }
    }

    public j() {
        super("com.five_corp.ad", b);
        Logger.d(b, "ctor started");
        this.E.b(AdNetworkConfiguration.SUPPORTS_GZIP_CONTENT, true);
        this.E.b(AdNetworkConfiguration.SDK_INTERSTITIALS_RUN_ON_APP_ACTIVITY, true);
        this.E.b(AdNetworkConfiguration.SUPPORTS_BANNER_IMPRESSION_TRACKING, true);
        this.E.b(AdNetworkConfiguration.SHOULD_EXTRACT_AD_ID_FROM_BANNER_WEB_VIEW, true);
        this.E.b(AdNetworkConfiguration.SDK_USES_PLACEMENT_ID_ARRAY, true);
        this.E.b(AdNetworkConfiguration.SDK_CUSTOM_VIEW_TYPE_NAME, h);
        this.E.b(AdNetworkConfiguration.SUPPORTS_BIDDING_INTERSTITIAL_IMPRESSION_MATCHING_BY_MAX, true);
        this.E.b(AdNetworkConfiguration.SHOULD_EXTRACT_TEXT_FROM_NATIVE_BANNERS, true);
        this.E.a(AdNetworkConfiguration.NUMBER_OF_VIEWS_REMOVED_IN_FULL_SCREEN_AD_THAT_INDICATES_EOV, 2L);
        this.E.b(AdNetworkConfiguration.DO_NOT_ADD_CI_TO_FINDER_PENDING_CI_LIST, true);
        this.E.b(AdNetworkConfiguration.NOTIFY_DISCOVERY_CLASS_ABOUT_FULL_SCREEN_MATCHING, true);
        this.E.b(AdNetworkConfiguration.SHOULD_DECODE_URLS_IN_CLICK_URL_RESOLUTION, false);
        this.E.b(AdNetworkConfiguration.AVOID_MATCHING_CI_FROM_BANNER_WEB_VIEW_BEFORE_SCANNING, true);
        this.E.a(AdNetworkConfiguration.SDK_SPECIFIC_CACHED_CI_THRESHOLD, SafeDK.getInstance().U() * 3);
        this.E.b(AdNetworkConfiguration.SUPPORTS_PREFETCH_RECEIVING_BY_APPLOVIN, true);
        this.E.b(AdNetworkConfiguration.SHOULD_DECODE_BASE64_PREFECT_RECEIVED_BY_APPLOVIN, true);
        this.E.b(AdNetworkConfiguration.SET_AD_FORMAT_FROM_APPLOVIN_BUNDLE, true);
        this.E.b(AdNetworkConfiguration.SUPPORTS_MREC_IMPRESSION_TRACKING, true);
        this.E.b(AdNetworkConfiguration.SUPPORTS_MREC_IMPRESSION_EOV, true);
        try {
            af = new PersistentConcurrentHashMap("LineDiscovery_creativeIdToCI");
        } catch (InvalidParameterException e2) {
            Logger.e(b, "error initializing ", b, ", caching will not be available", e2);
        }
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d
    protected List<CreativeInfo> a(String str, String str2, Map<String, List<String>> map, c.a aVar, byte[] bArr) throws JSONException {
        String str3 = "ads";
        if (str2 != null) {
            try {
                if (str2.length() >= 10) {
                    JSONObject jSONObject = new JSONObject(str2);
                    Logger.printFullVerboseLog(b, Logger.FeatureTag.PREFETCH, "generate info started, url=", str, ", buffer=", str2);
                    ArrayList arrayList = new ArrayList();
                    if (!jSONObject.has("ads") && !jSONObject.has("lad") && !jSONObject.has("ad")) {
                        Logger.d(b, "generate info - prefetch doesn't contains expected params. ");
                        return null;
                    }
                    if (!jSONObject.has("ads")) {
                        if (jSONObject.has("lad")) {
                            str3 = "lad";
                        } else if (!jSONObject.has("ad")) {
                            str3 = null;
                        } else {
                            str3 = "ad";
                        }
                    }
                    if (str3 != null) {
                        if (!str3.equals("ad")) {
                            JSONArray jSONArray = jSONObject.getJSONArray(str3);
                            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                                JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
                                if (str3.equals("lad")) {
                                    if (jSONObject2.has("ad")) {
                                        arrayList.add(e(jSONObject2.getJSONObject("ad")));
                                    }
                                } else if (jSONObject2.has(l)) {
                                    arrayList.add(e(jSONObject2));
                                }
                            }
                        } else {
                            arrayList.add(e(jSONObject.getJSONObject("ad")));
                        }
                    }
                    return arrayList;
                }
            } catch (JSONException e2) {
                return null;
            } catch (Throwable th) {
                Logger.d(b, "Exception in generate info: ", th.getMessage(), th);
                return null;
            }
        }
        return null;
    }

    private String a(JSONObject jSONObject) {
        String str = null;
        try {
            Logger.printFullVerboseLog(b, "extract click url : bcns exists : ", Boolean.valueOf(jSONObject.has(X)), ", cfgs exists :", Boolean.valueOf(jSONObject.has(Y)));
        } catch (JSONException e2) {
            Logger.d(b, "Exception in extract click url : ", e2.getMessage(), e2);
        } catch (Throwable th) {
            Logger.d(b, "Exception in extract click url : ", th.getMessage(), th);
        }
        if (jSONObject.has(m) && !TextUtils.isEmpty(jSONObject.optString(m))) {
            return jSONObject.optString(m);
        }
        if (jSONObject.has(n) && !TextUtils.isEmpty(jSONObject.optString(n))) {
            return jSONObject.optString(n);
        }
        if (jSONObject.has(X) && (str = b(jSONObject)) != null) {
            Logger.d(b, "extract click url bcns : ", str);
            return str;
        }
        if (jSONObject.has(Y)) {
            Object obj = jSONObject.get(Y);
            if (obj instanceof JSONObject) {
                JSONObject jSONObject2 = (JSONObject) obj;
                if (jSONObject2.has(X) && (str = b(jSONObject2)) != null) {
                    Logger.d(b, "extract click url from cfgs object : ", str);
                    return str;
                }
            } else if (obj instanceof JSONArray) {
                JSONArray jSONArray = (JSONArray) obj;
                for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                    JSONObject jSONObject3 = jSONArray.getJSONObject(i2);
                    if (jSONObject3.has(X) && (str = b(jSONObject3)) != null) {
                        Logger.d(b, "extract click url from cfgs array : ", str);
                        return str;
                    }
                }
            } else {
                Logger.d(b, "extract click url, cfgs is not a JSONObject nor JSONArray : ", obj);
            }
        }
        return str;
    }

    private String b(JSONObject jSONObject) {
        try {
            if (jSONObject.has(X)) {
                JSONArray jSONArray = jSONObject.getJSONArray(X);
                for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
                    if (jSONObject2.has("p")) {
                        JSONArray jSONArray2 = jSONObject2.getJSONArray("p");
                        for (int i3 = 0; i3 < jSONArray2.length(); i3++) {
                            JSONObject jSONObject3 = jSONArray2.getJSONObject(i3);
                            if (jSONObject3.has("k") && jSONObject3.has("v") && "to".equals(jSONObject3.optString("k"))) {
                                String optString = jSONObject3.optString("v");
                                Logger.d(b, "get ClickUrl url : ", optString);
                                return optString;
                            }
                        }
                    }
                }
                return null;
            }
            return null;
        } catch (JSONException e2) {
            Logger.d(b, "Exception in get ClickUrl  : ", e2.getMessage(), e2);
            return null;
        }
    }

    private ArrayList<String> c(JSONObject jSONObject) {
        ArrayList<String> arrayList = new ArrayList<>();
        try {
            if (jSONObject.has(X)) {
                JSONArray jSONArray = jSONObject.getJSONArray(X);
                for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
                    if (jSONObject2.has("p")) {
                        JSONArray jSONArray2 = jSONObject2.getJSONArray("p");
                        for (int i3 = 0; i3 < jSONArray2.length(); i3++) {
                            if (jSONArray2.getJSONObject(i3).has("v")) {
                                arrayList.add(jSONArray2.getJSONObject(i3).getString("v"));
                            }
                        }
                    }
                }
            }
            if (jSONObject.has(aa)) {
                JSONArray jSONArray3 = jSONObject.getJSONArray(aa);
                for (int i4 = 0; i4 < jSONArray3.length(); i4++) {
                    JSONObject jSONObject3 = jSONArray3.getJSONObject(i4);
                    if (jSONObject3.has(W)) {
                        arrayList.add(jSONObject3.getString(W));
                    }
                }
            }
        } catch (JSONException e2) {
            Logger.d(b, "extract dsp domain - exception when trying to extract! ", e2);
        }
        return arrayList;
    }

    private ArrayList<String> d(JSONObject jSONObject) {
        JSONObject optJSONObject;
        ArrayList<String> arrayList = new ArrayList<>();
        if (jSONObject.has("m")) {
            arrayList.add(jSONObject.optString("m"));
        }
        if (jSONObject.has(V) && (optJSONObject = jSONObject.optJSONObject(V)) != null && !TextUtils.isEmpty(optJSONObject.optString(W))) {
            arrayList.add(optJSONObject.optString(W));
        }
        return arrayList;
    }

    private LineCreativeInfo e(JSONObject jSONObject) {
        String str;
        String optString = jSONObject.optString(l, null);
        String a = a(jSONObject);
        Logger.printFullVerboseLog(b, "generate info - clickUrl extracted: ", a);
        String optString2 = jSONObject.optString(ad);
        String optString3 = jSONObject.optString(o);
        if (TextUtils.isEmpty(optString3)) {
            optString3 = optString3.replace("\"", "").replace(X3.j.d, "").replace(X3.j.e, "");
        }
        if (TextUtils.isEmpty(optString3) && jSONObject.has(p)) {
            JSONArray optJSONArray = jSONObject.optJSONArray(p);
            StringBuilder sb = new StringBuilder();
            for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                try {
                    JSONObject jSONObject2 = optJSONArray.getJSONObject(i2);
                    if (jSONObject2.has("s")) {
                        sb.append(jSONObject2.get("s"));
                    }
                } catch (JSONException e2) {
                    Logger.d(b, "Exception extracting placements : ", e2.getMessage(), e2);
                }
                if (i2 < optJSONArray.length() - 1) {
                    sb.append(StringUtils.COMMA);
                }
            }
            Logger.d(b, "placement = ", sb.toString());
            str = sb.toString();
        } else {
            str = optString3;
        }
        Logger.d(b, "generate info - placement ID: ", str);
        LineCreativeInfo lineCreativeInfo = new LineCreativeInfo(null, optString2, optString, a, str, this.I);
        Logger.d(b, "generate info - ci created. placement ID: ", str, ", ots = ", optString2);
        synchronized (af) {
            af.put(optString2, lineCreativeInfo);
        }
        Logger.d(b, "generate info - added CI by ID, key: ", optString2, ", list size: ", Integer.valueOf(af.size()));
        ArrayList<String> f2 = com.safedk.android.utils.n.f(jSONObject.toString());
        Logger.d(b, "urls extracted from json ad object contains ", Integer.valueOf(f2.size()), " urls");
        ArrayList<String> d2 = d(jSONObject);
        f2.removeAll(d2);
        lineCreativeInfo.b(d2);
        String optString4 = jSONObject.optString("m");
        if (com.safedk.android.utils.n.s(optString4)) {
            lineCreativeInfo.p(optString4);
            lineCreativeInfo.r().remove(optString4);
            f2.remove(optString4);
            Logger.d(b, "generate info - extracted video url : ", optString4);
        }
        ArrayList<String> c2 = c(jSONObject);
        f2.removeAll(c2);
        Iterator<String> it = c2.iterator();
        while (it.hasNext()) {
            String next = it.next();
            if (lineCreativeInfo.v(next)) {
                lineCreativeInfo.x(next);
            }
        }
        lineCreativeInfo.b((List<String>) f2);
        Logger.printFullVerboseLog(b, "generate info CI updated. key: ", lineCreativeInfo.N(), ", CI: ", lineCreativeInfo);
        Logger.d(b, "generate info - added CI, list key set: ", af.keySet());
        return lineCreativeInfo;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d
    protected List<String> j() {
        return Arrays.asList("com.five_corp.ad");
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d
    protected String a(BrandSafetyUtils.AdType adType, Object obj, String str) {
        if (obj instanceof String) {
            String str2 = (String) obj;
            Logger.printFullVerboseLog(b, "extractAdInfoImpl started , stringInfo: ", str2);
            try {
                Logger.printFullVerboseLog(b, "extractAdInfoImpl extract ad info, found string: ", str2);
                if (af.containsKey(str2)) {
                    Logger.printFullVerboseLog(b, "extractAdInfoImpl extract ad info, found key: ", str2);
                    return str2;
                }
            } catch (Throwable th) {
                Logger.d(b, "extractAdInfoImpl exception : ", th.getMessage(), th);
                return null;
            }
        }
        return null;
    }

    private synchronized boolean C(String str) {
        if (CreativeInfoManager.m(str)) {
            Logger.d(b, "isInterstitialAdCreativeId ", str, " is an interstitial adId");
            return true;
        }
        if (ag == null || !ag.equals(str)) {
            return false;
        }
        Logger.d(b, "isInterstitialAdCreativeId ", str, " is a previously matched interstitial adId");
        return true;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public CreativeInfo b(Object obj) {
        if (obj == null) {
            return null;
        }
        try {
            Logger.d(b, "match info adInstance: ", obj.getClass().getName(), " : ", obj, ", hashes: ", af.keySet());
            if (obj instanceof WeakReference) {
                Dialog dialog = (Dialog) ((WeakReference) obj).get();
                if (dialog == null) {
                    Logger.d(b, "match info adInstance - dialog is null");
                    return null;
                }
                String a = a(BrandSafetyUtils.AdType.INTERSTITIAL, dialog, new ArrayList<>(), new HashSet<>());
                Logger.d(b, "extractAdInfo returned ", a);
                WeakReference weakReference = new WeakReference(dialog.getWindow().getDecorView().findViewById(R.id.content));
                if (a == null) {
                    Logger.printFullVerboseLog(b, "match info adInstance - no match no creative ID or more than one candidate.");
                } else if (!af.containsKey(a)) {
                    Logger.d(b, "match info adInstance - no match cannot match with creative ID: ", a);
                } else {
                    LineCreativeInfo lineCreativeInfo = af.get(a);
                    if (lineCreativeInfo != null) {
                        lineCreativeInfo.a(weakReference.get());
                        lineCreativeInfo.a((View) weakReference.get());
                        Logger.d(b, "match info adInstance - reset expiration time as network support prefetch reuse");
                        lineCreativeInfo.ad();
                        Logger.printFullVerboseLog(b, Logger.FeatureTag.CI_MATCHING, "match info adInstance - MATCH FOUND, CI: ", lineCreativeInfo);
                        if (lineCreativeInfo.n() != null) {
                            Logger.printFullVerboseLog(b, "match info adInstance - clearing eventId");
                            lineCreativeInfo.h((String) null);
                        }
                    }
                    return lineCreativeInfo;
                }
            } else if (obj instanceof String) {
                String str = (String) obj;
                if (af.containsKey(str)) {
                    LineCreativeInfo lineCreativeInfo2 = af.get(str);
                    Logger.printFullVerboseLog(b, Logger.FeatureTag.CI_MATCHING, "match info adInstance - MATCH FOUND, CI: ", lineCreativeInfo2);
                    if (lineCreativeInfo2 != null && lineCreativeInfo2.n() != null) {
                        Logger.printFullVerboseLog(b, "match info adInstance - clearing eventId");
                        lineCreativeInfo2.h((String) null);
                    }
                    return lineCreativeInfo2;
                }
            }
        } catch (Throwable th) {
            Logger.d(b, "Exception in match info adInstance: ", th.getMessage(), th);
        }
        return null;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d
    protected String a(String str, CreativeInfo creativeInfo) {
        return null;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d
    protected boolean B(String str) {
        return false;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d
    protected boolean b(String str, Bundle bundle) {
        if (com.safedk.android.utils.n.c(str)) {
            return false;
        }
        boolean z = str.contains(c) || str.contains(d) || str.contains(e) || str.contains(f);
        if (z) {
            Logger.d(b, "should follow input stream impl started, url: ", str);
        }
        return z;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public boolean k(String str) {
        Logger.d(b, "should ignore redirect url started. url: ", str);
        if (str.contains(g)) {
            Logger.d(b, "should ignore redirect url - terms url detected, requesting no sampling for the impression");
            CreativeInfoManager.b("com.five_corp.ad", (String) null);
            return true;
        }
        synchronized (af) {
            for (LineCreativeInfo lineCreativeInfo : af.values()) {
                Logger.d(b, "should ignore redirect url (creative to video url map) click url: ", lineCreativeInfo.M());
                if (str.equals(lineCreativeInfo.M())) {
                    Logger.d(b, "should ignore redirect url - clicked url: ", str);
                    return true;
                }
            }
            return false;
        }
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public boolean e(View view) {
        if (super.e(view)) {
            return true;
        }
        if (view.getClass().getCanonicalName().contains("com.five_corp.ad") && (view instanceof ViewGroup)) {
            return true;
        }
        return false;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d
    public void i() {
        super.i();
        com.safedk.android.utils.e.a(af, "LineDiscovery:creativeIdToCI");
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public synchronized void b(CreativeInfo creativeInfo) {
        Logger.d(b, "onMatch started, adId = ", creativeInfo.L());
        ag = creativeInfo.L();
    }
}
