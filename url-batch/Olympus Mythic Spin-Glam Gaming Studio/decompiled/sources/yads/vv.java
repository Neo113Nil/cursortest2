package yads;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class vv implements j0 {
    public final String a;

    public vv(String str) {
        this.a = str;
    }

    @Override // yads.j0
    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vv) && Intrinsics.areEqual(this.a, ((vv) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "CloseAction(actionType=" + this.a + ")";
    }
}
