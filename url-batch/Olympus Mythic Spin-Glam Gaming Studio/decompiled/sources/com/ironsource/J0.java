package com.ironsource;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes12.dex */
public final class J0 {
    private final long a;

    public J0(long j) {
        this.a = j;
    }

    public final long a() {
        return this.a;
    }

    public final long b() {
        return this.a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof J0) && this.a == ((J0) obj).a;
    }

    public int hashCode() {
        return Long.hashCode(this.a);
    }

    @NotNull
    public String toString() {
        return "AdUnitInteractionData(impressionTimeout=" + this.a + ")";
    }

    @NotNull
    public final J0 a(long j) {
        return new J0(j);
    }

    public static /* synthetic */ J0 a(J0 j0, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = j0.a;
        }
        return j0.a(j);
    }
}
