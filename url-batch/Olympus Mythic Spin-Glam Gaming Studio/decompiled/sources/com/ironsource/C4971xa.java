package com.ironsource;

import com.ironsource.InterfaceC4818p4;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.ironsource.xa, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C4971xa extends AbstractC4759m implements O2, InterfaceC5007za {

    @NotNull
    private final C4814p0 b;

    @NotNull
    private final J2 c;

    @NotNull
    private final WeakReference<InterfaceC4999z2> d;

    @NotNull
    private LevelPlayAdInfo e;

    @NotNull
    private final InterfaceC4989ya f;

    public C4971xa(@NotNull InterfaceC4999z2 listener, @NotNull C4814p0 adTools, @NotNull J2 bannerAdProperties, @NotNull W2 bannerViewContainer) {
        InterfaceC4989ya a;
        Intrinsics.checkNotNullParameter(listener, "listener");
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        Intrinsics.checkNotNullParameter(bannerAdProperties, "bannerAdProperties");
        Intrinsics.checkNotNullParameter(bannerViewContainer, "bannerViewContainer");
        this.b = adTools;
        this.c = bannerAdProperties;
        this.d = new WeakReference<>(listener);
        this.e = n();
        a = Ua.a.a(adTools, bannerViewContainer, adTools.d(bannerAdProperties.c()), bannerAdProperties, this, m(), (r17 & 64) != 0 ? new InterfaceC4818p4.a() : null);
        this.f = a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final L2 a(C4971xa this$0, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return this$0.a(this$0.b, this$0.c, z);
    }

    private final N2 m() {
        return new N2() { // from class: com.ironsource.xa$$ExternalSyntheticLambda0
            @Override // com.ironsource.N2
            public final L2 a(boolean z) {
                L2 a;
                a = C4971xa.a(C4971xa.this, z);
                return a;
            }
        };
    }

    private final LevelPlayAdInfo n() {
        String uuid = this.c.b().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "bannerAdProperties.adId.toString()");
        String c = this.c.c();
        String aVar = this.c.a().toString();
        Intrinsics.checkNotNullExpressionValue(aVar, "bannerAdProperties.adFormat.toString()");
        return new LevelPlayAdInfo(uuid, c, aVar, null, null, null, null, 120, null);
    }

    public final void b() {
        this.f.b();
    }

    public final void c() {
        this.f.c();
    }

    public final void d() {
        this.f.d();
    }

    @Override // com.ironsource.K0
    public void e() {
        onAdClicked();
    }

    public final void f() {
        this.f.f();
    }

    @Override // com.ironsource.O2
    public /* bridge */ /* synthetic */ Unit g() {
        o();
        return Unit.INSTANCE;
    }

    @Override // com.ironsource.O2
    public /* bridge */ /* synthetic */ Unit h() {
        q();
        return Unit.INSTANCE;
    }

    @Override // com.ironsource.InterfaceC5007za
    public void i() {
        InterfaceC4999z2 interfaceC4999z2 = this.d.get();
        if (interfaceC4999z2 != null) {
            interfaceC4999z2.a(this.e);
        }
    }

    @Override // com.ironsource.O2
    public /* bridge */ /* synthetic */ Unit j() {
        p();
        return Unit.INSTANCE;
    }

    @Override // com.ironsource.InterfaceC5007za
    public void k() {
        InterfaceC4999z2 interfaceC4999z2 = this.d.get();
        if (interfaceC4999z2 != null) {
            interfaceC4999z2.c(this.e);
        }
    }

    public void o() {
        onAdLeftApplication();
    }

    @Override // com.ironsource.InterfaceC5007za
    public void onAdClicked() {
        InterfaceC4999z2 interfaceC4999z2 = this.d.get();
        if (interfaceC4999z2 != null) {
            interfaceC4999z2.d(this.e);
        }
    }

    @Override // com.ironsource.InterfaceC5007za
    public void onAdDisplayed(@NotNull LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.e = adInfo;
        InterfaceC4999z2 interfaceC4999z2 = this.d.get();
        if (interfaceC4999z2 != null) {
            interfaceC4999z2.b(this.e);
        }
    }

    @Override // com.ironsource.InterfaceC5007za
    public void onAdLeftApplication() {
        InterfaceC4999z2 interfaceC4999z2 = this.d.get();
        if (interfaceC4999z2 != null) {
            interfaceC4999z2.e(this.e);
        }
    }

    @Override // com.ironsource.InterfaceC5007za
    public void onAdLoaded(@NotNull LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.e = adInfo;
        InterfaceC4999z2 interfaceC4999z2 = this.d.get();
        if (interfaceC4999z2 != null) {
            interfaceC4999z2.a(adInfo, false);
        }
    }

    public void p() {
        k();
    }

    public void q() {
        i();
    }

    private final L2 a(C4814p0 c4814p0, J2 j2, boolean z) {
        IronLog.INTERNAL.verbose();
        return new L2(c4814p0, M2.z.a(j2, l().a(), z), this);
    }

    @Override // com.ironsource.InterfaceC5007za
    public void b(@Nullable IronSourceError ironSourceError) {
        InterfaceC4999z2 interfaceC4999z2 = this.d.get();
        if (interfaceC4999z2 != null) {
            String uuid = this.c.b().toString();
            Intrinsics.checkNotNullExpressionValue(uuid, "bannerAdProperties.adId.toString()");
            interfaceC4999z2.a(new LevelPlayAdError(ironSourceError, uuid, this.c.c()));
        }
    }

    @Override // com.ironsource.InterfaceC5007za
    public void d(@Nullable IronSourceError ironSourceError) {
        InterfaceC4999z2 interfaceC4999z2 = this.d.get();
        if (interfaceC4999z2 != null) {
            LevelPlayAdInfo levelPlayAdInfo = this.e;
            String uuid = this.c.b().toString();
            Intrinsics.checkNotNullExpressionValue(uuid, "bannerAdProperties.adId.toString()");
            interfaceC4999z2.a(levelPlayAdInfo, new LevelPlayAdError(ironSourceError, uuid, this.c.c()));
        }
    }
}
