package com.ironsource.mediationsdk;

import com.ironsource.mediationsdk.q;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes6.dex */
final class b {

    @NotNull
    private final q.d a;
    private final boolean b;
    private final boolean c;
    private final boolean d;

    public b(@NotNull q.d sdkState, boolean z, boolean z2, boolean z3) {
        Intrinsics.checkNotNullParameter(sdkState, "sdkState");
        this.a = sdkState;
        this.b = z;
        this.c = z2;
        this.d = z3;
    }

    @NotNull
    public final q.d a() {
        return this.a;
    }

    public final boolean b() {
        return this.b;
    }

    public final boolean c() {
        return this.c;
    }

    public final boolean d() {
        return this.d;
    }

    @NotNull
    public final q.d e() {
        return this.a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.a == bVar.a && this.b == bVar.b && this.c == bVar.c && this.d == bVar.d;
    }

    public final boolean f() {
        return this.d;
    }

    public final boolean g() {
        return this.c;
    }

    public final boolean h() {
        return this.b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        boolean z = this.b;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode + i) * 31;
        boolean z2 = this.c;
        int i3 = z2;
        if (z2 != 0) {
            i3 = 1;
        }
        int i4 = (i2 + i3) * 31;
        boolean z3 = this.d;
        return i4 + (z3 ? 1 : z3 ? 1 : 0);
    }

    @NotNull
    public String toString() {
        return "AdUnitInitStateInfo(sdkState=" + this.a + ", isRetryForMoreThan15Secs=" + this.b + ", isDemandOnlyInitRequested=" + this.c + ", isAdUnitInitRequested=" + this.d + ")";
    }

    @NotNull
    public final b a(@NotNull q.d sdkState, boolean z, boolean z2, boolean z3) {
        Intrinsics.checkNotNullParameter(sdkState, "sdkState");
        return new b(sdkState, z, z2, z3);
    }

    public static /* synthetic */ b a(b bVar, q.d dVar, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            dVar = bVar.a;
        }
        if ((i & 2) != 0) {
            z = bVar.b;
        }
        if ((i & 4) != 0) {
            z2 = bVar.c;
        }
        if ((i & 8) != 0) {
            z3 = bVar.d;
        }
        return bVar.a(dVar, z, z2, z3);
    }
}
