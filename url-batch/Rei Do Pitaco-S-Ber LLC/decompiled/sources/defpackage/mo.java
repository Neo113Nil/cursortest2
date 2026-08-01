package defpackage;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class mo extends ko {
    public static final mo i = new mo(1, 0, 1);

    @Override // defpackage.ko
    public final boolean equals(Object obj) {
        if (!(obj instanceof mo)) {
            return false;
        }
        if (isEmpty() && ((mo) obj).isEmpty()) {
            return true;
        }
        mo moVar = (mo) obj;
        return this.f == moVar.f && this.g == moVar.g;
    }

    @Override // defpackage.ko
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.f * 31) + this.g;
    }

    @Override // defpackage.ko
    public final boolean isEmpty() {
        return this.f > this.g;
    }

    @Override // defpackage.ko
    public final String toString() {
        return this.f + ".." + this.g;
    }
}
