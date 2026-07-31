package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid;

import androidx.compose.runtime.internal.StabilityInferred;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C5060i;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
/* loaded from: classes13.dex */
public final class c {
    public static final int b = 8;

    @Nullable
    public final C5060i a;

    /* JADX WARN: Multi-variable type inference failed */
    public c() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Nullable
    public final C5060i a() {
        return this.a;
    }

    @Nullable
    public final C5060i b() {
        return this.a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && Intrinsics.areEqual(this.a, ((c) obj).a);
    }

    public int hashCode() {
        C5060i c5060i = this.a;
        if (c5060i == null) {
            return 0;
        }
        return c5060i.hashCode();
    }

    @NotNull
    public String toString() {
        return "MraidAdData(dec=" + this.a + ')';
    }

    public c(@Nullable C5060i c5060i) {
        this.a = c5060i;
    }

    @NotNull
    public final c a(@Nullable C5060i c5060i) {
        return new c(c5060i);
    }

    public static /* synthetic */ c a(c cVar, C5060i c5060i, int i, Object obj) {
        if ((i & 1) != 0) {
            c5060i = cVar.a;
        }
        return cVar.a(c5060i);
    }

    public /* synthetic */ c(C5060i c5060i, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : c5060i);
    }
}
