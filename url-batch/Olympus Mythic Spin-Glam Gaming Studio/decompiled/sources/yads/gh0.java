package yads;

/* loaded from: classes4.dex */
public final class gh0 {
    public static final gh0 g = new gh0(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;

    public gh0(float f, float f2, float f3, float f4, float f5, float f6) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = f5;
        this.f = f6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gh0)) {
            return false;
        }
        gh0 gh0Var = (gh0) obj;
        return Float.compare(this.a, gh0Var.a) == 0 && Float.compare(this.b, gh0Var.b) == 0 && Float.compare(this.c, gh0Var.c) == 0 && Float.compare(this.d, gh0Var.d) == 0 && Float.compare(this.e, gh0Var.e) == 0 && Float.compare(this.f, gh0Var.f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f) + ((Float.hashCode(this.e) + ((Float.hashCode(this.d) + ((Float.hashCode(this.c) + ((Float.hashCode(this.b) + (Float.hashCode(this.a) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "DisplayInsetsF(left=" + this.a + ", top=" + this.b + ", right=" + this.c + ", bottom=" + this.d + ", cutoutTop=" + this.e + ", cutoutBottom=" + this.f + ")";
    }
}
