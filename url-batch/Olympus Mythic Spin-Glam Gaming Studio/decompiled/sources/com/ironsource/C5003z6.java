package com.ironsource;

import android.app.Activity;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdInfo;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.ironsource.z6, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C5003z6 implements C6 {

    @NotNull
    private final C4967x6 a;

    @NotNull
    private final C4855r6 b;

    @Nullable
    private C4855r6 c;
    private boolean d;

    public C5003z6(@NotNull C4967x6 strategy, @NotNull C4855r6 currentAdUnit, @Nullable C4855r6 c4855r6, boolean z) {
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        Intrinsics.checkNotNullParameter(currentAdUnit, "currentAdUnit");
        this.a = strategy;
        this.b = currentAdUnit;
        this.c = c4855r6;
        this.d = z;
    }

    @Override // com.ironsource.C6
    public void a(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.a.a(new B6(this.a, this.b, this.c));
        this.b.a(activity, this.a);
    }

    @Override // com.ironsource.C6
    public void b(@NotNull C4855r6 adUnit, @NotNull LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        if (Intrinsics.areEqual(this.b, adUnit)) {
            this.a.a("load success after current ad is loaded");
        }
    }

    @Override // com.ironsource.C6
    public void c(@NotNull C4855r6 adUnit, @NotNull LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        if (Intrinsics.areEqual(adUnit, this.b)) {
            this.a.d().onAdInfoChanged(adInfo);
        }
    }

    @Override // com.ironsource.C6
    public void loadAd() {
        Unit unit;
        if (this.d) {
            this.a.a("load called while current ad is loaded");
            return;
        }
        this.d = true;
        LevelPlayAdInfo e = this.b.e();
        if (e != null) {
            this.a.d().b(e);
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            this.a.a("current ad is loaded without ad info");
        } else if (this.c == null) {
            C4855r6 a = this.a.b().a(false, this.a.c());
            this.c = a;
            a.a(this.a);
        }
    }

    @Override // com.ironsource.C6
    public void b(@NotNull C4855r6 adUnit, @Nullable IronSourceError ironSourceError) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        if (Intrinsics.areEqual(adUnit, this.c)) {
            this.c = null;
        } else {
            this.a.a("load failed after current ad is loaded");
        }
    }

    @Override // com.ironsource.C6
    public void a(@NotNull C4855r6 adUnit, @NotNull LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        if (Intrinsics.areEqual(adUnit, this.b)) {
            this.a.a("show success when loaded");
        } else {
            this.a.a("progressive show success while current ad is loaded");
        }
    }

    public /* synthetic */ C5003z6(C4967x6 c4967x6, C4855r6 c4855r6, C4855r6 c4855r62, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(c4967x6, c4855r6, c4855r62, (i & 8) != 0 ? false : z);
    }

    @Override // com.ironsource.C6
    public void a(@NotNull C4855r6 adUnit, @Nullable IronSourceError ironSourceError) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        if (Intrinsics.areEqual(adUnit, this.b)) {
            this.a.a("show failed when loaded");
        } else {
            this.a.a("progressive show failed while current ad is loaded");
        }
    }

    @Override // com.ironsource.C6
    public void a(@NotNull C4855r6 adUnit) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        if (Intrinsics.areEqual(adUnit, this.c)) {
            this.c = null;
        } else if (Intrinsics.areEqual(adUnit, this.b)) {
            a();
        }
    }

    private final void a() {
        C6 a6;
        C4855r6 c4855r6 = this.c;
        if (c4855r6 == null) {
            C4967x6 c4967x6 = this.a;
            c4967x6.a(new C4985y6(c4967x6));
        } else {
            if (c4855r6.e() != null) {
                C4967x6 c4967x62 = this.a;
                C4855r6 c4855r62 = this.c;
                Intrinsics.checkNotNull(c4855r62);
                a6 = new C5003z6(c4967x62, c4855r62, null, false, 8, null);
            } else {
                C4967x6 c4967x63 = this.a;
                C4855r6 c4855r63 = this.c;
                Intrinsics.checkNotNull(c4855r63);
                a6 = new A6(c4967x63, c4855r63, false);
            }
            this.a.a(a6);
        }
        this.a.d().a();
    }
}
