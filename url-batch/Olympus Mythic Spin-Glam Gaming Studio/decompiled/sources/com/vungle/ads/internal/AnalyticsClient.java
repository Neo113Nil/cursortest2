package com.vungle.ads.internal;

import android.os.Build;
import com.safedk.android.analytics.events.CrashEvent;
import com.vungle.ads.internal.network.VungleApiClient;
import com.vungle.ads.internal.protos.Sdk;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0006B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0003\u001a\u00020\u0002H\u0002¨\u0006\u0007"}, d2 = {"Lcom/vungle/ads/internal/AnalyticsClient;", "", "", CrashEvent.e, "<init>", "()V", "com/vungle/ads/internal/w", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes6.dex */
public final class AnalyticsClient {
    public static VungleApiClient e;
    public static com.vungle.ads.internal.executor.j f;
    public static boolean g;

    @NotNull
    public static final AnalyticsClient INSTANCE = new AnalyticsClient();
    public static final LinkedBlockingQueue a = new LinkedBlockingQueue();
    public static final LinkedBlockingQueue b = new LinkedBlockingQueue();
    public static final LinkedBlockingQueue c = new LinkedBlockingQueue();
    public static final LinkedBlockingQueue d = new LinkedBlockingQueue();
    public static int h = 2;
    public static boolean i = true;
    public static final AtomicBoolean j = new AtomicBoolean(false);

    private AnalyticsClient() {
    }

    public static void a(AnalyticsClient analyticsClient, t1 t1Var, com.vungle.ads.internal.util.s sVar) {
        analyticsClient.a(t1Var, sVar, t1Var.b);
    }

    public static final void b(Sdk.SDKError.Reason reason, String message, com.vungle.ads.internal.util.s sVar) {
        Intrinsics.checkNotNullParameter(reason, "$reason");
        Intrinsics.checkNotNullParameter(message, "$message");
        AnalyticsClient analyticsClient = INSTANCE;
        synchronized (analyticsClient) {
            if (h != 1) {
                try {
                    Sdk.SDKError.Builder a2 = a(reason, message, sVar);
                    LinkedBlockingQueue linkedBlockingQueue = a;
                    linkedBlockingQueue.put(a2);
                    boolean z = com.vungle.ads.internal.util.u.a;
                    com.vungle.ads.internal.util.t.a("AnalyticsClient", new z(reason, message, a2));
                    if (linkedBlockingQueue.size() >= 20) {
                        analyticsClient.report();
                    }
                } catch (Exception e2) {
                    boolean z2 = com.vungle.ads.internal.util.u.a;
                    com.vungle.ads.internal.util.t.a("AnalyticsClient", "Cannot logError", e2);
                }
            }
        }
    }

    private final synchronized void report() {
        VungleApiClient vungleApiClient;
        VungleApiClient vungleApiClient2;
        try {
            if (h != 1) {
                LinkedBlockingQueue linkedBlockingQueue = a;
                if (linkedBlockingQueue.size() > 0) {
                    boolean z = com.vungle.ads.internal.util.u.a;
                    StringBuilder a2 = com.iab.omid.library.vungle.internal.l.a("Sending ");
                    a2.append(linkedBlockingQueue.size());
                    a2.append(" errors");
                    com.vungle.ads.internal.util.t.a("AnalyticsClient", a2.toString());
                    LinkedBlockingQueue linkedBlockingQueue2 = new LinkedBlockingQueue();
                    linkedBlockingQueue.drainTo(linkedBlockingQueue2);
                    if (!linkedBlockingQueue2.isEmpty() && (vungleApiClient2 = e) != null) {
                        vungleApiClient2.a(linkedBlockingQueue2, new x(linkedBlockingQueue2));
                    }
                }
            }
            if (g) {
                LinkedBlockingQueue linkedBlockingQueue3 = b;
                if (linkedBlockingQueue3.size() > 0) {
                    boolean z2 = com.vungle.ads.internal.util.u.a;
                    StringBuilder a3 = com.iab.omid.library.vungle.internal.l.a("Sending ");
                    a3.append(linkedBlockingQueue3.size());
                    a3.append(" metrics");
                    com.vungle.ads.internal.util.t.a("AnalyticsClient", a3.toString());
                    LinkedBlockingQueue linkedBlockingQueue4 = new LinkedBlockingQueue();
                    linkedBlockingQueue3.drainTo(linkedBlockingQueue4);
                    if (!linkedBlockingQueue4.isEmpty() && (vungleApiClient = e) != null) {
                        vungleApiClient.a(linkedBlockingQueue4, new y(linkedBlockingQueue4));
                    }
                }
            }
        } finally {
        }
    }

