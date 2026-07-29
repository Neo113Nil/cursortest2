package o;

/* loaded from: classes.dex */
public final class EW extends CW {
    public final RH k;

    public EW(RH rh) {
        this.k = rh;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.j;
        this.j = i + 2;
        Object[] objArr = this.h;
        return new ED(this.k, objArr[i], objArr[i + 1]);
    }
}
