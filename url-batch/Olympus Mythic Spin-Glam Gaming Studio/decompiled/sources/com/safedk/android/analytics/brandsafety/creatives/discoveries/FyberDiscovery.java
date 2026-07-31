package com.safedk.android.analytics.brandsafety.creatives.discoveries;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.TextView;
import com.fyber.inneractive.sdk.external.ImpressionData;
import com.fyber.inneractive.sdk.external.InneractiveAdManager;
import com.fyber.inneractive.sdk.external.OnGlobalImpressionDataListener;
import com.pubmatic.sdk.common.POBCommonConstants;
import com.safedk.android.SafeDK;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.RedirectDetails;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import com.safedk.android.analytics.brandsafety.creatives.infos.FyberCreativeInfo;
import com.safedk.android.analytics.events.BrandSafetyEvent;
import com.safedk.android.utils.LimitedConcurrentHashMap;
import com.safedk.android.utils.Logger;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;
import org.slf4j.Marker;

/* loaded from: classes.dex */
public class FyberDiscovery extends d {
    private static final String V = "rewarded";
    private static final String W = "interstitial";
    private static final String X = "banner";
    private static final String Y = "mrec";
    private static final String Z = "v";
    private static final String aa = "vast-vpaid";
    private static final String ab = "cached-ad";
    private static final String ac = ".fyber.com/ad";
    private static final String ad = ".inner-active.mobi/impression";
    private static final String ae = "s";
    private static final String af = "crid";
    private static final String ag = "cid";
    private static final String ah = "network";
    private static final String ai = "sessionId";
    private static final String aj = "mraid://open";
    private static final String ak = "url";
    private static final String al = "mraid://expand";
    private static final String ao = "fyMraidVideoAd";
    private static final String ap = "fyMraidVideoAdCompleted";
    private static final String aq = "adm";
    private static final String ar = "scar-admob";
    private static final int ax = 15;
    public static final String b = "wv.inner-active.mobi/simpleM2M/clientRequestEnhancedXmlAd";
    public static final String c = "com.fyber.inneractive.sdk";
    public static final String d = "com.fyber.inneractive.sdk.player.ui";
    public static final String e = "<tns:Response";
    private static final String f = "FyberDiscovery";
    private static final String g = "X-IA-Ad-Unit-Display-Type";
    private static final String h = "X-IA-Creative-ID";
    private static final String i = "X-IA-Ad-Unit-ID";
    private static final String j = "X-IA-AdNetwork";
    private static final String k = "X-IA-Adomain";
    private static final String l = "X-IA-sdkClickUrl";
    private static final String m = "X-IA-Session";
    private static final String n = "X-IA-Campaign-ID";
    private static final String o = "X-IA-sdkImpressionUrl";
    private static final String p = "spotid";
    private static final String q = "vast";
    private OnGlobalImpressionDataListener aB;
    private ConcurrentHashMap<String, CreativeInfo> as;
    private final ConcurrentHashMap<String, CreativeInfo> aw;
    private static final String an = "fymraidvideo://";
    private static final String[] am = {"mraid://close", "mraid://usecustomclose", "mraid://setOrientationProperties", "iaadfinishedloading://", an, "fmpendcard://"};
    private static final ConcurrentHashMap<String, String> at = new ConcurrentHashMap<>();
    private static HashMap<Integer, String> au = new HashMap<>();
    private static final String[] av = {"adTime", "countingMethod"};
    private static final LimitedConcurrentHashMap<String, WeakReference<WebView>> ay = new LimitedConcurrentHashMap<>(15);
    private static final LimitedConcurrentHashMap<String, String> az = new LimitedConcurrentHashMap<>(15);
    private static AtomicBoolean aA = new AtomicBoolean(false);

