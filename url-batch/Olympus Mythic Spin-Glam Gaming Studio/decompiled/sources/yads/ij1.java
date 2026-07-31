package yads;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class ij1 {
    public final al1 a;
    public final float b;
    public final boolean c;

    public ij1(al1 al1Var, float f, boolean z, int i) {
        al1Var = (i & 1) != 0 ? null : al1Var;
        z = (i & 4) != 0 ? false : z;
        this.a = al1Var;
        this.b = f;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ij1)) {
            return false;
        }
        ij1 ij1Var = (ij1) obj;
        return Intrinsics.areEqual(this.a, ij1Var.a) && Float.compare(this.b, ij1Var.b) == 0 && this.c == ij1Var.c;
    }

    public final int hashCode() {
        al1 al1Var = this.a;
        return Boolean.hashCode(this.c) + ((Float.hashCode(this.b) + ((al1Var == null ? 0 : al1Var.hashCode()) * 31)) * 31);
    }

    public final String toString() {
        return "Media(content=" + this.a + ", aspectRatio=" + this.b + ", hasVideo=" + this.c + ")";
    }
}
