package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdInfo;
import kotlin.NotImplementedError;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes10.dex */
public final class Tb extends AbstractC4759m implements InterfaceC4683hc, M0, InterfaceC4997z0 {

    @NotNull
    private final Wb b;

    @NotNull
    private final C4814p0 c;

    @NotNull
    private final C4611dc d;
    private C4647fc e;

    @NotNull
    private LevelPlayAdInfo f;

    public Tb(@NotNull Wb listener, @NotNull C4814p0 adTools, @NotNull C4611dc nativeAdProperties) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        Intrinsics.checkNotNullParameter(nativeAdProperties, "nativeAdProperties");
        this.b = listener;
        this.c = adTools;
        this.d = nativeAdProperties;
        this.f = m();
    }

    private final LevelPlayAdInfo m() {
        String uuid = this.d.b().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "nativeAdProperties.adId.toString()");
        String c = this.d.c();
        String aVar = this.d.a().toString();
        Intrinsics.checkNotNullExpressionValue(aVar, "nativeAdProperties.adFormat.toString()");
        return new LevelPlayAdInfo(uuid, c, aVar, null, null, null, null, 120, null);
    }

    public final void a(@NotNull Qb nativeAdBinder) {
        Intrinsics.checkNotNullParameter(nativeAdBinder, "nativeAdBinder");
        C4647fc c4647fc = this.e;
        if (c4647fc == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeAdUnit");
            c4647fc = null;
        }
        c4647fc.a(new Yb(nativeAdBinder), this);
    }

    @Override // com.ironsource.InterfaceC4997z0
    public void c(@Nullable IronSourceError ironSourceError) {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // com.ironsource.K0
    public void e() {
        this.b.b(this.f);
    }

    public final void n() {
        this.f = m();
        C4647fc c4647fc = this.e;
        if (c4647fc == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeAdUnit");
            c4647fc = null;
        }
        c4647fc.a(true);
    }

    public final void o() {
        C4647fc a = a(this.c, this.d);
        this.e = a;
        if (a == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeAdUnit");
            a = null;
        }
        a.a((M0) this);
    }

    private final C4647fc a(C4814p0 c4814p0, C4611dc c4611dc) {
        IronLog.INTERNAL.verbose();
        return new C4647fc(c4814p0, C4665gc.y.a(c4611dc, l().a()), this);
    }

    @Override // com.ironsource.M0
    public void a(@NotNull C4903u0 adUnitCallback) {
        Intrinsics.checkNotNullParameter(adUnitCallback, "adUnitCallback");
        LevelPlayAdInfo c = adUnitCallback.c();
        if (c != null) {
            this.f = c;
            this.b.a(c);
        }
    }

    @Override // com.ironsource.InterfaceC4997z0
    public void a(@NotNull LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // com.ironsource.M0
    public void a(@Nullable IronSourceError ironSourceError) {
        this.b.onNativeAdLoadFailed(ironSourceError);
    }
}