    public FyberDiscovery() {
        super(com.safedk.android.utils.h.p, f);
        this.as = new ConcurrentHashMap<>();
        this.aw = new ConcurrentHashMap<>();
        this.aB = new FyberOnGlobalImpressionDataListener();
        try {
            this.E.b(AdNetworkConfiguration.SHOULD_DECODE_EXTRACTED_EXPRESSIONS_FROM_VAST, false);
            this.E.b(AdNetworkConfiguration.SUPPORTS_GZIP_CONTENT, true);
            this.E.b(AdNetworkConfiguration.ENFORCE_CLOSE_INPUT_STREAM, true);
            this.E.b(AdNetworkConfiguration.SUPPORTS_BANNER_IMPRESSION_TRACKING, true);
            this.E.b(AdNetworkConfiguration.SUPPORTS_MREC_IMPRESSION_TRACKING, true);
            this.E.b(AdNetworkConfiguration.SUPPORTS_MREC_IMPRESSION_EOV, true);
            this.E.b(AdNetworkConfiguration.SUPPORTS_PREFETCH_RECEIVING_BY_APPLOVIN, true);
            this.E.b(AdNetworkConfiguration.SUPPORTS_AUTO_REDIRECTS_IDENTIFICATION, true);
            this.E.b(AdNetworkConfiguration.SUPPORTS_EXPANDED_ADS_IDENTIFICATION, true);
            this.E.b(AdNetworkConfiguration.SUPPORTS_EXPANDED_ADS_IDENTIFICATION_BY_MAX_EVENT, true);
            this.E.b(AdNetworkConfiguration.AD_NETWORK_SUPPORTS_BANNER_MULTIPLE_WEBVIEWS, true);
            this.E.b(AdNetworkConfiguration.SHOULD_EXTRACT_AD_ID_FROM_BANNER_WEB_VIEW, true);
            this.E.b(AdNetworkConfiguration.USE_INPUT_STREAM_EVENT_AS_RESOURCE_LOADED_INDICATION, true);
            this.E.b(AdNetworkConfiguration.SUPPORTS_JAVASCRIPT_BASED_VIDEO_STATE_DETECTION, true);
            this.E.b(AdNetworkConfiguration.SHOULD_USE_RESOURCES_COLLECTION_SCRIPT_FULLSCREEN, true);
        } catch (Throwable th) {
            Logger.e(f, "exception in ctor", th);
        }
    }