    public final synchronized void c(final Sdk.SDKError.Reason reason, final String message, final com.vungle.ads.internal.util.s sVar) {
        com.vungle.ads.internal.executor.j jVar;
        Intrinsics.checkNotNullParameter(reason, "reason");
        Intrinsics.checkNotNullParameter(message, "message");
        try {
            jVar = f;
        } catch (Exception e2) {
            boolean z = com.vungle.ads.internal.util.u.a;
            com.vungle.ads.internal.util.t.a("AnalyticsClient", "Cannot logError " + reason + ", " + message + ", " + sVar, e2);
        }
        if (jVar != null) {
            jVar.execute(new Runnable() { // from class: com.vungle.ads.internal.AnalyticsClient$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    AnalyticsClient.b(Sdk.SDKError.Reason.this, message, sVar);
                }
            });
        } else {
            c.put(a(reason, message, sVar));
        }
    }

    public final synchronized void a(VungleApiClient vungleApiClient, final com.vungle.ads.internal.executor.j executor, int i2, boolean z) {
        try {
            Intrinsics.checkNotNullParameter(vungleApiClient, "vungleApiClient");
            Intrinsics.checkNotNullParameter(executor, "executor");
            h = t.a(i2);
            g = z;
            if (i2 == u.a(3)) {
                boolean z2 = com.vungle.ads.internal.util.u.a;
                com.vungle.ads.internal.util.u.a = true;
            } else if (i2 == u.a(2)) {
                boolean z3 = com.vungle.ads.internal.util.u.a;
                com.vungle.ads.internal.util.u.a = false;
            } else if (i2 == u.a(1)) {
                boolean z4 = com.vungle.ads.internal.util.u.a;
                com.vungle.ads.internal.util.u.a = false;
            }
            if (j.getAndSet(true)) {
                boolean z5 = com.vungle.ads.internal.util.u.a;
                com.vungle.ads.internal.util.t.a("AnalyticsClient", "AnalyticsClient already initialized");
                return;
            }
            f = executor;
            e = vungleApiClient;
            try {
                LinkedBlockingQueue linkedBlockingQueue = c;
                if (!linkedBlockingQueue.isEmpty()) {
                    linkedBlockingQueue.drainTo(a);
                }
            } catch (Exception e2) {
                boolean z6 = com.vungle.ads.internal.util.u.a;
                com.vungle.ads.internal.util.t.a("AnalyticsClient", "Failed to add pendingErrors to errors queue.", e2);
            }
            try {
                LinkedBlockingQueue linkedBlockingQueue2 = d;
                if (!linkedBlockingQueue2.isEmpty()) {
                    linkedBlockingQueue2.drainTo(b);
                }
            } catch (Exception e3) {
                boolean z7 = com.vungle.ads.internal.util.u.a;
                com.vungle.ads.internal.util.t.a("AnalyticsClient", "Failed to add pendingMetrics to metrics queue.", e3);
            }
            if (i) {
                Executors.newSingleThreadScheduledExecutor().scheduleWithFixedDelay(new Runnable() { // from class: com.vungle.ads.internal.AnalyticsClient$$ExternalSyntheticLambda2
                    @Override // java.lang.Runnable
                    public final void run() {
                        AnalyticsClient.a(com.vungle.ads.internal.executor.j.this);
                    }
                }, 5000L, 5000L, TimeUnit.MILLISECONDS);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void c(final Sdk.SDKMetric.SDKMetricType metricType, final long j2, final com.vungle.ads.internal.util.s sVar, final String str) {
        com.vungle.ads.internal.executor.j jVar;
        Intrinsics.checkNotNullParameter(metricType, "metricType");
        try {
            jVar = f;
        } catch (Exception e2) {
            boolean z = com.vungle.ads.internal.util.u.a;
            com.vungle.ads.internal.util.t.a("AnalyticsClient", "Cannot logMetric " + metricType + ", " + j2 + ", " + sVar + ", " + str, e2);
        }
        if (jVar == null) {
            d.put(a(metricType, j2, sVar, str));
        } else {
            jVar.execute(new Runnable() { // from class: com.vungle.ads.internal.AnalyticsClient$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    AnalyticsClient.b(Sdk.SDKMetric.SDKMetricType.this, j2, sVar, str);
                }
            });
        }
    }

    public static final void b(Sdk.SDKMetric.SDKMetricType metricType, long j2, com.vungle.ads.internal.util.s sVar, String str) {
        Intrinsics.checkNotNullParameter(metricType, "$metricType");
        AnalyticsClient analyticsClient = INSTANCE;
        synchronized (analyticsClient) {
            if (g) {
                try {
                    Sdk.SDKMetric.Builder a2 = a(metricType, j2, sVar, str);
                    LinkedBlockingQueue linkedBlockingQueue = b;
                    linkedBlockingQueue.put(a2);
                    boolean z = com.vungle.ads.internal.util.u.a;
                    com.vungle.ads.internal.util.t.a("AnalyticsClient", new a0(metricType, j2, sVar, a2));
                    if (linkedBlockingQueue.size() >= 20) {
                        analyticsClient.report();
                    }
                } catch (Exception e2) {
                    boolean z2 = com.vungle.ads.internal.util.u.a;
                    com.vungle.ads.internal.util.t.a("AnalyticsClient", "Cannot logMetrics", e2);
                }
            }
        }
    }

    public static final void a(com.vungle.ads.internal.executor.j executor) {
        Intrinsics.checkNotNullParameter(executor, "$executor");
        executor.execute(new Runnable() { // from class: com.vungle.ads.internal.AnalyticsClient$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                AnalyticsClient.a();
            }
        });
    }

    public static final void a() {
        INSTANCE.report();
    }

    public static Sdk.SDKError.Builder a(Sdk.SDKError.Reason reason, String str, com.vungle.ads.internal.util.s sVar) {
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String d2;
        String str7;
        String str8;
        Long a2;
        Boolean b2;
        Boolean f2;
        Boolean k;
        String e2;
        h d3;
        Sdk.SDKError.Builder newBuilder = Sdk.SDKError.newBuilder();
        String str9 = Build.MANUFACTURER;
        Sdk.SDKError.Builder at = newBuilder.setOs(Intrinsics.areEqual("Amazon", str9) ? "amazon" : "android").setOsVersion(String.valueOf(Build.VERSION.SDK_INT)).setMake(str9).setModel(Build.MODEL).setReason(reason).setMessage(str).setAt(System.currentTimeMillis());
        String str10 = "";
        if (sVar == null || (str2 = sVar.l()) == null) {
            str2 = "";
        }
        Sdk.SDKError.Builder placementReferenceId = at.setPlacementReferenceId(str2);
        if (sVar == null || (str3 = sVar.g()) == null) {
            str3 = "";
        }
        Sdk.SDKError.Builder creativeId = placementReferenceId.setCreativeId(str3);
        if (sVar == null || (str4 = sVar.h()) == null) {
            str4 = "";
        }
        Sdk.SDKError.Builder eventId = creativeId.setEventId(str4);
        if (sVar == null || (str5 = sVar.c()) == null) {
            str5 = "";
        }
        Sdk.SDKError.Builder adSource = eventId.setAdSource(str5);
        if (sVar == null || (str6 = sVar.m()) == null) {
            str6 = "";
        }
        Sdk.SDKError.Builder vmVersion = adSource.setVmVersion(str6);
        if (sVar == null || (d2 = sVar.j()) == null) {
            d2 = com.vungle.ads.internal.network.d0.d();
        }
        Sdk.SDKError.Builder mediationName = vmVersion.setMediationName(d2);
        com.vungle.ads.internal.util.d dVar = com.vungle.ads.internal.util.d.f;
        Sdk.SDKError.Builder appState = mediationName.setAppState(com.vungle.ads.internal.util.a.a() ? 0L : 2L);
        if (sVar == null || (d3 = sVar.d()) == null || (str7 = d3.toString()) == null) {
            str7 = "";
        }
        Sdk.SDKError.Builder adState = appState.setAdState(str7);
        if (sVar == null || (str8 = sVar.i()) == null) {
            str8 = "";
        }
        Sdk.SDKError.Builder experiments = adState.setExperiments(str8);
        if (sVar != null && (e2 = sVar.e()) != null) {
            str10 = e2;
        }
        Sdk.SDKError.Builder adapterAdFormat = experiments.setAdapterAdFormat(str10);
        if (sVar != null && (k = sVar.k()) != null) {
            adapterAdFormat.setIsPartialDownloadEnabled(k.booleanValue());
        }
        if (sVar != null && (f2 = sVar.f()) != null) {
            adapterAdFormat.setIsAdoEnabled(f2.booleanValue());
        }
        if (sVar != null && (b2 = sVar.b()) != null) {
            adapterAdFormat.setIsAdPodding(b2.booleanValue());
        }
        if (sVar != null && (a2 = sVar.a()) != null) {
            adapterAdFormat.setAdLoadType(a2.longValue());
        }
        Intrinsics.checkNotNullExpressionValue(adapterAdFormat, "newBuilder()\n           …dType(it) }\n            }");
        return adapterAdFormat;
    }

    public static /* synthetic */ void a(AnalyticsClient analyticsClient, Sdk.SDKMetric.SDKMetricType sDKMetricType, long j2, com.vungle.ads.internal.util.s sVar, String str, int i2) {
        if ((i2 & 2) != 0) {
            j2 = 0;
        }
        analyticsClient.c(sDKMetricType, j2, (i2 & 4) != 0 ? null : sVar, (i2 & 8) != 0 ? null : str);
    }

    public static Sdk.SDKMetric.Builder a(Sdk.SDKMetric.SDKMetricType sDKMetricType, long j2, com.vungle.ads.internal.util.s sVar, String str) {
        String str2;
        String str3;
        String str4;
        String d2;
        String str5;
        String str6;
        String str7;
        String str8;
        Long a2;
        Boolean b2;
        Boolean f2;
        Boolean k;
        String e2;
        h d3;
        Sdk.SDKMetric.Builder value = Sdk.SDKMetric.newBuilder().setType(sDKMetricType).setValue(j2);
        String str9 = Build.MANUFACTURER;
        Sdk.SDKMetric.Builder osVersion = value.setMake(str9).setModel(Build.MODEL).setOs(Intrinsics.areEqual("Amazon", str9) ? "amazon" : "android").setOsVersion(String.valueOf(Build.VERSION.SDK_INT));
        String str10 = "";
        if (sVar == null || (str2 = sVar.l()) == null) {
            str2 = "";
        }
        Sdk.SDKMetric.Builder placementReferenceId = osVersion.setPlacementReferenceId(str2);
        if (sVar == null || (str3 = sVar.g()) == null) {
            str3 = "";
        }
        Sdk.SDKMetric.Builder creativeId = placementReferenceId.setCreativeId(str3);
        if (sVar == null || (str4 = sVar.h()) == null) {
            str4 = "";
        }
        Sdk.SDKMetric.Builder eventId = creativeId.setEventId(str4);
        if (str == null) {
            str = "";
        }
        Sdk.SDKMetric.Builder meta = eventId.setMeta(str);
        if (sVar == null || (d2 = sVar.j()) == null) {
            d2 = com.vungle.ads.internal.network.d0.d();
        }
        Sdk.SDKMetric.Builder mediationName = meta.setMediationName(d2);
        if (sVar == null || (str5 = sVar.c()) == null) {
            str5 = "";
        }
        Sdk.SDKMetric.Builder adSource = mediationName.setAdSource(str5);
        if (sVar == null || (str6 = sVar.m()) == null) {
            str6 = "";
        }
        Sdk.SDKMetric.Builder vmVersion = adSource.setVmVersion(str6);
        com.vungle.ads.internal.util.d dVar = com.vungle.ads.internal.util.d.f;
        Sdk.SDKMetric.Builder appState = vmVersion.setAppState(com.vungle.ads.internal.util.a.a() ? 0L : 2L);
        if (sVar == null || (d3 = sVar.d()) == null || (str7 = d3.toString()) == null) {
            str7 = "";
        }
        Sdk.SDKMetric.Builder adState = appState.setAdState(str7);
        if (sVar == null || (str8 = sVar.i()) == null) {
            str8 = "";
        }
        Sdk.SDKMetric.Builder experiments = adState.setExperiments(str8);
        if (sVar != null && (e2 = sVar.e()) != null) {
            str10 = e2;
        }
        Sdk.SDKMetric.Builder adapterAdFormat = experiments.setAdapterAdFormat(str10);
        if (sVar != null && (k = sVar.k()) != null) {
            adapterAdFormat.setIsPartialDownloadEnabled(k.booleanValue());
        }
        if (sVar != null && (f2 = sVar.f()) != null) {
            adapterAdFormat.setIsAdoEnabled(f2.booleanValue());
        }
        if (sVar != null && (b2 = sVar.b()) != null) {
            adapterAdFormat.setIsAdPodding(b2.booleanValue());
        }
        if (sVar != null && (a2 = sVar.a()) != null) {
            adapterAdFormat.setAdLoadType(a2.longValue());
        }
        Intrinsics.checkNotNullExpressionValue(adapterAdFormat, "newBuilder()\n           …dType(it) }\n            }");
        return adapterAdFormat;
    }

    public static void a(AnalyticsClient analyticsClient, m2 singleValueMetric, com.vungle.ads.internal.util.s sVar, int i2) {
        com.vungle.ads.internal.util.s sVar2 = (i2 & 2) != 0 ? null : sVar;
        String a2 = (i2 & 4) != 0 ? singleValueMetric.a() : null;
        synchronized (analyticsClient) {
            Intrinsics.checkNotNullParameter(singleValueMetric, "singleValueMetric");
            analyticsClient.c(singleValueMetric.b(), singleValueMetric.c(), sVar2, a2);
        }
    }

    public final synchronized void a(m2 singleValueMetric, com.vungle.ads.internal.util.s sVar, String str) {
        Intrinsics.checkNotNullParameter(singleValueMetric, "singleValueMetric");
        c(singleValueMetric.b(), singleValueMetric.c(), sVar, str);
    }

    public static void a(AnalyticsClient analyticsClient, s1 singleValueMetric, com.vungle.ads.internal.util.s sVar) {
        String a2 = singleValueMetric.a();
        synchronized (analyticsClient) {
            try {
                Intrinsics.checkNotNullParameter(singleValueMetric, "oneShotSingleValueMetric");
                if (!singleValueMetric.d()) {
                    synchronized (analyticsClient) {
                        Intrinsics.checkNotNullParameter(singleValueMetric, "singleValueMetric");
                        analyticsClient.c(singleValueMetric.b(), singleValueMetric.c(), sVar, a2);
                        singleValueMetric.e();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void a(AnalyticsClient analyticsClient, n2 timeIntervalMetric, com.vungle.ads.internal.util.s sVar, int i2) {
        com.vungle.ads.internal.util.s sVar2 = (i2 & 2) != 0 ? null : sVar;
        String a2 = (i2 & 4) != 0 ? timeIntervalMetric.a() : null;
        synchronized (analyticsClient) {
            Intrinsics.checkNotNullParameter(timeIntervalMetric, "timeIntervalMetric");
            analyticsClient.c(timeIntervalMetric.b(), timeIntervalMetric.c(), sVar2, a2);
        }
    }

    public final synchronized void a(n2 timeIntervalMetric, com.vungle.ads.internal.util.s sVar, String str) {
        Intrinsics.checkNotNullParameter(timeIntervalMetric, "timeIntervalMetric");
        c(timeIntervalMetric.b(), timeIntervalMetric.c(), sVar, str);
    }

    public final synchronized void a(t1 timeIntervalMetric, com.vungle.ads.internal.util.s sVar, String str) {
        try {
            Intrinsics.checkNotNullParameter(timeIntervalMetric, "oneShotTimeIntervalMetric");
            if (!timeIntervalMetric.f()) {
                synchronized (this) {
                    Intrinsics.checkNotNullParameter(timeIntervalMetric, "timeIntervalMetric");
                    c(timeIntervalMetric.b(), timeIntervalMetric.c(), sVar, str);
                    timeIntervalMetric.g();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
