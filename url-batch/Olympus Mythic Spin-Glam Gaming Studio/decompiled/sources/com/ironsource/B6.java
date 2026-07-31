package com.ironsource;

import android.app.Activity;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdInfo;
import com.unity3d.mediation.rewarded.LevelPlayReward;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes13.dex */
public final class B6 implements C6, InterfaceC4909u6 {

    @NotNull
    private final C4967x6 a;

    @NotNull
    private final C4855r6 b;

    @Nullable
    private C4855r6 c;

    public B6(@NotNull C4967x6 strategy, @NotNull C4855r6 currentAdUnit, @Nullable C4855r6 c4855r6) {
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        Intrinsics.checkNotNullParameter(currentAdUnit, "currentAdUnit");
        this.a = strategy;
        this.b = currentAdUnit;
        this.c = c4855r6;
        currentAdUnit.a(this);
    }

    @Override // com.ironsource.C6
    public void a(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.a.a("show called while showing");
    }

    @Override // com.ironsource.C6
    public void b(@NotNull C4855r6 adUnit, @NotNull LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        if (adUnit == this.b) {
            this.a.a("load success while current ad is showing");
        }
    }

    @Override // com.ironsource.C6
    public void c(@NotNull C4855r6 adUnit, @NotNull LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        if (adUnit == this.b) {
            this.a.a("ad info changed while current ad is showing");
        }
    }

    @Override // com.ironsource.K0
    public void e() {
        this.a.c().e();
    }

    @Override // com.ironsource.C6
    public void loadAd() {
        this.a.a("load called while showing");
    }

    @Override // com.ironsource.InterfaceC4909u6
    public void onClosed() {
        this.a.a(a(this, null, 1, null));
        this.a.c().onClosed();
    }

    @Override // com.ironsource.C6
    public void a(@NotNull C4855r6 adUnit, @NotNull LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        if (Intrinsics.areEqual(adUnit, this.b)) {
            this.a.d().a(adInfo);
        } else {
            this.a.a("progressive show success while showing current ad");
        }
    }

    @Override // com.ironsource.C6
    public void b(@NotNull C4855r6 adUnit, @Nullable IronSourceError ironSourceError) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        if (adUnit == this.c) {
            this.c = null;
        } else {
            this.a.a("load failed while current ad is showing");
        }
    }

    @Override // com.ironsource.C6
    public void a(@NotNull C4855r6 adUnit, @Nullable IronSourceError ironSourceError) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        if (!Intrinsics.areEqual(adUnit, this.b)) {
            this.a.a("progressive show failed while showing current ad");
            return;
        }
        this.a.a(a(ironSourceError));
        this.a.d().c(ironSourceError);
    }

    @Override // com.ironsource.C6
    public void a(@NotNull C4855r6 adUnit) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        if (adUnit == this.c) {
            this.c = null;
        } else {
            this.a.a("ad expired while current ad is showing");
        }
    }

    @Override // com.ironsource.InterfaceC4909u6
    public void a(@NotNull LevelPlayReward reward) {
        Intrinsics.checkNotNullParameter(reward, "reward");
        this.a.c().a(reward);
    }

    static /* synthetic */ C6 a(B6 b6, IronSourceError ironSourceError, int i, Object obj) {
        if ((i & 1) != 0) {
            ironSourceError = null;
        }
        return b6.a(ironSourceError);
    }

    private final C6 a(IronSourceError ironSourceError) {
        if (C4541a5.a.a(ironSourceError)) {
            return new C5003z6(this.a, this.b, this.c, true);
        }
        C4855r6 c4855r6 = this.c;
        if (c4855r6 == null) {
            return new C4985y6(this.a);
        }
        if (c4855r6.e() != null) {
            return new C5003z6(this.a, c4855r6, null, false, 8, null);
        }
        return new A6(this.a, c4855r6, false);
    }
}
