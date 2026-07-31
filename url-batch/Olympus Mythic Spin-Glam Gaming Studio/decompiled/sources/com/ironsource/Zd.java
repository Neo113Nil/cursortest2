package com.ironsource;

import android.os.Bundle;
import com.ironsource.C4797o1;
import com.ironsource.InterfaceC4740kg;
import com.ironsource.InterfaceC4743l1;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.unity3d.ironsourceads.rewarded.RewardedAd;
import com.unity3d.ironsourceads.rewarded.RewardedAdRequest;
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

/* loaded from: classes9.dex */
public final class Zd implements Bb, InterfaceC4587c6 {

    @NotNull
    private final RewardedAdRequest a;

    @NotNull
    private final Cb b;

    @NotNull
    private final V<RewardedAd> c;

    @NotNull
    private final InterfaceC4816p2 d;

    @NotNull
    private final InterfaceC4937vc e;

    @NotNull
    private final InterfaceC4868s1 f;

    @NotNull
    private final InterfaceC4617e0<RewardedAd> g;

    @NotNull
    private final InterfaceC4740kg.c h;

    @NotNull
    private final Executor i;
    private C4658g5 j;

    @Nullable
    private InterfaceC4740kg k;

    @Nullable
    private Y1 l;
    private boolean m;

    public static final class a implements InterfaceC4740kg.a {
        a() {
        }

        @Override // com.ironsource.InterfaceC4740kg.a
        public void a() {
            Zd.this.a(C4908u5.a.s());
        }
    }

    public Zd(@NotNull RewardedAdRequest adRequest, @NotNull Cb loadTaskConfig, @NotNull V<RewardedAd> adLoadTaskListener, @NotNull InterfaceC4816p2 auctionResponseFetcher, @NotNull InterfaceC4937vc networkLoadApi, @NotNull InterfaceC4868s1 analytics, @NotNull InterfaceC4617e0<RewardedAd> adObjectFactory, @NotNull InterfaceC4740kg.c timerFactory, @NotNull Executor taskFinishedExecutor) {
        Intrinsics.checkNotNullParameter(adRequest, "adRequest");
        Intrinsics.checkNotNullParameter(loadTaskConfig, "loadTaskConfig");
        Intrinsics.checkNotNullParameter(adLoadTaskListener, "adLoadTaskListener");
        Intrinsics.checkNotNullParameter(auctionResponseFetcher, "auctionResponseFetcher");
        Intrinsics.checkNotNullParameter(networkLoadApi, "networkLoadApi");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(adObjectFactory, "adObjectFactory");
        Intrinsics.checkNotNullParameter(timerFactory, "timerFactory");
        Intrinsics.checkNotNullParameter(taskFinishedExecutor, "taskFinishedExecutor");
        this.a = adRequest;
        this.b = loadTaskConfig;
        this.c = adLoadTaskListener;
        this.d = auctionResponseFetcher;
        this.e = networkLoadApi;
        this.f = analytics;
        this.g = adObjectFactory;
        this.h = timerFactory;
        this.i = taskFinishedExecutor;
    }

