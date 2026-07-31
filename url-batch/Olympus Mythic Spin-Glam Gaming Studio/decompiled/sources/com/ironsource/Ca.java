package com.ironsource;

import android.graphics.Rect;
import android.view.ViewTreeObserver;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes13.dex */
public final class Ca implements InterfaceC4989ya {

    @NotNull
    private final C4814p0 a;

    @NotNull
    private final W2 b;
    private final long c;
    private final long d;

    @NotNull
    private final J2 e;

    @NotNull
    private InterfaceC5007za f;

    @NotNull
    private final N2 g;

    @NotNull
    private final Gf h;

    @NotNull
    private final InterfaceC4818p4 i;
    private final boolean j;

    @NotNull
    private M0 k;

    @NotNull
    private InterfaceC4997z0 l;

    @NotNull
    private O2 m;

    @NotNull
    private Ma n;

    public static final class a implements O2 {
        a() {
        }

        public void a() {
            Ca.this.n().onAdLeftApplication();
        }

        public void b() {
            Ca.this.n().k();
        }

        public void c() {
            Ca.this.n().i();
        }

        @Override // com.ironsource.K0
        public void e() {
            Ca.this.n().onAdClicked();
        }

        @Override // com.ironsource.O2
        public /* bridge */ /* synthetic */ Unit g() {
            a();
            return Unit.INSTANCE;
        }

        @Override // com.ironsource.O2
        public /* bridge */ /* synthetic */ Unit h() {
            c();
            return Unit.INSTANCE;
        }

        @Override // com.ironsource.O2
        public /* bridge */ /* synthetic */ Unit j() {
            b();
            return Unit.INSTANCE;
        }
    }

    public static final class b implements M0 {
        b() {
        }

        @Override // com.ironsource.M0
        public void a(@NotNull C4903u0 adUnitCallback) {
            Intrinsics.checkNotNullParameter(adUnitCallback, "adUnitCallback");
            Ca.this.m().a(adUnitCallback);
        }

        @Override // com.ironsource.M0
        public void a(@Nullable IronSourceError ironSourceError) {
            Ca.this.m().a(ironSourceError);
        }
    }

    public static final class c implements InterfaceC4997z0 {
        c() {
        }

        @Override // com.ironsource.InterfaceC4997z0
        public void a(@NotNull LevelPlayAdInfo adInfo) {
            Intrinsics.checkNotNullParameter(adInfo, "adInfo");
            Ca.this.n().onAdDisplayed(adInfo);
        }

        @Override // com.ironsource.InterfaceC4997z0
        public void c(@Nullable IronSourceError ironSourceError) {
            Ca.this.n().d(ironSourceError);
        }
    }

    static final class d extends Lambda implements Function0 {
        final /* synthetic */ L2 b;
        final /* synthetic */ AbstractC4638f3 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(L2 l2, AbstractC4638f3 abstractC4638f3) {
            super(0);
            this.b = l2;
            this.c = abstractC4638f3;
        }

        public final void a() {
            Ca.a(Ca.this, this.b, this.c, false, 4, (Object) null);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo4828invoke() {
            a();
            return Unit.INSTANCE;
        }
    }

    static final class e extends Lambda implements Function0 {
        final /* synthetic */ L2 b;
        final /* synthetic */ Long c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(L2 l2, Long l) {
            super(0);
            this.b = l2;
            this.c = l;
        }

        public final void a() {
            Ca ca = Ca.this;
            ca.a((Ma) new Ga(ca, this.b, this.c));
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo4828invoke() {
            a();
            return Unit.INSTANCE;
        }
    }

    public static final class f implements ViewTreeObserver.OnGlobalLayoutListener {
        final /* synthetic */ L2 b;
        final /* synthetic */ AbstractC4638f3 c;
        final /* synthetic */ Long d;

        static final class a extends Lambda implements Function0 {
            final /* synthetic */ Ca a;
            final /* synthetic */ L2 b;
            final /* synthetic */ AbstractC4638f3 c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Ca ca, L2 l2, AbstractC4638f3 abstractC4638f3) {
                super(0);
                this.a = ca;
                this.b = l2;
                this.c = abstractC4638f3;
            }

            public final void a() {
                Ca.a(this.a, this.b, this.c, false, 4, (Object) null);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo4828invoke() {
                a();
                return Unit.INSTANCE;
            }
        }

        static final class b extends Lambda implements Function0 {
            final /* synthetic */ Ca a;
            final /* synthetic */ L2 b;
            final /* synthetic */ Long c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(Ca ca, L2 l2, Long l) {
                super(0);
                this.a = ca;
                this.b = l2;
                this.c = l;
            }

