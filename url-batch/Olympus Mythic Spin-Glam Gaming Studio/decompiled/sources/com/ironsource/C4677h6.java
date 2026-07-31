package com.ironsource;

import android.app.Activity;
import com.ironsource.InterfaceC4724k0;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.ironsource.h6, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4677h6 implements InterfaceC4838q6 {

    @NotNull
    private final Ya a;

    @NotNull
    private final a b;

    @NotNull
    private final LevelPlayAdInfo c;

    /* renamed from: com.ironsource.h6$a */
    public enum a {
        Created,
        Closed,
        Expired,
        ShowFailed,
        LoadFailed
    }

    public C4677h6(@NotNull Ya adInternal, @NotNull a status) {
        Intrinsics.checkNotNullParameter(adInternal, "adInternal");
        Intrinsics.checkNotNullParameter(status, "status");
        this.a = adInternal;
        this.b = status;
        String uuid = adInternal.e().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "adInternal.adId.toString()");
        this.c = new LevelPlayAdInfo(uuid, adInternal.h(), adInternal.d().toString(), null, null, null, null, 120, null);
    }

    private final boolean d() {
        if (this.a.h().length() == 0) {
            Ya ya = this.a;
            String uuid = this.a.e().toString();
            Intrinsics.checkNotNullExpressionValue(uuid, "adInternal.adId.toString()");
            Ya.a(ya, new LevelPlayAdError(uuid, this.a.h(), LevelPlayAdError.ERROR_CODE_NO_AD_UNIT_ID_SPECIFIED, "Ad unit ID should be specified"), 0L, 2, null);
            return false;
        }
        if (!this.a.f().a()) {
            Ya ya2 = this.a;
            String uuid2 = this.a.e().toString();
            Intrinsics.checkNotNullExpressionValue(uuid2, "adInternal.adId.toString()");
            Ya.a(ya2, new LevelPlayAdError(uuid2, this.a.h(), LevelPlayAdError.ERROR_CODE_LOAD_BEFORE_INIT_SUCCESS_CALLBACK, "Load must be called after init success callback"), 0L, 2, null);
            return false;
        }
        Va a2 = this.a.l().f().a();
        if (a2 != null && a2.a(this.a.h(), this.a.d())) {
            return true;
        }
        Ya ya3 = this.a;
        String uuid3 = this.a.e().toString();
        Intrinsics.checkNotNullExpressionValue(uuid3, "adInternal.adId.toString()");
        Ya.a(ya3, new LevelPlayAdError(uuid3, this.a.h(), LevelPlayAdError.ERROR_CODE_INVALID_AD_UNIT_ID, "Invalid ad unit id"), 0L, 2, null);
        return false;
    }

    @Override // com.ironsource.InterfaceC4838q6
    public void a(@NotNull Activity activity, @Nullable String str) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        String str2 = this.b == a.Expired ? "Show called on expired ad" : "Show called before load success";
        String uuid = this.a.e().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "adInternal.adId.toString()");
        this.a.a(new LevelPlayAdError(uuid, this.a.h(), LevelPlayAdError.ERROR_CODE_SHOW_BEFORE_LOAD_SUCCESS_CALLBACK, str2), this.c);
    }

    @Override // com.ironsource.InterfaceC4838q6
    @NotNull
    public LevelPlayAdInfo b() {
        return this.c;
    }

    @Override // com.ironsource.InterfaceC4838q6
    @NotNull
    public InterfaceC4724k0 c() {
        return new InterfaceC4724k0.a(this.b == a.Expired ? "ad is invalid due to loading time" : "load ad was not called");
    }

    @Override // com.ironsource.InterfaceC4838q6
    public void loadAd() {
        if (d()) {
            this.a.o();
        }
    }

    @Override // com.ironsource.InterfaceC4838q6
    public void onAdClicked() {
        this.a.b("onAdClicked on " + this.b + " state");
    }

    @Override // com.ironsource.InterfaceC4838q6
    public void onAdClosed() {
        this.a.b("onAdClosed on " + this.b + " state");
    }

    @Override // com.ironsource.InterfaceC4838q6
    public void onAdDisplayed(@NotNull LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.a.b("onAdDisplayed on " + this.b + " state");
    }

    @Override // com.ironsource.InterfaceC4838q6
    public void onAdInfoChanged(@NotNull LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.a.b("onAdInfoChanged on " + this.b + " state");
    }

    @Override // com.ironsource.InterfaceC4838q6
    public void onAdLoadFailed(@NotNull LevelPlayAdError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.a.b("onAdLoadFailed on " + this.b + " state with error: " + error.getErrorMessage());
    }

    @Override // com.ironsource.InterfaceC4838q6
    public void onAdLoaded(@NotNull LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.a.b("onAdLoaded on " + this.b + " state");
    }

    @Override // com.ironsource.InterfaceC4838q6
    public void a(@NotNull LevelPlayAdError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.a.b("onAdDisplayFailed on " + this.b + " state with error: " + error.getErrorMessage());
    }

    @Override // com.ironsource.InterfaceC4838q6
    public void a() {
        this.a.b("onAdExpired on " + this.b + " state");
    }

    public /* synthetic */ C4677h6(Ya ya, a aVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(ya, (i & 2) != 0 ? a.Created : aVar);
    }
}
