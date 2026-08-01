package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public abstract class f10 {
    public static final e10 a = new e10(new byte[0], 0, 0, false);
    public static final int b;
    public static final AtomicReference[] c;

    static {
        int highestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        b = highestOneBit;
        AtomicReference[] atomicReferenceArr = new AtomicReference[highestOneBit];
        for (int i = 0; i < highestOneBit; i++) {
            atomicReferenceArr[i] = new AtomicReference();
        }
        c = atomicReferenceArr;
    }

    public static final void a(e10 e10Var) {
        e10Var.getClass();
        if (e10Var.f != null || e10Var.g != null) {
            l8.l("Failed requirement.");
            return;
        }
        if (e10Var.d) {
            return;
        }
        AtomicReference atomicReference = c[(int) (Thread.currentThread().getId() & (b - 1))];
        e10 e10Var2 = a;
        e10 e10Var3 = (e10) atomicReference.getAndSet(e10Var2);
        if (e10Var3 == e10Var2) {
            return;
        }
        int i = e10Var3 != null ? e10Var3.c : 0;
        if (i >= 65536) {
            atomicReference.set(e10Var3);
            return;
        }
        e10Var.f = e10Var3;
        e10Var.b = 0;
        e10Var.c = i + 8192;
        atomicReference.set(e10Var);
    }

    public static final e10 b() {
        AtomicReference atomicReference = c[(int) (Thread.currentThread().getId() & (b - 1))];
        e10 e10Var = a;
        e10 e10Var2 = (e10) atomicReference.getAndSet(e10Var);
        if (e10Var2 == e10Var) {
            return new e10();
        }
        if (e10Var2 == null) {
            atomicReference.set(null);
            return new e10();
        }
        atomicReference.set(e10Var2.f);
        e10Var2.f = null;
        e10Var2.c = 0;
        return e10Var2;
    }
}