            public final void a() {
                Ca ca = this.a;
                ca.a((Ma) new Ga(ca, this.b, this.c));
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo4828invoke() {
                a();
                return Unit.INSTANCE;
            }
        }

        f(L2 l2, AbstractC4638f3 abstractC4638f3, Long l) {
            this.b = l2;
            this.c = abstractC4638f3;
            this.d = l;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (Ca.this.k().getViewTreeObserver().isAlive()) {
                Ca.this.k().getViewTreeObserver().removeOnGlobalLayoutListener(this);
            }
            if (Jg.a(Ca.this.k(), new Rect())) {
                Ca.this.a().c(AbstractRunnableC4756le.a.a(new a(Ca.this, this.b, this.c)));
            } else {
                Ca.this.a().c(AbstractRunnableC4756le.a.a(new b(Ca.this, this.b, this.d)));
            }
        }
    }

    public Ca(@NotNull C4814p0 adTools, @NotNull W2 bannerContainer, long j, long j2, @NotNull J2 bannerAdProperties, @NotNull InterfaceC5007za strategyListener, @NotNull N2 bannerAdUnitFactory, @NotNull Gf taskScheduler, @NotNull InterfaceC4818p4 timeProvider, boolean z) {
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        Intrinsics.checkNotNullParameter(bannerContainer, "bannerContainer");
        Intrinsics.checkNotNullParameter(bannerAdProperties, "bannerAdProperties");
        Intrinsics.checkNotNullParameter(strategyListener, "strategyListener");
        Intrinsics.checkNotNullParameter(bannerAdUnitFactory, "bannerAdUnitFactory");
        Intrinsics.checkNotNullParameter(taskScheduler, "taskScheduler");
        Intrinsics.checkNotNullParameter(timeProvider, "timeProvider");
        this.a = adTools;
        this.b = bannerContainer;
        this.c = j;
        this.d = j2;
        this.e = bannerAdProperties;
        this.f = strategyListener;
        this.g = bannerAdUnitFactory;
        this.h = taskScheduler;
        this.i = timeProvider;
        this.j = z;
        this.k = new b();
        this.l = new c();
        this.m = new a();
        this.n = new Ea(this, false, 2, null);
    }

    @NotNull
    public final C4814p0 a() {
        return this.a;
    }

    public final void b(@NotNull InterfaceC5007za interfaceC5007za) {
        Intrinsics.checkNotNullParameter(interfaceC5007za, "<set-?>");
        this.f = interfaceC5007za;
    }

    @Override // com.ironsource.InterfaceC4989ya
    public void c() {
        this.n.c();
    }

    @Override // com.ironsource.InterfaceC4989ya
    public void d() {
        this.n.d();
    }

    @NotNull
    public final O2 e() {
        return this.m;
    }

    @Override // com.ironsource.InterfaceC4989ya
    public void f() {
        this.n.f();
    }

    @NotNull
    public final M0 g() {
        return this.k;
    }

    @NotNull
    public final InterfaceC4997z0 h() {
        return this.l;
    }

    @NotNull
    public final J2 i() {
        return this.e;
    }

    @NotNull
    public final N2 j() {
        return this.g;
    }

    @NotNull
    public final W2 k() {
        return this.b;
    }

    public final long l() {
        return this.c;
    }

    @NotNull
    public final Ma m() {
        return this.n;
    }

    @NotNull
    public final InterfaceC5007za n() {
        return this.f;
    }

    @NotNull
    public final Gf o() {
        return this.h;
    }

    @NotNull
    public final InterfaceC4818p4 p() {
        return this.i;
    }

    public final long q() {
        return this.d;
    }

    public final void r() {
        this.a.f().h().h("Banner view is not visible");
    }

    public final void a(@NotNull M0 m0) {
        Intrinsics.checkNotNullParameter(m0, "<set-?>");
        this.k = m0;
    }

    @Override // com.ironsource.InterfaceC4989ya
    public void b() {
        this.n.b();
    }

    public final void a(@NotNull InterfaceC4997z0 interfaceC4997z0) {
        Intrinsics.checkNotNullParameter(interfaceC4997z0, "<set-?>");
        this.l = interfaceC4997z0;
    }

    public final void a(@NotNull O2 o2) {
        Intrinsics.checkNotNullParameter(o2, "<set-?>");
        this.m = o2;
    }

    public final void a(@NotNull Ma ma) {
        Intrinsics.checkNotNullParameter(ma, "<set-?>");
        this.n = ma;
    }

