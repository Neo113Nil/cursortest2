package yads;

/* loaded from: classes14.dex */
public final class on2 {
    public static final on2 b = new on2(false);
    public final boolean a;

    public on2(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && on2.class == obj.getClass() && this.a == ((on2) obj).a;
    }

    public final int hashCode() {
        return !this.a ? 1 : 0;
    }
}
