package com.safedk.android.analytics.brandsafety.creatives.discoveries;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.webkit.WebView;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.RedirectDetails;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import com.safedk.android.analytics.brandsafety.creatives.infos.MobileFuseCreativeInfo;
import com.safedk.android.utils.Logger;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class m extends d {
    private static final String b = "MobileFuseDiscovery";
    private static final String g = "crid";
    private static final String h = "id";
    private static final String i = "type";
    private static final String j = "adm";
    private static final String k = "url";
    private static final String l = "i";
    private static final String m = ".mobilefuse.com/vast-wrapper?";
    private static final String n = ".mobilefuse.com/event?t=start";
    private static final String o = "https://sdk-webview.mobilefuse.com/mraid/";
    private static final String p = "expand?";
    private static final String q = "open?";
    private static final Map<Integer, Set<CreativeInfo>> c = new HashMap();
    private static final Map<String, Set<CreativeInfo>> d = new HashMap();
    private static final Map<String, CreativeInfo> e = new HashMap();
    private static final Map<String, CreativeInfo> f = new HashMap();
    private static final String[] V = {"mfsdk://imp"};

    public m() {
        super(com.safedk.android.utils.h.E, b);
        this.E.b(AdNetworkConfiguration.SUPPORTS_PREFETCH_RECEIVING_BY_APPLOVIN, true);
        this.E.b(AdNetworkConfiguration.SUPPORTS_BANNER_IMPRESSION_TRACKING, true);
        this.E.b(AdNetworkConfiguration.SUPPORTS_MREC_IMPRESSION_TRACKING, true);
        this.E.b(AdNetworkConfiguration.SUPPORTS_MREC_IMPRESSION_EOV, true);
        this.E.b(AdNetworkConfiguration.SUPPORTS_JAVASCRIPT_BASED_VIDEO_STATE_DETECTION, true);
        this.E.b(AdNetworkConfiguration.USE_INPUT_STREAM_EVENT_AS_RESOURCE_LOADED_INDICATION, true);
        this.E.b(AdNetworkConfiguration.SHOULD_CALL_RESOURCE_LOADED_FROM_SHOULD_INTERCEPT_REQUEST, true);
        this.E.b(AdNetworkConfiguration.SHOULD_USE_RESOURCES_COLLECTION_SCRIPT_FULLSCREEN, true);
        this.E.b(AdNetworkConfiguration.SUPPORTS_AUTO_REDIRECTS_IDENTIFICATION, true);
        this.E.b(AdNetworkConfiguration.SUPPORTS_EXPANDED_ADS_IDENTIFICATION, true);
        this.E.b(AdNetworkConfiguration.SUPPORT_WEBVIEW_COMMENT_EXTRACTION, true);
        this.E.b(AdNetworkConfiguration.SHOULD_GET_HTML_TEXT_TRAVERSE_IFRAMES, true);
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d
    protected List<CreativeInfo> a(String str, String str2, Map<String, List<String>> map, c.a aVar, byte[] bArr) throws JSONException {
        String str3;
        JSONArray optJSONArray;
        Logger.d(b, "generate info impl - started. max params= ", aVar, ", url= ", str);
        if (aVar != null) {
            try {
                String a = com.safedk.android.utils.c.a(Base64.decode(str2, 0));
                if (!TextUtils.isEmpty(a)) {
                    JSONObject jSONObject = new JSONObject(a);
                    Logger.printFullVerboseLog(b, "generate info impl - json obj= ", jSONObject.toString(4));
                    BrandSafetyUtils.AdType b2 = BrandSafetyUtils.b(aVar.b.name());
                    Logger.d(b, "generate info impl - ad type= ", b2);
                    String optString = jSONObject.optString(g);
                    Logger.d(b, "generate info impl - creative id= ", optString);
                    String optString2 = jSONObject.optString("id");
                    Logger.d(b, "generate info impl - ad id= ", optString2);
                    MobileFuseCreativeInfo mobileFuseCreativeInfo = new MobileFuseCreativeInfo(b2, com.safedk.android.utils.h.E, optString2, optString, this.I, aVar.c, aVar.a);
                    mobileFuseCreativeInfo.a(aVar.b);
                    Logger.d(b, "generate info impl - ad format= ", aVar.b);
                    String str4 = jSONObject.optString("type", "") + "/";
                    String optString3 = jSONObject.optString("adm");
                    if (TextUtils.isEmpty(optString3) && (optJSONArray = jSONObject.optJSONArray("adm")) != null) {
                        str4 = str4 + "adm" + optJSONArray.length() + "/";
                        for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                            JSONObject optJSONObject = optJSONArray.optJSONObject(i2);
                            if (optJSONObject != null) {
                                optString3 = optJSONObject.optString("adm");
                                if (!TextUtils.isEmpty(optString3)) {
                                    break;
                                }
                            }
                        }
                    }
                    if (com.safedk.android.analytics.brandsafety.creatives.h.b(optString3)) {
                        str3 = str4 + "vast";
                        Logger.d(b, "generate info impl - media value is vast!");
                        a((CreativeInfo) mobileFuseCreativeInfo, (String) null, optString3, true);
                        mobileFuseCreativeInfo.b(false);
                        e((CreativeInfo) mobileFuseCreativeInfo);
                    } else {
                        str3 = str4 + "mraid";
                        Logger.d(b, "generate info impl - media value is mraid!");
                        String a2 = com.safedk.android.utils.n.a(com.safedk.android.utils.g.a("src=\\\\?\"([^\"]+)"), optString3, 1);
                        if (com.safedk.android.utils.n.a((Object) a2)) {
                            a2 = com.safedk.android.utils.k.r(a2);
                            if (a2.endsWith("\\")) {
                                a2 = a2.substring(0, a2.length() - 1);
                            }
                        }
                        Logger.d(b, "generate info impl - src= ", a2);
                        if (!TextUtils.isEmpty(a2)) {
                            mobileFuseCreativeInfo.y(a2);
                            e.put(a2, mobileFuseCreativeInfo);
                        }
                    }
                    mobileFuseCreativeInfo.e(str3);
                    Logger.d(b, "generate info impl - downstream struct= ", str3);
                    Logger.d(b, "generate info impl - ci generated= ", mobileFuseCreativeInfo);
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(mobileFuseCreativeInfo);
                    return arrayList;
                }
                return null;
            } catch (Exception e2) {
                Logger.d(b, "generate info impl - not a valid JSON string: ", e2.getMessage());
                return null;
            }
        }
        return null;
    }

    private static void e(CreativeInfo creativeInfo) {
        HashSet<String> u;
        if (creativeInfo != null && (u = creativeInfo.u()) != null) {
            for (String str : u) {
                Logger.d(b, "save vast ad tag uri to ci - vast ad tag uri= ", str);
                if (str.contains(m)) {
                    String d2 = com.safedk.android.utils.k.d(str, "i");
                    Logger.d(b, "save vast ad tag uri to ci - i query param= ", d2);
                    if (TextUtils.isEmpty(d2)) {
                        String d3 = com.safedk.android.utils.k.d(str, "url");
                        Logger.d(b, "save vast ad tag uri to ci - url query param= ", d3);
                        if (!TextUtils.isEmpty(d3)) {
                            d2 = com.safedk.android.utils.k.d(d3, "i");
                            Logger.d(b, "save vast ad tag uri to ci - i query param found in url query param= ", d2);
                        }
                    }
                    if (!TextUtils.isEmpty(d2)) {
                        Logger.d(b, "save vast ad tag uri to ci - saving i query param= ", d2, ",    to ci= ", creativeInfo);
                        f.put(d2, creativeInfo);
                        return;
                    }
                }
            }
        }
    }

    private static CreativeInfo C(String str) {
        if (!TextUtils.isEmpty(str) && str.contains(n)) {
            String d2 = com.safedk.android.utils.k.d(str, "i");
            Logger.d(b, "get ci by i query param - resource is vast event start, i query param= ", d2);
            if (!TextUtils.isEmpty(d2)) {
                CreativeInfo remove = f.remove(d2);
                if (remove != null && !a(b, remove, c)) {
                    Logger.d(b, "get ci by i query param - ci found by cid query param is not matched by media player, skip.");
                    return null;
                }
                return remove;
            }
        }
        return null;
    }

    public static void d(CreativeInfo creativeInfo, String str) {
        String o2 = com.safedk.android.utils.k.o(str);
        Logger.d(b, "save vast video urls to ci - ci id=", creativeInfo.L(), ", hash=", o2, ", video url= ", str);
        e(creativeInfo, o2);
    }

    private static void e(CreativeInfo creativeInfo, String str) {
        Logger.d(b, "store creative info by key started, videoUrlHash = ", str, ", ci = ", creativeInfo.aa());
        if (!TextUtils.isEmpty(str)) {
            Set<CreativeInfo> set = d.get(str);
            if (set == null) {
                set = new HashSet<>();
            }
            set.add(creativeInfo);
            synchronized (d) {
                d.put(str, set);
            }
            Logger.d(b, "store creative info by key - saving hash= ", str, ",  set size= ", Integer.valueOf(set.size()), ", ci= ", creativeInfo);
        }
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public String c(Object obj) {
        int identityHashCode = System.identityHashCode(obj);
        Logger.d(b, "get creative info after media player start call - mediaPlayer= ", obj, ", player id= ", Integer.valueOf(identityHashCode));
        Set<CreativeInfo> remove = c.remove(Integer.valueOf(identityHashCode));
        Logger.d(b, "get creative info after media player start call - mediaPlayer= ", obj, ", player id= ", Integer.valueOf(identityHashCode));
        if (remove != null && !remove.isEmpty()) {
            for (CreativeInfo creativeInfo : remove) {
                if (creativeInfo != null) {
                    if (this.J.containsKey(creativeInfo.L())) {
                        Logger.d(b, Logger.FeatureTag.CI_MATCHING, "get creative info after media player start call - found ci= ", creativeInfo.aa());
                        return creativeInfo.L();
                    }
                    Logger.d(b, "get creative info after media player start call - Id ", creativeInfo.L(), " is not in adIdToCreatives, skipping ");
                }
            }
        }
        Logger.d(b, "get creative info after media player start call - could not find ci");
        return null;
    }

    private static String D(String str) {
        if (!TextUtils.isEmpty(str)) {
            String[] split = str.split("/");
            if (split.length > 0) {
                String[] split2 = split[split.length - 1].split("\\.");
                if (split2.length > 0) {
                    return split2[0];
                }
                return null;
            }
            return null;
        }
        return null;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public void b(Object obj, Object obj2) {
        Logger.d(b, "handle media player set data source call - mediaPlayer = ", obj, ", videoFile = ", obj2);
        try {
            if (obj2 instanceof String) {
                String D = D((String) obj2);
                Logger.d(b, "handle media player set data source call - hash = ", D);
                if (!TextUtils.isEmpty(D)) {
                    Set<CreativeInfo> set = d.get(D);
                    Logger.d(b, "handle media player set data source call - ci set = ", set);
                    if (set != null) {
                        int identityHashCode = System.identityHashCode(obj);
                        Logger.d(b, "handle media player set data source call - playerId = ", Integer.valueOf(identityHashCode));
                        c.put(Integer.valueOf(identityHashCode), set);
                    }
                }
                String o2 = com.safedk.android.utils.k.o((String) obj2);
                Logger.d(b, "handle media player set data source call (sha1) - hash = ", o2);
                if (!TextUtils.isEmpty(o2)) {
                    Set<CreativeInfo> set2 = d.get(o2);
                    Logger.d(b, "handle media player set data source call (sha1) - ci set = ", set2);
                    if (set2 != null) {
                        int identityHashCode2 = System.identityHashCode(obj);
                        Logger.d(b, "handle media player set data source call (sha1) - playerId = ", Integer.valueOf(identityHashCode2));
                        c.put(Integer.valueOf(identityHashCode2), set2);
                    }
                }
            }
        } catch (Exception e2) {
            Logger.e(b, "handle media player set data source call - exception: ", e2);
        }
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public String a(String str, String str2, WeakReference<WebView> weakReference) {
        Logger.d(b, "get ad id from resource - source = ", str2, ", keys = ", e.keySet());
        if (!TextUtils.isEmpty(str2)) {
            CreativeInfo creativeInfo = e.get(str2);
            if (creativeInfo != null) {
                Logger.d(b, Logger.FeatureTag.CI_MATCHING, "get ad id from resource - found by src value? ci= ", creativeInfo);
                return creativeInfo.L();
            }
            CreativeInfo C = C(str2);
            if (C != null) {
                Logger.d(b, Logger.FeatureTag.CI_MATCHING, "get ad id from resource - found by i query param? ci= ", C);
                return C.L();
            }
        }
        Logger.d(b, "get ad id from resource - could not find ci");
        return null;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d
    protected String a(String str, CreativeInfo creativeInfo) {
        Logger.d(b, "handle vast media file - ci id = ", creativeInfo.L(), ", video url= ", str);
        d(creativeInfo, str);
        return null;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d
    protected boolean B(String str) {
        if (e.containsKey(str)) {
            Logger.d(b, "should follow get url impl - url is src, return true. url= ", str);
            return true;
        }
        if (TextUtils.isEmpty(str) || !str.contains(n)) {
            return false;
        }
        Logger.d(b, "should follow get url impl - url is vast wrapper, return true. url= ", str);
        return true;
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
    public void b(WebView webView, String str) {
        Logger.d(b, "handle webview response - webview= ", webView, ", url= ", str);
        if (!TextUtils.isEmpty(str) && str.startsWith(o)) {
            String m2 = m(str);
            if (TextUtils.isEmpty(m2)) {
                Logger.d(b, "handle webview response - url doesn't have 'url' query param, skipping");
                return;
            }
            RedirectDetails.RedirectType l2 = l(str);
            Logger.d(b, "handle webview response - type= ", l2);
            if (l2 != null) {
                Logger.d(b, "handle webview response - calling handle redirect (RedirectDetails)");
                BrandSafetyUtils.a(com.safedk.android.utils.h.E, webView, m2, l2, "OnWebViewResponse");
            }
        }
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public RedirectDetails.RedirectType l(String str) {
        if (str != null) {
            if (str.startsWith(o)) {
                if (str.contains(p)) {
                    return RedirectDetails.RedirectType.EXPAND;
                }
                if (str.contains(q)) {
                    return RedirectDetails.RedirectType.REDIRECT;
                }
            }
            for (String str2 : V) {
                if (str.startsWith(str2)) {
                    return null;
                }
            }
        }
        return RedirectDetails.RedirectType.REDIRECT;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public String m(String str) {
        if (str != null && str.startsWith(o)) {
            return com.safedk.android.utils.k.d(str, "url");
        }
        return str;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public void g(String str, String str2) {
        Logger.d(b, "onVideoKeyAndUrlPairCreated started, localFileCacheKey = ", str, ", remoteUrl = ", str2);
        synchronized (d) {
            for (Set<CreativeInfo> set : d.values()) {
                synchronized (set) {
                    for (CreativeInfo creativeInfo : set) {
                        Logger.d(b, "onVideoKeyAndUrlPairCreated checking ci with video url ", creativeInfo.H());
                        if ((creativeInfo.H() != null && creativeInfo.H().equals(str2)) || (creativeInfo.r() != null && creativeInfo.r().contains(str2))) {
                            Logger.d(b, "onVideoKeyAndUrlPairCreated found ci with video url ", creativeInfo.H());
                            CreativeInfoManager.a(creativeInfo, CreativeInfo.k);
                            d.remove(str);
                            break;
                        }
                    }
                }
            }
        }
    }
}
