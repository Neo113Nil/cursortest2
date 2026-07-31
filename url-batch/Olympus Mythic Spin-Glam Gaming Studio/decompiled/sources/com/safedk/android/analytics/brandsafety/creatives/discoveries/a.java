package com.safedk.android.analytics.brandsafety.creatives.discoveries;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.ironsource.X3;
import com.mobilefuse.sdk.identity.EidRequestBuilder;
import com.pubmatic.sdk.common.POBCommonConstants;
import com.safedk.android.SafeDK;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import com.safedk.android.analytics.brandsafety.creatives.h;
import com.safedk.android.analytics.brandsafety.creatives.infos.AdMobCreativeInfo;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import com.safedk.android.analytics.brandsafety.m;
import com.safedk.android.utils.Logger;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.slf4j.Marker;

/* loaded from: classes.dex */
public class a extends d {
    private static final String V = "pubid";
    private static final String W = "http";
    private static final String X = "intent";
    private static final String Y = "market";
    private static final String Z = "AdGroup+Creative+ID+0";
    private static final String aA = "call_to_action";
    private static final String aB = "rating";
    private static final String aC = "type";
    private static final String aD = "advertiser";
    private static final String aE = "video";
    private static final String aF = "vast_xml";
    private static final String aG = "title:";
    private static final String aH = "mainImg:";
    private static final String aI = "icon:";
    private static final String aJ = "body:";
    private static final String aK = "cta:";
    private static final String aL = "star:";
    private static final String aM = "advertiser:";
    private static final String aN = "tpc.googlesyndication.com/gpa_images/simgad/";
    private static final int aO = 3;
    private static final String ac = "AppID";
    private static final String ad = "java.util.LinkedHashMap";
    private static final String ae = "ignore_this_destination";
    private static final String af = "question";
    private static final String ag = "longform_questions";
    private static final String ah = "com.google.android.gms.ads.admanager.AdManagerAdView";
    private static final String ai = "com.google.android.gms.ads.internal.overlay.g";
    private static final String aj = "com.google.android.gms.ads.nativead.NativeAdView";
    private static final String ak = "\\{background-image:url\\(([^)]+?)\\)";
    private static final String al = "ad_json";
    private static final String am = "ads";
    private static final String an = "app_id";
    private static final String ao = "headline";
    private static final String ap = "image";
    private static final String aq = "images";
    private static final String ar = "thumbnails";
    private static final String as = "secondary_image";
    private static final String at = "app_icon";
    private static final String au = "tracking_urls_and_actions";
    private static final String av = "click_actions";
    private static final String aw = "impression_tracking_urls";
    private static final String ax = "url";
    private static final String ay = "u2_final_url";
    private static final String az = "body";
    public static final String b = "appIcon:";
    public static final String c = "shortAppName:";
    public static final String d = "headline:";
    public static final String e = "description:";
    public static final String f = "image:";
    public static final String g = "ytId:";
    public static final String h = "/store";
    public static final String i = "/store/type2";
    public static final String j = "/brand";
    public static final String k = "destinationUrl";
    private static final String l = "AdMobDiscovery";
    private static final String m = "com.google.android.gms";
    private static final String n = "org.json.JSONObject";
    private static final String o = "ad_html";
    private static final String p = "clickUrl";
    private static final String q = "creativeId";
    private static final String aa = "Backend+Query+ID";
    private static final String ab = aa.replace(Marker.ANY_NON_NULL_MARKER, "%2B");
    private static final HashSet<String> aP = new HashSet<>(Arrays.asList("titleClk", "bodyClk", "ochBody", "ochTitle", "ochUrl", "urlClk"));
    private static final HashSet<String> aQ = new HashSet<>(Arrays.asList("btnClk", "ochButton"));
    private static final HashSet<String> aR = new HashSet<>(Arrays.asList("imageClk", "ochImage", "ochAppIcon"));
    private static final String[] aS = {"var url = 'https://googleads.g.doubleclick.net/dbm/ad?dbm_c=", "<div class=\"GoogleActiveViewInnerContainer\"", "src=\"https://googleads.g.doubleclick.net/xbbe/pixel?d", "googleInitIc(document.body"};

    /* renamed from: com.safedk.android.analytics.brandsafety.creatives.discoveries.a$a, reason: collision with other inner class name */
    private class C1695a {
        public String a;
        public String b;
        public boolean c;
        public boolean d = true;

        C1695a(String str, String str2, boolean z) {
            this.a = str;
            this.b = str2;
            this.c = z;
        }

        public String toString() {
            return "resource: " + this.b + ", element prefix: " + this.a + ", should report as element= " + this.d;
        }
    }

    public a() {
        super(com.safedk.android.utils.h.h, l);
        this.E.b(AdNetworkConfiguration.SHOULD_SCAN_OBJECT_USING_REFLECTION, true);
        this.E.b(AdNetworkConfiguration.SUPPORTS_BANNER_IMPRESSION_TRACKING, true);
        this.E.b(AdNetworkConfiguration.APP_OPEN_IMPRESSION_TRACKING_ENABLED, true);
        this.E.b(AdNetworkConfiguration.SHOULD_SCAN_INTERSTITIAL_VIEW_HIERARCHY_FOR_CI, true);
        this.E.b(AdNetworkConfiguration.SUPPORTS_MREC_IMPRESSION_TRACKING, true);
        this.E.b(AdNetworkConfiguration.SHOULD_INJECT_JS_TO_WEBVIEWS_FOR_TEXT_EXTRACTION, false);
        this.E.b(AdNetworkConfiguration.WEBVIEW_REPLACE_ON_AD_DISPLAY_FAIL, true);
        this.E.b(AdNetworkConfiguration.SUPPORTS_NATIVE_IMPRESSION_TRACKING, true);
        this.E.b(AdNetworkConfiguration.PRINT_WEB_VIEW_CONTENTS_ON_HTML_LOAD, false);
    }

    private long a(View view, List<Object> list, List<String> list2) {
        long currentTimeMillis = System.currentTimeMillis();
        a(view, new ArrayList(), list, new HashSet(), list2);
        long currentTimeMillis2 = System.currentTimeMillis();
        Logger.printFullVerboseLog(l, "generate info, travel time ", Long.valueOf(currentTimeMillis2 - currentTimeMillis));
        return currentTimeMillis2;
    }

