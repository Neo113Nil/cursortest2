package com.vungle.ads.internal.downloader;

import com.vungle.ads.internal.AnalyticsClient;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.internal.util.s;
import com.vungle.ads.internal.util.t;
import com.vungle.ads.internal.util.u;

/* loaded from: classes4.dex */
public final class f extends com.vungle.ads.internal.task.j {
    public final /* synthetic */ h a;
    public final /* synthetic */ k b;
    public final /* synthetic */ d c;

    public f(k kVar, h hVar, com.vungle.ads.internal.load.c cVar) {
        this.a = hVar;
        this.b = kVar;
        this.c = cVar;
    }

    @Override // com.vungle.ads.internal.task.j
    public final int a() {
        return this.b.a.a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        h hVar = this.a;
        k kVar = this.b;
        d dVar = this.c;
        if (dVar != null) {
            hVar.getClass();
            ((com.vungle.ads.internal.load.c) dVar).a(kVar);
        }
        b a = hVar.a(kVar, dVar);
        while (true) {
            if (a != null) {
                if (!kVar.e.get()) {
                    Integer num = kVar.b.e;
                    if (num != null && num.intValue() < 100) {
                        boolean z = u.a;
                        t.a("AssetDownloader", "Partial download asset (percentage=" + num + "), not retrying");
                        break;
                    }
                    if (kVar.f.get() >= kVar.d) {
                        boolean z2 = u.a;
                        StringBuilder a2 = com.iab.omid.library.vungle.internal.l.a("Max retry attempts reached (");
                        a2.append(kVar.d);
                        a2.append(')');
                        t.a("AssetDownloader", a2.toString());
                        break;
                    }
                    if (!a.a(a)) {
                        boolean z3 = u.a;
                        StringBuilder a3 = com.iab.omid.library.vungle.internal.l.a("Error reason ");
                        a3.append(a.c);
                        a3.append(" is not retryable");
                        t.a("AssetDownloader", a3.toString());
                        break;
                    }
                    kVar.f.incrementAndGet();
                    kVar.a("Error: " + a.b.getMessage() + ", Code: " + a.a + ", Reason: " + a.c);
                    boolean z4 = u.a;
                    StringBuilder a4 = com.iab.omid.library.vungle.internal.l.a("Download failed, retrying immediately. Attempt ");
                    a4.append(kVar.f.get());
                    a4.append('/');
                    a4.append(kVar.d);
                    a4.append(". URL: ");
                    a4.append(kVar.b.b);
                    a4.append(", Error: ");
                    a4.append(a.b.getMessage());
                    t.c("AssetDownloader", a4.toString());
                    a = hVar.a(kVar, dVar);
                } else {
                    boolean z5 = u.a;
                    t.a("AssetDownloader", "Download cancelled, not retrying");
                    break;
                }
            } else {
                break;
            }
        }
        if (a != null) {
            boolean z6 = u.a;
            StringBuilder a5 = com.iab.omid.library.vungle.internal.l.a("Download failed after ");
            a5.append(kVar.f.get() + 1);
            a5.append(" attempts. URL: ");
            a5.append(kVar.b.b);
            a5.append(". Retry history: ");
            a5.append(kVar.d());
            t.b("AssetDownloader", a5.toString());
            if (kVar.f.get() > 0) {
                AnalyticsClient analyticsClient = AnalyticsClient.INSTANCE;
                Sdk.SDKMetric.SDKMetricType sDKMetricType = Sdk.SDKMetric.SDKMetricType.ASSET_DOWNLOAD_RETRY_STATUS;
                s sVar = kVar.c;
                StringBuilder a6 = com.iab.omid.library.vungle.internal.l.a("retryCount=");
                a6.append(kVar.f.get());
                a6.append(" url=");
                a6.append(kVar.b.b);
                analyticsClient.c(sDKMetricType, 2L, sVar, a6.toString());
            }
            if (dVar != null) {
                ((com.vungle.ads.internal.load.c) dVar).a(a, kVar);
            }
        }
    }
}
