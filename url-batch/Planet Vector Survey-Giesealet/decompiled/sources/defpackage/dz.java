package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class dz extends xy {
    public final int d;
    public final int e;
    public boolean f;
    public int g;

    public dz(int i, int i2, int i3) {
        this.d = i3;
        this.e = i2;
        boolean z = false;
        if (i3 <= 0 ? i >= i2 : i <= i2) {
            z = true;
        }
        this.f = z;
        this.g = z ? i : i2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f;
    }

    @Override // defpackage.xy
    public final int nextInt() {
        int i = this.g;
        if (i != this.e) {
            this.g = this.d + i;
            return i;
        }
        if (this.f) {
            this.f = false;
            return i;
        }
        g8.k();
        return 0;
    }
}
