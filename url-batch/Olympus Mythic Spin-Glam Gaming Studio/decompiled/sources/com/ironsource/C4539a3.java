package com.ironsource;

import android.content.Context;
import android.os.Bundle;
import com.ironsource.C4797o1;
import com.ironsource.InterfaceC4740kg;
import com.ironsource.InterfaceC4743l1;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.AdapterUtils;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.unity3d.ironsourceads.AdSize;
import com.unity3d.ironsourceads.banner.BannerAdRequest;
import com.unity3d.ironsourceads.banner.BannerAdView;
import java.util.Map;
import java.util.concurrent.Executor;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* renamed from: com.ironsource.a3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4539a3 implements Bb, E2 {

    @NotNull
    private final BannerAdRequest a;

    @NotNull
    private final AdSize b;

    @NotNull
    private final InterfaceC4816p2 c;

    @NotNull
    private final Cb d;

    @NotNull
    private final InterfaceC4937vc e;

    @NotNull
    private final InterfaceC4868s1 f;

    @NotNull
    private final V<BannerAdView> g;

    @NotNull
    private final H2 h;

    @NotNull
    private final InterfaceC4740kg.c i;

    @NotNull
    private final Executor j;
    private C4658g5 k;

    @Nullable
    private InterfaceC4740kg l;

    @Nullable
    private Y1 m;
    private boolean n;

    /* renamed from: com.ironsource.a3$a */
    public static final class a implements InterfaceC4740kg.a {
        a() {
        }

        @Override // com.ironsource.InterfaceC4740kg.a
        public void a() {
            C4539a3.this.a(C4908u5.a.s());
        }
    }

    public C4539a3(@NotNull BannerAdRequest adRequest, @NotNull AdSize size, @NotNull InterfaceC4816p2 auctionResponseFetcher, @NotNull Cb loadTaskConfig, @NotNull InterfaceC4937vc networkLoadApi, @NotNull InterfaceC4868s1 analytics, @NotNull V<BannerAdView> adLoadTaskListener, @NotNull H2 adLayoutFactory, @NotNull InterfaceC4740kg.c timerFactory, @NotNull Executor taskFinishedExecutor) {
        Intrinsics.checkNotNullParameter(adRequest, "adRequest");
        Intrinsics.checkNotNullParameter(size, "size");
        Intrinsics.checkNotNullParameter(auctionResponseFetcher, "auctionResponseFetcher");
        Intrinsics.checkNotNullParameter(loadTaskConfig, "loadTaskConfig");
        Intrinsics.checkNotNullParameter(networkLoadApi, "networkLoadApi");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(adLoadTaskListener, "adLoadTaskListener");
        Intrinsics.checkNotNullParameter(adLayoutFactory, "adLayoutFactory");
        Intrinsics.checkNotNullParameter(timerFactory, "timerFactory");
        Intrinsics.checkNotNullParameter(taskFinishedExecutor, "taskFinishedExecutor");
        this.a = adRequest;
        this.b = size;
        this.c = auctionResponseFetcher;
        this.d = loadTaskConfig;
        this.e = networkLoadApi;
        this.f = analytics;
        this.g = adLoadTaskListener;
        this.h = adLayoutFactory;
        this.i = timerFactory;
        this.j = taskFinishedExecutor;
    }

    private final void a(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        Map<String, String> a2 = R5.a.a(bundle);
        for (String str : a2.keySet()) {
            String valueOf = String.valueOf(a2.get(str));
            InterfaceC4743l1.c.a.a(new C4797o1.l(str + "=" + valueOf)).a(this.f);
        }
    }

    @Override // com.ironsource.E2
    public void onBannerLoadFail(@NotNull String description) {
        Intrinsics.checkNotNullParameter(description, "description");
        a(C4908u5.a.c(description));
    }

    @Override // com.ironsource.E2
    public void onBannerLoadSuccess(@NotNull final K9 adInstance, @NotNull final C4661g8 adContainer) {
        Intrinsics.checkNotNullParameter(adInstance, "adInstance");
        Intrinsics.checkNotNullParameter(adContainer, "adContainer");
        try {
            this.j.execute(new Runnable() { // from class: com.ironsource.a3$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    C4539a3.a(C4539a3.this, adInstance, adContainer);
                }
            });
        } catch (Exception e) {
            a(e);
        }
    }

    @Override // com.ironsource.Bb
    public void start() {
        this.k = new C4658g5();
        this.f.a(new C4797o1.s(this.d.f()), new C4797o1.n(this.d.g().b()), new C4797o1.c(this.b), new C4797o1.b(this.a.getAdId$mediationsdk_release()));
        InterfaceC4743l1.c.a.a().a(this.f);
        a(this.a.getExtraParams());
        long h = this.d.h();
        InterfaceC4740kg.c cVar = this.i;
        InterfaceC4740kg.b bVar = new InterfaceC4740kg.b();
        bVar.b(h);
        Unit unit = Unit.INSTANCE;
        InterfaceC4740kg a2 = cVar.a(bVar);
        this.l = a2;
        if (a2 != null) {
            a2.a(new a());
        }
        Object a3 = this.c.a();
        Throwable m8026exceptionOrNullimpl = Result.m8026exceptionOrNullimpl(a3);
        if (m8026exceptionOrNullimpl != null) {
            Intrinsics.checkNotNull(m8026exceptionOrNullimpl, "null cannot be cast to non-null type com.unity3d.ironsourceads.internal.error.ISException");
            a(((C4571b8) m8026exceptionOrNullimpl).a());
            a3 = null;
        }
        C4762m2 c4762m2 = (C4762m2) a3;
        if (c4762m2 == null) {
            return;
        }
        InterfaceC4868s1 interfaceC4868s1 = this.f;
        String b = c4762m2.b();
        if (b != null) {
            interfaceC4868s1.a(new C4797o1.d(b));
        }
        JSONObject f = c4762m2.f();
        if (f != null) {
            interfaceC4868s1.a(new C4797o1.m(f));
        }
        String a4 = c4762m2.a();
        if (a4 != null) {
            interfaceC4868s1.a(new C4797o1.g(a4));
        }
        EnumC4823p9 g = this.d.g();
        Context applicationContext = ContextProvider.getInstance().getApplicationContext();
        C4625e8 c4625e8 = new C4625e8(AdapterUtils.dpToPixels(applicationContext, this.b.getWidth()), AdapterUtils.dpToPixels(applicationContext, this.b.getHeight()), this.b.getSizeDescription());
        Kc kc = new Kc();
        kc.a(this);
        K9 adInstance = new L9(this.a.getProviderName$mediationsdk_release().value(), kc).a(g.b(EnumC4823p9.Bidder)).a(c4625e8).b(this.d.i()).a(this.a.getAdId$mediationsdk_release()).a(MapsKt.plus(new C4808oc().a(), R5.a.a(this.a.getExtraParams()))).a();
        C4973xc c4973xc = new C4973xc(c4762m2, this.d.j());
        this.m = new Y1(new C4787n9(this.a.getInstanceId(), g.b(), c4762m2.a()), new com.ironsource.mediationsdk.d(), c4762m2.c());
        InterfaceC4743l1.d.a.c().a(this.f);
        InterfaceC4937vc interfaceC4937vc = this.e;
        Intrinsics.checkNotNullExpressionValue(adInstance, "adInstance");
        interfaceC4937vc.a(adInstance, c4973xc);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C4539a3 this$0, K9 adInstance, C4661g8 adContainer) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(adInstance, "$adInstance");
        Intrinsics.checkNotNullParameter(adContainer, "$adContainer");
        if (this$0.n) {
            return;
        }
        this$0.n = true;
        InterfaceC4740kg interfaceC4740kg = this$0.l;
        if (interfaceC4740kg != null) {
            interfaceC4740kg.cancel();
        }
        C4658g5 c4658g5 = this$0.k;
        if (c4658g5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("taskStartedTime");
            c4658g5 = null;
        }
        InterfaceC4743l1.c.a.a(new C4797o1.f(C4658g5.a(c4658g5))).a(this$0.f);
        Y1 y1 = this$0.m;
        if (y1 != null) {
            y1.c("onBannerLoadSuccess");
        }
        H2 h2 = this$0.h;
        Y1 y12 = this$0.m;
        Intrinsics.checkNotNull(y12);
        this$0.g.a(h2.a(adInstance, adContainer, y12));
    }

    public /* synthetic */ C4539a3(BannerAdRequest bannerAdRequest, AdSize adSize, InterfaceC4816p2 interfaceC4816p2, Cb cb, InterfaceC4937vc interfaceC4937vc, InterfaceC4868s1 interfaceC4868s1, V v, H2 h2, InterfaceC4740kg.c cVar, Executor executor, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(bannerAdRequest, adSize, interfaceC4816p2, cb, interfaceC4937vc, interfaceC4868s1, v, h2, (i & 256) != 0 ? new InterfaceC4740kg.d() : cVar, (i & 512) != 0 ? R7.a.d() : executor);
    }

    public final void a(@NotNull final IronSourceError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        try {
            this.j.execute(new Runnable() { // from class: com.ironsource.a3$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    C4539a3.a(C4539a3.this, error);
                }
            });
        } catch (Exception e) {
            a(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C4539a3 this$0, IronSourceError error) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(error, "$error");
        if (this$0.n) {
            return;
        }
        this$0.n = true;
        InterfaceC4740kg interfaceC4740kg = this$0.l;
        if (interfaceC4740kg != null) {
            interfaceC4740kg.cancel();
        }
        InterfaceC4743l1.c.a aVar = InterfaceC4743l1.c.a;
        C4797o1.j jVar = new C4797o1.j(error.getErrorCode());
        C4797o1.k kVar = new C4797o1.k(error.getErrorMessage());
        C4658g5 c4658g5 = this$0.k;
        if (c4658g5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("taskStartedTime");
            c4658g5 = null;
        }
        aVar.a(jVar, kVar, new C4797o1.f(C4658g5.a(c4658g5))).a(this$0.f);
        Y1 y1 = this$0.m;
        if (y1 != null) {
            y1.a("onBannerLoadFail");
        }
        this$0.g.b(error);
    }

    private final void a(Exception exc) {
        IronSourceError buildLoadFailedError = ErrorBuilder.buildLoadFailedError(exc.getMessage());
        InterfaceC4743l1.d.a.a(new C4797o1.k(buildLoadFailedError.getErrorMessage())).a(this.f);
        IronLog.CALLBACK.error(buildLoadFailedError.getErrorMessage());
    }
}
