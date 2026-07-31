package com.moloco.sdk.internal.services.bidtoken.providers;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
/* loaded from: classes6.dex */
public final class h {
    public static final int d = 0;

    @Nullable
    public final Integer a;

    @Nullable
    public final Integer b;

    @Nullable
    public final Boolean c;

    public h() {
        this(null, null, null, 7, null);
    }

    @Nullable
    public final Integer a() {
        return this.a;
    }

    @Nullable
    public final Integer b() {
        return this.b;
    }

    @Nullable
    public final Boolean c() {
        return this.c;
    }

    @Nullable
    public final Integer d() {
        return this.b;
    }

    @Nullable
    public final Integer e() {
        return this.a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return Intrinsics.areEqual(this.a, hVar.a) && Intrinsics.areEqual(this.b, hVar.b) && Intrinsics.areEqual(this.c, hVar.c);
    }

    @Nullable
    public final Boolean f() {
        return this.c;
    }

    public int hashCode() {
        Integer num = this.a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.b;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool = this.c;
        return hashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "BatteryInfoSignal(maxBatteryLevel=" + this.a + ", batteryStatus=" + this.b + ", isPowerSaveMode=" + this.c + ')';
    }

    public h(@Nullable Integer num, @Nullable Integer num2, @Nullable Boolean bool) {
        this.a = num;
        this.b = num2;
        this.c = bool;
    }

    @NotNull
    public final h a(@Nullable Integer num, @Nullable Integer num2, @Nullable Boolean bool) {
        return new h(num, num2, bool);
    }

    public static /* synthetic */ h a(h hVar, Integer num, Integer num2, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            num = hVar.a;
        }
        if ((i & 2) != 0) {
            num2 = hVar.b;
        }
        if ((i & 4) != 0) {
            bool = hVar.c;
        }
        return hVar.a(num, num2, bool);
    }

    public /* synthetic */ h(Integer num, Integer num2, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2, (i & 4) != 0 ? null : bool);
    }
}
