package com.moloco.sdk.internal.services.init;

import androidx.compose.runtime.internal.StabilityInferred;
import com.moloco.sdk.Init;
import com.moloco.sdk.internal.x;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
/* loaded from: classes13.dex */
public final class c {
    public static final int c = 0;

    @NotNull
    public final x<Init.SDKInitResponse, j> a;

    @NotNull
    public final String b;

    public c(@NotNull x<Init.SDKInitResponse, j> sdkInitResult, @NotNull String fetchType) {
        Intrinsics.checkNotNullParameter(sdkInitResult, "sdkInitResult");
        Intrinsics.checkNotNullParameter(fetchType, "fetchType");
        this.a = sdkInitResult;
        this.b = fetchType;
    }

    @NotNull
    public final x<Init.SDKInitResponse, j> a() {
        return this.a;
    }

    @NotNull
    public final String b() {
        return this.b;
    }

    @NotNull
    public final String c() {
        return this.b;
    }

    @NotNull
    public final x<Init.SDKInitResponse, j> d() {
        return this.a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.areEqual(this.a, cVar.a) && Intrinsics.areEqual(this.b, cVar.b);
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    @NotNull
    public String toString() {
        return "FetchState(sdkInitResult=" + this.a + ", fetchType=" + this.b + ')';
    }

    @NotNull
    public final c a(@NotNull x<Init.SDKInitResponse, j> sdkInitResult, @NotNull String fetchType) {
        Intrinsics.checkNotNullParameter(sdkInitResult, "sdkInitResult");
        Intrinsics.checkNotNullParameter(fetchType, "fetchType");
        return new c(sdkInitResult, fetchType);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ c a(c cVar, x xVar, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            xVar = cVar.a;
        }
        if ((i & 2) != 0) {
            str = cVar.b;
        }
        return cVar.a(xVar, str);
    }
}
