package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class jx0 extends s {
    public int f;
    public Object[] g;
    public boolean h;

    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v3 */
    public jx0(Object[] objArr, int i, int i2, int i3) {
        super(i, i2);
        this.f = i3;
        Object[] objArr2 = new Object[i3];
        this.g = objArr2;
        ?? r5 = i == i2 ? 1 : 0;
        this.h = r5;
        objArr2[0] = objArr;
        b(i - r5, 1);
    }

    public final Object a() {
        int i = this.d & 31;
        Object obj = this.g[this.f - 1];
        obj.getClass();
        return ((Object[]) obj)[i];
    }

    public final void b(int i, int i2) {
        int i3 = (this.f - i2) * 5;
        while (i2 < this.f) {
            Object[] objArr = this.g;
            Object obj = objArr[i2 - 1];
            obj.getClass();
            objArr[i2] = ((Object[]) obj)[od0.l(i, i3)];
            i3 -= 5;
            i2++;
        }
    }

    public final void c(int i) {
        int i2 = 0;
        while (od0.l(this.d, i2) == i) {
            i2 += 5;
        }
        if (i2 > 0) {
            b(this.d, ((this.f - 1) - (i2 / 5)) + 1);
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            g8.k();
            return null;
        }
        Object a = a();
        int i = this.d + 1;
        this.d = i;
        if (i == this.e) {
            this.h = true;
            return a;
        }
        c(0);
        return a;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            g8.k();
            return null;
        }
        this.d--;
        if (this.h) {
            this.h = false;
            return a();
        }
        c(31);
        return a();
    }
}
