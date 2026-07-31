package com.vungle.ads.internal.load;

import com.vungle.ads.AssetRequestError;
import com.vungle.ads.PrivacyIconFallbackError;
import com.vungle.ads.internal.AnalyticsClient;
import com.vungle.ads.internal.m2;
import com.vungle.ads.internal.model.h0;
import com.vungle.ads.internal.util.t;
import com.vungle.ads.internal.util.u;
import java.io.File;
import java.io.IOException;
import java.util.LinkedHashSet;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* loaded from: classes6.dex */
public final class c implements com.vungle.ads.internal.downloader.d {
    public boolean a;
    public final /* synthetic */ g b;

    public c(g gVar) {
        this.b = gVar;
    }

    public final void a(com.vungle.ads.internal.downloader.k downloadRequest) {
        Intrinsics.checkNotNullParameter(downloadRequest, "downloadRequest");
        boolean z = u.a;
        StringBuilder a = com.iab.omid.library.vungle.internal.l.a("onStart called: ");
        a.append(downloadRequest.a().h());
        t.c("BaseAdLoader", a.toString());
        downloadRequest.f();
    }

    public final void a(com.vungle.ads.internal.downloader.c progress, com.vungle.ads.internal.downloader.k downloadRequest) {
        Intrinsics.checkNotNullParameter(progress, "progress");
        Intrinsics.checkNotNullParameter(downloadRequest, "downloadRequest");
        final com.vungle.ads.internal.model.b a = downloadRequest.a();
        Integer e = a.e();
        boolean z = u.a;
        t.a("BaseAdLoader", "Download progress: " + progress + " url: " + a.h());
        if (this.a || e == null || progress.a() < e.intValue()) {
            return;
        }
        this.a = true;
        if (new IntRange(1, 99).contains(e.intValue())) {
            downloadRequest.h();
        }
        t.c("BaseAdLoader", "Download progress: hit chunk percentage=" + e + " for url: " + a.h());
        if (a.n()) {
            com.vungle.ads.internal.executor.j b = ((com.vungle.ads.internal.executor.d) this.b.g()).b();
            final g gVar = this.b;
            b.execute(new Runnable() { // from class: com.vungle.ads.internal.load.c$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    c.a(g.this, a);
                }
            });
        }
    }

    public static final void a(g this$0, com.vungle.ads.internal.model.b adAsset) {
        LinkedHashSet linkedHashSet;
        LinkedHashSet linkedHashSet2;
        AtomicBoolean atomicBoolean;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(adAsset, "$adAsset");
        linkedHashSet = this$0.i;
        linkedHashSet.remove(adAsset.h());
        linkedHashSet2 = this$0.i;
        if (linkedHashSet2.isEmpty()) {
            atomicBoolean = this$0.p;
            if (atomicBoolean.get()) {
                g.g(this$0);
            } else {
                this$0.a();
                this$0.a(new AssetRequestError("Failed to download required assets."));
            }
        }
    }

    public final void a(final com.vungle.ads.internal.downloader.b bVar, final com.vungle.ads.internal.downloader.k downloadRequest) {
        Intrinsics.checkNotNullParameter(downloadRequest, "downloadRequest");
        boolean z = u.a;
        t.b("BaseAdLoader", "onError called: " + bVar);
        com.vungle.ads.internal.executor.j b = ((com.vungle.ads.internal.executor.d) this.b.g()).b();
        final g gVar = this.b;
        b.execute(new Runnable() { // from class: com.vungle.ads.internal.load.c$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                c.a(com.vungle.ads.internal.downloader.k.this, gVar, this, bVar);
            }
        });
    }

    public static final void a(com.vungle.ads.internal.downloader.k downloadRequest, g this$0, c this$1, com.vungle.ads.internal.downloader.b bVar) {
        AtomicBoolean atomicBoolean;
        AtomicLong atomicLong;
        LinkedHashSet linkedHashSet;
        LinkedHashSet linkedHashSet2;
        AtomicBoolean atomicBoolean2;
        Intrinsics.checkNotNullParameter(downloadRequest, "$downloadRequest");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(this$1, "this$1");
        com.vungle.ads.internal.model.b a = downloadRequest.a();
        if (a.m()) {
            File a2 = com.vungle.ads.internal.downloader.i.a(this$0.f().getVmDir());
            if (a2 != null && a2.exists()) {
                this$1.a(a2, downloadRequest);
                return;
            }
            new PrivacyIconFallbackError("Failed to inject default privacy icon").setLogEntry$vungle_ads_release(this$0.e()).logErrorNoReturnValue$vungle_ads_release();
        }
        a.a(com.vungle.ads.internal.model.a.DOWNLOAD_FAILED);
        atomicBoolean = this$0.o;
        atomicBoolean.set(false);
        if (a.n()) {
            atomicBoolean2 = this$0.p;
            atomicBoolean2.set(false);
        }
        StringBuilder a3 = com.iab.omid.library.vungle.internal.l.a("Failed to download assets ");
        a3.append(a.h());
        a3.append(". error: ");
        a3.append(bVar);
        a3.append(" errorType=");
        a3.append(com.vungle.ads.internal.platform.e.a(bVar != null ? bVar.a() : null));
        a3.append(" proxyEnabled=");
        a3.append(com.vungle.ads.internal.platform.e.e(this$0.d()));
        a3.append(" privateDns=");
        a3.append(com.vungle.ads.internal.platform.e.b(this$0.d()));
        a3.append(" network=");
        a3.append(com.vungle.ads.internal.platform.e.a(this$0.d()));
        new AssetRequestError(a3.toString()).setLogEntry$vungle_ads_release(this$0.e()).logErrorNoReturnValue$vungle_ads_release();
        if (a.n()) {
            linkedHashSet = this$0.i;
            linkedHashSet.remove(downloadRequest.a().h());
            linkedHashSet2 = this$0.i;
            if (linkedHashSet2.isEmpty()) {
                this$0.a();
                this$0.a(new AssetRequestError("Error: Failed to download required assets."));
                return;
            }
        }
        atomicLong = this$0.h;
        if (atomicLong.decrementAndGet() <= 0) {
            this$0.a(new AssetRequestError("Error: Failed to download assets."));
        }
    }

    public final void a(final File file, final com.vungle.ads.internal.downloader.k downloadRequest) {
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(downloadRequest, "downloadRequest");
        com.vungle.ads.internal.executor.j b = ((com.vungle.ads.internal.executor.d) this.b.g()).b();
        final g gVar = this.b;
        b.execute(new Runnable() { // from class: com.vungle.ads.internal.load.c$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                c.a(file, this, downloadRequest, gVar);
            }
        });
    }

    public static final void a(File file, c this$0, com.vungle.ads.internal.downloader.k downloadRequest, g this$1) {
        m2 m2Var;
        m2 m2Var2;
        AtomicLong atomicLong;
        AtomicBoolean atomicBoolean;
        LinkedHashSet linkedHashSet;
        LinkedHashSet linkedHashSet2;
        AtomicBoolean atomicBoolean2;
        AtomicBoolean atomicBoolean3;
        AtomicBoolean atomicBoolean4;
        m2 m2Var3;
        m2 m2Var4;
        Intrinsics.checkNotNullParameter(file, "$file");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(downloadRequest, "$downloadRequest");
        Intrinsics.checkNotNullParameter(this$1, "this$1");
        if (!file.exists()) {
            this$0.a(new com.vungle.ads.internal.downloader.b(-1, new IOException("Downloaded file not found!"), 3), downloadRequest);
            return;
        }
        com.vungle.ads.internal.model.b a = downloadRequest.a();
        a.b(file.length());
        a.a(com.vungle.ads.internal.model.a.DOWNLOAD_SUCCESS);
        Integer e = a.e();
        if (e == null || e.intValue() == 0 || e.intValue() == 100) {
            downloadRequest.h();
        }
        if (a.j()) {
            downloadRequest.i();
            m2Var3 = this$1.s;
            m2Var3.a(Long.valueOf(file.length()));
            AnalyticsClient analyticsClient = AnalyticsClient.INSTANCE;
            m2Var4 = this$1.s;
            analyticsClient.a(m2Var4, this$1.e(), a.h());
        } else if (a.l()) {
            m2Var = this$1.r;
            m2Var.a(Long.valueOf(file.length()));
            AnalyticsClient analyticsClient2 = AnalyticsClient.INSTANCE;
            m2Var2 = this$1.r;
            analyticsClient2.a(m2Var2, this$1.e(), a.h());
        }
        h0 c = this$1.c();
        if (c != null) {
            c.a(file, a.a());
        }
        if (a.j() && !g.a(this$1, a, this$1.c())) {
            atomicBoolean3 = this$1.o;
            atomicBoolean3.set(false);
            if (a.n()) {
                atomicBoolean4 = this$1.p;
                atomicBoolean4.set(false);
            }
        }
        if (a.n()) {
            linkedHashSet = this$1.i;
            linkedHashSet.remove(a.h());
            linkedHashSet2 = this$1.i;
            if (linkedHashSet2.isEmpty()) {
                atomicBoolean2 = this$1.p;
                if (atomicBoolean2.get()) {
                    g.g(this$1);
                } else {
                    this$1.a();
                    this$1.a(new AssetRequestError("Failed to download required assets."));
                    return;
                }
            }
        }
        atomicLong = this$1.h;
        if (atomicLong.decrementAndGet() <= 0) {
            atomicBoolean = this$1.o;
            if (atomicBoolean.get()) {
                g.a(this$1, this$1.b());
            } else {
                this$1.a(new AssetRequestError("Failed to download assets."));
            }
        }
    }
}
