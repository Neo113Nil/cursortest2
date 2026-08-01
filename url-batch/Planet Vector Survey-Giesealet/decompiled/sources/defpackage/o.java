package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public class o implements Iterator, j00 {
    public final /* synthetic */ int d;
    public int e;
    public final Object f;

    public o(Object[] objArr) {
        this.d = 1;
        objArr.getClass();
        this.f = objArr;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.d;
        Object obj = this.f;
        switch (i) {
            case 0:
                if (this.e < ((r) obj).a()) {
                    break;
                }
                break;
            case 1:
                if (this.e < ((Object[]) obj).length) {
                    break;
                }
                break;
            default:
                if (this.e < ((ps0) obj).e()) {
                    break;
                }
                break;
        }
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.d;
        Object obj = this.f;
        switch (i) {
            case 0:
                if (!hasNext()) {
                    g8.k();
                    return null;
                }
                int i2 = this.e;
                this.e = i2 + 1;
                return ((r) obj).get(i2);
            case 1:
                try {
                    int i3 = this.e;
                    this.e = i3 + 1;
                    return ((Object[]) obj)[i3];
                } catch (ArrayIndexOutOfBoundsException e) {
                    this.e--;
                    g8.e(e.getMessage());
                    return null;
                }
            default:
                int i4 = this.e;
                this.e = i4 + 1;
                return ((ps0) obj).f(i4);
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.d) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public /* synthetic */ o(int i, Object obj) {
        this.d = i;
        this.f = obj;
    }
}
