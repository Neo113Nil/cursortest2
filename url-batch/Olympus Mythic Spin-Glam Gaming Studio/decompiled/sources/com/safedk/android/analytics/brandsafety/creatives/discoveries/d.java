package com.safedk.android.analytics.brandsafety.creatives.discoveries;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import com.safedk.android.SafeDK;
import com.safedk.android.analytics.brandsafety.BannerFinder;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.RedirectDetails;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.analytics.brandsafety.creatives.b;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import com.safedk.android.analytics.brandsafety.creatives.h;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import com.safedk.android.analytics.brandsafety.m;
import com.safedk.android.analytics.brandsafety.v;
import com.safedk.android.analytics.events.BrandSafetyEvent;
import com.safedk.android.internal.SafeDKWebAppInterface;
import com.safedk.android.utils.LimitedConcurrentHashMap;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.PersistentConcurrentHashMap;
import com.safedk.android.utils.SdksMapping;
import com.safedk.android.utils.SimpleConcurrentHashSet;
import java.io.BufferedReader;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.net.URL;
import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.slf4j.Marker;

/* loaded from: classes14.dex */
public abstract class d implements AdNetworkDiscovery {
    public static final String A = "@!1:ad_fetch@!";
    public static final String B = "<title>Unity Ads WebView</title>";
    public static final long C = 1200000;
    public static final long D = 600000;
    protected static final String H = "extra_url";
    private static final String b = "BaseDiscovery";
    private static final String c = "Liftoff.init";
    private static final String d = "LiftoffOuterEnv.init";
    private static final String e = "privacyButtonClick";
    private static final int j = 30;
    public static final String r = "com.applovin.mediation.nativeAds.MaxNativeAdView";
    public static final String s = "onDataLoadedToWebView";
    public static final String t = "onResourceLoaded";
    public static final String u = "https://";
    public static final String v = "http://";
    protected static final String w = "mraid://tpat?event";
    protected static final String x = "checkpoint.0";
    protected static final String y = "checkpoint.100";
    protected static final String z = "video.close";
    protected b E;
    protected ConcurrentHashMap<com.safedk.android.analytics.brandsafety.creatives.i, CreativeInfo> F;
    protected Set<String> G;
    protected String I;
    protected Map<String, CreativeInfo> J;
    protected Map<String, List<CreativeInfo>> K;
    protected Map<Integer, CreativeInfo> L;
    protected Map<String, CreativeInfo> M;
    protected Map<String, String> N;
    protected final ScheduledExecutorService O;
    protected final Map<com.safedk.android.analytics.brandsafety.creatives.i, ScheduledFuture<?>> P;
    protected final Map<com.safedk.android.analytics.brandsafety.d, WeakReference<View>> Q;
    protected final Map<String, WeakReference<WebView>> R;
    protected final Map<Integer, CreativeInfo> S;
    protected Set<String> T;
    protected String U;
    private final Map<String, Set<String>> g;
    private v h;
    private v i;
    private String l;
    private static final Map<String, ArrayList<String>> f = new HashMap();
    private static final Map<String, WeakReference<WebView>> k = new LimitedConcurrentHashMap(30);

    protected abstract boolean B(String str);

    protected abstract String a(String str, CreativeInfo creativeInfo);

    protected abstract List<CreativeInfo> a(String str, String str2, Map<String, List<String>> map, c.a aVar, byte[] bArr) throws JSONException;

    protected abstract boolean b(String str, Bundle bundle);

