package s1;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import o1.D;
import o1.E;

/* loaded from: classes.dex */
public class t {

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f3720b = AtomicIntegerFieldUpdater.newUpdater(t.class, "_size");
    private volatile int _size;

    /* renamed from: a, reason: collision with root package name */
    public D[] f3721a;

    public final void a(D d) {
        d.b((E) this);
        D[] dArr = this.f3721a;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f3720b;
        if (dArr == null) {
            dArr = new D[4];
            this.f3721a = dArr;
        } else if (atomicIntegerFieldUpdater.get(this) >= dArr.length) {
            Object[] copyOf = Arrays.copyOf(dArr, atomicIntegerFieldUpdater.get(this) * 2);
            g1.f.d(copyOf, "copyOf(this, newSize)");
            dArr = (D[]) copyOf;
            this.f3721a = dArr;
        }
        int i = atomicIntegerFieldUpdater.get(this);
        atomicIntegerFieldUpdater.set(this, i + 1);
        dArr[i] = d;
        d.f3279b = i;
        c(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0060, code lost:
    
        if (r6.compareTo(r7) < 0) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final D b(int i) {
        Object[] objArr = this.f3721a;
        g1.f.b(objArr);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f3720b;
        atomicIntegerFieldUpdater.set(this, atomicIntegerFieldUpdater.get(this) - 1);
        if (i < atomicIntegerFieldUpdater.get(this)) {
            d(i, atomicIntegerFieldUpdater.get(this));
            int i2 = (i - 1) / 2;
            if (i > 0) {
                D d = objArr[i];
                g1.f.b(d);
                Object obj = objArr[i2];
                g1.f.b(obj);
                if (d.compareTo(obj) < 0) {
                    d(i, i2);
                    c(i2);
                }
            }
            while (true) {
                int i3 = i * 2;
                int i4 = i3 + 1;
                if (i4 >= atomicIntegerFieldUpdater.get(this)) {
                    break;
                }
                Object[] objArr2 = this.f3721a;
                g1.f.b(objArr2);
                int i5 = i3 + 2;
                if (i5 < atomicIntegerFieldUpdater.get(this)) {
                    Comparable comparable = objArr2[i5];
                    g1.f.b(comparable);
                    Object obj2 = objArr2[i4];
                    g1.f.b(obj2);
                }
                i5 = i4;
                Comparable comparable2 = objArr2[i];
                g1.f.b(comparable2);
                Comparable comparable3 = objArr2[i5];
                g1.f.b(comparable3);
                if (comparable2.compareTo(comparable3) <= 0) {
                    break;
                }
                d(i, i5);
                i = i5;
            }
        }
        D d2 = objArr[atomicIntegerFieldUpdater.get(this)];
        g1.f.b(d2);
        d2.b(null);
        d2.f3279b = -1;
        objArr[atomicIntegerFieldUpdater.get(this)] = null;
        return d2;
    }

    public final void c(int i) {
        while (i > 0) {
            D[] dArr = this.f3721a;
            g1.f.b(dArr);
            int i2 = (i - 1) / 2;
            D d = dArr[i2];
            g1.f.b(d);
            D d2 = dArr[i];
            g1.f.b(d2);
            if (d.compareTo(d2) <= 0) {
                return;
            }
            d(i, i2);
            i = i2;
        }
    }

    public final void d(int i, int i2) {
        D[] dArr = this.f3721a;
        g1.f.b(dArr);
        D d = dArr[i2];
        g1.f.b(d);
        D d2 = dArr[i];
        g1.f.b(d2);
        dArr[i] = d;
        dArr[i2] = d2;
        d.f3279b = i;
        d2.f3279b = i2;
    }
}