    @Override // com.ironsource.InterfaceC4587c6
    public void a(@NotNull final K9 adInstance) {
        Intrinsics.checkNotNullParameter(adInstance, "adInstance");
        try {
            this.i.execute(new Runnable() { // from class: com.ironsource.Zd$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    Zd.a(Zd.this, adInstance);
                }
            });
        } catch (Exception e) {
            a(e);
        }
    }

    @Override // com.ironsource.Bb
    public void start() {
        this.j = new C4658g5();
        this.f.a(new C4797o1.s(this.b.f()), new C4797o1.n(this.b.g().b()), new C4797o1.b(this.a.getAdId$mediationsdk_release()));
        InterfaceC4743l1.c.a.a().a(this.f);
        a(this.a.getExtraParams());
        long h = this.b.h();
        InterfaceC4740kg.c cVar = this.h;
        InterfaceC4740kg.b bVar = new InterfaceC4740kg.b();
        bVar.b(h);
        Unit unit = Unit.INSTANCE;
        InterfaceC4740kg a2 = cVar.a(bVar);
        this.k = a2;
        if (a2 != null) {
            a2.a(new a());
        }
        Object a3 = this.d.a();
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
        EnumC4823p9 g = this.b.g();
        C4569b6 c4569b6 = new C4569b6();
        c4569b6.a(this);
        K9 adInstance = new L9(this.a.getProviderName$mediationsdk_release().value(), c4569b6).a(g.b(EnumC4823p9.Bidder)).b(this.b.i()).c().a(this.a.getAdId$mediationsdk_release()).a(MapsKt.plus(new C4808oc().a(), R5.a.a(this.a.getExtraParams()))).a();
        InterfaceC4868s1 interfaceC4868s12 = this.f;
        String e = adInstance.e();
        Intrinsics.checkNotNullExpressionValue(e, "adInstance.id");
        interfaceC4868s12.a(new C4797o1.b(e));
        C4973xc c4973xc = new C4973xc(c4762m2, this.b.j());
        this.l = new Y1(new C4787n9(this.a.getInstanceId(), g.b(), c4762m2.a()), new com.ironsource.mediationsdk.d(), c4762m2.c());
        InterfaceC4743l1.d.a.c().a(this.f);
        InterfaceC4937vc interfaceC4937vc = this.e;
        Intrinsics.checkNotNullExpressionValue(adInstance, "adInstance");
        interfaceC4937vc.a(adInstance, c4973xc);
    }

    public /* synthetic */ Zd(RewardedAdRequest rewardedAdRequest, Cb cb, V v, InterfaceC4816p2 interfaceC4816p2, InterfaceC4937vc interfaceC4937vc, InterfaceC4868s1 interfaceC4868s1, InterfaceC4617e0 interfaceC4617e0, InterfaceC4740kg.c cVar, Executor executor, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(rewardedAdRequest, cb, v, interfaceC4816p2, interfaceC4937vc, interfaceC4868s1, interfaceC4617e0, (i & 128) != 0 ? new InterfaceC4740kg.d() : cVar, (i & 256) != 0 ? R7.a.d() : executor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Zd this$0, K9 adInstance) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(adInstance, "$adInstance");
        if (this$0.m) {
            return;
        }
        this$0.m = true;
        InterfaceC4740kg interfaceC4740kg = this$0.k;
        if (interfaceC4740kg != null) {
            interfaceC4740kg.cancel();
        }
        C4658g5 c4658g5 = this$0.j;
        if (c4658g5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("taskStartedTime");
            c4658g5 = null;
        }
        InterfaceC4743l1.c.a.a(new C4797o1.f(C4658g5.a(c4658g5))).a(this$0.f);
        Y1 y1 = this$0.l;
        if (y1 != null) {
            y1.c("onAdInstanceLoadSuccess");
        }
        InterfaceC4617e0<RewardedAd> interfaceC4617e0 = this$0.g;
        Y1 y12 = this$0.l;
        Intrinsics.checkNotNull(y12);
        this$0.c.a(interfaceC4617e0.a(adInstance, y12));
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

    @Override // com.ironsource.InterfaceC4587c6
    public void a(@NotNull String description) {
        Intrinsics.checkNotNullParameter(description, "description");
        a(C4908u5.a.c(description));
    }

    public final void a(@NotNull final IronSourceError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        try {
            this.i.execute(new Runnable() { // from class: com.ironsource.Zd$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    Zd.a(Zd.this, error);
                }
            });
        } catch (Exception e) {
            a(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Zd this$0, IronSourceError error) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(error, "$error");
        if (this$0.m) {
            return;
        }
        this$0.m = true;
        InterfaceC4740kg interfaceC4740kg = this$0.k;
        if (interfaceC4740kg != null) {
            interfaceC4740kg.cancel();
        }
        InterfaceC4743l1.c.a aVar = InterfaceC4743l1.c.a;
        C4797o1.j jVar = new C4797o1.j(error.getErrorCode());
        C4797o1.k kVar = new C4797o1.k(error.getErrorMessage());
        C4658g5 c4658g5 = this$0.j;
        if (c4658g5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("taskStartedTime");
            c4658g5 = null;
        }
        aVar.a(jVar, kVar, new C4797o1.f(C4658g5.a(c4658g5))).a(this$0.f);
        Y1 y1 = this$0.l;
        if (y1 != null) {
            y1.a("onAdInstanceLoadFail");
        }
        this$0.c.b(error);
    }

    private final void a(Exception exc) {
        IronSourceError buildLoadFailedError = ErrorBuilder.buildLoadFailedError(exc.getMessage());
        InterfaceC4743l1.d.a.a(new C4797o1.k(buildLoadFailedError.getErrorMessage())).a(this.f);
        IronLog.CALLBACK.error(buildLoadFailedError.getErrorMessage());
    }
}
