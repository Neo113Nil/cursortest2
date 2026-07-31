package com.ironsource;

import android.app.Activity;
import com.ironsource.C4677h6;
import com.ironsource.InterfaceC4724k0;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.ironsource.n6, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C4784n6 implements InterfaceC4838q6 {

    @NotNull
    private final Ya a;

    @NotNull
    private final InterfaceC4818p4 b;
    private final long c;

    @NotNull
    private final LevelPlayAdInfo d;

    public C4784n6(@NotNull Ya adInternal, @NotNull InterfaceC4818p4 currentTimeProvider) {
        Intrinsics.checkNotNullParameter(adInternal, "adInternal");
        Intrinsics.checkNotNullParameter(currentTimeProvider, "currentTimeProvider");
        this.a = adInternal;
        this.b = currentTimeProvider;
        this.c = currentTimeProvider.a();
        String uuid = adInternal.e().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "adInternal.adId.toString()");
        this.d = new LevelPlayAdInfo(uuid, adInternal.h(), adInternal.d().toString(), null, null, null, null, 120, null);
    }

    @Override // com.ironsource.InterfaceC4838q6
    public void a(@NotNull Activity activity, @Nullable String str) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        String uuid = this.a.e().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "adInternal.adId.toString()");
        this.a.a(new LevelPlayAdError(uuid, this.a.h(), LevelPlayAdError.ERROR_CODE_SHOW_BEFORE_LOAD_SUCCESS_CALLBACK, "Show is called while loading ad"), this.d);
    }

    @Override // com.ironsource.InterfaceC4838q6
    @NotNull
    public LevelPlayAdInfo b() {
        return this.d;
    }

    @Override // com.ironsource.InterfaceC4838q6
    @NotNull
    public InterfaceC4724k0 c() {
        return new InterfaceC4724k0.a("Ad is loading");
    }

    @Override // com.ironsource.InterfaceC4838q6
    public void loadAd() {
        String uuid = this.a.e().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "adInternal.adId.toString()");
        this.a.a(new LevelPlayAdError(uuid, this.a.h(), LevelPlayAdError.ERROR_CODE_LOAD_FAILED_ALREADY_CALLED, "Load is already called"), this.b.a() - this.c);
    }

    @Override // com.ironsource.InterfaceC4838q6
    public void onAdClicked() {
        this.a.b("onAdClicked on loading state");
    }

    @Override // com.ironsource.InterfaceC4838q6
    public void onAdClosed() {
        this.a.b("onAdClosed on loading state");
    }

    @Override // com.ironsource.InterfaceC4838q6
    public void onAdDisplayed(@NotNull LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.a.b("onAdDisplayed on loading state");
    }

    @Override // com.ironsource.InterfaceC4838q6
    public void onAdInfoChanged(@NotNull LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.a.b("onAdInfoChanged on loading state");
    }

    @Override // com.ironsource.InterfaceC4838q6
    public void onAdLoadFailed(@NotNull LevelPlayAdError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.a.a(error, this.b.a() - this.c);
        this.a.a(C4677h6.a.LoadFailed);
    }

    @Override // com.ironsource.InterfaceC4838q6
    public void onAdLoaded(@NotNull LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        Ya ya = this.a;
        ya.a(new C4766m6(ya, adInfo, this.b));
        this.a.a(adInfo);
    }

    @Override // com.ironsource.InterfaceC4838q6
    public void a() {
        this.a.b("onAdExpired on loading state");
    }

    @Override // com.ironsource.InterfaceC4838q6
    public void a(@NotNull LevelPlayAdError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.a.b("onAdDisplayFailed on loading state with error: " + error.getErrorMessage());
    }
}
