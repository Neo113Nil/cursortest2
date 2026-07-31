package com.ironsource;

import com.unity3d.mediation.LevelPlayAdInfo;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.ironsource.u0, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C4903u0 {

    @NotNull
    private final AbstractC4832q0 a;

    @Nullable
    private final LevelPlayAdInfo b;

    public C4903u0(@NotNull AbstractC4832q0 adUnit, @Nullable LevelPlayAdInfo levelPlayAdInfo) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        this.a = adUnit;
        this.b = levelPlayAdInfo;
    }

    @NotNull
    public final AbstractC4832q0 a() {
        return this.a;
    }

    @Nullable
    public final LevelPlayAdInfo b() {
        return this.b;
    }

    @Nullable
    public final LevelPlayAdInfo c() {
        return this.b;
    }

    @NotNull
    public final AbstractC4832q0 d() {
        return this.a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4903u0)) {
            return false;
        }
        C4903u0 c4903u0 = (C4903u0) obj;
        return Intrinsics.areEqual(this.a, c4903u0.a) && Intrinsics.areEqual(this.b, c4903u0.b);
    }

    public int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        LevelPlayAdInfo levelPlayAdInfo = this.b;
        return hashCode + (levelPlayAdInfo == null ? 0 : levelPlayAdInfo.hashCode());
    }

    @NotNull
    public String toString() {
        return "AdUnitCallback(adUnit=" + this.a + ", adInfo=" + this.b + ")";
    }

    public /* synthetic */ C4903u0(AbstractC4832q0 abstractC4832q0, LevelPlayAdInfo levelPlayAdInfo, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(abstractC4832q0, (i & 2) != 0 ? null : levelPlayAdInfo);
    }

    @NotNull
    public final C4903u0 a(@NotNull AbstractC4832q0 adUnit, @Nullable LevelPlayAdInfo levelPlayAdInfo) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        return new C4903u0(adUnit, levelPlayAdInfo);
    }

    public static /* synthetic */ C4903u0 a(C4903u0 c4903u0, AbstractC4832q0 abstractC4832q0, LevelPlayAdInfo levelPlayAdInfo, int i, Object obj) {
        if ((i & 1) != 0) {
            abstractC4832q0 = c4903u0.a;
        }
        if ((i & 2) != 0) {
            levelPlayAdInfo = c4903u0.b;
        }
        return c4903u0.a(abstractC4832q0, levelPlayAdInfo);
    }
}
