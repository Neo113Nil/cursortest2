package o;

/* loaded from: classes.dex */
public abstract class GT {
    public final Z6 h = new Z6(0);

    public abstract HT b();

    public final boolean c(int i) {
        return (i & this.h.get()) != 0;
    }

    public HT d(HT ht, HT ht2, HT ht3) {
        return null;
    }

    public abstract void e(HT ht);

    public final void f(int i) {
        Z6 z6;
        int i2;
        do {
            z6 = this.h;
            i2 = z6.get();
            if ((i2 & i) != 0) {
                return;
            }
        } while (!z6.compareAndSet(i2, i2 | i));
    }
}
