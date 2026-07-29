package o;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes.dex */
public class GV {
    public static final /* synthetic */ AtomicIntegerFieldUpdater b = AtomicIntegerFieldUpdater.newUpdater(GV.class, "_size$volatile");
    private volatile /* synthetic */ int _size$volatile;
    public AbstractRunnableC0376Ok[] a;

    public final void a(AbstractRunnableC0376Ok abstractRunnableC0376Ok) {
        abstractRunnableC0376Ok.d((C0402Pk) this);
        AbstractRunnableC0376Ok[] abstractRunnableC0376OkArr = this.a;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = b;
        if (abstractRunnableC0376OkArr == null) {
            abstractRunnableC0376OkArr = new AbstractRunnableC0376Ok[4];
            this.a = abstractRunnableC0376OkArr;
        } else if (atomicIntegerFieldUpdater.get(this) >= abstractRunnableC0376OkArr.length) {
            Object[] copyOf = Arrays.copyOf(abstractRunnableC0376OkArr, atomicIntegerFieldUpdater.get(this) * 2);
            AbstractC0048Bt.m(copyOf, "copyOf(...)");
            abstractRunnableC0376OkArr = (AbstractRunnableC0376Ok[]) copyOf;
            this.a = abstractRunnableC0376OkArr;
        }
        int i = atomicIntegerFieldUpdater.get(this);
        atomicIntegerFieldUpdater.set(this, i + 1);
        abstractRunnableC0376OkArr[i] = abstractRunnableC0376Ok;
        abstractRunnableC0376Ok.i = i;
        c(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0060, code lost:
    
        if (r6.compareTo(r7) < 0) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AbstractRunnableC0376Ok b(int i) {
        Object[] objArr = this.a;
        AbstractC0048Bt.k(objArr);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = b;
        atomicIntegerFieldUpdater.set(this, atomicIntegerFieldUpdater.get(this) - 1);
        if (i < atomicIntegerFieldUpdater.get(this)) {
            d(i, atomicIntegerFieldUpdater.get(this));
            int i2 = (i - 1) / 2;
            if (i > 0) {
                AbstractRunnableC0376Ok abstractRunnableC0376Ok = objArr[i];
                AbstractC0048Bt.k(abstractRunnableC0376Ok);
                Object obj = objArr[i2];
                AbstractC0048Bt.k(obj);
                if (abstractRunnableC0376Ok.compareTo(obj) < 0) {
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
                Object[] objArr2 = this.a;
                AbstractC0048Bt.k(objArr2);
                int i5 = i3 + 2;
                if (i5 < atomicIntegerFieldUpdater.get(this)) {
                    Comparable comparable = objArr2[i5];
                    AbstractC0048Bt.k(comparable);
                    Object obj2 = objArr2[i4];
                    AbstractC0048Bt.k(obj2);
                }
                i5 = i4;
                Comparable comparable2 = objArr2[i];
                AbstractC0048Bt.k(comparable2);
                Comparable comparable3 = objArr2[i5];
                AbstractC0048Bt.k(comparable3);
                if (comparable2.compareTo(comparable3) <= 0) {
                    break;
                }
                d(i, i5);
                i = i5;
            }
        }
        AbstractRunnableC0376Ok abstractRunnableC0376Ok2 = objArr[atomicIntegerFieldUpdater.get(this)];
        AbstractC0048Bt.k(abstractRunnableC0376Ok2);
        abstractRunnableC0376Ok2.d(null);
        abstractRunnableC0376Ok2.i = -1;
        objArr[atomicIntegerFieldUpdater.get(this)] = null;
        return abstractRunnableC0376Ok2;
    }

    public final void c(int i) {
        while (i > 0) {
            AbstractRunnableC0376Ok[] abstractRunnableC0376OkArr = this.a;
            AbstractC0048Bt.k(abstractRunnableC0376OkArr);
            int i2 = (i - 1) / 2;
            AbstractRunnableC0376Ok abstractRunnableC0376Ok = abstractRunnableC0376OkArr[i2];
            AbstractC0048Bt.k(abstractRunnableC0376Ok);
            AbstractRunnableC0376Ok abstractRunnableC0376Ok2 = abstractRunnableC0376OkArr[i];
            AbstractC0048Bt.k(abstractRunnableC0376Ok2);
            if (abstractRunnableC0376Ok.compareTo(abstractRunnableC0376Ok2) <= 0) {
                return;
            }
            d(i, i2);
            i = i2;
        }
    }

    public final void d(int i, int i2) {
        AbstractRunnableC0376Ok[] abstractRunnableC0376OkArr = this.a;
        AbstractC0048Bt.k(abstractRunnableC0376OkArr);
        AbstractRunnableC0376Ok abstractRunnableC0376Ok = abstractRunnableC0376OkArr[i2];
        AbstractC0048Bt.k(abstractRunnableC0376Ok);
        AbstractRunnableC0376Ok abstractRunnableC0376Ok2 = abstractRunnableC0376OkArr[i];
        AbstractC0048Bt.k(abstractRunnableC0376Ok2);
        abstractRunnableC0376OkArr[i] = abstractRunnableC0376Ok;
        abstractRunnableC0376OkArr[i2] = abstractRunnableC0376Ok2;
        abstractRunnableC0376Ok.i = i;
        abstractRunnableC0376Ok2.i = i2;
    }
}
