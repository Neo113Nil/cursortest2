package yads;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class ui0 implements ig0 {
    public final t8 a;

    public ui0(t8 t8Var) {
        this.a = t8Var;
    }

    @Override // yads.ig0
    public final boolean a(Context context) {
        String str = this.a.k;
        mg0[] mg0VarArr = mg0.b;
        return Intrinsics.areEqual("divkit", str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ui0) && Intrinsics.areEqual(this.a, ((ui0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "DivKitDesignConstraint(adResponse=" + this.a + ")";
    }
}
