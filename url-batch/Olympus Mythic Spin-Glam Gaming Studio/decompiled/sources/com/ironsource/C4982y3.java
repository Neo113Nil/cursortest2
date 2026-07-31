package com.ironsource;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.ironsource.y3, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C4982y3 {

    @Nullable
    private final Boolean a;

    @Nullable
    private final String b;

    @Nullable
    private final Integer c;

    public C4982y3() {
        this(null, null, null, 7, null);
    }

    @Nullable
    public final Boolean a() {
        return this.a;
    }

    @Nullable
    public final String b() {
        return this.b;
    }

    @Nullable
    public final Integer c() {
        return this.c;
    }

    @Nullable
    public final Boolean d() {
        return this.a;
    }

    @Nullable
    public final Integer e() {
        return this.c;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4982y3)) {
            return false;
        }
        C4982y3 c4982y3 = (C4982y3) obj;
        return Intrinsics.areEqual(this.a, c4982y3.a) && Intrinsics.areEqual(this.b, c4982y3.b) && Intrinsics.areEqual(this.c, c4982y3.c);
    }

    @Nullable
    public final String f() {
        return this.b;
    }

    public int hashCode() {
        Boolean bool = this.a;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.c;
        return hashCode2 + (num != null ? num.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "CappingConfig2(enabled=" + this.a + ", unit=" + this.b + ", maxImpressions=" + this.c + ")";
    }

    public C4982y3(@Nullable Boolean bool, @Nullable String str, @Nullable Integer num) {
        this.a = bool;
        this.b = str;
        this.c = num;
    }

    @NotNull
    public final C4982y3 a(@Nullable Boolean bool, @Nullable String str, @Nullable Integer num) {
        return new C4982y3(bool, str, num);
    }

    public static /* synthetic */ C4982y3 a(C4982y3 c4982y3, Boolean bool, String str, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = c4982y3.a;
        }
        if ((i & 2) != 0) {
            str = c4982y3.b;
        }
        if ((i & 4) != 0) {
            num = c4982y3.c;
        }
        return c4982y3.a(bool, str, num);
    }

    public /* synthetic */ C4982y3(Boolean bool, String str, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : num);
    }
}