    private int a(List<Object> list) {
        Iterator<Object> it = list.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            Iterator<String> keys = ((JSONObject) it.next()).keys();
            while (keys.hasNext()) {
                if (keys.next().equals("clickUrl")) {
                    i2++;
                }
            }
        }
        Logger.d(l, "generate info - clickUrlsCounter=", Integer.valueOf(i2));
        return i2;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public void a(ViewGroup viewGroup, List<WeakReference<View>> list) {
        for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
            View childAt = viewGroup.getChildAt(i2);
            if (BrandSafetyUtils.g(childAt.getClass().getName())) {
                list.add(new WeakReference<>(childAt));
            }
            if (childAt instanceof ViewGroup) {
                a((ViewGroup) childAt, list);
            }
        }
    }

    private void a(List<List<C1695a>> list, List<List<String>> list2, List<String> list3, List<String> list4, List<h.a> list5, List<List<String>> list6, String str) {
        JSONArray jSONArray;
        int i2;
        ArrayList arrayList;
        h.a a;
        JSONArray jSONArray2;
        JSONArray jSONArray3;
        JSONArray jSONArray4;
        int i3;
        List<List<String>> list7 = list2;
        List<String> list8 = list4;
        try {
            Logger.d(l, "handle ad json object - started");
            JSONArray jSONArray5 = new JSONObject(str).getJSONArray("ads");
            list3.clear();
            int i4 = 0;
            while (i4 < jSONArray5.length()) {
                JSONObject jSONObject = jSONArray5.getJSONObject(i4);
                ArrayList arrayList2 = new ArrayList();
                list.add(arrayList2);
                ArrayList arrayList3 = new ArrayList();
                list7.add(arrayList3);
                String optString = jSONObject.optString("app_id");
                if (!TextUtils.isEmpty(optString)) {
                    list8.add(optString);
                }
                String optString2 = jSONObject.optString(ao);
                if (!TextUtils.isEmpty(optString2)) {
                    jSONArray = jSONArray5;
                    arrayList2.add(new C1695a("title:", optString2, true));
                } else {
                    jSONArray = jSONArray5;
                }
                Logger.d(l, "handle ad json object - title: ", optString2);
                JSONObject optJSONObject = jSONObject.optJSONObject("image");
                if (optJSONObject != null) {
                    String optString3 = optJSONObject.optString("url");
                    if (!TextUtils.isEmpty(optString3)) {
                        arrayList2.add(new C1695a("mainImg:", optString3, false));
                    }
                    Logger.d(l, "handle ad json object - mainImg: ", optString3);
                }
                JSONArray optJSONArray = jSONObject.optJSONArray(aq);
                if (optJSONArray == null) {
                    i2 = i4;
                } else {
                    int i5 = 0;
                    while (i5 < optJSONArray.length()) {
                        String optString4 = optJSONArray.getJSONObject(i5).optString("url");
                        if (TextUtils.isEmpty(optString4)) {
                            jSONArray4 = optJSONArray;
                            i3 = i4;
                        } else {
                            jSONArray4 = optJSONArray;
                            i3 = i4;
                            C1695a c1695a = new C1695a("mainImg:", optString4, false);
                            c1695a.d = false;
                            arrayList2.add(c1695a);
                        }
                        i5++;
                        optJSONArray = jSONArray4;
                        i4 = i3;
                    }
                    i2 = i4;
                }
                JSONArray optJSONArray2 = jSONObject.optJSONArray(ar);
                if (optJSONArray2 != null) {
                    int i6 = 0;
                    while (i6 < optJSONArray2.length()) {
                        String optString5 = optJSONArray2.getJSONObject(i6).optString("url");
                        if (!TextUtils.isEmpty(optString5)) {
                            jSONArray3 = optJSONArray2;
                            C1695a c1695a2 = new C1695a("mainImg:", optString5, false);
                            c1695a2.d = false;
                            arrayList2.add(c1695a2);
                        } else {
                            jSONArray3 = optJSONArray2;
                        }
                        i6++;
                        optJSONArray2 = jSONArray3;
                    }
                }
                JSONObject optJSONObject2 = jSONObject.optJSONObject(as);
                if (optJSONObject2 == null) {
                    optJSONObject2 = jSONObject.optJSONObject(at);
                }
                if (optJSONObject2 != null) {
                    String optString6 = optJSONObject2.optString("url");
                    if (!TextUtils.isEmpty(optString6)) {
                        arrayList2.add(new C1695a("icon:", optString6, false));
                    }
                    Logger.d(l, "handle ad json object - icon: ", optString6);
                }
                JSONObject optJSONObject3 = jSONObject.optJSONObject(au);
                if (optJSONObject3 != null) {
                    JSONArray optJSONArray3 = optJSONObject3.optJSONArray(av);
                    if (optJSONArray3 != null) {
                        int i7 = 0;
                        while (i7 < optJSONArray3.length()) {
                            JSONObject jSONObject2 = optJSONArray3.getJSONObject(i7);
                            if (jSONObject2 == null) {
                                jSONArray2 = optJSONArray3;
                            } else {
                                String optString7 = jSONObject2.optString(ay);
                                if (TextUtils.isEmpty(optString7)) {
                                    optString7 = jSONObject2.optString("url");
                                }
                                jSONArray2 = optJSONArray3;
                                if (jSONObject2.optInt("type") == 1) {
                                    list3.add(0, optString7);
                                } else {
                                    list3.add(optString7);
                                }
                            }
                            i7++;
                            optJSONArray3 = jSONArray2;
                        }
                        Logger.d(l, "handle ad json object - clickUrlList: ", list3);
                    }
                    JSONArray optJSONArray4 = optJSONObject3.optJSONArray(aw);
                    if (optJSONArray4 != null) {
                        for (int i8 = 0; i8 < optJSONArray4.length(); i8++) {
                            arrayList3.add(optJSONArray4.getString(i8));
                        }
                    }
                }
                String optString8 = jSONObject.optString("body");
                if (!TextUtils.isEmpty(optString8)) {
                    arrayList2.add(new C1695a("body:", optString8, true));
                }
                Logger.d(l, "handle ad json object - body: ", optString8);
                String optString9 = jSONObject.optString(aA);
                if (!TextUtils.isEmpty(optString9)) {
                    arrayList2.add(new C1695a("cta:", optString9, true));
                }
                Logger.d(l, "handle ad json object - cta: ", optString9);
                String optString10 = jSONObject.optString("rating");
                if (!TextUtils.isEmpty(optString10)) {
                    arrayList2.add(new C1695a("star:", optString10, true));
                }
                Logger.d(l, "handle ad json object - star: ", optString10);
                String optString11 = jSONObject.optString("advertiser");
                if (!TextUtils.isEmpty(optString11)) {
                    arrayList2.add(new C1695a("advertiser:", optString11, true));
                }
                Logger.d(l, "handle ad json object - advertiser: ", optString11);
                JSONObject optJSONObject4 = jSONObject.optJSONObject("video");
                if (optJSONObject4 != null) {
                    String optString12 = optJSONObject4.optString(aF);
                    if (!TextUtils.isEmpty(optString12) && (a = a(optString12, (List<String>) (arrayList = new ArrayList()))) != null) {
                        list5.add(a);
                        list6.add(arrayList);
                    }
                }
                i4 = i2 + 1;
                list7 = list2;
                list8 = list4;
                jSONArray5 = jSONArray;
            }
            Logger.d(l, "handle ad json object - appPackageNameList: ", list4);
            Logger.d(l, "handle ad json object - clickUrlList: ", list3);
            Logger.d(l, "handle ad json object - nativeAdElementsLists: ", list);
            Logger.d(l, "handle ad json object - nativeBannerDspResourcesLists: ", list2);
            Logger.d(l, "handle ad json object - vastAdInfoList: ", list5);
            Logger.d(l, "handle ad json object - vastAdUrisList: ", list6);
        } catch (Exception e2) {
            Logger.d(l, "handle ad json object - encountered exception: ", e2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:117:0x094e, code lost:
    
        if (r2 != false) goto L201;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x08d9, code lost:
    
        if (r1 != false) goto L191;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0256 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:252:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x02bc A[Catch: all -> 0x09b0, TRY_LEAVE, TryCatch #6 {all -> 0x09b0, blocks: (B:242:0x0282, B:247:0x0291, B:35:0x02bc, B:131:0x02e8, B:134:0x032e, B:135:0x035c, B:137:0x0362), top: B:241:0x0282 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0852 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0898 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r3v108, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r3v112, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r3v119, types: [java.lang.Object[]] */
    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public List<CreativeInfo> a(WeakReference<View> weakReference, String str, BrandSafetyUtils.AdType adType) {
        ArrayList arrayList;
        String str2;
        Throwable th;
        ArrayList arrayList2;
        ArrayList arrayList3;
        a aVar;
        String str3;
        Object obj;
        ArrayList arrayList4;
        ArrayList arrayList5;
        ArrayList arrayList6;
        ArrayList arrayList7;
        ArrayList arrayList8;
        ArrayList arrayList9;
        ArrayList arrayList10;
        ArrayList arrayList11;
        ArrayList arrayList12;
        ArrayList arrayList13;
        ArrayList arrayList14;
        ArrayList arrayList15;
        ArrayList arrayList16;
        StringBuilder sb;
        ArrayList arrayList17;
        HashSet hashSet;
        Iterator<Object> it;
        long j2;
        List<String> list;
        List list2;
        int i2;
        String str4;
        String str5;
        boolean z;
        int i3;
        boolean z2;
        String str6;
        String str7;
        String str8;
        ArrayList<String> arrayList18;
        String str9;
        List list3;
        boolean z3;
        ArrayList arrayList19;
        CharSequence charSequence;
        ArrayList arrayList20;
        ArrayList arrayList21;
        List list4;
        Object obj2;
        AdMobCreativeInfo adMobCreativeInfo;
        ArrayList arrayList22;
        String str10;
        ArrayList arrayList23;
        String str11;
        String str12;
        long j3;
        ArrayList arrayList24;
        ArrayList arrayList25;
        int i4;
        String str13;
        Object obj3;
        ArrayList arrayList26;
        ArrayList arrayList27;
        ArrayList arrayList28;
        ArrayList arrayList29;
        List list5;
        String str14;
        ArrayList arrayList30;
        ArrayList arrayList31;
        ArrayList arrayList32;
        ArrayList arrayList33;
        CharSequence charSequence2;
        List list6;
        JSONObject jSONObject;
        long j4;
        ArrayList arrayList34;
        String str15;
        HashSet hashSet2;
        ArrayList arrayList35;
        String str16;
        a aVar2;
        ArrayList arrayList36;
        ArrayList arrayList37;
        ArrayList arrayList38;
        String str17;
        String str18;
        String str19;
        String str20;
        CharSequence charSequence3;
        boolean z4;
        ArrayList arrayList39;
        ArrayList arrayList40;
        String str21;
        String str22;
        String str23;
        int i5;
        List<String> list7;
        String str24;
        String str25;
        String str26;
        ArrayList arrayList41;
        String str27;
        int i6;
        String str28;
        ArrayList arrayList42;
        String str29;
        List list8;
        String str30;
        String str31;
        List list9;
        String str32 = com.safedk.android.analytics.brandsafety.m.ad;
        String str33 = l;
        if (weakReference == null || weakReference.get() == null) {
            return null;
        }
        ArrayList arrayList43 = new ArrayList();
        try {
            Logger.d(l, "generate info started, view: ", weakReference.get(), " with ad type: ", adType, ", maxCreativeId = ", str);
            try {
                arrayList2 = arrayList43;
                try {
                    Logger.d(l, "generate info View check. adInstance is a View, visibility = ", Integer.valueOf(weakReference.get().getVisibility()), ", dimensions (height= ", Long.valueOf(weakReference.get().getMeasuredHeight()), ", width=", Long.valueOf(weakReference.get().getMeasuredWidth()), ")");
                    long currentTimeMillis = System.currentTimeMillis();
                    arrayList3 = new ArrayList();
                    ArrayList arrayList44 = new ArrayList();
                    aVar = this;
                    try {
                        long a = aVar.a(weakReference.get(), arrayList44, arrayList3);
                        List arrayList45 = new ArrayList();
                        List arrayList46 = new ArrayList();
                        ArrayList arrayList47 = new ArrayList();
                        ArrayList arrayList48 = new ArrayList();
                        ArrayList arrayList49 = new ArrayList();
                        str3 = CreativeInfo.aI;
                        ArrayList arrayList50 = new ArrayList();
                        ArrayList arrayList51 = new ArrayList();
                        obj = aa;
                        arrayList4 = new ArrayList();
                        arrayList5 = new ArrayList();
                        arrayList6 = new ArrayList();
                        arrayList7 = arrayList51;
                        ArrayList arrayList52 = new ArrayList();
                        arrayList8 = arrayList50;
                        arrayList9 = new ArrayList();
                        ArrayList arrayList53 = new ArrayList();
                        arrayList10 = arrayList49;
                        arrayList11 = new ArrayList();
                        arrayList12 = arrayList52;
                        arrayList13 = new ArrayList();
                        arrayList14 = new ArrayList();
                        arrayList15 = new ArrayList();
                        arrayList16 = arrayList53;
                        arrayList17 = arrayList48;
                        sb = new StringBuilder("b|");
                        sb.append(currentTimeMillis);
                        sb.append(com.safedk.android.analytics.brandsafety.m.ad);
                        sb.append(a);
                        sb.append(com.safedk.android.analytics.brandsafety.m.ad);
                        sb.append(arrayList3.size());
                        sb.append(com.safedk.android.analytics.brandsafety.m.ad);
                        sb.append(arrayList44.size());
                        sb.append(com.safedk.android.analytics.brandsafety.m.ad);
                        hashSet = new HashSet();
                        int a2 = aVar.a((List<Object>) arrayList44);
                        sb.append(com.safedk.android.analytics.brandsafety.m.ad);
                        sb.append("CLC=");
                        sb.append(a2);
                        sb.append(com.safedk.android.analytics.brandsafety.m.ad);
                        it = arrayList44.iterator();
                        j2 = a;
                        list = arrayList47;
                        list2 = arrayList45;
                        i2 = -1;
                        str4 = null;
                        str5 = null;
                        z = true;
                        i3 = 0;
                        z2 = false;
                        str6 = null;
                        str7 = null;
                        str8 = null;
                        arrayList18 = null;
                        str9 = null;
                        list3 = arrayList46;
                        z3 = false;
                    } catch (Throwable th2) {
                        th = th2;
                        str2 = l;
                        arrayList = arrayList2;
                        th = th;
                        Logger.e(str2, "Exception in generate info: ", th.getMessage(), th);
                        return arrayList;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (Throwable th4) {
                th = th4;
                arrayList = arrayList43;
                str2 = l;
                th = th;
                Logger.e(str2, "Exception in generate info: ", th.getMessage(), th);
                return arrayList;
            }
        } catch (Throwable th5) {
            th = th5;
        }
        while (true) {
            boolean hasNext = it.hasNext();
            arrayList19 = arrayList3;
            charSequence = ae;
            if (!hasNext) {
                break;
            }
            try {
                String str34 = "vast";
                JSONObject jSONObject2 = (JSONObject) it.next();
                Iterator<String> keys = jSONObject2.keys();
                String str35 = str6;
                ArrayList<String> arrayList54 = arrayList18;
                String str36 = str9;
                boolean z5 = z2;
                List list10 = list3;
                String str37 = str8;
                boolean z6 = z;
                int i7 = i3;
                List<String> list11 = list;
                String str38 = str5;
                boolean z7 = z3;
                String str39 = str7;
                String str40 = str4;
                while (keys.hasNext()) {
                    String next = keys.next();
                    String str41 = str38;
                    String string = jSONObject2.getString(next);
                    String str42 = str39;
                    int max = Math.max(i2, aVar.T(string));
                    boolean z8 = z7 | (max > 1);
                    Logger.printFullVerboseLog(l, "generate info, found ad part - key: ", next, ", is multi ad? ", Boolean.valueOf(z8), ", ad count: ", Integer.valueOf(max), ", value: ", string);
                    sb.append(str32);
                    sb.append(next);
                    sb.append("->");
                    if (list2 != null) {
                        try {
                            if (!list2.isEmpty()) {
                                list6 = list2;
                                boolean z9 = hashSet.contains(next);
                                hashSet.add(next);
                                if (next.equals(al)) {
                                    jSONObject = jSONObject2;
                                    str15 = str32;
                                    arrayList20 = arrayList2;
                                    arrayList34 = arrayList17;
                                    j4 = j2;
                                    hashSet2 = hashSet;
                                    arrayList35 = arrayList15;
                                    String str43 = str34;
                                    if (next.equals("ad_html")) {
                                        Logger.d(l, "generate info, processing ad html");
                                        ArrayList arrayList55 = new ArrayList();
                                        ArrayList arrayList56 = arrayList13;
                                        a(string, arrayList55, arrayList56);
                                        arrayList13 = arrayList56;
                                        arrayList36 = arrayList14;
                                        Logger.d(l, "generate info, vastAdBlocks contains ", Integer.valueOf(arrayList55.size()), " items");
                                        String str44 = "app-open-publisher-tab-holder";
                                        if (arrayList55.isEmpty()) {
                                            ArrayList arrayList57 = arrayList6;
                                            aVar2 = this;
                                            String g2 = com.safedk.android.utils.k.g(string);
                                            String Q = aVar2.Q(g2);
                                            String h2 = aVar2.h(aVar2.h(g2, "app-open-publisher-tab-holder"), "advertisement-top");
                                            arrayList16 = arrayList16;
                                            str18 = "advertisement-top";
                                            str19 = "app-open-publisher-tab-holder";
                                            ArrayList arrayList58 = arrayList12;
                                            String a3 = aVar2.a(string, arrayList58, a(h2, arrayList12, str40, sb, adType), sb);
                                            String F = F(h2);
                                            if (F != null) {
                                                ArrayList arrayList59 = new ArrayList();
                                                arrayList59.add(F);
                                                sb.append("dd_c&");
                                                list11 = arrayList59;
                                                str20 = h2;
                                                charSequence3 = charSequence;
                                            } else {
                                                str20 = h2;
                                                String V2 = aVar2.V(str20);
                                                if (V2 != null) {
                                                    Logger.d(l, "generate info - found click url inside html, url: ", V2);
                                                    Iterator<String> it2 = list11.iterator();
                                                    while (true) {
                                                        if (!it2.hasNext()) {
                                                            charSequence3 = charSequence;
                                                            z4 = true;
                                                            break;
                                                        }
                                                        String next2 = it2.next();
                                                        if (next2 != null) {
                                                            charSequence3 = charSequence;
                                                            if (!next2.contains(charSequence3)) {
                                                                z4 = false;
                                                                break;
                                                            }
                                                        } else {
                                                            charSequence3 = charSequence;
                                                        }
                                                        charSequence = charSequence3;
                                                    }
                                                    if (z4) {
                                                        ArrayList arrayList60 = new ArrayList();
                                                        arrayList60.add(V2);
                                                        sb.append("dd_c&");
                                                        list11 = arrayList60;
                                                    }
                                                } else {
                                                    charSequence3 = charSequence;
                                                    Logger.d(l, "generate info - did not find click url");
                                                }
                                            }
                                            arrayList39 = arrayList57;
                                            arrayList39.add(aVar2.G(str20));
                                            String O = aVar2.O(string);
                                            if (TextUtils.isEmpty(O)) {
                                                arrayList40 = arrayList19;
                                            } else {
                                                arrayList40 = arrayList19;
                                                arrayList40.add("element:ytId:" + O);
                                            }
                                            arrayList12 = arrayList58;
                                            str21 = a3;
                                            str22 = Q;
                                            str23 = str41;
                                            i5 = max;
                                            list7 = list11;
                                            str24 = string;
                                        } else {
                                            ArrayList arrayList61 = arrayList6;
                                            int max2 = Math.max(max, arrayList55.size());
                                            Logger.d(l, "generate info, processing vast blocks ad count: ", Integer.valueOf(max2));
                                            sb.append(str43);
                                            sb.append(X3.j.c);
                                            Iterator it3 = arrayList55.iterator();
                                            String str45 = string;
                                            while (it3.hasNext()) {
                                                String str46 = (String) it3.next();
                                                Iterator it4 = it3;
                                                String replace = str45.replace(str46, "");
                                                ArrayList arrayList62 = new ArrayList();
                                                h.a a4 = a(str46, (List<String>) arrayList62);
                                                if (a4 != null) {
                                                    i6 = max2;
                                                    str28 = str44;
                                                    Logger.d(l, "generate info, vast info found, ad id: ", a4.c());
                                                    arrayList11.add(a4);
                                                    arrayList42 = arrayList16;
                                                    arrayList42.add(arrayList62);
                                                    if (!z9) {
                                                        sb.append("sk&");
                                                        if (a4 != null) {
                                                            sb.append(str43);
                                                            sb.append(X3.j.c);
                                                            sb.append("c=" + a4.a());
                                                            sb.append("&i=" + a4.c());
                                                        }
                                                    }
                                                } else {
                                                    i6 = max2;
                                                    str28 = str44;
                                                    arrayList42 = arrayList16;
                                                }
                                                arrayList16 = arrayList42;
                                                it3 = it4;
                                                str45 = replace;
                                                max2 = i6;
                                                str44 = str28;
                                            }
                                            String str47 = str45;
                                            String str48 = str44;
                                            aVar2 = this;
                                            str23 = str43;
                                            str18 = "advertisement-top";
                                            str22 = str37;
                                            i5 = max2;
                                            arrayList40 = arrayList19;
                                            charSequence3 = charSequence;
                                            arrayList39 = arrayList61;
                                            str19 = str48;
                                            str21 = str40;
                                            list7 = list11;
                                            str24 = str47;
                                        }
                                        ArrayList arrayList63 = arrayList39;
                                        if (com.safedk.android.utils.g.a("is_rewarded_html5_playable[^}]*?true").matcher(string).find()) {
                                            str25 = "playable";
                                            sb.append("playable");
                                            sb.append(X3.j.c);
                                        } else {
                                            str25 = str21;
                                        }
                                        String str49 = str25;
                                        arrayList19 = arrayList40;
                                        Logger.d(l, "generate info - is multi? ", Boolean.valueOf(z8));
                                        if (z8) {
                                            String a5 = a(i5, string, arrayList10, arrayList8, arrayList7, arrayList4, arrayList5);
                                            if (str23 == null) {
                                                str23 = "";
                                            }
                                            str23 = str23 + a5 + CreativeInfo.aG + i5;
                                            sb.append(str23);
                                            sb.append(X3.j.c);
                                        }
                                        ArrayList<String> e2 = com.safedk.android.utils.n.e(str24);
                                        if (str22 == null || !e2.contains(str22)) {
                                            str26 = str23;
                                        } else {
                                            e2.remove(str22);
                                            str26 = str23;
                                            Logger.printFullVerboseLog(l, "generate info, removed app icon url: ", str22);
                                        }
                                        if (aVar2.P(string)) {
                                            Logger.d(l, "generate info, all mraid string found, marking this ad as mraid");
                                            sb.append("mraidStringFound&");
                                        }
                                        int i8 = 0;
                                        while (i8 < e2.size()) {
                                            String g3 = com.safedk.android.utils.k.g(e2.get(i8));
                                            e2.set(i8, g3);
                                            Logger.d(l, "htmlUrls url = ", g3);
                                            i8++;
                                            str22 = str22;
                                            i5 = i5;
                                        }
                                        String str50 = str22;
                                        int i9 = i5;
                                        Logger.printFullVerboseLog(l, "generate info, html: ", string);
                                        if (com.safedk.android.utils.k.k(string)) {
                                            Logger.d(l, "generate info, content is Html content");
                                            str27 = aVar2.Q(string);
                                            String h3 = aVar2.h(aVar2.h(string, str19), str18);
                                            ArrayList<String> e3 = com.safedk.android.utils.n.e(h3);
                                            Logger.printFullVerboseLog(l, "generate info, urls extracted from source: ", e3);
                                            if (str27 != null && e3.contains(str27)) {
                                                e3.remove(str27);
                                                Logger.printFullVerboseLog(l, "generate info, removed app icon url: ", str27);
                                            }
                                            if (e3 != null && e3.size() > 0) {
                                                ArrayList arrayList64 = new ArrayList();
                                                Iterator<String> it5 = e3.iterator();
                                                while (it5.hasNext()) {
                                                    String replaceAll = com.safedk.android.utils.k.g(it5.next()).replaceAll("&quot;", X3.j.c);
                                                    if (replaceAll == null || !com.safedk.android.utils.n.a((Object) replaceAll)) {
                                                        Logger.d(l, "generate info, sanitizedUrl is not a url: ", replaceAll);
                                                    } else {
                                                        arrayList64.add(replaceAll);
                                                    }
                                                }
                                                Logger.printFullVerboseLog(l, "generate info, Html content sanitized urls: ", arrayList64);
                                                e2.addAll(arrayList64);
                                            }
                                            arrayList41 = arrayList9;
                                            aVar2.b(h3, (List<String>) arrayList41);
                                            if (com.safedk.android.utils.n.a((Collection<?>) list7) && h3.contains(k)) {
                                                List<String> S = aVar2.S(h3);
                                                sb.append("dc2&");
                                                sb.append(S);
                                                sb.append(X3.j.c);
                                                Logger.d(l, "generate info, click urls (Destination Url): ", S);
                                                list7 = S;
                                            }
                                            str36 = h3;
                                        } else {
                                            arrayList41 = arrayList9;
                                            str27 = str50;
                                        }
                                        str37 = str27;
                                        arrayList54 = e2;
                                        charSequence = charSequence3;
                                        arrayList9 = arrayList41;
                                        str38 = str26;
                                        list11 = list7;
                                        str40 = str49;
                                        i2 = i9;
                                        arrayList38 = arrayList12;
                                        arrayList37 = arrayList63;
                                        str39 = str42;
                                        z6 = false;
                                        str34 = str43;
                                        list10 = list10;
                                    } else {
                                        arrayList38 = arrayList12;
                                        ArrayList arrayList65 = arrayList19;
                                        aVar2 = this;
                                        arrayList36 = arrayList14;
                                        ArrayList arrayList66 = arrayList6;
                                        CharSequence charSequence4 = charSequence;
                                        str34 = str43;
                                        if (next.equals("pubid")) {
                                            if (z9) {
                                                String substring = string.substring(0, string.lastIndexOf(47));
                                                Logger.d(l, "generate info, placement ID: ", substring);
                                                sb.append(substring);
                                                sb.append(X3.j.c);
                                                arrayList19 = arrayList65;
                                                str35 = substring;
                                                arrayList37 = arrayList66;
                                                charSequence = charSequence4;
                                                str38 = str41;
                                                i2 = max;
                                                str39 = str42;
                                                z6 = false;
                                                list10 = list10;
                                            } else {
                                                sb.append("sk&");
                                                sb.append(string.substring(0, string.lastIndexOf(47)));
                                                arrayList19 = arrayList65;
                                                arrayList37 = arrayList66;
                                                charSequence = charSequence4;
                                                str29 = str42;
                                                str39 = str29;
                                                aVar = aVar2;
                                                jSONObject2 = jSONObject;
                                                hashSet = hashSet2;
                                                str32 = str15;
                                                arrayList14 = arrayList36;
                                                list2 = list6;
                                                arrayList12 = arrayList38;
                                                arrayList6 = arrayList37;
                                                str38 = str41;
                                                arrayList15 = arrayList35;
                                                z7 = z8;
                                                j2 = j4;
                                                i2 = max;
                                                arrayList17 = arrayList34;
                                                arrayList2 = arrayList20;
                                            }
                                        } else if (next.equals("clickUrl")) {
                                            int i10 = i7 + 1;
                                            if (i10 == 1) {
                                                arrayList19 = arrayList65;
                                                Logger.d(l, "generate info, first click url: ", string);
                                                arrayList37 = arrayList66;
                                                str30 = string;
                                            } else {
                                                arrayList19 = arrayList65;
                                                str30 = str42;
                                                if (str30 != null) {
                                                    arrayList37 = arrayList66;
                                                    Logger.d(l, "generate info, new click url: ", string);
                                                    if (str30.equals(string)) {
                                                        Logger.d(l, "generate info, the click url with index: ", Integer.valueOf(i10), " has the same value as the first, so skipping!");
                                                        str39 = str30;
                                                        i7 = i10;
                                                        aVar = aVar2;
                                                        charSequence = charSequence4;
                                                        jSONObject2 = jSONObject;
                                                        hashSet = hashSet2;
                                                        str32 = str15;
                                                        arrayList14 = arrayList36;
                                                        list2 = list6;
                                                        arrayList12 = arrayList38;
                                                        arrayList6 = arrayList37;
                                                        str38 = str41;
                                                        arrayList15 = arrayList35;
                                                        z7 = z8;
                                                        j2 = j4;
                                                        i2 = max;
                                                        arrayList17 = arrayList34;
                                                        arrayList2 = arrayList20;
                                                    } else {
                                                        sb.append("||different_clickUrl_found||");
                                                        Logger.d(l, "generate info, click url index: ", Integer.valueOf(i10), " is NOT equal to the first one which is: ", str30);
                                                    }
                                                } else {
                                                    arrayList37 = arrayList66;
                                                }
                                            }
                                            Map<String, String> b2 = com.safedk.android.utils.k.b(string, false);
                                            Object obj4 = obj;
                                            if (b2.containsKey(obj4)) {
                                                str31 = str30;
                                            } else {
                                                str31 = str30;
                                                if (!b2.containsKey(ab)) {
                                                    obj = obj4;
                                                    charSequence = charSequence4;
                                                    sb.append(string);
                                                    sb.append(X3.j.c);
                                                    if (z9) {
                                                        Logger.d(l, "generate info, should process key is false, skipping click url for now");
                                                        sb.append("sk&");
                                                        sb.append("c=");
                                                        sb.append(aVar2.R(string));
                                                        sb.append("&i=");
                                                        sb.append(a(string, false));
                                                        i7 = i10;
                                                        aVar = aVar2;
                                                        jSONObject2 = jSONObject;
                                                        hashSet = hashSet2;
                                                        str32 = str15;
                                                        arrayList14 = arrayList36;
                                                        list2 = list6;
                                                        arrayList12 = arrayList38;
                                                        arrayList6 = arrayList37;
                                                        str39 = str31;
                                                        str38 = str41;
                                                        arrayList15 = arrayList35;
                                                        z7 = z8;
                                                        j2 = j4;
                                                        i2 = max;
                                                        arrayList17 = arrayList34;
                                                        arrayList2 = arrayList20;
                                                    } else {
                                                        Logger.d(l, "generate info, click url value: ", string, ", clickUrlList = ", list11);
                                                        if (com.safedk.android.utils.n.a((Collection<?>) list11)) {
                                                            List<String> R = aVar2.R(string);
                                                            sb.append("dc2&");
                                                            sb.append(R);
                                                            sb.append(X3.j.c);
                                                            Logger.d(l, "generate info, click urls: ", R);
                                                            list11 = R;
                                                        }
                                                        if (list10 != null) {
                                                            boolean isEmpty = list10.isEmpty();
                                                            list9 = list10;
                                                        }
                                                        List a6 = a(string, false);
                                                        Logger.d(l, new Object[]{"generate info, creative ID: ", a6});
                                                        list9 = a6;
                                                        i7 = i10;
                                                        str39 = str31;
                                                        str38 = str41;
                                                        i2 = max;
                                                        z6 = false;
                                                        list10 = list9;
                                                    }
                                                }
                                            }
                                            String str51 = b2.containsKey(obj4) ? b2.get(obj4) : b2.get(ab);
                                            if (str == null || str.equals(str51)) {
                                                obj = obj4;
                                                charSequence = charSequence4;
                                            } else {
                                                obj = obj4;
                                                charSequence = charSequence4;
                                                Logger.d(l, "generate info, for click index: ", Integer.valueOf(i10), " max creative id is: ", str, " vs backend query id: ", str51);
                                            }
                                            sb.append(string);
                                            sb.append(X3.j.c);
                                            if (z9) {
                                            }
                                        } else {
                                            arrayList19 = arrayList65;
                                            arrayList37 = arrayList66;
                                            charSequence = charSequence4;
                                            str29 = str42;
                                            if (!next.equals("creativeId")) {
                                                str39 = str29;
                                                str38 = str41;
                                                i2 = max;
                                                list10 = list10;
                                            } else if (z9) {
                                                if (list10 != null) {
                                                    boolean isEmpty2 = list10.isEmpty();
                                                    list8 = list10;
                                                }
                                                List C = C(string);
                                                Logger.d(l, new Object[]{"generate info, creatives: ", C});
                                                list8 = C;
                                                str39 = str29;
                                                str38 = str41;
                                                i2 = max;
                                                z6 = false;
                                                list10 = list8;
                                            } else {
                                                Logger.d(l, "generate info, should process key is false, skipping creative for now");
                                                sb.append("sk&");
                                                sb.append("&i=");
                                                sb.append(C(string));
                                                str39 = str29;
                                                aVar = aVar2;
                                                jSONObject2 = jSONObject;
                                                hashSet = hashSet2;
                                                str32 = str15;
                                                arrayList14 = arrayList36;
                                                list2 = list6;
                                                arrayList12 = arrayList38;
                                                arrayList6 = arrayList37;
                                                str38 = str41;
                                                arrayList15 = arrayList35;
                                                z7 = z8;
                                                j2 = j4;
                                                i2 = max;
                                                arrayList17 = arrayList34;
                                                arrayList2 = arrayList20;
                                            }
                                        }
                                    }
                                } else {
                                    jSONObject = jSONObject2;
                                    j4 = j2;
                                    arrayList34 = arrayList17;
                                    str15 = str32;
                                    arrayList20 = arrayList2;
                                    hashSet2 = hashSet;
                                    arrayList35 = arrayList15;
                                    try {
                                        a(arrayList14, arrayList15, list11, arrayList6, arrayList11, arrayList16, string);
                                        if (arrayList11.isEmpty()) {
                                            str16 = str34;
                                            str38 = str41;
                                        } else if (str41 == null) {
                                            str38 = str34;
                                            str16 = str38;
                                        } else {
                                            StringBuilder sb2 = new StringBuilder();
                                            sb2.append(str41);
                                            str16 = str34;
                                            sb2.append(str16);
                                            str38 = sb2.toString();
                                        }
                                        aVar2 = this;
                                        str34 = str16;
                                        arrayList36 = arrayList14;
                                        arrayList37 = arrayList6;
                                        arrayList38 = arrayList12;
                                        i2 = max;
                                        str39 = str42;
                                        z5 = true;
                                        list10 = list10;
                                    } catch (Throwable th6) {
                                        th = th6;
                                        th = th;
                                        str2 = l;
                                        arrayList = arrayList20;
                                        Logger.e(str2, "Exception in generate info: ", th.getMessage(), th);
                                        return arrayList;
                                    }
                                }
                                if (z8 || str38 == null) {
                                    str17 = str3;
                                } else {
                                    try {
                                        str17 = str3;
                                        if (!str38.contains(str17)) {
                                            String str52 = str38 + str17;
                                            sb.append("&multiple_ads");
                                            str38 = str52;
                                        }
                                    } catch (Throwable th7) {
                                        th = th7;
                                        th = th;
                                        str2 = l;
                                        arrayList = arrayList20;
                                        Logger.e(str2, "Exception in generate info: ", th.getMessage(), th);
                                        return arrayList;
                                    }
                                }
                                str3 = str17;
                                aVar = aVar2;
                                jSONObject2 = jSONObject;
                                hashSet = hashSet2;
                                str32 = str15;
                                arrayList14 = arrayList36;
                                list2 = list6;
                                arrayList12 = arrayList38;
                                arrayList6 = arrayList37;
                                arrayList15 = arrayList35;
                                z7 = z8;
                                j2 = j4;
                                arrayList17 = arrayList34;
                                arrayList2 = arrayList20;
                            }
                        } catch (Throwable th8) {
                            th = th8;
                            str2 = l;
                            arrayList = arrayList2;
                            Logger.e(str2, "Exception in generate info: ", th.getMessage(), th);
                            return arrayList;
                        }
                    }
                    List D = D(string);
                    Logger.d(l, new Object[]{"generate info, click strings: ", D});
                    list6 = D;
                    if (hashSet.contains(next)) {
                    }
                    hashSet.add(next);
                    if (next.equals(al)) {
                    }
                    if (z8) {
                    }
                    str17 = str3;
                    str3 = str17;
                    aVar = aVar2;
                    jSONObject2 = jSONObject;
                    hashSet = hashSet2;
                    str32 = str15;
                    arrayList14 = arrayList36;
                    list2 = list6;
                    arrayList12 = arrayList38;
                    arrayList6 = arrayList37;
                    arrayList15 = arrayList35;
                    z7 = z8;
                    j2 = j4;
                    arrayList17 = arrayList34;
                    arrayList2 = arrayList20;
                }
                a aVar3 = aVar;
                String str53 = str39;
                String str54 = str38;
                hashSet = hashSet;
                arrayList14 = arrayList14;
                str4 = str40;
                z = z6;
                str5 = str54;
                z2 = z5;
                j2 = j2;
                arrayList17 = arrayList17;
                arrayList2 = arrayList2;
                str7 = str53;
                z3 = z7;
                aVar = aVar3;
                list = list11;
                arrayList18 = arrayList54;
                i3 = i7;
                arrayList3 = arrayList19;
                str6 = str35;
                str8 = str37;
                list3 = list10;
                str9 = str36;
            } catch (Throwable th9) {
                th = th9;
            }
            arrayList = arrayList20;
            Logger.e(str2, "Exception in generate info: ", th.getMessage(), th);
            return arrayList;
        }
        ArrayList arrayList67 = arrayList15;
        Object obj5 = "vast";
        ArrayList arrayList68 = arrayList14;
        String str55 = str32;
        arrayList20 = arrayList2;
        ArrayList arrayList69 = arrayList17;
        long j5 = j2;
        ArrayList arrayList70 = arrayList12;
        a aVar4 = aVar;
        ArrayList arrayList71 = arrayList6;
        try {
            long currentTimeMillis2 = System.currentTimeMillis();
            Logger.d(l, "generate info, json build time: ", Long.valueOf(currentTimeMillis2 - j5));
            if (z) {
                Logger.d(l, "generate info, prefetch is NULL");
                return null;
            }
            String str56 = null;
            if (arrayList11.isEmpty()) {
                arrayList21 = arrayList69;
            } else {
                arrayList21 = arrayList69;
                aVar4.a(arrayList11, list, arrayList21, sb);
            }
            int i11 = 0;
            while (i11 < list.size()) {
                if (list.get(i11) != null) {
                    charSequence2 = charSequence;
                    if (list.get(i11).contains(charSequence2)) {
                        list.set(i11, null);
                    }
                } else {
                    charSequence2 = charSequence;
                }
                i11++;
                charSequence = charSequence2;
            }
            if (str5 == null) {
                str5 = str4;
            } else if (str4 != null) {
                str5 = str5 + "/" + str4;
            }
            Logger.d(l, "generate info, downstream struct: ", str5, ", adCount = ", Integer.valueOf(i2));
            Logger.d(l, "generate info, click url list size is: ", Integer.valueOf(list.size()));
            if (i2 > 0 && list.size() != i2) {
                Logger.d(l, "generate info, mismatched between click url list size and ad count");
            }
            Object[] objArr = new Object[6];
            objArr[0] = "generate info, app package name is: ";
            objArr[1] = arrayList71;
            objArr[2] = " placement id is: ";
            objArr[3] = str6;
            objArr[4] = " first creative id is: ";
            if (list3.size() > 0) {
                list4 = list3;
                obj2 = list4.get(0);
            } else {
                list4 = list3;
                obj2 = POBCommonConstants.NULL_VALUE;
            }
            objArr[5] = obj2;
            Logger.d(l, objArr);
            int i12 = 0;
            while (i12 < i2) {
                String str57 = list4.size() > i12 ? (String) list4.get(i12) : str56;
                String str58 = list.size() > i12 ? list.get(i12) : null;
                List<String> list12 = list;
                String str59 = arrayList21.size() > i12 ? arrayList21.get(i12) : null;
                StringBuilder sb3 = sb;
                String str60 = aVar4.I;
                ArrayList arrayList72 = arrayList21;
                if (arrayList71.size() > i12) {
                    arrayList22 = arrayList71;
                    str10 = arrayList22.get(i12);
                } else {
                    arrayList22 = arrayList71;
                    str10 = null;
                }
                ArrayList arrayList73 = arrayList68;
                ArrayList arrayList74 = arrayList70;
                String str61 = str4;
                ArrayList arrayList75 = arrayList22;
                CreativeInfo creativeInfo = adMobCreativeInfo;
                ArrayList arrayList76 = arrayList8;
                ArrayList arrayList77 = arrayList9;
                ArrayList arrayList78 = arrayList4;
                List list13 = list4;
                String str62 = str33;
                int i13 = i12;
                String str63 = str55;
                ArrayList arrayList79 = arrayList11;
                try {
                    adMobCreativeInfo = new AdMobCreativeInfo(null, adType, str57, str58, str6, str59, str60, str5, str10);
                    str2 = str62;
                    try {
                        Logger.d(str2, "generate info - set click url of CI to - ", creativeInfo.M());
                        String str64 = str8;
                        if (str64 != null) {
                            try {
                                creativeInfo.G(str64);
                                Logger.d(str2, "generate info, application icon url added to ci WebView urls exclusion list : ", str64);
                            } catch (Throwable th10) {
                                th = th10;
                            }
                        }
                        Logger.printFullVerboseLog(str2, "created ci : ", creativeInfo);
                        sb = sb3;
                        sb.append(str63);
                        sb.append(currentTimeMillis2);
                        sb.append(str63);
                        sb.append(arrayList19.size());
                        sb.append(str63);
                        ArrayList<String> arrayList80 = arrayList18;
                        sb.append(arrayList80 == null ? EidRequestBuilder.REQUEST_FIELD_EMAIL : Integer.valueOf(arrayList80.size()));
                        sb.append(str63);
                        if (i13 < arrayList79.size()) {
                            arrayList23 = arrayList79;
                            h.a aVar5 = arrayList23.get(i13);
                            if (aVar5 != null) {
                                str11 = str64;
                                sb.append(aVar5.j() == null ? "v" : Integer.valueOf(aVar5.j().size()));
                            } else {
                                str11 = str64;
                            }
                            arrayList24 = arrayList19;
                            creativeInfo.b((List<String>) arrayList24);
                            if (!z3) {
                                creativeInfo.b((List<String>) arrayList80);
                            }
                            str12 = str5;
                            j3 = currentTimeMillis2;
                            aVar4.a(creativeInfo, aVar5, (String) null, "manual");
                        } else {
                            arrayList23 = arrayList79;
                            str11 = str64;
                            str12 = str5;
                            j3 = currentTimeMillis2;
                            arrayList24 = arrayList19;
                            Logger.printFullVerboseLog(str2, "generate info, adCount is 1");
                            if (i2 == 1) {
                                creativeInfo.b((List<String>) arrayList24);
                                creativeInfo.b((List<String>) arrayList80);
                            } else {
                                Logger.d(str2, "ad count is > 1 , not adding prefetch urls");
                            }
                        }
                        Logger.printFullVerboseLog(str2, "generate info, creative info urls = ", creativeInfo.r());
                        if (i13 < arrayList16.size()) {
                            arrayList25 = arrayList16;
                            List<String> list14 = arrayList25.get(i13);
                            if (list14 != null) {
                                Iterator<String> it6 = list14.iterator();
                                while (it6.hasNext()) {
                                    creativeInfo.C(it6.next());
                                }
                            }
                        } else {
                            arrayList25 = arrayList16;
                        }
                        Logger.d(str2, "generate info, downstreamSubtype: ", str61, ", inter text collection: ", arrayList74);
                        if (str61 != null) {
                            str13 = str61;
                            obj3 = obj5;
                            if (str13.equals(obj3)) {
                                i4 = i2;
                            } else {
                                i4 = i2;
                                if (arrayList74.size() > 3) {
                                    Iterator<String> it7 = arrayList74.iterator();
                                    while (it7.hasNext()) {
                                        String next3 = it7.next();
                                        Iterator<String> it8 = it7;
                                        ArrayList arrayList81 = arrayList24;
                                        Logger.d(str2, "generate info, inter ad text: ", next3);
                                        creativeInfo.z(next3);
                                        it7 = it8;
                                        arrayList24 = arrayList81;
                                    }
                                    arrayList19 = arrayList24;
                                }
                            }
                            arrayList19 = arrayList24;
                        } else {
                            i4 = i2;
                            arrayList19 = arrayList24;
                            str13 = str61;
                            obj3 = obj5;
                        }
                        if ((adType.equals(BrandSafetyUtils.AdType.BANNER) || adType.equals(BrandSafetyUtils.AdType.MREC)) && arrayList77.size() > 0) {
                            for (Iterator<String> it9 = arrayList77.iterator(); it9.hasNext(); it9 = it9) {
                                String next4 = it9.next();
                                Logger.d(str2, "generate info, banner/mrec ad text: ", next4);
                                creativeInfo.z(next4);
                            }
                        }
                        if (z3) {
                            creativeInfo.ao();
                            if (i13 < arrayList10.size()) {
                                arrayList30 = arrayList10;
                                if (arrayList30.get(i13) != null) {
                                    creativeInfo.A(b + ((String) arrayList30.get(i13)));
                                }
                            } else {
                                arrayList30 = arrayList10;
                            }
                            if (i13 < arrayList76.size()) {
                                arrayList31 = arrayList76;
                                if (arrayList31.get(i13) != null) {
                                    StringBuilder sb4 = new StringBuilder();
                                    arrayList10 = arrayList30;
                                    sb4.append(c);
                                    sb4.append((String) arrayList31.get(i13));
                                    creativeInfo.A(sb4.toString());
                                } else {
                                    arrayList10 = arrayList30;
                                }
                            } else {
                                arrayList10 = arrayList30;
                                arrayList31 = arrayList76;
                            }
                            if (i13 < arrayList7.size()) {
                                arrayList32 = arrayList7;
                                if (arrayList32.get(i13) != null) {
                                    StringBuilder sb5 = new StringBuilder();
                                    arrayList76 = arrayList31;
                                    sb5.append(d);
                                    sb5.append((String) arrayList32.get(i13));
                                    creativeInfo.A(sb5.toString());
                                } else {
                                    arrayList76 = arrayList31;
                                }
                            } else {
                                arrayList76 = arrayList31;
                                arrayList32 = arrayList7;
                            }
                            if (i13 < arrayList78.size()) {
                                arrayList33 = arrayList78;
                                if (arrayList33.get(i13) != null) {
                                    StringBuilder sb6 = new StringBuilder();
                                    arrayList7 = arrayList32;
                                    sb6.append(e);
                                    sb6.append((String) arrayList33.get(i13));
                                    creativeInfo.A(sb6.toString());
                                } else {
                                    arrayList7 = arrayList32;
                                }
                            } else {
                                arrayList7 = arrayList32;
                                arrayList33 = arrayList78;
                            }
                            if (i13 < arrayList5.size()) {
                                arrayList26 = arrayList5;
                                if (arrayList26.get(i13) != null) {
                                    StringBuilder sb7 = new StringBuilder();
                                    arrayList78 = arrayList33;
                                    sb7.append(f);
                                    sb7.append((String) arrayList26.get(i13));
                                    creativeInfo.A(sb7.toString());
                                } else {
                                    arrayList78 = arrayList33;
                                }
                            } else {
                                arrayList78 = arrayList33;
                                arrayList26 = arrayList5;
                            }
                        } else {
                            arrayList26 = arrayList5;
                        }
                        if (i13 < arrayList13.size()) {
                            arrayList27 = arrayList13;
                            if (arrayList27.get(i13) != null) {
                                StringBuilder sb8 = new StringBuilder();
                                arrayList5 = arrayList26;
                                sb8.append(g);
                                sb8.append((String) arrayList27.get(i13));
                                creativeInfo.A(sb8.toString());
                            } else {
                                arrayList5 = arrayList26;
                            }
                        } else {
                            arrayList5 = arrayList26;
                            arrayList27 = arrayList13;
                        }
                        if (i13 < arrayList73.size()) {
                            ArrayList arrayList82 = arrayList73;
                            for (C1695a c1695a : arrayList82.get(i13)) {
                                ArrayList arrayList83 = arrayList82;
                                ArrayList arrayList84 = arrayList27;
                                ArrayList arrayList85 = arrayList25;
                                Logger.d(str2, "generate info - add prefetch element= ", c1695a);
                                if (adType == BrandSafetyUtils.AdType.NATIVE) {
                                    if (c1695a.d) {
                                        creativeInfo.A(c1695a.a + c1695a.b);
                                    } else {
                                        creativeInfo.y(c1695a.b);
                                    }
                                } else if (c1695a.c) {
                                    creativeInfo.z(c1695a.b);
                                } else {
                                    creativeInfo.y(c1695a.b);
                                }
                                arrayList82 = arrayList83;
                                arrayList27 = arrayList84;
                                arrayList25 = arrayList85;
                            }
                            arrayList73 = arrayList82;
                            arrayList13 = arrayList27;
                            arrayList16 = arrayList25;
                        } else {
                            arrayList13 = arrayList27;
                            arrayList16 = arrayList25;
                        }
                        if (i13 < arrayList67.size()) {
                            arrayList28 = arrayList67;
                            Iterator<String> it10 = arrayList28.get(i13).iterator();
                            while (it10.hasNext()) {
                                creativeInfo.w(it10.next());
                            }
                        } else {
                            arrayList28 = arrayList67;
                        }
                        if (!z2 || i13 >= arrayList75.size()) {
                            arrayList29 = arrayList75;
                        } else {
                            arrayList29 = arrayList75;
                            creativeInfo.q(arrayList29.get(i13));
                        }
                        creativeInfo.u(sb.toString());
                        if (i13 < list2.size()) {
                            list5 = list2;
                            creativeInfo = aVar4.b((String) list5.get(i13), creativeInfo);
                            arrayList67 = arrayList28;
                        } else {
                            list5 = list2;
                            arrayList67 = arrayList28;
                            Logger.d(str2, "generate info, click string is empty, cannot check if scar CI exists");
                        }
                        e(creativeInfo);
                        if (adType != BrandSafetyUtils.AdType.INTERSTITIAL || z3) {
                            str14 = str9;
                        } else {
                            str14 = str9;
                            aVar4.c(str14, creativeInfo);
                        }
                        Logger.d(str2, "generate info, generated info is: ", creativeInfo);
                        arrayList = arrayList20;
                        try {
                            arrayList.add(creativeInfo);
                            str8 = str11;
                            arrayList68 = arrayList73;
                            arrayList20 = arrayList;
                            str9 = str14;
                            list2 = list5;
                            obj5 = obj3;
                            str4 = str13;
                            str55 = str63;
                            arrayList18 = arrayList80;
                            arrayList11 = arrayList23;
                            str5 = str12;
                            currentTimeMillis2 = j3;
                            i2 = i4;
                            arrayList70 = arrayList74;
                            arrayList9 = arrayList77;
                            arrayList8 = arrayList76;
                            arrayList4 = arrayList78;
                            list4 = list13;
                            str56 = null;
                            arrayList71 = arrayList29;
                            i12 = i13 + 1;
                            str33 = str2;
                            list = list12;
                            arrayList21 = arrayList72;
                        } catch (Throwable th11) {
                            th = th11;
                            th = th;
                            Logger.e(str2, "Exception in generate info: ", th.getMessage(), th);
                            return arrayList;
                        }
                    } catch (Throwable th12) {
                        th = th12;
                        arrayList = arrayList20;
                        th = th;
                        Logger.e(str2, "Exception in generate info: ", th.getMessage(), th);
                        return arrayList;
                    }
                } catch (Throwable th13) {
                    th = th13;
                    arrayList = arrayList20;
                    str2 = str62;
                }
            }
            return arrayList20;
        } catch (Throwable th14) {
            th = th14;
            str2 = str33;
        }
    }

    private static void e(CreativeInfo creativeInfo) {
        Pattern a = com.safedk.android.utils.g.a("encrypted-tbn\\d*\\.gstatic.com/shopping\\?q");
        Iterator<String> it = creativeInfo.r().iterator();
        int i2 = 0;
        while (it.hasNext()) {
            String next = it.next();
            if (com.safedk.android.utils.n.d(a, next) || next.contains(aN)) {
                i2++;
                if (i2 >= 3) {
                    Logger.d(l, "generate info, shopping collage creative detected");
                    creativeInfo.C();
                    return;
                }
            }
        }
    }

    public static void a(String str, List<String> list, List<String> list2) {
        Matcher matcher = com.safedk.android.utils.g.a("<meta([^>]+)\\sindex=\\\\?\\\"(\\d)\\\\?\\\"\\sname=\\\\?\\\"video_fields\\\\?\\\">").matcher(str);
        boolean z = false;
        while (matcher.find()) {
            a(matcher.group(1), list, list2, Integer.parseInt(matcher.group(2)));
            z = true;
        }
        if (!z) {
            a(str, list, list2, 0);
        }
    }

    private static void a(String str, List<String> list, List<String> list2, int i2) {
        String e2 = com.safedk.android.utils.n.e(com.safedk.android.analytics.brandsafety.creatives.h.j(), str);
        if (e2 != null) {
            Logger.printFullVerboseLog(l, "extractVastBlock adding vastBlock : ", e2);
            list.add(i2, e2);
        }
        Pattern a = com.safedk.android.utils.g.a("\\/VAST(?:%3E|\\\\+x3e|>|&gt;|&amp;gt;|\\*&quot;|&apos)(?:[^,]+,){6}(?:\\\\+x22|%22|\\\\*\"|&amp;quot;|\\\\*&quot;|\\\\*u0026|quot;|\\\\+x27|%27|\\\\*'|'|&amp;#39;|\\\\*&#39;)([^\\\"]{11})(?:\\\\+x22|%22|\\\\*\"|&amp;quot;|\\\\*&quot;|\\\\*u0026|quot;|\\\\+x27|%27|\\\\*'|'|&amp;#39;|\\\\*&#39;)");
        Pattern a2 = com.safedk.android.utils.g.a("\\/VAST(?:%3E|\\\\+x3e|>|&gt;|&amp;gt;|\\*&quot;|&apos).+ytimg[^\"]+?\\/([^\\\"\\\\/]{11})\\/[^\"]+(?:\\\\+x22|%22|\\\\*\"|&amp;quot;|\\\\*&quot;|\\\\*u0026|quot;|\\\\+x27|%27|\\\\*'|'|&amp;#39;|\\\\*&#39;)");
        String e3 = com.safedk.android.utils.n.e(a, str);
        if (e3 == null) {
            e3 = com.safedk.android.utils.n.e(a2, str);
        }
        if (e3 != null) {
            Logger.printFullVerboseLog(l, "extractVastBlock adding youtubeVideoId : ", e3);
            list2.add(i2, e3);
        }
    }

    public static String a(int i2, String str, List<String> list, List<String> list2, List<String> list3, List<String> list4, List<String> list5) {
        String str2;
        String str3;
        List<Integer> b2 = com.safedk.android.utils.n.b(com.safedk.android.utils.g.a("<div[^>]+\\sendcard[\\s>][^>]*>"), str);
        if (!b2.isEmpty()) {
            str3 = com.safedk.android.utils.k.a(str.substring(b2.get(0).intValue()), 0);
            str2 = h;
        } else {
            str2 = i;
            str3 = str;
        }
        Object[] objArr = new Object[2];
        objArr[0] = "end card div is null? ";
        objArr[1] = Boolean.valueOf(str3 == null);
        Logger.d(l, objArr);
        Pattern a = com.safedk.android.utils.g.a("<(?:canvas|svg)\\sclass=\\\\?\\\"(\\S+?)\\send-frame");
        if (str3 != null) {
            List<Integer> b3 = com.safedk.android.utils.n.b(com.safedk.android.utils.g.a("<div[^>]+podding-card[^>]*>"), str3);
            Logger.d(l, "poddingCardDivOffsetList: ", b3);
            if (b3.size() >= i2) {
                for (int i3 = 0; i3 < i2; i3++) {
                    String a2 = com.safedk.android.utils.k.a(str3, b3.get(i3).intValue());
                    list2.add(com.safedk.android.utils.n.a(com.safedk.android.utils.g.a("short-app-name[^>]+truncated[^>]+>\\s*<span[^>]+>([^<]+)"), a2, 1));
                    list3.add(com.safedk.android.utils.n.a(com.safedk.android.utils.g.a("headline[^>]+>\\s*<span[^>]+>([^<]+)"), a2, 1));
                    list4.add(com.safedk.android.utils.n.a(com.safedk.android.utils.g.a("description[^>]+>\\s*<span[^>]+>([^<]+)"), a2, 1));
                    list.add(com.safedk.android.utils.n.a(com.safedk.android.utils.g.a(com.safedk.android.utils.n.a(com.safedk.android.utils.g.a("<(?:canvas|svg)\\sclass=\\\\?\\\"(\\S+?)\\sendcard-app-icon"), a2, 1) + ak), str, 1));
                    list5.add(com.safedk.android.utils.n.a(com.safedk.android.utils.g.a(com.safedk.android.utils.n.a(a, a2, 1) + ak), str, 1));
                }
                return str2;
            }
        }
        List<String> b4 = com.safedk.android.utils.n.b(a, str, 1);
        Logger.d(l, "imageUrlClassList: ", b4);
        if (b4.size() >= i2) {
            for (int i4 = 0; i4 < i2; i4++) {
                list5.add(com.safedk.android.utils.n.a(com.safedk.android.utils.g.a(b4.get(i4) + ak), str, 1));
            }
            Logger.d(l, "extract Multi Ad Additional Elements - found brand downstream struct");
            return j;
        }
        return "";
    }

    private void a(List<h.a> list, List<String> list2, List<String> list3, StringBuilder sb) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            h.a aVar = list.get(i2);
            list3.add(i2, aVar.b());
            if (aVar.b() != null) {
                sb.append("dv&");
            }
            if (aVar.a() != null) {
                if (i2 >= list2.size()) {
                    list2.add(i2, aVar.a());
                } else {
                    list2.set(i2, aVar.a());
                }
                sb.append("dc&");
            }
            sb.append("&c=" + aVar.a() + X3.j.c);
        }
    }

    private String O(String str) {
        String group;
        Matcher matcher = com.safedk.android.utils.g.a("https://www\\.youtube\\.com/watch\\?v(\\\\x3d)(.*?)(\\\\x26)").matcher(str);
        if (matcher.find() && (group = matcher.group(2)) != null && group.length() <= 20) {
            return group;
        }
        return null;
    }

    private static Pattern h() {
        return com.safedk.android.utils.g.a("<(?!script|head|link|meta)([a-zA-Z0-9]+)(?:\\s*[^>]*)>([^=\\/\\{]+?)<\\/\\1>");
    }

    private String a(String str, List<String> list, String str2, StringBuilder sb, BrandSafetyUtils.AdType adType) {
        String replaceAll = str.replaceAll("<script\\b[^>]*>[\\s\\S]*?<\\/script\\b[^>]*>", "");
        Logger.printFullVerboseLog(l, "generate info, sanitized html is: ", replaceAll);
        Matcher matcher = h().matcher(replaceAll);
        while (matcher.find()) {
            if (matcher.groupCount() > 1) {
                String replaceAll2 = matcher.group(2).replace("<br>", " ").replaceAll("<[^>]*>", "");
                if (!TextUtils.isEmpty(replaceAll2)) {
                    Logger.d(l, "generate info, found ad text: ", replaceAll2, ", decoded: ", com.safedk.android.utils.k.g(replaceAll2));
                    list.add(com.safedk.android.utils.k.g(replaceAll2));
                }
            }
            if (adType != BrandSafetyUtils.AdType.INTERSTITIAL) {
                if (com.safedk.android.utils.n.d(com.safedk.android.analytics.brandsafety.creatives.e.e(), str)) {
                    str2 = "image";
                    sb.append("image");
                    sb.append(X3.j.c);
                } else {
                    str2 = "text";
                    sb.append("text");
                    sb.append(X3.j.c);
                }
            }
        }
        return str2;
    }

    private String a(String str, List<String> list, String str2, StringBuilder sb) {
        Matcher matcher = com.safedk.android.utils.g.a("survey_payload[\\'\\\"]\\s*:\\s*[\\'\\\"](.*?)[\\'\\\"]").matcher(str);
        if (matcher.find()) {
            try {
                JSONArray jSONArray = new JSONObject(com.safedk.android.utils.k.g(matcher.group(1))).getJSONArray(ag);
                for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                    String string = jSONArray.getJSONObject(i2).getString(af);
                    Logger.d(l, "generate info, found ad survey text: ", string);
                    list.add(string);
                }
            } finally {
                try {
                    return CreativeInfo.s;
                } finally {
                }
            }
            return CreativeInfo.s;
        }
        return str2;
    }

    private void b(String str, List<String> list) {
        String replaceAll;
        Matcher matcher = h().matcher(str.replaceAll("<script\\b[^>]*>[\\s\\S]*?<\\/script\\b[^>]*>", ""));
        while (matcher.find()) {
            if (matcher.groupCount() > 1 && (replaceAll = matcher.group(2).replace("<br>", " ").replaceAll("<[^>]*>", "")) != null && replaceAll.length() > 0) {
                Logger.d(l, "generate info, found ad text: ", replaceAll, ", decoded: ", com.safedk.android.utils.k.g(replaceAll));
                list.add(com.safedk.android.utils.k.g(replaceAll));
            }
        }
    }

    private boolean P(String str) {
        Logger.d(l, "isMraidAd started");
        for (String str2 : aS) {
            if (!str.contains(str2)) {
                return false;
            }
            Logger.d(l, "isMraidAd ad html contains the string ", str2);
        }
        Logger.d(l, "isMraidAd ad is an mraid ad");
        return true;
    }

    private CreativeInfo b(String str, CreativeInfo creativeInfo) {
        if (BrandSafetyUtils.AdType.NATIVE != creativeInfo.K()) {
            Logger.d(l, "handle scar-admob-video/banner ad started, click string: ", str, ", CI: ", creativeInfo);
            com.safedk.android.analytics.brandsafety.a a = SafeDK.getInstance().a(creativeInfo.K());
            if (a.f("com.unity3d.ads")) {
                AdNetworkDiscovery j2 = CreativeInfoManager.j("com.unity3d.ads");
                if (j2 != null) {
                    CreativeInfo a2 = j2.a((Object) str);
                    if (a2 != null) {
                        Logger.printFullVerboseLog(l, Logger.FeatureTag.CI_MATCHING, "handle scar-admob-video/banner ad, found origin SDK: ", a2.Q(), ", actual SDK: ", creativeInfo.Q());
                        a2.a(creativeInfo);
                        return a2;
                    }
                    Logger.d(l, "handle scar-admob-video/banner ad - no CI matched, actual SDK: ", creativeInfo.Q());
                } else {
                    Logger.d(l, "handle scar-admob-video/banner ad - no UnityAdsDiscovery found");
                }
            } else if (!a.f(com.safedk.android.utils.h.h)) {
                Logger.d(l, "handle scar-admob-video/banner ad - no ad info found for package name: ", com.safedk.android.utils.h.h);
            }
        }
        return creativeInfo;
    }

    private String Q(String str) {
        List<String> b2 = com.safedk.android.utils.n.b(com.safedk.android.utils.g.a("publisher-app-icon\\s?\\{(.*?)background(-image)?:.*?url\\(\"\\s*(?<url>.*?)\"\\s*\\)(.*?)\\}", 34), str, 3);
        if (b2 != null) {
            Iterator<String> it = b2.iterator();
            if (it.hasNext()) {
                String next = it.next();
                Logger.d(l, "findPublisherAppIconUrl match  : ", next);
                return next;
            }
            return null;
        }
        return null;
    }

    public String h(String str, String str2) {
        if (!str.contains(str2)) {
            return str;
        }
        Iterator<MatchResult> it = com.safedk.android.utils.n.c(com.safedk.android.utils.g.a("<div|class=(?:\\\"|')" + str2 + "(?:\\\"|')|</div>"), str).iterator();
        MatchResult matchResult = null;
        MatchResult matchResult2 = null;
        boolean z = false;
        int i2 = 0;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            MatchResult next = it.next();
            if (z) {
                if (next.group().equals("<div")) {
                    i2++;
                } else if (next.group().equals("</div>")) {
                    i2--;
                }
                if (i2 == 0) {
                    matchResult = next;
                    break;
                }
            }
            if (next.group().contains(str2)) {
                i2++;
                matchResult2 = next;
                z = true;
            }
        }
        if (matchResult2 != null && matchResult != null) {
            String substring = str.substring((matchResult2.start() - "<div".length()) - 1, matchResult.end());
            Logger.d(l, "find app icon url  remove element by className removing this matched string : ", substring);
            return str.replace(substring, "");
        }
        return str;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d
    protected List<CreativeInfo> a(String str, String str2, Map<String, List<String>> map, c.a aVar, byte[] bArr) throws JSONException {
        Logger.printFullVerboseLog(l, "generate info impl - started. url: ", str, ", maxParams: ", aVar, ", buffer: ", str2);
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
        return false;
    }

    public h.a a(String str, List<String> list) {
        char c2 = 1;
        Logger.d(l, "getVastInfoRecursive started");
        h.a a = com.safedk.android.analytics.brandsafety.creatives.h.a(str, true, com.safedk.android.utils.h.h);
        if (a == null) {
            return null;
        }
        try {
            String c3 = a.c();
            String d2 = a.d();
            List<String> i2 = a.i();
            List<String> p2 = a.p();
            List<String> o2 = a.o();
            List<String> q2 = a.q();
            List<String> r = a.r();
            Logger.d(l, "get vast info - saved ad ID: ", c3, ", ad system: ", d2, " and impression urls: ", i2);
            Logger.printFullVerboseLog(l, "get vast info - ", a);
            while (a != null) {
                if (a.e() == null) {
                    break;
                }
                Object[] objArr = new Object[2];
                objArr[0] = "get vast info - fetching vast ad uri: ";
                objArr[c2] = a.e();
                Logger.d(l, objArr);
                list.add(a.e());
                try {
                    String M = M(a.e());
                    Logger.printFullVerboseLog(l, "get vast info -  ad tag uri content=", M);
                    if (!TextUtils.isEmpty(M)) {
                        a = com.safedk.android.analytics.brandsafety.creatives.h.a(M, true, com.safedk.android.utils.h.h);
                        Logger.printFullVerboseLog(l, "get vast info recursive: ", a);
                        c2 = 1;
                    } else {
                        Logger.d(l, "get vast info -  ad tag uri content is empty");
                        break;
                    }
                } catch (Throwable th) {
                    th = th;
                    Logger.d(l, "Exception in get vast info recursive : ", th.getMessage(), th);
                    return a;
                }
            }
            if (a != null) {
                if (a.c().equals(c3)) {
                    a.a(c3);
                    Logger.d(l, "get vast info - saved adId from outer vast: ", c3);
                }
                if (a.d().equals(d2)) {
                    a.b(d2);
                    Logger.d(l, "get vast info - saved adSystem from outer vast: ", d2);
                }
                if (i2 != null) {
                    a.a(i2);
                    Logger.d(l, "get vast info - saved impressionUrls from outer vast: ", i2);
                }
                if (p2 != null) {
                    a.c(p2);
                    Logger.d(l, "get vast info - saved videoTrackingEventUrls from outer vast: ", p2);
                }
                if (o2 != null) {
                    a.b(o2);
                    Logger.d(l, "get vast info - saved videoCompletedUrls from outer vast: ", o2);
                }
                if (q2 != null) {
                    a.d(q2);
                    Logger.d(l, "get vast info - saved clickTrackingUrls from outer vast: ", q2);
                }
                if (r != null) {
                    a.e(r);
                    Logger.d(l, "get vast info - saved companionClickTrackingUrls from outer vast: ", r);
                }
            }
        } catch (Throwable th2) {
            th = th2;
        }
        return a;
    }

    private String a(String str, int i2) {
        int indexOf = str.indexOf(61);
        if (indexOf != -1) {
            int indexOf2 = str.indexOf(38, indexOf);
            if (indexOf2 == -1) {
                indexOf2 = str.length();
            }
            String substring = str.substring(indexOf + 1, indexOf2);
            Logger.d(l, "extract click url index: ", Integer.valueOf(i2), ", landing page package id: ", substring);
            if (!substring.equals(substring.toLowerCase())) {
                Logger.d(l, "extract click url - found package name which contains upper cases: ", substring);
            }
            return substring;
        }
        return null;
    }

    private List<String> R(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            List<String> a = com.safedk.android.analytics.brandsafety.creatives.e.a(com.safedk.android.utils.g.a("Landing\\+Page\\+([0-9])=(.*?)&", 2), str, 1, 2, false);
            Logger.d(l, "extractClickUrls values : ", a, ", rawValue = ", str);
            for (int i2 = 0; i2 < a.size(); i2 += 2) {
                int parseInt = Integer.parseInt(a.get(i2));
                String decode = URLDecoder.decode(a.get(i2 + 1), "UTF-8");
                Logger.d(l, "extract click url index: ", Integer.valueOf(parseInt), ", landing page: ", decode);
                String lowerCase = decode.toLowerCase();
                if (!lowerCase.startsWith("http") && !lowerCase.startsWith("market")) {
                    if (lowerCase.startsWith("intent")) {
                        arrayList.add(parseInt, decode);
                        Logger.d(l, "extractClickUrls: adding intent link with landing page: ", decode);
                        String a2 = a(decode, parseInt);
                        if (a2 != null) {
                            arrayList.add(parseInt, com.safedk.android.analytics.brandsafety.i.a(a2));
                        }
                    }
                }
                arrayList.add(parseInt, decode);
            }
        } catch (UnsupportedEncodingException e2) {
            Logger.e(l, e2.getMessage());
        }
        return arrayList;
    }

    private List<String> S(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            Logger.printFullVerboseLog(l, "extract destination click url started rawValue = ", str);
            List<String> a = com.safedk.android.analytics.brandsafety.creatives.e.a(com.safedk.android.utils.g.a("destinationUrl: (?:\\\\+x22|%22|\\\\*\"|&amp;quot;|\\\\*&quot;|\\\\*u0026|quot;|\\\\+x27|%27|\\\\*'|'|&amp;#39;|\\\\*&#39;)(.*?)(?:\\\\+x22|%22|\\\\*\"|&amp;quot;|\\\\*&quot;|\\\\*u0026|quot;|\\\\+x27|%27|\\\\*'|'|&amp;#39;|\\\\*&#39;)", 2), str, 1, false);
            Logger.d(l, "extract destination click url values : ", a, ", rawValue = ", str);
            Iterator<String> it = a.iterator();
            while (it.hasNext()) {
                String a2 = com.safedk.android.utils.k.a(it.next());
                Logger.d(l, "extract destination click url destination url : ", a2);
                if (a2.startsWith("http") || a2.startsWith("market") || a2.startsWith("intent")) {
                    arrayList.add(a2);
                    Logger.d(l, "extract destination click url : adding destination url : ", a2);
                }
            }
        } catch (Throwable th) {
            Logger.e(l, "Exception in extract destination click url : ", th.getMessage(), th);
        }
        return arrayList;
    }

    public static List<String> a(String str, boolean z) {
        List<String> a;
        ArrayList arrayList = new ArrayList();
        if (z) {
            a = com.safedk.android.analytics.brandsafety.creatives.e.a(com.safedk.android.utils.g.a("AdGroup\\+Creative\\+ID\\+([0-9])=(.*?)(?:(?:%24|\\\\+x24|$)|(?:%26|\\\\+x26|&)|(?:\\\\+x22|%22|\\\\*\"|&amp;quot;|\\\\*&quot;|\\\\*u0026|quot;|\\\\+x27|%27|\\\\*'|'|&amp;#39;|\\\\*&#39;))", 2), str, 1, 2, false);
        } else {
            a = com.safedk.android.analytics.brandsafety.creatives.e.a(com.safedk.android.utils.g.a("(?<!AdGroup\\+)Creative\\+ID\\+([0-9])=(.*?)(?:(?:%24|\\\\+x24|$)|(?:%26|\\\\+x26|&)|(?:\\\\+x22|%22|\\\\*\"|&amp;quot;|\\\\*&quot;|\\\\*u0026|quot;|\\\\+x27|%27|\\\\*'|'|&amp;#39;|\\\\*&#39;))", 2), str, 1, 2, false);
        }
        for (int i2 = 0; i2 < a.size(); i2 += 2) {
            int parseInt = Integer.parseInt(a.get(i2));
            String str2 = a.get(i2 + 1);
            if (!arrayList.contains(str2)) {
                arrayList.add(parseInt, str2);
            }
        }
        return arrayList;
    }

    public static List<String> C(String str) {
        return com.safedk.android.utils.n.b(com.safedk.android.utils.g.a("Creatives=(.*?)(?:(?:%24|\\\\+x24|$)|(?:%26|\\\\+x26|&)|(?:\\\\+x22|%22|\\\\*\"|&amp;quot;|\\\\*&quot;|\\\\*u0026|quot;|\\\\+x27|%27|\\\\*'|'|&amp;#39;|\\\\*&#39;))", 2), str, 1);
    }

    public static List<String> D(String str) {
        ArrayList arrayList = new ArrayList();
        List<String> a = com.safedk.android.analytics.brandsafety.creatives.e.a(com.safedk.android.utils.g.a("Clickstring\\+([0-9])=(.*?)(?:(?:%24|\\\\+x24|$)|(?:%26|\\\\+x26|&)|(?:\\\\+x22|%22|\\\\*\"|&amp;quot;|\\\\*&quot;|\\\\*u0026|quot;|\\\\+x27|%27|\\\\*'|'|&amp;#39;|\\\\*&#39;))", 2), str, 1, 2, false);
        for (int i2 = 0; i2 < a.size(); i2 += 2) {
            int parseInt = Integer.parseInt(a.get(i2));
            String str2 = a.get(i2 + 1);
            if (!arrayList.contains(str2)) {
                arrayList.add(parseInt, str2);
            }
        }
        return arrayList;
    }

    private int T(String str) {
        Matcher matcher = com.safedk.android.utils.g.a("Creative\\+ID\\+([0-9])", 2).matcher(str);
        int i2 = -1;
        while (matcher.find()) {
            i2 = Math.max(Integer.parseInt(matcher.group(1)), i2);
        }
        if (i2 >= 0) {
            return i2 + 1;
        }
        return C(str).size();
    }

    private void a(Object obj, List<String> list, List<Object> list2, Set<Object> set, final List<String> list3) {
        int i2;
        char c2;
        a aVar = this;
        if (obj == null || set.contains(obj)) {
            return;
        }
        set.add(obj);
        Class<?> cls = obj.getClass();
        ArrayList<Field> arrayList = new ArrayList();
        while (true) {
            arrayList.addAll(Arrays.asList(cls.getDeclaredFields()));
            cls = cls.getSuperclass();
            if (!cls.getName().startsWith("com.google.android.gms")) {
                break;
            } else {
                aVar = this;
            }
        }
        for (Field field : arrayList) {
            field.setAccessible(true);
            try {
                try {
                    final Object obj2 = field.get(obj);
                    if (obj2 != null) {
                        if (!field.getType().getName().equals("interface")) {
                            try {
                                if (!obj2.getClass().getName().startsWith("com.google.android.gms")) {
                                    if (field.getType().getName().equals(n)) {
                                        list.add(field.getName());
                                        list2.add(obj2);
                                        list.remove(list.size() - 1);
                                    } else if (obj2.getClass().getName().startsWith(com.safedk.android.utils.n.f)) {
                                        String str = (String) obj2;
                                        if (str.startsWith(Z)) {
                                            list.add(field.getName());
                                            Logger.d(l, "found prefetch click url in path: ", list, ", object: ", obj2);
                                            try {
                                                list2.add(new JSONObject("{ \"clickUrl\" : \"" + str + "\" }"));
                                            } catch (JSONException e2) {
                                            }
                                            list.remove(list.size() - 1);
                                        }
                                        try {
                                            if (str.startsWith(ac)) {
                                                list.add(field.getName());
                                                Object[] objArr = new Object[4];
                                                objArr[0] = "found prefetch creative id in path: ";
                                                objArr[1] = list;
                                                objArr[2] = ", object: ";
                                                objArr[3] = obj2;
                                                Logger.d(l, objArr);
                                                try {
                                                    list2.add(new JSONObject("{ \"creativeId\" : \"" + str + "\" }"));
                                                } catch (JSONException e3) {
                                                }
                                                list.remove(list.size() - 1);
                                            }
                                        } catch (ConcurrentModificationException e4) {
                                            e = e4;
                                            i2 = 1;
                                            c2 = 2;
                                            Object[] objArr2 = new Object[3];
                                            objArr2[0] = "Error in extract ad info : ";
                                            objArr2[i2] = e.getMessage();
                                            objArr2[c2] = e;
                                            Logger.e(l, objArr2);
                                            aVar = this;
                                        }
                                    } else if (field.getType().getName().equals(ad)) {
                                        list.add(field.getName());
                                        try {
                                            aVar.a(obj2, list3);
                                        } catch (ConcurrentModificationException e5) {
                                            Logger.d(l, "Couldn't access LinkedHashMap field : ", e5.getMessage());
                                            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.creatives.discoveries.a.1
                                                @Override // java.lang.Runnable
                                                public void run() {
                                                    try {
                                                        a.this.a(obj2, (List<String>) list3);
                                                    } catch (Throwable th) {
                                                        Logger.d(a.l, "Couldn't access LinkedHashMap field (again!) : ", th.getMessage());
                                                    }
                                                }
                                            }, 5L);
                                        }
                                        list.remove(list.size() - 1);
                                    }
                                }
                            } catch (ConcurrentModificationException e6) {
                                e = e6;
                            }
                        }
                        list.add(field.getName());
                        c2 = 2;
                        i2 = 1;
                        try {
                            a(obj2, list, list2, set, list3);
                            list.remove(list.size() - 1);
                        } catch (IllegalAccessException e7) {
                            e = e7;
                            Object[] objArr3 = new Object[i2];
                            objArr3[0] = e.getMessage();
                            Logger.e(l, objArr3);
                            aVar = this;
                        } catch (ConcurrentModificationException e8) {
                            e = e8;
                            Object[] objArr22 = new Object[3];
                            objArr22[0] = "Error in extract ad info : ";
                            objArr22[i2] = e.getMessage();
                            objArr22[c2] = e;
                            Logger.e(l, objArr22);
                            aVar = this;
                        }
                    }
                } catch (IllegalAccessException e9) {
                    e = e9;
                    i2 = 1;
                }
            } catch (ConcurrentModificationException e10) {
                e = e10;
            }
            aVar = this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Object obj, List<String> list) {
        String U;
        Logger.d(l, "extractHashMapFieldResourceURLs started");
        for (Map.Entry entry : ((LinkedHashMap) obj).entrySet()) {
            if (entry != null && entry.getValue() != null && (U = U(entry.getValue().toString())) != null) {
                Logger.d(l, "extractHashMapFieldResourceURLs resource url: ", U);
                list.add(U);
            }
        }
    }

    private String U(String str) {
        int i2;
        int indexOf;
        int indexOf2 = str.indexOf(34);
        if (indexOf2 > -1 && (indexOf = str.indexOf(34, (i2 = indexOf2 + 1))) > -1) {
            return str.substring(i2, indexOf);
        }
        return null;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public Set<String> c() {
        return new HashSet();
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public AdNetworkDiscovery.WebViewResourceMatchingMethod b() {
        return AdNetworkDiscovery.WebViewResourceMatchingMethod.WEBVIEW_LOOKUP;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public boolean e(View view) {
        if (!super.e(view) && !view.getClass().getName().equals(ai) && !view.getClass().getName().equals(aj)) {
            return false;
        }
        Logger.d(l, "is ad view: ", view.getClass().getName(), " is an instance of ", view.getClass().getName());
        return true;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public long a(CreativeInfo creativeInfo) {
        if (creativeInfo != null && creativeInfo.K() == BrandSafetyUtils.AdType.INTERSTITIAL && creativeInfo.h() != null && creativeInfo.h().contains(CreativeInfo.T)) {
            return SafeDK.getInstance().D() / 2;
        }
        return super.a(creativeInfo);
    }

    private String V(String str) {
        Matcher matcher = com.safedk.android.utils.g.a("(?:%3C|\\\\+x3c|<|&lt;|&amp;lt;)a .*?href(?:\\\\+x3D|%3d|=)(?:\\\\+x22|%22|\\\\*\"|&amp;quot;|\\\\*&quot;|\\\\*u0026|quot;|\\\\+x27|%27|\\\\*'|'|&amp;#39;|\\\\*&#39;)(.*?)(?:\\\\+x22|%22|\\\\*\"|&amp;quot;|\\\\*&quot;|\\\\*u0026|quot;|\\\\+x27|%27|\\\\*'|'|&amp;#39;|\\\\*&#39;)").matcher(str);
        if (matcher.find()) {
            return matcher.group(1);
        }
        return null;
    }

    private List<String[]> W(String str) {
        ArrayList arrayList = new ArrayList();
        Matcher matcher = com.safedk.android.utils.g.a("(<a[^>]*data-asoch-targets=['\"](ad[^'\"]+)['\"][^>]*>(.*?)</a>)", 32).matcher(str);
        while (matcher.find()) {
            String group = matcher.group(1);
            String group2 = matcher.group(2);
            if (group2 != null && group2.contains(StringUtils.COMMA)) {
                group2 = group2.substring(group2.indexOf(44) + 1);
            }
            arrayList.add(new String[]{group2, matcher.group(3).replaceAll("<br\\s*/?>", " ").trim().replaceAll("<[^>]+>", "").trim(), group});
        }
        return arrayList;
    }

    private boolean X(String str) {
        Matcher matcher = com.safedk.android.utils.g.a("<([a-zA-Z]+)(?:\\s+[^>]*)?\\sstyle\\s*=\\s*\"(?=.*(background-image\\s*:\\s*url\\([^\\)]+\\)\\s*;?)).*?\"[^>]*>", 32).matcher(str);
        while (matcher.find()) {
            if (com.safedk.android.utils.g.a("(background-size\\s*:\\s*(cover|contain)\\s*;?)", 32).matcher(matcher.group()).find()) {
                return true;
            }
        }
        return false;
    }

    private boolean Y(String str) {
        return com.safedk.android.utils.g.a("background\\s*:\\s*[a-z]+-gradient\\([^\\)]+\\)\\s*;?").matcher(str).find();
    }

    private boolean Z(String str) {
        Matcher matcher = com.safedk.android.utils.g.a("<svg[^>]*viewBox=['\"]\\s*\\d+\\s*\\d+\\s*(\\d+)\\s*(\\d+)\\s*['\"][^>]*>", 32).matcher(str);
        while (matcher.find()) {
            if (matcher.groupCount() >= 2) {
                try {
                    int parseInt = Integer.parseInt(matcher.group(1));
                    if (parseInt != Integer.parseInt(matcher.group(2)) || parseInt < 400) {
                        Logger.d(l, "Non-square or small square <svg> found:");
                        Logger.d(l, matcher.group(0));
                        return true;
                    }
                } catch (Throwable th) {
                    Logger.d(l, "exception when parsing integers from svg: ", th);
                }
            }
        }
        return false;
    }

    private void c(String str, CreativeInfo creativeInfo) {
        boolean z;
        boolean z2;
        boolean z3;
        try {
            Logger.d(l, "handle text and survey ads started for ci with id: ");
            if (str.contains("loadPaidtasksSurvey")) {
                creativeInfo.a(CreativeInfo.s, "/");
            }
            List<String[]> W2 = W(str);
            Logger.d(l, "found ", Integer.valueOf(W2.size()), " data elements");
            boolean Y2 = Y(str);
            boolean z4 = false;
            boolean z5 = false;
            for (String[] strArr : W2) {
                String str2 = strArr[0];
                String str3 = strArr[1];
                String str4 = strArr[2];
                if (aP.contains(str2)) {
                    Logger.d(l, "found text: ", str3);
                    creativeInfo.z(str3);
                    z5 = true;
                }
                if (aR.contains(str2)) {
                    Logger.d(l, "found image based on: ", str2);
                    z4 = true;
                }
                Logger.d(l, "found full tag: ", str4, " tag: ", str2, " text: ", str3);
            }
            if (z4) {
                z = z4;
                z2 = false;
                z3 = false;
            } else {
                z2 = X(str);
                if (!z2) {
                    z = z4;
                    z3 = false;
                } else {
                    z3 = Z(str);
                    z = z3;
                }
            }
            Logger.d(l, "is background cover: ", Boolean.valueOf(z2), " is proper svg ", Boolean.valueOf(z3), " is gradient: ", Boolean.valueOf(Y2));
            if (z5) {
                creativeInfo.a(CreativeInfo.T, "/");
            }
            if (z) {
                creativeInfo.a(CreativeInfo.V, "/");
            }
            if (Y2) {
                creativeInfo.a(CreativeInfo.an, "/");
            }
            Logger.d(l, "result downstream is: ", creativeInfo.h());
        } catch (Throwable th) {
            Logger.d(l, "exception occurred when handling text ad!", th);
        }
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public boolean a(com.safedk.android.analytics.brandsafety.e eVar, List<String> list, String str) {
        int lastIndexOf;
        List<String> x = eVar.x();
        String o2 = BrandSafetyUtils.o(str);
        if (x == null || x.isEmpty() || list == null || list.isEmpty() || list.size() <= (lastIndexOf = x.lastIndexOf(o2))) {
            return false;
        }
        for (int i2 = 0; i2 <= lastIndexOf; i2++) {
            if (!x.get(i2).equals(list.get(i2))) {
                return false;
            }
        }
        for (int i3 = lastIndexOf + 2; i3 < x.size() && i3 < list.size(); i3++) {
            if (x.get(i3).equals(list.get(i3))) {
                return false;
            }
        }
        Logger.d(l, "detected view hierarchy change, stop taking screenshots and collecting resources");
        eVar.a(com.safedk.android.analytics.brandsafety.m.G, new m.a[0]);
        eVar.b(true);
        if (eVar.j() != null) {
            eVar.j().a(true);
        }
        return true;
    }
}
