package yads;

/* loaded from: classes4.dex */
public final class ky1 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public ky1(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ky1)) {
            return false;
        }
        ky1 ky1Var = (ky1) obj;
        return this.a == ky1Var.a && this.b == ky1Var.b && this.c == ky1Var.c && this.d == ky1Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + yd3.a(this.c, yd3.a(this.b, Integer.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        return "MuteControlResources(mutedResourceId=" + this.a + ", unmutedResourceId=" + this.b + ", mutedContentDescriptionId=" + this.c + ", unmutedContentDescriptionId=" + this.d + ")";
    }
}
