package yads;

/* loaded from: classes5.dex */
public final class z70 {
    public final boolean a;

    public z70(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z70) && this.a == ((z70) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return "DebugPanelErrorIndicatorData(isEnabled=" + this.a + ")";
    }
}
