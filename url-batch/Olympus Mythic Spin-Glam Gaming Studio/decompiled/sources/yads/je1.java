package yads;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class je1 implements ig0 {
    public final t8 a;

    public je1(t8 t8Var) {
        this.a = t8Var;
    }

    @Override // yads.ig0
    public final boolean a(Context context) {
        mg0[] mg0VarArr = mg0.b;
        return Intrinsics.areEqual("lightBundle", this.a.k);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof je1) && Intrinsics.areEqual(this.a, ((je1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "LightBundleDesignConstraint(adResponse=" + this.a + ")";
    }
}
