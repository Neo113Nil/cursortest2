package yads;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class z3 extends hm3 {
    public static final /* synthetic */ int d = 0;
    public final f4 c;

    public z3(f4 f4Var) {
        super((u82) null);
        this.c = f4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(z3.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.monetization.ads.base.AdFetchError");
        return this.c == ((z3) obj).c;
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public z3(f4 f4Var, u82 u82Var) {
        super(u82Var);
        this.c = f4Var;
    }
}
