package com.moloco.sdk.internal.services.bidtoken.providers;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
/* loaded from: classes6.dex */
public final class x {
    public static final int b = 0;

    @Nullable
    public final String a;

    public x(@Nullable String str) {
        this.a = str;
    }

    @Nullable
    public final String a() {
        return this.a;
    }

    @Nullable
    public final String b() {
        return this.a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x) && Intrinsics.areEqual(this.a, ((x) obj).a);
    }

    public int hashCode() {
        String str = this.a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    @NotNull
    public String toString() {
        return "TestConfigSignal(configJson=" + this.a + ')';
    }

    @NotNull
    public final x a(@Nullable String str) {
        return new x(str);
    }

    public static /* synthetic */ x a(x xVar, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = xVar.a;
        }
        return xVar.a(str);
    }
}
