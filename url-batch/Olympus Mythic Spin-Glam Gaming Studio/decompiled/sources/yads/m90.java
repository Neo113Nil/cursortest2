package yads;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class m90 implements t90 {
    public final String a;

    public m90(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m90) && Intrinsics.areEqual(this.a, ((m90) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OnAdUnitClick(id=" + this.a + ")";
    }
}
