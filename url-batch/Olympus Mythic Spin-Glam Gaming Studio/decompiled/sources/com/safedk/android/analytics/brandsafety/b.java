package com.safedk.android.analytics.brandsafety;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebView;
import com.adjust.sdk.Constants;
import com.applovin.mediation.ads.MaxAdView;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import com.ironsource.X3;
import com.pubmatic.sdk.common.POBCommonConstants;
import com.safedk.android.SafeDK;
import com.safedk.android.a.g;
import com.safedk.android.analytics.AppLovinBridge;
import com.safedk.android.analytics.StatsCollector;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.FileUploadManager;
import com.safedk.android.analytics.brandsafety.RedirectDetails;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import com.safedk.android.analytics.brandsafety.m;
import com.safedk.android.analytics.events.BrandSafetyEvent;
import com.safedk.android.analytics.events.RedirectEvent;
import com.safedk.android.analytics.events.base.StatsEvent;
import com.safedk.android.analytics.reporters.CrashReporter;
import com.safedk.android.utils.LimitedConcurrentHashMap;
import com.safedk.android.utils.Logger;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.File;
import java.io.IOException;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes12.dex */
public abstract class b implements a {
    protected static final float A = 80.0f;
    protected static final List<String> B = Arrays.asList("com.unity3d.ads");
    protected static final Map<String, m> F = new LimitedConcurrentHashMap(90);
    public static final String f = "ad_format";
    protected static final String g = "type";
    protected static final String h = "WILL_DISPLAY";
    protected static final String i = "WILL_LOAD";
    protected static final String j = "DID_HIDE";
    protected static final String k = "DID_CLICKED";
    protected static final String l = "DID_LOAD";
    protected static final String m = "DID_DISPLAY";
    protected static final String n = "DID_FAIL_DISPLAY";
    protected static final String o = "id";
    protected static final String p = "network_name";
    protected static final String q = "third_party_ad_placement_id";
    protected static final String r = "creative_id";
    protected static final String s = "max_ad_unit_id";
    protected static final String t = "ad_view";
    protected static final String u = "dsp_name";
    public static final int v = 120;
    public static final String w = "revenue_event";
    public static final String x = "unknown";
    public static final String y = "no_CI_report";
    protected static final String z = "_BIDDING";
    protected String a;
    protected List<String> b;
    protected BrandSafetyUtils.AdType c;
    int e;
    protected int d = 0;
    protected final Map<String, c> C = new ConcurrentHashMap();
    protected final Set<String> D = new HashSet();
    protected final ScheduledExecutorService E = Executors.newScheduledThreadPool(1);
    protected final List<v> G = new ArrayList();
    protected Map<String, RedirectData> H = null;

    protected abstract c a(String str, String str2, String str3, BrandSafetyUtils.ScreenShotOrientation screenShotOrientation, String str4, String str5);

    protected b(BrandSafetyUtils.AdType adType, List<String> list, String str, int i2) {
        this.e = 0;
        this.a = str;
        this.c = adType;
        this.b = list;
        this.e = i2;
        Logger.d(str, "ctor started, type: ", adType, ", supported formats: ", list, ", maxAttemptsToCaptureImage = ", Integer.valueOf(i2), ", isOnUiThread = ", Boolean.valueOf(com.safedk.android.utils.n.c()));
        f();
        com.safedk.android.internal.b.getInstance().registerBackgroundForegroundListener(this);
        AppLovinBridge.registerToReceiveMaxEvents(this);
        AppLovinBridge.registerToReceiveMaxRevenueEvents(this);
        if (Build.VERSION.SDK_INT >= 21) {
            ((ScheduledThreadPoolExecutor) this.E).setRemoveOnCancelPolicy(true);
            Logger.d(this.a, "ctor thread pool removal policy set");
        }
    }

    @Override // com.safedk.android.analytics.brandsafety.a
    public c d(String str) {
        return null;
    }

    @Override // com.safedk.android.analytics.brandsafety.a
    public BrandSafetyUtils.AdType a() {
        return this.c;
    }

    public int d() {
        return this.C.size();
    }

    private void f() {
        List<BrandSafetyUtils.d> c = BrandSafetyUtils.c(this.c);
        for (int i2 = 0; i2 < c.size(); i2++) {
            BrandSafetyUtils.d dVar = c.get(i2);
            String str = dVar.a() + "_" + dVar.c();
            synchronized (this.C) {
                this.C.put(str, a(dVar.a(), dVar.b(), dVar.c(), dVar.d(), dVar.e(), dVar.f()));
            }
        }
        Logger.d(this.a, "restore impressions for upload - number of loaded impressions to report ", Integer.valueOf(this.C.size()), " ", this.C.keySet());
        if (this.C.size() > 0 && StatsCollector.b()) {
            e();
        }
    }

    protected boolean a(String str, View view) {
        AdNetworkDiscovery j2;
        if (str != null && (j2 = CreativeInfoManager.j(str)) != null) {
            return j2.e(view);
        }
        return false;
    }

    @Override // com.safedk.android.analytics.brandsafety.f
    public void a(FileUploadManager.b bVar, FileUploadManager.a aVar, String str, String str2) {
        Logger.d(this.a, "handle upload request started, imageToUpload=", str, ", adInfoCollectionForUpload=", this.C);
        if (this.C.get(str) != null) {
            a(str, bVar, aVar, str2);
        } else {
            Logger.d(this.a, "handle upload request - adInfoCollectionForUpload doesn't contain imageToUpload ", str);
        }
        Logger.d(this.a, "handle upload request - adInfoCollectionForUpload remove key ", str);
    }

    @Override // com.safedk.android.analytics.brandsafety.f
    public void g(String str) {
        Logger.d(this.a, "handle discard request started, imageToDiscard=", str, ", adInfoCollectionForUpload=", this.C, ", isOnUiThread = ", Boolean.valueOf(com.safedk.android.utils.n.c()));
        h(str);
        c cVar = this.C.get(str);
        if (cVar != null) {
            for (l lVar : cVar.g()) {
                if (str.contains(lVar.a)) {
                    b(lVar);
                }
            }
        }
        Logger.d(this.a, "handle discard request - adInfoCollectionForUpload remove key ", str);
        synchronized (this.C) {
            this.C.remove(str);
            Logger.d(this.a, "handle discard request - number of loaded impressions to report ", Integer.valueOf(this.C.size()), " ", this.C.keySet());
        }
    }

