package o;

/* loaded from: classes.dex */
public final class T implements Runnable {
    public final W h;
    public final InterfaceFutureC2139wA i;

    public T(W w, InterfaceFutureC2139wA interfaceFutureC2139wA) {
        this.h = w;
        this.i = interfaceFutureC2139wA;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.h.value != this) {
            return;
        }
        if (W.ATOMIC_HELPER.b(this.h, this, W.getFutureValue(this.i))) {
            W.complete(this.h);
        }
    }
}
