package com.inmobi.media;

import android.os.SystemClock;
import com.inmobi.media.ads.nativeAd.InMobiNativeViewData;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class Cd extends AbstractC4483y implements Ih, Bj, I, InterfaceC4009g {
    public final Sc b;
    public final C4456x c;
    public final AbstractC4353t1 d;
    public final Nc e;
    public final C4261pe f;
    public final C4456x g;
    public final Sc h;
    public final Uc i;
    public final Nc j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Cd(C4261pe nativePubData, C4456x adComponent, Sc adUnit, AbstractC4353t1 adUnitTimeout, Uc nativeCallback, Nc stateMachine) {
        super(adComponent);
        Intrinsics.checkNotNullParameter(nativePubData, "nativePubData");
        Intrinsics.checkNotNullParameter(adComponent, "adComponent");
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        Intrinsics.checkNotNullParameter(adUnitTimeout, "adUnitTimeout");
        Intrinsics.checkNotNullParameter(nativeCallback, "nativeCallback");
        Intrinsics.checkNotNullParameter(stateMachine, "stateMachine");
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        Intrinsics.checkNotNullParameter(adComponent, "adComponent");
        Intrinsics.checkNotNullParameter(adUnitTimeout, "adUnitTimeout");
        Intrinsics.checkNotNullParameter(stateMachine, "stateMachine");
        this.b = adUnit;
        this.c = adComponent;
        this.d = adUnitTimeout;
        this.e = stateMachine;
        this.f = nativePubData;
        this.g = adComponent;
        this.h = adUnit;
        this.i = nativeCallback;
        this.j = stateMachine;
    }

    @Override // com.inmobi.media.Bj
    public final void a() {
        InterfaceC4466x9 l = l();
        if (l != null) {
            ((C4493y9) l).a("AUM-NativeLoadedState", "Initialize Called - ad ready for display");
        }
        InterfaceC4466x9 l2 = l();
        if (l2 != null) {
            ((C4493y9) l2).a("AUM-LoadedState", "Initialize Called");
        }
        this.d.e();
        C3903c0 c3903c0 = this.a.a.d;
        c3903c0.getClass();
        c3903c0.g = SystemClock.elapsedRealtime();
        X4.a(k(), new Bd(this, null));
    }

    @Override // com.inmobi.media.Bj
    public final void c() {
    }

    @Override // com.inmobi.media.I
    public final void g() {
        InterfaceC4466x9 l = l();
        if (l != null) {
            ((C4493y9) l).a("AUM-LoadedState", "onAdDisplayed");
        }
        InterfaceC4466x9 l2 = l();
        if (l2 != null) {
            ((C4493y9) l2).a("AUM-NativeLoadedState", "transitionToRenderedState - ad is being displayed");
        }
        this.j.a(new Ge(this.h, this.g, this.i, this.j), this);
    }

    @Override // com.inmobi.media.InterfaceC4009g
    public final void j() {
        InterfaceC4466x9 l = l();
        if (l != null) {
            ((C4493y9) l).a("AUM-LoadedState", "onDestroy");
        }
        this.e.a(new C4515z5(this.b, this.d, this.c), this);
    }

    @Override // com.inmobi.media.Ih
    public final void a(InMobiNativeViewData inMobiNativeViewData) {
        Intrinsics.checkNotNullParameter(inMobiNativeViewData, "inMobiNativeViewData");
        InterfaceC4466x9 l = l();
        if (l != null) {
            ((C4493y9) l).a("AUM-NativeLoadedState", "registerViewForTracking - delegating to ad unit");
        }
        Sc sc = this.h;
        sc.getClass();
        Intrinsics.checkNotNullParameter(inMobiNativeViewData, "inMobiNativeViewData");
        sc.b.a(inMobiNativeViewData);
    }
}
