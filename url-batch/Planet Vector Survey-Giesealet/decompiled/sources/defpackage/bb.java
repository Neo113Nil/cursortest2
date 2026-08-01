package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class bb extends s {
    public final /* synthetic */ int f = 1;
    public final Object g;

    public bb(Object[] objArr, int i, int i2) {
        super(i, i2);
        this.g = objArr;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        int i = this.f;
        Object obj = this.g;
        switch (i) {
            case 0:
                if (!hasNext()) {
                    g8.k();
                    break;
                } else {
                    int i2 = this.d;
                    this.d = i2 + 1;
                    break;
                }
            default:
                if (!hasNext()) {
                    g8.k();
                    break;
                } else {
                    this.d++;
                    break;
                }
        }
        return null;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        int i = this.f;
        Object obj = this.g;
        switch (i) {
            case 0:
                if (!hasPrevious()) {
                    g8.k();
                    break;
                } else {
                    int i2 = this.d - 1;
                    this.d = i2;
                    break;
                }
            default:
                if (!hasPrevious()) {
                    g8.k();
                    break;
                } else {
                    this.d--;
                    break;
                }
        }
        return null;
    }

    public bb(int i, Object obj) {
        super(i, 1);
        this.g = obj;
    }
}
