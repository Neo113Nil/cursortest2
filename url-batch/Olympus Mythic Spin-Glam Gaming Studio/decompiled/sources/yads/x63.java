package yads;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class x63 {
    public final yj2 a;
    public final s2 b;
    public final yc0 c;
    public final uv d;
    public final gw e;

    public x63(yj2 yj2Var, s2 s2Var, yc0 yc0Var, uv uvVar, gw gwVar) {
        this.a = yj2Var;
        this.b = s2Var;
        this.c = yc0Var;
        this.d = uvVar;
        this.e = gwVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x63)) {
            return false;
        }
        x63 x63Var = (x63) obj;
        return Intrinsics.areEqual(this.a, x63Var.a) && Intrinsics.areEqual(this.b, x63Var.b) && Intrinsics.areEqual(this.c, x63Var.c) && Intrinsics.areEqual(this.d, x63Var.d) && Intrinsics.areEqual(this.e, x63Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "TimeProviderContainer(progressIncrementer=" + this.a + ", adBlockDurationProvider=" + this.b + ", defaultContentDelayProvider=" + this.c + ", closableAdChecker=" + this.d + ", closeTimerProgressIncrementer=" + this.e + ")";
    }

    public /* synthetic */ x63(yj2 yj2Var, s2 s2Var, yc0 yc0Var, uv uvVar) {
        this(yj2Var, s2Var, yc0Var, uvVar, new gw());
    }
}
