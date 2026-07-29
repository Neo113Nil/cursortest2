package o;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: o.rQ, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1825rQ {
    public static final C1694pQ a = new C1694pQ(new byte[0], 0, 0, false);
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

    public static final void a(C1694pQ c1694pQ) {
        AbstractC0048Bt.n(c1694pQ, "segment");
        if (c1694pQ.f != null || c1694pQ.g != null) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (c1694pQ.d) {
            return;
        }
        AtomicReference atomicReference = c[(int) (Thread.currentThread().getId() & (b - 1))];
        C1694pQ c1694pQ2 = a;
        C1694pQ c1694pQ3 = (C1694pQ) atomicReference.getAndSet(c1694pQ2);
        if (c1694pQ3 == c1694pQ2) {
            return;
        }
        int i = c1694pQ3 != null ? c1694pQ3.c : 0;
        if (i >= 65536) {
            atomicReference.set(c1694pQ3);
            return;
        }
        c1694pQ.f = c1694pQ3;
        c1694pQ.b = 0;
        c1694pQ.c = i + 8192;
        atomicReference.set(c1694pQ);
    }

    public static final C1694pQ b() {
        AtomicReference atomicReference = c[(int) (Thread.currentThread().getId() & (b - 1))];
        C1694pQ c1694pQ = a;
        C1694pQ c1694pQ2 = (C1694pQ) atomicReference.getAndSet(c1694pQ);
        if (c1694pQ2 == c1694pQ) {
            return new C1694pQ();
        }
        if (c1694pQ2 == null) {
            atomicReference.set(null);
            return new C1694pQ();
        }
        atomicReference.set(c1694pQ2.f);
        c1694pQ2.f = null;
        c1694pQ2.c = 0;
        return c1694pQ2;
    }
}
