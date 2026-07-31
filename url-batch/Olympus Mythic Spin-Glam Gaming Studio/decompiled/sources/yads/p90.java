package yads;

/* loaded from: classes3.dex */
public final class p90 implements t90 {
    public final boolean a;

    public p90(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p90) && this.a == ((p90) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return "OnDebugErrorIndicatorSwitch(isChecked=" + this.a + ")";
    }
}