    public final void a(@NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.a.f().h().f("Banner Reload Strategy - " + message);
    }

    public final void a(@NotNull C4903u0 adUnitCallback, @NotNull L2 currentAdUnit, @Nullable L2 l2, @NotNull AbstractC4638f3 reloadReason, boolean z, @Nullable Long l) {
        Unit unit;
        Intrinsics.checkNotNullParameter(adUnitCallback, "adUnitCallback");
        Intrinsics.checkNotNullParameter(currentAdUnit, "currentAdUnit");
        Intrinsics.checkNotNullParameter(reloadReason, "reloadReason");
        currentAdUnit.a(this.b.getViewBinder(), this.l);
        LevelPlayAdInfo c2 = adUnitCallback.c();
        if (c2 != null) {
            this.f.onAdLoaded(c2);
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            IronLog.INTERNAL.error(C4814p0.a(this.a, "adInfo is null in handleLoadSuccess", (String) null, 2, (Object) null));
        }
        if (l2 != null) {
            l2.a(false);
        }
        if (z) {
            this.n = new Ia(this, currentAdUnit);
        } else {
            a(currentAdUnit, reloadReason, l);
        }
    }

    public final void a(@Nullable IronSourceError ironSourceError, @NotNull L2 currentAdUnit, @NotNull AbstractC4638f3 reloadReason, boolean z, boolean z2, @Nullable Long l) {
        Intrinsics.checkNotNullParameter(currentAdUnit, "currentAdUnit");
        Intrinsics.checkNotNullParameter(reloadReason, "reloadReason");
        this.f.b(ironSourceError);
        if (z2) {
            this.n = new Ia(this, currentAdUnit);
        } else if (z) {
            a(currentAdUnit, reloadReason, l);
        } else {
            a(currentAdUnit, reloadReason, this.j);
        }
    }

    public final void a(@NotNull final L2 currentAdUnit, @NotNull final AbstractC4638f3 reloadReason, @Nullable final Long l) {
        Intrinsics.checkNotNullParameter(currentAdUnit, "currentAdUnit");
        Intrinsics.checkNotNullParameter(reloadReason, "reloadReason");
        C4936vb.a(this.a, new Runnable() { // from class: com.ironsource.Ca$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                Ca.a(Ca.this, currentAdUnit, reloadReason, l);
            }
        }, 0L, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Ca this$0, L2 currentAdUnit, AbstractC4638f3 reloadReason, Long l) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(currentAdUnit, "$currentAdUnit");
        Intrinsics.checkNotNullParameter(reloadReason, "$reloadReason");
        if (Jg.a(this$0.b, new Rect())) {
            this$0.a.c(AbstractRunnableC4756le.a.a(this$0.new d(currentAdUnit, reloadReason)));
        } else if (!this$0.b.getViewTreeObserver().isAlive()) {
            this$0.a.c(AbstractRunnableC4756le.a.a(this$0.new e(currentAdUnit, l)));
        } else {
            this$0.b.getViewTreeObserver().addOnGlobalLayoutListener(this$0.new f(currentAdUnit, reloadReason, l));
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ Ca(C4814p0 c4814p0, W2 w2, long j, long j2, J2 j22, InterfaceC5007za interfaceC5007za, N2 n2, Gf gf, InterfaceC4818p4 interfaceC4818p4, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(c4814p0, w2, j, j2, j22, interfaceC5007za, n2, r13, interfaceC4818p4, z);
        Gf gf2;
        if ((i & 128) != 0) {
            gf2 = new Ff(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        } else {
            gf2 = gf;
        }
    }

    public static /* synthetic */ void a(Ca ca, L2 l2, AbstractC4638f3 abstractC4638f3, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        ca.a(l2, abstractC4638f3, z);
    }

    public final void a(@NotNull L2 currentAdUnit, @NotNull AbstractC4638f3 reloadReason, boolean z) {
        Intrinsics.checkNotNullParameter(currentAdUnit, "currentAdUnit");
        Intrinsics.checkNotNullParameter(reloadReason, "reloadReason");
        L2 a2 = this.g.a(false);
        Ja ja = new Ja(this, currentAdUnit, a2, this.i.a(), z);
        a(reloadReason);
        this.n = ja;
        a2.a(this.k);
    }

    private final void a(AbstractC4638f3 abstractC4638f3) {
        this.a.f().h().a(abstractC4638f3.c(), abstractC4638f3.b(), abstractC4638f3.a());
    }

    @Override // com.ironsource.InterfaceC4989ya
    public void a(@NotNull InterfaceC5007za listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f = listener;
    }
}
