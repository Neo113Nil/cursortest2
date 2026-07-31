package com.ironsource;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes10.dex */
public final class Tc {
    private final boolean a;
    private final int b;

    /* JADX WARN: Multi-variable type inference failed */
    public Tc() {
        this(false, 0 == true ? 1 : 0, 3, null);
    }

    public final boolean a() {
        return this.a;
    }

    public final int b() {
        return this.b;
    }

    public final int c() {
        return this.b;
    }

    public final boolean d() {
        return this.a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Tc)) {
            return false;
        }
        Tc tc = (Tc) obj;
        return this.a == tc.a && this.b == tc.b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public int hashCode() {
        boolean z = this.a;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        return (r0 * 31) + Integer.hashCode(this.b);
    }

    @NotNull
    public String toString() {
        return "OpenUrlConfigurations(isImmersive=" + this.a + ", flags=" + this.b + ")";
    }

    public Tc(boolean z, int i) {
        this.a = z;
        this.b = i;
    }

    @NotNull
    public final Tc a(boolean z, int i) {
        return new Tc(z, i);
    }

    public static /* synthetic */ Tc a(Tc tc, boolean z, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = tc.a;
        }
        if ((i2 & 2) != 0) {
            i = tc.b;
        }
        return tc.a(z, i);
    }

    public /* synthetic */ Tc(boolean z, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? com.google.android.exoplayer2.C.ENCODING_PCM_32BIT : i);
    }
}
