package com.vungle.ads.internal.load;

import android.content.Context;
import android.webkit.URLUtil;
import com.vungle.ads.AdExpiredError;
import com.vungle.ads.AdPayloadError;
import com.vungle.ads.AdResponseEmptyError;
import com.vungle.ads.AssetWriteError;
import com.vungle.ads.InvalidAssetUrlError;
import com.vungle.ads.InvalidEventIdError;
import com.vungle.ads.InvalidTemplateURLError;
import com.vungle.ads.NativeAssetError;
import com.vungle.ads.OmSdkJsError;
import com.vungle.ads.PlacementMismatchError;
import com.vungle.ads.VungleError;
import com.vungle.ads.internal.AnalyticsClient;
import com.vungle.ads.internal.ConfigManager;
import com.vungle.ads.internal.m2;
import com.vungle.ads.internal.model.h0;
import com.vungle.ads.internal.model.o;
import com.vungle.ads.internal.model.v;
import com.vungle.ads.internal.model.v2;
import com.vungle.ads.internal.n2;
import com.vungle.ads.internal.network.VungleApiClient;
import com.vungle.ads.internal.network.p;
import com.vungle.ads.internal.network.r;
import com.vungle.ads.internal.presenter.e0;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.internal.util.PathProvider;
import com.vungle.ads.internal.util.s;
import com.vungle.ads.internal.util.t;
import com.vungle.ads.internal.util.u;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* loaded from: classes6.dex */
public abstract class g {
    public final Context a;
    public final VungleApiClient b;
    public final com.vungle.ads.internal.executor.a c;
    public final com.vungle.ads.internal.omsdk.c d;
    public final com.vungle.ads.internal.downloader.m e;
    public final PathProvider f;
    public final b g;
    public final AtomicLong h;
    public final LinkedHashSet i;
    public a j;
    public AtomicBoolean k;
    public AtomicBoolean l;
    public final ArrayList m;
    public h0 n;
    public AtomicBoolean o;
    public AtomicBoolean p;
    public final n2 q;
    public m2 r;
    public m2 s;
    public n2 t;
    public n2 u;
    public n2 v;
    public n2 w;
    public s x;
    public long y;

