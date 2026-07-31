package com.ironsource;

import android.app.Activity;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes12.dex */
public final class E6 implements J6 {

    @NotNull
    private final D6 a;

    @Nullable
    private final C4855r6 b;
    private final boolean c;

    public E6(@NotNull D6 strategy, @Nullable C4855r6 c4855r6, boolean z) {
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        this.a = strategy;
        this.b = c4855r6;
        this.c = z;
    }

    @Override // com.ironsource.J6
    public void a(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.a.d().c(new IronSourceError(LevelPlayAdError.ERROR_CODE_SHOW_BEFORE_LOAD_SUCCESS_CALLBACK, this.c ? "Show called on expired ad" : "Show called before load success"));
    }

    @Override // com.ironsource.J6
    public void b(@NotNull LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.a.a(this.c ? "load with better ad on expired ad" : "load success with better ad before load success");
    }

    @Override // com.ironsource.J6
    public void c(@NotNull LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.a.a(this.c ? "load success on expired ad" : "load success before load called");
    }

    @Override // com.ironsource.J6
    public void loadAd() {
        C4855r6 a = this.a.b().a(true, this.a.c());
        D6 d6 = this.a;
        d6.a(new I6(d6, a));
        a.a(this.a);
    }

    @Override // com.ironsource.J6
    public void c(@Nullable IronSourceError ironSourceError) {
        this.a.a(this.c ? "show failed on expired ad" : "show failed before load called");
    }

    public /* synthetic */ E6(D6 d6, C4855r6 c4855r6, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(d6, c4855r6, (i & 4) != 0 ? false : z);
    }

    @Override // com.ironsource.J6
    public void a(@Nullable IronSourceError ironSourceError) {
        this.a.a(this.c ? "load failed on expired ad" : "load failed before load called");
    }

    @Override // com.ironsource.J6
    public void a() {
        this.a.a(this.c ? "ad expired on expired ad" : "ad expired before load called");
    }

    @Override // com.ironsource.J6
    public void a(@NotNull LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.a.a(this.c ? "show success on expired ad" : "show success before load called");
    }
}
