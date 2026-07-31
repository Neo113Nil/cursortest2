package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.k, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C5062k {
    public static final int c = 8;

    @Nullable
    public final Integer a;

    @NotNull
    public final List<String> b;

    public C5062k(@Nullable Integer num, @NotNull List<String> gradient) {
        Intrinsics.checkNotNullParameter(gradient, "gradient");
        this.a = num;
        this.b = gradient;
    }

    @Nullable
    public final Integer a() {
        return this.a;
    }

    @NotNull
    public final List<String> b() {
        return this.b;
    }

    @Nullable
    public final Integer c() {
        return this.a;
    }

    @NotNull
    public final List<String> d() {
        return this.b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5062k)) {
            return false;
        }
        C5062k c5062k = (C5062k) obj;
        return Intrinsics.areEqual(this.a, c5062k.a) && Intrinsics.areEqual(this.b, c5062k.b);
    }

    public int hashCode() {
        Integer num = this.a;
        return ((num == null ? 0 : num.hashCode()) * 31) + this.b.hashCode();
    }

    @NotNull
    public String toString() {
        return "DECBorder(borderWidth=" + this.a + ", gradient=" + this.b + ')';
    }

    @NotNull
    public final C5062k a(@Nullable Integer num, @NotNull List<String> gradient) {
        Intrinsics.checkNotNullParameter(gradient, "gradient");
        return new C5062k(num, gradient);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C5062k a(C5062k c5062k, Integer num, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            num = c5062k.a;
        }
        if ((i & 2) != 0) {
            list = c5062k.b;
        }
        return c5062k.a(num, list);
    }

    public /* synthetic */ C5062k(Integer num, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(num, (i & 2) != 0 ? CollectionsKt.emptyList() : list);
    }
}
