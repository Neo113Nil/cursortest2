package yads;

/* loaded from: classes6.dex */
public final class hl1 {
    public final int a;
    public final int b;
    public final int c;

    public hl1(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hl1)) {
            return false;
        }
        hl1 hl1Var = (hl1) obj;
        return this.a == hl1Var.a && this.b == hl1Var.b && this.c == hl1Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + yd3.a(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        return "MediaFileInfo(width=" + this.a + ", height=" + this.b + ", bitrate=" + this.c + ")";
    }
}
