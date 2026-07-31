package com.ironsource;

import android.app.Activity;
import com.ironsource.C4677h6;
import com.ironsource.InterfaceC4724k0;
import com.ironsource.mediationsdk.logger.IronLog;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.ironsource.m6, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C4766m6 implements InterfaceC4838q6 {

    @NotNull
    private final Ya a;

    @NotNull
    private LevelPlayAdInfo b;

    @NotNull
    private final InterfaceC4818p4 c;
    private final long d;

    public C4766m6(@NotNull Ya adInternal, @NotNull LevelPlayAdInfo adInfo, @NotNull InterfaceC4818p4 currentTimeProvider) {
        Intrinsics.checkNotNullParameter(adInternal, "adInternal");
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        Intrinsics.checkNotNullParameter(currentTimeProvider, "currentTimeProvider");
        this.a = adInternal;
        this.b = adInfo;
        this.c = currentTimeProvider;
        this.d = currentTimeProvider.a();
    }

    private final long d() {
        return this.c.a() - this.d;
    }

    @Override // com.ironsource.InterfaceC4838q6
    public void a(@NotNull Activity activity, @Nullable String str) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        C4684hd a = this.a.f().a(this.a.d(), str);
        LevelPlayAdInfo levelPlayAdInfo = new LevelPlayAdInfo(this.b, str);
        this.b = levelPlayAdInfo;
        Ya ya = this.a;
        ya.a(new C4802o6(ya, levelPlayAdInfo));
        this.a.c().a(activity, a);
    }

    @Override // com.ironsource.InterfaceC4838q6
    @NotNull
    public LevelPlayAdInfo b() {
        return this.b;
    }

    @Override // com.ironsource.InterfaceC4838q6
    @NotNull
    public InterfaceC4724k0 c() {
        G3 a = this.a.l().g().a(this.a.h());
        return a.d() ? InterfaceC4724k0.a.c.a(a.e()) : InterfaceC4724k0.b.a;
    }

    @Override // com.ironsource.InterfaceC4838q6
    public void loadAd() {
        this.a.f().f().h().a(Long.valueOf(d()));
        this.a.a(this.b);
    }

    @Override // com.ironsource.InterfaceC4838q6
    public void onAdClicked() {
        this.a.b("onAdClicked on loaded state");
    }

    @Override // com.ironsource.InterfaceC4838q6
    public void onAdClosed() {
        this.a.b("onAdClosed on loaded state");
    }

    @Override // com.ironsource.InterfaceC4838q6
    public void onAdDisplayed(@NotNull LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.a.b("onAdDisplayed on loaded state");
    }

    @Override // com.ironsource.InterfaceC4838q6
    public void onAdInfoChanged(@NotNull final LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        C4814p0 f = this.a.f();
        IronLog.INTERNAL.verbose(C4814p0.a(f, "onAdInfoChanged adInfo: " + adInfo, (String) null, 2, (Object) null));
        f.f().h().a(this.b, adInfo);
        this.b = adInfo;
        f.d(new Runnable() { // from class: com.ironsource.m6$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                C4766m6.a(C4766m6.this, adInfo);
            }
        });
    }

    @Override // com.ironsource.InterfaceC4838q6
    public void onAdLoadFailed(@NotNull LevelPlayAdError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.a.b("onAdLoadFailed on loaded state with error: " + error.getErrorMessage());
    }

    @Override // com.ironsource.InterfaceC4838q6
    public void onAdLoaded(@NotNull LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.a.b("onAdLoaded on loaded state");
    }

    @Override // com.ironsource.InterfaceC4838q6
    public void a() {
        IronLog.INTERNAL.verbose(C4814p0.a(this.a.f(), "onAdExpired", (String) null, 2, (Object) null));
        this.a.a(C4677h6.a.Expired);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C4766m6 this$0, LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(adInfo, "$adInfo");
        Za k = this$0.a.k();
        if (k != null) {
            k.onAdInfoChanged(adInfo);
        }
    }

    @Override // com.ironsource.InterfaceC4838q6
    public void a(@NotNull LevelPlayAdError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.a.b("onAdDisplayFailed on loaded state with error: " + error.getErrorMessage());
    }
}
