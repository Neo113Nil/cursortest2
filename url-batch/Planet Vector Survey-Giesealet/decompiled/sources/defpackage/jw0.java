package defpackage;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public class jw0 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater b = AtomicIntegerFieldUpdater.newUpdater(jw0.class, "_size$volatile");
    private volatile /* synthetic */ int _size$volatile;
    public rq[] a;

    public final void a(rq rqVar) {
        rqVar.e((sq) this);
        rq[] rqVarArr = this.a;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = b;
        if (rqVarArr == null) {
            rqVarArr = new rq[4];
            this.a = rqVarArr;
        } else if (atomicIntegerFieldUpdater.get(this) >= rqVarArr.length) {
            rqVarArr = (rq[]) Arrays.copyOf(rqVarArr, atomicIntegerFieldUpdater.get(this) * 2);
            this.a = rqVarArr;
        }
        int i = atomicIntegerFieldUpdater.get(this);
        atomicIntegerFieldUpdater.set(this, i + 1);
        rqVarArr[i] = rqVar;
        rqVar.e = i;
        d(i);
    }

    public final void b(rq rqVar) {
        synchronized (this) {
            if (rqVar.b() != null) {
                c(rqVar.e);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0060, code lost:
    
        if (r6.compareTo(r7) < 0) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final rq c(int i) {
        Object[] objArr = this.a;
        objArr.getClass();
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = b;
        atomicIntegerFieldUpdater.set(this, atomicIntegerFieldUpdater.get(this) - 1);
        if (i < atomicIntegerFieldUpdater.get(this)) {
            e(i, atomicIntegerFieldUpdater.get(this));
            int i2 = (i - 1) / 2;
            if (i > 0) {
                rq rqVar = objArr[i];
                rqVar.getClass();
                Object obj = objArr[i2];
                obj.getClass();
                if (rqVar.compareTo(obj) < 0) {
                    e(i, i2);
                    d(i2);
                }
            }
            while (true) {
                int i3 = i * 2;
                int i4 = i3 + 1;
                if (i4 >= atomicIntegerFieldUpdater.get(this)) {
                    break;
                }
                Object[] objArr2 = this.a;
                objArr2.getClass();
                int i5 = i3 + 2;
                if (i5 < atomicIntegerFieldUpdater.get(this)) {
                    Comparable comparable = objArr2[i5];
                    comparable.getClass();
                    Object obj2 = objArr2[i4];
                    obj2.getClass();
                }
                i5 = i4;
                Comparable comparable2 = objArr2[i];
                comparable2.getClass();
                Comparable comparable3 = objArr2[i5];
                comparable3.getClass();
                if (comparable2.compareTo(comparable3) <= 0) {
                    break;
                }
                e(i, i5);
                i = i5;
            }
        }
        rq rqVar2 = objArr[atomicIntegerFieldUpdater.get(this)];
        rqVar2.getClass();
        rqVar2.e(null);
        rqVar2.e = -1;
        objArr[atomicIntegerFieldUpdater.get(this)] = null;
        return rqVar2;
    }

    public final void d(int i) {
        while (i > 0) {
            rq[] rqVarArr = this.a;
            rqVarArr.getClass();
            int i2 = (i - 1) / 2;
            rq rqVar = rqVarArr[i2];
            rqVar.getClass();
            rq rqVar2 = rqVarArr[i];
            rqVar2.getClass();
            if (rqVar.compareTo(rqVar2) <= 0) {
                return;
            }
            e(i, i2);
            i = i2;
        }
    }

    public final void e(int i, int i2) {
        rq[] rqVarArr = this.a;
        rqVarArr.getClass();
        rq rqVar = rqVarArr[i2];
        rqVar.getClass();
        rq rqVar2 = rqVarArr[i];
        rqVar2.getClass();
        rqVarArr[i] = rqVar;
        rqVarArr[i2] = rqVar2;
        rqVar.e = i;
        rqVar2.e = i2;
    }
}