    private void h() {
        b bVar = new b();
        this.E = bVar;
        bVar.b(AdNetworkConfiguration.SUPPORTS_PREFETCH_RECEIVING_BY_APPLOVIN, false);
        this.E.b(AdNetworkConfiguration.SHOULD_DECODE_EXTRACTED_EXPRESSIONS_FROM_VAST, true);
        this.E.b(AdNetworkConfiguration.SHOULD_UPDATE_CREATIVE_INFO_FROM_VAST, true);
        this.E.b(AdNetworkConfiguration.SUPPORTS_GZIP_CONTENT, false);
        this.E.b(AdNetworkConfiguration.SUPPORTS_JAVASCRIPT_BASED_VIDEO_STATE_DETECTION, false);
        this.E.a(AdNetworkConfiguration.BITMAP_SCAN_TOP_MARGIN_PERCENT, 0.15f);
        this.E.a(AdNetworkConfiguration.BITMAP_SCAN_RIGHT_MARGIN_PERCENT, 0.15f);
        this.E.a(AdNetworkConfiguration.BITMAP_SCAN_LEFT_MARGIN_PERCENT, 0.15f);
        this.E.a(AdNetworkConfiguration.BITMAP_SCAN_BOTTOM_MARGIN_PERCENT, 0.15f);
        this.E.b(AdNetworkConfiguration.BITMAP_SCAN_SHOULD_CHECK_FOR_GREYSCALE, false);
        this.E.b(AdNetworkConfiguration.ENFORCE_CLOSE_INPUT_STREAM_VAST_IN_VAST, false);
        this.E.b(AdNetworkConfiguration.ENFORCE_CLOSE_INPUT_STREAM, false);
        this.E.b(AdNetworkConfiguration.SUPPORTS_BANNER_IMPRESSION_TRACKING, false);
        this.E.b(AdNetworkConfiguration.SUPPORTS_MREC_IMPRESSION_TRACKING, false);
        this.E.b(AdNetworkConfiguration.SUPPORTS_NATIVE_IMPRESSION_TRACKING, false);
        this.E.b(AdNetworkConfiguration.SUPPORTS_JAVASCRIPT_BASED_PRIVACY_BUTTON_CLICK_DETECTION_IN_FULLSCREEN_ADS, true);
        this.E.b(AdNetworkConfiguration.SUPPORTS_JAVASCRIPT_BASED_PRIVACY_BUTTON_CLICK_DETECTION_IN_MRECS, false);
        this.E.b(AdNetworkConfiguration.SUPPORTS_JAVASCRIPT_BASED_PRIVACY_BUTTON_CLICK_DETECTION_IN_BANNERS, false);
        this.E.b(AdNetworkConfiguration.AVOID_CLEANING_PENDING_CI_LIST_ON_AD_END, false);
        this.E.b(AdNetworkConfiguration.SUPPORTS_BIDDING_INTERSTITIAL_IMPRESSION_MATCHING_BY_MAX, false);
        this.E.b(AdNetworkConfiguration.SHOULD_EXTRACT_AD_ID_FROM_BANNER_WEB_VIEW, false);
        this.E.b(AdNetworkConfiguration.AD_ID_EXTRACTED_FROM_BANNER_WEB_VIEW_IS_MAX_CREATIVE_ID, false);
        this.E.b(AdNetworkConfiguration.USE_WEBVIEW_LOADURL_AS_RESOURCE_LOADED_INDICATION, false);
        this.E.b(AdNetworkConfiguration.USE_INPUT_STREAM_EVENT_AS_RESOURCE_LOADED_INDICATION, false);
        this.E.b(AdNetworkConfiguration.SDK_USES_PLACEMENT_ID_ARRAY, false);
        this.E.b(AdNetworkConfiguration.AD_NETWORK_SUPPORTS_PREFETCH_REUSE, false);
        this.E.b(AdNetworkConfiguration.AD_NETWORK_SUPPORTS_BANNER_MULTIPLE_WEBVIEWS, false);
        this.E.b(AdNetworkConfiguration.SDK_INTERSTITIALS_RUN_ON_APP_ACTIVITY, false);
        this.E.b(AdNetworkConfiguration.SDK_CUSTOM_VIEW_TYPE_NAME, (String) null);
        this.E.a(AdNetworkConfiguration.SDK_SPECIFIC_MIN_UNIFORM_PIXELS_PERCENTAGE_FOR_UNIFORM_IMAGE, SafeDK.getInstance().H());
        String str = this.l;
        Logger.d(str, "SDK_SPECIFIC_MIN_UNIFORM_PIXELS_PERCENTAGE_FOR_UNIFORM_IMAGE setting set for ", str, ", value = ", Float.valueOf(SafeDK.getInstance().H()));
        this.E.b(AdNetworkConfiguration.AD_NETWORK_INTERNAL_BROWSER_OPENS_IN_SAME_ACTIVITY, false);
        this.E.b(AdNetworkConfiguration.SHOULD_SCAN_OBJECT_USING_REFLECTION, false);
        this.E.b(AdNetworkConfiguration.AD_NETWORK_TO_IGNORE, (String) null);
        this.E.a(AdNetworkConfiguration.SDK_SPECIFIC_CACHED_CI_MAX_AGE, 1200000L);
        this.E.b(AdNetworkConfiguration.SDK_SPECIFIC_CACHED_CI_EXPIRATION, true);
        this.E.a(AdNetworkConfiguration.SDK_SPECIFIC_CACHED_CI_THRESHOLD, SafeDK.getInstance().U());
        this.E.b(AdNetworkConfiguration.APP_OPEN_IMPRESSION_TRACKING_ENABLED, false);
        this.E.b(AdNetworkConfiguration.SHOULD_SCAN_INTERSTITIAL_VIEW_HIERARCHY_FOR_CI, false);
        this.E.b(AdNetworkConfiguration.DETECT_MULTIPLE_ADS_BY_WEB_VIEW_CHANGE, false);
        this.E.b(AdNetworkConfiguration.SHOULD_USE_EARLY_VAST_AD_TAG_URI_PARSING, false);
        this.E.b(AdNetworkConfiguration.SUPPORTS_MREC_IMPRESSION_EOV, false);
        this.E.b(AdNetworkConfiguration.SUPPORTS_AUTO_REDIRECTS_IDENTIFICATION, false);
        this.E.b(AdNetworkConfiguration.SUPPORTS_EXPANDED_ADS_IDENTIFICATION, false);
        this.E.b(AdNetworkConfiguration.SUPPORTS_EXPANDED_ADS_IDENTIFICATION_BY_MAX_EVENT, false);
        this.E.b(AdNetworkConfiguration.SHOULD_REPORT_AD_ID_ON_CI_CREATION, true);
        this.E.b(AdNetworkConfiguration.SHOULD_INJECT_JS_TO_WEBVIEWS_NOT_YET_ATTACHED_TO_ACTIVITY, false);
        this.E.b(AdNetworkConfiguration.SUPPORTS_NATIVE_BANNERS_USING_BANNER_KEY, false);
        this.E.b(AdNetworkConfiguration.SHOULD_EXTRACT_TEXT_FROM_NATIVE_BANNERS, false);
        this.E.b(AdNetworkConfiguration.SHOULD_EXTRACT_TEXT_FROM_NATIVE_BANNERS, false);
        this.E.a(AdNetworkConfiguration.NUMBER_OF_VIEWS_REMOVED_IN_FULL_SCREEN_AD_THAT_INDICATES_EOV, 0L);
        this.E.b(AdNetworkConfiguration.REPLACE_PREFETCH_CREATIVE_ID_WITH_MAX_CREATIVE_ID, false);
        this.E.b(AdNetworkConfiguration.REPLACE_PREFETCH_CREATIVE_ID_WITH_MAX_CREATIVE_ID_MAX_NETWORK_NAMES, (String) null);
        this.E.b(AdNetworkConfiguration.SHOULD_IGNORE_BANNER_MULTI_AD_DID_CLICK_EVENT, false);
        this.E.b(AdNetworkConfiguration.SET_AD_FORMAT_FROM_APPLOVIN_BUNDLE, false);
        this.E.a(AdNetworkConfiguration.FULL_SCREEN_CI_MAX_AGE, 1200000L);
        this.E.a(AdNetworkConfiguration.BANNER_CI_MAX_AGE, 600000L);
        this.E.b(AdNetworkConfiguration.SHOULD_INJECT_JS_TO_WEBVIEWS_FOR_TEXT_EXTRACTION, true);
        this.E.b(AdNetworkConfiguration.DONT_USE_PLACEMENT_ID_IN_BANNER_AD_INFO_KEY, "");
        this.E.b(AdNetworkConfiguration.DONT_REPORT_WEBVIEW_RESOURCE_LIST_IF_NO_CI, false);
        this.E.b(AdNetworkConfiguration.WEBVIEW_REPLACE_ON_AD_DISPLAY_FAIL, false);
        this.E.b(AdNetworkConfiguration.SHOULD_DECODE_AD_TAG_TWICE, false);
        this.E.b(AdNetworkConfiguration.DO_NOT_ADD_CI_TO_FINDER_PENDING_CI_LIST, false);
        this.E.b(AdNetworkConfiguration.NOTIFY_DISCOVERY_CLASS_ABOUT_FULL_SCREEN_MATCHING, false);
        this.E.b(AdNetworkConfiguration.SHOULD_DECODE_URLS_IN_CLICK_URL_RESOLUTION, true);
        this.E.b(AdNetworkConfiguration.AVOID_MATCHING_CI_FROM_BANNER_WEB_VIEW_BEFORE_SCANNING, false);
        this.E.b(AdNetworkConfiguration.MATCH_ON_BANNER_WEBVIEW_DETECTION, false);
        this.E.b(AdNetworkConfiguration.SHOULD_DELAY_BANNER_VIEWS_SCANNER, false);
        this.E.b(AdNetworkConfiguration.SHOULD_ALLOW_CI_MATCHING_WITH_INCOMPATIBLE_EVENT_IDS, false);
        this.E.b(AdNetworkConfiguration.SHOULD_ALLOW_REFLECTION_ON_OS_CLASSES, false);
        this.E.b(AdNetworkConfiguration.SHOULD_VIDEO_OBSERVER_TRAVERSE_IFRAMES, false);
        this.E.b(AdNetworkConfiguration.SHOULD_GET_HTML_TEXT_TRAVERSE_IFRAMES, false);
        this.E.b(AdNetworkConfiguration.SHOULD_USE_RESOURCES_COLLECTION_SCRIPT_FULLSCREEN, true);
        this.E.b(AdNetworkConfiguration.SHOULD_USE_RESOURCES_COLLECTION_SCRIPT_BANNERS, true);
        this.E.b(AdNetworkConfiguration.SUPPORTS_DIFFERENT_ADS_IN_CROSS_ORIGIN_IFRAMES, false);
        this.E.b(AdNetworkConfiguration.CLEAR_FULLSCREEN_PENDING_CANDIDATES_ON_DID_FAIL_DISPLAY, false);
        this.E.b(AdNetworkConfiguration.SUPPORTS_MEDIA_PLAYER_RELEASE_EOV, false);
        this.E.b(AdNetworkConfiguration.STORE_DECODED_QUESTION_MARK_IN_VIV_URL_LIST, false);
        this.E.a(AdNetworkConfiguration.MREC_SCREENSHOT_TAKING_DELAY, 0L);
        this.E.b(AdNetworkConfiguration.VAST_URL_QUERY_PARAMS_TO_IGNORE, (String) null);
        this.E.b(AdNetworkConfiguration.DOWNLOAD_INNER_VAST_URL_IF_NOT_LOADED, false);
        this.E.b(AdNetworkConfiguration.SHOULD_CAPTURE_SURFACE_VIEW_WHEN_USING_PIXELCOPY, false);
        this.E.b(AdNetworkConfiguration.SHOULD_CALL_RESOURCE_LOADED_FROM_SHOULD_INTERCEPT_REQUEST, false);
        this.E.b(AdNetworkConfiguration.PRINT_WEB_VIEW_CONTENTS_ON_HTML_LOAD, true);
        this.E.b(AdNetworkConfiguration.SUPPORT_WEBVIEW_COMMENT_EXTRACTION, false);
        this.E.b(AdNetworkConfiguration.SHOULD_ADD_BYTE_ARRAY_AS_PARAM_ON_AD_FETCHED, false);
        this.E.b(AdNetworkConfiguration.SHOULD_DECODE_BASE64_PREFECT_RECEIVED_BY_APPLOVIN, false);
        this.E.b(AdNetworkConfiguration.INJECT_SCRIPTS_IF_URL_IS_NULL, false);
        this.E.b(AdNetworkConfiguration.SHOULD_REPORT_VAST_ID_AS_CREATIVE_ID, false);
        this.E.b(AdNetworkConfiguration.ALLOW_FULL_SCREEN_MULTI_CLICK_URL_UPDATES, false);
        this.E.b(AdNetworkConfiguration.FULLSCREEN_NEXT_BUTTON_TAG, (String) null);
        this.E.b(AdNetworkConfiguration.FULL_SCREEN_MULTI_VIEW_TAG_AD_SPECIFIC, (String) null);
        this.E.b(AdNetworkConfiguration.SHOULD_CHECK_ACTIVITY_CLICK_FOR_REDIRECTS, false);
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public void b(CreativeInfo creativeInfo) {
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public boolean a(String str, Bundle bundle) {
        String A2 = com.safedk.android.utils.n.A(str);
        E(str);
        boolean z2 = b(new com.safedk.android.analytics.brandsafety.creatives.i(A2)) || b(new com.safedk.android.analytics.brandsafety.creatives.i(str));
        boolean z3 = z2 || l.a(str) || b(str, bundle);
        if (z3) {
            Logger.d(this.l, "should follow input stream ? ", Boolean.valueOf(z3), ", vast? ", Boolean.valueOf(z2), ", url=", str);
        }
        return z3;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public boolean g(String str) {
        return false;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public boolean b(String str, String str2) {
        E(str);
        boolean contains = this.G.contains(str);
        boolean z2 = contains || B(str);
        Logger.d(this.l, "should follow get url? ", Boolean.valueOf(z2), ", vast media? ", Boolean.valueOf(contains), " url=", str, " webviewAddress=", str2);
        return z2;
    }

    protected void E(String str) {
        Set<String> b2 = b(str, c());
        if (b2 != null && b2.size() > 0) {
            str = a(str, b2);
            Logger.d(this.l, "trigger video completed event - event url without query params=", str);
        }
        if (this.T.remove(str)) {
            Logger.d(this.l, "Video completed event sdk=", this.U, ", source ", str);
            SafeDK safeDK = SafeDK.getInstance();
            if (safeDK != null && safeDK.z() != null) {
                safeDK.z().f(this.U, "url-event");
            }
        }
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public void a(v vVar) {
        this.h = vVar;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public void b(v vVar) {
        this.i = vVar;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public List<CreativeInfo> a(String str, String str2, byte[] bArr, Map<String, List<String>> map, c.a aVar) {
        if (str2 != null) {
            try {
                if (str2.length() != 0) {
                    CreativeInfo C2 = C(str);
                    if (C2 == null) {
                        String J = J(str);
                        Logger.printFullVerboseLog(this.l, "decoded URL: ", J);
                        CreativeInfo C3 = C(J);
                        if (C3 == null) {
                            String replace = J.replace("(%20|+)", " ");
                            if (!replace.equals(J)) {
                                Logger.d(this.l, "decoded URL with spaces: ", replace);
                                C2 = C(replace);
                            }
                        }
                        C2 = C3;
                    }
                    if (C2 != null) {
                        a(C2, str, str2, true);
                        Logger.d(this.l, "vast processing was done in base.");
                        C2.h(false);
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(C2);
                        c(C2);
                        return arrayList;
                    }
                    l.b(this.U, str, str2);
                    List<CreativeInfo> a = a(str, str2, map, aVar, bArr);
                    if ((a == null || a.isEmpty()) && com.safedk.android.analytics.brandsafety.creatives.h.b(str2)) {
                        this.N.put(str, str2);
                        this.N.put(J(str), str2);
                    }
                    if (a != null && !a.isEmpty()) {
                        for (CreativeInfo creativeInfo : a) {
                            Logger.d(this.l, Logger.FeatureTag.PREFETCH, "ci saved id=", creativeInfo.L(), ", is multi ad? ", Boolean.valueOf(creativeInfo.an()), ", video url=", creativeInfo.H());
                            if (d(creativeInfo)) {
                                n(creativeInfo.L());
                            }
                            if (this.h != null) {
                                Logger.d(this.l, "Calling event listener onPrefetchReceived for ", this.U);
                                this.h.a(this.U, str2, creativeInfo.n() != null ? creativeInfo.n() : creativeInfo.L());
                            }
                            a(aVar, str2, creativeInfo);
                        }
                        i();
                    }
                    return a;
                }
            } catch (Throwable th) {
                Logger.d(this.l, "generate info error parsing. msg: ", th.getMessage(), th);
                return null;
            }
        }
        return null;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public String f(String str) {
        if (this.i != null && A(str)) {
            Logger.d(this.l, "Calling event listener shouldOverridePrefetch for ", this.U);
            return this.i.a(this.U);
        }
        return null;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public boolean A(String str) {
        return false;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public void c(CreativeInfo creativeInfo) {
        HashSet<String> u2 = creativeInfo.u();
        Logger.printFullVerboseLog(this.l, "handle previously saved vast ad tag uri - ci VastAdTagUri list= ", u2);
        if (u2 != null) {
            int size = u2.size();
            Iterator<String> it = u2.iterator();
            while (it.hasNext()) {
                String next = it.next();
                String remove = this.N.remove(next);
                if (remove == null) {
                    remove = this.N.remove(J(next));
                }
                Logger.d(this.l, "handle previously saved vast ad tag uri - vastAdTagUriValue found?=", remove);
                if (remove != null) {
                    Logger.d(this.l, "handle previously saved vast ad tag uri - vastAdTagUriValue found, updating vast ci");
                    a(creativeInfo, next, remove, true);
                }
            }
            if (size < u2.size()) {
                c(creativeInfo);
            }
        }
    }

    private CreativeInfo C(String str) {
        CreativeInfo remove;
        com.safedk.android.analytics.brandsafety.creatives.i c2 = c(new com.safedk.android.analytics.brandsafety.creatives.i(str));
        if (!this.F.containsKey(c2)) {
            return null;
        }
        Logger.d(this.l, "vasts redirect url found: ", str);
        synchronized (this.F) {
            remove = this.F.remove(c2);
        }
        a(c2);
        ScheduledFuture<?> remove2 = this.P.remove(c2);
        if (remove2 != null) {
            Logger.d(this.l, "canceling vast ad url timer. url: ", c2);
            remove2.cancel(true);
            return remove;
        }
        return remove;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public List<CreativeInfo> a(WeakReference<View> weakReference, String str, BrandSafetyUtils.AdType adType) {
        return null;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public CreativeInfo a(Object obj) {
        CreativeInfo N;
        if ((obj instanceof String) && (N = N((String) obj)) != null) {
            return N;
        }
        return b(obj);
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public CreativeInfo b(Object obj) {
        return null;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public String a(String str, String str2, WeakReference<WebView> weakReference) {
        return c(str, str2);
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public String c(String str, String str2) {
        return null;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public void a(Object obj, Object obj2) {
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public Pair<String, List<String>> a(Set<String> set) {
        return null;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public int i(String str) {
        return 0;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public void d(String str, String str2) {
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public void a(FileInputStream fileInputStream, String str) {
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public boolean a() {
        return false;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public void b(Object obj, Object obj2) {
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public String c(Object obj) {
        return null;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public void a(FileInputStream fileInputStream, FileDescriptor fileDescriptor) {
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public String a(String str, String str2, byte[] bArr) {
        return null;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public void c(View view) {
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public void d(View view) {
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public AdNetworkDiscovery.WebViewResourceMatchingMethod b() {
        return AdNetworkDiscovery.WebViewResourceMatchingMethod.DEFAULT;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public boolean e(View view) {
        if (!BannerFinder.c(view)) {
            return false;
        }
        Logger.d(this.l, "is ad view: ", view.getClass().getName(), " is an instance of a Max native ad view", ", isOnUiThread = ", Boolean.valueOf(com.safedk.android.utils.n.c()));
        return true;
    }

    public static String F(String str) {
        String str2;
        String str3 = null;
        try {
            if (str.contains(c) && (str3 = a(com.safedk.android.utils.g.a("pinpoint_url\\\":\\\"([^\\\"]+)\""), str)) == null) {
                str3 = a(com.safedk.android.utils.g.a("click_config\\\":\\{\\\"clickthrough_url\\\":\\{\\\"url\\\":\\\"([^\\\"]+)\\\""), str);
            }
            if (str.contains(d) && (str3 = a(com.safedk.android.utils.g.a("\\{\\\"clickURLs\\\":\\{\\\"clickthroughURL\\\":\\{\\\"url\\\":\\\"([^\\\"]+)\\\""), str)) != null) {
                Logger.d(b, d, " url found : ", str3);
            }
            str2 = com.safedk.android.utils.n.z(str3);
        } catch (Throwable th) {
            Logger.d(b, "Exception while getting click_url from dsp ad : ", th.getMessage(), th);
            str2 = str3;
        }
        if (str2 == null || str2.isEmpty()) {
            str2 = a(com.safedk.android.utils.g.a("OMG\\s+=\\s+.+\"clickUrl\".+?\"(.+?)\""), str);
        }
        return com.safedk.android.utils.n.z(str2);
    }

    protected String G(String str) {
        if (!str.contains(c)) {
            return null;
        }
        String a = a(com.safedk.android.utils.g.a("bidBundle\\\":\\\"([^\\\"]+)\\\""), str);
        Logger.d(this.l, "packageName updated : ", a);
        return a;
    }

    protected static String a(Pattern pattern, String str) {
        try {
            Matcher matcher = pattern.matcher(str);
            if (matcher.find() && matcher.groupCount() > 0) {
                Logger.d(b, "extract substring via pattern found pattern=", pattern, " , value = ", matcher.group(1));
                return matcher.group(1);
            }
            return null;
        } catch (Throwable th) {
            Logger.d(b, "Exception while extracting with regex : ", th.getMessage(), ", pattern : ", pattern, th);
            return null;
        }
    }

    protected boolean a(CreativeInfo creativeInfo, h.a aVar, String str) {
        return a(creativeInfo, aVar, str, (String) null);
    }

    protected boolean a(final CreativeInfo creativeInfo, final h.a aVar, String str, String str2) {
        if (aVar == null || creativeInfo == null) {
            return false;
        }
        Logger.printFullVerboseLog(this.l, "updating vast, url : ", str, ", CI: ", creativeInfo.aa(), ", vast ad info: ", aVar);
        if (str2 == null) {
            creativeInfo.a("vst", new m.a[0]);
        } else {
            creativeInfo.a("vst", new m.a(com.safedk.android.analytics.brandsafety.m.K, str2));
        }
        creativeInfo.I(aVar.t());
        boolean z2 = !creativeInfo.z();
        creativeInfo.b(true);
        if (z2) {
            String c2 = aVar.c();
            if (c2 != null) {
                creativeInfo.l(c2);
                if (this.E.b(AdNetworkConfiguration.SHOULD_REPORT_VAST_ID_AS_CREATIVE_ID)) {
                    creativeInfo.k(c2);
                }
            }
            String d2 = aVar.d();
            if (d2 != null) {
                creativeInfo.o(d2);
            }
            List<String> i = aVar.i();
            if (i != null) {
                for (String str3 : i) {
                    if (com.safedk.android.analytics.brandsafety.creatives.g.a(creativeInfo.Q(), str3)) {
                        Logger.d(this.l, "adding impression url to dsp domains : ", str3);
                        creativeInfo.x(str3);
                    }
                }
            } else {
                Logger.d(this.l, "impression list is empty");
            }
            List<String> p = aVar.p();
            if (p != null) {
                for (String str4 : p) {
                    if (com.safedk.android.analytics.brandsafety.creatives.g.a(creativeInfo.Q(), str4)) {
                        Logger.d(this.l, "adding video tracking event url to dsp domains : ", str4);
                        creativeInfo.x(str4);
                    }
                    c(creativeInfo, str4);
                }
            } else {
                Logger.d(this.l, "No video tracking events");
            }
            List<String> q = aVar.q();
            if (q != null) {
                for (String str5 : q) {
                    if (com.safedk.android.analytics.brandsafety.creatives.g.a(creativeInfo.Q(), str5)) {
                        Logger.d(this.l, "adding click tracking url to dsp domains : ", str5);
                        creativeInfo.x(str5);
                    }
                }
            } else {
                Logger.d(this.l, "no click tracking urls");
            }
            List<String> r2 = aVar.r();
            if (r2 != null) {
                for (String str6 : r2) {
                    if (com.safedk.android.analytics.brandsafety.creatives.g.a(creativeInfo.Q(), str6)) {
                        Logger.d(this.l, "adding companion click tracking url to dsp domains : ", str6);
                        creativeInfo.x(str6);
                    }
                }
            } else {
                Logger.d(this.l, "no companion click tracking urls");
            }
        }
        String e2 = aVar.e();
        if (e2 != null) {
            String replace = e2.replace(Marker.ANY_NON_NULL_MARKER, "%2B");
            String A2 = com.safedk.android.utils.n.A(e2);
            String A3 = com.safedk.android.utils.n.A(replace);
            Logger.printFullVerboseLog(this.l, "following vast uri: ", A2);
            Logger.printFullVerboseLog(this.l, "following vast uri (replaced plus): ", A3);
            com.safedk.android.analytics.brandsafety.creatives.f fVar = new com.safedk.android.analytics.brandsafety.creatives.f(e2);
            final com.safedk.android.analytics.brandsafety.creatives.f fVar2 = new com.safedk.android.analytics.brandsafety.creatives.f(A2);
            com.safedk.android.analytics.brandsafety.creatives.f fVar3 = new com.safedk.android.analytics.brandsafety.creatives.f(A3);
            synchronized (this.F) {
                this.F.put(fVar, creativeInfo);
                this.F.put(fVar2, creativeInfo);
                this.F.put(fVar3, creativeInfo);
            }
            com.safedk.android.analytics.brandsafety.creatives.h.p.remove(fVar);
            com.safedk.android.analytics.brandsafety.creatives.h.p.remove(fVar2);
            com.safedk.android.analytics.brandsafety.creatives.h.p.remove(fVar3);
            a(str, (com.safedk.android.analytics.brandsafety.creatives.i) fVar);
            a(str, (com.safedk.android.analytics.brandsafety.creatives.i) fVar2);
            a(str, (com.safedk.android.analytics.brandsafety.creatives.i) fVar3);
            Logger.d(this.l, "adding vast ad url to list. url: ", fVar2, ", ci: ", creativeInfo.aa());
            creativeInfo.C(e2);
            if (!z2 && this.E.b(AdNetworkConfiguration.DOWNLOAD_INNER_VAST_URL_IF_NOT_LOADED)) {
                Logger.d(this.l, "adding vast ad url timer. url: ", fVar2);
                this.P.put(fVar2, this.O.schedule(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.creatives.discoveries.d.1
                    @Override // java.lang.Runnable
                    public void run() {
                        Logger.d(d.this.l, "timeout of vast ad url timer. url: ", fVar2);
                        String e3 = aVar.e();
                        String M = d.this.M(e3);
                        Logger.printFullVerboseLog(d.this.l, "get vast info - ad tag uri content: ", M);
                        if (!TextUtils.isEmpty(M)) {
                            d.this.a(creativeInfo, com.safedk.android.analytics.brandsafety.creatives.h.a(M, true, d.this.U), e3, "manual");
                        }
                    }
                }, 5L, TimeUnit.SECONDS));
            }
        } else {
            String a = aVar.a();
            String b2 = aVar.b();
            if (a != null) {
                creativeInfo.a(a, true);
                Logger.d(this.l, "will update click url: ", a);
            } else {
                Logger.d(this.l, "click url is empty");
            }
            if (b2 != null && !aVar.s()) {
                creativeInfo.p(b2);
                Logger.d(this.l, "will update video url : ", b2);
                if (com.safedk.android.utils.n.i(b2)) {
                    String j2 = com.safedk.android.utils.n.j(b2);
                    Logger.d(this.l, "google video added : ", j2);
                    this.G.add(j2);
                } else {
                    Logger.d(this.l, "video added : ", b2);
                    a(b2, creativeInfo);
                    this.G.add(b2);
                }
            } else {
                Logger.d(this.l, "video url is empty");
            }
            List<String> j3 = aVar.j();
            Logger.d(this.l, "vast prefetchResourceUrls : ", j3);
            if (j3 != null) {
                for (String str7 : j3) {
                    Logger.d(this.l, "vast prefetchResourceUrls item : ", j3);
                    String a2 = a(str7, creativeInfo);
                    if (a2 != null) {
                        Logger.d(this.l, "will add follow url : ", a2);
                        this.G.add(a2);
                    }
                }
                creativeInfo.b(j3);
            } else {
                Logger.d(this.l, "no prefetch resource urls");
            }
            List<String> k2 = aVar.k();
            creativeInfo.c(k2);
            Logger.d(this.l, "added static resource : ", k2);
            List<String> l = aVar.l();
            creativeInfo.c(l);
            Logger.d(this.l, "added script resource : ", l);
            List<String> m = aVar.m();
            creativeInfo.c(m);
            Logger.d(this.l, "added html resource : ", m);
            a(creativeInfo, aVar.n());
            if (aVar.s()) {
                creativeInfo.ae();
                Logger.d(this.l, "set params ", aVar.f());
                creativeInfo.F(aVar.f());
            }
            List<String> p2 = aVar.p();
            if (p2 != null) {
                Iterator<String> it = p2.iterator();
                while (it.hasNext()) {
                    c(creativeInfo, it.next());
                }
            }
            List<String> h = aVar.h();
            if (h != null) {
                Logger.d(this.l, "vast media list contains ", h.toString());
                for (String str8 : h) {
                    Logger.d(this.l, "vast media list item : ", str8);
                    String a3 = a(str8, creativeInfo);
                    if (a3 != null) {
                        Logger.d(this.l, "will add followUrl : ", a3);
                        this.G.add(a3);
                    }
                }
                creativeInfo.c(h);
            } else {
                Logger.d(this.l, "no prefetch resource urls");
            }
            Logger.printFullVerboseLog(this.l, "updated vast CI = ", creativeInfo.aa());
        }
        return true;
    }

    protected void a(String str, com.safedk.android.analytics.brandsafety.creatives.i iVar) {
    }

    protected void a(com.safedk.android.analytics.brandsafety.creatives.i iVar) {
    }

    protected String a(String str, Set<String> set) {
        if (set != null && set.size() > 0) {
            Iterator<String> it = set.iterator();
            while (it.hasNext()) {
                str = com.safedk.android.utils.k.f(str, it.next());
            }
        }
        return str;
    }

    private static String h(String str, String str2) {
        return str.replaceAll("([?&;]+)(" + str2 + "=.*?)(&|$|;)", "$1");
    }

    protected Set<String> b(String str, Set<String> set) {
        if (set == null || set.size() == 0) {
            return new HashSet();
        }
        HashSet hashSet = new HashSet();
        Map<String, String> a = com.safedk.android.utils.k.a(str, false);
        if (a != null) {
            for (Map.Entry<String, String> entry : a.entrySet()) {
                if (set.contains(entry.getValue())) {
                    Logger.d(this.l, "identified macro : ", entry.getValue());
                    hashSet.add(entry.getKey());
                }
            }
        }
        if (hashSet.size() > 0) {
            Logger.d(this.l, "query params to ignore are ", hashSet);
        }
        return hashSet;
    }

    protected h.a a(CreativeInfo creativeInfo, String str, String str2, boolean z2) {
        boolean b2 = CreativeInfoManager.l ? true : CreativeInfoManager.k(creativeInfo.Q()).b(AdNetworkConfiguration.SHOULD_DECODE_EXTRACTED_EXPRESSIONS_FROM_VAST);
        Logger.d(this.l, "sdk ", creativeInfo.Q(), " config item SHOULD_DECODE_EXTRACTED_EXPRESSIONS_FROM_VAST is ", Boolean.valueOf(b2));
        h.a a = com.safedk.android.analytics.brandsafety.creatives.h.a(str2, b2, creativeInfo.Q());
        a(creativeInfo, a, str);
        return a;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public Set<String> c() {
        return com.safedk.android.utils.a.b;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public b d() {
        return this.E;
    }

    protected d(String str, String str2) {
        this.F = null;
        this.G = new HashSet();
        this.N = new HashMap();
        this.g = new HashMap();
        this.O = Executors.newScheduledThreadPool(1);
        this.P = new HashMap();
        this.Q = new HashMap();
        this.h = null;
        this.i = null;
        this.R = new LimitedConcurrentHashMap(30);
        this.S = new LimitedConcurrentHashMap(30);
        this.T = new HashSet();
        this.U = str;
        String sdkVersionByPackage = SdksMapping.getSdkVersionByPackage(str);
        Logger.d(this.l, "package version updated, package : ", str, ", version : ", sdkVersionByPackage);
        this.I = sdkVersionByPackage;
        this.l = str2;
        try {
            boolean contains = SafeDK.getInstance().V().contains(str);
            Logger.d(this.l, "Discovery ctor started, packageName : ", str, ", Require data persistence = ", Boolean.valueOf(contains));
            if (contains) {
                PersistentConcurrentHashMap persistentConcurrentHashMap = new PersistentConcurrentHashMap(this.l + "_vastAdTagUriUrlsToFollow");
                this.F = persistentConcurrentHashMap;
                Logger.d(this.l, "vast ad tag uri to follow loaded, key set=", persistentConcurrentHashMap.keySet());
                PersistentConcurrentHashMap persistentConcurrentHashMap2 = new PersistentConcurrentHashMap(this.l + "_adIdToCreatives");
                this.J = persistentConcurrentHashMap2;
                Logger.d(this.l, "ad id to creatives loaded, key set=", persistentConcurrentHashMap2.keySet());
                PersistentConcurrentHashMap persistentConcurrentHashMap3 = new PersistentConcurrentHashMap(this.l + "_multiAdCreatives");
                this.K = persistentConcurrentHashMap3;
                Logger.d(this.l, "multi ad creatives loaded, key set=", persistentConcurrentHashMap3.keySet());
                PersistentConcurrentHashMap persistentConcurrentHashMap4 = new PersistentConcurrentHashMap(this.l + "_contentHashCodeToCreatives");
                this.L = persistentConcurrentHashMap4;
                Logger.d(this.l, "content hash code to creatives loaded, key set=", persistentConcurrentHashMap4.keySet());
                PersistentConcurrentHashMap persistentConcurrentHashMap5 = new PersistentConcurrentHashMap(this.l + "_webviewAddressToCreatives");
                this.M = persistentConcurrentHashMap5;
                Logger.d(this.l, "webview address to creatives loaded, key set=", persistentConcurrentHashMap5.keySet());
            } else {
                this.F = new ConcurrentHashMap<>();
                Logger.d(this.l, "vast ad tag uri to follow loaded (no persistence)");
                this.J = new ConcurrentHashMap();
                Logger.d(this.l, "ad id to creatives loaded (no persistence)");
                this.K = new ConcurrentHashMap();
                Logger.d(this.l, "multi ad creatives loaded (no persistence)");
                this.L = new ConcurrentHashMap();
                Logger.d(this.l, "content hash code to creatives loaded (no persistence)");
                this.M = new ConcurrentHashMap();
                Logger.d(this.l, "webview address to creatives loaded (no persistence)");
            }
        } catch (InvalidParameterException e2) {
            Logger.e(this.l, "error initializing caching will not be available", e2);
        }
        h();
    }

    private d() {
        this.F = null;
        this.G = new HashSet();
        this.N = new HashMap();
        this.g = new HashMap();
        this.O = Executors.newScheduledThreadPool(1);
        this.P = new HashMap();
        this.Q = new HashMap();
        this.h = null;
        this.i = null;
        this.R = new LimitedConcurrentHashMap(30);
        this.S = new LimitedConcurrentHashMap(30);
        this.T = new HashSet();
    }

    protected boolean H(String str) {
        String lowerCase = str.toLowerCase();
        return lowerCase.endsWith(".mp4") || lowerCase.endsWith(".webm") || lowerCase.endsWith(BrandSafetyUtils.a) || lowerCase.endsWith(".jpeg") || lowerCase.endsWith(".png") || lowerCase.endsWith(".webp");
    }

    public static String I(String str) {
        return com.safedk.android.utils.k.g(com.safedk.android.utils.n.z(str));
    }

    public static String J(String str) {
        return com.safedk.android.utils.k.g(com.safedk.android.utils.n.A(str));
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public void a(String str, String str2, String str3, String str4) {
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public boolean j(String str) {
        if (b(new com.safedk.android.analytics.brandsafety.creatives.i(str))) {
            return true;
        }
        return b(new com.safedk.android.analytics.brandsafety.creatives.i(J(str)));
    }

    public boolean b(com.safedk.android.analytics.brandsafety.creatives.i iVar) {
        com.safedk.android.analytics.brandsafety.creatives.i c2 = c(iVar);
        boolean z2 = this.F.containsKey(c2) || com.safedk.android.analytics.brandsafety.creatives.h.p.contains(c2);
        if (z2) {
            Logger.d(this.l, "is VIV Url result is true for url ", c2);
        }
        return z2;
    }

    private com.safedk.android.analytics.brandsafety.creatives.i c(com.safedk.android.analytics.brandsafety.creatives.i iVar) {
        String[] e2 = CreativeInfoManager.e(this.U);
        if (e2 != null && e2.length > 0) {
            String a = com.safedk.android.utils.k.a(iVar.toString(), e2);
            if (!a.equals(iVar.toString())) {
                Logger.printFullVerboseLog(this.l, "removeVastAdTagUriQueryParamsIfNecessary , query params removed (", Arrays.toString(e2), ") in url ", iVar.toString());
                return new com.safedk.android.analytics.brandsafety.creatives.i(a);
            }
        }
        return iVar;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public List<String> e() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("extra_url");
        return arrayList;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public String a(Bundle bundle) {
        return null;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public boolean k(String str) {
        return false;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public String a(View view, BrandSafetyUtils.AdType adType) {
        String str = null;
        if (e(view)) {
            String name = view.getClass().getName();
            Logger.d(this.l, "get ad ID from view started, ad view: ", view);
            long currentTimeMillis = System.currentTimeMillis();
            ArrayList<String> arrayList = f.get(name);
            if (arrayList != null) {
                Logger.d(this.l, "get ad ID from view, found previous traversal path of ", name, ": ", arrayList);
                str = a(adType, arrayList, view);
            }
            if (str == null) {
                HashSet hashSet = new HashSet();
                ArrayList<String> arrayList2 = new ArrayList<>();
                String a = a(adType, view, arrayList2, hashSet);
                if (a != null) {
                    f.put(name, arrayList2);
                    Logger.printFullVerboseLog(this.l, "get ad ID from view, saving traversal path of ", name, " for later use: ", arrayList2);
                }
                str = a;
            }
            Logger.d(this.l, "get ad ID from view - travel time ", Long.valueOf(System.currentTimeMillis() - currentTimeMillis), " ms");
        }
        if (str != null) {
            Logger.d(this.l, Logger.FeatureTag.CI_MATCHING, "get ad ID from view - ad ID: ", str);
        }
        return str;
    }

    protected List<String> j() {
        return null;
    }

    protected String a(BrandSafetyUtils.AdType adType, Object obj, List<String> list, Set<Object> set) {
        List<String> j2 = j();
        if (j2 == null || j2.size() == 0 || obj == null || set.contains(obj)) {
            return null;
        }
        set.add(obj);
        Class<?> cls = obj.getClass();
        ArrayList<Field> arrayList = new ArrayList();
        boolean a = CreativeInfoManager.a(this.U, AdNetworkConfiguration.SHOULD_ALLOW_REFLECTION_ON_OS_CLASSES, false);
        while (true) {
            arrayList.addAll(Arrays.asList(cls.getDeclaredFields()));
            cls = cls.getSuperclass();
            if (cls == null || (!a(cls.getName(), j2) && !a)) {
                break;
            }
        }
        for (Field field : arrayList) {
            field.setAccessible(true);
            try {
                Object obj2 = field.get(obj);
                if (obj2 == null) {
                    continue;
                } else if (a(obj2.getClass().getName(), j2)) {
                    list.add(field.getName());
                    String a2 = a(adType, obj2, list, set);
                    if (a2 == null) {
                        list.remove(list.size() - 1);
                    } else {
                        return a2;
                    }
                } else {
                    String a3 = a(adType, obj2, field.getName());
                    if (a3 != null) {
                        Logger.d(this.l, "extract ad info (base), adId =  ", a3);
                        list.add(field.getName());
                        return a3;
                    }
                    continue;
                }
            } catch (Throwable th) {
                Logger.d(this.l, "Exception in extract ad info : ", th.getClass().getName(), ", ", th.getMessage());
            }
        }
        return null;
    }

    private boolean a(String str, List<String> list) {
        if (list != null && list.size() > 0) {
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                if (str.startsWith(it.next())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0060, code lost:
    
        com.safedk.android.utils.Logger.d(r10.l, "extract ad info using saved traversal path, field not found");
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006b, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private String a(BrandSafetyUtils.AdType adType, ArrayList<String> arrayList, Object obj) {
        boolean a;
        List<String> j2;
        try {
            a = CreativeInfoManager.a(this.U, AdNetworkConfiguration.SHOULD_ALLOW_REFLECTION_ON_OS_CLASSES, false);
            j2 = j();
        } catch (Throwable th) {
            Logger.e(this.l, "extract ad info exception: ", th.getMessage(), th);
        }
        if (j2 != null && j2.size() != 0 && arrayList != null && obj != null) {
            Logger.d(this.l, "extract ad info using saved traversal path: ", arrayList);
            Iterator<String> it = arrayList.iterator();
            Field field = null;
            while (it.hasNext()) {
                String next = it.next();
                if (obj == null) {
                    return null;
                }
                Class<?> cls = obj.getClass();
                Field field2 = null;
                while (true) {
                    try {
                        field2 = cls.getDeclaredField(next);
                    } catch (NoSuchFieldException e2) {
                        cls = cls.getSuperclass();
                    }
                    if (field2 != null || cls == null || (!a(cls.getName(), j2) && !a)) {
                        break;
                    }
                }
                field2.setAccessible(true);
                obj = field2.get(obj);
                field = field2;
            }
            if (obj != null && field != null) {
                return a(adType, obj, field.getName());
            }
            return null;
        }
        return null;
    }

    protected String a(BrandSafetyUtils.AdType adType, Object obj, String str) {
        return null;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public String f() {
        return this.l;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public WeakReference<WebView> a(List<WeakReference<WebView>> list, String str) {
        if (list != null && list.size() > 0) {
            return list.get(0);
        }
        return null;
    }

    public void i() {
        Logger.d(this.l, "base clear old CIs started");
        com.safedk.android.utils.e.a(this.F, this.l + ":vastAdTagUriUrlsToFollow");
        com.safedk.android.utils.e.a(this.J, this.l + ":adIdToCreatives");
        com.safedk.android.utils.e.a(this.K, this.l + ":multiAdCreatives");
        com.safedk.android.utils.e.a(this.L, this.l + ":contentHashCodeToCreatives");
        com.safedk.android.utils.e.a(this.M, this.l + ":webviewAddressToCreatives");
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public boolean a(View view) {
        return false;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public boolean b(View view) {
        return false;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public boolean a(String str, String str2) {
        return true;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public boolean a(String str) {
        return str.startsWith(w);
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public boolean b(String str) {
        return str.endsWith(x);
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public boolean c(String str) {
        return str.endsWith(y) || str.endsWith(z);
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public boolean d(String str) {
        return str.endsWith(e);
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public RedirectDetails.RedirectType l(String str) {
        return RedirectDetails.RedirectType.REDIRECT;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public String m(String str) {
        return str;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public void e(String str) {
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public boolean a(com.safedk.android.analytics.brandsafety.e eVar, List<String> list, String str) {
        return false;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public BrandSafetyUtils.AdType f(View view) {
        return null;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public long a(CreativeInfo creativeInfo) {
        return SafeDK.getInstance().D();
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public boolean a(String str, Object obj) {
        return false;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public boolean n(String str) {
        return false;
    }

    public boolean a(String str, String str2, Map<String, WeakReference<WebView>> map, Map<String, CreativeInfo> map2, String str3) {
        try {
            Logger.printFullVerboseLog(this.l, "try reverse matching: source: ", str);
        } catch (Throwable th) {
            Logger.printFullVerboseLog(this.l, "try reverse matching encountered exception: ", th);
        }
        if (str != null && map.containsKey(str)) {
            WeakReference<WebView> weakReference = map.get(str);
            if (!com.safedk.android.utils.n.a((Reference<?>) weakReference)) {
                Logger.d(this.l, "try reverse matching: webViewRef is null or points to null - webviewRef: ", weakReference);
                return false;
            }
            WebView webView = weakReference.get();
            if (map2.containsKey(str)) {
                CreativeInfo creativeInfo = map2.get(str);
                if (creativeInfo != null) {
                    String L = creativeInfo.L();
                    if ((str3.equals(s) && c(webView, L)) || (str3.equals(t) && !a(webView, L).isEmpty())) {
                        Logger.d(this.l, Logger.FeatureTag.CI_MATCHING, "try reverse matching: found a match using reverse! adId=", L);
                        return true;
                    }
                }
            } else {
                Logger.d(this.l, "try reverse matching: keyToCIsMap does not contain source");
            }
            return false;
        }
        Logger.d(this.l, "try reverse matching: source is null or not in sourceToWebviewRef");
        return false;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public void o(String str) {
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public void p(String str) {
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public void a(ViewGroup viewGroup, List<WeakReference<View>> list) {
    }

    public boolean g(View view) {
        if (view == null || !view.getClass().getName().contains("exoplayer")) {
            return false;
        }
        Logger.d(this.l, "native video player identified, view: ", view);
        return true;
    }

    public boolean h(View view) {
        if (view.getClass().getName().contains("exoplayer")) {
            return false;
        }
        if (!(view instanceof ViewGroup)) {
            return true;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        boolean z2 = true;
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            z2 = z2 && h(viewGroup.getChildAt(i));
        }
        return z2;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public void a(WebView webView, Object obj) {
    }

    protected WebView K(String str) {
        WeakReference<WebView> weakReference = this.R.get(str);
        if (weakReference == null && (weakReference = L(str)) != null && weakReference.get() != null) {
            this.R.put(str, weakReference);
        }
        if (weakReference != null && weakReference.get() == null) {
            this.R.remove(str);
        }
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public static void b(WebView webView, Object obj) {
        k.put(BrandSafetyUtils.a(obj), new WeakReference<>(webView));
    }

    public static WeakReference<WebView> L(String str) {
        return k.remove(str);
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public void a(Object obj, String str) {
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public WeakReference<View> a(com.safedk.android.analytics.brandsafety.d dVar) {
        return this.Q.get(dVar);
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public void a(com.safedk.android.analytics.brandsafety.d dVar, List<WeakReference<View>> list) {
        for (WeakReference<View> weakReference : list) {
            if (weakReference != null && weakReference.get() != null && (weakReference.get() instanceof MaxNativeAdView)) {
                Logger.d(this.l, "save screenshot view - saving view= ", weakReference.get(), ", with key= ", dVar);
                this.Q.put(dVar, new WeakReference<>(weakReference.get()));
            }
        }
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public void a(View view, int i, int i2) {
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public CreativeInfo c(Object obj, Object obj2) {
        return null;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public boolean q(String str) {
        return false;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public void e(String str, String str2) {
        Set<String> set = this.g.get(str);
        if (set == null) {
            set = new HashSet<>();
            this.g.put(str, set);
        }
        set.add(str2);
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public List<CreativeInfo> a(WebView webView, String str) {
        String a = BrandSafetyUtils.a((Object) webView);
        List<CreativeInfo> t2 = t(str);
        Logger.d(this.l, "adIdFoundOnResource - ad id: ", str, " ci: ", t2);
        if (this.E.b(AdNetworkConfiguration.AD_NETWORK_SUPPORTS_BANNER_MULTIPLE_WEBVIEWS)) {
            e(str, a);
        }
        if (t2.isEmpty()) {
            Logger.d(this.l, "adIdFoundOnResource - ci list is empty, exiting");
            return t2;
        }
        for (CreativeInfo creativeInfo : t2) {
            Logger.printFullVerboseLog(this.l, "Ad identified, ci : ", creativeInfo.aa());
            BrandSafetyUtils.AdType K = creativeInfo.K();
            creativeInfo.a((Object) webView);
            if (K == BrandSafetyUtils.AdType.INTERSTITIAL || K == BrandSafetyUtils.AdType.BANNER || K == BrandSafetyUtils.AdType.MREC) {
                Logger.printFullVerboseLog(this.l, "Ad identified, setting creative in ad finder, adType=", K, ", click url=", creativeInfo.M());
                CreativeInfoManager.a(creativeInfo, CreativeInfo.l);
                creativeInfo.b(this.L);
            } else if (a != null) {
                Logger.d(this.l, "Linking ad id ", str, " to web view ", a);
                synchronized (this.M) {
                    this.M.put(a, creativeInfo);
                }
            } else {
                continue;
            }
        }
        o(str);
        return t2;
    }

    protected boolean c(WebView webView, String str) {
        String a = BrandSafetyUtils.a((Object) webView);
        List<CreativeInfo> t2 = t(str);
        Logger.d(this.l, Logger.FeatureTag.CI_MATCHING, "ad ID found on data loaded - ad id: ", str, " ci: ", t2);
        if (t2.isEmpty()) {
            Logger.d(this.l, "ad ID found on data loaded - ci list is empty, exiting");
            return false;
        }
        for (CreativeInfo creativeInfo : t2) {
            if (creativeInfo.K() == BrandSafetyUtils.AdType.INTERSTITIAL || creativeInfo.K() == BrandSafetyUtils.AdType.BANNER || creativeInfo.K() == BrandSafetyUtils.AdType.MREC) {
                creativeInfo.b(this.L);
                creativeInfo.a((Object) webView);
                CreativeInfoManager.a(creativeInfo, CreativeInfo.l);
                if (creativeInfo.K() == BrandSafetyUtils.AdType.INTERSTITIAL) {
                    SafeDKWebAppInterface.a(a);
                }
            }
        }
        o(str);
        return true;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public boolean a(String str, com.safedk.android.analytics.brandsafety.e eVar) {
        if (eVar.x() != null) {
            Iterator<String> it = this.g.keySet().iterator();
            while (it.hasNext()) {
                Set<String> set = this.g.get(it.next());
                if (set != null && set.contains(str)) {
                    Iterator<String> it2 = eVar.x().iterator();
                    while (it2.hasNext()) {
                        if (set.contains(it2.next())) {
                            Logger.d(this.l, "should verify matching multiple webViews: found multiple webview addresses for one banner. webViewAddresses: ", set, ", views hierarchy: ", eVar.x());
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public Set<String> r(String str) {
        if (str != null) {
            Iterator<String> it = this.g.keySet().iterator();
            while (it.hasNext()) {
                Set<String> set = this.g.get(it.next());
                if (set != null && set.contains(str)) {
                    Logger.d(this.l, "getAllWebViewsForBanner: found multiple webviews. webviewAddress= ", str, ", addresses= ", set);
                    return set;
                }
            }
        }
        return new HashSet();
    }

    private void e(CreativeInfo creativeInfo) {
        a(creativeInfo, creativeInfo.L());
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public void a(CreativeInfo creativeInfo, String str) {
        List<CreativeInfo> list = this.K.get(str);
        if (list == null) {
            list = new ArrayList<>();
            synchronized (this.K) {
                this.K.put(str, list);
            }
        }
        Logger.d(this.l, "storing creative info to multi ad CI list: ", creativeInfo.aa());
        synchronized (list) {
            list.add(creativeInfo);
        }
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public boolean d(CreativeInfo creativeInfo) {
        if (creativeInfo == null || creativeInfo.L() == null) {
            Logger.d(this.l, "store Creative Info creative info is null or CIs ID is null, cannot store it.");
            return false;
        }
        synchronized (this.J) {
            if (creativeInfo.an()) {
                e(creativeInfo);
                if (this.J.containsKey(creativeInfo.L())) {
                    return false;
                }
            }
            if (this.J.containsKey(creativeInfo.L())) {
                Logger.printFullVerboseLog(this.l, "store creative info, ad key exists : ", creativeInfo.L());
            }
            this.J.put(creativeInfo.L(), creativeInfo);
            Logger.printFullVerboseLog(this.l, "store creative info, CI stored, ID: ", creativeInfo.L());
            if (!creativeInfo.a(this.L)) {
                Logger.d(this.l, "store creative info, creative info content hashcode is null, cannot store it.");
            } else {
                Logger.d(this.l, "store creative info, storing creative info with hashcode: ", Integer.valueOf(creativeInfo.S()), ", CI: ", creativeInfo.aa());
            }
            return true;
        }
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public List<CreativeInfo> t(String str) {
        CreativeInfo creativeInfo;
        ArrayList arrayList = new ArrayList();
        synchronized (this.J) {
            Logger.printFullVerboseLog(this.l, "get CIs by ad id keys : ", this.J.keySet());
            creativeInfo = this.J.get(str);
        }
        if (creativeInfo != null) {
            if (this.E.b(AdNetworkConfiguration.AD_NETWORK_SUPPORTS_PREFETCH_REUSE)) {
                Logger.d(this.l, "get CIs by ad id, reset expiration time as network support prefetch reuse. ci id = ", creativeInfo.L());
                creativeInfo.ad();
            } else {
                Logger.d(this.l, "get CIs by ad id retrieved ci for ", str, ", ci : ", creativeInfo.aa());
            }
            Logger.d(this.l, "get CIs by ad id, ci: ", creativeInfo.aa(), ", is multiple ad: ", Boolean.valueOf(creativeInfo.an()));
            List<CreativeInfo> u2 = u(str);
            if (u2 == null || u2.isEmpty()) {
                arrayList.add(creativeInfo);
            } else {
                arrayList.addAll(u2);
                Iterator<CreativeInfo> it = u2.iterator();
                while (it.hasNext()) {
                    it.next().ao();
                }
            }
        }
        Logger.d(this.l, "get CIs by ad id, number of CIs: ", Integer.valueOf(arrayList.size()), ", ad id: ", str);
        return arrayList;
    }

    protected void b(CreativeInfo creativeInfo, String str) {
        Iterator<CreativeInfo> it = t(creativeInfo.L()).iterator();
        while (it.hasNext()) {
            it.next().t(str);
        }
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public List<CreativeInfo> u(String str) {
        return this.K.get(str);
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public List<CreativeInfo> a(int i) {
        CreativeInfo remove;
        List<CreativeInfo> remove2;
        ArrayList arrayList = new ArrayList();
        synchronized (this.L) {
            remove = this.L.remove(Integer.valueOf(i));
        }
        if (remove != null) {
            arrayList.add(remove);
            if (remove.an()) {
                synchronized (this.K) {
                    remove2 = this.K.remove(remove.L());
                }
                if (remove2 != null) {
                    arrayList.addAll(remove2);
                }
            }
        }
        Logger.d(this.l, "get CIs by hash code, number of CIs: ", Integer.valueOf(arrayList.size()), ", hash code: ", Integer.valueOf(i));
        return arrayList;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public List<CreativeInfo> v(String str) {
        List<CreativeInfo> remove;
        if (str == null) {
            return null;
        }
        synchronized (this.K) {
            remove = this.K.remove(str);
        }
        return remove;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public List<CreativeInfo> a(String str, String str2, WebView webView) {
        String a = a(str, str2, new WeakReference<>(webView));
        if (a != null) {
            return a(webView, a);
        }
        return new ArrayList();
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public void a(String str, String str2, BrandSafetyEvent.AdFormatType adFormatType, Object obj) {
        String c2 = c(str2, str2);
        if (c2 != null) {
            Logger.printFullVerboseLog(this.l, "handling shown ad by api, format: ", adFormatType, ", ad id: ", c2);
            if (adFormatType == BrandSafetyEvent.AdFormatType.INTER || adFormatType == BrandSafetyEvent.AdFormatType.NATIVE) {
                for (CreativeInfo creativeInfo : t(c2)) {
                    creativeInfo.a(obj);
                    CreativeInfoManager.a(creativeInfo, CreativeInfo.m);
                }
            }
        }
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public void d(Object obj, Object obj2) {
        CreativeInfo a = a(obj);
        if (a != null) {
            Logger.d(this.l, Logger.FeatureTag.CI_MATCHING, "ad object ready impl, calling set creative in ad finder with ", a);
            AdNetworkDiscovery j2 = CreativeInfoManager.j(this.U);
            if (j2 != null) {
                CreativeInfoManager.a(j2, a, obj2);
            }
            if ((BrandSafetyUtils.AdType.NATIVE.equals(a.K()) && obj2 == null) ? false : true) {
                s(a.L());
                return;
            }
            return;
        }
        Logger.d(this.l, "ad object ready impl, no CI returned.");
        a(obj, obj2);
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public String a(WebView webView, String str, String str2) {
        return str2;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public void b(String str, String str2, WebView webView) {
        String m = com.safedk.android.utils.k.m(str2);
        Logger.d(this.l, "data loaded to webView: ", webView, ", package: ", this.U);
        String a = a(m, str, new WeakReference<>(webView));
        Logger.d(this.l, "data loaded to webView ad id ", a);
        String a2 = BrandSafetyUtils.a((Object) webView);
        if (a != null) {
            c(webView, a);
            return;
        }
        int i = i(str2);
        Logger.d(this.l, "Trying to match by hashcode: ", Integer.valueOf(i));
        List<CreativeInfo> a3 = a(i);
        if (!a3.isEmpty()) {
            Logger.d(this.l, Logger.FeatureTag.CI_MATCHING, "match found by hashcode: ", Integer.valueOf(i));
        }
        for (CreativeInfo creativeInfo : a3) {
            Iterator<String> it = com.safedk.android.utils.n.h(str2).iterator();
            while (it.hasNext()) {
                com.safedk.android.analytics.brandsafety.creatives.g.a(creativeInfo.Q(), webView, it.next(), (Map<String, String>) null);
            }
            creativeInfo.a((Object) webView);
            if (!this.E.b(AdNetworkConfiguration.AD_NETWORK_SUPPORTS_PREFETCH_REUSE)) {
                synchronized (this.J) {
                    this.J.remove(creativeInfo.L());
                }
            }
            if (creativeInfo.K() == BrandSafetyUtils.AdType.INTERSTITIAL) {
                SafeDKWebAppInterface.a(a2);
            }
            if (TextUtils.isEmpty(a2)) {
                Logger.d(this.l, "webView address is empty - can't link creative info to webview");
            }
            Logger.d(this.l, "linking ", Integer.valueOf(creativeInfo.S()), " to web view ", a2);
            synchronized (this.M) {
                this.M.put(a2, creativeInfo);
            }
            if (creativeInfo.K() == BrandSafetyUtils.AdType.INTERSTITIAL || creativeInfo.K() == BrandSafetyUtils.AdType.BANNER || creativeInfo.K() == BrandSafetyUtils.AdType.MREC) {
                CreativeInfoManager.a(creativeInfo, CreativeInfo.j, (String) null, String.valueOf(creativeInfo.S()));
            }
        }
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public void s(String str) {
        CreativeInfo remove;
        Logger.d(this.l, "remove CIs by ad id, started, ci id = ", str);
        if (str == null) {
            return;
        }
        synchronized (this.J) {
            if (this.E.b(AdNetworkConfiguration.AD_NETWORK_SUPPORTS_PREFETCH_REUSE)) {
                remove = this.J.get(str);
                if (remove != null) {
                    Logger.d(this.l, "remove CIs by ad id, reset expiration time as network support prefetch reuse. ci id = ", remove.L(), ", ad type = ", remove.K());
                    List<CreativeInfo> list = this.K.get(str);
                    if (list == null || list.isEmpty()) {
                        list = new ArrayList<>();
                        list.add(remove);
                    }
                    for (CreativeInfo creativeInfo : list) {
                        creativeInfo.ad();
                        creativeInfo.a(false);
                        creativeInfo.a((Boolean) false);
                    }
                }
            } else {
                remove = this.J.remove(str);
                if (remove != null) {
                    Logger.d(this.l, "remove CIs by ad id, ci removed. ci id = ", remove.L(), ", ad type = ", remove.K());
                } else {
                    Logger.d(this.l, "remove CIs by ad id, ci not found, id = ", str);
                }
                this.K.remove(str);
            }
        }
        if (remove != null) {
            remove.b(this.L);
            remove.c(this.M);
        }
    }

    protected static boolean a(String str, CreativeInfo creativeInfo, Map<Integer, Set<CreativeInfo>> map) {
        Iterator<Map.Entry<Integer, Set<CreativeInfo>>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<Integer, Set<CreativeInfo>> next = it.next();
            if (next.getValue() != null && next.getValue().contains(creativeInfo)) {
                Logger.d(str, "is matched by media player - removing ci id= ", creativeInfo.L(), ",   video url= ", next.getKey());
                it.remove();
                return true;
            }
        }
        return false;
    }

    protected void c(CreativeInfo creativeInfo, String str) {
    }

    protected void a(CreativeInfo creativeInfo, List<String> list) {
    }

    protected static void b(String str, CreativeInfo creativeInfo, Map<String, CreativeInfo> map) {
        Iterator<Map.Entry<String, CreativeInfo>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, CreativeInfo> next = it.next();
            if (next.getValue() == creativeInfo) {
                Logger.d(str, "remove ci from collection - key to remove: ", next.getKey(), ",    ci to remove: ", creativeInfo.aa());
                it.remove();
            }
        }
    }

    protected static void c(String str, CreativeInfo creativeInfo, Map<?, Set<CreativeInfo>> map) {
        Iterator<Map.Entry<?, Set<CreativeInfo>>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<?, Set<CreativeInfo>> next = it.next();
            if (next.getValue() != null && next.getValue().contains(creativeInfo)) {
                Logger.d(str, "remove ci from collection set - key to remove: ", next.getKey(), ",    ci to remove: ", creativeInfo.aa());
                it.remove();
            }
        }
    }

    protected String M(String str) {
        StringBuffer stringBuffer = new StringBuffer();
        InputStream inputStream = null;
        try {
            Logger.d(this.l, "downloadUrl fetching ", str);
            inputStream = new URL(str).openStream();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                stringBuffer.append(readLine);
            }
            inputStream.close();
        } catch (Throwable th) {
            try {
                Logger.d(this.l, "Exception in downloadUrl : ", th.getMessage(), th);
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (Throwable th2) {
                Logger.d(this.l, "Exception in downloadUrl inner : ", th.getMessage(), th);
            }
        }
        return stringBuffer.toString();
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public boolean a(com.safedk.android.analytics.brandsafety.c cVar) {
        return false;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public void b(WebView webView, String str) {
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public HashMap<Integer, String> g() {
        return null;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public String w(String str) {
        return null;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public void x(String str) {
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public void a(WebView webView) {
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public CreativeInfo d(Object obj) {
        return null;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public void f(String str, String str2) {
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public String y(String str) {
        return null;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public void g(String str, String str2) {
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public CreativeInfo a(SimpleConcurrentHashSet<String> simpleConcurrentHashSet) {
        return null;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public void z(String str) {
        try {
            l.c(str);
        } catch (Exception e2) {
            Logger.d(this.l, "interceptXmlHttpRequest - encountered exception= ", e2);
        }
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public void e(Object obj) {
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public void a(WeakReference<WebView> weakReference, String str) {
    }

    protected void a(c.a aVar, String str, CreativeInfo creativeInfo) {
        BrandSafetyEvent.AdFormatType adFormatType = aVar != null ? aVar.b : null;
        if (adFormatType == null && creativeInfo != null) {
            adFormatType = BrandSafetyUtils.a(creativeInfo.K());
        }
        if (adFormatType != BrandSafetyEvent.AdFormatType.NATIVE) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            Logger.d(this.l, "save native prefetch hash code to ci map - prefetch is empty, discarding ci= ", creativeInfo.aa());
            return;
        }
        int hashCode = str.hashCode();
        if (!TextUtils.isEmpty(str)) {
            Logger.d(this.l, "save native prefetch hash code to ci map - hash code= ", Integer.valueOf(hashCode), ",      ci= ", creativeInfo.aa());
            this.S.put(Integer.valueOf(hashCode), creativeInfo);
        }
    }

    protected CreativeInfo N(String str) {
        String h = h(str);
        if (TextUtils.isEmpty(h)) {
            Logger.d(this.l, "get native ci from prefetch hash code - buffer is empty, return null");
            return null;
        }
        int hashCode = h.hashCode();
        CreativeInfo creativeInfo = this.S.get(Integer.valueOf(hashCode));
        String str2 = this.l;
        Object[] objArr = new Object[4];
        objArr[0] = "get native ci from prefetch hash code - hash code= ";
        objArr[1] = Integer.valueOf(hashCode);
        objArr[2] = ",    ci found= ";
        objArr[3] = creativeInfo != null ? creativeInfo.aa() : null;
        Logger.d(str2, objArr);
        return creativeInfo;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public String h(String str) {
        return str;
    }
}
