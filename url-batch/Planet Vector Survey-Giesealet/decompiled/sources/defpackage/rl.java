package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class rl {
    public int a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rl) && this.a == ((rl) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return "DeltaCounter(count=" + this.a + ')';
    }
}
