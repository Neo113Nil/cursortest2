package com.safedk.android.analytics.brandsafety.creatives.discoveries;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.pubmatic.sdk.common.POBCommonConstants;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import com.safedk.android.analytics.brandsafety.creatives.h;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import com.safedk.android.analytics.brandsafety.creatives.infos.PubMaticCreativeInfo;
import com.safedk.android.analytics.events.BrandSafetyEvent;
import com.safedk.android.utils.LimitedConcurrentHashMap;
import com.safedk.android.utils.Logger;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class p extends d {
    private static final String b = "PubMaticDiscovery";
    private static final String c = "seatbid";
    private static final String d = "bid";
    private static final String e = "crid";
    private static final String f = "adomain";
    private static final String g = "ext";
    private static final String h = "crtype";
    private static final String i = "adm";
    private static final String j = "PubMatic";
    private static final int k = 50;
    private static final ConcurrentHashMap<String, String> l = new LimitedConcurrentHashMap(50);
    private static final ConcurrentHashMap<String, String> m = new LimitedConcurrentHashMap(50);
    private static final ConcurrentHashMap<String, WeakReference<Object>> n = new LimitedConcurrentHashMap(50);
    private static final ConcurrentHashMap<String, WeakReference<Object>> o = new LimitedConcurrentHashMap(50);
    private static final ConcurrentHashMap<String, String> p = new LimitedConcurrentHashMap(50);

    public p() {
        super(com.safedk.android.utils.h.F, b);
        this.E.b(AdNetworkConfiguration.SUPPORTS_PREFETCH_RECEIVING_BY_APPLOVIN, true);
        this.E.b(AdNetworkConfiguration.SUPPORTS_BANNER_IMPRESSION_TRACKING, true);
        this.E.b(AdNetworkConfiguration.SUPPORTS_MREC_IMPRESSION_TRACKING, true);
        this.E.b(AdNetworkConfiguration.SUPPORTS_AUTO_REDIRECTS_IDENTIFICATION, true);
        this.E.b(AdNetworkConfiguration.SHOULD_USE_RESOURCES_COLLECTION_SCRIPT_FULLSCREEN, true);
        this.E.b(AdNetworkConfiguration.SUPPORTS_EXPANDED_ADS_IDENTIFICATION, true);
        this.E.b(AdNetworkConfiguration.SHOULD_GET_HTML_TEXT_TRAVERSE_IFRAMES, true);
        this.E.b(AdNetworkConfiguration.SHOULD_INJECT_JS_TO_WEBVIEWS_FOR_TEXT_EXTRACTION, true);
        this.E.b(AdNetworkConfiguration.SUPPORTS_JAVASCRIPT_BASED_VIDEO_STATE_DETECTION, true);
        this.E.b(AdNetworkConfiguration.SHOULD_VIDEO_OBSERVER_TRAVERSE_IFRAMES, true);
        this.E.b(AdNetworkConfiguration.SUPPORTS_MREC_IMPRESSION_EOV, true);
        this.E.b(AdNetworkConfiguration.AD_NETWORK_SUPPORTS_PREFETCH_REUSE, true);
    }

    private boolean a(h.a aVar) {
        if (aVar == null || TextUtils.isEmpty(aVar.e()) || aVar.d() == null || !aVar.d().equals(j)) {
            return false;
        }
        return true;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d
    protected h.a a(CreativeInfo creativeInfo, String str, String str2, boolean z) {
        boolean z2 = creativeInfo.z();
        h.a a = super.a(creativeInfo, str, str2, z);
        if (a == null) {
            return null;
        }
        Logger.d(b, "update vast CI - is inner vast: ", Boolean.valueOf(z2), " does contains vast ad tag: ", Boolean.valueOf(TextUtils.isEmpty(a.e())), ", isVastWrapper ? ", Boolean.valueOf(a(a)));
        if (!a(a)) {
            PubMaticCreativeInfo pubMaticCreativeInfo = (PubMaticCreativeInfo) creativeInfo;
            pubMaticCreativeInfo.d(a.h());
            Logger.d(b, "update vast CI - media urls are: ", a.h());
            synchronized (m) {
                m.put(pubMaticCreativeInfo.as(), creativeInfo.L());
            }
            Logger.d(b, "update vast CI - storing for ad id: ", creativeInfo.L(), " the value: ", pubMaticCreativeInfo.as());
            List<String> i2 = a.i();
            if (!com.safedk.android.utils.n.a((Collection<?>) i2)) {
                Logger.printFullVerboseLog(b, "vast impression url to add: ", i2.get(i2.size() - 1));
                pubMaticCreativeInfo.a(i2.get(i2.size() - 1));
            } else {
                Logger.d(b, "vast impression url - empty");
            }
        }
        a(creativeInfo, a);
        return a;
    }

    private static void a(CreativeInfo creativeInfo, h.a aVar) {
        if (aVar.q() != null) {
            creativeInfo.b(aVar.q());
        }
        if (aVar.p() != null) {
            creativeInfo.b(aVar.p());
        }
        if (aVar.i() != null) {
            creativeInfo.b(aVar.i());
        }
        if (aVar.p() != null) {
            creativeInfo.b(aVar.p());
        }
        if (aVar.h() != null) {
            creativeInfo.b(aVar.h());
        }
        if (aVar.r() != null) {
            creativeInfo.b(aVar.r());
        }
        if (aVar.j() != null) {
            creativeInfo.b(aVar.j());
        }
    }

    private void d(CreativeInfo creativeInfo, String str) {
        if (a(creativeInfo, (String) null, str, true) != null) {
            Logger.d(b, "handle vast in prefetch: before - ", creativeInfo.h());
            if (creativeInfo.h() == null || !creativeInfo.h().contains("vast")) {
                creativeInfo.a("vast", "/");
            }
            Logger.d(b, "handle vast in prefetch: after - ", creativeInfo.h());
        }
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d
    protected List<CreativeInfo> a(String str, String str2, Map<String, List<String>> map, c.a aVar, byte[] bArr) throws JSONException {
        BrandSafetyUtils.AdType adType;
        BrandSafetyEvent.AdFormatType adFormatType;
        String str3;
        String str4;
        String str5;
        boolean z;
        boolean z2;
        String replace;
        Object[] objArr = new Object[8];
        objArr[0] = "generate info - started, url= ";
        objArr[1] = str;
        objArr[2] = ", buffer size: ";
        objArr[3] = str2 == null ? "0" : Integer.valueOf(str2.length());
        objArr[4] = "requestHeaders: ";
        objArr[5] = map;
        objArr[6] = ", max params: ";
        objArr[7] = aVar;
        Logger.d(b, objArr);
        PubMaticCreativeInfo pubMaticCreativeInfo = null;
        try {
        } catch (Throwable th) {
            th = th;
        }
        if (!com.safedk.android.utils.n.l(str2)) {
            return new ArrayList();
        }
        JSONObject jSONObject = new JSONObject(str2);
        String optString = jSONObject.optString("id");
        if (aVar != null && aVar.b != null) {
            BrandSafetyUtils.AdType a = BrandSafetyUtils.a(aVar.b);
            adFormatType = aVar.b;
            adType = a;
        } else {
            adType = null;
            adFormatType = null;
        }
        if (aVar == null) {
            str3 = null;
            str4 = null;
            str5 = null;
        } else {
            String str6 = aVar.d;
            String str7 = aVar.c;
            str5 = aVar.a;
            str3 = str6;
            str4 = str7;
        }
        PubMaticCreativeInfo pubMaticCreativeInfo2 = new PubMaticCreativeInfo(adType, optString, str3, adFormatType, str4, this.I, str5);
        try {
            this.J.put(optString, pubMaticCreativeInfo2);
            Logger.d(b, "generate info - filling parameters for ci with id: ", pubMaticCreativeInfo2.L(), " ad type: ", pubMaticCreativeInfo2.K(), " ad format: ", pubMaticCreativeInfo2.I());
            Logger.d(b, "generate info - ci placement id: ", pubMaticCreativeInfo2.F(), " creative id: ", pubMaticCreativeInfo2.N(), " event id: ", pubMaticCreativeInfo2.n());
            JSONArray jSONArray = jSONObject.getJSONArray(c);
            Logger.d(b, "generate info - started iterating ", Integer.valueOf(jSONArray.length()), " seatbids");
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                JSONArray jSONArray2 = jSONArray.optJSONObject(i2).getJSONArray("bid");
                Logger.d(b, "generate info - started iterating ", Integer.valueOf(jSONArray2.length()), " bids");
                for (int i3 = 0; i3 < jSONArray2.length(); i3++) {
                    JSONObject optJSONObject = jSONArray2.optJSONObject(i2);
                    String optString2 = optJSONObject.optString(e);
                    if (!TextUtils.isEmpty(optString2)) {
                        pubMaticCreativeInfo2.k(optString2);
                    }
                    JSONArray optJSONArray = optJSONObject.optJSONArray("adomain");
                    if (optJSONArray != null && optJSONArray.length() > 0) {
                        pubMaticCreativeInfo2.i((String) optJSONArray.get(0));
                    }
                    String optString3 = optJSONObject.getJSONObject("ext").optString(h);
                    if (!TextUtils.isEmpty(optString3)) {
                        pubMaticCreativeInfo2.e(optString3);
                    }
                    String optString4 = optJSONObject.optString("adm");
                    if (!TextUtils.isEmpty(optString4)) {
                        if (!com.safedk.android.analytics.brandsafety.creatives.h.b(optString4)) {
                            z = false;
                        } else {
                            d((CreativeInfo) pubMaticCreativeInfo2, optString4);
                            z = true;
                        }
                        String g2 = com.safedk.android.utils.k.g(optString4);
                        if (!com.safedk.android.utils.k.k(g2)) {
                            z2 = false;
                        } else {
                            synchronized (l) {
                                Logger.printFullVerboseLog(b, "generate info - found html content: ", g2);
                                replace = g2.replace("\\\"", "\"");
                                l.put(optString, replace.replaceAll("\\s+|\\r|\\\\n", ""));
                            }
                            Logger.d(b, "generate info - added ad id: ", optString, " to prefetch content");
                            pubMaticCreativeInfo2.b((List<String>) com.safedk.android.utils.n.f(replace));
                            pubMaticCreativeInfo2.a("mraid", "/");
                            z2 = true;
                        }
                        if (z2 && z) {
                            Logger.d(b, "found a prefetch that is vast and mraid, ad id is: ", optString);
                        }
                    }
                }
            }
        } catch (Throwable th2) {
            th = th2;
            pubMaticCreativeInfo = pubMaticCreativeInfo2;
            Logger.d(b, "generate info - not a valid JSON string: ", th.getMessage(), th);
            pubMaticCreativeInfo2 = pubMaticCreativeInfo;
            ArrayList arrayList = new ArrayList();
            arrayList.add(pubMaticCreativeInfo2);
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(pubMaticCreativeInfo2);
        return arrayList2;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d
    protected String a(String str, CreativeInfo creativeInfo) {
        return str;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d
    protected boolean B(String str) {
        Logger.d(b, "should follow get url impl - url is: ", str, ", results: ", Boolean.valueOf(!str.startsWith("data:") && str.contains("?")));
        return false;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d
    protected boolean b(String str, Bundle bundle) {
        return false;
    }

    private String C(String str) {
        int min = Math.min(500, str.length());
        synchronized (l) {
            Logger.d(b, "find inner ad content, webview resource prefix value: ", str.substring(0, min));
            for (String str2 : l.keySet()) {
                String str3 = l.get(str2);
                if (str3 != null) {
                    Logger.d(b, "find inner ad content, prefetch content prefix is: ", str3.substring(0, Math.min(500, str3.length())));
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
            Logger.d(b, "find inner ad content, did not find any adId for the webview - ad id to prefetch map keys: ", l.keySet());
            return null;
        }
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public String a(String str, String str2, WeakReference<WebView> weakReference) {
        if (str == null || str.startsWith("data:")) {
            return null;
        }
        Object[] objArr = new Object[2];
        objArr[0] = "get ad id from resource started - webview: ";
        objArr[1] = weakReference != null ? weakReference.get() : null;
        Logger.d(b, objArr);
        String C = C(com.safedk.android.utils.k.g(str).replaceAll("\\s+|\\r|\\\\n", ""));
        if (C != null && this.J.containsKey(C)) {
            Logger.d(b, Logger.FeatureTag.CI_MATCHING, "get ad id from resource - matching found via inner prefetch, adId=", C);
            return C;
        }
        if (C != null) {
            Logger.d(b, "get ad id from resource - ad id - ", C, " is not in set: ", this.J.keySet());
        }
        return null;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d
    public void i() {
        super.i();
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public AdNetworkDiscovery.WebViewResourceMatchingMethod b() {
        return AdNetworkDiscovery.WebViewResourceMatchingMethod.WEBVIEW_LOOKUP;
    }

    public static Map<String, Object> f(Object obj) {
        Object obj2;
        HashMap hashMap = new HashMap();
        if (obj == null) {
            hashMap.put("error", "Null vast player object");
            return hashMap;
        }
        try {
            Class<?> cls = obj.getClass();
            Object obj3 = null;
            try {
                obj2 = a(obj, cls, Class.forName("com.pubmatic.sdk.video.vastmodels.POBMediaFile"));
            } catch (ClassNotFoundException e2) {
                obj2 = null;
            }
            if (obj2 != null) {
                a(obj2, "getMediaFileURL", hashMap, "mediaFileURL");
            }
            try {
                obj3 = a(obj, cls, Class.forName("com.pubmatic.sdk.video.vastmodels.POBVastAd"));
            } catch (ClassNotFoundException e3) {
            }
            if (obj3 != null) {
                a(obj3, "getImpressions", hashMap, "impressionUrls");
            }
        } catch (Exception e4) {
            hashMap.put("reflectionError", e4.getMessage());
        }
        return hashMap;
    }

    private static void a(Object obj, String str, Map<String, Object> map, String str2) {
        if (obj == null) {
            return;
        }
        try {
            Object invoke = obj.getClass().getMethod(str, new Class[0]).invoke(obj, new Object[0]);
            map.put(str2, invoke);
            Logger.d(b, "extract by getter - added info key: ", str2, " with value: ", invoke);
        } catch (Exception e2) {
        }
    }

    private static Object a(Object obj, Class<?> cls, Class<?> cls2) {
        Logger.d(b, "find object by type - object is: ", obj, " with class: ", cls.getName(), " and target: ", cls2.getName());
        if (obj == null) {
            return null;
        }
        try {
            for (Field field : cls.getDeclaredFields()) {
                field.setAccessible(true);
                Object obj2 = field.get(obj);
                String name = field.getType().getName();
                String obj3 = obj2 != null ? obj2.toString() : POBCommonConstants.NULL_VALUE;
                if (obj3.length() > 100) {
                    obj3 = obj3.substring(0, 97) + "...";
                }
                Logger.d(b, "Field: ", field.getName(), ", Type: ", name, ", Value: ", obj3);
                try {
                    if (cls2.isAssignableFrom(field.getType()) && !cls.getName().contains("POBMediaPlayer")) {
                        Logger.d(b, "found correct field of type: ", field.getType());
                        return field.get(obj);
                    }
                } catch (Exception e2) {
                }
            }
        } catch (Exception e3) {
        }
        try {
            Class<?> cls3 = obj.getClass();
            Logger.d(b, "Searching MediaPlayer in class: ", cls3.getName());
            for (Field field2 : cls3.getDeclaredFields()) {
                field2.setAccessible(true);
                try {
                    Object obj4 = field2.get(obj);
                    Class<?> type = field2.getType();
                    if (obj4 != null && type.getName().equals(cls2.getName())) {
                        Logger.d(b, "Found target in field: ", field2.getName());
                        return obj4;
                    }
                } catch (Exception e4) {
                    Logger.d(b, "Error accessing field: ", field2.getName());
                }
            }
            Logger.d(b, "No fields of MediaPlayer type found, searching for related objects");
            return null;
        } catch (Exception e5) {
            Logger.d(b, "Error searching for MediaPlayer: ", e5.getMessage());
            return null;
        }
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public CreativeInfo c(Object obj, Object obj2) {
        String a = BrandSafetyUtils.a(obj);
        Logger.d(b, "store on ad ready to play - vast player address is: ", a, " video player: ", obj2);
        synchronized (n) {
            n.put(a, new WeakReference<>(obj2));
        }
        g(obj2);
        return null;
    }

    public void g(Object obj) {
        if (obj == null) {
            return;
        }
        String a = BrandSafetyUtils.a(obj);
        if (o.containsKey(a)) {
            return;
        }
        try {
            Class<?> cls = obj.getClass();
            Class<?> cls2 = Class.forName("com.pubmatic.sdk.video.player.POBPlayer");
            Object a2 = a(obj, cls, cls2);
            Logger.d(b, "get media player from video view - video player view is: ", obj, " pob media player is: ", a2);
            Object a3 = a(a2, cls2, Class.forName("android.media.MediaPlayer"));
            Logger.d(b, "get media player from video view - pob media player is: ", a2, " and media player: ", a3);
            if (a3 != null) {
                o.put(a, new WeakReference<>(a3));
                Logger.d(b, "get media player from video view - adding video player address: ", a, " with media player: ", a3);
            }
        } catch (ClassNotFoundException e2) {
            Logger.d(b, "error - POBPlayer class not found");
        }
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public boolean a(com.safedk.android.analytics.brandsafety.c cVar) {
        List<String> x = cVar.x();
        Logger.d(b, "is MediaPlayer Playing started: ", x);
        for (String str : x) {
            if (o.containsKey(str)) {
                WeakReference<Object> weakReference = o.get(str);
                if (!com.safedk.android.utils.n.a((Reference<?>) weakReference)) {
                    Object obj = null;
                    synchronized (n) {
                        Iterator<Map.Entry<String, WeakReference<Object>>> it = n.entrySet().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            Map.Entry<String, WeakReference<Object>> next = it.next();
                            if (com.safedk.android.utils.n.a((Reference<?>) next.getValue()) && o.get(BrandSafetyUtils.a(next.getValue().get())) != null) {
                                obj = next.getValue().get();
                                break;
                            }
                        }
                    }
                    Logger.d(b, "is MediaPlayer Playing - founded video player is: ", obj);
                    g(obj);
                }
                if (weakReference != null && (weakReference.get() instanceof MediaPlayer)) {
                    MediaPlayer mediaPlayer = (MediaPlayer) weakReference.get();
                    Logger.d(b, "found a media player: ", mediaPlayer);
                    return com.safedk.android.utils.n.a(mediaPlayer);
                }
            }
        }
        return false;
    }

    private Object D(String str) {
        WeakReference<Object> weakReference;
        synchronized (n) {
            weakReference = n.get(str);
        }
        Object obj = null;
        if (com.safedk.android.utils.n.a((Reference<?>) weakReference)) {
            obj = weakReference.get();
        }
        Logger.d(b, "get view from vast object - vast player address is: ", str, " returning: ", obj);
        return obj;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public CreativeInfo d(Object obj) {
        String str;
        Logger.d(b, "match on vast ad started with vast player: ", obj);
        String str2 = null;
        List list = null;
        for (Map.Entry<String, Object> entry : f(obj).entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            Logger.d(b, "match on vast ad started - found key: ", key, " with value: ", value);
            if (key.equals("mediaFileURL") && (value instanceof String)) {
                str2 = (String) value;
            } else if (key.equals("impressionUrls") && (value instanceof List)) {
                list = (List) value;
            }
        }
        Logger.d(b, "match on vast ad started - media url: ", str2);
        if (str2 == null) {
            return null;
        }
        synchronized (m) {
            Iterator<Map.Entry<String, String>> it = m.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    str = null;
                    break;
                }
                Map.Entry<String, String> next = it.next();
                String key2 = next.getKey();
                str = next.getValue();
                Logger.d(b, "match on vast ad started - now iterating on key: ", key2, " and value: ", str);
                if (key2.contains(str2) && (this.J.get(str) instanceof PubMaticCreativeInfo)) {
                    String at = ((PubMaticCreativeInfo) this.J.get(str)).at();
                    Logger.d(b, "match on vast ad started - inner impression: ", at, " and urls: ", list);
                    if (list != null && list.contains(at)) {
                        break;
                    }
                }
            }
        }
        if (str == null) {
            return null;
        }
        Logger.d(b, Logger.FeatureTag.CI_MATCHING, "match on vast ad started - found CI with ad id: ", str);
        CreativeInfo creativeInfo = this.J.get(str);
        if (creativeInfo != null) {
            creativeInfo.a(D(BrandSafetyUtils.a(obj)));
        }
        return creativeInfo;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public void f(String str, String str2) {
        if (str2 != null) {
            Logger.d(b, "store url on string request - is contained in VIV set: ", Boolean.valueOf(this.G.contains(str2)));
            p.put(str, str2);
        }
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public String y(String str) {
        if (str != null) {
            return p.remove(str);
        }
        return null;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public boolean e(View view) {
        String name = view.getClass().getName();
        boolean z = super.e(view) || ((view instanceof FrameLayout) && name.contains("POBBannerView"));
        if (z) {
            Logger.d(b, "is ad view result is true for class name: ", name);
        }
        return z;
    }
}
