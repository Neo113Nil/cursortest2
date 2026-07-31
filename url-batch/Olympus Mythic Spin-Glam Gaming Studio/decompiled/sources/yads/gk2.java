package yads;

/* loaded from: classes4.dex */
public final class gk2 {
    public final int a;
    public final boolean b;

    public gk2(boolean z, int i) {
        this.a = i;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || gk2.class != obj.getClass()) {
            return false;
        }
        gk2 gk2Var = (gk2) obj;
        return this.a == gk2Var.a && this.b == gk2Var.b;
    }

    public final int hashCode() {
        return (this.a * 31) + (this.b ? 1 : 0);
    }
}
