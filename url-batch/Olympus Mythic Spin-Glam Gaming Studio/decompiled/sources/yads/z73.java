package yads;

import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class z73 {
    public final WeakReference a;
    public final s83 b;
    public final cc3 c;

    public z73(WeakReference weakReference, s83 s83Var, cc3 cc3Var) {
        this.a = weakReference;
        this.b = s83Var;
        this.c = cc3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z73)) {
            return false;
        }
        z73 z73Var = (z73) obj;
        return Intrinsics.areEqual(this.a, z73Var.a) && Intrinsics.areEqual(this.b, z73Var.b) && Intrinsics.areEqual(this.c, z73Var.c);
    }

    public final int hashCode() {
        return this.c.a.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "TrackNoticeObject(manager=" + this.a + ", notice=" + this.b + ", validationResult=" + this.c + ")";
    }
}
