package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.j, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C5061j {
    public static final int d = 8;

    @Nullable
    public final Integer a;

    @Nullable
    public final String b;

    @Nullable
    public final C5062k c;

    public C5061j(@Nullable Integer num, @Nullable String str, @Nullable C5062k c5062k) {
        this.a = num;
        this.b = str;
        this.c = c5062k;
    }

    @Nullable
    public final Integer a() {
        return this.a;
    }

    @Nullable
    public final String b() {
        return this.b;
    }

    @Nullable
    public final C5062k c() {
        return this.c;
    }

    @Nullable
    public final String d() {
        return this.b;
    }

    @Nullable
    public final C5062k e() {
        return this.c;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5061j)) {
            return false;
        }
        C5061j c5061j = (C5061j) obj;
        return Intrinsics.areEqual(this.a, c5061j.a) && Intrinsics.areEqual(this.b, c5061j.b) && Intrinsics.areEqual(this.c, c5061j.c);
    }

    @Nullable
    public final Integer f() {
        return this.a;
    }

    public int hashCode() {
        Integer num = this.a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        C5062k c5062k = this.c;
        return hashCode2 + (c5062k != null ? c5062k.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "DECAppIcon(size=" + this.a + ", appIconUri=" + this.b + ", border=" + this.c + ')';
    }

    @NotNull
    public final C5061j a(@Nullable Integer num, @Nullable String str, @Nullable C5062k c5062k) {
        return new C5061j(num, str, c5062k);
    }

    public static /* synthetic */ C5061j a(C5061j c5061j, Integer num, String str, C5062k c5062k, int i, Object obj) {
        if ((i & 1) != 0) {
            num = c5061j.a;
        }
        if ((i & 2) != 0) {
            str = c5061j.b;
        }
        if ((i & 4) != 0) {
            c5062k = c5061j.c;
        }
        return c5061j.a(num, str, c5062k);
    }
}
