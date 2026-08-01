package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class ez extends cz {
    public static final ez g = new ez(1, 0, 1);

    @Override // defpackage.cz
    public final boolean equals(Object obj) {
        if (!(obj instanceof ez)) {
            return false;
        }
        if (isEmpty() && ((ez) obj).isEmpty()) {
            return true;
        }
        ez ezVar = (ez) obj;
        return this.d == ezVar.d && this.e == ezVar.e;
    }

    @Override // defpackage.cz
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.d * 31) + this.e;
    }

    @Override // defpackage.cz
    public final boolean isEmpty() {
        return this.d > this.e;
    }

    @Override // defpackage.cz
    public final String toString() {
        return this.d + ".." + this.e;
    }
}