    private static void h() {
        if (au.isEmpty()) {
            au.put(Integer.valueOf(SafeDK.getInstance().m().getResources().getIdentifier("inneractive_webview_vast_endcard", "id", SafeDK.getInstance().m().getPackageName())), "inneractive_webview_vast_endcard");
            au.put(Integer.valueOf(SafeDK.getInstance().m().getResources().getIdentifier("inneractive_webview_vast_vpaid", "id", SafeDK.getInstance().m().getPackageName())), "inneractive_webview_vast_vpaid");
            au.put(Integer.valueOf(SafeDK.getInstance().m().getResources().getIdentifier("inneractive_vast_endcard_html", "id", SafeDK.getInstance().m().getPackageName())), "inneractive_vast_endcard_html");
            au.put(Integer.valueOf(SafeDK.getInstance().m().getResources().getIdentifier("inneractive_webview_mraid", "id", SafeDK.getInstance().m().getPackageName())), "inneractive_webview_mraid");
        }
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public HashMap<Integer, String> g() {
        return au;
    }

    public static void a(boolean z) {
        aA.set(z);
        Logger.d(f, "on global impression data listener is set to ", Boolean.valueOf(z));
        h();
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d
    protected List<CreativeInfo> a(String str, String str2, Map<String, List<String>> map, c.a aVar, byte[] bArr) {
        Object[] objArr = new Object[6];
        objArr[0] = "generate info url = ";
        objArr[1] = str;
        objArr[2] = " , headers = ";
        objArr[3] = map != null ? map.toString() : POBCommonConstants.NULL_VALUE;
        objArr[4] = ", buffer size = ";
        objArr[5] = str2 == null ? "0" : Integer.valueOf(str2.length());
        Logger.d(f, objArr);
        if (TextUtils.isEmpty(str)) {
            Logger.d(f, "generate info url is empty, exiting");
            return null;
        }
        if (str.contains(b)) {
            return a(str, str2, map);
        }
        if (str.contains(ab) && str.contains(ac)) {
            String d2 = com.safedk.android.utils.k.d(str, ai);
            if (TextUtils.isEmpty(d2)) {
                Logger.d(f, "generate info session id is empty, exiting");
                return null;
            }
            if (str2 != null) {
                String a = BrandSafetyUtils.a(str2.replace("\n", "").getBytes());
                Logger.d(f, "generate info content hash: ", a);
                at.put(a, d2);
                CreativeInfo creativeInfo = this.as.get(d2);
                if (creativeInfo != null) {
                    a(str2, creativeInfo, true);
                } else {
                    Logger.d(f, "generate info no CI for ad content with session ID: ", d2);
                }
            }
        } else if (aVar != null) {
            return a(str2, aVar);
        }
        return null;
    }

    private List<CreativeInfo> a(String str, String str2, Map<String, List<String>> map) {
        String a;
        String str3;
        BrandSafetyUtils.AdType adType;
        BrandSafetyEvent.AdFormatType adFormatType;
        String str4;
        ArrayList arrayList = new ArrayList();
        try {
            k();
            Logger.d(f, "generate info handle prefetch start");
            a = a(map, g);
            str3 = null;
        } catch (Throwable th) {
            Logger.d(f, "Error in generate info : ", th.getMessage(), th);
        }
        if (a != null) {
            Logger.d(f, "generate info ad type is ", a);
            if (a.equals("interstitial")) {
                BrandSafetyEvent.AdFormatType adFormatType2 = BrandSafetyEvent.AdFormatType.INTER;
                adType = BrandSafetyUtils.AdType.INTERSTITIAL;
                adFormatType = adFormatType2;
            } else if (a.equals("rewarded")) {
                BrandSafetyEvent.AdFormatType adFormatType3 = BrandSafetyEvent.AdFormatType.REWARD;
                adType = BrandSafetyUtils.AdType.INTERSTITIAL;
                adFormatType = adFormatType3;
            } else if (a.equals("banner")) {
                BrandSafetyEvent.AdFormatType adFormatType4 = BrandSafetyEvent.AdFormatType.BANNER;
                adType = BrandSafetyUtils.AdType.BANNER;
                adFormatType = adFormatType4;
            } else if (a.contains(Y)) {
                BrandSafetyEvent.AdFormatType adFormatType5 = BrandSafetyEvent.AdFormatType.MREC;
                adType = BrandSafetyUtils.AdType.MREC;
                adFormatType = adFormatType5;
            } else {
                Logger.d(f, "generate info ad type is ", a, ", skipping");
                return null;
            }
            if (str != null && str.contains(b) && ((str3 = com.safedk.android.utils.k.d(str, p)) != null || this.I != null)) {
                Logger.d(f, "generate info spot id: ", str3, " ,sdk version: ", this.I);
            }
            String str5 = str3;
            String a2 = a(map, i);
            String a3 = a(map, h);
            if (a3 != null) {
                str4 = a3;
            } else {
                Logger.d(f, "generate info creative id is null, using ad id for it's value");
                str4 = a2;
            }
            String a4 = a(map, n);
            String a5 = a(map, l);
            String a6 = a(map, j);
            String a7 = a(map, k);
            String a8 = a(map, m);
            Logger.d(f, "generate info session id: ", a8);
            String a9 = a(map, o);
            Logger.d(f, "generate info sdk impression url: ", a9);
            String F = F(com.safedk.android.utils.k.l(str2));
            if (str2 != null) {
                String a10 = BrandSafetyUtils.a(str2.replace("\n", "").getBytes());
                Logger.d(f, "generate info content hash: ", a10);
                at.put(a10, a8);
            }
            FyberCreativeInfo fyberCreativeInfo = new FyberCreativeInfo(a8, str4, a4, F, null, adFormatType, adType, str5, this.I, a6, a7, a5, null);
            arrayList.add(fyberCreativeInfo);
            if (adType == BrandSafetyUtils.AdType.INTERSTITIAL) {
                synchronized (this.as) {
                    this.as.put(a8, fyberCreativeInfo);
                }
                Logger.d(f, "generate info added CI to list by session id: ", a8, ",  CI list: ", this.as);
            }
            String O = O(a9);
            synchronized (this.aw) {
                this.aw.put(O, fyberCreativeInfo);
            }
            Logger.d(f, "generate info added CI to list by sdk impression url: ", O, ",  CI list: ", this.aw);
            a(str2, (CreativeInfo) fyberCreativeInfo, false);
            return arrayList;
        }
        Logger.d(f, "generate info ad type is null, skipping");
        return null;
    }

    private List<CreativeInfo> a(String str, c.a aVar) {
        BrandSafetyUtils.AdType adType;
        String str2;
        String str3;
        BrandSafetyUtils.AdType adType2;
        Logger.d(f, "generate info handle bidding start");
        ArrayList arrayList = new ArrayList();
        BrandSafetyEvent.AdFormatType adFormatType = null;
        if (str != null) {
            ArrayList<String> f2 = com.safedk.android.utils.n.f(new String(Base64.decode(str, 0)));
            Iterator<String> it = f2.iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next.contains(ad)) {
                    String d2 = com.safedk.android.utils.k.d(next, "s");
                    String str4 = aVar != null ? aVar.d : null;
                    String d3 = com.safedk.android.utils.k.d(next, "network");
                    Logger.d(f, "sessionId=", d2, " creativeId=", str4, " adNetwork=", d3);
                    if (aVar == null) {
                        adType = null;
                        str2 = null;
                        str3 = null;
                    } else {
                        if (aVar.b == BrandSafetyEvent.AdFormatType.INTER) {
                            adFormatType = BrandSafetyEvent.AdFormatType.INTER;
                            adType2 = BrandSafetyUtils.AdType.INTERSTITIAL;
                        } else if (aVar.b == BrandSafetyEvent.AdFormatType.REWARD) {
                            adFormatType = BrandSafetyEvent.AdFormatType.REWARD;
                            adType2 = BrandSafetyUtils.AdType.INTERSTITIAL;
                        } else if (aVar.b == BrandSafetyEvent.AdFormatType.BANNER || aVar.b == BrandSafetyEvent.AdFormatType.LEADER) {
                            adFormatType = BrandSafetyEvent.AdFormatType.BANNER;
                            adType2 = BrandSafetyUtils.AdType.BANNER;
                        } else if (aVar.b == BrandSafetyEvent.AdFormatType.MREC) {
                            adFormatType = BrandSafetyEvent.AdFormatType.MREC;
                            adType2 = BrandSafetyUtils.AdType.MREC;
                        } else {
                            Logger.d(f, "generate info max params ad format is ", aVar.b, ", skipping");
                            return null;
                        }
                        String str5 = aVar.a;
                        str2 = aVar.c;
                        adType = adType2;
                        str3 = str5;
                    }
                    Logger.d(f, "ad format type=", adFormatType, " ad type=", adType);
                    FyberCreativeInfo fyberCreativeInfo = new FyberCreativeInfo(d2, str4, null, null, null, adFormatType, adType, str2, this.I, d3, null, null, str3);
                    fyberCreativeInfo.b((List<String>) f2);
                    arrayList.add(fyberCreativeInfo);
                    synchronized (this.as) {
                        this.as.put(d2, fyberCreativeInfo);
                    }
                    Logger.d(f, "generate info added CI to list by session id: ", d2, ", CI list: ", this.as);
                    String O = O(next);
                    synchronized (this.aw) {
                        this.aw.put(O, fyberCreativeInfo);
                    }
                    Logger.d(f, "generate info added CI to list by sdk impression url: ", next, ", CI list: ", this.aw);
                    return arrayList;
                }
            }
        }
        return null;
    }