    public void h(String str) {
        Logger.d(this.a, "Cleaning stored impressions: ", str);
        BrandSafetyUtils.a(this.c, str);
        i(str);
    }

    protected void i(String str) {
        Logger.d(this.a, "removal all impression images started, reportedImage = ", str, ", adInfoCollectionForUpload keys = ", this.C.keySet(), ", isOnUiThread = ", Boolean.valueOf(com.safedk.android.utils.n.c()));
        if (str.contains("_")) {
            String str2 = str.split("_")[1];
            Logger.d(this.a, "removal all impression images impressionId = ", str2);
            synchronized (this.C) {
                Iterator<Map.Entry<String, c>> it = this.C.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry<String, c> next = it.next();
                    if (next.getKey().endsWith(str2)) {
                        Logger.d(this.a, "removal all impression images removing ", next.getKey(), " ");
                        it.remove();
                    }
                }
                Logger.d(this.a, "removal all impression images - number of loaded impressions to report ", Integer.valueOf(this.C.size()), " ", this.C.keySet());
            }
        }
        File file = new File(SafeDK.getInstance().ae() + this.c);
        Logger.d(this.a, "removal all impression images getting files for dir", file.getPath());
        Logger.d(this.a, "removal all impression images files for dir", file.getPath(), " : ", com.safedk.android.utils.b.a(file.getPath()));
    }

    protected String j(String str) {
        String[] split;
        if (str != null && (split = new File(str).getName().replace(BrandSafetyUtils.a, "").split("_")) != null && split.length >= 4) {
            return split[0] + "_" + split[2];
        }
        return null;
    }

    private void a(final String str, final FileUploadManager.b bVar, final FileUploadManager.a aVar, final String str2) {
        synchronized (this.C) {
            Logger.d(this.a, "Uploading impression ", str, " to server, timeout=", Integer.valueOf(SafeDK.getInstance().L()), "ms", ", adInfoCollectionForUpload = ", this.C, ", isOnUiThread = ", Boolean.valueOf(com.safedk.android.utils.n.c()));
        }
        this.E.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.b.1
            @Override // java.lang.Runnable
            public void run() {
                b.this.a(str, bVar, aVar, str2, 0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:29:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0272 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x025e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void a(final String str, final FileUploadManager.b bVar, final FileUploadManager.a aVar, final String str2, final int i2) {
        String str3;
        String str4;
        BrandSafetyUtils.ScreenShotOrientation screenShotOrientation;
        g.a aVar2;
        char c;
        c cVar = this.C.get(str);
        if (cVar == null) {
            Logger.d(this.a, "impressionInfoToUpload is null");
            return;
        }
        Iterator<l> it = cVar.g().iterator();
        while (true) {
            if (!it.hasNext()) {
                str3 = null;
                str4 = null;
                screenShotOrientation = null;
                break;
            }
            l next = it.next();
            if (next.c != null) {
                if (str.equals(next.c.a + "_" + next.a)) {
                    String str5 = next.c.b;
                    BrandSafetyUtils.ScreenShotOrientation screenShotOrientation2 = next.c.f;
                    if (next.j() == null) {
                        str3 = str5;
                        screenShotOrientation = screenShotOrientation2;
                        str4 = null;
                    } else {
                        screenShotOrientation = screenShotOrientation2;
                        str4 = next.j().I();
                        str3 = str5;
                    }
                }
            }
        }
        if (str3 == null || !new File(str3).exists()) {
            Logger.d(this.a, "Uploading impression - not found, not uploading, filename ", str3);
            return;
        }
        String s2 = BrandSafetyUtils.s(str3);
        Logger.d(this.a, "Uploading impression - ad type ", cVar.p, ", file hash is ", s2, ", imageToUpload = ", str, ", match ? ", Boolean.valueOf(str.startsWith(s2)), ", fingerprint = ", str2);
        if (!str.startsWith(s2)) {
            Logger.d(this.a, "Uploading impression - fileHash ", s2, ", imageToUpload = ", str, " does not match, not uploading");
            return;
        }
        try {
        } catch (IOException e) {
            if (i2 < 2) {
                int i3 = com.safedk.android.a.g.h[i2];
                Logger.d(this.a, "IOException when uploading file, next retry in ", Integer.valueOf(i3), " ms, file: ", str3);
                this.E.schedule(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.b.2
                    @Override // java.lang.Runnable
                    public void run() {
                        b.this.a(str, bVar, aVar, str2, i2 + 1);
                    }
                }, i3, TimeUnit.MILLISECONDS);
                return;
            }
            Logger.d(this.a, "IOException when uploading file ", str3, " : ", e.getMessage(), e);
            return;
        } catch (Throwable th) {
            Logger.e(this.a, "Failed to upload file ", str3, " : ", th.getMessage(), th);
            aVar2 = null;
        }
        if (bVar != null) {
            aVar2 = new com.safedk.android.a.c(str3, str, SafeDK.getInstance().L(), bVar).a();
        } else {
            if (aVar == null) {
                aVar2 = null;
                if (aVar2 != null) {
                    Logger.d(this.a, "upload response is null, imageToUpload = ", str);
                    i(str);
                } else {
                    String a = aVar2.a();
                    String c2 = aVar2.c();
                    if (str4 == null) {
                        BrandSafetyEvent.AdFormatType a2 = BrandSafetyUtils.a(cVar.r());
                        str4 = a2 != null ? a2.name() : null;
                    }
                    if (str4 != null) {
                        c = 0;
                    } else {
                        str4 = BrandSafetyUtils.a(this.c).name();
                        c = 0;
                        Logger.d(this.a, "adFormat set to ", str4);
                    }
                    String str6 = this.a;
                    Object[] objArr = new Object[4];
                    objArr[c] = "Upload impression image succeeded: ";
                    objArr[1] = a;
                    objArr[2] = ", return code =";
                    objArr[3] = Integer.valueOf(aVar2.b());
                    Logger.d(str6, objArr);
                    if (a != null && !a.isEmpty()) {
                        Bundle bundle = new Bundle();
                        try {
                            bundle.putString(FileUploadManager.c, str2);
                            bundle.putString("ad_format_type", str4);
                            bundle.putString("image_url", a);
                            bundle.putString("image_orientation", screenShotOrientation.name().toLowerCase());
                            bundle.putString("platform", "android");
                            bundle.putString("image_id", c2);
                            bundle.putString("package", SafeDK.getInstance().m().getPackageName());
                        } catch (Throwable th2) {
                            Logger.e(this.a, th2.getMessage(), th2);
                            new CrashReporter().caughtException(th2);
                        }
                        g.a(bundle);
                        Logger.d(this.a, "Upload impression image - attempting to remove the file ", bundle.getString("image_url"));
                        h(str);
                    }
                }
                synchronized (this.C) {
                    this.C.remove(str);
                }
                Logger.d(this.a, "Upload impression image - number of loaded impressions to report ", Integer.valueOf(this.C.size()), " ", this.C.keySet());
                return;
            }
            aVar2 = new com.safedk.android.a.a(str3, str, SafeDK.getInstance().L(), aVar).a();
        }
        if (aVar2 != null) {
        }
        synchronized (this.C) {
        }
    }

    public synchronized void e() {
        Logger.d(this.a, "synchronize impressions and events - impression size is: ", Integer.valueOf(this.C.size()), " and keys: ", this.C.keySet(), ", isOnUiThread = ", Boolean.valueOf(com.safedk.android.utils.n.c()));
        Logger.d(this.a, "synchronize impressions and events - BrandSafetyEvents keys ", StatsCollector.c().a(StatsCollector.EventType.BrandSafety).keySet());
        ConcurrentHashMap<String, StatsEvent> a = StatsCollector.c().a(StatsCollector.EventType.BrandSafety);
        Iterator<Map.Entry<String, c>> it = this.C.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, c> next = it.next();
            c value = next.getValue();
            String key = next.getKey();
            l i2 = value.i();
            if (i2 != null) {
                if (i2.c != null && i2.c.b != null) {
                    Logger.d(this.a, "synchronize impressions and events - deleting file: ", i2.c.b);
                    BrandSafetyUtils.d(i2.c.b);
                }
                BrandSafetyEvent brandSafetyEvent = (BrandSafetyEvent) a.get(i2.a);
                if (brandSafetyEvent != null && key != null && key.equals(brandSafetyEvent.h())) {
                    if (brandSafetyEvent.h() != null) {
                        Logger.d(this.a, "synchronize impressions and events - clearing image hash value: ", brandSafetyEvent.h());
                        brandSafetyEvent.c();
                    }
                }
                String str = this.a;
                Object[] objArr = new Object[6];
                objArr[0] = "synchronize impressions and events - remove impressionId: ";
                objArr[1] = i2.a;
                objArr[2] = ", impression hash: ";
                objArr[3] = key;
                objArr[4] = ", event hash: ";
                objArr[5] = brandSafetyEvent != null ? brandSafetyEvent.h() : POBCommonConstants.NULL_VALUE;
                Logger.d(str, objArr);
                it.remove();
            }
        }
        Logger.d(this.a, "synchronize impressions and events - number of loaded impressions to report ", Integer.valueOf(this.C.size()), " ", this.C.keySet());
    }

    public static c k(String str) {
        if (str != null) {
            for (b bVar : SafeDK.getInstance().y()) {
                synchronized (bVar.C) {
                    Logger.d("AdFinderBase", "get impression ad info by image ID: ", str, ", type: ", bVar.a(), ", keys: ", bVar.C.keySet(), ", isOnUiThread = ", Boolean.valueOf(com.safedk.android.utils.n.c()));
                }
                c cVar = bVar.C.get(str);
                if (cVar != null) {
                    return cVar;
                }
            }
            return null;
        }
        return null;
    }

    @Override // com.safedk.android.analytics.brandsafety.a
    public c c(String str) {
        return null;
    }

    public c l(String str) {
        return null;
    }

    public void a(c cVar, l lVar) {
        if (cVar != null && lVar.c != null && lVar.c.a != null && lVar.a != null) {
            Logger.d(this.a, "add info collection for upload ", lVar.c.a, "_", lVar.a, ", file = ", lVar.c.b);
            synchronized (this.C) {
                this.C.put(lVar.c.a + "_" + lVar.a, cVar);
                Logger.d(this.a, "add info collection for upload - number of loaded impressions to report ", Integer.valueOf(this.C.size()), " ", this.C.keySet());
            }
        }
    }

    public boolean c(String str, String str2) {
        return this.C.containsKey(str + "_" + str2);
    }

    public boolean d(String str, String str2) {
        return this.D.contains(str + "_" + str2);
    }

    protected boolean d(String str, String str2, String str3) {
        boolean z2;
        BrandSafetyUtils.a b;
        try {
            if (new File(str).exists()) {
                Bitmap decodeFile = BitmapFactory.decodeFile(str);
                try {
                    if (!com.safedk.android.utils.n.a(decodeFile.getWidth(), decodeFile.getHeight()) && !com.safedk.android.utils.n.b(decodeFile.getWidth(), decodeFile.getHeight())) {
                        b = BrandSafetyUtils.a(str2, decodeFile);
                        z2 = BrandSafetyUtils.a(str2, b) == BrandSafetyUtils.ScreenshotValidity.VALID;
                        Logger.d(this.a, "Image file validation check hashValue = ", str3, ", dimen h,w: ", Integer.valueOf(decodeFile.getHeight()), StringUtils.COMMA, Integer.valueOf(decodeFile.getWidth()), ", bitmapScanResult result = ", b, ", isValid = ", Boolean.valueOf(z2), ", filename = ", str);
                        return z2;
                    }
                    Logger.d(this.a, "Image file validation check hashValue = ", str3, ", dimen h,w: ", Integer.valueOf(decodeFile.getHeight()), StringUtils.COMMA, Integer.valueOf(decodeFile.getWidth()), ", bitmapScanResult result = ", b, ", isValid = ", Boolean.valueOf(z2), ", filename = ", str);
                    return z2;
                } catch (Throwable th) {
                    th = th;
                    Logger.d(this.a, "Image file validation check exception : ", th.getMessage(), th);
                    return z2;
                }
                b = BrandSafetyUtils.b(str2, decodeFile);
                z2 = BrandSafetyUtils.b(str2, b) == BrandSafetyUtils.ScreenshotValidity.VALID;
            } else {
                Logger.d(this.a, "Image file validation check file does not exist = ", str);
                return true;
            }
        } catch (Throwable th2) {
            th = th2;
            z2 = true;
        }
    }

    protected String a(List<p> list) {
        if (list == null || list.size() == 0) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder(X3.j.d);
        for (int i2 = 0; i2 < list.size() - 1; i2++) {
            sb.append(list.get(i2).a.ak());
            sb.append(", ");
        }
        sb.append(list.get(list.size() - 1).a.ak());
        sb.append(X3.j.e);
        return sb.toString();
    }

    protected static String[] a(Activity activity) {
        String str;
        String str2 = null;
        if (activity == null) {
            str = null;
        } else {
            String obj = activity.toString();
            String a = BrandSafetyUtils.a(obj, true);
            str2 = BrandSafetyUtils.a(obj, false);
            str = a;
        }
        return new String[]{str2, str};
    }

    protected void a(c cVar) {
        if (cVar != null && !cVar.I) {
            Logger.d(this.a, Logger.FeatureTag.AD_CAPTURE, "clearing any images taken previously");
            l i2 = cVar.i();
            if (i2 != null) {
                a(i2);
            }
            cVar.I = true;
            return;
        }
        Logger.d(this.a, "avoid clearing any images taken previously");
    }

    public void a(l lVar) {
        String str = this.a;
        Object[] objArr = new Object[4];
        objArr[0] = "remove impression screenshots started with impression: ";
        objArr[1] = lVar;
        objArr[2] = ", report impression size is: ";
        Set<String> set = this.D;
        objArr[3] = set != null ? Integer.valueOf(set.size()) : POBCommonConstants.NULL_VALUE;
        Logger.d(str, objArr);
        if (lVar != null) {
            String str2 = lVar.d;
            if (str2 == null && lVar.c != null) {
                str2 = lVar.c.b;
            }
            if (str2 != null) {
                Logger.d(this.a, "Calling remove ad files, filename = ", str2);
                BrandSafetyUtils.d(str2);
                lVar.d = null;
            } else {
                Logger.d(this.a, "lastActivityImpressionScreenshotFilename is null and image is: ", lVar.c);
            }
        }
        this.D.clear();
    }

    public static boolean a(c cVar, CreativeInfo creativeInfo) {
        String a;
        return CreativeInfoManager.a(creativeInfo.R() == null ? creativeInfo.Q() : creativeInfo.R(), AdNetworkConfiguration.REPLACE_PREFETCH_CREATIVE_ID_WITH_MAX_CREATIVE_ID, false) && (a = CreativeInfoManager.a(creativeInfo.Q(), AdNetworkConfiguration.REPLACE_PREFETCH_CREATIVE_ID_WITH_MAX_CREATIVE_ID_MAX_NETWORK_NAMES, (String) null)) != null && a.contains(cVar.A()) && cVar.z() != null;
    }

    protected void b(c cVar, CreativeInfo creativeInfo) {
        Logger.d(this.a, "should replace prefetch creativeId with max value, ad info sdk : ", cVar.c(), ", ci sdk : ", creativeInfo.Q(), ", actual sdk : ", creativeInfo.R());
        if (a(cVar, creativeInfo)) {
            Logger.d(this.a, "updating creativeId from ", cVar.j().N(), " to ", cVar.z());
            cVar.j().k(cVar.z());
        }
    }

    static void a(ViewGroup viewGroup, List<WeakReference<View>> list) {
        if (viewGroup == null) {
            return;
        }
        for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
            View childAt = viewGroup.getChildAt(i2);
            list.add(new WeakReference<>(childAt));
            if (childAt instanceof ViewGroup) {
                a((ViewGroup) childAt, list);
            }
        }
    }

    static List<WeakReference<View>> a(ViewGroup viewGroup) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new WeakReference(viewGroup));
        a(viewGroup, arrayList);
        return arrayList;
    }

    protected List<WeakReference<WebView>> b(List<WeakReference<View>> list) {
        ArrayList arrayList = new ArrayList();
        for (WeakReference<View> weakReference : list) {
            if (com.safedk.android.utils.n.a((Reference<?>) weakReference) && (weakReference.get() instanceof WebView)) {
                WebView webView = (WebView) weakReference.get();
                arrayList.add(new WeakReference(webView));
                Logger.d(this.a, "getWebViews added WebView address ", webView);
            }
        }
        return arrayList;
    }

    static List<String> c(List<WeakReference<View>> list) {
        ArrayList arrayList = new ArrayList();
        for (WeakReference<View> weakReference : list) {
            if (com.safedk.android.utils.n.a((Reference<?>) weakReference)) {
                arrayList.add(BrandSafetyUtils.a(weakReference.get()));
            } else {
                arrayList.add("");
            }
        }
        return arrayList;
    }

    public Activity a(Context context) {
        while (context instanceof ContextWrapper) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            context = ((ContextWrapper) context).getBaseContext();
            Logger.d(this.a, "getActivity: now context type is: ", context.getClass().getName());
        }
        return null;
    }

    static Activity a(Bundle bundle) {
        Logger.d("AdFinderBase", "getMaxAdViewActivity: started", ", isOnUiThread = ", Boolean.valueOf(com.safedk.android.utils.n.c()));
        String o2 = BrandSafetyUtils.o(bundle.getString(t, null));
        Activity foregroundActivity = com.safedk.android.internal.b.getInstance().getForegroundActivity();
        try {
            Iterator<WeakReference<Activity>> it = com.safedk.android.internal.b.getInstance().getAppActivities().iterator();
            while (it.hasNext()) {
                WeakReference<Activity> next = it.next();
                if (next != null && next.get() != null) {
                    Activity activity = next.get();
                    View findViewById = activity.findViewById(R.id.content);
                    if ((findViewById instanceof ViewGroup) && c(a((ViewGroup) findViewById)).contains(o2)) {
                        Logger.d("AdFinderBase", "getMaxAdViewActivity: found activity with name ", activity.getClass().getName());
                        return activity;
                    }
                }
            }
        } catch (Exception e) {
            Logger.d("AdFinderBase", "getMaxAdViewActivity: exception occurred ", e.getMessage());
        }
        return foregroundActivity;
    }

    void b(Activity activity) {
        String a = BrandSafetyUtils.a(com.safedk.android.internal.b.getInstance().getForegroundActivity().getClass().getName(), true);
        String a2 = BrandSafetyUtils.a(activity.getClass().getName(), true);
        if (a2 != null && !a2.equals(a)) {
            Logger.d(this.a, "compare ad activity to foreground found ad activity different than foreground, ", "foreground address is: ", a, ", and activity address is: ", a2);
        }
    }

    @Override // com.safedk.android.analytics.brandsafety.a
    public void c(String str, String str2, String str3) {
    }

    public static boolean e(String str, String str2) {
        m mVar;
        if (str != null && (mVar = F.get(str)) != null) {
            return mVar.a(str2);
        }
        return false;
    }

    public static void a(String str, Long l2, Long l3, String str2, m.a... aVarArr) {
        if (str != null) {
            synchronized (F) {
                m mVar = F.get(str);
                if (mVar == null) {
                    mVar = new m();
                    F.put(str, mVar);
                    Logger.d("AdFinderBase", "add impression log event - key: ", str, ", impression log map size: ", Integer.valueOf(F.size()));
                }
                mVar.a(l2, l3, str2, aVarArr);
            }
            return;
        }
        Logger.d("AdFinderBase", "add impression log event - event id is null, not adding impression log event");
    }

    public static void a(String str, String str2, m.a... aVarArr) {
        if (str != null) {
            synchronized (F) {
                m mVar = F.get(str);
                if (mVar == null) {
                    mVar = new m();
                    F.put(str, mVar);
                    Logger.d("AdFinderBase", "add impression log event - key: ", str, ", impression log map size: ", Integer.valueOf(F.size()));
                }
                mVar.a(str2, aVarArr);
            }
            return;
        }
        Logger.d("AdFinderBase", "add impression log event - event id is null, not adding impression log event");
    }

    public static void a(c cVar, String str, m.a... aVarArr) {
        if (cVar != null) {
            if (cVar.K != null) {
                a(cVar.K, str, aVarArr);
                return;
            } else {
                cVar.a(str, aVarArr);
                return;
            }
        }
        Logger.d("AdFinderBase", "add impression log event - event id is null, not adding impression log event");
    }

    public static void b(String str, String str2, m.a... aVarArr) {
        if (str != null) {
            synchronized (F) {
                m mVar = F.get(str);
                if (mVar == null) {
                    mVar = new m();
                    F.put(str, mVar);
                    Logger.d("AdFinderBase", "add cumulative impression log event - key: ", str, ", impression log map size: ", Integer.valueOf(F.size()));
                }
                mVar.b(str2, aVarArr);
            }
            return;
        }
        Logger.d("AdFinderBase", "add cumulative impression log event - event id is null, not adding impression log event");
    }

    protected static void b(c cVar) {
        if (cVar != null) {
            synchronized (F) {
                if (cVar.L != null && F.remove(cVar.L) != null) {
                    Logger.d("AdFinderBase", "clear impression log, eventId: ", cVar.L, ", impression log map size: ", Integer.valueOf(F.size()));
                }
                if (cVar.x() != null) {
                    for (String str : cVar.x()) {
                        if (str != null && F.remove(str) != null) {
                            Logger.d("AdFinderBase", "clear impression log, viewAddress: ", str, ", impression log map size: ", Integer.valueOf(F.size()));
                        }
                    }
                } else if (cVar.K != null && F.remove(cVar.K) != null) {
                    Logger.d("AdFinderBase", "clear impression log, viewAddress: ", cVar.K, ", impression log map size: ", Integer.valueOf(F.size()));
                }
            }
        }
    }

    protected static m b(c cVar, l lVar) {
        m remove;
        m remove2;
        m remove3;
        if (cVar != null && lVar != null) {
            synchronized (F) {
                if (cVar.L != null && (remove3 = F.remove(cVar.L)) != null) {
                    cVar.R.a(remove3);
                    Logger.d("AdFinderBase", "collect impression logs - key: ", cVar.L, ", events: ", Integer.valueOf(remove3.a()), ", impression log map size: ", Integer.valueOf(F.size()));
                }
                if (!cVar.U) {
                    if (cVar.x() != null) {
                        for (String str : cVar.x()) {
                            if (str != null && (remove2 = F.remove(str)) != null) {
                                lVar.h.a(remove2);
                                Logger.d("AdFinderBase", "collect impression logs - key: ", str, ", events: ", Integer.valueOf(remove2.a()), ", impression log map size: ", Integer.valueOf(F.size()));
                            }
                        }
                    } else if (cVar.K != null && (remove = F.remove(cVar.K)) != null) {
                        lVar.h.a(remove);
                        Logger.d("AdFinderBase", "collect impression logs - key: ", cVar.K, ", events: ", Integer.valueOf(remove.a()), ", impression log map size: ", Integer.valueOf(F.size()));
                    }
                }
            }
            m mVar = new m(cVar.R);
            mVar.a(lVar.h);
            StringBuilder sb = new StringBuilder("collect impression logs, ad info: ");
            sb.append(cVar.R.a());
            sb.append(", impression: ");
            sb.append(lVar.h.a());
            if (lVar.j() != null) {
                m E = lVar.j().E();
                mVar.a(E);
                sb.append(", ci: ");
                sb.append(E.a());
            }
            sb.append(", total: ");
            sb.append(mVar.a());
            Logger.d("AdFinderBase", sb.toString());
            return mVar;
        }
        return null;
    }

    public static List<String> a(View view) {
        if (view == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            arrayList.add(parent.toString());
        }
        return arrayList;
    }

    public static List<ViewParent> b(View view) {
        ArrayList arrayList = new ArrayList();
        for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            arrayList.add(parent);
        }
        return arrayList;
    }

    public static void a(ViewGroup viewGroup, List<String> list, List<String> list2, int i2) {
        if (viewGroup == null) {
            return;
        }
        int i3 = i2 + 1;
        int i4 = 0;
        while (i4 < viewGroup.getChildCount()) {
            View childAt = viewGroup.getChildAt(i4);
            list.add(BrandSafetyUtils.a(childAt));
            StringBuilder sb = new StringBuilder();
            sb.append("h");
            sb.append(i3);
            sb.append("c");
            i4++;
            sb.append(i4);
            sb.append(":");
            sb.append(childAt);
            list2.add(sb.toString());
            if (childAt instanceof ViewGroup) {
                a((ViewGroup) childAt, list, list2, i3);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0, types: [android.webkit.WebView] */
    /* JADX WARN: Type inference failed for: r14v1, types: [android.view.ViewParent, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v2, types: [android.view.ViewParent] */
    public static BrandSafetyUtils.AdType a(String str, WebView webView) {
        if (webView != 0) {
            AdNetworkDiscovery j2 = CreativeInfoManager.j(str);
            do {
                if (webView instanceof View) {
                    View view = webView;
                    if (com.safedk.android.utils.n.a(view.getWidth(), view.getHeight())) {
                        Logger.d("AdFinderBase", "extract ad type from view: ", view, ", BANNER ratio", ", isOnUiThread = ", Boolean.valueOf(com.safedk.android.utils.n.c()));
                        return BrandSafetyUtils.AdType.BANNER;
                    }
                    if (com.safedk.android.utils.n.b(view.getWidth(), view.getHeight())) {
                        Logger.d("AdFinderBase", "extract ad type from view: ", view, ", MREC ratio", ", isOnUiThread = ", Boolean.valueOf(com.safedk.android.utils.n.c()));
                        return BrandSafetyUtils.AdType.MREC;
                    }
                    if (webView instanceof MaxAdView) {
                        BrandSafetyUtils.AdType adType = BannerFinder.f().get(BrandSafetyUtils.a(webView));
                        if (adType != null) {
                            Logger.d("AdFinderBase", "extract ad type from view: ", view, ", MaxAdView type: ", adType.name(), ", isOnUiThread = ", Boolean.valueOf(com.safedk.android.utils.n.c()));
                            return adType;
                        }
                    } else {
                        if ((webView instanceof MaxNativeAdView) || webView.getClass().getName().equals("com.applovin.reactnative.AppLovinMAXNativeAdView")) {
                            Logger.d("AdFinderBase", "extract ad type from view: ", view, ", native ad view", ", isOnUiThread = ", Boolean.valueOf(com.safedk.android.utils.n.c()));
                            return BrandSafetyUtils.AdType.NATIVE;
                        }
                        if (j2 != null) {
                            BrandSafetyUtils.AdType f2 = j2.f(view);
                            if (f2 != null) {
                                Logger.d("AdFinderBase", "extract ad type from view: ", view, ", discovery detected type: ", f2);
                                return f2;
                            }
                        } else if (com.safedk.android.internal.b.getInstance().isInterstitialActivity(view.getContext()) && SafeDK.getInstance().A().c(BrandSafetyUtils.a(view)) == null) {
                            Logger.d("AdFinderBase", "extract ad type from view: ", view, ", INTERSTITIAL activity: ", view.getContext(), ", isOnUiThread = ", Boolean.valueOf(com.safedk.android.utils.n.c()));
                            return BrandSafetyUtils.AdType.INTERSTITIAL;
                        }
                    }
                }
                webView = webView.getParent();
            } while (webView != 0);
            return null;
        }
        return null;
    }

    @Override // com.safedk.android.analytics.brandsafety.a
    public void a(Bitmap bitmap, c cVar) {
    }

    @Override // com.safedk.android.analytics.brandsafety.a
    public void b() {
    }

    @Override // com.safedk.android.analytics.brandsafety.a
    public void c() {
    }

    protected void b(ViewGroup viewGroup, List<WeakReference<WebView>> list) {
        for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
            try {
                View childAt = viewGroup.getChildAt(i2);
                if (childAt instanceof WebView) {
                    list.add(new WeakReference<>((WebView) childAt));
                    String str = this.a;
                    Object[] objArr = new Object[4];
                    objArr[0] = "find WebViews in view group - found view: ";
                    objArr[1] = childAt;
                    objArr[2] = " , parent: ";
                    objArr[3] = childAt.getParent() != null ? childAt.getParent().toString() : POBCommonConstants.NULL_VALUE;
                    Logger.d(str, objArr);
                } else if (childAt instanceof ViewGroup) {
                    b((ViewGroup) childAt, list);
                }
            } catch (Throwable th) {
                Logger.d(this.a, "caught exception: ", th);
                return;
            }
        }
    }

    static void c(ViewGroup viewGroup, List<WeakReference<View>> list) {
        if (viewGroup == null) {
            return;
        }
        View view = list.get(0).get();
        long width = view.getWidth() * view.getHeight();
        for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
            View childAt = viewGroup.getChildAt(i2);
            long width2 = childAt.getWidth() * childAt.getHeight();
            if (width > 0 && width2 > 0 && (width2 / width) * 100.0f >= A) {
                list.add(new WeakReference<>(childAt));
            }
            if (childAt instanceof ViewGroup) {
                c((ViewGroup) childAt, list);
            }
        }
    }

    public c b(String str, z zVar) {
        w wVar;
        String c = zVar.c();
        c c2 = c(c);
        if (c2 != null && c2.c().equals(str)) {
            char c3 = 0;
            Logger.d(this.a, "handle website opened for ", str, " ", c2.p.name(), ", view address: ", zVar.c(), ", requested URL: ", zVar.a(), ", target URL: ", zVar.b());
            RedirectData redirectData = new RedirectData(str, BrandSafetyUtils.a(c2.p));
            long elapsedRealtime = SystemClock.elapsedRealtime();
            int h2 = SafeDK.getInstance().h();
            int size = c2.x().size() - 1;
            boolean z2 = false;
            w wVar2 = null;
            while (true) {
                if (size < 0) {
                    wVar = wVar2;
                    break;
                }
                wVar = DetectTouchUtils.a(str, c2.x().get(size));
                long longValue = wVar == null ? 0L : wVar.a.longValue();
                String str2 = this.a;
                Object[] objArr = new Object[8];
                objArr[c3] = "handle website opened, view: ";
                objArr[1] = c;
                objArr[2] = ", last touch event time: ";
                objArr[3] = Long.valueOf(longValue);
                objArr[4] = ", diff: ";
                long j2 = elapsedRealtime - longValue;
                objArr[5] = Long.valueOf(j2);
                objArr[6] = ", threshold: ";
                objArr[7] = Integer.valueOf(h2);
                Logger.d(str2, objArr);
                z2 = (h2 == 0 || longValue == 0 || j2 > ((long) h2)) ? false : true;
                if (z2) {
                    break;
                }
                size--;
                wVar2 = wVar;
                c3 = 0;
            }
            zVar.a(c2);
            zVar.a(wVar);
            zVar.e();
            l i2 = c2.i();
            if (i2 != null) {
                redirectData.a(zVar.a(), zVar.b());
                redirectData.l = !z2;
                String str3 = this.a;
                Object[] objArr2 = new Object[12];
                objArr2[0] = "handle ";
                objArr2[1] = redirectData.l ? "auto " : "";
                objArr2[2] = "website opened for ";
                objArr2[3] = str;
                objArr2[4] = " ";
                objArr2[5] = c2.p.name();
                objArr2[6] = ", view address: ";
                objArr2[7] = c;
                objArr2[8] = ", requested URL: ";
                objArr2[9] = zVar.a();
                objArr2[10] = ", redirect URL: ";
                objArr2[11] = zVar.b();
                Logger.d(str3, objArr2);
                i2.a(redirectData);
                return c2;
            }
            return null;
        }
        return null;
    }

    public void a(v vVar) {
        this.G.add(vVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x01a5 A[LOOP:0: B:26:0x0127->B:38:0x01a5, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01a2 A[SYNTHETIC] */
    @Override // com.safedk.android.analytics.brandsafety.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public c a(String str, RedirectDetails redirectDetails, n nVar, boolean z2, boolean z3) {
        String str2;
        String str3;
        boolean z4;
        char c = 0;
        String str4 = "handle ";
        int i2 = 10;
        Logger.d(this.a, Logger.FeatureTag.REDIRECTS, "handle ", redirectDetails.e.name().toLowerCase(), " for ", str, " ", this.c.name(), ", view address: ", redirectDetails.f, ", requested URL: ", redirectDetails.g, ", redirect URL: ", nVar.d, ", isOnUiThread = ", Boolean.valueOf(com.safedk.android.utils.n.c()));
        RedirectData redirectData = new RedirectData(str, BrandSafetyUtils.a(redirectDetails.d));
        if (redirectDetails.e == RedirectDetails.RedirectType.REDIRECT) {
            String str5 = nVar.f;
            if (TextUtils.isEmpty(str5)) {
                str5 = z2 ? "external" : RedirectEvent.i;
            }
            redirectData.a(redirectDetails.g, nVar.d, str5);
        } else if (redirectDetails.e == RedirectDetails.RedirectType.EXPAND) {
            redirectData.b(redirectDetails.g, nVar.d, nVar.e);
            redirectData.a("expandedWebviewAddress=" + nVar.e);
        }
        if (redirectData.i || redirectData.j) {
            if (redirectDetails.i != null) {
                redirectData.a("prev " + redirectDetails.i);
            }
            if (nVar.g != null) {
                redirectData.a("prev " + nVar.g);
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            int f2 = SafeDK.getInstance().f();
            c c2 = c(redirectDetails.f);
            String str6 = m.K;
            if (c2 != null && str.equals(c2.v)) {
                int size = c2.m.size() - 1;
                String str7 = null;
                boolean z5 = false;
                while (true) {
                    if (size < 0) {
                        str2 = str6;
                        str3 = str4;
                        break;
                    }
                    String str8 = c2.m.get(size);
                    w a = DetectTouchUtils.a(str, str8);
                    long longValue = a == null ? 0L : a.a.longValue();
                    String str9 = this.a;
                    str2 = str6;
                    Logger.FeatureTag featureTag = Logger.FeatureTag.REDIRECTS;
                    Object[] objArr = new Object[i2];
                    objArr[c] = str4;
                    objArr[1] = redirectDetails.e.name().toLowerCase();
                    objArr[2] = ", view: ";
                    objArr[3] = str8;
                    objArr[4] = ", last touch event time: ";
                    objArr[5] = Long.valueOf(longValue);
                    objArr[6] = ", diff: ";
                    long j2 = elapsedRealtime - longValue;
                    objArr[7] = Long.valueOf(j2);
                    objArr[8] = ", threshold: ";
                    objArr[9] = Integer.valueOf(f2);
                    Logger.d(str9, featureTag, objArr);
                    if (f2 == 0 || longValue == 0) {
                        str3 = str4;
                    } else {
                        str3 = str4;
                        if (j2 <= f2) {
                            z5 = true;
                            if (z5) {
                                size--;
                                str4 = str3;
                                str7 = str8;
                                str6 = str2;
                                c = 0;
                                i2 = 10;
                            } else {
                                str7 = str8;
                                break;
                            }
                        }
                    }
                    z5 = false;
                    if (z5) {
                    }
                }
                if (!z5 && CreativeInfoManager.a(str, AdNetworkConfiguration.SHOULD_CHECK_ACTIVITY_CLICK_FOR_REDIRECTS, false) && !TextUtils.isEmpty(c2.B)) {
                    w a2 = DetectTouchUtils.a(str, c2.B);
                    long longValue2 = a2 == null ? 0L : a2.a.longValue();
                    long j3 = elapsedRealtime - longValue2;
                    Logger.d(this.a, Logger.FeatureTag.REDIRECTS, str3, redirectDetails.e.name().toLowerCase(), ", activity address: ", str7, ", last touch event time: ", Long.valueOf(longValue2), ", diff: ", Long.valueOf(j3), ", threshold: ", Integer.valueOf(f2));
                    z5 = (f2 == 0 || longValue2 == 0 || j3 > ((long) f2)) ? false : true;
                }
                redirectData.l = !z5;
                String str10 = this.a;
                Logger.FeatureTag featureTag2 = Logger.FeatureTag.REDIRECTS;
                Object[] objArr2 = new Object[13];
                objArr2[0] = str3;
                objArr2[1] = redirectData.l ? "auto " : "";
                objArr2[2] = redirectDetails.e.name().toLowerCase();
                objArr2[3] = " for ";
                objArr2[4] = str;
                objArr2[5] = " ";
                objArr2[6] = this.c.name();
                objArr2[7] = ", view address: ";
                objArr2[8] = redirectDetails.f;
                objArr2[9] = ", requested URL: ";
                objArr2[10] = redirectDetails.g;
                objArr2[11] = ", redirect URL: ";
                objArr2[12] = nVar.d;
                Logger.d(str10, featureTag2, objArr2);
                if (z3) {
                    if (redirectData.j || (redirectData.i && redirectData.l)) {
                        if (redirectData.t == null) {
                            redirectData.t = BrandSafetyUtils.a(this.c);
                        }
                        if (redirectData.j) {
                            c2.V = true;
                        }
                        l i3 = c2.i();
                        if (i3 != null) {
                            if (redirectData.j) {
                                m.a[] aVarArr = new m.a[1];
                                aVarArr[0] = new m.a(str2, redirectData.l ? "auto" : "regular");
                                c2.a("exp", aVarArr);
                                z4 = false;
                            } else {
                                m.a[] aVarArr2 = new m.a[1];
                                z4 = false;
                                aVarArr2[0] = new m.a(m.M, z2 ? "external" : RedirectEvent.i);
                                c2.a(m.x, aVarArr2);
                            }
                            i3.a(redirectData);
                            a(c2, "handleRedirect", z4);
                            return c2;
                        }
                        return null;
                    }
                    Logger.d(this.a, "skip reporting ", redirectDetails.e.name().toLowerCase(), " for ", str, " ", this.c.name(), ", view address: ", redirectDetails.f, ", requested URL: ", redirectDetails.g, ", redirect URL: ", nVar.d);
                    return null;
                }
                String str11 = str2;
                Logger.d(this.a, "add redirect intent log events to ad info, ", redirectDetails, ", ", nVar);
                Long l2 = nVar.a;
                Long l3 = nVar.b;
                m.a[] aVarArr3 = new m.a[2];
                aVarArr3[0] = new m.a(str11, nVar.f != null ? nVar.f : Constants.NORMAL);
                aVarArr3[1] = new m.a("url", nVar.d);
                c2.a(l2, l3, m.w, aVarArr3);
                return c2;
            }
            if (z3) {
                w a3 = DetectTouchUtils.a(str, redirectDetails.f);
                if (a3 == null) {
                    Logger.d(this.a, "handle ", redirectDetails.e.name().toLowerCase(), " for ", str, " ", this.c.name(), ", try to get last touch event from by package name only");
                    a3 = DetectTouchUtils.a(str);
                }
                long longValue3 = a3 == null ? 0L : a3.a.longValue();
                long j4 = elapsedRealtime - longValue3;
                Logger.d(this.a, Logger.FeatureTag.REDIRECTS, "handle ", redirectDetails.e.name().toLowerCase(), ", last touch event time: ", Long.valueOf(longValue3), ", diff: ", Long.valueOf(j4), ", threshold: ", Integer.valueOf(f2));
                redirectData.l = f2 == 0 || longValue3 == 0 || j4 > ((long) f2);
                if (redirectData.j || (redirectData.i && redirectData.l)) {
                    String str12 = this.a;
                    Logger.FeatureTag featureTag3 = Logger.FeatureTag.REDIRECTS;
                    Object[] objArr3 = new Object[9];
                    objArr3[0] = "handle ";
                    objArr3[1] = redirectData.l ? "auto " : "";
                    objArr3[2] = redirectDetails.e.name().toLowerCase();
                    objArr3[3] = " for ";
                    objArr3[4] = str;
                    objArr3[5] = " ";
                    objArr3[6] = this.c.name();
                    objArr3[7] = ", no banner info found, add to pending, webview: ";
                    objArr3[8] = redirectDetails.f;
                    Logger.d(str12, featureTag3, objArr3);
                    this.H.put(redirectDetails.f, redirectData);
                    return null;
                }
                String str13 = this.a;
                Logger.FeatureTag featureTag4 = Logger.FeatureTag.REDIRECTS;
                Object[] objArr4 = new Object[9];
                objArr4[0] = "handle ";
                objArr4[1] = redirectData.l ? "auto " : "";
                objArr4[2] = redirectDetails.e.name().toLowerCase();
                objArr4[3] = " for ";
                objArr4[4] = str;
                objArr4[5] = " ";
                objArr4[6] = this.c.name();
                objArr4[7] = ", no banner info found, don't add to pending, webview: ";
                objArr4[8] = redirectDetails.f;
                Logger.d(str13, featureTag4, objArr4);
                return null;
            }
            Logger.d(this.a, "add redirect intent log events to view address, ", redirectDetails, ", ", nVar);
            String str14 = redirectDetails.f;
            Long l4 = nVar.a;
            Long l5 = nVar.b;
            m.a[] aVarArr4 = new m.a[2];
            aVarArr4[0] = new m.a(m.K, nVar.f != null ? nVar.f : Constants.NORMAL);
            aVarArr4[1] = new m.a("url", nVar.d);
            a(str14, l4, l5, m.w, aVarArr4);
            return null;
        }
        return null;
    }

    @Override // com.safedk.android.analytics.brandsafety.a
    public void a(c cVar, String str, boolean z2) {
    }
}
