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

/* renamed from: com.ironsource.p6, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C4820p6 implements InterfaceC4838q6 {

    @NotNull
    private final Ya a;

    @NotNull
    private final LevelPlayAdInfo b;

    public C4820p6(@NotNull Ya adInternal, @NotNull LevelPlayAdInfo adInfo) {
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
        this.a.a(new LevelPlayAdError(uuid, this.a.h(), LevelPlayAdError.ERROR_CODE_SHOW_WHILE_SHOW, "Ad is already shown"), this.b);
    }

    @Override // com.ironsource.InterfaceC4838q6
    @NotNull
    public LevelPlayAdInfo b() {
        return this.b;
    }

    @Override // com.ironsource.InterfaceC4838q6
    @NotNull
    public InterfaceC4724k0 c() {
        return new InterfaceC4724k0.a("ad is shown");
    }

    @Override // com.ironsource.InterfaceC4838q6
    public void loadAd() {
        String uuid = this.a.e().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "adInternal.adId.toString()");
        Ya.a(this.a, new LevelPlayAdError(uuid, this.a.h(), LevelPlayAdError.ERROR_CODE_LOAD_WHILE_SHOW, "Load is called while ad is shown"), 0L, 2, null);
    }

    @Override // com.ironsource.InterfaceC4838q6
    public void onAdClicked() {
        IronLog.INTERNAL.verbose(C4814p0.a(this.a.f(), "onAdClicked adInfo: " + this.b, (String) null, 2, (Object) null));
        this.a.f().d(new Runnable() { // from class: com.ironsource.p6$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                C4820p6.a(C4820p6.this);
            }
        });
    }

    @Override // com.ironsource.InterfaceC4838q6
    public void onAdClosed() {
        IronLog.INTERNAL.verbose(C4814p0.a(this.a.f(), "onAdClosed adInfo: " + this.b, (String) null, 2, (Object) null));
        this.a.f().c(new Runnable() { // from class: com.ironsource.p6$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                C4820p6.b(C4820p6.this);
            }
        });
        this.a.f().d(new Runnable() { // from class: com.ironsource.p6$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                C4820p6.c(C4820p6.this);
            }
        });
    }

    @Override // com.ironsource.InterfaceC4838q6
    public void onAdDisplayed(@NotNull LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.a.b("onAdDisplayed on shown state");
    }

    @Override // com.ironsource.InterfaceC4838q6
    public void onAdInfoChanged(@NotNull LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.a.b("onAdInfoChanged on shown state");
    }

    @Override // com.ironsource.InterfaceC4838q6
    public void onAdLoadFailed(@NotNull LevelPlayAdError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.a.b("onAdLoadFailed on shown state with error: " + error.getErrorMessage());
    }

    @Override // com.ironsource.InterfaceC4838q6
    public void onAdLoaded(@NotNull LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.a.b("onAdLoaded on shown state");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(C4820p6 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.a.a(C4677h6.a.Closed);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(C4820p6 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Za k = this$0.a.k();
        if (k != null) {
            k.onAdClosed(this$0.b);
        }
    }

    @Override // com.ironsource.InterfaceC4838q6
    public void a() {
        this.a.b("onAdExpired on shown state");
    }

    @Override // com.ironsource.InterfaceC4838q6
    public void a(@NotNull LevelPlayAdError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.a.b("onAdDisplayFailed on shown state with error: " + error.getErrorMessage());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C4820p6 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Za k = this$0.a.k();
        if (k != null) {
            k.onAdClicked(this$0.b);
        }
    }
}