    private void b(String str, CreativeInfo creativeInfo) {
        creativeInfo.a(ar, "/");
        String g2 = com.safedk.android.utils.k.g(str);
        Logger.printFullVerboseLog(f, "decoded prefetch content is: ", g2);
        ArrayList<String> f2 = com.safedk.android.utils.n.f(g2);
        Iterator<String> it = f2.iterator();
        while (it.hasNext()) {
            Logger.printFullVerboseLog(f, "DV360 handle - found url: ", it.next());
        }
        creativeInfo.b((List<String>) f2);
    }

    private void a(String str, CreativeInfo creativeInfo, boolean z) {
        Logger.d(f, "generate info ad content start");
        if (com.safedk.android.utils.n.n(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.has("adm")) {
                    b(jSONObject.getString("adm"), creativeInfo);
                    return;
                }
            } catch (JSONException e2) {
                Logger.d(f, "generate info ad content - exception when creating JSON object", e2);
            }
            Logger.d(f, "generate info unknown content type");
            return;
        }
        if (z) {
            String a = com.safedk.android.utils.n.a(com.safedk.android.utils.g.a("<tns:AdNetwork Value=\"(.*?)\" />", 2), str, 1);
            if (!TextUtils.isEmpty(a)) {
                Logger.d(f, "generate info bidding - found buyer id: ", a);
                creativeInfo.m(a);
            } else {
                Logger.d(f, "generate info bidding - did NOT find buyer id, using the old version from prefetch: ", creativeInfo.P());
            }
        }
        Pattern a2 = com.safedk.android.utils.g.a("<tns:Ad>([\\s\\S]*?)</tns:Ad>", 2);
        String a3 = com.safedk.android.utils.n.a(a2, str, 1);
        if (a3 != null) {
            if (com.safedk.android.utils.n.a(com.safedk.android.analytics.brandsafety.creatives.h.j(), a3, 1) != null) {
                Logger.printFullVerboseLog(f, "generate info vast ad content: ", a3);
                d(creativeInfo, a3);
                creativeInfo.e("vast");
            } else {
                Logger.printFullVerboseLog(f, "generate info processing mraid ad: ", a3);
                c(com.safedk.android.utils.n.a(a2, str, 1), creativeInfo);
                creativeInfo.e("mraid");
            }
        }
    }

    private void k() {
        if (aA.get()) {
            return;
        }
        if (InneractiveAdManager.wasInitialized()) {
            InneractiveAdManager.setImpressionDataListener(this.aB);
            Logger.d(f, "on global impression data listener has been set by SafeDK");
            aA.set(true);
            return;
        }
        Logger.d(f, "initialize on global impression listener - Fyber Sdk is not initialized yet");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:31:0x0069
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1179)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo b(java.lang.Object r9) {
        /*
            r8 = this;
            r0 = 0
            r1 = 1
            r2 = 0
            r3 = 2
            java.lang.String r4 = "FyberDiscovery"
            java.lang.Object[] r5 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L6d
            java.lang.String r6 = "match info ad instance: "
            r5[r2] = r6     // Catch: java.lang.Throwable -> L6d
            r5[r1] = r9     // Catch: java.lang.Throwable -> L6d
            com.safedk.android.utils.Logger.d(r4, r5)     // Catch: java.lang.Throwable -> L6d
            boolean r4 = r9 instanceof com.fyber.inneractive.sdk.external.ImpressionData     // Catch: java.lang.Throwable -> L6d
            if (r4 == 0) goto L1e
            com.fyber.inneractive.sdk.external.ImpressionData r9 = (com.fyber.inneractive.sdk.external.ImpressionData) r9     // Catch: java.lang.Throwable -> L6d
            java.lang.String r9 = r9.getImpressionId()     // Catch: java.lang.Throwable -> L6d
            goto L26
        L1e:
            boolean r4 = r9 instanceof java.lang.String     // Catch: java.lang.Throwable -> L6d
            if (r4 == 0) goto L25
            java.lang.String r9 = (java.lang.String) r9     // Catch: java.lang.Throwable -> L6d
            goto L26
        L25:
            r9 = r0
        L26:
            if (r9 == 0) goto L6c
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo> r4 = r8.as     // Catch: java.lang.Throwable -> L6d
            monitor-enter(r4)     // Catch: java.lang.Throwable -> L6d
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo> r5 = r8.as     // Catch: java.lang.Throwable -> L69
            java.lang.Object r5 = r5.remove(r9)     // Catch: java.lang.Throwable -> L69
            com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo r5 = (com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo) r5     // Catch: java.lang.Throwable -> L69
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L66
            if (r5 == 0) goto L4e
            java.lang.String r0 = "FyberDiscovery"
            com.safedk.android.utils.Logger$FeatureTag r4 = com.safedk.android.utils.Logger.FeatureTag.CI_MATCHING     // Catch: java.lang.Throwable -> L63
            r6 = 4
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch: java.lang.Throwable -> L63
            java.lang.String r7 = "match info ad instance - CI MATCH FOUND! by key: "
            r6[r2] = r7     // Catch: java.lang.Throwable -> L63
            r6[r1] = r9     // Catch: java.lang.Throwable -> L63
            java.lang.String r9 = ", CI : "
            r6[r3] = r9     // Catch: java.lang.Throwable -> L63
            r9 = 3
            r6[r9] = r5     // Catch: java.lang.Throwable -> L63
            com.safedk.android.utils.Logger.printFullVerboseLog(r0, r4, r6)     // Catch: java.lang.Throwable -> L63
            goto L61
        L4e:
            java.lang.String r9 = "FyberDiscovery"
            java.lang.Object[] r0 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L63
            java.lang.String r4 = "match info ad instance - cannot find key in: "
            r0[r2] = r4     // Catch: java.lang.Throwable -> L63
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo> r4 = r8.as     // Catch: java.lang.Throwable -> L63
            java.util.Set r4 = r4.keySet()     // Catch: java.lang.Throwable -> L63
            r0[r1] = r4     // Catch: java.lang.Throwable -> L63
            com.safedk.android.utils.Logger.d(r9, r0)     // Catch: java.lang.Throwable -> L63
        L61:
            r0 = r5
            goto L6c
        L63:
            r9 = move-exception
            r0 = r5
            goto L6e
        L66:
            r9 = move-exception
            r0 = r5
            goto L6a
        L69:
            r9 = move-exception
        L6a:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L69
            throw r9     // Catch: java.lang.Throwable -> L6d
        L6c:
            goto L7b
        L6d:
            r9 = move-exception
        L6e:
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r4 = "Exception in match info ad instance: "
            r3[r2] = r4
            r3[r1] = r9
            java.lang.String r9 = "FyberDiscovery"
            com.safedk.android.utils.Logger.d(r9, r3)
        L7b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.safedk.android.analytics.brandsafety.creatives.discoveries.FyberDiscovery.b(java.lang.Object):com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo");
    }

    private CreativeInfo c(String str, CreativeInfo creativeInfo) {
        Logger.d(f, "update Html CI started: ", creativeInfo.aa());
        ArrayList arrayList = new ArrayList();
        List<String> b2 = com.safedk.android.utils.n.b(com.safedk.android.utils.g.a("\"(https?:\\/\\/.*?\\.(?:js|css|png|jpg|mp4|webm))\"", 2), str, 1);
        if (b2 != null && b2.size() > 0) {
            Iterator<String> it = b2.iterator();
            while (it.hasNext()) {
                String g2 = com.safedk.android.utils.k.g(it.next());
                Logger.d(f, "update Html CI - resource url: ", g2);
                arrayList.add(g2);
            }
        }
        Iterator<String> it2 = com.safedk.android.utils.n.f(str).iterator();
        while (it2.hasNext()) {
            String g3 = com.safedk.android.utils.k.g(it2.next());
            Logger.d(f, "update Html CI - extract urls from source new url: ", g3);
            arrayList.add(g3);
        }
        creativeInfo.b((List<String>) arrayList);
        Logger.d(f, "update Html CI updated: ", creativeInfo.aa());
        return creativeInfo;
    }

    public CreativeInfo d(CreativeInfo creativeInfo, String str) {
        D("parse vast prefetch start");
        a(creativeInfo, (String) null, str, false);
        if (creativeInfo.g()) {
            ((FyberCreativeInfo) creativeInfo).e(aa);
        }
        Logger.d(f, "parse vast prefetch - CI updated : ", creativeInfo.aa());
        D("parse vast prefetch return");
        return creativeInfo;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public String c(String str, String str2) {
        return a(str, str2, (WeakReference<WebView>) null);
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public String a(String str, String str2, WeakReference<WebView> weakReference) {
        Object[] objArr = new Object[4];
        objArr[0] = "get ad ID from resource: source is: ";
        objArr[1] = str2;
        objArr[2] = ", webViewRef is: ";
        objArr[3] = weakReference == null ? POBCommonConstants.NULL_VALUE : weakReference.get();
        Logger.d(f, objArr);
        if (str2 == null) {
            return null;
        }
        String O = O(str2);
        Logger.d(f, "get ad ID from resource: cleanSource: ", O, ", creativeInfosBySdkImpressionUrl keys are: ", this.aw.keySet());
        if (com.safedk.android.utils.n.a((Reference<?>) weakReference)) {
            ay.put(O, weakReference);
            Logger.d(f, "get ad ID from resource: webview is alive, adding clean source: ", O);
        } else {
            Logger.d(f, "get ad ID from resource: webview is not alive, not adding to map");
        }
        CreativeInfo creativeInfo = this.aw.get(O);
        if (creativeInfo != null) {
            String L = creativeInfo.L();
            Logger.d(f, "get ad ID from resource: found ci in map with ad id: ", L);
            az.put(L, O);
            Logger.d(f, Logger.FeatureTag.CI_MATCHING, "get ad ID from resource: added ad id: ", L, " to adIdToSource map");
            return L;
        }
        Logger.d(f, "get ad ID from resource: could not find ci in map!");
        return null;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public boolean n(String str) {
        if (!az.containsKey(str)) {
            Logger.d(f, "try reverse matching with ad id - ad id ", str, " is not in the adIdToSource keys: ", az.keySet());
            return false;
        }
        return a(az.get(str), com.safedk.android.utils.h.p, ay, this.aw, d.t);
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public void o(String str) {
        String remove = az.remove(str);
        Logger.d(f, "clean resources started with ad id: ", str, ", and source is: ", remove);
        if (remove != null) {
            ay.remove(remove);
        }
    }

    public String C(String str) {
        return com.safedk.android.utils.n.a(com.safedk.android.utils.g.a("<meta name=\"inneractive-session\" content=\"([\\s\\S]*?)\" \\/>", 2), str, 1);
    }

    private String a(Map<String, List<String>> map, String str) {
        List<String> list;
        if (map != null && map.keySet().toString().toLowerCase().contains(str.toLowerCase())) {
            if (map.get(str) != null) {
                list = map.get(str);
            } else if (map.get(str.toLowerCase()) == null) {
                list = null;
            } else {
                list = map.get(str.toLowerCase());
            }
            if (list != null && list.size() > 0) {
                Logger.d(f, "get value from headers key '", str, "', value '", list.get(0), "'");
                return list.get(0);
            }
            Logger.d(f, "header '", str, "' not found");
        } else {
            Logger.d(f, "header '", str, "' not found");
        }
        return null;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d
    protected String a(String str, CreativeInfo creativeInfo) {
        return str;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d
    protected boolean B(String str) {
        return ((this.G.contains(str) || this.G.contains(J(str)) || this.G.contains(str.replace(Marker.ANY_NON_NULL_MARKER, " "))) && !H(str)) || this.aw.containsKey(O(str));
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d
    protected boolean b(String str, Bundle bundle) {
        boolean z = str.contains(b) || (str.contains(ab) && str.contains(ac)) || this.F.containsKey(new com.safedk.android.analytics.brandsafety.creatives.i(str)) || this.F.containsKey(new com.safedk.android.analytics.brandsafety.creatives.i(J(str))) || this.F.containsKey(new com.safedk.android.analytics.brandsafety.creatives.i(str.replace(Marker.ANY_NON_NULL_MARKER, " ")));
        if (z) {
            Logger.d(f, "should follow input stream started, url=", str, ", result=", Boolean.valueOf(z));
        }
        E(str);
        return z;
    }

    private void D(String str) {
        try {
            Logger.d(f, "print CI collection (", str, ")==========   by session ID (", Integer.valueOf(this.as.size()), " items) ==============");
            synchronized (this.as) {
                for (String str2 : this.as.keySet()) {
                    Logger.d(f, "print CI collection key=", str2);
                    e(this.as.get(str2), str);
                }
            }
        } catch (Throwable th) {
            Logger.e(f, "Exception in print CI collection", th);
            if (this.as == null) {
                Logger.d(f, "print CI collection list was null, initializing");
                this.as = new ConcurrentHashMap<>();
            }
        }
    }

    private void e(CreativeInfo creativeInfo, String str) {
        if (creativeInfo == null) {
            Logger.d(f, "print CI collection - CI is null");
            return;
        }
        Object[] objArr = new Object[4];
        objArr[0] = "print CI collection ";
        if (str == null) {
            str = "";
        }
        objArr[1] = str;
        objArr[2] = "\n, CI : ";
        objArr[3] = creativeInfo.aa();
        Logger.printFullVerboseLog(f, objArr);
    }

    public class FyberOnGlobalImpressionDataListener implements OnGlobalImpressionDataListener {
        public FyberOnGlobalImpressionDataListener() {
        }

        @Override // com.fyber.inneractive.sdk.external.OnGlobalImpressionDataListener
        public void onImpression(String s, String s1, ImpressionData impressionData) {
            Logger.d(FyberDiscovery.f, "on impression started, string1: ", s, ", string2: ", s1, ", impression data: ", impressionData.toString());
        }
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public AdNetworkDiscovery.WebViewResourceMatchingMethod b() {
        return AdNetworkDiscovery.WebViewResourceMatchingMethod.WEBVIEW_LOOKUP;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public Set<String> c() {
        return new HashSet();
    }

    private String O(String str) {
        for (String str2 : av) {
            str = com.safedk.android.utils.k.f(str, str2);
        }
        return I(str);
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public void c(View view) {
        i(view);
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public void d(View view) {
        i(view);
    }

    private void i(View view) {
        Context m2 = SafeDK.getInstance().m();
        int identifier = m2.getResources().getIdentifier("ia_tv_skip", "id", m2.getPackageName());
        int identifier2 = m2.getResources().getIdentifier("ia_iv_close_button", "id", m2.getPackageName());
        Logger.d(f, "handle on view click - ia_tv_skip resId=", Integer.valueOf(identifier), ", ia_iv_close_button resId=", Integer.valueOf(identifier2));
        if (view.getId() == identifier || view.getId() == identifier2) {
            Logger.d(f, "handle on view click - view type is =", view.getClass().getName());
            if (view instanceof TextView) {
                Logger.d(f, "handle on view click - clicked the 'skip' TextView, calling CI manager on video completed");
                CreativeInfoManager.onVideoCompleted(com.safedk.android.utils.h.p, "view-click");
                return;
            } else {
                Logger.d(f, "handle on view click - clicked view is not of type 'TextView'. exiting function");
                return;
            }
        }
        Logger.d(f, "handle on view click - clicked view is not the 'skip' or 'close' TextView.");
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public boolean e(View view) {
        if (!super.e(view) && (!(view instanceof ViewGroup) || !view.getClass().getName().startsWith(d))) {
            return false;
        }
        Logger.d(f, "is ad view: ", view.getClass().getName(), " is a Fyber ViewGroup ");
        return true;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d
    protected List<String> j() {
        return Arrays.asList(c);
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d
    protected String a(BrandSafetyUtils.AdType adType, Object obj, String str) {
        if (obj instanceof String) {
            String str2 = (String) obj;
            if (str2.startsWith(e)) {
                String a = BrandSafetyUtils.a(str2.replace("\n", "").getBytes());
                String remove = at.remove(a);
                Logger.d(f, "extract ad info found, hash: ", a, ", sessionId: ", remove);
                return remove;
            }
            return null;
        }
        return null;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public boolean a(String str) {
        return super.a(str) || str.startsWith(an);
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public boolean b(String str) {
        return super.b(str) || str.endsWith(ao);
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public boolean c(String str) {
        return super.c(str) || str.endsWith(ap);
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public boolean d(String str) {
        return super.d(str);
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public String m(String str) {
        if (str != null && (str.contains(aj) || str.contains(al))) {
            return com.safedk.android.utils.k.d(str, "url");
        }
        return str;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public RedirectDetails.RedirectType l(String str) {
        if (str != null) {
            if (str.contains(aj)) {
                return RedirectDetails.RedirectType.REDIRECT;
            }
            if (str.contains(al)) {
                return RedirectDetails.RedirectType.EXPAND;
            }
            for (String str2 : am) {
                if (str.startsWith(str2)) {
                    return null;
                }
            }
        }
        return RedirectDetails.RedirectType.REDIRECT;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public boolean a(View view) {
        if (!(view instanceof TextureView) || !view.getClass().getName().contains(d)) {
            return false;
        }
        Logger.d(f, "native video player identified, view: ", view);
        return true;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public boolean b(View view) {
        if ((view instanceof TextureView) && view.getClass().getName().contains(d) && view.isShown()) {
            return false;
        }
        if (!(view instanceof ViewGroup)) {
            return true;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        boolean z = true;
        for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
            z = z && b(viewGroup.getChildAt(i2));
        }
        return z;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d
    public void i() {
        super.i();
        com.safedk.android.utils.e.a(this.aw, "FyberDiscovery:creativeInfosBySdkImpressionUrl");
        com.safedk.android.utils.e.a(this.as, "FyberDiscovery:creativeInfosBySessionId");
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.discoveries.d, com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery
    public long a(CreativeInfo creativeInfo) {
        AdNetworkDiscovery j2;
        if (creativeInfo != null && creativeInfo.h() != null && creativeInfo.h().contains(ar) && (j2 = CreativeInfoManager.j(com.safedk.android.utils.h.h)) != null) {
            return j2.a(creativeInfo);
        }
        return super.a(creativeInfo);
    }
}
