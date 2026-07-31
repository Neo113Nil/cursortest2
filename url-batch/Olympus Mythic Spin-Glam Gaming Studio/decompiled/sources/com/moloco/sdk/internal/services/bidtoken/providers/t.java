package com.moloco.sdk.internal.services.bidtoken.providers;

import androidx.compose.runtime.internal.StabilityInferred;
import com.moloco.sdk.internal.services.A;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
/* loaded from: classes6.dex */
public final class t {
    public static final int e = 0;

    @Nullable
    public final Integer a;

    @Nullable
    public final Integer b;

    @Nullable
    public final Boolean c;

    @Nullable
    public final A d;

    public t() {
        this(null, null, null, null, 15, null);
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
    public final A d() {
        return this.d;
    }

    @Nullable
    public final Integer e() {
        return this.a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return Intrinsics.areEqual(this.a, tVar.a) && Intrinsics.areEqual(this.b, tVar.b) && Intrinsics.areEqual(this.c, tVar.c) && Intrinsics.areEqual(this.d, tVar.d);
    }

    @Nullable
    public final Integer f() {
        return this.b;
    }

    @Nullable
    public final Boolean g() {
        return this.c;
    }

    @Nullable
    public final A h() {
        return this.d;
    }

    public int hashCode() {
        Integer num = this.a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.b;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool = this.c;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        A a = this.d;
        return hashCode3 + (a != null ? a.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "NetworkInfoSignal(mobileCountryCode=" + this.a + ", mobileNetworkCode=" + this.b + ", networkRestricted=" + this.c + ", networkType=" + this.d + ')';
    }

    public t(@Nullable Integer num, @Nullable Integer num2, @Nullable Boolean bool, @Nullable A a) {
        this.a = num;
        this.b = num2;
        this.c = bool;
        this.d = a;
    }

    @NotNull
    public final t a(@Nullable Integer num, @Nullable Integer num2, @Nullable Boolean bool, @Nullable A a) {
        return new t(num, num2, bool, a);
    }

    public static /* synthetic */ t a(t tVar, Integer num, Integer num2, Boolean bool, A a, int i, Object obj) {
        if ((i & 1) != 0) {
            num = tVar.a;
        }
        if ((i & 2) != 0) {
            num2 = tVar.b;
        }
        if ((i & 4) != 0) {
            bool = tVar.c;
        }
        if ((i & 8) != 0) {
            a = tVar.d;
        }
        return tVar.a(num, num2, bool, a);
    }

    public /* synthetic */ t(Integer num, Integer num2, Boolean bool, A a, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2, (i & 4) != 0 ? null : bool, (i & 8) != 0 ? null : a);
    }
}
