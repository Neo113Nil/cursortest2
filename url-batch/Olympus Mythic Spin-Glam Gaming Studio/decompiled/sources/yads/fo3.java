package yads;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes14.dex */
public final class fo3 implements ho3 {
    public final ww1 a;

    public fo3(ww1 ww1Var) {
        this.a = ww1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fo3) && Intrinsics.areEqual(this.a, ((fo3) obj).a);
    }

    public final int hashCode() {
        ww1 ww1Var = this.a;
        if (ww1Var == null) {
            return 0;
        }
        return ww1Var.hashCode();
    }

    public final String toString() {
        return "Loading(preloadingListener=" + this.a + ")";
    }
}
