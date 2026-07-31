package yads;

/* loaded from: classes4.dex */
public final class i10 {
    public final float a;
    public final boolean b;

    public i10(float f, boolean z) {
        this.a = f;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i10)) {
            return false;
        }
        i10 i10Var = (i10) obj;
        return Float.compare(this.a, i10Var.a) == 0 && this.b == i10Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "CoreNativeAdMedia(aspectRatio=" + this.a + ", hasVideo=" + this.b + ")";
    }
}