    public g(Context context, VungleApiClient vungleApiClient, com.vungle.ads.internal.executor.d sdkExecutors, com.vungle.ads.internal.omsdk.c omInjector, com.vungle.ads.internal.downloader.m downloader, PathProvider pathProvider, b adRequest) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(vungleApiClient, "vungleApiClient");
        Intrinsics.checkNotNullParameter(sdkExecutors, "sdkExecutors");
        Intrinsics.checkNotNullParameter(omInjector, "omInjector");
        Intrinsics.checkNotNullParameter(downloader, "downloader");
        Intrinsics.checkNotNullParameter(pathProvider, "pathProvider");
        Intrinsics.checkNotNullParameter(adRequest, "adRequest");
        this.a = context;
        this.b = vungleApiClient;
        this.c = sdkExecutors;
        this.d = omInjector;
        this.e = downloader;
        this.f = pathProvider;
        this.g = adRequest;
        this.h = new AtomicLong(0L);
        this.i = new LinkedHashSet();
        this.k = new AtomicBoolean(false);
        this.l = new AtomicBoolean(false);
        this.m = new ArrayList();
        this.o = new AtomicBoolean(true);
        this.p = new AtomicBoolean(true);
        this.q = new n2(Sdk.SDKMetric.SDKMetricType.AD_REQUEST_TO_RESPONSE_DURATION_MS);
        this.r = new m2(Sdk.SDKMetric.SDKMetricType.ASSET_FILE_SIZE);
        this.s = new m2(Sdk.SDKMetric.SDKMetricType.TEMPLATE_HTML_SIZE);
        this.t = new n2(Sdk.SDKMetric.SDKMetricType.ASSET_DOWNLOAD_DURATION_MS);
        this.u = new n2(Sdk.SDKMetric.SDKMetricType.AD_REQUIRED_DOWNLOAD_DURATION_MS);
        this.v = new n2(Sdk.SDKMetric.SDKMetricType.AD_OPTIONAL_DOWNLOAD_DURATION_MS);
        this.w = new n2(Sdk.SDKMetric.SDKMetricType.AD_PRELOAD_TO_READY_DURATION_MS);
    }

    public final com.vungle.ads.internal.executor.a g() {
        return this.c;
    }

    public final VungleApiClient h() {
        return this.b;
    }

    public abstract void i();

    public final void j() {
        h0 h0Var = this.n;
        if (h0Var == null || this.l.get() || !this.k.compareAndSet(false, true)) {
            return;
        }
        if (h0Var.G()) {
            this.w.e();
            String valueOf = String.valueOf(h0Var.p());
            boolean z = u.a;
            t.c("BaseAdLoader", "start preloading");
            long currentTimeMillis = System.currentTimeMillis() - this.y;
            ReentrantLock reentrantLock = e0.a;
            e0.a(this.a, h0Var, this.g.c(), valueOf, h0Var.v(), new e(this, h0Var), Long.valueOf(currentTimeMillis));
        } else {
            i();
            a aVar = this.j;
            if (aVar != null) {
                aVar.onSuccess(h0Var);
            }
        }
        ((com.vungle.ads.internal.task.s) ((com.vungle.ads.internal.task.h) LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, new f(this.a)).getValue())).a(com.vungle.ads.internal.task.k.a());
    }

    public abstract void k();

    public static final void a(g gVar, b bVar) {
        gVar.getClass();
        boolean z = u.a;
        t.a("BaseAdLoader", "All download completed " + bVar);
        h0 h0Var = gVar.n;
        if (h0Var != null) {
            h0Var.f = true;
        }
        gVar.j();
        gVar.t.d();
        AnalyticsClient analyticsClient = AnalyticsClient.INSTANCE;
        AnalyticsClient.a(analyticsClient, gVar.t, gVar.x, 4);
        gVar.v.d();
        AnalyticsClient.a(analyticsClient, gVar.v, gVar.x, 4);
    }

    public static final void g(g gVar) {
        gVar.u.d();
        AnalyticsClient.a(AnalyticsClient.INSTANCE, gVar.u, gVar.x, 4);
        gVar.j();
    }

    public static final void h(g this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.q.e();
        this$0.k();
    }

    public final b b() {
        return this.g;
    }

    public final h0 c() {
        return this.n;
    }

    public final Context d() {
        return this.a;
    }

    public final s e() {
        return this.x;
    }

    public final PathProvider f() {
        return this.f;
    }

    public static final boolean a(g gVar, com.vungle.ads.internal.model.b bVar, h0 h0Var) {
        gVar.getClass();
        if (h0Var == null || !bVar.i() || bVar.c.length() == 0) {
            return false;
        }
        File file = new File(bVar.c);
        if (!file.exists() || file.length() != bVar.h) {
            return false;
        }
        File b = gVar.f.b(h0Var.h());
        if (b != null && b.isDirectory()) {
            com.vungle.ads.internal.util.m mVar = com.vungle.ads.internal.util.n.a;
            return true;
        }
        boolean z = u.a;
        t.b("BaseAdLoader", "Unable to access Destination Directory");
        return false;
    }

    public final void a(s sVar) {
        this.x = sVar;
    }

    public final void a(com.vungle.ads.internal.s adLoaderCallback) {
        Intrinsics.checkNotNullParameter(adLoaderCallback, "adLoaderCallback");
        this.j = adLoaderCallback;
        this.y = System.currentTimeMillis();
        ((com.vungle.ads.internal.executor.d) this.c).b().execute(new Runnable() { // from class: com.vungle.ads.internal.load.g$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                g.h(g.this);
            }
        });
    }

    public final void a() {
        com.vungle.ads.internal.downloader.h hVar = (com.vungle.ads.internal.downloader.h) this.e;
        Iterator it = hVar.d.iterator();
        while (it.hasNext()) {
            com.vungle.ads.internal.downloader.k kVar = (com.vungle.ads.internal.downloader.k) it.next();
            if (kVar != null && !kVar.e.get()) {
                kVar.e.set(true);
            }
        }
        hVar.d.clear();
    }

    public final void a(VungleError error) {
        boolean z;
        Intrinsics.checkNotNullParameter(error, "error");
        if (this.k.get()) {
            return;
        }
        boolean z2 = true;
        if (this.l.compareAndSet(false, true)) {
            h0 h0Var = this.n;
            if (h0Var != null && h0Var.A()) {
                ArrayList arrayList = this.m;
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if (((com.vungle.ads.internal.model.b) next).k()) {
                        arrayList2.add(next);
                    } else {
                        arrayList3.add(next);
                    }
                }
                Pair pair = new Pair(arrayList2, arrayList3);
                List list = (List) pair.component1();
                List list2 = (List) pair.component2();
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        if (((com.vungle.ads.internal.model.b) it2.next()).i()) {
                            z = true;
                            break;
                        }
                    }
                }
                z = false;
                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                    Iterator it3 = list2.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            break;
                        } else if (!((com.vungle.ads.internal.model.b) it3.next()).i()) {
                            z2 = false;
                            break;
                        }
                    }
                }
                if (z && z2) {
                    this.l.set(false);
                    j();
                    return;
                }
            }
            a aVar = this.j;
            if (aVar != null) {
                aVar.onFailure(error);
            }
        }
    }

    public final void a(h0 advertisement, m2 m2Var) {
        com.vungle.ads.internal.downloader.j jVar;
        com.vungle.ads.internal.model.i c;
        Integer f;
        List e;
        Intrinsics.checkNotNullParameter(advertisement, "advertisement");
        this.n = advertisement;
        if (advertisement != null) {
            advertisement.E();
        }
        advertisement.a(this.x);
        s sVar = this.x;
        if (sVar != null) {
            sVar.d(advertisement.h());
        }
        s sVar2 = this.x;
        if (sVar2 != null) {
            sVar2.c(advertisement.n());
        }
        s sVar3 = this.x;
        if (sVar3 != null) {
            sVar3.b(advertisement.l());
        }
        s sVar4 = this.x;
        if (sVar4 != null) {
            sVar4.f(advertisement.t());
        }
        s sVar5 = this.x;
        if (sVar5 != null) {
            sVar5.h(advertisement.u());
        }
        s sVar6 = this.x;
        if (sVar6 != null) {
            sVar6.c(Boolean.valueOf(advertisement.B()));
        }
        s sVar7 = this.x;
        if (sVar7 != null) {
            sVar7.b(Boolean.valueOf(advertisement.b()));
        }
        s sVar8 = this.x;
        if (sVar8 != null) {
            sVar8.a(Boolean.valueOf(advertisement.y()));
        }
        s sVar9 = this.x;
        if (sVar9 != null) {
            sVar9.e(advertisement.o());
        }
        this.q.d();
        AnalyticsClient.a(AnalyticsClient.INSTANCE, this.q, this.x, 4);
        v2 f2 = advertisement.f();
        int i = 0;
        if (f2 != null) {
            ConfigManager.INSTANCE.a(this.a, f2, false, m2Var);
        }
        VungleError a = a(advertisement);
        if (a != null) {
            a(a.setLogEntry$vungle_ads_release(this.x).logError$vungle_ads_release());
            return;
        }
        File b = this.f.b(advertisement.h());
        if (b != null && b.isDirectory() && b.exists()) {
            h0 h0Var = this.n;
            if (h0Var != null && h0Var.C()) {
                try {
                    this.d.b();
                    this.d.a(this.f.getVmDir());
                } catch (Exception e2) {
                    boolean z = u.a;
                    StringBuilder a2 = com.iab.omid.library.vungle.internal.l.a("Failed to inject OMSDK: ");
                    a2.append(e2.getMessage());
                    t.b("BaseAdLoader", a2.toString());
                    Sdk.SDKError.Reason reason = Sdk.SDKError.Reason.OMSDK_JS_WRITE_FAILED;
                    StringBuilder a3 = com.iab.omid.library.vungle.internal.l.a("Failed to inject OMSDK: ");
                    a3.append(e2.getMessage());
                    new OmSdkJsError(reason, a3.toString()).setLogEntry$vungle_ads_release(this.x).logErrorNoReturnValue$vungle_ads_release();
                }
            }
            Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, new d(this.a));
            com.vungle.ads.internal.model.i c2 = advertisement.c();
            if (c2 != null && (e = c2.e()) != null) {
                Iterator it = e.iterator();
                while (it.hasNext()) {
                    ((r) lazy.getValue()).a(new p((String) it.next()).b("load_ad").a(this.x).a(), false);
                }
            }
            if (!this.m.isEmpty()) {
                this.m.clear();
            }
            this.m.addAll(advertisement.a(b));
            if (this.m.isEmpty()) {
                j();
                return;
            }
            this.t.e();
            this.u.e();
            this.v.e();
            this.h.set(this.m.size());
            h0 h0Var2 = this.n;
            if (h0Var2 != null && (c = h0Var2.c()) != null && (f = c.f()) != null) {
                i = f.intValue();
            }
            int coerceAtMost = RangesKt.coerceAtMost(i, 5);
            Iterator it2 = this.m.iterator();
            while (it2.hasNext()) {
                com.vungle.ads.internal.model.b bVar = (com.vungle.ads.internal.model.b) it2.next();
                if (bVar.d) {
                    jVar = com.vungle.ads.internal.downloader.j.CRITICAL;
                } else {
                    jVar = com.vungle.ads.internal.downloader.j.HIGHEST;
                }
                com.vungle.ads.internal.downloader.k kVar = new com.vungle.ads.internal.downloader.k(jVar, bVar, this.x, coerceAtMost);
                if (bVar.j()) {
                    kVar.g();
                }
                if (bVar.n()) {
                    this.i.add(bVar.h());
                }
                ((com.vungle.ads.internal.downloader.h) this.e).a(kVar, new c(this));
            }
            return;
        }
        a(new AssetWriteError("Invalid directory. " + b).setLogEntry$vungle_ads_release(this.x).logError$vungle_ads_release());
    }

    /* JADX WARN: Removed duplicated region for block: B:88:0x0174  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public VungleError a(h0 adPayload) {
        VungleError invalidTemplateURLError;
        o oVar;
        o oVar2;
        Intrinsics.checkNotNullParameter(adPayload, "adPayload");
        com.vungle.ads.internal.model.i c = adPayload.c();
        if (c != null && c.i() != null) {
            com.vungle.ads.internal.model.i c2 = adPayload.c();
            Integer b = c2 != null ? c2.b() : null;
            com.vungle.ads.internal.model.i c3 = adPayload.c();
            Integer i = c3 != null ? c3.i() : null;
            com.vungle.ads.internal.model.i c4 = adPayload.c();
            String str = "Response error: " + i + ", Request failed with error: " + b + ", " + (c4 != null ? c4.d() : null);
            if ((b != null && b.intValue() == 10001) || ((b != null && b.intValue() == 10002) || ((b != null && b.intValue() == 20001) || ((b != null && b.intValue() == 30001) || (b != null && b.intValue() == 30002))))) {
                Sdk.SDKError.Reason forNumber = Sdk.SDKError.Reason.forNumber(b.intValue());
                Intrinsics.checkNotNullExpressionValue(forNumber, "forNumber(errorCode)");
                return new AdPayloadError(forNumber, str);
            }
            return new AdPayloadError(Sdk.SDKError.Reason.PLACEMENT_SLEEP, str);
        }
        String b2 = this.g.c().b();
        h0 h0Var = this.n;
        if (!Intrinsics.areEqual(b2, h0Var != null ? h0Var.D() : null)) {
            StringBuilder a = com.iab.omid.library.vungle.internal.l.a("Waterfall request and responses placement don't match ");
            h0 h0Var2 = this.n;
            a.append(h0Var2 != null ? h0Var2.D() : null);
            a.append('.');
            return new PlacementMismatchError(a.toString());
        }
        com.vungle.ads.internal.model.i k = adPayload.k();
        v vVar = k != null ? k.u : null;
        if (vVar == null) {
            invalidTemplateURLError = new AdResponseEmptyError("Missing template settings");
        } else {
            Map map = vVar.b;
            if (adPayload.A()) {
                if (((map == null || (oVar2 = (o) map.get("MAIN_IMAGE")) == null) ? null : oVar2.a) == null) {
                    if (((map == null || (oVar = (o) map.get("MAIN_VIDEO")) == null) ? null : oVar.a) == null) {
                        invalidTemplateURLError = new NativeAssetError("Unable to load null main asset.");
                    }
                }
                o oVar3 = (o) map.get("VUNGLE_PRIVACY_ICON_URL");
                if ((oVar3 != null ? oVar3.a : null) == null) {
                    invalidTemplateURLError = new NativeAssetError("Unable to load null privacy image.");
                }
                if (map != null) {
                    for (Map.Entry entry : map.entrySet()) {
                        String str2 = ((o) entry.getValue()).a;
                        if (str2 == null || str2.length() == 0) {
                            StringBuilder a2 = com.iab.omid.library.vungle.internal.l.a("None asset URL for ");
                            a2.append((String) entry.getKey());
                            invalidTemplateURLError = new InvalidAssetUrlError(a2.toString());
                            break;
                        }
                        if (str2 == null || str2.length() == 0 || (!URLUtil.isHttpsUrl(str2) && !URLUtil.isHttpUrl(str2))) {
                            invalidTemplateURLError = new InvalidAssetUrlError(com.iab.omid.library.vungle.d.a("Invalid asset URL ", str2));
                            break;
                        }
                    }
                }
                invalidTemplateURLError = null;
            } else {
                com.vungle.ads.internal.model.i k2 = adPayload.k();
                String str3 = k2 != null ? k2.n : null;
                if (str3 == null || str3.length() == 0) {
                    invalidTemplateURLError = new InvalidTemplateURLError("Failed to prepare null vmURL for downloading.");
                } else {
                    if (str3 == null || str3.length() == 0 || (!URLUtil.isHttpsUrl(str3) && !URLUtil.isHttpUrl(str3))) {
                        invalidTemplateURLError = new InvalidTemplateURLError(com.iab.omid.library.vungle.d.a("Failed to load vm url: ", str3));
                    }
                    if (map != null) {
                    }
                    invalidTemplateURLError = null;
                }
            }
        }
        if (invalidTemplateURLError != null) {
            return invalidTemplateURLError;
        }
        if (adPayload.x()) {
            StringBuilder a3 = com.iab.omid.library.vungle.internal.l.a("The ad markup has expired for playback. Ad expiry: ");
            com.vungle.ads.internal.model.i c5 = adPayload.c();
            a3.append(c5 != null ? c5.c() : null);
            a3.append(", device: ");
            a3.append(System.currentTimeMillis());
            return new AdExpiredError(a3.toString());
        }
        String h = adPayload.h();
        if (h == null || h.length() == 0) {
            return new InvalidEventIdError("Event id is invalid.");
        }
        return null;
    }
}
