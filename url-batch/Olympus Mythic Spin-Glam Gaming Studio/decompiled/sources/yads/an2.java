package yads;

/* loaded from: classes3.dex */
public final class an2 extends q41 {
    public static final Object[] i;
    public static final an2 j;
    public final transient Object[] d;
    public final transient int e;
    public final transient Object[] f;
    public final transient int g;
    public final transient int h;

    static {
        Object[] objArr = new Object[0];
        i = objArr;
        j = new an2(objArr, 0, objArr, 0, 0);
    }

    public an2(Object[] objArr, int i2, Object[] objArr2, int i3, int i4) {
        this.d = objArr;
        this.e = i2;
        this.f = objArr2;
        this.g = i3;
        this.h = i4;
    }

    @Override // yads.f41
    public final int a(int i2, Object[] objArr) {
        System.arraycopy(this.d, 0, objArr, i2, this.h);
        return i2 + this.h;
    }

    @Override // yads.f41
    public final Object[] b() {
        return this.d;
    }

    @Override // yads.f41
    public final int c() {
        return this.h;
    }

    @Override // yads.f41, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        Object[] objArr = this.f;
        if (obj == null || objArr.length == 0) {
            return false;
        }
        int a = rz0.a(obj.hashCode());
        while (true) {
            int i2 = a & this.g;
            Object obj2 = objArr[i2];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            a = i2 + 1;
        }
    }

    @Override // yads.f41
    public final int d() {
        return 0;
    }

    @Override // yads.f41
    public final boolean e() {
        return false;
    }

    @Override // yads.q41
    public final l41 f() {
        return l41.b(this.h, this.d);
    }

    @Override // yads.q41, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.e;
    }

    @Override // yads.f41, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final wa3 iterator() {
        return a().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.h;
    }
}
