package com.moloco.sdk.internal.configs;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
/* loaded from: classes5.dex */
public final class a {
    public static final int c = 0;

    @NotNull
    public final String a;
    public final int b;

    public a(@NotNull String reportingUrl, int i) {
        Intrinsics.checkNotNullParameter(reportingUrl, "reportingUrl");
        this.a = reportingUrl;
        this.b = i;
    }

    @NotNull
    public final String a() {
        return this.a;
    }

    public final int b() {
        return this.b;
    }

    public final int c() {
        return this.b;
    }

    @NotNull
    public final String d() {
        return this.a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.areEqual(this.a, aVar.a) && this.b == aVar.b;
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + Integer.hashCode(this.b);
    }

    @NotNull
    public String toString() {
        return "OperationalMetricsConfig(reportingUrl=" + this.a + ", pollingIntervalSeconds=" + this.b + ')';
    }

    @NotNull
    public final a a(@NotNull String reportingUrl, int i) {
        Intrinsics.checkNotNullParameter(reportingUrl, "reportingUrl");
        return new a(reportingUrl, i);
    }

    public static /* synthetic */ a a(a aVar, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = aVar.a;
        }
        if ((i2 & 2) != 0) {
            i = aVar.b;
        }
        return aVar.a(str, i);
    }
}
