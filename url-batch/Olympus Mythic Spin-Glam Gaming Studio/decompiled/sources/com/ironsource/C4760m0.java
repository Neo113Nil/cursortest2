package com.ironsource;

import android.content.Context;
import com.ironsource.F0;
import com.ironsource.Jf;
import com.ironsource.mediationsdk.ISBannerSize;
import com.ironsource.mediationsdk.IronSource;
import com.unity3d.mediation.LevelPlayAdSize;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.ironsource.m0, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C4760m0 extends C4936vb {

    @NotNull
    private final C5002z5 b;

    @NotNull
    private final Jf.b c;

    @NotNull
    private final I8 d;

    public C4760m0() {
        IronSource.a aVar = IronSource.a.BANNER;
        this.b = new C5002z5(aVar, F0.b.MEDIATION, null, null, 12, null);
        Jf.b b = Jf.b(aVar);
        Intrinsics.checkNotNullExpressionValue(b, "createLogFactory(IronSource.AD_UNIT.BANNER)");
        this.c = b;
        this.d = Kb.u.d().f();
    }

    public static /* synthetic */ String a(C4760m0 c4760m0, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        return c4760m0.a(str, str2);
    }

    private final Float d() {
        Va a = this.d.a();
        Float valueOf = a != null ? Float.valueOf(a.l()) : null;
        if (valueOf != null) {
            return valueOf;
        }
        this.b.h().f("MaxScreenSizePercentageForBannerHeight is null: Error getting sdk configurations");
        return null;
    }

    @Nullable
    public final Integer b(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Float d = d();
        if (d != null) {
            return Integer.valueOf(MathKt.roundToInt(d.floatValue() * Z4.a.a(context)));
        }
        return null;
    }

    @NotNull
    public final List<LevelPlayAdSize> c() {
        Va a = this.d.a();
        if (a != null) {
            return a.k();
        }
        throw new IllegalStateException("Error getting sdk configurations");
    }

    @NotNull
    public final String a(@Nullable String str, @Nullable String str2) {
        String a = this.c.a(str, str2);
        Intrinsics.checkNotNullExpressionValue(a, "logFactory.createLogMessage(message, suffix)");
        return a;
    }

    public final int a(int i) {
        return com.ironsource.mediationsdk.j.a(i);
    }

    private final ISBannerSize a(LevelPlayAdSize levelPlayAdSize) {
        LevelPlayAdSize fallbackAdSize$mediationsdk_release = levelPlayAdSize.getFallbackAdSize$mediationsdk_release();
        if (fallbackAdSize$mediationsdk_release == null) {
            fallbackAdSize$mediationsdk_release = LevelPlayAdSize.BANNER;
        }
        ISBannerSize b = b(fallbackAdSize$mediationsdk_release);
        b.setAdaptive(true);
        com.ironsource.mediationsdk.m.a.a(b, new U7(levelPlayAdSize.getWidth(), levelPlayAdSize.getHeight()));
        return b;
    }

    private final ISBannerSize c(LevelPlayAdSize levelPlayAdSize) {
        if (Intrinsics.areEqual(levelPlayAdSize, LevelPlayAdSize.LARGE)) {
            return new ISBannerSize(com.ironsource.mediationsdk.j.b, levelPlayAdSize.getWidth(), levelPlayAdSize.getHeight());
        }
        if (Intrinsics.areEqual(levelPlayAdSize, LevelPlayAdSize.MEDIUM_RECTANGLE)) {
            return new ISBannerSize(com.ironsource.mediationsdk.j.c, levelPlayAdSize.getWidth(), levelPlayAdSize.getHeight());
        }
        if (Intrinsics.areEqual(levelPlayAdSize, LevelPlayAdSize.LEADERBOARD)) {
            return new ISBannerSize(com.ironsource.mediationsdk.j.e, 0, 0);
        }
        if (Intrinsics.areEqual(levelPlayAdSize, LevelPlayAdSize.Companion.createCustomSize(levelPlayAdSize.getWidth(), levelPlayAdSize.getHeight()))) {
            return new ISBannerSize(levelPlayAdSize.getWidth(), levelPlayAdSize.getHeight());
        }
        return new ISBannerSize("BANNER", levelPlayAdSize.getWidth(), levelPlayAdSize.getHeight());
    }

    @NotNull
    public final ISBannerSize b(@NotNull LevelPlayAdSize size) {
        Intrinsics.checkNotNullParameter(size, "size");
        boolean isAdaptive = size.isAdaptive();
        if (isAdaptive) {
            return a(size);
        }
        if (isAdaptive) {
            throw new NoWhenBranchMatchedException();
        }
        return c(size);
    }
}
