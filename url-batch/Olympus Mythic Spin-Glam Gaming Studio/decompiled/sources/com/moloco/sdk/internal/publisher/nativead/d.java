package com.moloco.sdk.internal.publisher.nativead;

import androidx.compose.runtime.internal.StabilityInferred;
import com.moloco.sdk.acm.recorder.MetricsRecorder;
import com.moloco.sdk.internal.A;
import com.moloco.sdk.internal.h;
import com.moloco.sdk.internal.ortb.model.C5023e;
import com.moloco.sdk.internal.publisher.B;
import com.moloco.sdk.internal.publisher.C5035k;
import com.moloco.sdk.internal.publisher.nativead.model.b;
import com.moloco.sdk.internal.publisher.z;
import com.moloco.sdk.internal.services.InterfaceC5043f;
import com.moloco.sdk.publisher.AdFormatType;
import com.moloco.sdk.publisher.MolocoAdKt;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r;
import com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.i;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
/* loaded from: classes9.dex */
public final class d {
    public static final int l = 8;

    @NotNull
    public final String a;

    @NotNull
    public final C5023e b;

    @NotNull
    public final com.moloco.sdk.internal.publisher.nativead.model.b c;

    @NotNull
    public final InterfaceC5043f d;

    @NotNull
    public final com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a e;

    @NotNull
    public final AdFormatType f;

    @NotNull
    public final i g;

    @NotNull
    public final r h;

    @NotNull
    public final MetricsRecorder i;

    @NotNull
    public final z j;

    @NotNull
    public final a k;

    public d(@NotNull String adUnitId, @NotNull C5023e bid, @NotNull com.moloco.sdk.internal.publisher.nativead.model.b ortbResponse, @NotNull InterfaceC5043f appLifecycleTrackerService, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a customUserEventBuilderService, @NotNull AdFormatType adFormatType, @NotNull i persistentHttpRequest, @NotNull r externalLinkHandler, @NotNull MetricsRecorder metricsRecorder) {
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(bid, "bid");
        Intrinsics.checkNotNullParameter(ortbResponse, "ortbResponse");
        Intrinsics.checkNotNullParameter(appLifecycleTrackerService, "appLifecycleTrackerService");
        Intrinsics.checkNotNullParameter(customUserEventBuilderService, "customUserEventBuilderService");
        Intrinsics.checkNotNullParameter(adFormatType, "adFormatType");
        Intrinsics.checkNotNullParameter(persistentHttpRequest, "persistentHttpRequest");
        Intrinsics.checkNotNullParameter(externalLinkHandler, "externalLinkHandler");
        Intrinsics.checkNotNullParameter(metricsRecorder, "metricsRecorder");
        this.a = adUnitId;
        this.b = bid;
        this.c = ortbResponse;
        this.d = appLifecycleTrackerService;
        this.e = customUserEventBuilderService;
        this.f = adFormatType;
        this.g = persistentHttpRequest;
        this.h = externalLinkHandler;
        this.i = metricsRecorder;
        this.j = a();
        this.k = b();
    }

    public final z a() {
        z a2;
        final C5023e c5023e = this.b;
        a2 = B.a(null, this.d, this.e, new Function0() { // from class: com.moloco.sdk.internal.publisher.nativead.d$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final Object mo4828invoke() {
                return d.a(C5023e.this);
            }
        }, new Function0() { // from class: com.moloco.sdk.internal.publisher.nativead.d$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final Object mo4828invoke() {
                return d.a(d.this);
            }
        }, (r24 & 32) != 0 ? A.b() : null, (r24 & 64) != 0 ? h.a() : null, this.f, r9, (r24 & 512) != 0 ? new com.moloco.sdk.internal.client_metrics_data.a(this.i) : null, (r24 & 1024) != 0 ? null : null);
        return a2;
    }

    public final a b() {
        com.moloco.sdk.internal.publisher.nativead.model.b bVar = this.c;
        return new a(bVar.c(), bVar.b(), this.g);
    }

    public final void c() {
        b.c d = this.c.d();
        if (d != null) {
            this.k.a(d.a());
            this.h.a(d.c());
        }
        this.j.onAdClicked(MolocoAdKt.createAdInfo$default(this.a, null, null, 6, null));
    }

    public final void d() {
        this.k.a();
        z.a.a(this.j, MolocoAdKt.createAdInfo$default(this.a, null, null, 6, null), null, 2, null);
    }

    public static final com.moloco.sdk.internal.ortb.model.B a(C5023e c5023e) {
        return c5023e.getExt().getSdkEvents();
    }

    public static final C5035k a(d dVar) {
        String str = dVar.b.getCom.ironsource.q2.y java.lang.String();
        if (str != null) {
            return new C5035k(str, Float.valueOf(dVar.b.getPrice()));
        }
        return null;
    }

    public static final class a {

        @Nullable
        public List<String> a;

        @Nullable
        public List<b.C1549b> b;

        @NotNull
        public final i c;

        @NotNull
        public final Set<String> d;

        @StabilityInferred
        /* renamed from: com.moloco.sdk.internal.publisher.nativead.d$a$a, reason: collision with other inner class name */
        public static final class C1546a {

            @NotNull
            public static final C1546a a = new C1546a();
            public static final int b = 1;
            public static final int c = 0;
        }

        @StabilityInferred
        public static final class b {

            @NotNull
            public static final b a = new b();
            public static final int b = 1;
            public static final int c = 0;
        }

        public a(@Nullable List<String> list, @Nullable List<b.C1549b> list2, @NotNull i persistentHttpRequest) {
            Intrinsics.checkNotNullParameter(persistentHttpRequest, "persistentHttpRequest");
            this.a = list;
            this.b = list2;
            this.c = persistentHttpRequest;
            this.d = new LinkedHashSet();
        }

        public final void a() {
            List<String> list = this.a;
            if (list != null) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    this.c.a((String) it.next());
                }
            }
            this.a = null;
            List<b.C1549b> list2 = this.b;
            if (list2 != null) {
                for (b.C1549b c1549b : list2) {
                    if (c1549b.c() != null && c1549b.a() == 1 && c1549b.b() == 1) {
                        this.c.a(c1549b.c());
                    }
                }
            }
            this.b = null;
        }

        public final void a(@NotNull List<String> urls) {
            Intrinsics.checkNotNullParameter(urls, "urls");
            for (String str : urls) {
                if (!this.d.contains(str)) {
                    this.c.a(str);
                    this.d.add(str);
                }
            }
        }
    }
}
