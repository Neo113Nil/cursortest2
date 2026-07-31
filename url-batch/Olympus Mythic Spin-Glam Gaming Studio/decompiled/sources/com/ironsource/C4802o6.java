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

/* renamed from: com.ironsource.o6, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C4802o6 implements InterfaceC4838q6 {

    @NotNull
    private final Ya a;

    @NotNull
    private final LevelPlayAdInfo b;

    public C4802o6(@NotNull Ya adInternal, @NotNull LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInternal, "adInternal");
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.a = adInternal;
        this.b = adInfo;
    }

    @Override // com.ironsource.InterfaceC4838q6
    public void a(@NotNull Activity activity, @Nullable String str) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        String uuid = this.a.e().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "adInternal.adId.toString()");
        this.a.a(new LevelPlayAdError(uuid, this.a.h(), LevelPlayAdError.ERROR_CODE_SHOW_WHILE_SHOW, "Ad is already showing"), this.b);
    }

    @Override // com.ironsource.InterfaceC4838q6
    @NotNull
    public LevelPlayAdInfo b() {
        return this.b;
    }

    @Override // com.ironsource.InterfaceC4838q6
    @NotNull
    public InterfaceC4724k0 c() {
        return new InterfaceC4724k0.a("ad is showing");
    }

    @Override // com.ironsource.InterfaceC4838q6
    public void loadAd() {
        String uuid = this.a.e().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "adInternal.adId.toString()");
        Ya.a(this.a, new LevelPlayAdError(uuid, this.a.h(), LevelPlayAdError.ERROR_CODE_LOAD_WHILE_SHOW, "Load is called while ad is showing"), 0L, 2, null);
    }

    @Override // com.ironsource.InterfaceC4838q6
    public void onAdClicked() {
        this.a.b("onAdClicked on showing state");
    }

    @Override // com.ironsource.InterfaceC4838q6
    public void onAdClosed() {
        this.a.b("onAdClosed on showing state");
    }

    @Override // com.ironsource.InterfaceC4838q6
    public void onAdDisplayed(@NotNull LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        C4814p0 f = this.a.f();
        final LevelPlayAdInfo levelPlayAdInfo = new LevelPlayAdInfo(adInfo, this.b.getPlacementName());
        IronLog.INTERNAL.verbose(C4814p0.a(f, "onAdDisplayed adInfo: " + levelPlayAdInfo, (String) null, 2, (Object) null));
        f.f().h().e();
        Ya ya = this.a;
        ya.a(new C4820p6(ya, levelPlayAdInfo));
        f.d(new Runnable() { // from class: com.ironsource.o6$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                C4802o6.a(C4802o6.this, levelPlayAdInfo);
            }
        });
    }

    @Override // com.ironsource.InterfaceC4838q6
    public void onAdInfoChanged(@NotNull LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.a.b("onAdInfoChanged on showing state");
    }

    @Override // com.ironsource.InterfaceC4838q6
    public void onAdLoadFailed(@NotNull LevelPlayAdError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.a.b("onAdLoadFailed on showing state with error: " + error.getErrorMessage());
    }

    @Override // com.ironsource.InterfaceC4838q6
    public void onAdLoaded(@NotNull LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.a.b("onAdLoaded on showing state");
    }

    @Override // com.ironsource.InterfaceC4838q6
    public void a(@NotNull LevelPlayAdError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.a.a(a(error, this.b));
        this.a.a(error, this.b);
    }

    private final InterfaceC4838q6 a(LevelPlayAdError levelPlayAdError, LevelPlayAdInfo levelPlayAdInfo) {
        if (C4541a5.a.a(C4597cg.a.a(levelPlayAdError))) {
            Ya ya = this.a;
            return new C4766m6(ya, levelPlayAdInfo, ya.j());
        }
        return new C4677h6(this.a, C4677h6.a.ShowFailed);
    }

    @Override // com.ironsource.InterfaceC4838q6
    public void a() {
        this.a.b("onAdExpired on showing state");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C4802o6 this$0, LevelPlayAdInfo adInfoWithPlacement) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(adInfoWithPlacement, "$adInfoWithPlacement");
        Za k = this$0.a.k();
        if (k != null) {
            k.onAdDisplayed(adInfoWithPlacement);
        }
    }
}
