package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdInfo;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes11.dex */
public final class Oa implements InterfaceC4989ya {

    @NotNull
    private final C4814p0 a;

    @NotNull
    private final W2 b;

    @NotNull
    private final N2 c;

    @Nullable
    private InterfaceC5007za d;

    @NotNull
    private Ta e;

    @Nullable
    private L2 f;

    @NotNull
    private final M0 g;

    @NotNull
    private final InterfaceC4997z0 h;

    @NotNull
    private final O2 i;

    public static final class a implements O2 {
        a() {
        }

        public void a() {
            InterfaceC5007za m = Oa.this.m();
            if (m != null) {
                m.onAdLeftApplication();
            }
        }

        public void b() {
            InterfaceC5007za m = Oa.this.m();
            if (m != null) {
                m.k();
            }
        }

        public void c() {
            InterfaceC5007za m = Oa.this.m();
            if (m != null) {
                m.i();
            }
        }

        @Override // com.ironsource.K0
        public void e() {
            InterfaceC5007za m = Oa.this.m();
            if (m != null) {
                m.onAdClicked();
            }
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
            Oa.this.l().a(adUnitCallback);
        }

        @Override // com.ironsource.M0
        public void a(@Nullable IronSourceError ironSourceError) {
            Oa.this.l().a(ironSourceError);
        }
    }

    public static final class c implements InterfaceC4997z0 {
        c() {
        }

        @Override // com.ironsource.InterfaceC4997z0
        public void a(@NotNull LevelPlayAdInfo adInfo) {
            Intrinsics.checkNotNullParameter(adInfo, "adInfo");
            InterfaceC5007za m = Oa.this.m();
            if (m != null) {
                m.onAdDisplayed(adInfo);
            }
        }

        @Override // com.ironsource.InterfaceC4997z0
        public void c(@Nullable IronSourceError ironSourceError) {
            InterfaceC5007za m = Oa.this.m();
            if (m != null) {
                m.d(ironSourceError);
            }
        }
    }

    public Oa(@NotNull C4814p0 adTools, @NotNull W2 bannerContainer, @NotNull N2 bannerAdUnitFactory) {
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        Intrinsics.checkNotNullParameter(bannerContainer, "bannerContainer");
        Intrinsics.checkNotNullParameter(bannerAdUnitFactory, "bannerAdUnitFactory");
        this.a = adTools;
        this.b = bannerContainer;
        this.c = bannerAdUnitFactory;
        this.e = new Pa(this);
        this.g = new b();
        this.h = new c();
        this.i = new a();
    }

    @NotNull
    public final C4814p0 a() {
        return this.a;
    }

    public final void b(@Nullable InterfaceC5007za interfaceC5007za) {
        this.d = interfaceC5007za;
    }

    @Override // com.ironsource.InterfaceC4989ya
    public void c() {
        this.e.c();
    }

    @Override // com.ironsource.InterfaceC4989ya
    public void d() {
    }

    @NotNull
    public final O2 e() {
        return this.i;
    }

    @Override // com.ironsource.InterfaceC4989ya
    public void f() {
    }

    @NotNull
    public final M0 g() {
        return this.g;
    }

    @NotNull
    public final InterfaceC4997z0 h() {
        return this.h;
    }

    @NotNull
    public final N2 i() {
        return this.c;
    }

    @NotNull
    public final W2 j() {
        return this.b;
    }

    @Nullable
    public final L2 k() {
        return this.f;
    }

    @NotNull
    public final Ta l() {
        return this.e;
    }

    @Nullable
    public final InterfaceC5007za m() {
        return this.d;
    }

    public final void a(@NotNull Ta ta) {
        Intrinsics.checkNotNullParameter(ta, "<set-?>");
        this.e = ta;
    }

    @Override // com.ironsource.InterfaceC4989ya
    public void b() {
        this.e.b();
    }

    public final void a(@Nullable L2 l2) {
        this.f = l2;
    }

    public final void a(@NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.a.f().h().f("Banner Single Ad Unit Strategy - " + message);
    }

    public final void a(@NotNull C4903u0 adUnitCallback, @NotNull L2 adUnit) {
        InterfaceC5007za interfaceC5007za;
        Intrinsics.checkNotNullParameter(adUnitCallback, "adUnitCallback");
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        adUnit.a(this.b.getViewBinder(), this.h);
        LevelPlayAdInfo c2 = adUnitCallback.c();
        if (c2 == null || (interfaceC5007za = this.d) == null) {
            return;
        }
        interfaceC5007za.onAdLoaded(c2);
    }

    public final void a(@Nullable IronSourceError ironSourceError) {
        InterfaceC5007za interfaceC5007za = this.d;
        if (interfaceC5007za != null) {
            interfaceC5007za.b(ironSourceError);
        }
    }

    @Override // com.ironsource.InterfaceC4989ya
    public void a(@NotNull InterfaceC5007za listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.d = listener;
    }
}
